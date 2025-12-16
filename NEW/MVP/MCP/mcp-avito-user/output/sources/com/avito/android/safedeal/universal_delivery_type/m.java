package com.avito.android.safedeal.universal_delivery_type;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.UniversalDeliveryTypeScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.analytics.screens.tracker.P;
import com.avito.android.memory.consumption.f;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/m;", "Lcom/avito/android/safedeal/universal_delivery_type/l;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28481c f256638a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28499v f256639b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f256640c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f256641d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f256642e = C42727D.c(new d());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f256643f = C42727D.c(new c());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f256644g = C42727D.c(new b());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f256645h = C42727D.c(new a());

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public InterfaceC28489k f256646i;

    /* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/x;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC28501x> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28501x invoke() {
            return ((H) m.this.f256641d.getValue()).c(new H.c("courier-delivery", false));
        }
    }

    /* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/x;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<InterfaceC28501x> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28501x invoke() {
            return ((H) m.this.f256641d.getValue()).c(new H.c("pvz-delivery", false));
        }
    }

    /* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/x;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<InterfaceC28501x> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28501x invoke() {
            return ((H) m.this.f256641d.getValue()).c(new H.c("shipping-competition-delivery", false));
        }
    }

    /* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/x;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<InterfaceC28501x> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC28501x invoke() {
            return ((H) m.this.f256641d.getValue()).c(H.a.f90737a);
        }
    }

    /* compiled from: UniversalDeliveryTypePerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/H;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f256652m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f256652m = rVar;
        }

        @Override // Y41.a
        public final H invoke() {
            return m.this.f256638a.b(UniversalDeliveryTypeScreen.f90537d, this.f256652m);
        }
    }

    @Inject
    public m(@Y61.k InterfaceC28481c interfaceC28481c, @Y61.k r rVar, @Y61.k InterfaceC28499v interfaceC28499v, @Y61.k com.avito.android.analytics.screens.o oVar) {
        this.f256638a = interfaceC28481c;
        this.f256639b = interfaceC28499v;
        this.f256640c = oVar;
        this.f256641d = C42727D.c(new e(rVar));
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void a(long j12) {
        this.f256639b.a(j12);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void b() {
        ((InterfaceC28501x) this.f256645h.getValue()).b(-1L);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void c() {
        ((InterfaceC28501x) this.f256643f.getValue()).start();
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void d() {
        ((InterfaceC28501x) this.f256642e.getValue()).b(-1L);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void e() {
        ((InterfaceC28501x) this.f256642e.getValue()).start();
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void f() {
        InterfaceC28489k interfaceC28489k = this.f256646i;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 4);
        }
        this.f256646i = null;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void g() {
        ((InterfaceC28501x) this.f256643f.getValue()).b(-1L);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void h() {
        ((InterfaceC28501x) this.f256645h.getValue()).start();
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void i() {
        P pE2 = this.f256640c.e("map-points");
        pE2.start();
        this.f256646i = pE2;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void j() {
        ((InterfaceC28501x) this.f256644g.getValue()).b(-1L);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void k(@Y61.k f.a aVar, @Y61.k UniversalDeliveryTypeActivity universalDeliveryTypeActivity) {
        com.avito.android.analytics.screens.o oVar = this.f256640c;
        oVar.a().c(universalDeliveryTypeActivity);
        oVar.g().a(aVar);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.l
    public final void l() {
        ((InterfaceC28501x) this.f256644g.getValue()).start();
    }
}
