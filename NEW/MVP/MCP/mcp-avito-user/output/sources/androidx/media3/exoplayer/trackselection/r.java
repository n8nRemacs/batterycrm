package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C23091e;
import androidx.media3.common.U;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.Y;
import androidx.media3.exoplayer.trackselection.m;
import j.InterfaceC42153i;
import j.P;

/* compiled from: TrackSelector.java */
@J
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    @P
    public a f50035a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public androidx.media3.exoplayer.upstream.d f50036b;

    public U b() {
        return U.f47456B;
    }

    @P
    public d0.f c() {
        return null;
    }

    public abstract void d(@P m.a aVar);

    @InterfaceC42153i
    public void e() {
        this.f50035a = null;
        this.f50036b = null;
    }

    public abstract s f(d0[] d0VarArr, Y y12, A.b bVar, androidx.media3.common.P p12);

    /* compiled from: TrackSelector.java */
    public interface a {
        void a();

        default void c() {
        }
    }

    public void g(C23091e c23091e) {
    }

    public void h(U u12) {
    }
}
