package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.J;
import androidx.media3.datasource.j;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: PriorityDataSource.java */
@J
/* loaded from: classes.dex */
public final class v implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f48314a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityTaskManager f48315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48316c;

    /* compiled from: PriorityDataSource.java */
    public static final class a implements j.a {
        @Override // androidx.media3.datasource.j.a
        public final j a() {
            throw null;
        }
    }

    public v(j jVar, PriorityTaskManager priorityTaskManager, int i12) {
        this.f48314a = jVar;
        this.f48315b = priorityTaskManager;
        this.f48316c = i12;
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        return this.f48314a.c();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48314a.close();
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) {
        this.f48315b.a(this.f48316c);
        return this.f48314a.e(oVar);
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48314a.getUri();
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
        b12.getClass();
        this.f48314a.j(b12);
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        this.f48315b.a(this.f48316c);
        return this.f48314a.read(bArr, i12, i13);
    }
}
