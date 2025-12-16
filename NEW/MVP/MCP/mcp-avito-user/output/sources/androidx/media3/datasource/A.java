package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: TeeDataSource.java */
@J
/* loaded from: classes.dex */
public final class A implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f48156a;

    /* renamed from: b, reason: collision with root package name */
    public final i f48157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48158c;

    /* renamed from: d, reason: collision with root package name */
    public long f48159d;

    public A(j jVar, i iVar) {
        this.f48156a = jVar;
        this.f48157b = iVar;
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        return this.f48156a.c();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        i iVar = this.f48157b;
        try {
            this.f48156a.close();
        } finally {
            if (this.f48158c) {
                this.f48158c = false;
                iVar.close();
            }
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) {
        o oVar2 = oVar;
        long jE2 = this.f48156a.e(oVar2);
        this.f48159d = jE2;
        if (jE2 == 0) {
            return 0L;
        }
        long j12 = oVar2.f48251g;
        if (j12 == -1 && jE2 != -1 && j12 != jE2) {
            oVar2 = new o(oVar2.f48245a, oVar2.f48246b, oVar2.f48247c, oVar2.f48248d, oVar2.f48249e, oVar2.f48250f, jE2, oVar2.f48252h, oVar2.f48253i, oVar2.f48254j);
        }
        this.f48158c = true;
        this.f48157b.e(oVar2);
        return this.f48159d;
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48156a.getUri();
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
        b12.getClass();
        this.f48156a.j(b12);
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        if (this.f48159d == 0) {
            return -1;
        }
        int i14 = this.f48156a.read(bArr, i12, i13);
        if (i14 > 0) {
            this.f48157b.write(bArr, i12, i14);
            long j12 = this.f48159d;
            if (j12 != -1) {
                this.f48159d = j12 - i14;
            }
        }
        return i14;
    }
}
