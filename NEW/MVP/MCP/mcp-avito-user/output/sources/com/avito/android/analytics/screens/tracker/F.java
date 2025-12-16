package com.avito.android.analytics.screens.tracker;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.I1;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.util.V2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/F;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28499v f90713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28501x f90714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f90715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f90716d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90717e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90718f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90719g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90720h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<B> f90721i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.analytics.screens.tracker.fps.e f90722j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90723k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90724l;

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ScreenPerformanceTracker.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/avito/android/analytics/screens/tracker/e;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Map<String, InterfaceC28483e>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f90725l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, InterfaceC28483e> invoke() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/p;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<InterfaceC28494p> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28494p invoke() {
            return F.this.f90715c.c();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/g;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<InterfaceC28485g> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28485g invoke() {
            return F.this.f90715c.f();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/avito/android/analytics/screens/tracker/k;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Map<String, InterfaceC28489k>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f90728l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, InterfaceC28489k> invoke() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/avito/android/analytics/screens/tracker/k;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Map<String, InterfaceC28489k>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f90729l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, InterfaceC28489k> invoke() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/avito/android/analytics/screens/tracker/D;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<Map<String, D>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f90730l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, D> invoke() {
            return new LinkedHashMap();
        }
    }

    public F(@Y61.k InterfaceC28499v interfaceC28499v, @Y61.k InterfaceC28501x interfaceC28501x, @Y61.k com.avito.android.analytics.screens.o oVar, @Y61.k String str) {
        this.f90713a = interfaceC28499v;
        this.f90714b = interfaceC28501x;
        this.f90715c = oVar;
        this.f90716d = str;
        this.f90717e = C42727D.c(e.f90728l);
        this.f90718f = C42727D.c(f.f90729l);
        this.f90719g = C42727D.c(b.f90725l);
        this.f90720h = C42727D.c(g.f90730l);
        this.f90721i = new AtomicReference<>(null);
        this.f90723k = C42727D.c(new c());
        this.f90724l = C42727D.c(new d());
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@Y61.k String str, boolean z12) {
        InterfaceC42726C interfaceC42726C = this.f90720h;
        D d12 = (D) ((Map) interfaceC42726C.getValue()).get(str);
        if (d12 == null) {
            V2.f318762a.e("Mvi metric end tracked, but was never started - startMviMetric() was not called", null);
        } else {
            d12.a(z12);
            ((Map) interfaceC42726C.getValue()).remove(str);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@Y61.k com.avito.android.analytics.screens.image.c cVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f90715c.b(cVar).a(interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@Y61.k String str, boolean z12) {
        E eI2 = this.f90715c.i(str);
        ((Map) this.f90720h.getValue()).put(str, eI2);
        eI2.start();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k com.avito.android.analytics.screens.J j12, long j13) {
        int iOrdinal = loadingType.ordinal();
        com.avito.android.analytics.screens.o oVar = this.f90715c;
        if (iOrdinal == 0) {
            oVar.e(str).g(null, j12, j13);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            oVar.j(str).g(null, j12, j13);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final C34244a F(@Y61.k String str, @Y61.l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return ((InterfaceC28494p) this.f90723k.getValue()).p(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@Y61.l SerpResultCategoryDetails serpResultCategoryDetails) {
        String categoryId;
        C28498u c28498uD = this.f90715c.d();
        synchronized (c28498uD) {
            if (c28498uD.f90932d) {
                return;
            }
            I1 i12 = c28498uD.f90931c;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[40];
            if (((Boolean) i12.f67293O.a().getValue()).booleanValue()) {
                if (c28498uD.f90931c.w().getValue().booleanValue()) {
                    if (serpResultCategoryDetails != null && (categoryId = serpResultCategoryDetails.getCategoryId()) != null) {
                        String microCategoryId = serpResultCategoryDetails.getMicroCategoryId();
                        if (microCategoryId == null) {
                            return;
                        }
                        c28498uD.f90930b.c(new pc.j(c28498uD.f90929a, categoryId, microCategoryId));
                        c28498uD.f90932d = true;
                    }
                }
            }
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final Long H(@Y61.k String str) {
        InterfaceC28483e interfaceC28483e = (InterfaceC28483e) ((Map) this.f90719g.getValue()).get(str);
        if (interfaceC28483e != null) {
            return Long.valueOf(interfaceC28483e.c());
        }
        V2.f318762a.e("Content drawing end tracked, but drawing was never started - startDrawing() was not called", null);
        return null;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    /* renamed from: O, reason: from getter */
    public final String getF305951e() {
        return this.f90716d;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@Y61.k String str, @Y61.k com.avito.android.analytics.screens.J j12, @Y61.l Integer num) {
        InterfaceC42726C interfaceC42726C = this.f90719g;
        InterfaceC28483e interfaceC28483e = (InterfaceC28483e) ((Map) interfaceC42726C.getValue()).get(str);
        if (interfaceC28483e == null) {
            V2.f318762a.e("Content drawing end tracked, but drawing was never started - startDrawing() was not called", null);
        } else {
            interfaceC28483e.d(num, j12);
            ((Map) interfaceC42726C.getValue()).remove(str);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void a(long j12) {
        this.f90713a.a(j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@Y61.k RecyclerView recyclerView) {
        com.avito.android.analytics.screens.tracker.fps.e eVar = this.f90722j;
        if (eVar != null) {
            eVar.a(recyclerView);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar) {
        com.avito.android.analytics.screens.o oVar = this.f90715c;
        com.avito.android.analytics.screens.tracker.fps.f fVarA = oVar.a();
        this.f90722j = fVarA;
        if (fVarA != null) {
            fVarA.c(interfaceC22983P);
        }
        oVar.g().a(aVar);
        ((InterfaceC28485g) this.f90724l.getValue()).b(interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void d() {
        this.f90714b.b(-1L);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void e() {
        this.f90714b.start();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        AtomicReference<B> atomicReference = this.f90721i;
        B b12 = atomicReference.get();
        if (b12 == null) {
            V2.f318762a.e("Mvi redraw end tracked, but was never started - startRedraw() was not called", null);
        } else {
            b12.f();
            atomicReference.set(null);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        C cK2 = this.f90715c.k();
        this.f90721i.set(cK2);
        cK2.start();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@Y61.k String str) {
        C28484f c28484fH = this.f90715c.h(str);
        ((Map) this.f90719g.getValue()).put(str, c28484fH);
        c28484fH.start();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    public final C28493o o(@Y61.l AbstractC23662a.b bVar) {
        return ((InterfaceC28494p) this.f90723k.getValue()).o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        com.avito.android.analytics.screens.tracker.fps.e eVar = this.f90722j;
        if (eVar != null) {
            eVar.g(hVar);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k com.avito.android.analytics.screens.J j12, @Y61.l Integer num) {
        int iOrdinal = loadingType.ordinal();
        if (iOrdinal == 0) {
            InterfaceC42726C interfaceC42726C = this.f90718f;
            InterfaceC28489k interfaceC28489k = (InterfaceC28489k) ((Map) interfaceC42726C.getValue()).get(str);
            if (interfaceC28489k == null) {
                V2.f318762a.e("Remote content loading end tracked, but loading was never started - startLoading() was not called", null);
                return;
            }
            InterfaceC28489k.a.a(interfaceC28489k, num, j12, 0L, 4);
            ((Map) interfaceC42726C.getValue()).remove(str);
            ((InterfaceC28485g) this.f90724l.getValue()).a(str);
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        InterfaceC42726C interfaceC42726C2 = this.f90717e;
        InterfaceC28489k interfaceC28489k2 = (InterfaceC28489k) ((Map) interfaceC42726C2.getValue()).get(str);
        if (interfaceC28489k2 == null) {
            V2.f318762a.e("Local content loading end tracked, but loading was never started - startLoading() was not called", null);
        } else {
            InterfaceC28489k.a.a(interfaceC28489k2, num, j12, 0L, 4);
            ((Map) interfaceC42726C2.getValue()).remove(str);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType) {
        int iOrdinal = loadingType.ordinal();
        com.avito.android.analytics.screens.o oVar = this.f90715c;
        if (iOrdinal == 0) {
            P pE2 = oVar.e(str);
            ((Map) this.f90718f.getValue()).put(str, pE2);
            pE2.start();
            ((InterfaceC28485g) this.f90724l.getValue()).c(str, pE2);
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        r rVarJ = oVar.j(str);
        ((Map) this.f90717e.getValue()).put(str, rVarJ);
        rVarJ.start();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f90714b.b(j12);
    }

    public /* synthetic */ F(InterfaceC28499v interfaceC28499v, InterfaceC28501x interfaceC28501x, com.avito.android.analytics.screens.o oVar, String str, int i12, C42822w c42822w) {
        this(interfaceC28499v, interfaceC28501x, oVar, (i12 & 8) != 0 ? "screen" : str);
    }
}
