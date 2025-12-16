package com.avito.android.tariff_lf_constructor.configure.landing;

import Cd.C13243a;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.adapter.j;
import gD0.InterfaceC40574b;
import jD0.C42238c;
import jD0.InterfaceC42237b;
import javax.inject.Inject;
import kD0.C42573b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ConstructorLandingFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Result", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConstructorLandingFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f299624s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.landing.e f299625h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f299626i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f299627j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f299628k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public j f299629l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f299630m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f299631n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f299632o0;

    /* renamed from: p0, reason: collision with root package name */
    public l f299633p0;

    /* renamed from: q0, reason: collision with root package name */
    public Button f299634q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f299635r0;

    /* compiled from: ConstructorLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result;", "Landroid/os/Parcelable;", "Canceled", "Success", "Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result$Canceled;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result$Success;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: ConstructorLandingFragment.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result$Canceled;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Canceled implements Result {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Canceled f299636b = new Canceled();

            @k
            public static final Parcelable.Creator<Canceled> CREATOR = new a();

            /* compiled from: ConstructorLandingFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Canceled.f299636b;
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i12) {
                    return new Canceled[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Canceled);
            }

            public final int hashCode() {
                return 1974920081;
            }

            @k
            public final String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ConstructorLandingFragment.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result$Success;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$Result;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Success implements Result {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Success f299637b = new Success();

            @k
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* compiled from: ConstructorLandingFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Success> {
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Success.f299637b;
                }

                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i12) {
                    return new Success[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return 694362635;
            }

            @k
            public final String toString() {
                return "Success";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: ConstructorLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/ConstructorLandingFragment$a;", "", "<init>", "()V", "", "RESULT_KEY", "Ljava/lang/String;", "TAG", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC42237b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42237b interfaceC42237b) {
            InterfaceC42237b interfaceC42237b2 = interfaceC42237b;
            ConstructorLandingFragment constructorLandingFragment = (ConstructorLandingFragment) this.receiver;
            a aVar = ConstructorLandingFragment.f299624s0;
            constructorLandingFragment.getClass();
            if (interfaceC42237b2 instanceof InterfaceC42237b.C11554b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = constructorLandingFragment.f299631n0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC42237b.C11554b) interfaceC42237b2).f405517a, null, null, 6);
                Result.Success success = Result.Success.f299637b;
                FragmentManager parentFragmentManager = constructorLandingFragment.getParentFragmentManager();
                String tag = constructorLandingFragment.getTag();
                if (tag == null) {
                    tag = "";
                }
                parentFragmentManager.o0(C22777e.b(new Q("result_key", success)), tag);
                constructorLandingFragment.f299635r0 = true;
            } else if (interfaceC42237b2 instanceof InterfaceC42237b.a) {
                constructorLandingFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LjD0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LjD0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C42238c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C42238c c42238c) {
            C42238c c42238c2 = c42238c;
            ConstructorLandingFragment constructorLandingFragment = ConstructorLandingFragment.this;
            ScreenPerformanceTracker screenPerformanceTracker = constructorLandingFragment.f299627j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(c42238c2, screenPerformanceTracker, new com.avito.android.tariff_lf_constructor.configure.landing.b(1, constructorLandingFragment, ConstructorLandingFragment.class, "render", "render(Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingState;)V", 0));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f299639l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f299639l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f299639l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ConstructorLandingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f299641l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f299641l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f299641l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f299642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f299642l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f299642l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f299643l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f299643l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f299643l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ConstructorLandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_lf_constructor/configure/landing/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.tariff_lf_constructor.configure.landing.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_lf_constructor.configure.landing.d invoke() {
            com.avito.android.tariff_lf_constructor.configure.landing.e eVar = ConstructorLandingFragment.this.f299625h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.tariff_lf_constructor.configure.landing.d) eVar.get();
        }
    }

    public ConstructorLandingFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f299626i0 = new O0(m0.f406844a.b(com.avito.android.tariff_lf_constructor.configure.landing.d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_constructor.configure.landing.di.g.a().a(this, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), s.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f299627j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f299627j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f299627j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.setContentView(R.layout.constructor_landing_fragment);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 127);
        dVar.setCancelable(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        this.f299632o0 = recyclerView;
        j jVar = this.f299629l0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f299632o0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        com.avito.konveyor.a aVar = this.f299630m0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView2.l(new C42573b(aVar), -1);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f299627j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        RecyclerView recyclerView3 = this.f299632o0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        screenPerformanceTracker2.b(recyclerView3);
        this.f299634q0 = (Button) dVar.findViewById(R.id.btn_continue);
        l lVar = new l((ViewGroup) dVar.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        this.f299633p0 = lVar;
        lVar.f231600j = new com.avito.android.tariff_lf_constructor.configure.landing.a(this);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.tariff_lf_constructor.configure.landing.d) this.f299626i0.getValue(), this, Lifecycle.State.f46682e, new b(1, this, ConstructorLandingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f299627j0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f299635r0) {
            return;
        }
        Result.Canceled canceled = Result.Canceled.f299636b;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        parentFragmentManager.o0(C22777e.b(new Q("result_key", canceled)), tag);
    }
}
