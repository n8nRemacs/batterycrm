package com.avito.android.extended_profile_personal_link_edit;

import Cd.C13243a;
import DA.b;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
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
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditState;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: PersonalLinkEditFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalLinkEditFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f151444y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f151445z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public n f151446n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f151447o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f151448p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151449q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151450r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151451s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151452t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151453u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151454v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151455w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f151456x0;

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditFragment$a;", "", "<init>", "()V", "", "ARGS", "Ljava/lang/String;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PersonalLinkEditState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PersonalLinkEditState.InputState inputState = PersonalLinkEditState.InputState.f151538b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<PersonalLinkEditConfig> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final PersonalLinkEditConfig invoke() {
            Bundle bundleRequireArguments = PersonalLinkEditFragment.this.requireArguments();
            return (PersonalLinkEditConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_personal_link_edit.args", PersonalLinkEditConfig.class) : bundleRequireArguments.getParcelable("extended_profile_personal_link_edit.args"));
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<DA.b, G0> {
        @Override // Y41.l
        public final G0 invoke(DA.b bVar) {
            DA.b bVar2 = bVar;
            PersonalLinkEditFragment personalLinkEditFragment = (PersonalLinkEditFragment) this.receiver;
            a aVar = PersonalLinkEditFragment.f151444y0;
            personalLinkEditFragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mRequireActivity = personalLinkEditFragment.requireActivity();
                Intent intent = activityC22955mRequireActivity.getIntent();
                if (((b.a) bVar2).f3077a) {
                    activityC22955mRequireActivity.setResult(-1, intent);
                }
                activityC22955mRequireActivity.finish();
            } else if (bVar2 instanceof b.C0156b) {
                p pVar = p.f153373a;
                C47313c c47313c = personalLinkEditFragment.f151449q0;
                kotlin.reflect.n<Object> nVar = PersonalLinkEditFragment.f151445z0[0];
                ScrollView scrollView = (ScrollView) c47313c.a();
                b.C0156b c0156b = (b.C0156b) bVar2;
                ScreenPerformanceTracker screenPerformanceTracker = personalLinkEditFragment.f151448p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                p.c(pVar, scrollView, c0156b.f3078a, screenPerformanceTracker, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<PersonalLinkEditState, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(PersonalLinkEditState personalLinkEditState) {
            int iD2;
            int[] iArr;
            PersonalLinkEditState personalLinkEditState2 = personalLinkEditState;
            a aVar = PersonalLinkEditFragment.f151444y0;
            PersonalLinkEditFragment personalLinkEditFragment = PersonalLinkEditFragment.this;
            C47313c c47313c = personalLinkEditFragment.f151453u0;
            kotlin.reflect.n<Object>[] nVarArr = PersonalLinkEditFragment.f151445z0;
            kotlin.reflect.n<Object> nVar = nVarArr[4];
            I5.a((TextView) c47313c.a(), personalLinkEditState2.f151537e.k0(personalLinkEditFragment.requireContext()), false);
            PersonalLinkEditState.InputState inputState = personalLinkEditState2.f151536d;
            int iOrdinal = inputState.ordinal();
            if (iOrdinal == 0) {
                iD2 = C35835l0.d(R.attr.gray54, personalLinkEditFragment.requireContext());
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iD2 = C35835l0.d(R.attr.red, personalLinkEditFragment.requireContext());
            }
            kotlin.reflect.n<Object> nVar2 = nVarArr[4];
            ((TextView) c47313c.a()).setTextColor(iD2);
            C47313c c47313c2 = personalLinkEditFragment.f151454v0;
            kotlin.reflect.n<Object> nVar3 = nVarArr[5];
            Button button = (Button) c47313c2.a();
            boolean z12 = personalLinkEditState2.f151534b;
            button.setLoading(z12);
            button.setClickable(!z12);
            C47313c c47313c3 = personalLinkEditFragment.f151452t0;
            kotlin.reflect.n<Object> nVar4 = nVarArr[3];
            Input input = (Input) c47313c3.a();
            int iOrdinal2 = inputState.ordinal();
            if (iOrdinal2 == 0) {
                Input.f179303W.getClass();
                iArr = Input.f179304a0;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Input.f179303W.getClass();
                iArr = Input.f179305b0;
            }
            input.setState(iArr);
            String deformattedText = input.getDeformattedText();
            String str = personalLinkEditState2.f151535c;
            if (!L.f(deformattedText, str)) {
                Input.t(input, str, true, 2);
            }
            if (z12) {
                D6.h(input);
            } else if (!input.isEnabled()) {
                D6.k(input);
                input.requestFocus();
                input.v();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDA/a;", "it", "Lkotlin/G0;", "invoke", "(LDA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DA.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DA.a aVar) {
            a aVar2 = PersonalLinkEditFragment.f151444y0;
            PersonalLinkEditFragment.this.r5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f151460l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f151460l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f151460l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PersonalLinkEditFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f151462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f151462l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f151462l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151463l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f151463l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151464l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151464l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f151464l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PersonalLinkEditFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_personal_link_edit/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<m> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = PersonalLinkEditFragment.this.f151446n0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    static {
        Y y12 = new Y(PersonalLinkEditFragment.class, "contentScrollView", "getContentScrollView()Landroid/widget/ScrollView;", 0);
        n0 n0Var = m0.f406844a;
        f151445z0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "inputView", "getInputView()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "hintView", "getHintView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "actionButton", "getActionButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PersonalLinkEditFragment.class, "appBar", "getAppBar()Lru/avito/component/appbar/AppBar;", 0, n0Var)};
        f151444y0 = new a(null);
    }

    public PersonalLinkEditFragment() {
        super(R.layout.personal_link_edit_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f151447o0 = new O0(m0.f406844a.b(m.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f151449q0 = new C47313c(null, 1, null);
        this.f151450r0 = new C47313c(null, 1, null);
        this.f151451s0 = new C47313c(null, 1, null);
        this.f151452t0 = new C47313c(null, 1, null);
        this.f151453u0 = new C47313c(null, 1, null);
        this.f151454v0 = new C47313c(null, 1, null);
        this.f151455w0 = new C47313c(null, 1, null);
        this.f151456x0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f151448p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f151448p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new d(1, this, PersonalLinkEditFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditOneTimeEvent;)V", 0), new e());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        M81.c cVar = new M81.c(view, null, false, 4, null);
        C47313c c47313c = this.f151455w0;
        kotlin.reflect.n<Object>[] nVarArr = f151445z0;
        kotlin.reflect.n<Object> nVar = nVarArr[6];
        c47313c.b(this, cVar);
        Input input = (Input) view.findViewById(R.id.personal_link_edit_input);
        C47313c c47313c2 = this.f151452t0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[3];
        c47313c2.b(this, input);
        Button button = (Button) view.findViewById(R.id.personal_link_edit_action_button);
        C47313c c47313c3 = this.f151454v0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[5];
        c47313c3.b(this, button);
        TextView textView = (TextView) view.findViewById(R.id.personal_link_edit_hint);
        C47313c c47313c4 = this.f151453u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[4];
        c47313c4.b(this, textView);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.personal_link_edit_scroll_view);
        C47313c c47313c5 = this.f151449q0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[0];
        c47313c5.b(this, scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.personal_link_edit_title);
        C47313c c47313c6 = this.f151450r0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[1];
        c47313c6.b(this, textView2);
        TextView textView3 = (TextView) view.findViewById(R.id.personal_link_edit_description);
        C47313c c47313c7 = this.f151451s0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        c47313c7.b(this, textView3);
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        ((M81.b) c47313c.a()).g5(R.drawable.ic_back_24_black, null);
        kotlin.reflect.n<Object> nVar9 = nVarArr[6];
        ((M81.b) c47313c.a()).f5(new com.avito.android.extended_profile_personal_link_edit.b(this));
        kotlin.reflect.n<Object> nVar10 = nVarArr[3];
        Input input2 = (Input) c47313c2.a();
        FormatterType.f179288e.getClass();
        input2.setFormatterType(FormatterType.a(FormatterType.f179289f, new MaskParameters(q5().f151435d, false, null, "", false, null, false, null, (char) 0, 0, null, 2038, null)));
        input2.setHint(q5().f151435d);
        Integer num = q5().f151440i;
        if (num != null) {
            int iIntValue = num.intValue();
            kotlin.reflect.n<Object> nVar11 = nVarArr[3];
            ((Input) c47313c2.a()).setMaxLength(iIntValue);
        }
        input2.setOnEditorActionListener(new com.avito.android.autoteka.presentation.previewsearch.b(1, this, input2));
        input2.v();
        input2.b(new com.avito.android.extended_profile_personal_link_edit.c(input2, this));
        kotlin.reflect.n<Object> nVar12 = nVarArr[5];
        ((Button) c47313c3.a()).setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 8));
        kotlin.reflect.n<Object> nVar13 = nVarArr[5];
        com.avito.android.lib.design.button.b.a((Button) c47313c3.a(), q5().f151441j, false);
        kotlin.reflect.n<Object> nVar14 = nVarArr[1];
        I5.a((TextView) c47313c6.a(), q5().f151433b, false);
        kotlin.reflect.n<Object> nVar15 = nVarArr[2];
        I5.a((TextView) c47313c7.a(), q5().f151434c, false);
        ScreenPerformanceTracker screenPerformanceTracker = this.f151448p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.extended_profile_personal_link_edit.di.a.a().a(q5(), (com.avito.android.extended_profile_personal_link_edit.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_personal_link_edit.di.c.class), s.c(this), PersonalLinkEditScreen.f151466d, new f(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f151448p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final PersonalLinkEditConfig q5() {
        return (PersonalLinkEditConfig) this.f151456x0.getValue();
    }

    public final m r5() {
        return (m) this.f151447o0.getValue();
    }
}
