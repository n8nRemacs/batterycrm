package com.my.tracker.obfuscated;

import java.security.MessageDigest;

/* renamed from: com.my.tracker.obfuscated.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37846u {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b12 : bArrDigest) {
                sb2.append(String.format("%02X", Byte.valueOf(b12)));
            }
            return sb2.toString().toLowerCase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
