package N01;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class a {
    public static String a(String str, byte[] bArr) throws UnsupportedEncodingException {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
            } catch (Exception e12) {
                e12.getMessage();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            try {
                str3 = str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
            } catch (Exception e13) {
                e13.getMessage();
            }
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return "";
        }
        byte[] bArrB = S01.c.b(str2);
        if (TextUtils.isEmpty(str3) || bArr.length < 16 || bArrB.length < 16) {
            return "";
        }
        try {
            return new String(b(S01.c.b(str3), bArr, bArrB), Constants.ENCODING);
        } catch (UnsupportedEncodingException e14) {
            e14.getMessage();
            return "";
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e12) {
            e12.getMessage();
            return new byte[0];
        } catch (InvalidKeyException e13) {
            e13.getMessage();
            return new byte[0];
        } catch (NoSuchAlgorithmException e14) {
            e14.getMessage();
            return new byte[0];
        } catch (BadPaddingException e15) {
            e15.getMessage();
            return new byte[0];
        } catch (IllegalBlockSizeException e16) {
            e16.getMessage();
            return new byte[0];
        } catch (NoSuchPaddingException e17) {
            e17.getMessage();
            return new byte[0];
        }
    }

    public static String c(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrD;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        byte[] bArrA = S01.b.a(16);
        if (TextUtils.isEmpty(str)) {
            bArrD = new byte[0];
        } else {
            try {
                bArrD = d(str.getBytes(Constants.ENCODING), bArr, bArrA);
            } catch (UnsupportedEncodingException e12) {
                e12.getMessage();
                bArrD = new byte[0];
            }
        }
        if (bArrD == null || bArrD.length == 0) {
            return "";
        }
        String strA = S01.c.a(bArrA);
        String strA2 = S01.c.a(bArrD);
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            return "";
        }
        try {
            return strA2.substring(0, 6) + strA.substring(0, 6) + strA2.substring(6, 10) + strA.substring(6, 16) + strA2.substring(10, 16) + strA.substring(16) + strA2.substring(16);
        } catch (Exception e13) {
            e13.getMessage();
            return "";
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3.length < 16) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e12) {
            e12.getMessage();
            return new byte[0];
        } catch (InvalidKeyException e13) {
            e13.getMessage();
            return new byte[0];
        } catch (NoSuchAlgorithmException e14) {
            e14.getMessage();
            return new byte[0];
        } catch (BadPaddingException e15) {
            e15.getMessage();
            return new byte[0];
        } catch (IllegalBlockSizeException e16) {
            e16.getMessage();
            return new byte[0];
        } catch (NoSuchPaddingException e17) {
            e17.getMessage();
            return new byte[0];
        }
    }
}
