package com.avito.android.select.new_districts;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.SelectResult;
import com.avito.android.select.new_districts.mvi.m;
import com.avito.android.select.new_districts.mvi.n;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35968w3;
import eq0.InterfaceC40147b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: SelectDistrictFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/SelectDistrictFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Companion", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState;", VoiceInfo.STATE, "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectDistrictFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public n f265666t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f265667u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f265668v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C35968w3 f265669w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f265670x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final NavigationState f265671y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f265672z0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f265665B0 = {m0.f406844a.e(new Y(SelectDistrictFragment.class, "openParams", "getOpenParams()Lcom/avito/android/select/new_districts/SelectDistrictParams;", 0))};

    /* renamed from: A0, reason: collision with root package name */
    @k
    public static final Companion f265664A0 = new Companion(null);

    /* compiled from: SelectDistrictFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/select/new_districts/SelectDistrictFragment$Companion;", "", "<init>", "()V", "", "CONTENT_TYPE_DISTRICTS", "Ljava/lang/String;", "SELECT_DISTRICT_SCREEN_NAME", "SelectDistrictScreen", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: SelectDistrictFragment.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_districts/SelectDistrictFragment$Companion$SelectDistrictScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @I60.b
        @K51.d
        public static final class SelectDistrictScreen extends Screen {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final SelectDistrictScreen f265673d = new SelectDistrictScreen();

            @k
            public static final Parcelable.Creator<SelectDistrictScreen> CREATOR = new a();

            /* compiled from: SelectDistrictFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SelectDistrictScreen> {
                @Override // android.os.Parcelable.Creator
                public final SelectDistrictScreen createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return SelectDistrictScreen.f265673d;
                }

                @Override // android.os.Parcelable.Creator
                public final SelectDistrictScreen[] newArray(int i12) {
                    return new SelectDistrictScreen[i12];
                }
            }

            public SelectDistrictScreen() {
                super("DistrictPicker", false, 2, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: SelectDistrictFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = SelectDistrictFragment.this.f265668v0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: SelectDistrictFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f265675l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SelectDistrictFragment f265676m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComposeView composeView, SelectDistrictFragment selectDistrictFragment) {
            super(2);
            this.f265675l = composeView;
            this.f265676m = selectDistrictFragment;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f265675l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                Companion companion = SelectDistrictFragment.f265664A0;
                SelectDistrictFragment selectDistrictFragment = this.f265676m;
                com.akita.compose.theme.re23.c.a(false, r.c(-797851630, new com.avito.android.select.new_districts.c(selectDistrictFragment, C22126m3.b(((m) selectDistrictFragment.f265667u0.getValue()).getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements p<InterfaceC40147b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC40147b interfaceC40147b, Continuation<? super G0> continuation) {
            InterfaceC40147b interfaceC40147b2 = interfaceC40147b;
            SelectDistrictFragment selectDistrictFragment = (SelectDistrictFragment) this.receiver;
            Companion companion = SelectDistrictFragment.f265664A0;
            selectDistrictFragment.getClass();
            if (interfaceC40147b2 instanceof InterfaceC40147b.a) {
                Intent intentPutExtra = new Intent().putExtra("select_result", new SelectResult((String) selectDistrictFragment.f265670x0.getValue(), ((InterfaceC40147b.a) interfaceC40147b2).f395393a, null, 4, null));
                ActivityC22955m activityC22955mL1 = selectDistrictFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(-1, intentPutExtra);
                }
                ActivityC22955m activityC22955mL12 = selectDistrictFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            } else if (L.f(interfaceC40147b2, InterfaceC40147b.C11106b.f395394a)) {
                ActivityC22955m activityC22955mL13 = selectDistrictFragment.l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.setResult(-1);
                }
                ActivityC22955m activityC22955mL14 = selectDistrictFragment.l1();
                if (activityC22955mL14 != null) {
                    activityC22955mL14.finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            Companion companion = SelectDistrictFragment.f265664A0;
            SelectDistrictFragment selectDistrictFragment = SelectDistrictFragment.this;
            return ((SelectDistrictParams) selectDistrictFragment.f265669w0.getValue(selectDistrictFragment, SelectDistrictFragment.f265665B0[0])).f265687b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f265678l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f265678l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f265678l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectDistrictFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f265680l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f265680l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f265680l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265681l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265681l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f265681l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265682l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265682l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f265682l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectDistrictFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/select/new_districts/mvi/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<m> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = SelectDistrictFragment.this.f265666t0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    public SelectDistrictFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f265667u0 = new O0(m0.f406844a.b(m.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f265669w0 = new C35968w3(this);
        this.f265670x0 = C42727D.c(new d());
        this.f265671y0 = new NavigationState(false, null, 2, null);
        this.f265672z0 = C42727D.c(new a());
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-732171849, new b(composeView, this), true));
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43175k.K(new C43197r1(new c(2, this, SelectDistrictFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictOneTimeEvent;)V", 4), C23069w.a(((m) this.f265667u0.getValue()).getEvents(), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f265668v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.select.new_districts.di.a.a().a(new C28478k(Companion.SelectDistrictScreen.f265673d, s.c(this), "DistrictAndRegions"), (SelectDistrictParams) this.f265669w0.getValue(this, f265665B0[0]), (com.avito.android.select.new_districts.di.b) C29972i.a(C29972i.b(this), com.avito.android.select.new_districts.di.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f265668v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF265671y0() {
        return this.f265671y0;
    }
}
