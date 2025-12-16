package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.z;
import androidx.media3.exoplayer.AbstractC23132a;
import androidx.media3.exoplayer.source.A;

/* compiled from: ConcatenatingMediaSource.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23158i extends AbstractC23154e<e> {

    /* renamed from: o, reason: collision with root package name */
    public static final androidx.media3.common.z f49765o;

    /* renamed from: l, reason: collision with root package name */
    @j.B
    @j.P
    public Handler f49766l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f49767m;

    /* renamed from: n, reason: collision with root package name */
    public S f49768n;

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.i$b */
    public static final class b extends AbstractC23132a {
        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int A(int i12) {
            return androidx.media3.common.util.M.e(null, i12 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final Object B(int i12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int C(int i12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int D(int i12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final androidx.media3.common.P G(int i12) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return 0;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int y(Object obj) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int z(int i12) {
            return androidx.media3.common.util.M.e(null, i12 + 1, false, false);
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.i$d */
    public static final class d {
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.i$e */
    public static final class e {
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.i$f */
    public static final class f<T> {
    }

    static {
        z.c cVar = new z.c();
        cVar.f47989b = Uri.EMPTY;
        f49765o = cVar.a();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final synchronized void C() {
        super.C();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    @j.P
    public final A.b D(e eVar, A.b bVar) {
        eVar.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final int F(int i12, Object obj) {
        ((e) obj).getClass();
        return i12;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final void G(Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        ((e) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final synchronized androidx.media3.common.P a() {
        this.f49768n.getLength();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        int i12 = AbstractC23132a.f48622i;
        Pair pair = (Pair) bVar.f47212a;
        Object obj = pair.first;
        bVar.b(pair.second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return f49765o;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void t() {
        super.t();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final synchronized void y(@j.P androidx.media3.datasource.B b12) {
        super.y(b12);
        this.f49766l = new Handler(new C23157h(this, 0));
        throw null;
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.i$c */
    public static final class c extends AbstractC23150a {
        public c() {
        }

        @Override // androidx.media3.exoplayer.source.A
        public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.A
        public final androidx.media3.common.z getMediaItem() {
            return C23158i.f49765o;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23150a
        public final void C() {
        }

        @Override // androidx.media3.exoplayer.source.A
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.A
        public final void k(InterfaceC23174z interfaceC23174z) {
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23150a
        public final void y(@j.P androidx.media3.datasource.B b12) {
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void v() {
    }
}
