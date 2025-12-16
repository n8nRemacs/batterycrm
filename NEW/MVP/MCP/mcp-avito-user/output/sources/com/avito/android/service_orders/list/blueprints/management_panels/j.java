package com.avito.android.service_orders.list.blueprints.management_panels;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.snapshots.C22166k;
import com.avito.android.R;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_orders.list.blueprints.f;
import com.avito.android.service_orders.plates.ServiceBookingPlateView;
import com.avito.android.verification.verification_input_inn.o;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersManagementPanelsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/management_panels/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_orders/list/blueprints/management_panels/i;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f279324f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f279325b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f279326c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f279327d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f279328e;

    /* compiled from: ServiceOrdersManagementPanelsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/service_orders/plates/ServiceBookingPlateView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ServiceBookingPlateView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ServiceBookingPlateView invoke() {
            View viewFindViewById = j.this.f279325b.findViewById(R.id.panel_left_plate);
            if (viewFindViewById != null) {
                return (ServiceBookingPlateView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.service_orders.plates.ServiceBookingPlateView");
        }
    }

    /* compiled from: ServiceOrdersManagementPanelsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/service_orders/plates/ServiceBookingPlateView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ServiceBookingPlateView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ServiceBookingPlateView invoke() {
            View viewFindViewById = j.this.f279325b.findViewById(R.id.panel_right_bottom_plate);
            if (viewFindViewById != null) {
                return (ServiceBookingPlateView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.service_orders.plates.ServiceBookingPlateView");
        }
    }

    /* compiled from: ServiceOrdersManagementPanelsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/service_orders/plates/ServiceBookingPlateView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ServiceBookingPlateView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ServiceBookingPlateView invoke() {
            View viewFindViewById = j.this.f279325b.findViewById(R.id.panel_right_top_plate);
            if (viewFindViewById != null) {
                return (ServiceBookingPlateView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.service_orders.plates.ServiceBookingPlateView");
        }
    }

    public j(@k View view) {
        super(view);
        this.f279325b = view;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f279326c = C42727D.b(lazyThreadSafetyMode, new a());
        this.f279327d = C42727D.b(lazyThreadSafetyMode, new c());
        this.f279328e = C42727D.b(lazyThreadSafetyMode, new b());
    }

    public static void B80(ServiceBookingPlateView serviceBookingPlateView, f.a aVar) {
        String str;
        Integer numM = null;
        serviceBookingPlateView.setFirstLineText(aVar != null ? aVar.f279307a : null);
        serviceBookingPlateView.setSecondLineText(aVar != null ? aVar.f279308b : null);
        serviceBookingPlateView.setBoldLineText(aVar != null ? aVar.f279309c : null);
        if (aVar != null && (str = aVar.f279311e) != null) {
            numM = com.avito.android.lib.util.f.m(str);
        }
        serviceBookingPlateView.setIcon(numM);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void E40(@k Y41.a<G0> aVar) {
        ((ServiceBookingPlateView) this.f279326c.getValue()).setOnClickListener(new A(8, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void Oo(@l f.a aVar) {
        B80((ServiceBookingPlateView) this.f279326c.getValue(), aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void ZM(@k Y41.a<G0> aVar) {
        int i12 = 21;
        ((ServiceBookingPlateView) this.f279327d.getValue()).setOnClickListener(new o(i12, new l0.g(), new C22166k(aVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void t40(@l f.a aVar) {
        B80((ServiceBookingPlateView) this.f279327d.getValue(), aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void tM(@l f.a aVar) {
        B80((ServiceBookingPlateView) this.f279328e.getValue(), aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_orders.list.blueprints.management_panels.i
    public final void yC(@k Y41.a<G0> aVar) {
        ((ServiceBookingPlateView) this.f279328e.getValue()).setOnClickListener(new A(9, aVar));
    }
}
