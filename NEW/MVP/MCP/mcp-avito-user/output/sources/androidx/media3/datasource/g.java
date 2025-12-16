package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import j.P;

/* compiled from: ByteArrayDataSource.java */
@J
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    @P
    public Uri f48231e;

    /* renamed from: f, reason: collision with root package name */
    public int f48232f;

    /* renamed from: g, reason: collision with root package name */
    public int f48233g;

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48231e = null;
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) {
        this.f48231e = oVar.f48245a;
        m(oVar);
        throw null;
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48231e;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f48233g;
        if (i14 == 0) {
            return -1;
        }
        int iMin = Math.min(i13, i14);
        System.arraycopy(null, this.f48232f, bArr, i12, iMin);
        this.f48232f += iMin;
        this.f48233g -= iMin;
        k(iMin);
        return iMin;
    }
}
