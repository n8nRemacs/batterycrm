package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37165o1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358443c = new com.google.android.play.core.assetpacks.internal.F("PackMetadataManager");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358444a;

    /* renamed from: b, reason: collision with root package name */
    public final C37171q1 f358445b;

    public C37165o1(Q q12, C37171q1 c37171q1) {
        this.f358444a = q12;
        this.f358445b = c37171q1;
    }

    public final String a(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Q q12 = this.f358444a;
        q12.getClass();
        boolean z12 = false;
        try {
            if (q12.m(str) != null) {
                z12 = true;
            }
        } catch (IOException unused) {
        }
        if (!z12) {
            return "";
        }
        int iA2 = this.f358445b.a();
        File file = new File(new File(q12.j(iA2, Q.b(new File(q12.c(str), String.valueOf((int) Q.b(q12.c(str), true))), true), str), "_metadata"), "properties.dat");
        try {
            if (!file.exists()) {
                return String.valueOf(iA2);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(iA2) : property;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused3) {
            f358443c.b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    public final void b(String str, @j.P String str2, int i12, long j12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i12);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        Q q12 = this.f358444a;
        q12.getClass();
        File file = new File(new File(q12.j(i12, j12, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}
