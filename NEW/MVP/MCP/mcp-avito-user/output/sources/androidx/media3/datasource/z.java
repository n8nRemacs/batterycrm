package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import j.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
@J
/* loaded from: classes.dex */
public final class z implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f48318a;

    /* renamed from: b, reason: collision with root package name */
    public long f48319b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f48320c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f48321d;

    public z(j jVar) {
        jVar.getClass();
        this.f48318a = jVar;
        this.f48320c = Uri.EMPTY;
        this.f48321d = Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        return this.f48318a.c();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48318a.close();
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) {
        this.f48320c = oVar.f48245a;
        this.f48321d = Collections.emptyMap();
        j jVar = this.f48318a;
        long jE2 = jVar.e(oVar);
        Uri uri = jVar.getUri();
        uri.getClass();
        this.f48320c = uri;
        this.f48321d = jVar.c();
        return jE2;
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48318a.getUri();
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
        b12.getClass();
        this.f48318a.j(b12);
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        int i14 = this.f48318a.read(bArr, i12, i13);
        if (i14 != -1) {
            this.f48319b += i14;
        }
        return i14;
    }
}
