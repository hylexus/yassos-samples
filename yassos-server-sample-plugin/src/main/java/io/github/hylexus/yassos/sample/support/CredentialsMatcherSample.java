package io.github.hylexus.yassos.sample.support;

import io.github.hylexus.yassos.support.annotation.YassosPlugin;
import io.github.hylexus.yassos.support.auth.CredentialsMatcher;
import io.github.hylexus.yassos.support.model.UserDetails;
import io.github.hylexus.yassos.support.model.UsernamePasswordToken;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author hylexus
 * Created At 2019-07-27 22:54
 */
@Slf4j
@YassosPlugin
public class CredentialsMatcherSample implements CredentialsMatcher {
    @Override
    public boolean match(@NonNull UsernamePasswordToken usernamePasswordToken, @NonNull UserDetails userDetails) {
        log.info("matching credentials by [CredentialsMatcherSample]");
        return Objects.equals(userDetails.getPassword(), usernamePasswordToken.getPassword());
    }
}
