package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23154e;
import com.google.common.collect.AbstractC37401r1;
import java.util.IdentityHashMap;

/* compiled from: ConcatenatingMediaSource2.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23159j extends AbstractC23154e<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.z f49769l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC37401r1<d> f49770m;

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap<InterfaceC23174z, d> f49771n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public Handler f49772o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f49773p;

    /* compiled from: ConcatenatingMediaSource2.java */
    /* renamed from: androidx.media3.exoplayer.source.j$b */
    public static final class b {
        public b() {
            AbstractC37401r1.s();
        }
    }

    /* compiled from: ConcatenatingMediaSource2.java */
    /* renamed from: androidx.media3.exoplayer.source.j$c */
    public static final class c extends androidx.media3.common.P {

        /* renamed from: g, reason: collision with root package name */
        public final androidx.media3.common.z f49774g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC37401r1<androidx.media3.common.P> f49775h;

        /* renamed from: i, reason: collision with root package name */
        public final AbstractC37401r1<Integer> f49776i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC37401r1<Long> f49777j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f49778k = true;

        public c(androidx.media3.common.z zVar, AbstractC37401r1 abstractC37401r1, AbstractC37401r1 abstractC37401r12, AbstractC37401r1 abstractC37401r13) {
            this.f49774g = zVar;
            this.f49775h = abstractC37401r1;
            this.f49776i = abstractC37401r12;
            this.f49777j = abstractC37401r13;
        }

        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int iJ2 = C23159j.J(obj);
            int iG2 = this.f49775h.get(iJ2).g(C23159j.K(obj));
            if (iG2 == -1) {
                return -1;
            }
            return this.f49776i.get(iJ2).intValue() + iG2;
        }

        @Override // androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            Integer numValueOf = Integer.valueOf(i12 + 1);
            AbstractC37401r1<Integer> abstractC37401r1 = this.f49776i;
            int iD2 = androidx.media3.common.util.M.d(abstractC37401r1, numValueOf, false, false);
            this.f49775h.get(iD2).n(i12 - abstractC37401r1.get(iD2).intValue(), bVar, z12);
            bVar.f47381d = 0;
            bVar.f47383f = this.f49777j.get(i12).longValue();
            if (z12) {
                Object obj = bVar.f47380c;
                C23110a.d(obj);
                bVar.f47380c = C23159j.L(iD2, obj);
            }
            return bVar;
        }

        @Override // androidx.media3.common.P
        public final P.b o(Object obj, P.b bVar) {
            int iJ2 = C23159j.J(obj);
            Object objK = C23159j.K(obj);
            androidx.media3.common.P p12 = this.f49775h.get(iJ2);
            int iG2 = p12.g(objK) + this.f49776i.get(iJ2).intValue();
            p12.o(objK, bVar);
            bVar.f47381d = 0;
            bVar.f47383f = this.f49777j.get(iG2).longValue();
            bVar.f47380c = obj;
            return bVar;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return this.f49777j.size();
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            Integer numValueOf = Integer.valueOf(i12 + 1);
            AbstractC37401r1<Integer> abstractC37401r1 = this.f49776i;
            int iD2 = androidx.media3.common.util.M.d(abstractC37401r1, numValueOf, false, false);
            return C23159j.L(iD2, this.f49775h.get(iD2).t(i12 - abstractC37401r1.get(iD2).intValue()));
        }

        @Override // androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            dVar.b(P.d.f47399s, this.f49774g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f49778k, false, null, 0L, 0L, 0, r1.size() - 1, -this.f49777j.get(0).longValue());
            return dVar;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 1;
        }
    }

    /* compiled from: ConcatenatingMediaSource2.java */
    /* renamed from: androidx.media3.exoplayer.source.j$d */
    public static final class d {
    }

    public C23159j() {
        throw null;
    }

    public C23159j(androidx.media3.common.z zVar, AbstractC37401r1 abstractC37401r1, a aVar) {
        this.f49769l = zVar;
        this.f49770m = abstractC37401r1;
        this.f49771n = new IdentityHashMap<>();
    }

    public static int J(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    public static Object K(Object obj) {
        return ((Pair) obj).second;
    }

    public static Pair L(int i12, Object obj) {
        return Pair.create(Integer.valueOf(i12), obj);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        super.C();
        Handler handler = this.f49772o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f49772o = null;
        }
        this.f49773p = false;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    @j.P
    public final A.b D(Integer num, A.b bVar) {
        Integer num2 = num;
        long j12 = bVar.f47215d;
        AbstractC37401r1<d> abstractC37401r1 = this.f49770m;
        if (num2.intValue() != ((int) (j12 % abstractC37401r1.size()))) {
            return null;
        }
        return bVar.b(Pair.create(num2, bVar.f47212a)).c(bVar.f47215d / abstractC37401r1.size());
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final /* bridge */ /* synthetic */ int F(int i12, Object obj) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final void G(Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        if (this.f49773p) {
            return;
        }
        Handler handler = this.f49772o;
        handler.getClass();
        handler.obtainMessage(0).sendToTarget();
        this.f49773p = true;
    }

    @j.P
    public final c M() {
        new P.d();
        new P.b();
        AbstractC37401r1.a aVarS = AbstractC37401r1.s();
        AbstractC37401r1.a aVarS2 = AbstractC37401r1.s();
        AbstractC37401r1.a aVarS3 = AbstractC37401r1.s();
        AbstractC37401r1<d> abstractC37401r1 = this.f49770m;
        if (abstractC37401r1.size() > 0) {
            abstractC37401r1.get(0).getClass();
            throw null;
        }
        return new c(this.f49769l, aVarS.i(), aVarS2.i(), aVarS3.i());
    }

    @Override // androidx.media3.exoplayer.source.A
    @j.P
    public final androidx.media3.common.P a() {
        return M();
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        Object obj = bVar.f47212a;
        int iIntValue = ((Integer) ((Pair) obj).first).intValue();
        AbstractC37401r1<d> abstractC37401r1 = this.f49770m;
        d dVar = abstractC37401r1.get(iIntValue);
        A.b bVarB = bVar.b(((Pair) obj).second);
        int size = abstractC37401r1.size();
        dVar.getClass();
        bVarB.c((bVar.f47215d * size) + 0);
        AbstractC23154e.b bVar3 = (AbstractC23154e.b) this.f49752i.get(0);
        bVar3.getClass();
        bVar3.f49759a.g(bVar3.f49760b);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return this.f49769l;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        this.f49771n.remove(interfaceC23174z).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        super.y(b12);
        this.f49772o = new Handler(new C23157h(this, 1));
        int i12 = 0;
        while (true) {
            AbstractC37401r1<d> abstractC37401r1 = this.f49770m;
            if (i12 >= abstractC37401r1.size()) {
                break;
            }
            d dVar = abstractC37401r1.get(i12);
            Integer numValueOf = Integer.valueOf(i12);
            dVar.getClass();
            H(numValueOf, null);
            i12++;
        }
        if (this.f49773p) {
            return;
        }
        Handler handler = this.f49772o;
        handler.getClass();
        handler.obtainMessage(0).sendToTarget();
        this.f49773p = true;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void v() {
    }
}
