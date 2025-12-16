package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import j.InterfaceC42153i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: CompositeMediaSource.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23154e<T> extends AbstractC23150a {

    /* renamed from: i, reason: collision with root package name */
    public final HashMap<T, b<T>> f49752i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public Handler f49753j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public androidx.media3.datasource.B f49754k;

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.e$a */
    public final class a implements D, androidx.media3.exoplayer.drm.f {

        /* renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.I
        public final T f49755b;

        /* renamed from: c, reason: collision with root package name */
        public D.a f49756c;

        /* renamed from: d, reason: collision with root package name */
        public f.a f49757d;

        public a(@androidx.media3.common.util.I T t12) {
            this.f49756c = new D.a(AbstractC23154e.this.f49714d.f49485c, 0, null);
            this.f49757d = new f.a(AbstractC23154e.this.f49715e.f49114c, 0, null);
            this.f49755b = t12;
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void A(int i12, @j.P A.b bVar, int i13) {
            if (a(i12, bVar)) {
                this.f49757d.d(i13);
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void B(int i12, @j.P A.b bVar, Exception exc) {
            if (a(i12, bVar)) {
                this.f49757d.e(exc);
            }
        }

        public final boolean a(int i12, @j.P A.b bVar) {
            A.b bVarD;
            T t12 = this.f49755b;
            AbstractC23154e abstractC23154e = AbstractC23154e.this;
            if (bVar != null) {
                bVarD = abstractC23154e.D(t12, bVar);
                if (bVarD == null) {
                    return false;
                }
            } else {
                bVarD = null;
            }
            int iF2 = abstractC23154e.F(i12, t12);
            D.a aVar = this.f49756c;
            if (aVar.f49483a != iF2 || !androidx.media3.common.util.M.a(aVar.f49484b, bVarD)) {
                this.f49756c = new D.a(abstractC23154e.f49714d.f49485c, iF2, bVarD);
            }
            f.a aVar2 = this.f49757d;
            if (aVar2.f49112a == iF2 && androidx.media3.common.util.M.a(aVar2.f49113b, bVarD)) {
                return true;
            }
            this.f49757d = new f.a(abstractC23154e.f49715e.f49114c, iF2, bVarD);
            return true;
        }

        public final C23171w b(C23171w c23171w) {
            AbstractC23154e abstractC23154e = AbstractC23154e.this;
            T t12 = this.f49755b;
            long j12 = c23171w.f49856e;
            long jE2 = abstractC23154e.E(j12, t12);
            long j13 = c23171w.f49857f;
            long jE3 = abstractC23154e.E(j13, t12);
            if (jE2 == j12 && jE3 == j13) {
                return c23171w;
            }
            return new C23171w(c23171w.f49852a, c23171w.f49853b, c23171w.f49854c, c23171w.f49855d, jE2, jE3);
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void f(int i12, @j.P A.b bVar) {
            if (a(i12, bVar)) {
                this.f49757d.b();
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void h(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            if (a(i12, bVar)) {
                this.f49756c.b(c23167s, b(c23171w));
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void l(int i12, @j.P A.b bVar) {
            if (a(i12, bVar)) {
                this.f49757d.f();
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void n(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            if (a(i12, bVar)) {
                this.f49756c.c(c23167s, b(c23171w));
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void o(int i12, @j.P A.b bVar) {
            if (a(i12, bVar)) {
                this.f49757d.c();
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void r(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w, IOException iOException, boolean z12) {
            if (a(i12, bVar)) {
                this.f49756c.d(c23167s, b(c23171w), iOException, z12);
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void u(int i12, @j.P A.b bVar, C23171w c23171w) {
            if (a(i12, bVar)) {
                this.f49756c.a(b(c23171w));
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void x(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            if (a(i12, bVar)) {
                this.f49756c.e(c23167s, b(c23171w));
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.e$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final A f49759a;

        /* renamed from: b, reason: collision with root package name */
        public final C23153d f49760b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC23154e<T>.a f49761c;

        public b(A a12, C23153d c23153d, a aVar) {
            this.f49759a = a12;
            this.f49760b = c23153d;
            this.f49761c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    @InterfaceC42153i
    public void C() {
        HashMap<T, b<T>> map = this.f49752i;
        for (b<T> bVar : map.values()) {
            bVar.f49759a.d(bVar.f49760b);
            AbstractC23154e<T>.a aVar = bVar.f49761c;
            A a12 = bVar.f49759a;
            a12.p(aVar);
            a12.q(aVar);
        }
        map.clear();
    }

    public abstract void G(@androidx.media3.common.util.I Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.A$c, androidx.media3.exoplayer.source.d] */
    public final void H(@androidx.media3.common.util.I final T t12, A a12) {
        HashMap<T, b<T>> map = this.f49752i;
        C23110a.b(!map.containsKey(t12));
        ?? r12 = new A.c() { // from class: androidx.media3.exoplayer.source.d
            @Override // androidx.media3.exoplayer.source.A.c
            public final void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
                this.f49750b.G(t12, abstractC23150a, p12);
            }
        };
        a aVar = new a(t12);
        map.put(t12, new b<>(a12, r12, aVar));
        Handler handler = this.f49753j;
        handler.getClass();
        a12.c(handler, aVar);
        Handler handler2 = this.f49753j;
        handler2.getClass();
        a12.j(handler2, aVar);
        androidx.media3.datasource.B b12 = this.f49754k;
        androidx.media3.exoplayer.analytics.w wVar = this.f49718h;
        C23110a.h(wVar);
        a12.s(r12, b12, wVar);
        if (this.f49713c.isEmpty()) {
            a12.i(r12);
        }
    }

    public final void I(@androidx.media3.common.util.I A.b bVar) {
        b<T> bVarRemove = this.f49752i.remove(bVar);
        bVarRemove.getClass();
        C23153d c23153d = bVarRemove.f49760b;
        A a12 = bVarRemove.f49759a;
        a12.d(c23153d);
        AbstractC23154e<T>.a aVar = bVarRemove.f49761c;
        a12.p(aVar);
        a12.q(aVar);
    }

    @Override // androidx.media3.exoplayer.source.A
    @InterfaceC42153i
    public void maybeThrowSourceInfoRefreshError() {
        Iterator<b<T>> it = this.f49752i.values().iterator();
        while (it.hasNext()) {
            it.next().f49759a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    @InterfaceC42153i
    public void t() {
        for (b<T> bVar : this.f49752i.values()) {
            bVar.f49759a.i(bVar.f49760b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    @InterfaceC42153i
    public void v() {
        for (b<T> bVar : this.f49752i.values()) {
            bVar.f49759a.g(bVar.f49760b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    @InterfaceC42153i
    public void y(@j.P androidx.media3.datasource.B b12) {
        this.f49754k = b12;
        this.f49753j = androidx.media3.common.util.M.n(null);
    }

    @j.P
    public A.b D(@androidx.media3.common.util.I T t12, A.b bVar) {
        return bVar;
    }

    public long E(long j12, @androidx.media3.common.util.I Object obj) {
        return j12;
    }

    public int F(int i12, @androidx.media3.common.util.I Object obj) {
        return i12;
    }
}
