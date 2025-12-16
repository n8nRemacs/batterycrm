package com.avito.android.service_order_map.serviceordermap;

import Cd.C13243a;
import HV.a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ServiceOrderMapScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapPointKt;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.di.C29972i;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.permissions.C33031a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kr.C43490a;
import tu0.InterfaceC48720b;
import vu0.InterfaceC49384a;
import z1.AbstractC50339a;

/* compiled from: ServiceOrderMapActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceOrderMapActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final a f278595s = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public p f278596m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f278598o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f278599p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public k f278600q;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f278597n = new O0(m0.f406844a.b(o.class), new f(), new e(new h()), new g());

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final b f278601r = new b();

    /* compiled from: ServiceOrderMapActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapActivity$a;", "", "<init>", "()V", "", "ARGS_EXTRA_KEY", "Ljava/lang/String;", "RESULT_ADDRESS_KEY", "RESULT_LAT_KEY", "RESULT_LNG_KEY", "SAVED_MAP_TARGET_KEY", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrderMapActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_order_map/serviceordermap/ServiceOrderMapActivity$b", "Landroidx/activity/x;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = ServiceOrderMapActivity.f278595s;
            ServiceOrderMapActivity serviceOrderMapActivity = ServiceOrderMapActivity.this;
            O0 o02 = serviceOrderMapActivity.f278597n;
            ServiceOrderMapState.MapMode mapMode = ((o) o02.getValue()).getState().getValue().f278782j;
            ServiceOrderMapState.MapMode mapMode2 = ServiceOrderMapState.MapMode.f278784c;
            if (mapMode == mapMode2) {
                serviceOrderMapActivity.finish();
            } else {
                ((o) o02.getValue()).accept(new a.b(mapMode2));
            }
        }
    }

    /* compiled from: ServiceOrderMapActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49384a, G0> {
        public final void f(@Y61.k InterfaceC49384a interfaceC49384a) {
            AvitoMap avitoMap;
            AvitoMapTarget mapTarget;
            ServiceOrderMapActivity serviceOrderMapActivity = (ServiceOrderMapActivity) this.receiver;
            a aVar = ServiceOrderMapActivity.f278595s;
            serviceOrderMapActivity.getClass();
            point = null;
            AvitoMapPoint point = null;
            if (interfaceC49384a instanceof InterfaceC49384a.e) {
                k kVar = serviceOrderMapActivity.f278600q;
                if (kVar != null) {
                    InterfaceC49384a.e eVar = (InterfaceC49384a.e) interfaceC49384a;
                    AvitoMap avitoMap2 = kVar.f278698o;
                    if (avitoMap2 != null && (mapTarget = avitoMap2.getMapTarget()) != null) {
                        point = mapTarget.getPoint();
                    }
                    Coordinates coordinates = eVar.f441044a;
                    AvitoMapPoint avitoMapPoint = new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null);
                    if ((point == null || !AvitoMapPointKt.almostEqual(point, avitoMapPoint)) && (avitoMap = kVar.f278698o) != null) {
                        avitoMap.moveTo(coordinates.getLatitude(), coordinates.getLongitude(), true, Float.valueOf(eVar.f441046c.f278618b));
                        return;
                    }
                    return;
                }
                return;
            }
            if (interfaceC49384a instanceof InterfaceC49384a.d) {
                a.C0407a c0407a = HV.a.f7100w;
                int iJ2 = C35835l0.j(R.attr.toastBarError, serviceOrderMapActivity);
                c0407a.getClass();
                HV.a aVarB = a.C0407a.b(iJ2, serviceOrderMapActivity);
                Button buttonB = IV.a.b(aVarB, serviceOrderMapActivity.getString(R.string.service_order_map_settings), serviceOrderMapActivity, new com.avito.android.service_order_map.serviceordermap.b(serviceOrderMapActivity));
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.service_order_map_location_permission_required, new Serializable[0]);
                k kVar2 = serviceOrderMapActivity.f278600q;
                IV.a.c(serviceOrderMapActivity, new ToastBarState(printableTextC, kVar2 != null ? kVar2.f278686c : null, ToastBarPosition.f181046d, null, Collections.singletonList(buttonB), null, null, 2750, false, false, null, null, 3944, null), aVarB);
                return;
            }
            if (!(interfaceC49384a instanceof InterfaceC49384a.b)) {
                if (interfaceC49384a instanceof InterfaceC49384a.c) {
                    C43490a.a(serviceOrderMapActivity, new ToastBarState(com.avito.android.printable_text.b.c(R.string.unknown_server_error, new Serializable[0]), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
                    return;
                } else {
                    if (interfaceC49384a instanceof InterfaceC49384a.C12798a) {
                        serviceOrderMapActivity.onBackPressed();
                        return;
                    }
                    return;
                }
            }
            InterfaceC49384a.b bVar = (InterfaceC49384a.b) interfaceC49384a;
            Intent intent = new Intent();
            intent.putExtra("address_key", bVar.f441039a);
            intent.putExtra("lat_key", bVar.f441040b);
            intent.putExtra("lng_key", bVar.f441041c);
            serviceOrderMapActivity.setResult(-1, intent);
            serviceOrderMapActivity.finish();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC49384a interfaceC49384a) {
            f(interfaceC49384a);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderMapActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ServiceOrderMapState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ServiceOrderMapState serviceOrderMapState) {
            ServiceOrderMapState serviceOrderMapState2 = serviceOrderMapState;
            a aVar = ServiceOrderMapActivity.f278595s;
            ServiceOrderMapActivity serviceOrderMapActivity = ServiceOrderMapActivity.this;
            com.avito.android.service_order_map.serviceordermap.a aVar2 = new com.avito.android.service_order_map.serviceordermap.a(1, (o) serviceOrderMapActivity.f278597n.getValue(), o.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            final k kVar = serviceOrderMapActivity.f278600q;
            if (kVar != null) {
                Input.t(kVar.f278689f, serviceOrderMapState2.f278775c, true, 2);
                String string = serviceOrderMapState2.f278779g;
                if (string == null) {
                    string = kVar.getContext().getString(R.string.service_order_map_address);
                }
                NavBar.e(kVar.f278688e, string, 0, 6);
                String string2 = serviceOrderMapState2.f278780h;
                if (string2 == null) {
                    string2 = kVar.getContext().getString(R.string.service_order_map_choose_button_title);
                }
                com.avito.android.lib.design.button.b.a(kVar.f278695l, string2, false);
                List<AddressSuggestion> list = serviceOrderMapState2.f278781i;
                com.avito.android.service_order_map.serviceordermap.suggests.b bVar = kVar.f278697n;
                bVar.f278821d = list;
                bVar.notifyDataSetChanged();
                D6.G(kVar.f278696m, serviceOrderMapState2.f278778f);
                kVar.f278699p = aVar2;
                ServiceOrderMapState.MapMode mapMode = kVar.f278700q;
                ServiceOrderMapState.MapMode mapMode2 = serviceOrderMapState2.f278782j;
                if (mapMode != mapMode2) {
                    int iOrdinal = mapMode2.ordinal();
                    View view = kVar.f278694k;
                    FloatingActionButton floatingActionButton = kVar.f278691h;
                    View view2 = kVar.f278693j;
                    View view3 = kVar.f278692i;
                    BackPressedAwareInput backPressedAwareInput = kVar.f278690g;
                    if (iOrdinal == 0) {
                        backPressedAwareInput.s(serviceOrderMapState2.f278774b, true, true);
                        D6.G(backPressedAwareInput, true);
                        D6.G(view3, true);
                        D6.G(view2, true);
                        backPressedAwareInput.post(new Runnable() { // from class: com.avito.android.service_order_map.serviceordermap.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.setState$lambda$5(kVar);
                            }
                        });
                        D6.w(floatingActionButton);
                        D6.w(view);
                    } else if (iOrdinal == 1) {
                        backPressedAwareInput.clearFocus();
                        K2.d(backPressedAwareInput, true);
                        D6.w(backPressedAwareInput);
                        D6.w(view3);
                        D6.w(view2);
                        D6.G(floatingActionButton, true);
                        D6.G(view, true);
                    }
                }
                kVar.f278700q = mapMode2;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f278604l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f278604l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f278604l);
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
            return ServiceOrderMapActivity.this.getF42820b();
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
            return ServiceOrderMapActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ServiceOrderMapActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_order_map/serviceordermap/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<o> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = ServiceOrderMapActivity.this.f278596m;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(ServiceOrderMapScreen.f90487d, s.a(this), null, 4, null);
        Intent intent = getIntent();
        ServiceOrderMapActivityArgs serviceOrderMapActivityArgs = (ServiceOrderMapActivityArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("args_extra_key", ServiceOrderMapActivityArgs.class) : intent.getParcelableExtra("args_extra_key"));
        if (serviceOrderMapActivityArgs == null) {
            ServiceOrderMapActivityArgs.f278608f.getClass();
            serviceOrderMapActivityArgs = ServiceOrderMapActivityArgs.f278609g;
        }
        ((InterfaceC48720b.InterfaceC12692b) C29972i.a(C29972i.b(this), InterfaceC48720b.InterfaceC12692b.class)).Ea().a(c28478k, new WeakReference(this), new C33031a(this), serviceOrderMapActivityArgs).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f278598o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        AvitoMapTarget avitoMapTarget;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f278598o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        if (bundle != null) {
            avitoMapTarget = (AvitoMapTarget) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("saved_map_target_key", AvitoMapTarget.class) : bundle.getParcelable("saved_map_target_key"));
        } else {
            avitoMapTarget = null;
        }
        AvitoMapAttachHelper avitoMapAttachHelper = this.f278599p;
        if (avitoMapAttachHelper == null) {
            avitoMapAttachHelper = null;
        }
        k kVar = new k(this, avitoMapAttachHelper, getSupportFragmentManager(), avitoMapTarget);
        this.f278600q = kVar;
        setContentView(kVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f278598o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (o) this.f278597n.getValue(), new c(1, this, ServiceOrderMapActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapOneTimeEvent;)V", 0), new d());
        getF21241d().a(this, this.f278601r);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f278598o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        AvitoMap avitoMap;
        k kVar = this.f278600q;
        AvitoMapTarget mapTarget = null;
        if (kVar != null && (avitoMap = kVar.f278698o) != null) {
            mapTarget = avitoMap.getMapTarget();
        }
        bundle.putParcelable("saved_map_target_key", mapTarget);
        super.onSaveInstanceState(bundle);
    }
}
