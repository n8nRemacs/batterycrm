package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: NetworkCache.java */
@RestrictTo
/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final d f59907a;

    public f(@N d dVar) {
        this.f59907a = dVar;
    }

    public static String a(String str, FileExtension fileExtension, boolean z12) throws NoSuchAlgorithmException {
        String strConcat = fileExtension.f59905b;
        if (z12) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b12 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b12)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AK.c.k("lottie_cache_", strReplaceAll, strConcat);
    }

    @P
    public final File b(String str) {
        File file = new File(c(), a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        File fileA = this.f59907a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public final File d(String str, InputStream inputStream, FileExtension fileExtension) throws NoSuchAlgorithmException, IOException {
        File file = new File(c(), a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    if (i12 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }
}
