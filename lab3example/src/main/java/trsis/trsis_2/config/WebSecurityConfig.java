package trsis.trsis_2.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure (HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/home", "/", "/css/**", "/js/**", "/images/**", "/brands/**", "/brands")
                .permitAll().and().exceptionHandling().accessDeniedPage("/403").and().formLogin().disable();

    }
}
