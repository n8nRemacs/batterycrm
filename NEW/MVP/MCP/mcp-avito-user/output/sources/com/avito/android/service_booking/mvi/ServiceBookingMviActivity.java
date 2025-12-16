package com.avito.android.service_booking.mvi;

import Cd.C13243a;
import Fs0.c;
import Y61.k;
import Y61.l;
import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.K;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.di.q;
import com.avito.android.service_booking.mvi.di.r;
import com.avito.android.service_booking.mvi.perf_screen.ServicesBookingScreenMvi;
import com.avito.android.service_booking.mvi.step.ServiceBookingMviStepFragment;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingMviActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking/mvi/ServiceBookingMviActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/K;", "Lcom/avito/android/service_booking/mvi/di/q;", "<init>", "()V", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingMviActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, K<q> {

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f274297t = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public q f274298m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking.mvi.f f274299n;

    /* renamed from: p, reason: collision with root package name */
    @l
    public String f274301p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public String f274302q;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public R0 f274304s;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final O0 f274300o = new O0(m0.f406844a.b(com.avito.android.service_booking.mvi.e.class), new f(), new e(new d()), new g());

    /* renamed from: r, reason: collision with root package name */
    @k
    public BookingFlowSource f274303r = BookingFlowSource.f274128f;

    /* compiled from: ServiceBookingMviActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/ServiceBookingMviActivity$a;", "", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingMviActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Fs0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Fs0.c cVar) {
            Fs0.c cVar2 = cVar;
            ServiceBookingMviActivity serviceBookingMviActivity = (ServiceBookingMviActivity) this.receiver;
            a aVar = ServiceBookingMviActivity.f274297t;
            serviceBookingMviActivity.getClass();
            if (cVar2 instanceof c.a) {
                ServiceBookingMviStepFragment.a aVar2 = ServiceBookingMviStepFragment.f274486D0;
                String str = serviceBookingMviActivity.f274301p;
                String str2 = serviceBookingMviActivity.f274302q;
                String str3 = serviceBookingMviActivity.f274303r.f274131b;
                aVar2.getClass();
                ServiceBookingMviStepFragment serviceBookingMviStepFragment = new ServiceBookingMviStepFragment();
                Bundle bundle = new Bundle();
                String str4 = ((c.a) cVar2).f6005a;
                bundle.putString("key.step_id", str4);
                bundle.putString("key.advert_id", str);
                bundle.putString("key.booking_id", str2);
                bundle.putString("key.booking_flow_source", str3);
                serviceBookingMviStepFragment.setArguments(bundle);
                androidx.fragment.app.H hE2 = serviceBookingMviActivity.getSupportFragmentManager().e();
                hE2.n(R.id.content, serviceBookingMviStepFragment, null);
                hE2.c("tag.step.".concat(str4));
                hE2.e();
            } else if (cVar2 instanceof c.b) {
                FragmentManager supportFragmentManager = serviceBookingMviActivity.getSupportFragmentManager();
                String str5 = ((c.b) cVar2).f6006a;
                supportFragmentManager.a0(0, str5 != null ? "tag.step.".concat(str5) : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFs0/d;", "it", "Lkotlin/G0;", "invoke", "(LFs0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Fs0.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f274305l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Fs0.d dVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking/mvi/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.service_booking.mvi.e> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_booking.mvi.e invoke() {
            com.avito.android.service_booking.mvi.f fVar = ServiceBookingMviActivity.this.f274299n;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.service_booking.mvi.e) fVar.get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f274307l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f274307l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f274307l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ServiceBookingMviActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ServiceBookingMviActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        String stringExtra = getIntent().getStringExtra("key.step_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException(("key.step_id was not passed to " + this).toString());
        }
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            serializableExtra = intent.getSerializableExtra("key.booking_flow", BookingFlow.class);
        } else {
            Object serializableExtra3 = intent.getSerializableExtra("key.booking_flow");
            if (!(serializableExtra3 instanceof BookingFlow)) {
                serializableExtra3 = null;
            }
            serializableExtra = (BookingFlow) serializableExtra3;
        }
        if (serializableExtra == null) {
            throw new IllegalArgumentException(("key.booking_flow was not passed to " + this).toString());
        }
        BookingFlow bookingFlow = (BookingFlow) serializableExtra;
        this.f274301p = getIntent().getStringExtra("key.advert_id");
        this.f274302q = getIntent().getStringExtra("key.booking_id");
        Intent intent2 = getIntent();
        if (i12 >= 33) {
            serializableExtra2 = intent2.getSerializableExtra("key.booking_flow_source", BookingFlowSource.class);
        } else {
            Object serializableExtra4 = intent2.getSerializableExtra("key.booking_flow_source");
            serializableExtra2 = (BookingFlowSource) (serializableExtra4 instanceof BookingFlowSource ? serializableExtra4 : null);
        }
        BookingFlowSource bookingFlowSource = (BookingFlowSource) serializableExtra2;
        if (bookingFlowSource == null) {
            bookingFlowSource = BookingFlowSource.f274128f;
        }
        this.f274303r = bookingFlowSource;
        q qVarA = com.avito.android.service_booking.mvi.di.c.a().a(stringExtra, this.f274301p, getIntent().getStringExtra("key.mc_id"), getIntent().getStringExtra("key.location_id"), this.f274302q, bookingFlow, this.f274303r, getResources(), new C28478k(ServicesBookingScreenMvi.f274427d, s.a(this), "ServiceBookingScreenMvi"), (r) C29972i.a(C29972i.b(this), r.class), cv.c.a(this));
        this.f274298m = qVarA;
        qVarA.ii(this);
        super.onCreate(bundle);
        com.avito.android.arch.mvi.android.f.b(this, (com.avito.android.service_booking.mvi.e) this.f274300o.getValue(), new b(1, this, ServiceBookingMviActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking/mvi/navigation/mvi/entity/ServiceBookingNavigationOneTimeEvent;)V", 0), c.f274305l);
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        q qVar = this.f274298m;
        if (qVar != null) {
            return qVar;
        }
        return null;
    }
}
