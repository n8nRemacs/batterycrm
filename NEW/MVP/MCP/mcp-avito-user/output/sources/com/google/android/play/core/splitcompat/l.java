package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f358671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f358672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f358673c;

    public l(HashSet hashSet, v vVar, ZipFile zipFile) {
        this.f358671a = hashSet;
        this.f358672b = vVar;
        this.f358673c = zipFile;
    }

    @Override // com.google.android.play.core.splitcompat.n
    public final void a(o oVar, File file, boolean z12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.f358671a.add(file);
        if (z12) {
            return;
        }
        v vVar = this.f358672b;
        vVar.b();
        vVar.a().getAbsolutePath();
        ZipEntry zipEntry = oVar.f358675b;
        zipEntry.getName();
        file.getAbsolutePath();
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = this.f358673c.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i12 = inputStream.read(bArr);
                    if (i12 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
            }
            throw th2;
        }
    }
}
