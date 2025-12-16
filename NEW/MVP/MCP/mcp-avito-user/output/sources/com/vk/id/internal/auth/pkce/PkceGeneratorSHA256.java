package com.vk.id.internal.auth.pkce;

import Y61.k;
import android.util.Base64;
import androidx.compose.runtime.internal.P;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PkceGeneratorSHA256.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "", "<init>", "()V", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "generateRandomCodeVerifier", "", "entropySource", "Ljava/security/SecureRandom;", "deriveCodeVerifierChallenge", "codeVerifier", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PkceGeneratorSHA256 {

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("PkceGeneratorSHA256");
    public static final int $stable = 8;

    @k
    public final String deriveCodeVerifierChallenge(@k String codeVerifier) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(codeVerifier.getBytes(Charset.forName("ISO_8859_1")));
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e12) {
            this.logger.error("Can't encode codeVerifier", e12);
            throw new IllegalStateException("ISO_8859_1 encoding not supported", e12);
        } catch (NoSuchAlgorithmException e13) {
            this.logger.error("SHA-256 algorithm not available", e13);
            return codeVerifier;
        }
    }

    @k
    public final String generateRandomCodeVerifier(@k SecureRandom entropySource) {
        byte[] bArr = new byte[128];
        entropySource.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
