package com.avito.android.universal_map.map_mvi;

import Cd.C13243a;
import Y41.p;
import Zi.InterfaceC19564a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
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
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.component.toast.f;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.MapBounds;
import com.avito.android.di.C29972i;
import com.avito.android.di.MissingDependencyException;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.location.find.o;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.S;
import com.avito.android.universal_map.map.di.C35311q;
import com.avito.android.universal_map.map.di.InterfaceC35314u;
import com.avito.android.universal_map.map.mvi.entity.MapState;
import com.avito.android.universal_map.map.mvi.entity.a;
import com.avito.android.universal_map.map.mvi.entity.c;
import com.avito.android.universal_map.map_mvi.di.b;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import cv.InterfaceC39417a;
import dj.InterfaceC39736a;
import gj.n;
import gj.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import kj.InterfaceC42698a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lW.InterfaceC43691a;
import rG0.AbstractC47541a;
import rG0.InterfaceC47542b;
import z1.AbstractC50339a;

/* compiled from: UniversalMapFragmentMvi.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/UniversalMapFragmentMvi;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/universal_map/m;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/delivery_location_suggest/k;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalMapFragmentMvi extends BaseFragment implements com.avito.android.universal_map.m, InterfaceC33034d.b, InterfaceC33034d.c, com.avito.android.ui.fragments.c, com.avito.android.delivery_location_suggest.k, gj.i, InterfaceC28477j.b {

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final a f305959P0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.universal_map.map_mvi.point_info.b f305960A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.universal_map.map_mvi.point_filters.d f305961B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public nG0.b f305962C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public sG0.c f305963D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f305964E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f305965F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public n f305966G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final Object f305967H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.delivery_location_suggest.h f305968I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public Toolbar f305969J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public UniversalMapParams f305970K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f305971L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<DeliveryLocationSuggestParams> f305972M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f305973N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public String f305974O0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f305975n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f305976o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.common.marker.a f305977p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f305978q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f305979r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f305980s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC43691a f305981t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public o f305982u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.tracker.c f305983v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.map.mvi.reducer.a f305984w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC19564a f305985x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public S f305986y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final O0 f305987z0;

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/UniversalMapFragmentMvi$a;", "", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UniversalMapFragmentMvi.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$a$a, reason: collision with other inner class name */
        public static final class C9395a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UniversalMapParams f305988l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f305989m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9395a(UniversalMapParams universalMapParams, String str) {
                super(1);
                this.f305988l = universalMapParams;
                this.f305989m = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("arg_universal_map_params", this.f305988l);
                bundle2.putString("arg_actions_store_key", this.f305989m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UniversalMapFragmentMvi a(@Y61.k UniversalMapParams universalMapParams, @Y61.l String str) {
            UniversalMapFragmentMvi universalMapFragmentMvi = new UniversalMapFragmentMvi();
            C35966w1.a(universalMapFragmentMvi, -1, new C9395a(universalMapParams, str));
            return universalMapFragmentMvi;
        }

        public a() {
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.k> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            UniversalMapFragmentMvi universalMapFragmentMvi = UniversalMapFragmentMvi.this;
            n nVar = universalMapFragmentMvi.f305966G0;
            if (nVar == null) {
                nVar = null;
            }
            return gj.m.a(nVar, universalMapFragmentMvi);
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "newUserLocation", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Location location = (Location) obj;
            UniversalMapFragmentMvi universalMapFragmentMvi = UniversalMapFragmentMvi.this;
            InterfaceC43691a interfaceC43691a = universalMapFragmentMvi.f305981t0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(location, null);
            universalMapFragmentMvi.q5().accept(new AbstractC47541a.b.m(location.getLatitude(), location.getLongitude()));
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = UniversalMapFragmentMvi.f305959P0;
            UniversalMapFragmentMvi.this.s5((Throwable) obj, false);
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f305993l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1", f = "UniversalMapFragmentMvi.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305994q;

        /* compiled from: UniversalMapFragmentMvi.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1", f = "UniversalMapFragmentMvi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f305996q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UniversalMapFragmentMvi f305997r;

            /* compiled from: UniversalMapFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1$1", f = "UniversalMapFragmentMvi.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$a, reason: collision with other inner class name */
            public static final class C9396a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f305998q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragmentMvi f305999r;

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$a$a, reason: collision with other inner class name */
                public static final class C9397a extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, c.a> {

                    /* renamed from: l, reason: collision with root package name */
                    public static final C9397a f306000l = new C9397a();

                    public C9397a() {
                        super(1);
                    }

                    @Override // Y41.l
                    public final c.a invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        return eVar.f305596c.f305575d;
                    }
                }

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$a$b */
                public static final class b extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragmentMvi f306001l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(UniversalMapFragmentMvi universalMapFragmentMvi) {
                        super(1);
                        this.f306001l = universalMapFragmentMvi;
                    }

                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        c.a aVar = eVar.f305596c.f305575d;
                        com.avito.android.universal_map.map_mvi.point_info.b bVar = this.f306001l.f305960A0;
                        if (bVar != null) {
                            bVar.d(aVar);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9396a(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super C9396a> continuation) {
                    super(2, continuation);
                    this.f305999r = universalMapFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C9396a(this.f305999r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9396a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f305998q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f305999r;
                        InterfaceC43160i interfaceC43160iS = C43175k.s(universalMapFragmentMvi.q5().getState(), C9397a.f306000l);
                        com.avito.android.universal_map.map.tracker.c cVar = universalMapFragmentMvi.f305983v0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        b bVar = new b(universalMapFragmentMvi);
                        this.f305998q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, cVar, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: UniversalMapFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1$2", f = "UniversalMapFragmentMvi.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306002q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragmentMvi f306003r;

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lcom/avito/android/universal_map/map/mvi/entity/a;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)Lcom/avito/android/universal_map/map/mvi/entity/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$b$a, reason: collision with other inner class name */
                public static final class C9398a extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, com.avito.android.universal_map.map.mvi.entity.a> {

                    /* renamed from: l, reason: collision with root package name */
                    public static final C9398a f306004l = new C9398a();

                    public C9398a() {
                        super(1);
                    }

                    @Override // Y41.l
                    public final com.avito.android.universal_map.map.mvi.entity.a invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        return eVar.f305595b;
                    }
                }

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$b$b, reason: collision with other inner class name */
                public static final class C9399b extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragmentMvi f306005l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C9399b(UniversalMapFragmentMvi universalMapFragmentMvi) {
                        super(1);
                        this.f306005l = universalMapFragmentMvi;
                    }

                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306005l;
                        com.avito.android.universal_map.map.mvi.entity.a aVar2 = eVar.f305595b;
                        if (aVar2 instanceof a.C9378a) {
                            a.C9378a c9378a = (a.C9378a) aVar2;
                            universalMapFragmentMvi.f305974O0 = c9378a.f305555a;
                            nG0.b bVar = universalMapFragmentMvi.f305962C0;
                            if (bVar != null) {
                                bVar.f414970d.m(c9378a.f305556b);
                            }
                        } else {
                            L.f(aVar2, a.b.f305557a);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f306003r = universalMapFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f306003r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306002q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306003r;
                        InterfaceC43160i interfaceC43160iS = C43175k.s(universalMapFragmentMvi.q5().getState(), C9398a.f306004l);
                        com.avito.android.universal_map.map.tracker.c cVar = universalMapFragmentMvi.f305983v0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        C9399b c9399b = new C9399b(universalMapFragmentMvi);
                        this.f306002q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, cVar, c9399b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: UniversalMapFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1$3", f = "UniversalMapFragmentMvi.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306006q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragmentMvi f306007r;

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lcom/avito/android/universal_map/map/mvi/entity/b;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)Lcom/avito/android/universal_map/map/mvi/entity/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$c$a, reason: collision with other inner class name */
                public static final class C9400a extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, com.avito.android.universal_map.map.mvi.entity.b> {

                    /* renamed from: l, reason: collision with root package name */
                    public static final C9400a f306008l = new C9400a();

                    public C9400a() {
                        super(1);
                    }

                    @Override // Y41.l
                    public final com.avito.android.universal_map.map.mvi.entity.b invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        return eVar.f305597d;
                    }
                }

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class b extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragmentMvi f306009l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(UniversalMapFragmentMvi universalMapFragmentMvi) {
                        super(1);
                        this.f306009l = universalMapFragmentMvi;
                    }

                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        com.avito.android.universal_map.map.mvi.entity.e eVar2 = eVar;
                        com.avito.android.universal_map.map_mvi.point_filters.d dVar = this.f306009l.f305961B0;
                        if (dVar != null) {
                            dVar.b(eVar2.f305597d);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f306007r = universalMapFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f306007r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306006q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306007r;
                        InterfaceC43160i interfaceC43160iS = C43175k.s(universalMapFragmentMvi.q5().getState(), C9400a.f306008l);
                        com.avito.android.universal_map.map.tracker.c cVar = universalMapFragmentMvi.f305983v0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        b bVar = new b(universalMapFragmentMvi);
                        this.f306006q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, cVar, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: UniversalMapFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1$4", f = "UniversalMapFragmentMvi.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
            public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306010q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragmentMvi f306011r;

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lcom/avito/android/universal_map/map/mvi/entity/MapState$a;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)Lcom/avito/android/universal_map/map/mvi/entity/MapState$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$d$a, reason: collision with other inner class name */
                public static final class C9401a extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, MapState.a> {

                    /* renamed from: l, reason: collision with root package name */
                    public static final C9401a f306012l = new C9401a();

                    public C9401a() {
                        super(1);
                    }

                    @Override // Y41.l
                    public final MapState.a invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        return eVar.f305599f.f305453f;
                    }
                }

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/mvi/entity/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class b extends N implements Y41.l<com.avito.android.universal_map.map.mvi.entity.e, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragmentMvi f306013l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(UniversalMapFragmentMvi universalMapFragmentMvi) {
                        super(1);
                        this.f306013l = universalMapFragmentMvi;
                    }

                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.universal_map.map.mvi.entity.e eVar) {
                        AvitoMapMarker avitoMapMarkerAddMarker;
                        AvitoMap avitoMap;
                        MapState.a aVar = eVar.f305599f.f305453f;
                        sG0.c cVar = this.f306013l.f305963D0;
                        if (cVar != null) {
                            Set<MapState.b> set = cVar.f437562k;
                            Set<MapState.b> set2 = set;
                            boolean zIsEmpty = set2.isEmpty();
                            Set<MapState.b> set3 = aVar.f305458a;
                            Object objF = !zIsEmpty ? b1.f(set, set3) : B0.f406639b;
                            Set<MapState.b> setF = !set2.isEmpty() ? b1.f(set3, set) : set3;
                            MapState.Diff diff = MapState.Diff.f305455c;
                            Map mapG = P0.g(new Q(diff, objF), new Q(MapState.Diff.f305454b, setF));
                            Set set4 = (Set) mapG.get(diff);
                            LinkedHashMap linkedHashMap = cVar.f437561j;
                            if (set4 != null) {
                                Iterator it = set4.iterator();
                                while (it.hasNext()) {
                                    AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.remove(((MapState.b) it.next()).f305467a);
                                    if (avitoMapMarker != null && (avitoMap = cVar.f437560i) != null) {
                                        AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
                                    }
                                }
                            }
                            Set<MapState.b> set5 = (Set) mapG.get(MapState.Diff.f305454b);
                            if (set5 != null) {
                                for (MapState.b bVar : set5) {
                                    AvitoMap avitoMap2 = cVar.f437560i;
                                    if (avitoMap2 != null) {
                                        double latitude = bVar.f305468b.getLatitude();
                                        double longitude = bVar.f305468b.getLongitude();
                                        MapState.b.a aVar2 = bVar.f305469c;
                                        avitoMapMarkerAddMarker = avitoMap2.addMarker(latitude, longitude, aVar2.f305472a, bVar.f305470d, bVar.f305471e, aVar2.f305473b, false);
                                    } else {
                                        avitoMapMarkerAddMarker = null;
                                    }
                                    if (avitoMapMarkerAddMarker != null) {
                                        avitoMapMarkerAddMarker.setZIndex(bVar.f305471e);
                                        String str = bVar.f305467a;
                                        avitoMapMarkerAddMarker.setData(str);
                                        linkedHashMap.put(str, avitoMapMarkerAddMarker);
                                    }
                                }
                            }
                            com.avito.android.progress_overlay.l lVar = cVar.f437557f;
                            if (aVar.f305461d) {
                                lVar.k(null);
                            } else if (!lVar.d()) {
                                lVar.j();
                            }
                            D6.G(cVar.f437558g, aVar.f305464g == null);
                            cVar.f437562k = set3;
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f306011r = universalMapFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new d(this.f306011r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306010q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306011r;
                        InterfaceC43160i interfaceC43160iS = C43175k.s(universalMapFragmentMvi.q5().getState(), C9401a.f306012l);
                        com.avito.android.universal_map.map.tracker.c cVar = universalMapFragmentMvi.f305983v0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        b bVar = new b(universalMapFragmentMvi);
                        this.f306010q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, cVar, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: UniversalMapFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$onCreateView$1$1$5", f = "UniversalMapFragmentMvi.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
            public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306014q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalMapFragmentMvi f306015r;

                /* compiled from: UniversalMapFragmentMvi.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi$f$a$e$a, reason: collision with other inner class name */
                public /* synthetic */ class C9402a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UniversalMapFragmentMvi f306016b;

                    public C9402a(UniversalMapFragmentMvi universalMapFragmentMvi) {
                        this.f306016b = universalMapFragmentMvi;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        AvitoMap avitoMap;
                        AvitoMapTarget mapTarget;
                        AvitoMapPoint point;
                        com.avito.android.universal_map.map_mvi.point_info.b bVar;
                        InterfaceC47542b interfaceC47542b = (InterfaceC47542b) obj;
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306016b;
                        dValueOf = null;
                        dValueOf = null;
                        dValueOf = null;
                        dValueOf = null;
                        Double dValueOf = null;
                        if (interfaceC47542b instanceof InterfaceC47542b.h) {
                            InterfaceC47542b.h hVar = (InterfaceC47542b.h) interfaceC47542b;
                            com.avito.android.component.toast.b.c(universalMapFragmentMvi, z.k(hVar.f429709a), null, new f.c(hVar.f429709a), 382);
                        } else if (interfaceC47542b instanceof InterfaceC47542b.g) {
                            View view = universalMapFragmentMvi.getView();
                            if (view != null) {
                                InterfaceC47542b.g gVar = (InterfaceC47542b.g) interfaceC47542b;
                                d.a.b(com.avito.android.component.snackbar.d.f125235c, view, z.k(gVar.f429708a), 0, new e.b(gVar.f429708a), null, 0, null, null, 0, 0, 2032).b();
                            }
                        } else if (interfaceC47542b instanceof InterfaceC47542b.f) {
                            com.avito.android.universal_map.map_mvi.point_filters.d dVar = universalMapFragmentMvi.f305961B0;
                            if (dVar != null) {
                                dVar.d(((InterfaceC47542b.f) interfaceC47542b).f429707a);
                            }
                        } else if (interfaceC47542b instanceof InterfaceC47542b.c) {
                            sG0.c cVar = universalMapFragmentMvi.f305963D0;
                            if (cVar != null) {
                                InterfaceC47542b.c cVar2 = (InterfaceC47542b.c) interfaceC47542b;
                                AvitoMapPoint avitoMapPoint = cVar2.f429701a;
                                if (((!cVar2.f429704d || (bVar = universalMapFragmentMvi.f305960A0) == null) ? null : Integer.valueOf(bVar.a())) != null && (avitoMap = cVar.f437560i) != null && (mapTarget = avitoMap.getMapTarget()) != null && (point = mapTarget.getPoint()) != null) {
                                    Point point2 = new Point(cVar.f437553b.getWidth() / 2, ((int) ((cVar.f437559h.getHeight() - r2.intValue()) * 1.2d)) / 2);
                                    AvitoMap avitoMap2 = cVar.f437560i;
                                    AvitoMapPoint avitoMapPointFromScreenLocation = avitoMap2 != null ? avitoMap2.fromScreenLocation(point2) : null;
                                    if (avitoMapPointFromScreenLocation != null) {
                                        dValueOf = Double.valueOf(avitoMapPointFromScreenLocation.getLatitude() - point.getLatitude());
                                    }
                                }
                                if (dValueOf != null) {
                                    avitoMapPoint = new AvitoMapPoint(avitoMapPoint.getLatitude() - dValueOf.doubleValue(), avitoMapPoint.getLongitude(), null, 4, null);
                                }
                                AvitoMap avitoMap3 = cVar.f437560i;
                                if (avitoMap3 != null) {
                                    avitoMap3.moveTo(avitoMapPoint, cVar2.f429702b, cVar2.f429703c);
                                }
                            }
                        } else if (interfaceC47542b instanceof InterfaceC47542b.C12366b) {
                            sG0.c cVar3 = universalMapFragmentMvi.f305963D0;
                            if (cVar3 != null) {
                                AvitoMapBounds avitoMapBounds = ((InterfaceC47542b.C12366b) interfaceC47542b).f429700a;
                                AvitoMap avitoMap4 = cVar3.f437560i;
                                if (avitoMap4 != null) {
                                    avitoMap4.moveTo(avitoMapBounds, false);
                                }
                            }
                        } else if (interfaceC47542b instanceof InterfaceC47542b.a) {
                            com.avito.android.universal_map.map_mvi.point_info.b bVar2 = universalMapFragmentMvi.f305960A0;
                            if (bVar2 != null) {
                                bVar2.k2();
                            }
                        } else if (interfaceC47542b instanceof InterfaceC47542b.l) {
                            universalMapFragmentMvi.q5().accept(AbstractC47541a.b.k.f429687a);
                        } else if (interfaceC47542b instanceof InterfaceC47542b.j) {
                            universalMapFragmentMvi.q5().accept(AbstractC47541a.f.f429698a);
                        } else if (interfaceC47542b instanceof InterfaceC47542b.k) {
                            universalMapFragmentMvi.q5().accept(new AbstractC47541a.b.j(((InterfaceC47542b.k) interfaceC47542b).f429712a));
                        } else {
                            boolean zF2 = L.f(interfaceC47542b, InterfaceC47542b.i.f429710a);
                            io.reactivex.rxjava3.disposables.c cVar4 = universalMapFragmentMvi.f305971L0;
                            if (zF2) {
                                InterfaceC33034d interfaceC33034d = universalMapFragmentMvi.f305980s0;
                                cVar4.b((interfaceC33034d != null ? interfaceC33034d : null).h());
                            } else if (L.f(interfaceC47542b, InterfaceC47542b.e.f429706a)) {
                                InterfaceC43691a interfaceC43691a = universalMapFragmentMvi.f305981t0;
                                if (interfaceC43691a == null) {
                                    interfaceC43691a = null;
                                }
                                FindLocationPage findLocationPage = FindLocationPage.f181725c;
                                interfaceC43691a.e("universal_map");
                                InterfaceC33034d interfaceC33034d2 = universalMapFragmentMvi.f305980s0;
                                cVar4.b((interfaceC33034d2 != null ? interfaceC33034d2 : null).g());
                            } else if (L.f(interfaceC47542b, InterfaceC47542b.d.f429705a)) {
                                universalMapFragmentMvi.q5().accept(AbstractC47541a.d.b.f429696a);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f306016b, UniversalMapFragmentMvi.class, "handleEvent", "handleEvent(Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f306015r = universalMapFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new e(this.f306015r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306014q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalMapFragmentMvi.f305959P0;
                        UniversalMapFragmentMvi universalMapFragmentMvi = this.f306015r;
                        com.avito.android.universal_map.map.Q qQ5 = universalMapFragmentMvi.q5();
                        C9402a c9402a = new C9402a(universalMapFragmentMvi);
                        this.f306014q = 1;
                        if (qQ5.ke(c9402a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UniversalMapFragmentMvi universalMapFragmentMvi, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f305997r = universalMapFragmentMvi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f305997r, continuation);
                aVar.f305996q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f305996q;
                UniversalMapFragmentMvi universalMapFragmentMvi = this.f305997r;
                C43259k.d(t12, null, null, new C9396a(universalMapFragmentMvi, null), 3);
                C43259k.d(t12, null, null, new b(universalMapFragmentMvi, null), 3);
                C43259k.d(t12, null, null, new c(universalMapFragmentMvi, null), 3);
                C43259k.d(t12, null, null, new d(universalMapFragmentMvi, null), 3);
                C43259k.d(t12, null, null, new e(universalMapFragmentMvi, null), 3);
                return G0.f406611a;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return UniversalMapFragmentMvi.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305994q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                UniversalMapFragmentMvi universalMapFragmentMvi = UniversalMapFragmentMvi.this;
                a aVar = new a(universalMapFragmentMvi, null);
                this.f305994q = 1;
                if (C23056p0.b(universalMapFragmentMvi, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrG0/a;", "it", "Lkotlin/G0;", "invoke", "(LrG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<AbstractC47541a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC47541a abstractC47541a) {
            a aVar = UniversalMapFragmentMvi.f305959P0;
            UniversalMapFragmentMvi.this.q5().accept(abstractC47541a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f306018l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f306018l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f306018l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UniversalMapFragmentMvi.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f306020l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f306020l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f306020l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306021l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306021l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f306021l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306022l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306022l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f306022l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UniversalMapFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/Q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/universal_map/map/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.universal_map.map.Q> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.universal_map.map.Q invoke() {
            S s5 = UniversalMapFragmentMvi.this.f305986y0;
            if (s5 == null) {
                s5 = null;
            }
            return (com.avito.android.universal_map.map.Q) s5.get();
        }
    }

    public UniversalMapFragmentMvi() {
        super(R.layout.fragment_universal_map);
        this.f305975n0 = C42727D.c(e.f305993l);
        h hVar = new h(new m());
        i iVar = new i();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new j(iVar));
        this.f305987z0 = new O0(m0.f406844a.b(com.avito.android.universal_map.map.Q.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f305967H0 = C42727D.b(lazyThreadSafetyMode, new b());
        this.f305971L0 = new io.reactivex.rxjava3.disposables.c();
        this.f305972M0 = registerForActivityResult(new com.avito.android.delivery_location_suggest.b(this), new com.avito.android.str_seller_orders.orders_seller.a(this, 2));
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new Q(this.f305974O0, this.f305973N0));
        com.avito.android.universal_map.map_mvi.point_info.b bVar = this.f305960A0;
        if (bVar != null) {
            linkedHashMapJ.putAll(bVar.c());
        }
        com.avito.android.universal_map.map_mvi.point_filters.d dVar = this.f305961B0;
        if (dVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f306264p;
            if (str2 != null) {
            }
            String str3 = dVar.f306265q;
            if (str3 != null) {
            }
            String str4 = dVar.f306266r;
            if (str4 != null) {
                linkedHashMap.put(str4, dVar.f306261m);
            }
            linkedHashMapJ.putAll(linkedHashMap);
        }
        return (RecyclerView) linkedHashMapJ.get(str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        o oVar = this.f305982u0;
        if (oVar == null) {
            oVar = null;
        }
        io.reactivex.rxjava3.core.z zVarB = oVar.b(requireActivity(), (4 & 2) == 0, (4 & 4) == 0);
        c cVar = new c();
        d dVar = new d();
        zVarB.getClass();
        this.f305971L0.b(zVarB.v0(cVar, dVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f305979r0;
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
        Toolbar toolbar = this.f305969J0;
        UniversalMapParams universalMapParams = this.f305970K0;
        return new gj.o(new o.a(requireView(), ToastBarPosition.f181047e), ((universalMapParams != null ? universalMapParams.f304741e : null) == null || toolbar == null) ? new o.a(requireView(), ToastBarPosition.f181047e) : new o.a(toolbar, ToastBarPosition.f181045c));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        s5(new Throwable(str), false);
    }

    @Override // com.avito.android.delivery_location_suggest.k
    @Y61.k
    public final com.avito.android.delivery_location_suggest.h e1() {
        com.avito.android.delivery_location_suggest.h hVar = this.f305968I0;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        s5(new Throwable("PERMISSION DENIED"), true);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        com.avito.android.universal_map.map_mvi.point_info.b bVar = this.f305960A0;
        if (bVar != null ? bVar.isVisible() : false) {
            q5().accept(AbstractC47541a.c.b.f429693a);
        } else {
            com.avito.android.universal_map.map_mvi.point_filters.d dVar = this.f305961B0;
            if (dVar == null || !dVar.f306253e || dVar.f306270v.f355975L == 5) {
                return false;
            }
            q5().accept(new AbstractC47541a.AbstractC12359a.c());
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
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@Y61.k Menu menu, @Y61.k MenuInflater menuInflater) {
        UniversalMapParams.ToolbarSettings toolbarSettings;
        super.onCreateOptionsMenu(menu, menuInflater);
        UniversalMapParams universalMapParams = this.f305970K0;
        if (universalMapParams == null || (toolbarSettings = universalMapParams.f304741e) == null || toolbarSettings.getHideSearchAddress()) {
            return;
        }
        menuInflater.inflate(R.menu.menu_universal_map, menu);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.universal_map.map.tracker.c cVar = this.f305983v0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new f(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        sG0.c cVar = this.f305963D0;
        if (cVar != null) {
            cVar.f437560i = null;
        }
        this.f305969J0 = null;
        this.f305963D0 = null;
        this.f305960A0 = null;
        this.f305961B0 = null;
        this.f305962C0 = null;
        InterfaceC33034d interfaceC33034d = this.f305980s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        com.avito.android.universal_map.map.tracker.c cVar2 = this.f305983v0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.f305950d = null;
        Iterator<T> it = q5().f304812O.iterator();
        while (it.hasNext()) {
            ((com.avito.android.universal_map.map.mvi.reducer.d) it.next()).a();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        AvitoMap avitoMap;
        super.onLowMemory();
        sG0.c cVar = this.f305963D0;
        if (cVar == null || (avitoMap = cVar.f437560i) == null) {
            return;
        }
        avitoMap.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        AvitoMapBounds avitoMapBoundsA;
        if (menuItem.getItemId() != R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        }
        sG0.c cVar = this.f305963D0;
        if (cVar != null && (avitoMapBoundsA = cVar.a()) != null) {
            this.f305972M0.b(new DeliveryLocationSuggestParams.Bounds(new MapBounds(new com.avito.android.delivery_location_suggest.Point(avitoMapBoundsA.getTopLeft().getLatitude(), avitoMapBoundsA.getTopLeft().getLongitude()), new com.avito.android.delivery_location_suggest.Point(avitoMapBoundsA.getBottomRight().getLatitude(), avitoMapBoundsA.getBottomRight().getLongitude())), null, 2, 0 == true ? 1 : 0));
        }
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC43691a interfaceC43691a = this.f305981t0;
        if (interfaceC43691a == null) {
            interfaceC43691a = null;
        }
        interfaceC43691a.g();
        com.avito.android.location.find.o oVar = this.f305982u0;
        (oVar != null ? oVar : null).c(requireContext());
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.location.find.o oVar = this.f305982u0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(requireContext());
        com.avito.android.universal_map.map.Q qQ5 = q5();
        InterfaceC19564a interfaceC19564a = this.f305985x0;
        qQ5.accept(new AbstractC47541a.e(interfaceC19564a != null ? interfaceC19564a : null));
        q5().accept(AbstractC47541a.f.f429698a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        sG0.c cVar = this.f305963D0;
        if (cVar != null) {
            AvitoMap avitoMap = cVar.f437560i;
            if (avitoMap != null) {
                avitoMap.onStart();
            }
            cVar.b();
        }
        InterfaceC33034d interfaceC33034d = this.f305980s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f305980s0;
            (interfaceC33034d2 != null ? interfaceC33034d2 : null).e(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f305980s0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        this.f305971L0.e();
        sG0.c cVar = this.f305963D0;
        if (cVar != null) {
            AvitoMap avitoMap = cVar.f437560i;
            if (avitoMap != null) {
                AvitoMap.DefaultImpls.onStop$default(avitoMap, false, 1, null);
            }
            cVar.f437561j.clear();
            cVar.f437562k = B0.f406639b;
            ((com.avito.android.universal_map.map_mvi.d) cVar.f437556e).invoke(AbstractC47541a.b.d.f429679a);
        }
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        com.avito.android.universal_map.map_mvi.point_info.b gVar;
        UniversalMapParams.MapSettings mapSettings;
        super.onViewCreated(view, bundle);
        com.avito.android.universal_map.map.tracker.c cVar = this.f305983v0;
        if (cVar == null) {
            cVar = null;
        }
        ScreenPerformanceTracker.a.b(cVar, null, 3);
        r5();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f305969J0 = toolbar;
        UniversalMapParams universalMapParams = this.f305970K0;
        UniversalMapParams.ToolbarSettings toolbarSettings = universalMapParams != null ? universalMapParams.f304741e : null;
        if (toolbarSettings != null) {
            o5(toolbar);
            C35966w1.c(this).w(null);
            Toolbar toolbar2 = this.f305969J0;
            if (toolbar2 != null) {
                toolbar2.setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 18));
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
        this.f305973N0 = (RecyclerView) view.findViewById(R.id.universal_map_beduin_form_top_list);
        ((gj.k) this.f305967H0.getValue()).l(q5().f304811N);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            com.avito.android.universal_map.map.common.marker.a aVar = this.f305977p0;
            com.avito.android.universal_map.map.common.marker.a aVar2 = aVar != null ? aVar : null;
            AvitoMapAttachHelper avitoMapAttachHelper = this.f305978q0;
            AvitoMapAttachHelper avitoMapAttachHelper2 = avitoMapAttachHelper != null ? avitoMapAttachHelper : null;
            com.avito.android.universal_map.map_mvi.d dVar = new com.avito.android.universal_map.map_mvi.d(this);
            InterfaceC28373a interfaceC28373a = this.f305976o0;
            sG0.c cVar2 = new sG0.c(view, aVar2, avitoMapAttachHelper2, parentFragmentManager, dVar, interfaceC28373a != null ? interfaceC28373a : null);
            this.f305963D0 = cVar2;
            if (cVar2.f437560i == null) {
                avitoMapAttachHelper2.setMapAttachedListener(cVar2);
                avitoMapAttachHelper2.attachView(R.id.map, view, parentFragmentManager);
            }
        }
        InterfaceC25659b interfaceC25659b = this.f305965F0;
        InterfaceC25659b interfaceC25659b2 = interfaceC25659b != null ? interfaceC25659b : null;
        InterfaceC39736a interfaceC39736aB0 = q5().f304811N.B0();
        com.avito.android.universal_map.map.tracker.c cVar3 = this.f305983v0;
        com.avito.android.universal_map.map.tracker.c cVar4 = cVar3 != null ? cVar3 : null;
        UniversalMapParams universalMapParams2 = this.f305970K0;
        this.f305961B0 = new com.avito.android.universal_map.map_mvi.point_filters.d(view, interfaceC25659b2, interfaceC39736aB0, cVar4, (universalMapParams2 != null ? universalMapParams2.f304740d : null) != null, new com.avito.android.universal_map.map_mvi.c(this));
        UniversalMapParams universalMapParams3 = this.f305970K0;
        UniversalMapParams.PointInfoBottomSheetSettings pointInfoBottomSheetSettings = (universalMapParams3 == null || (mapSettings = universalMapParams3.f304742f) == null) ? null : mapSettings.f304753d;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.stub_universal_map_info_bottom_sheet);
        viewStub.setLayoutResource(pointInfoBottomSheetSettings != null ? R.layout.universal_map_info_bottom_sheet_v2 : R.layout.universal_map_info_bottom_sheet);
        viewStub.inflate();
        if (pointInfoBottomSheetSettings != null) {
            InterfaceC25659b interfaceC25659b3 = this.f305965F0;
            InterfaceC25659b interfaceC25659b4 = interfaceC25659b3 != null ? interfaceC25659b3 : null;
            InterfaceC39736a interfaceC39736aB02 = q5().f304811N.B0();
            com.avito.android.util.text.a aVar3 = this.f305964E0;
            com.avito.android.util.text.a aVar4 = aVar3 != null ? aVar3 : null;
            com.avito.android.universal_map.map.tracker.c cVar5 = this.f305983v0;
            gVar = new com.avito.android.universal_map.map_mvi.point_info.o(view, interfaceC25659b4, interfaceC39736aB02, aVar4, this, cVar5 != null ? cVar5 : null, pointInfoBottomSheetSettings, new com.avito.android.universal_map.map_mvi.a(this));
        } else {
            InterfaceC25659b interfaceC25659b5 = this.f305965F0;
            InterfaceC25659b interfaceC25659b6 = interfaceC25659b5 != null ? interfaceC25659b5 : null;
            InterfaceC39736a interfaceC39736aB03 = q5().f304811N.B0();
            com.avito.android.util.text.a aVar5 = this.f305964E0;
            com.avito.android.util.text.a aVar6 = aVar5 != null ? aVar5 : null;
            com.avito.android.universal_map.map.tracker.c cVar6 = this.f305983v0;
            gVar = new com.avito.android.universal_map.map_mvi.point_info.g(view, interfaceC25659b6, interfaceC39736aB03, aVar6, this, cVar6 != null ? cVar6 : null, new com.avito.android.universal_map.map_mvi.b(this));
        }
        gVar.b();
        this.f305960A0 = gVar;
        InterfaceC25659b interfaceC25659b7 = this.f305965F0;
        if (interfaceC25659b7 == null) {
            interfaceC25659b7 = null;
        }
        this.f305962C0 = new nG0.b(view, interfaceC25659b7, q5().f304811N.B0());
        for (com.avito.android.universal_map.map.mvi.reducer.d dVar2 : q5().f304812O) {
            com.avito.android.universal_map.map.mvi.reducer.a aVar7 = this.f305984w0;
            if (aVar7 == null) {
                aVar7 = null;
            }
            dVar2.b(aVar7);
        }
        com.avito.android.universal_map.map.tracker.c cVar7 = this.f305983v0;
        (cVar7 != null ? cVar7 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        UniversalMapParams universalMapParams;
        InterfaceC42698a interfaceC42698a;
        Bundle arguments = getArguments();
        if (arguments == null || (universalMapParams = (UniversalMapParams) arguments.getParcelable("arg_universal_map_params")) == null) {
            throw new IllegalStateException("UniversalMapParams is not set");
        }
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("arg_actions_store_key") : null;
        this.f305970K0 = universalMapParams;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        try {
            interfaceC42698a = (InterfaceC42698a) C29972i.a(C29972i.b(this), InterfaceC42698a.class);
        } catch (MissingDependencyException unused) {
            interfaceC42698a = C35311q.f305152a;
        }
        InterfaceC42698a interfaceC42698a2 = interfaceC42698a;
        b.a aVarA = com.avito.android.universal_map.map_mvi.di.a.a();
        Context contextRequireContext = requireContext();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        InterfaceC35314u interfaceC35314u = (InterfaceC35314u) C29972i.a(C29972i.b(this), InterfaceC35314u.class);
        Resources resources = getResources();
        UniversalMapParams.MapSettings mapSettings = universalMapParams.f304742f;
        aVarA.a(contextRequireContext, resources, universalMapParams.f304738b, universalMapParams.f304739c, universalMapParams.f304740d, universalMapParams.f304743g, this, s.c(this), universalMapParams.f304744h, universalMapParams.f304745i, universalMapParams.f304746j, string, mapSettings != null ? mapSettings.f304752c : null, (String) this.f305975n0.getValue(), mapSettings, new g(), interfaceC39417aB, interfaceC42698a2, interfaceC35314u).a(this);
        r5();
        com.avito.android.universal_map.map.tracker.c cVar = this.f305983v0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(fA2.b());
        com.avito.android.universal_map.map.tracker.c cVar2 = this.f305983v0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.c(this, g5());
    }

    public final com.avito.android.universal_map.map.Q q5() {
        return (com.avito.android.universal_map.map.Q) this.f305987z0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.universal_map.n] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void r5() {
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
        com.avito.android.universal_map.map.tracker.c cVar = this.f305983v0;
        (cVar != null ? cVar : null).f305950d = nVar;
    }

    public final void s5(Throwable th2, boolean z12) {
        q5().accept(new AbstractC47541a.b.n(z12));
        String message = th2.getMessage();
        if (message != null) {
            InterfaceC43691a interfaceC43691a = this.f305981t0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(null, message);
        }
        V2.f318762a.f(th2);
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
}
