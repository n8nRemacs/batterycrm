package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class lia extends MessageDigest {
    public static final lia a = new lia("NOP");

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        return new byte[0];
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
    }
}
