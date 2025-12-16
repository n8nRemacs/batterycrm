package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public final class i {
    public static void a(Context context, String str, String str2) {
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putString(str, str2).apply();
        } catch (Exception unused) {
        }
    }

    public static boolean b(String str) {
        return TextUtils.isEmpty(str) || "$unknown".equals(str);
    }

    public static byte[] a(String str, String str2) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, UnsupportedEncodingException, InvocationTargetException {
        String str3 = new String(a());
        byte[] bytes = str.getBytes("utf-8");
        byte[] bytes2 = str2.getBytes("utf-8");
        Object objNewInstance = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(str3.getBytes("utf-8"));
        Object objNewInstance2 = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes2, "AES");
        Class<?> cls = Class.forName(a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 1, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bytes);
    }

    public static String a(Context context, String str) throws NoSuchAlgorithmException {
        String string;
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < bArrDigest.length; i12++) {
                char[] cArr = m.f342762a;
                sb2.append(cArr[(bArrDigest[i12] >> 4) & 15]);
                sb2.append(cArr[bArrDigest[i12] & 15]);
            }
            string = sb2.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (b(string)) {
            return null;
        }
        a(context, "gt_fp", string);
        return string;
    }

    public static byte[] a(byte[] bArr, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, UnsupportedEncodingException, InvocationTargetException {
        byte[] bytes = str.getBytes("utf-8");
        Object objNewInstance = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(a());
        Object objNewInstance2 = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes, "AES");
        Class<?> cls = Class.forName(a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 2, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bArr);
    }

    public static byte[] a() {
        char[] charArray = new String(Base64.decode("MzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzA=", 0)).toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 2;
            int iDigit = Character.digit(charArray[i13 + 1], 16) | (Character.digit(charArray[i13], 16) << 4);
            if (iDigit > 127) {
                iDigit -= 256;
            }
            bArr[i12] = (byte) iDigit;
        }
        return bArr;
    }

    public static String a(String str) {
        return new String(Base64.decode(str, 0));
    }
}
