package cn.yassos.sample.boot.config;

import io.github.hylexus.yassos.client.boot.config.YassosClientAutoConfiguration;
import io.github.hylexus.yassos.client.handler.LogoutHandler;
import io.github.hylexus.yassos.client.token.resolver.DefaultTokenResolver;
import io.github.hylexus.yassos.client.token.resolver.TokenResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hylexus
 * Created At 2019-06-07 20:23
 */
@Configuration
public class YassosConfig {

    /**
     * expose a bean instance of {@link TokenResolver} to override default tokenResolver provided by {@link YassosClientAutoConfiguration}
     */
    @Bean
    public TokenResolver tokenResolver() {
        return new DefaultTokenResolver();
    }

    /**
     * expose a bean instance of {@link LogoutHandler} to override default logoutHandler provided by {@link YassosClientAutoConfiguration}
     */
    @Bean
    public LogoutHandler logoutHandler() {
        return new LogoutHandler() {
            @Override
            public void preLogout(HttpServletRequest req, HttpServletResponse resp, String token) throws IOException {

            }

            @Override
            public void postLogout(HttpServletRequest req, HttpServletResponse resp, String token, Boolean tokenDestroyedSuccessfully) throws IOException {

            }
        };
    }
}
