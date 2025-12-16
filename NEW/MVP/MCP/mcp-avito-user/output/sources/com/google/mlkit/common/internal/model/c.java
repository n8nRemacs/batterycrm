package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.C36713l;
import j.N;
import j.P;
import j.l0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
@l0
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C36713l f362289a = new C36713l("ModelUtils", "");

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public static abstract class a {
    }

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public static abstract class b {
    }

    public static boolean a(@N File file, @N String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String strB;
        C36713l c36713l = f362289a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                strB = b(fileInputStream);
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e12) {
            c36713l.b("Failed to create FileInputStream for model: ".concat(e12.toString()));
            strB = null;
        }
        c36713l.a("Calculated hash value is: ".concat(String.valueOf(strB)));
        return str.equals(strB);
    }

    @P
    public static String b(FileInputStream fileInputStream) throws NoSuchAlgorithmException, IOException {
        int i12;
        C36713l c36713l = f362289a;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i13 = fileInputStream.read(bArr);
                if (i13 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i13);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b12 : bArrDigest) {
                String hexString = Integer.toHexString(b12 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (IOException unused) {
            c36713l.b("Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            c36713l.b("Do not have SHA-256 algorithm");
            return null;
        }
    }
}
