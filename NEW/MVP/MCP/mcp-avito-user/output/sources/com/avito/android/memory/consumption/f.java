package com.avito.android.memory.consumption;

import Y41.p;
import android.app.Activity;
import androidx.compose.foundation.H;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.C;
import com.avito.android.util.E;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qd.C47379a;

/* compiled from: MemoryConsumptionTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/memory/consumption/f;", "", "a", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f186112a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f186113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f186114c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f186115d = "memory-consumption.activity-fragment.vm-stats.";

    /* compiled from: MemoryConsumptionTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/memory/consumption/g;", "metrics", "", "elapsed", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/memory/consumption/g;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<g, Long, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f186123m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(2);
            this.f186123m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(g gVar, Long l12) {
            g gVar2 = gVar;
            long jLongValue = l12.longValue();
            InterfaceC22983P interfaceC22983P = this.f186123m.f186116a;
            f fVar = f.this;
            fVar.f186112a.c(new AY.a(fVar.f186113b.getF186138a(), gVar2.f186124a, gVar2.f186125b, gVar2.f186126c, gVar2.f186127d, gVar2.f186128e, gVar2.f186129f, gVar2.f186130g, gVar2.f186131h, gVar2.f186132i, gVar2.f186133j, jLongValue));
            fVar.b(gVar2, jLongValue, fVar.f186114c);
            long j12 = gVar2.f186125b;
            f.c(fVar, "native-heap-size", j12);
            long j13 = gVar2.f186124a;
            f.c(fVar, "java-heap-size", j13);
            long j14 = gVar2.f186126c;
            f.c(fVar, "code-size", j14);
            long j15 = gVar2.f186127d;
            f.c(fVar, "stack-size", j15);
            long j16 = gVar2.f186128e;
            f.c(fVar, "graphics-size", j16);
            long j17 = gVar2.f186129f;
            f.c(fVar, "private-other-size", j17);
            f.c(fVar, "total-size", j13 + j12 + j14 + j15 + j16 + j17);
            f.c(fVar, "gc-count", gVar2.f186130g);
            f.c(fVar, "gc-time", gVar2.f186131h);
            f.c(fVar, "blocking-gc-count", gVar2.f186132i);
            f.c(fVar, "blocking-gc-time", gVar2.f186133j);
            boolean z12 = interfaceC22983P instanceof Activity ? true : interfaceC22983P instanceof Fragment;
            String str = fVar.f186115d;
            if (z12) {
                StringBuilder sbR = H.r(str);
                sbR.append(interfaceC22983P.getClass().getSimpleName());
                fVar.b(gVar2, jLongValue, sbR.toString());
            } else if (interfaceC22983P instanceof c) {
                fVar.b(gVar2, jLongValue, str + interfaceC22983P);
            }
            return G0.f406611a;
        }
    }

    public f(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k m mVar) {
        this.f186112a = interfaceC28373a;
        this.f186113b = mVar;
        this.f186114c = "memory-consumption.vm-stats." + mVar.getF186138a();
    }

    public static final void c(f fVar, String str, long j12) {
        C47379a.f429325a.getClass();
        C47379a.a("avito-perf." + fVar.f186113b.getF186138a() + ".memory." + str, j12);
    }

    public final void a(Long l12, String str, String str2) {
        this.f186112a.c(new y.c(H.i('.', str2, str), l12, null));
    }

    public final void b(g gVar, long j12, String str) {
        a(Long.valueOf(gVar.f186125b), "nativeHeapSize", str);
        long j13 = gVar.f186124a;
        a(Long.valueOf(j13), "javaHeapSize", str);
        long j14 = gVar.f186126c;
        a(Long.valueOf(j14), "codeSize", str);
        long j15 = gVar.f186127d;
        a(Long.valueOf(j15), "stackSize", str);
        long j16 = gVar.f186128e;
        a(Long.valueOf(j16), "graphicsSize", str);
        long j17 = gVar.f186129f;
        a(Long.valueOf(j17), "privateOtherSize", str);
        a(Long.valueOf(j13 + gVar.f186125b + j14 + j15 + j16 + j17), "totalSize", str);
        a(Long.valueOf(gVar.f186130g), "gcCount", str);
        a(Long.valueOf(gVar.f186131h), "gcTime", str);
        a(Long.valueOf(gVar.f186132i), "blockingGcCount", str);
        a(Long.valueOf(gVar.f186133j), "blockingGcTime", str);
        a(Long.valueOf(j12), "timeRange", str);
    }

    public final void d(@Y61.k a aVar) {
        b bVar = new b(aVar);
        aVar.f186120e = bVar;
        g gVar = aVar.f186121f;
        if (gVar != null) {
            bVar.invoke(gVar, Long.valueOf(aVar.f186119d.b()));
        }
    }

    /* compiled from: MemoryConsumptionTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/f$a;", "", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22983P f186116a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final i f186117b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f186118c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final F f186119d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public p<? super g, ? super Long, G0> f186120e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public g f186121f;

        public a(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k I1 i12, @Y61.k C c12, @Y61.k i iVar, boolean z12) {
            this.f186116a = interfaceC22983P;
            this.f186117b = iVar;
            this.f186118c = z12;
            F f12 = new F();
            this.f186119d = f12;
            n<Object> nVar = I1.f67278k0[7];
            if (((Boolean) i12.f67318h.a().invoke()).booleanValue() || E.a(c12.o())) {
                if (((interfaceC22983P instanceof Activity) || (interfaceC22983P instanceof Fragment)) && !(interfaceC22983P instanceof InterfaceC28477j.b)) {
                    return;
                }
                f12.c();
                iVar.a();
                interfaceC22983P.getLifecycle().a(new e(this));
            }
        }

        public /* synthetic */ a(InterfaceC22983P interfaceC22983P, I1 i12, C c12, D d12, i iVar, boolean z12, int i13, C42822w c42822w) {
            this(interfaceC22983P, i12, c12, (i13 & 16) != 0 ? new j(null, 1, null) : iVar, (i13 & 32) != 0 ? true : z12);
        }
    }
}
