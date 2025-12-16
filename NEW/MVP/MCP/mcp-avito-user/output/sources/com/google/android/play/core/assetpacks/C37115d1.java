package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37115d1 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final Enumeration f358306b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public FileInputStream f358307c;

    public C37115d1(Enumeration enumeration) throws IOException {
        this.f358306b = enumeration;
        a();
    }

    public final void a() throws IOException {
        FileInputStream fileInputStream = this.f358307c;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.f358306b;
        if (enumeration.hasMoreElements()) {
            this.f358307c = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.f358307c = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f358307c;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f358307c = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f358307c;
            if (fileInputStream == null) {
                return -1;
            }
            int i12 = fileInputStream.read();
            if (i12 != -1) {
                return i12;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (this.f358307c == null) {
            return -1;
        }
        bArr.getClass();
        if (i12 < 0 || i13 < 0 || i13 > bArr.length - i12) {
            throw new IndexOutOfBoundsException();
        }
        if (i13 == 0) {
            return 0;
        }
        do {
            int i14 = this.f358307c.read(bArr, i12, i13);
            if (i14 > 0) {
                return i14;
            }
            a();
        } while (this.f358307c != null);
        return -1;
    }
}
