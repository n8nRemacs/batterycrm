package ru.cyberity.cbr.core.common;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: CryptoUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "b", "([B[B)[B", "", "mode", "iv", "a", "([BI[B[B)[B", "size", "(I)[B", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class u {
    @Y61.k
    public static final byte[] a(@Y61.k byte[] bArr, int i12, @Y61.k byte[] bArr2, @Y61.k byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(bArr2, 16), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i12, secretKeySpec, new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    @Y61.k
    public static final byte[] b(@Y61.k byte[] bArr, @Y61.k byte[] bArr2) {
        byte[] bArrA = a(16);
        return C42756l.W(bArrA, a(bArr, 1, bArr2, bArrA));
    }

    @Y61.k
    public static final byte[] a(int i12) {
        byte[] bArr = new byte[i12];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
