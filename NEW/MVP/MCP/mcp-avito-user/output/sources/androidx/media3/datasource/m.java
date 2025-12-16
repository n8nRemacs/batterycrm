package androidx.media3.datasource;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
@J
/* loaded from: classes.dex */
public final class m extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final j f48240b;

    /* renamed from: c, reason: collision with root package name */
    public final o f48241c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48243e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48244f = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f48242d = new byte[1];

    public m(j jVar, o oVar) {
        this.f48240b = jVar;
        this.f48241c = oVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f48244f) {
            return;
        }
        this.f48240b.close();
        this.f48244f = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f48242d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        C23110a.g(!this.f48244f);
        boolean z12 = this.f48243e;
        j jVar = this.f48240b;
        if (!z12) {
            jVar.e(this.f48241c);
            this.f48243e = true;
        }
        int i14 = jVar.read(bArr, i12, i13);
        if (i14 == -1) {
            return -1;
        }
        return i14;
    }
}
