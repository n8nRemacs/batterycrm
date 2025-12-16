package androidx.media3.exoplayer.upstream.experimental;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.J;
import androidx.media3.common.util.v;
import androidx.media3.datasource.B;
import androidx.media3.datasource.o;
import androidx.media3.exoplayer.upstream.d;
import androidx.media3.exoplayer.upstream.q;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import java.util.Map;

/* compiled from: ExperimentalBandwidthMeter.java */
@J
/* loaded from: classes.dex */
public final class d implements androidx.media3.exoplayer.upstream.d, B {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f50085f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37412t1<Integer, Long> f50086a;

    /* renamed from: b, reason: collision with root package name */
    public final q f50087b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.experimental.a f50088c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50089d;

    /* renamed from: e, reason: collision with root package name */
    public int f50090e;

    /* compiled from: ExperimentalBandwidthMeter.java */
    public static final class b {
    }

    static {
        AbstractC37401r1.K(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
        AbstractC37401r1.K(1400000L, 990000L, 730000L, 510000L, 230000L);
        AbstractC37401r1.K(2100000L, 1400000L, 1000000L, 890000L, 640000L);
        AbstractC37401r1.K(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
        AbstractC37401r1.K(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
        AbstractC37401r1.K(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    }

    public d() {
        throw null;
    }

    public d(Context context, Map map, q qVar, androidx.media3.exoplayer.upstream.experimental.a aVar, boolean z12, a aVar2) {
        this.f50086a = AbstractC37412t1.c(map);
        this.f50087b = qVar;
        this.f50088c = aVar;
        this.f50089d = z12;
        v vVarB = v.b(context);
        int iC2 = vVarB.c();
        this.f50090e = iC2;
        h(iC2);
        vVarB.d(new androidx.media3.exoplayer.upstream.i(this, 1));
    }

    public static boolean i(o oVar, boolean z12) {
        return z12 && !oVar.c(8);
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final void a(d.a aVar) {
        this.f50088c.a(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
        aVar.getClass();
        this.f50088c.b(handler, aVar);
    }

    @Override // androidx.media3.datasource.B
    public final void d(androidx.media3.datasource.d dVar, o oVar, boolean z12) {
        if (i(oVar, z12)) {
            this.f50087b.b(oVar);
            this.f50088c.getClass();
        }
    }

    @Override // androidx.media3.datasource.B
    public final synchronized void e(androidx.media3.datasource.d dVar, o oVar, boolean z12, int i12) {
        if (i(oVar, z12)) {
            this.f50088c.c(i12);
        }
    }

    @Override // androidx.media3.datasource.B
    public final synchronized void f(androidx.media3.datasource.d dVar, o oVar, boolean z12) {
        if (i(oVar, z12)) {
            this.f50087b.a(oVar);
            this.f50088c.e();
        }
    }

    @Override // androidx.media3.datasource.B
    public final synchronized void g(androidx.media3.datasource.d dVar, o oVar, boolean z12) {
        if (i(oVar, z12)) {
            this.f50088c.d();
        }
    }

    public final long h(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        AbstractC37412t1<Integer, Long> abstractC37412t1 = this.f50086a;
        Long l12 = abstractC37412t1.get(numValueOf);
        if (l12 == null) {
            l12 = abstractC37412t1.get(0);
        }
        if (l12 == null) {
            l12 = 1000000L;
        }
        return l12.longValue();
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final B c() {
        return this;
    }
}
