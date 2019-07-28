package io.github.hylexus.yassos.sample.support;

import io.github.hylexus.yassos.support.annotation.YassosPlugin;
import io.github.hylexus.yassos.support.model.UsernamePasswordToken;
import io.github.hylexus.yassos.support.token.TokenGenerator;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author hylexus
 * Created At 2019-07-27 22:49
 */
@Slf4j
@YassosPlugin
public class TokenGeneratorSample implements TokenGenerator {
    @Override
    public String generateToken(HttpServletRequest request, HttpServletResponse response, UsernamePasswordToken usernamePasswordToken) {
        log.info("generate token by [TokenGeneratorSample]");
        return UUID.randomUUID().toString().replace("-", "");
    }
}
