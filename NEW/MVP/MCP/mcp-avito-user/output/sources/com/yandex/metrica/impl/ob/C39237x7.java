package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.yandex.metrica.impl.ob.x7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39237x7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382165a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final File f382166b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final B0 f382167c;

    public C39237x7(@j.N Context context, @j.P File file) {
        this(context, file, new B0());
    }

    @SuppressLint({"SetWorldReadable"})
    @j.P
    public String a(@j.N String str, @j.N String str2) throws IOException {
        ZipFile zipFile;
        String str3 = this.f382165a.getApplicationInfo().sourceDir;
        File fileB = this.f382167c.b(this.f382166b, str2);
        if (fileB == null) {
            return null;
        }
        if (fileB.exists()) {
            return fileB.getAbsolutePath();
        }
        Rm rmA = Rm.a(this.f382165a, "crpad_ext");
        try {
            rmA.a();
            if (fileB.exists()) {
                String absolutePath = fileB.getAbsolutePath();
                rmA.b();
                return absolutePath;
            }
            zipFile = new ZipFile(str3);
            try {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry == null) {
                    throw new RuntimeException("Cannot find ZipEntry" + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i12 = inputStream.read(bArr, 0, 4096);
                    if (-1 == i12) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
                if (!fileB.setReadable(true, false)) {
                    rmA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                if (!fileB.setExecutable(true, false)) {
                    rmA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                String absolutePath2 = fileB.getAbsolutePath();
                rmA.b();
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return absolutePath2;
            } catch (Throwable unused4) {
                rmA.b();
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable unused6) {
            zipFile = null;
        }
    }

    @j.k0
    public C39237x7(@j.N Context context, @j.P File file, @j.N B0 b02) {
        this.f382165a = context;
        this.f382166b = file;
        this.f382167c = b02;
    }
}
