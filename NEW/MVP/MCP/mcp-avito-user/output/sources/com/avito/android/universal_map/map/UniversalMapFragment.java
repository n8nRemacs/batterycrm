package com.avito.android.universal_map.map;

import Cd.C13243a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.component.toast.f;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.MapBounds;
import com.avito.android.di.C29972i;
import com.avito.android.di.MissingDependencyException;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.point.Point;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.H;
import com.avito.android.universal_map.map.T;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map.di.C35298d;
import com.avito.android.universal_map.map.di.C35311q;
import com.avito.android.universal_map.map.di.InterfaceC35313t;
import com.avito.android.universal_map.map.di.InterfaceC35314u;
import com.avito.android.universal_map.map.mvi.entity.a;
import com.avito.android.universal_map.map.pin_filters.g;
import com.avito.android.universal_map.map.point_info.g;
import com.avito.android.universal_map.map.point_info.n;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import cv.InterfaceC39417a;
import dj.InterfaceC39736a;
import gj.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kj.InterfaceC42698a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lW.InterfaceC43691a;
import oG0.C44641e;
import oG0.InterfaceC44640d;
import qG0.C47291b;
import qG0.C47292c;
import rG0.InterfaceC47542b;
import z1.AbstractC50339a;

/* compiled from: UniversalMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/universal_map/map/UniversalMapFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/universal_map/m;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/delivery_location_suggest/k;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalMapFragment extends BaseFragment implements com.avito.android.universal_map.m, InterfaceC33034d.b, InterfaceC33034d.c, com.avito.android.ui.fragments.c, com.avito.android.delivery_location_suggest.k, gj.i, InterfaceC28477j.b {

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public static final a f304838X0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public S f304839A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final O0 f304840B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public T f304841C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.point_info.n f304842D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.universal_map.map.point_info.g f304843E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.pin_filters.j f304844F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.universal_map.map.pin_filters.h f304845G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public nG0.b f304846H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f304847I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f304848J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public gj.n f304849K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final Object f304850L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.delivery_location_suggest.h f304851M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public Toolbar f304852N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public UniversalMapParams f304853O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public Button f304854P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f304855Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.l
    public Point f304856R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.view.actions.h f304857S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f304858T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<DeliveryLocationSuggestParams> f304859U0;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f304860V0;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public String f304861W0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f304862n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f304863o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.common.marker.a f304864p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f304865q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f304866r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f304867s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC43691a f304868t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.o f304869u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public AvitoMarkerIconFactory f304870v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f304871w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.tracker.c f304872x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public oG0.f f304873y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public C44641e f304874z0;

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/UniversalMapFragment$a;", "", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UniversalMapFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.universal_map.map.UniversalMapFragment$a$a, reason: collision with other inner class name */
        public static final class C9362a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UniversalMapParams f304875l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f304876m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9362a(UniversalMapParams universalMapParams, String str) {
                super(1);
                this.f304875l = universalMapParams;
                this.f304876m = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("arg_universal_map_params", this.f304875l);
                bundle2.putString("arg_actions_store_key", this.f304876m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UniversalMapFragment a(@Y61.k UniversalMapParams universalMapParams, @Y61.l String str) {
            UniversalMapFragment universalMapFragment = new UniversalMapFragment();
            C35966w1.a(universalMapFragment, -1, new C9362a(universalMapParams, str));
            return universalMapFragment;
        }

        public a() {
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[UniversalMapBottomSheet.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalMapBottomSheet[] universalMapBottomSheetArr = UniversalMapBottomSheet.f304836b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<gj.k> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            UniversalMapFragment universalMapFragment = UniversalMapFragment.this;
            gj.n nVar = universalMapFragment.f304849K0;
            if (nVar == null) {
                nVar = null;
            }
            return gj.m.a(nVar, universalMapFragment);
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "newUserLocation", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Location location = (Location) obj;
            UniversalMapFragment universalMapFragment = UniversalMapFragment.this;
            InterfaceC43691a interfaceC43691a = universalMapFragment.f304868t0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(location, null);
            T t12 = universalMapFragment.f304841C0;
            T t13 = t12 != null ? t12 : null;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            oG0.f fVar = universalMapFragment.f304873y0;
            t13.y2(latitude, longitude, (fVar != null ? fVar : null).Rb());
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = UniversalMapFragment.f304838X0;
            UniversalMapFragment.this.u5((Throwable) obj, false);
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/Q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/universal_map/map/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Q> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Q invoke() {
            S s5 = UniversalMapFragment.this.f304839A0;
            if (s5 == null) {
                s5 = null;
            }
            return (Q) s5.get();
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f304881l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.l<InterfaceC47542b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47542b interfaceC47542b) {
            InterfaceC47542b interfaceC47542b2 = interfaceC47542b;
            UniversalMapFragment universalMapFragment = (UniversalMapFragment) this.receiver;
            a aVar = UniversalMapFragment.f304838X0;
            universalMapFragment.getClass();
            if (interfaceC47542b2 instanceof InterfaceC47542b.h) {
                ApiError apiError = ((InterfaceC47542b.h) interfaceC47542b2).f429709a;
                com.avito.android.component.toast.b.c(universalMapFragment, com.avito.android.error.z.k(apiError), null, new f.c(apiError), 382);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
            a aVar = UniversalMapFragment.f304838X0;
            UniversalMapFragment universalMapFragment = UniversalMapFragment.this;
            com.avito.android.universal_map.map.mvi.entity.a aVar2 = eVar.f305595b;
            if (aVar2 instanceof a.C9378a) {
                a.C9378a c9378a = (a.C9378a) aVar2;
                universalMapFragment.f304861W0 = c9378a.f305555a;
                nG0.b bVar = universalMapFragment.f304846H0;
                if (bVar != null) {
                    bVar.f414970d.m(c9378a.f305556b);
                }
            } else {
                kotlin.jvm.internal.L.f(aVar2, a.b.f305557a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f304883l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f304883l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f304883l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UniversalMapFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f304885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f304885l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f304885l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f304886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f304886l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f304886l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f304887l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f304887l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f304887l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public UniversalMapFragment() {
        super(R.layout.fragment_universal_map);
        this.f304862n0 = C42727D.c(g.f304881l);
        j jVar = new j(new f());
        k kVar = new k();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new l(kVar));
        this.f304840B0 = new O0(m0.f406844a.b(Q.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f304850L0 = C42727D.b(lazyThreadSafetyMode, new c());
        this.f304857S0 = new com.avito.android.publish.screen.objects.view.actions.h(this, 27);
        this.f304858T0 = new io.reactivex.rxjava3.disposables.c();
        this.f304859U0 = registerForActivityResult(new com.avito.android.delivery_location_suggest.b(this), new com.avito.android.str_seller_orders.orders_seller.a(this, 1));
    }

    public static final Double q5(UniversalMapFragment universalMapFragment) {
        C44641e c44641e;
        com.avito.android.universal_map.map.point_info.g gVar;
        AvitoMapTarget mapTarget;
        View view = universalMapFragment.getView();
        if (view == null || (c44641e = universalMapFragment.f304874z0) == null || (gVar = universalMapFragment.f304843E0) == null) {
            return null;
        }
        AvitoMap avitoMap = c44641e.f428295k;
        AvitoMapPoint point = (avitoMap == null || (mapTarget = avitoMap.getMapTarget()) == null) ? null : mapTarget.getPoint();
        if (point == null) {
            return null;
        }
        android.graphics.Point point2 = new android.graphics.Point(view.getWidth() / 2, ((int) ((c44641e.f428291g.getHeight() - gVar.a()) * 1.2d)) / 2);
        AvitoMap avitoMap2 = c44641e.f428295k;
        AvitoMapPoint avitoMapPointFromScreenLocation = avitoMap2 != null ? avitoMap2.fromScreenLocation(point2) : null;
        if (avitoMapPointFromScreenLocation != null) {
            return Double.valueOf(avitoMapPointFromScreenLocation.getLatitude() - point.getLatitude());
        }
        return null;
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q(this.f304861W0, this.f304860V0));
        com.avito.android.universal_map.map.point_info.g gVar = this.f304843E0;
        if (gVar != null) {
            linkedHashMapJ.putAll(gVar.c());
        }
        if (this.f304845G0 != null) {
            linkedHashMapJ.putAll(new LinkedHashMap());
        }
        return (RecyclerView) linkedHashMapJ.get(str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        com.avito.android.location.find.o oVar = this.f304869u0;
        if (oVar == null) {
            oVar = null;
        }
        io.reactivex.rxjava3.core.z zVarB = oVar.b(requireActivity(), (4 & 2) == 0, (4 & 4) == 0);
        d dVar = new d();
        e eVar = new e();
        zVarB.getClass();
        this.f304858T0.b(zVarB.v0(dVar, eVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f304866r0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        Toolbar toolbar = this.f304852N0;
        UniversalMapParams universalMapParams = this.f304853O0;
        return new gj.o(new o.a(requireView(), ToastBarPosition.f181047e), ((universalMapParams != null ? universalMapParams.f304741e : null) == null || toolbar == null) ? new o.a(requireView(), ToastBarPosition.f181047e) : new o.a(toolbar, ToastBarPosition.f181045c));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        u5(new Throwable(str), false);
    }

    @Override // com.avito.android.delivery_location_suggest.k
    @Y61.k
    public final com.avito.android.delivery_location_suggest.h e1() {
        com.avito.android.delivery_location_suggest.h hVar = this.f304851M0;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        u5(new Throwable("PERMISSION DENIED"), true);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        com.avito.android.universal_map.map.point_info.g gVar = this.f304843E0;
        if (gVar != null ? gVar.isVisible() : false) {
            com.avito.android.universal_map.map.point_info.n nVar = this.f304842D0;
            (nVar != null ? nVar : null).hide();
        } else {
            com.avito.android.universal_map.map.pin_filters.h hVar = this.f304845G0;
            if (hVar == null || hVar.f305738l.f355975L == 5) {
                return false;
            }
            com.avito.android.universal_map.map.pin_filters.j jVar = this.f304844F0;
            (jVar != null ? jVar : null).T2(true);
        }
        return true;
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        oG0.f fVar = this.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        AvitoMarkerIconFactory avitoMarkerIconFactory = this.f304870v0;
        fVar.Xd(avitoMarkerIconFactory != null ? avitoMarkerIconFactory : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@Y61.k Menu menu, @Y61.k MenuInflater menuInflater) {
        UniversalMapParams.ToolbarSettings toolbarSettings;
        super.onCreateOptionsMenu(menu, menuInflater);
        UniversalMapParams universalMapParams = this.f304853O0;
        if (universalMapParams == null || (toolbarSettings = universalMapParams.f304741e) == null || toolbarSettings.getHideSearchAddress()) {
            return;
        }
        menuInflater.inflate(R.menu.menu_universal_map, menu);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.universal_map.map.tracker.c cVar = this.f304872x0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e();
        com.avito.android.universal_map.map.tracker.c cVar2 = this.f304872x0;
        com.avito.android.analytics.screens.mvi.a.g(this, cVar2 != null ? cVar2 : null, (Q) this.f304840B0.getValue(), new h(1, this, UniversalMapFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapOneTimeEvent;)V", 0), new i());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        oG0.f fVar = this.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.ed();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C44641e c44641e = this.f304874z0;
        if (c44641e != null) {
            c44641e.f428295k = null;
        }
        this.f304852N0 = null;
        this.f304874z0 = null;
        this.f304843E0 = null;
        this.f304845G0 = null;
        this.f304846H0 = null;
        InterfaceC33034d interfaceC33034d = this.f304867s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        com.avito.android.universal_map.map.tracker.c cVar = this.f304872x0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.f305950d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        AvitoMap avitoMap;
        super.onLowMemory();
        C44641e c44641e = this.f304874z0;
        if (c44641e == null || (avitoMap = c44641e.f428295k) == null) {
            return;
        }
        avitoMap.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        }
        C44641e c44641e = this.f304874z0;
        if (c44641e != null) {
            AvitoMap avitoMap = c44641e.f428295k;
            String str = null;
            Object[] objArr = 0;
            AvitoMapBounds mapBounds = avitoMap != null ? avitoMap.getMapBounds() : null;
            if (mapBounds != null) {
                this.f304859U0.b(new DeliveryLocationSuggestParams.Bounds(new MapBounds(new com.avito.android.delivery_location_suggest.Point(mapBounds.getTopLeft().getLatitude(), mapBounds.getTopLeft().getLongitude()), new com.avito.android.delivery_location_suggest.Point(mapBounds.getBottomRight().getLatitude(), mapBounds.getBottomRight().getLongitude())), str, 2, objArr == true ? 1 : 0));
            }
        }
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        AvitoMap avitoMap;
        InterfaceC43691a interfaceC43691a = this.f304868t0;
        if (interfaceC43691a == null) {
            interfaceC43691a = null;
        }
        interfaceC43691a.g();
        C44641e c44641e = this.f304874z0;
        if (c44641e != null && (avitoMap = c44641e.f428295k) != null) {
            avitoMap.onStop(false);
        }
        com.avito.android.location.find.o oVar = this.f304869u0;
        (oVar != null ? oVar : null).c(requireContext());
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AvitoMap avitoMap;
        super.onResume();
        C44641e c44641e = this.f304874z0;
        if (c44641e != null && (avitoMap = c44641e.f428295k) != null) {
            avitoMap.onStart();
        }
        com.avito.android.location.find.o oVar = this.f304869u0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(requireContext());
        T t12 = this.f304841C0;
        (t12 != null ? t12 : null).wb();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C44641e c44641e = this.f304874z0;
        io.reactivex.rxjava3.disposables.c cVar = this.f304858T0;
        if (c44641e != null) {
            cVar.b(c44641e.f428292h.t0(new C35330s(this)));
            io.reactivex.rxjava3.core.z<G0> zVar = c44641e.f428293i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            zVar.getClass();
            cVar.b(zVar.C0(1000L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new C35331t(this), new C35332u(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
            cVar.b(c44641e.f419660o.t0(new C35333v(this)));
        }
        com.avito.android.universal_map.map.point_info.g gVar = this.f304843E0;
        if (gVar != null) {
            com.jakewharton.rxrelay3.c cVarD = gVar.getF305913A();
            InterfaceC35745a5 interfaceC35745a5 = this.f304871w0;
            if (interfaceC35745a5 == null) {
                interfaceC35745a5 = null;
            }
            cVar.b(cVarD.j0(interfaceC35745a5.e()).t0(new C35334w(this)));
            com.jakewharton.rxrelay3.c cVarE = gVar.getF305940z();
            InterfaceC35745a5 interfaceC35745a52 = this.f304871w0;
            if (interfaceC35745a52 == null) {
                interfaceC35745a52 = null;
            }
            cVar.b(cVarE.j0(interfaceC35745a52.e()).t0(new C35335x(this)));
        }
        com.avito.android.universal_map.map.pin_filters.h hVar = this.f304845G0;
        if (hVar != null) {
            InterfaceC35745a5 interfaceC35745a53 = this.f304871w0;
            if (interfaceC35745a53 == null) {
                interfaceC35745a53 = null;
            }
            cVar.b(hVar.f305742p.j0(interfaceC35745a53.e()).t0(new C35336y(this)));
            InterfaceC35745a5 interfaceC35745a54 = this.f304871w0;
            if (interfaceC35745a54 == null) {
                interfaceC35745a54 = null;
            }
            cVar.b(hVar.f305741o.j0(interfaceC35745a54.e()).t0(new C35337z(this)));
        }
        C44641e c44641e2 = this.f304874z0;
        if (c44641e2 != null && c44641e2.f428295k == null) {
            AvitoMapAttachHelper avitoMapAttachHelper = c44641e2.f428287c;
            avitoMapAttachHelper.setMapAttachedListener(c44641e2);
            avitoMapAttachHelper.attachView(R.id.map, c44641e2.f428286b, c44641e2.f428288d);
        }
        InterfaceC33034d interfaceC33034d = this.f304867s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f304867s0;
            (interfaceC33034d2 != null ? interfaceC33034d2 : null).e(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f304867s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        this.f304858T0.e();
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        com.avito.android.universal_map.map.point_info.g mVar;
        UniversalMapParams.MapSettings mapSettings;
        super.onViewCreated(view, bundle);
        com.avito.android.universal_map.map.tracker.c cVar = this.f304872x0;
        if (cVar == null) {
            cVar = null;
        }
        ScreenPerformanceTracker.a.b(cVar, null, 3);
        s5();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f304852N0 = toolbar;
        UniversalMapParams universalMapParams = this.f304853O0;
        UniversalMapParams.ToolbarSettings toolbarSettings = universalMapParams != null ? universalMapParams.f304741e : null;
        if (toolbarSettings != null) {
            o5(toolbar);
            C35966w1.c(this).w(null);
            Toolbar toolbar2 = this.f304852N0;
            if (toolbar2 != null) {
                final int i12 = 1;
                toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.universal_map.map.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragment f305234c;

                    {
                        this.f305234c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        UniversalMapFragment universalMapFragment = this.f305234c;
                        switch (i12) {
                            case 0:
                                com.avito.android.universal_map.map.pin_filters.j jVar = universalMapFragment.f304844F0;
                                if (jVar == null) {
                                    jVar = null;
                                }
                                jVar.O2();
                                UniversalMapBottomSheet[] universalMapBottomSheetArr = UniversalMapBottomSheet.f304836b;
                                com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
                                (nVar != null ? nVar : null).hide();
                                break;
                            default:
                                UniversalMapFragment.a aVar = UniversalMapFragment.f304838X0;
                                universalMapFragment.requireActivity().finish();
                                break;
                        }
                    }
                });
            }
            TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
            String title = toolbarSettings.getTitle();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
        } else {
            D6.w(toolbar);
        }
        this.f304860V0 = (RecyclerView) view.findViewById(R.id.universal_map_beduin_form_top_list);
        gj.k kVar = (gj.k) this.f304850L0.getValue();
        O0 o02 = this.f304840B0;
        kVar.l(((Q) o02.getValue()).f304811N);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            InterfaceC28373a interfaceC28373a = this.f304863o0;
            InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
            com.avito.android.universal_map.map.common.marker.a aVar = this.f304864p0;
            com.avito.android.universal_map.map.common.marker.a aVar2 = aVar != null ? aVar : null;
            AvitoMapAttachHelper avitoMapAttachHelper = this.f304865q0;
            C44641e c44641e = new C44641e(view, interfaceC28373a2, aVar2, avitoMapAttachHelper != null ? avitoMapAttachHelper : null, parentFragmentManager);
            c44641e.f428294j.observe(getViewLifecycleOwner(), new H.a(new F(this)));
            this.f304874z0 = c44641e;
        }
        Button button = (Button) view.findViewById(R.id.universal_map_filter_button);
        this.f304854P0 = button;
        Point point = (Point) view.findViewById(R.id.universal_map_filter_indicator);
        this.f304856R0 = point;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_pins_filter);
        UniversalMapParams universalMapParams2 = this.f304853O0;
        if ((universalMapParams2 != null ? universalMapParams2.f304740d : null) == null) {
            D6.w(button);
            D6.w(point);
            D6.w(viewGroup);
            this.f304856R0 = null;
            this.f304854P0 = null;
        } else {
            InterfaceC25659b interfaceC25659b = this.f304848J0;
            if (interfaceC25659b == null) {
                interfaceC25659b = null;
            }
            com.avito.android.universal_map.map.pin_filters.j jVar = this.f304844F0;
            if (jVar == null) {
                jVar = null;
            }
            InterfaceC39736a interfaceC39736aH1 = jVar.h1();
            com.avito.android.universal_map.map.tracker.c cVar2 = this.f304872x0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            this.f304845G0 = new com.avito.android.universal_map.map.pin_filters.h(view, interfaceC25659b, interfaceC39736aH1, cVar2);
            Drawable drawableH = C35835l0.h(R.attr.ic_filter20, button.getContext());
            if (drawableH != null) {
                button.setImageDrawable(drawableH);
            }
            D6.G(button, true);
            final int i13 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.universal_map.map.k

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragment f305234c;

                {
                    this.f305234c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UniversalMapFragment universalMapFragment = this.f305234c;
                    switch (i13) {
                        case 0:
                            com.avito.android.universal_map.map.pin_filters.j jVar2 = universalMapFragment.f304844F0;
                            if (jVar2 == null) {
                                jVar2 = null;
                            }
                            jVar2.O2();
                            UniversalMapBottomSheet[] universalMapBottomSheetArr = UniversalMapBottomSheet.f304836b;
                            com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
                            (nVar != null ? nVar : null).hide();
                            break;
                        default:
                            UniversalMapFragment.a aVar3 = UniversalMapFragment.f304838X0;
                            universalMapFragment.requireActivity().finish();
                            break;
                    }
                }
            });
        }
        UniversalMapParams universalMapParams3 = this.f304853O0;
        UniversalMapParams.PointInfoBottomSheetSettings pointInfoBottomSheetSettings = (universalMapParams3 == null || (mapSettings = universalMapParams3.f304742f) == null) ? null : mapSettings.f304753d;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.stub_universal_map_info_bottom_sheet);
        viewStub.setLayoutResource(pointInfoBottomSheetSettings != null ? R.layout.universal_map_info_bottom_sheet_v2 : R.layout.universal_map_info_bottom_sheet);
        viewStub.inflate();
        if (pointInfoBottomSheetSettings != null) {
            InterfaceC25659b interfaceC25659b2 = this.f304848J0;
            InterfaceC25659b interfaceC25659b3 = interfaceC25659b2 != null ? interfaceC25659b2 : null;
            com.avito.android.universal_map.map.point_info.n nVar = this.f304842D0;
            if (nVar == null) {
                nVar = null;
            }
            InterfaceC39736a interfaceC39736aH12 = nVar.h1();
            com.avito.android.util.text.a aVar3 = this.f304847I0;
            com.avito.android.util.text.a aVar4 = aVar3 != null ? aVar3 : null;
            com.avito.android.universal_map.map.tracker.c cVar3 = this.f304872x0;
            mVar = new com.avito.android.universal_map.map.point_info_v2.h(view, interfaceC25659b3, interfaceC39736aH12, aVar4, this, cVar3 != null ? cVar3 : null, pointInfoBottomSheetSettings);
        } else {
            InterfaceC25659b interfaceC25659b4 = this.f304848J0;
            InterfaceC25659b interfaceC25659b5 = interfaceC25659b4 != null ? interfaceC25659b4 : null;
            com.avito.android.universal_map.map.point_info.n nVar2 = this.f304842D0;
            if (nVar2 == null) {
                nVar2 = null;
            }
            InterfaceC39736a interfaceC39736aH13 = nVar2.h1();
            com.avito.android.util.text.a aVar5 = this.f304847I0;
            com.avito.android.util.text.a aVar6 = aVar5 != null ? aVar5 : null;
            com.avito.android.universal_map.map.tracker.c cVar4 = this.f304872x0;
            mVar = new com.avito.android.universal_map.map.point_info.m(view, interfaceC25659b5, interfaceC39736aH13, aVar6, this, cVar4 != null ? cVar4 : null);
        }
        mVar.b();
        this.f304843E0 = mVar;
        InterfaceC25659b interfaceC25659b6 = this.f304848J0;
        if (interfaceC25659b6 == null) {
            interfaceC25659b6 = null;
        }
        this.f304846H0 = new nG0.b(view, interfaceC25659b6, ((Q) o02.getValue()).f304811N.B0());
        com.avito.android.universal_map.map.point_info.n nVar3 = this.f304842D0;
        if (nVar3 == null) {
            nVar3 = null;
        }
        final int i14 = 2;
        nVar3.getF305892Z().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i14) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar = universalMapFragment.f304873y0;
                            (fVar != null ? fVar : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 3;
        nVar3.getF305891Y().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i15) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar = universalMapFragment.f304873y0;
                            (fVar != null ? fVar : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        nVar3.getF305893a0().observe(getViewLifecycleOwner(), new H.a(new r(this)));
        T t12 = this.f304841C0;
        if (t12 == null) {
            t12 = null;
        }
        final int i16 = 5;
        t12.getF305194W().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i16) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar = universalMapFragment.f304873y0;
                            (fVar != null ? fVar : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        t12.getF305195X().observe(getViewLifecycleOwner(), new H.a(new B(this)));
        t12.getF305196Y().observe(getViewLifecycleOwner(), new H.a(new C(this)));
        t12.getF305205h0().observe(getViewLifecycleOwner(), new H.a(new D(this)));
        final int i17 = 6;
        t12.getF305197Z().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i17) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar = universalMapFragment.f304873y0;
                            (fVar != null ? fVar : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        t12.getF305198a0().observe(getViewLifecycleOwner(), new H.a(new C35324l(this)));
        t12.getF305200c0().observe(getViewLifecycleOwner(), new H.a(new C35325m(this)));
        t12.getF305199b0().observe(getViewLifecycleOwner(), new H.a(new C35326n(this)));
        t12.getF305201d0().observe(getViewLifecycleOwner(), new H.a(new C35327o(this)));
        t12.getF305203f0().observe(getViewLifecycleOwner(), new H.a(new C35328p(this)));
        t12.getF305204g0().observe(getViewLifecycleOwner(), new H.a(new C35329q(this)));
        oG0.f fVar = this.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getF419674L().observe(getViewLifecycleOwner(), new Ba1.F(2, fVar, this));
        fVar.getF419684V().observe(getViewLifecycleOwner(), new H.a(new A(this)));
        final int i18 = 0;
        fVar.getF419683U().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i18) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar2 = universalMapFragment.f304873y0;
                            (fVar2 != null ? fVar2 : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i19 = 1;
        fVar.getF419682T().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i19) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar2 = universalMapFragment.f304873y0;
                            (fVar2 != null ? fVar2 : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        T t13 = this.f304841C0;
        if (t13 == null) {
            t13 = null;
        }
        com.avito.android.universal_map.map.pin_filters.j jVar2 = this.f304844F0;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.getF305787Z().observe(getViewLifecycleOwner(), new H.a(new E(this, t13)));
        final int i22 = 4;
        jVar2.getF305785X().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.universal_map.map.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragment f305230c;

            {
                this.f305230c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                C47291b c47291b;
                AvitoMapMarker avitoMapMarkerAddMarker;
                AvitoMap avitoMap;
                View view2;
                View view3;
                UniversalMapFragment universalMapFragment = this.f305230c;
                switch (i22) {
                    case 0:
                        if (((G0) obj) == null) {
                            UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.n nVar4 = universalMapFragment.f304842D0;
                            (nVar4 != null ? nVar4 : null).V7();
                            break;
                        }
                    case 1:
                        InterfaceC44640d.b bVar = (InterfaceC44640d.b) obj;
                        if (bVar == null) {
                            UniversalMapFragment.a aVar8 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            C44641e c44641e2 = universalMapFragment.f304874z0;
                            if (c44641e2 != null) {
                                InterfaceC44640d.b bVar2 = c44641e2.f419662q;
                                Set<InterfaceC44640d.a> setF = bVar.f419654a;
                                Iterator it = (bVar2 != null ? b1.f(bVar2.f419654a, setF) : B0.f406639b).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    LinkedHashMap linkedHashMap = c44641e2.f419661p;
                                    if (!zHasNext) {
                                        if (bVar2 != null) {
                                            setF = b1.f(setF, bVar2.f419654a);
                                        }
                                        for (InterfaceC44640d.a aVar9 : setF) {
                                            AvitoMap avitoMap2 = c44641e2.f428295k;
                                            if (avitoMap2 != null) {
                                                double latitude = aVar9.f419646b.getLatitude();
                                                double longitude = aVar9.f419646b.getLongitude();
                                                InterfaceC44640d.a.C12180a c12180a = aVar9.f419647c;
                                                avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, c12180a.f419650a, aVar9.f419648d, aVar9.f419649e, c12180a.f419653d, false);
                                            } else {
                                                avitoMapMarkerAddMarker = null;
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                avitoMapMarkerAddMarker.setData(aVar9.f419645a);
                                            }
                                            if (avitoMapMarkerAddMarker != null) {
                                                linkedHashMap.put(aVar9.f419645a, avitoMapMarkerAddMarker);
                                            }
                                        }
                                        AvitoMap avitoMap3 = c44641e2.f428295k;
                                        if (avitoMap3 != null && (c47291b = bVar.f419655b) != null) {
                                            boolean z12 = c47291b.f429140a;
                                            AvitoMapBounds avitoMapBounds = c47291b.f429141b;
                                            if (avitoMapBounds != null) {
                                                avitoMap3.moveTo(avitoMapBounds, z12);
                                            } else {
                                                AvitoMapPoint avitoMapPoint = c47291b.f429142c;
                                                if (avitoMapPoint != null) {
                                                    avitoMap3.moveTo(avitoMapPoint, z12, c47291b.f429143d);
                                                }
                                            }
                                        }
                                        Boolean bool = bVar.f419656c;
                                        if (bool != null) {
                                            boolean zBooleanValue = bool.booleanValue();
                                            com.avito.android.progress_overlay.l lVar = c44641e2.f419658m;
                                            if (zBooleanValue) {
                                                lVar.k(null);
                                            } else if (!lVar.d()) {
                                                lVar.j();
                                            }
                                        }
                                        c44641e2.f419662q = bVar;
                                        break;
                                    } else {
                                        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((InterfaceC44640d.a) it.next()).f419645a);
                                        if (avitoMapMarker != null && (avitoMap = c44641e2.f428295k) != null) {
                                            AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        g.a aVar10 = (g.a) obj;
                        if (aVar10 == null) {
                            UniversalMapFragment.a aVar11 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.point_info.g gVar = universalMapFragment.f304843E0;
                            if (gVar != null) {
                                gVar.f(aVar10);
                                break;
                            }
                        }
                        break;
                    case 3:
                        n.a aVar12 = (n.a) obj;
                        UniversalMapFragment.a aVar13 = UniversalMapFragment.f304838X0;
                        if (aVar12 != null && (view2 = universalMapFragment.getView()) != null) {
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, view2, aVar12.f305853a, 0, new e.b(aVar12.f305854b), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                    case 4:
                        g.a aVar14 = (g.a) obj;
                        if (aVar14 == null) {
                            UniversalMapFragment.a aVar15 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            com.avito.android.universal_map.map.pin_filters.h hVar = universalMapFragment.f304845G0;
                            if (hVar != null) {
                                boolean z13 = aVar14 instanceof g.a.C9391a;
                                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305738l;
                                if (z13) {
                                    hVar.f305743q = ((g.a.C9391a) aVar14).f305717a;
                                    com.avito.android.lib.util.b.a(bottomSheetBehavior);
                                    break;
                                } else {
                                    boolean z14 = aVar14 instanceof g.a.e;
                                    com.avito.android.progress_overlay.l lVar2 = hVar.f305732f;
                                    View view4 = hVar.f305733g;
                                    if (z14) {
                                        bottomSheetBehavior.b(4);
                                        lVar2.k(null);
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.c) {
                                        lVar2.a(com.avito.android.error.z.k(((g.a.c) aVar14).f305724a));
                                        D6.g(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.d) {
                                        lVar2.j();
                                        D6.H(view4);
                                        break;
                                    } else if (aVar14 instanceof g.a.b) {
                                        g.a.b bVar3 = (g.a.b) aVar14;
                                        hVar.f305735i.m(bVar3.f305719b);
                                        hVar.f305736j.m(bVar3.f305721d);
                                        hVar.f305737k.m(bVar3.f305723f);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        T.a aVar16 = (T.a) obj;
                        if (aVar16 == null) {
                            UniversalMapFragment.a aVar17 = UniversalMapFragment.f304838X0;
                            break;
                        } else {
                            oG0.f fVar2 = universalMapFragment.f304873y0;
                            (fVar2 != null ? fVar2 : null).yb(aVar16);
                            break;
                        }
                    default:
                        C47292c c47292c = (C47292c) obj;
                        UniversalMapFragment.a aVar18 = UniversalMapFragment.f304838X0;
                        if (c47292c != null && (view3 = universalMapFragment.getView()) != null) {
                            d.a aVar19 = com.avito.android.component.snackbar.d.f125235c;
                            e.b.f125239c.getClass();
                            d.a.b(aVar19, view3, c47292c.f429144a, 0, new e.b(c47292c.f429145b, c47292c.f429146c, null), null, 0, null, null, 0, 0, 2032).b();
                            break;
                        }
                        break;
                }
            }
        });
        jVar2.getF305784W().observe(getViewLifecycleOwner(), new L91.e(view, 9));
        com.avito.android.universal_map.map.tracker.c cVar5 = this.f304872x0;
        (cVar5 != null ? cVar5 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        InterfaceC42698a interfaceC42698a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            UniversalMapParams universalMapParams = (UniversalMapParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arg_universal_map_params", UniversalMapParams.class) : arguments.getParcelable("arg_universal_map_params"));
            if (universalMapParams != null) {
                Bundle arguments2 = getArguments();
                String string = arguments2 != null ? arguments2.getString("arg_actions_store_key") : null;
                this.f304853O0 = universalMapParams;
                com.avito.android.analytics.screens.D.f90335a.getClass();
                com.avito.android.analytics.screens.F fA2 = D.a.a();
                try {
                    interfaceC42698a = (InterfaceC42698a) C29972i.a(C29972i.b(this), InterfaceC42698a.class);
                } catch (MissingDependencyException unused) {
                    interfaceC42698a = C35311q.f305152a;
                }
                InterfaceC42698a interfaceC42698a2 = interfaceC42698a;
                InterfaceC35313t.a aVarA = C35298d.a();
                Context contextRequireContext = requireContext();
                InterfaceC39417a interfaceC39417aB = cv.c.b(this);
                InterfaceC35314u interfaceC35314u = (InterfaceC35314u) C29972i.a(C29972i.b(this), InterfaceC35314u.class);
                Resources resources = getResources();
                UniversalMapParams.MapSettings mapSettings = universalMapParams.f304742f;
                aVarA.a(contextRequireContext, resources, universalMapParams.f304738b, universalMapParams.f304739c, universalMapParams.f304740d, universalMapParams.f304743g, this, com.avito.android.analytics.screens.s.c(this), universalMapParams.f304744h, universalMapParams.f304745i, universalMapParams.f304746j, string, mapSettings != null ? mapSettings.f304752c : null, (String) this.f304862n0.getValue(), mapSettings, interfaceC39417aB, interfaceC42698a2, interfaceC35314u).a(this);
                s5();
                com.avito.android.universal_map.map.tracker.c cVar = this.f304872x0;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.a(fA2.b());
                com.avito.android.universal_map.map.tracker.c cVar2 = this.f304872x0;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                cVar2.c(this, g5());
                return;
            }
        }
        throw new IllegalStateException("UniversalMapParams is not set");
    }

    public final void r5() {
        com.avito.android.universal_map.map.point_info.g gVar = this.f304843E0;
        if (gVar != null && gVar.isVisible()) {
            com.avito.android.universal_map.map.point_info.n nVar = this.f304842D0;
            if (nVar == null) {
                nVar = null;
            }
            nVar.hide();
        }
        com.avito.android.universal_map.map.pin_filters.h hVar = this.f304845G0;
        if (hVar == null || hVar.f305738l.f355975L == 5) {
            return;
        }
        com.avito.android.universal_map.map.pin_filters.j jVar = this.f304844F0;
        (jVar != null ? jVar : null).T2(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.universal_map.n] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void s5() {
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                androidx.core.content.j jVarL1 = l1();
                if (!(jVarL1 instanceof com.avito.android.universal_map.n)) {
                    jVarL1 = null;
                }
                parentFragment = (com.avito.android.universal_map.n) jVarL1;
            } else if (parentFragment instanceof com.avito.android.universal_map.n) {
                break;
            } else {
                parentFragment = parentFragment.getParentFragment();
            }
        }
        com.avito.android.universal_map.n nVar = (com.avito.android.universal_map.n) parentFragment;
        if (nVar == null) {
            return;
        }
        com.avito.android.universal_map.map.tracker.c cVar = this.f304872x0;
        (cVar != null ? cVar : null).f305950d = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.universal_map.d] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // gj.i
    public final void t0() {
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                androidx.core.content.j jVarL1 = l1();
                if (!(jVarL1 instanceof com.avito.android.universal_map.d)) {
                    jVarL1 = null;
                }
                parentFragment = (com.avito.android.universal_map.d) jVarL1;
            } else if (parentFragment instanceof com.avito.android.universal_map.d) {
                break;
            } else {
                parentFragment = parentFragment.getParentFragment();
            }
        }
        com.avito.android.universal_map.d dVar = (com.avito.android.universal_map.d) parentFragment;
        if (dVar != null) {
            dVar.i2();
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }

    public final void t5() {
        InterfaceC43691a interfaceC43691a = this.f304868t0;
        if (interfaceC43691a == null) {
            interfaceC43691a = null;
        }
        FindLocationPage findLocationPage = FindLocationPage.f181725c;
        interfaceC43691a.e("universal_map");
        InterfaceC33034d interfaceC33034d = this.f304867s0;
        this.f304858T0.b((interfaceC33034d != null ? interfaceC33034d : null).g());
    }

    public final void u5(Throwable th2, boolean z12) {
        T t12 = this.f304841C0;
        if (t12 == null) {
            t12 = null;
        }
        oG0.f fVar = this.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        t12.ra(fVar.Rb(), z12);
        String message = th2.getMessage();
        if (message != null) {
            InterfaceC43691a interfaceC43691a = this.f304868t0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(null, message);
        }
        V2.f318762a.f(th2);
    }
}
