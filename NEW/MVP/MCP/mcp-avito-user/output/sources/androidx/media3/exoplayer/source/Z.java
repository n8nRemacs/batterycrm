package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.A;

/* compiled from: WrappingMediaSource.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public abstract class Z extends AbstractC23154e<Void> {

    /* renamed from: l, reason: collision with root package name */
    public final A f49711l;

    public Z(A a12) {
        this.f49711l = a12;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    @j.P
    public final A.b D(Void r12, A.b bVar) {
        return J(bVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final long E(long j12, Object obj) {
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final int F(int i12, Object obj) {
        return i12;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final void G(Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        w(p12);
    }

    public final void K() {
        H(null, this.f49711l);
    }

    public void L() {
        K();
    }

    @Override // androidx.media3.exoplayer.source.A
    @j.P
    public androidx.media3.common.P a() {
        return this.f49711l.a();
    }

    @Override // androidx.media3.exoplayer.source.A
    public boolean b() {
        return this.f49711l.b();
    }

    @Override // androidx.media3.exoplayer.source.A
    public InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        return this.f49711l.e(bVar, bVar2, j12);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return this.f49711l.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.A
    public void k(InterfaceC23174z interfaceC23174z) {
        this.f49711l.k(interfaceC23174z);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        super.y(b12);
        L();
    }

    @j.P
    public A.b J(A.b bVar) {
        return bVar;
    }
}
