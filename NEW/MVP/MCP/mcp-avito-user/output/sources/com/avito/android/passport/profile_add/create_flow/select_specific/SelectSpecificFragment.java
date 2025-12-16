package com.avito.android.passport.profile_add.create_flow.select_specific;

import Cd.C13243a;
import T50.a;
import T50.b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23069w;
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
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_specific.di.b;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C;
import com.avito.android.passport.profile_add.perf_const.SelectSpecificScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: SelectSpecificFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/SelectSpecificFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectSpecificFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f211624C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f211625D0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f211626A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f211627B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.create_flow.select_specific.j f211628n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f211629o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f211630p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f211631q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C f211632r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f211633s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public D<Navigation> f211634t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public G50.a f211635u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211636v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211637w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211638x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211639y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final O0 f211640z0;

    /* compiled from: SelectSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/SelectSpecificFragment$a;", "", "<init>", "()V", "", "ARGS_SELECT_SPECIFIC", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectSpecificFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/SelectSpecificArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SelectSpecificArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SelectSpecificArguments invoke() {
            Bundle bundleRequireArguments = SelectSpecificFragment.this.requireArguments();
            return (SelectSpecificArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.select_specific.select_specific_args", SelectSpecificArguments.class) : bundleRequireArguments.getParcelable("passport.add_profile.select_specific.select_specific_args"));
        }
    }

    /* compiled from: SelectSpecificFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<T50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(T50.b bVar) {
            T50.b bVar2 = bVar;
            SelectSpecificFragment selectSpecificFragment = (SelectSpecificFragment) this.receiver;
            a aVar = SelectSpecificFragment.f211624C0;
            selectSpecificFragment.getClass();
            if (bVar2 instanceof b.C1047b) {
                p pVar = p.f153373a;
                RecyclerView recyclerViewS5 = selectSpecificFragment.s5();
                b.C1047b c1047b = (b.C1047b) bVar2;
                ScreenPerformanceTracker screenPerformanceTracker = selectSpecificFragment.f211627B0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                p.c(pVar, recyclerViewS5, c1047b.f15368a, screenPerformanceTracker, null);
            } else if (bVar2 instanceof b.a) {
                Navigation navigation2 = ((b.a) bVar2).f15367a;
                if (navigation2 instanceof Navigation.Close) {
                    ExtendedProfileCreationResult extendedProfileCreationResult = ((Navigation.Close) navigation2).f211368c;
                    if (extendedProfileCreationResult instanceof ExtendedProfileCreationResult.Success) {
                        ExtendedProfileCreationResult.Success success = (ExtendedProfileCreationResult.Success) extendedProfileCreationResult;
                        if (success.f211335b) {
                            G50.a aVar2 = selectSpecificFragment.f211635u0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            PrintableText printableTextC = success.f211336c;
                            if (printableTextC == null) {
                                printableTextC = com.avito.android.printable_text.b.c(R.string.passport_lib_public_profile_create_finish_success_toast, new Serializable[0]);
                            }
                            aVar2.a(printableTextC, m0.f406844a.b(PassportAddProfileLink.class));
                        }
                    }
                }
                D<Navigation> d12 = selectSpecificFragment.f211634t0;
                (d12 != null ? d12 : null).setValue(navigation2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LT50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<T50.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(T50.c cVar) {
            T50.c cVar2 = cVar;
            a aVar = SelectSpecificFragment.f211624C0;
            SelectSpecificFragment selectSpecificFragment = SelectSpecificFragment.this;
            com.avito.android.passport.profile_add.create_flow.select_specific.a aVar2 = new com.avito.android.passport.profile_add.create_flow.select_specific.a(1, selectSpecificFragment.t5(), com.avito.android.passport.profile_add.create_flow.select_specific.i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            com.avito.konveyor.adapter.a aVar3 = selectSpecificFragment.f211631q0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.c(new UV0.c(cVar2.f15371b));
            if (cVar2.f15372c) {
                selectSpecificFragment.s5().F0(r2.size() - 1);
            }
            Button buttonR5 = selectSpecificFragment.r5();
            boolean z12 = cVar2.f15373d;
            buttonR5.setLoading(z12);
            selectSpecificFragment.r5().setClickable(!z12);
            aVar2.invoke(a.d.f15365a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT50/a;", "it", "Lkotlin/G0;", "invoke", "(LT50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<T50.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(T50.a aVar) {
            a aVar2 = SelectSpecificFragment.f211624C0;
            SelectSpecificFragment.this.t5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SelectSpecificFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SelectSpecificFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return SelectSpecificFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f211647l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f211647l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f211647l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectSpecificFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f211649l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f211649l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f211649l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211650l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211650l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f211650l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211651l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211651l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f211651l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/select_specific/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.passport.profile_add.create_flow.select_specific.i> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.profile_add.create_flow.select_specific.i invoke() {
            com.avito.android.passport.profile_add.create_flow.select_specific.j jVar = SelectSpecificFragment.this.f211628n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.passport.profile_add.create_flow.select_specific.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(SelectSpecificFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f211625D0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(SelectSpecificFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SelectSpecificFragment.class, "legalsTextView", "getLegalsTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SelectSpecificFragment.class, "appBar", "getAppBar()Lru/avito/component/appbar/AppBar;", 0, n0Var)};
        f211624C0 = new a(null);
    }

    public SelectSpecificFragment() {
        super(R.layout.passport_create_profile_select_specific_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        n0 n0Var = m0.f406844a;
        this.f211629o0 = new O0(n0Var.b(com.avito.android.passport.profile_add.create_flow.select_specific.i.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f211636v0 = new C47313c(null, 1, null);
        this.f211637w0 = new C47313c(null, 1, null);
        this.f211638x0 = new C47313c(null, 1, null);
        this.f211639y0 = new C47313c(null, 1, null);
        this.f211640z0 = new O0(n0Var.b(com.avito.android.passport.profile_add.f.class), new f(), new h(), new g());
        this.f211626A0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f211627B0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f211627B0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, t5(), new c(1, this, SelectSpecificFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificOneTimeEvent;)V", 0), new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        M81.c cVar = new M81.c(view, null, false, 4, null);
        C47313c c47313c = this.f211639y0;
        kotlin.reflect.n<Object>[] nVarArr = f211625D0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        c47313c.b(this, cVar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.select_specifics_recycler);
        C47313c c47313c2 = this.f211636v0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.select_specific_continue_button);
        C47313c c47313c3 = this.f211637w0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, button);
        TextView textView = (TextView) view.findViewById(R.id.legals_text_view);
        C47313c c47313c4 = this.f211638x0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, textView);
        InterfaceC42726C interfaceC42726C = this.f211626A0;
        if (((SelectSpecificArguments) interfaceC42726C.getValue()).f211623j) {
            r5().setText(R.string.passport_add_profile_select_vertical_continue_only_select);
        } else {
            r5().setText(R.string.passport_add_profile_select_vertical_continue);
        }
        RecyclerView recyclerViewS5 = s5();
        com.avito.konveyor.adapter.j jVar = this.f211630p0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewS5.setAdapter(jVar);
        RecyclerView recyclerViewS52 = s5();
        C c12 = this.f211632r0;
        if (c12 == null) {
            c12 = null;
        }
        recyclerViewS52.l(c12, -1);
        q5().g5(R.drawable.ic_back_24_black, null);
        q5().f5(new com.avito.android.passport.profile_add.create_flow.select_specific.c(this));
        if ((((SelectSpecificArguments) interfaceC42726C.getValue()).f211619f instanceof ProfileCreateExtendedFlow.Profile) && !((SelectSpecificArguments) interfaceC42726C.getValue()).f211621h) {
            q5().setMenu(R.menu.extend_profile_menu);
            q5().h5(R.attr.blue600);
            C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.select_specific.d(this, null), new com.avito.android.passport.profile_add.create_flow.select_specific.b(C23069w.a(y.a(q5().e5()), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e))), C22984Q.a(getViewLifecycleOwner()));
        }
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        ((TextView) c47313c4.a()).setMovementMethod(LinkMovementMethod.getInstance());
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        TextView textView2 = (TextView) c47313c4.a();
        X50.c cVar2 = X50.c.f18586a;
        Context contextRequireContext = requireContext();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f211633s0;
        if (aVar == null) {
            aVar = null;
        }
        cVar2.getClass();
        com.avito.android.util.text.j.c(textView2, X50.c.a(contextRequireContext, aVar), null);
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        ((TextView) c47313c4.a()).setVisibility(L.f(((SelectSpecificArguments) interfaceC42726C.getValue()).f211619f, ProfileCreateExtendedFlow.Passport.Create.f211172d) ? 0 : 8);
        r5().setOnClickListener(new com.avito.android.order.feature.c(this, 4));
        ScreenPerformanceTracker screenPerformanceTracker = this.f211627B0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.passport.profile_add.create_flow.select_specific.di.a.a();
        com.avito.android.passport.profile_add.di.a aVar = (com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class);
        S0 f42820b = getF42820b();
        SelectSpecificArguments selectSpecificArguments = (SelectSpecificArguments) this.f211626A0.getValue();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        O0 o02 = this.f211640z0;
        aVarA.a(aVar, f42820b, selectSpecificArguments, interfaceC39417aB, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212374J, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212375K, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212376L, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212373E, s.c(this), SelectSpecificScreen.f213622d, new e(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f211627B0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final M81.b q5() {
        C47313c c47313c = this.f211639y0;
        kotlin.reflect.n<Object> nVar = f211625D0[3];
        return (M81.b) c47313c.a();
    }

    public final Button r5() {
        C47313c c47313c = this.f211637w0;
        kotlin.reflect.n<Object> nVar = f211625D0[1];
        return (Button) c47313c.a();
    }

    public final RecyclerView s5() {
        C47313c c47313c = this.f211636v0;
        kotlin.reflect.n<Object> nVar = f211625D0[0];
        return (RecyclerView) c47313c.a();
    }

    public final com.avito.android.passport.profile_add.create_flow.select_specific.i t5() {
        return (com.avito.android.passport.profile_add.create_flow.select_specific.i) this.f211629o0.getValue();
    }
}
