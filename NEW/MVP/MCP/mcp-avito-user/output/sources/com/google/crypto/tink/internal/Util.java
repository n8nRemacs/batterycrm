package com.google.crypto.tink.internal;

import I41.h;
import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.util.Bytes;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Util {
    public static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    private Util() {
    }

    @h
    public static Integer getAndroidApiLevel() {
        if (isAndroid()) {
            return BuildDispatchedCode.getApiLevel();
        }
        return null;
    }

    public static boolean isAndroid() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int randKeyId() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i12 = 0;
        while (i12 == 0) {
            secureRandom.nextBytes(bArr);
            i12 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i12;
    }

    private static final byte toByteFromPrintableAscii(char c12) {
        if (c12 < '!' || c12 > '~') {
            throw new TinkBugException(e.l("Not a printable ASCII character: ", c12));
        }
        return (byte) c12;
    }

    public static final Bytes toBytesFromPrintableAscii(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i12 = 0; i12 < str.length(); i12++) {
            bArr[i12] = toByteFromPrintableAscii(str.charAt(i12));
        }
        return Bytes.copyFrom(bArr);
    }
}
