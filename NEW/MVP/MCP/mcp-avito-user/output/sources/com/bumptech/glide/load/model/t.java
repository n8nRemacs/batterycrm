package com.bumptech.glide.load.model;

import android.util.Log;
import j.N;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import shark.AndroidResourceIdNames;

/* compiled from: StreamEncoder.java */
/* loaded from: classes5.dex */
public class t implements com.bumptech.glide.load.a<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339298a;

    public t(com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339298a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.bumptech.glide.load.a
    public final boolean a(@N InputStream inputStream, @N File file, @N com.bumptech.glide.load.k kVar) throws Throwable {
        InputStream inputStream2 = inputStream;
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339298a;
        byte[] bArr = (byte[]) jVar.d(byte[].class, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        boolean z12 = false;
        ?? r22 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i12 = inputStream2.read(bArr);
                        r22 = -1;
                        if (i12 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i12);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        jVar.i(bArr);
                        r22 = fileOutputStream;
                        return z12;
                    } catch (Throwable th2) {
                        th = th2;
                        r22 = fileOutputStream2;
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused3) {
                            }
                        }
                        jVar.i(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                jVar.i(bArr);
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused5) {
        }
        return z12;
    }
}
