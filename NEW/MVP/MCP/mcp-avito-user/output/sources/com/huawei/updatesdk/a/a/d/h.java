package com.huawei.updatesdk.a.a.d;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes7.dex */
public abstract class h {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, Constants.ENCODING).replace("+", "%20").replace("*", "%2A").replace("~", "%7E");
        } catch (UnsupportedEncodingException e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StringUtils", "encode2utf8 error", e12);
            return null;
        }
    }

    public static String b(String str) {
        String strE = e(str);
        if (strE == null) {
            return null;
        }
        return strE.toLowerCase(Locale.getDefault());
    }

    public static byte[] c(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 2;
            int iDigit = Character.digit(charArray[i13 + 1], 16) | (Character.digit(charArray[i13], 16) << 4);
            if (iDigit > 127) {
                iDigit -= 256;
            }
            bArr[i12] = Byte.valueOf(String.valueOf(iDigit)).byteValue();
        }
        return bArr;
    }

    public static boolean d(String str) {
        return str != null && str.trim().startsWith("{") && str.trim().endsWith("}");
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(str.getBytes(Constants.ENCODING));
        } catch (UnsupportedEncodingException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("StringUtils", "can not getBytes");
            return null;
        }
    }

    public static String a(byte[] bArr) throws NoSuchAlgorithmException {
        String str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            StringBuilder sb2 = new StringBuilder(256);
            for (byte b12 : messageDigest.digest()) {
                sb2.append(String.format(Locale.ENGLISH, "%02X", Byte.valueOf(b12)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            str = "sha256EncryptStr error:NoSuchAlgorithmException";
            com.huawei.updatesdk.a.a.c.a.a.a.b("StringUtils", str);
            return null;
        } catch (IllegalFormatException unused2) {
            str = "sha256EncryptStr error:IllegalFormatException";
            com.huawei.updatesdk.a.a.c.a.a.a.b("StringUtils", str);
            return null;
        } catch (Exception unused3) {
            str = "sha256EncryptStr error:Exception";
            com.huawei.updatesdk.a.a.c.a.a.a.b("StringUtils", str);
            return null;
        }
    }
}
