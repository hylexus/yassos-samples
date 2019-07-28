package io.github.hylexus.yassos.sample.support;

import io.github.hylexus.yassos.support.annotation.YassosPlugin;
import io.github.hylexus.yassos.support.auth.UserDetailService;
import io.github.hylexus.yassos.support.model.DefaultUserDetails;
import io.github.hylexus.yassos.support.model.UserDetails;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author hylexus
 * Created At 2019-07-27 22:55
 */
@Slf4j
@YassosPlugin(enabled = false)
public class UserDetailServiceSample implements UserDetailService {

    @Override
    public UserDetails loadByUsername(String username) {
        return new DefaultUserDetails()
                .setUserId(new Random().nextLong())
                .setCredentialExpired(false)
                .setUsername(username)
                .setPassword("passwordOf" + username)
                .setLocked(false);
    }

}
