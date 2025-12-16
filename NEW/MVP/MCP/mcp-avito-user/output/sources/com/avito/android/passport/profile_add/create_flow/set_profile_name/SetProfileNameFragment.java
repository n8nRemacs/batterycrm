package com.avito.android.passport.profile_add.create_flow.set_profile_name;

import Cd.C13243a;
import V50.a;
import V50.b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import com.avito.android.passport.profile_add.perf_const.SetProfileNameScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: SetProfileNameFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/SetProfileNameFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetProfileNameFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f212039E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f212040F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212041A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212042B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212043C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212044D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.create_flow.set_profile_name.o f212045n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f212046o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212047p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f212048q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public D<Navigation> f212049r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public G50.a f212050s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f212051t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212052u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212053v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212054w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212055x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212056y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212057z0;

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/SetProfileNameFragment$a;", "", "<init>", "()V", "", "ARGS_SET_PROFILE_NAME", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[SetProfileNameState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SetProfileNameState.InputState inputState = SetProfileNameState.InputState.f212162b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/SetProfileNameArgs;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<SetProfileNameArgs> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final SetProfileNameArgs invoke() {
            Bundle bundleRequireArguments = SetProfileNameFragment.this.requireArguments();
            return (SetProfileNameArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.set_profile_name.args", SetProfileNameArgs.class) : bundleRequireArguments.getParcelable("passport.add_profile.set_profile_name.args"));
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<V50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(V50.b bVar) {
            V50.b bVar2 = bVar;
            SetProfileNameFragment setProfileNameFragment = (SetProfileNameFragment) this.receiver;
            a aVar = SetProfileNameFragment.f212039E0;
            setProfileNameFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = setProfileNameFragment.f212048q0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a aVar3 = (b.a) bVar2;
                b.a.a(aVar2, aVar3.f16917a, aVar3.f16918b, null, 4);
            } else if (bVar2 instanceof b.C1164b) {
                Navigation navigation2 = ((b.C1164b) bVar2).f16919a;
                if (navigation2 instanceof Navigation.Close) {
                    ExtendedProfileCreationResult extendedProfileCreationResult = ((Navigation.Close) navigation2).f211368c;
                    if (extendedProfileCreationResult instanceof ExtendedProfileCreationResult.Success) {
                        ExtendedProfileCreationResult.Success success = (ExtendedProfileCreationResult.Success) extendedProfileCreationResult;
                        if (success.f211335b) {
                            G50.a aVar4 = setProfileNameFragment.f212050s0;
                            if (aVar4 == null) {
                                aVar4 = null;
                            }
                            PrintableText printableTextC = success.f211336c;
                            if (printableTextC == null) {
                                printableTextC = com.avito.android.printable_text.b.c(R.string.passport_lib_public_profile_create_finish_success_toast, new Serializable[0]);
                            }
                            aVar4.a(printableTextC, m0.f406844a.b(PassportAddProfileLink.class));
                        }
                    }
                }
                D<Navigation> d12 = setProfileNameFragment.f212049r0;
                (d12 != null ? d12 : null).setValue(navigation2);
            } else if (bVar2 instanceof b.c) {
                p pVar = p.f153373a;
                C47313c c47313c = setProfileNameFragment.f212052u0;
                kotlin.reflect.n<Object> nVar = SetProfileNameFragment.f212040F0[0];
                ScrollView scrollView = (ScrollView) c47313c.a();
                b.c cVar = (b.c) bVar2;
                ScreenPerformanceTracker screenPerformanceTracker = setProfileNameFragment.f212047p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                p.c(pVar, scrollView, cVar.f16920a, screenPerformanceTracker, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<SetProfileNameState, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SetProfileNameState setProfileNameState) {
            int[] iArr;
            G0 g02;
            SetProfileNameState setProfileNameState2 = setProfileNameState;
            a aVar = SetProfileNameFragment.f212039E0;
            SetProfileNameFragment setProfileNameFragment = SetProfileNameFragment.this;
            com.avito.android.passport.profile_add.create_flow.set_profile_name.f fVar = new com.avito.android.passport.profile_add.create_flow.set_profile_name.f(1, setProfileNameFragment.v5(), com.avito.android.passport.profile_add.create_flow.set_profile_name.n.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            int iOrdinal = setProfileNameState2.f212159e.ordinal();
            if (iOrdinal == 0) {
                Input.f179303W.getClass();
                iArr = Input.f179304a0;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Input.f179303W.getClass();
                iArr = Input.f179305b0;
            }
            C47313c c47313c = setProfileNameFragment.f212053v0;
            kotlin.reflect.n<Object>[] nVarArr = SetProfileNameFragment.f212040F0;
            kotlin.reflect.n<Object> nVar = nVarArr[1];
            TextView textView = (TextView) c47313c.a();
            SetProfileNameState.b bVar = setProfileNameState2.f212156b;
            I5.a(textView, bVar.f212166a.k0(setProfileNameFragment.requireContext()), false);
            C47313c c47313c2 = setProfileNameFragment.f212054w0;
            kotlin.reflect.n<Object> nVar2 = nVarArr[2];
            I5.a((TextView) c47313c2.a(), bVar.f212167b.k0(setProfileNameFragment.requireContext()), false);
            C47313c c47313c3 = setProfileNameFragment.f212055x0;
            kotlin.reflect.n<Object> nVar3 = nVarArr[3];
            I5.a((TextView) c47313c3.a(), bVar.f212168c.k0(setProfileNameFragment.requireContext()), false);
            Button buttonR5 = setProfileNameFragment.r5();
            boolean z12 = setProfileNameState2.f212160f;
            buttonR5.setLoading(z12);
            setProfileNameFragment.r5().setClickable(true ^ z12);
            com.avito.android.lib.design.button.b.a(setProfileNameFragment.r5(), bVar.f212170e.k0(setProfileNameFragment.requireContext()), false);
            setProfileNameFragment.u5().setState(iArr);
            Integer num = setProfileNameState2.f212157c;
            if (num != null) {
                setProfileNameFragment.s5().setText(num.intValue());
                D6.H(setProfileNameFragment.s5());
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                D6.w(setProfileNameFragment.s5());
            }
            Input.t(setProfileNameFragment.u5(), setProfileNameState2.f212158d, false, 6);
            setProfileNameFragment.u5().setHint(bVar.f212169d.k0(setProfileNameFragment.requireContext()));
            PrintableText printableText = setProfileNameState2.f212161g;
            String strK0 = printableText != null ? printableText.k0(setProfileNameFragment.requireContext()) : null;
            if (strK0 == null || C43066x.K(strK0)) {
                D6.g(setProfileNameFragment.t5());
            } else {
                setProfileNameFragment.t5().setText(strK0);
                D6.H(setProfileNameFragment.t5());
            }
            if (z12) {
                D6.h(setProfileNameFragment.u5());
            } else {
                D6.k(setProfileNameFragment.u5());
            }
            fVar.invoke(a.e.f16915a);
            return G0.f406611a;
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV50/a;", "it", "Lkotlin/G0;", "invoke", "(LV50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<V50.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(V50.a aVar) {
            a aVar2 = SetProfileNameFragment.f212039E0;
            SetProfileNameFragment.this.v5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SetProfileNameFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SetProfileNameFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return SetProfileNameFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212064l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f212064l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212064l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SetProfileNameFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f212066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f212066l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212066l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212067l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212067l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212067l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212068l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212068l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212068l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.passport.profile_add.create_flow.set_profile_name.n> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.profile_add.create_flow.set_profile_name.n invoke() {
            com.avito.android.passport.profile_add.create_flow.set_profile_name.o oVar = SetProfileNameFragment.this.f212045n0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.passport.profile_add.create_flow.set_profile_name.n) oVar.get();
        }
    }

    static {
        Y y12 = new Y(SetProfileNameFragment.class, "contentScrollView", "getContentScrollView()Landroid/widget/ScrollView;", 0);
        n0 n0Var = m0.f406844a;
        f212040F0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "profileNameInput", "getProfileNameInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "profileNameEmptyErrorText", "getProfileNameEmptyErrorText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "createProfileButton", "getCreateProfileButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "appBar", "getAppBar()Lru/avito/component/appbar/AppBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SetProfileNameFragment.class, "footerView", "getFooterView()Landroid/widget/TextView;", 0, n0Var)};
        f212039E0 = new a(null);
    }

    public SetProfileNameFragment() {
        super(R.layout.passport_create_profile_set_profile_name_fragment);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        n0 n0Var = m0.f406844a;
        this.f212046o0 = new O0(n0Var.b(com.avito.android.passport.profile_add.create_flow.set_profile_name.n.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f212051t0 = new O0(n0Var.b(com.avito.android.passport.profile_add.f.class), new g(), new i(), new h());
        this.f212052u0 = new C47313c(null, 1, null);
        this.f212053v0 = new C47313c(null, 1, null);
        this.f212054w0 = new C47313c(null, 1, null);
        this.f212055x0 = new C47313c(null, 1, null);
        this.f212056y0 = new C47313c(null, 1, null);
        this.f212057z0 = new C47313c(null, 1, null);
        this.f212041A0 = new C47313c(null, 1, null);
        this.f212042B0 = new C47313c(null, 1, null);
        this.f212043C0 = new C47313c(null, 1, null);
        this.f212044D0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212047p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f212047p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, v5(), new d(1, this, SetProfileNameFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameOneTimeEvent;)V", 0), new e());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C22823h0.K(requireActivity().getWindow().getDecorView(), null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        M81.c cVar = new M81.c(view, null, false, 4, null);
        C47313c c47313c = this.f212042B0;
        kotlin.reflect.n<Object>[] nVarArr = f212040F0;
        kotlin.reflect.n<Object> nVar = nVarArr[7];
        c47313c.b(this, cVar);
        Input input = (Input) view.findViewById(R.id.set_profile_name_input);
        C47313c c47313c2 = this.f212056y0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[4];
        c47313c2.b(this, input);
        Button button = (Button) view.findViewById(R.id.set_profile_name_create_profile);
        C47313c c47313c3 = this.f212041A0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[6];
        c47313c3.b(this, button);
        TextView textView = (TextView) view.findViewById(R.id.set_profile_name_empty_error);
        C47313c c47313c4 = this.f212057z0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[5];
        c47313c4.b(this, textView);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.set_profile_name_scroll_view);
        C47313c c47313c5 = this.f212052u0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[0];
        c47313c5.b(this, scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.set_profile_name_title);
        C47313c c47313c6 = this.f212053v0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[1];
        c47313c6.b(this, textView2);
        TextView textView3 = (TextView) view.findViewById(R.id.set_profile_name_subtitle);
        C47313c c47313c7 = this.f212054w0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        c47313c7.b(this, textView3);
        TextView textView4 = (TextView) view.findViewById(R.id.set_profile_name_text);
        C47313c c47313c8 = this.f212055x0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[3];
        c47313c8.b(this, textView4);
        TextView textView5 = (TextView) view.findViewById(R.id.set_profile_name_footer);
        C47313c c47313c9 = this.f212043C0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, textView5);
        s5().setMovementMethod(LinkMovementMethod.getInstance());
        u5().b(new s("", new com.avito.android.passport.profile_add.create_flow.set_profile_name.l(this)));
        u5().setOnEditorActionListener(new C27140f(this, 10));
        u5().v();
        r5().setOnClickListener(new com.avito.android.order.feature.c(this, 6));
        InterfaceC42726C interfaceC42726C = this.f212044D0;
        ProfileCreateExtendedFlow profileCreateExtendedFlow = ((SetProfileNameArgs) interfaceC42726C.getValue()).f212035e;
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport) {
            q5().g5(R.drawable.ic_close_24_black, null);
            q5().f5(new com.avito.android.passport.profile_add.create_flow.set_profile_name.h(this));
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile) {
            q5().g5(R.drawable.ic_back_24_black, null);
            q5().f5(new com.avito.android.passport.profile_add.create_flow.set_profile_name.i(this));
            if (!((SetProfileNameArgs) interfaceC42726C.getValue()).f212037g) {
                q5().setMenu(R.menu.extend_profile_menu);
                q5().h5(R.attr.blue600);
                C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.set_profile_name.j(this, null), new com.avito.android.passport.profile_add.create_flow.set_profile_name.g(C23069w.a(y.a(q5().e5()), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e))), C22984Q.a(getViewLifecycleOwner()));
            }
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification) {
            q5().g5(R.drawable.ic_back_24_black, null);
            q5().f5(new com.avito.android.passport.profile_add.create_flow.set_profile_name.k(this));
        }
        C22823h0.K(requireActivity().getWindow().getDecorView(), new com.avito.android.offlinization.ui.a(this, 3));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f212048q0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.set_profile_name.e(this, null), y.a(aVar.V9())), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f212047p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.passport.profile_add.create_flow.set_profile_name.di.a.a();
        SetProfileNameArgs setProfileNameArgs = (SetProfileNameArgs) this.f212044D0.getValue();
        S0 f42820b = getF42820b();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.passport.profile_add.di.a aVar = (com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class);
        O0 o02 = this.f212051t0;
        aVarA.a(setProfileNameArgs, f42820b, interfaceC39417aB, aVar, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212375K, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212376L, ((com.avito.android.passport.profile_add.f) o02.getValue()).f212373E, com.avito.android.analytics.screens.s.c(this), SetProfileNameScreen.f213624d, new f(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f212047p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final M81.b q5() {
        C47313c c47313c = this.f212042B0;
        kotlin.reflect.n<Object> nVar = f212040F0[7];
        return (M81.b) c47313c.a();
    }

    public final Button r5() {
        C47313c c47313c = this.f212041A0;
        kotlin.reflect.n<Object> nVar = f212040F0[6];
        return (Button) c47313c.a();
    }

    public final TextView s5() {
        C47313c c47313c = this.f212043C0;
        kotlin.reflect.n<Object> nVar = f212040F0[8];
        return (TextView) c47313c.a();
    }

    public final TextView t5() {
        C47313c c47313c = this.f212057z0;
        kotlin.reflect.n<Object> nVar = f212040F0[5];
        return (TextView) c47313c.a();
    }

    public final Input u5() {
        C47313c c47313c = this.f212056y0;
        kotlin.reflect.n<Object> nVar = f212040F0[4];
        return (Input) c47313c.a();
    }

    public final com.avito.android.passport.profile_add.create_flow.set_profile_name.n v5() {
        return (com.avito.android.passport.profile_add.create_flow.set_profile_name.n) this.f212046o0.getValue();
    }
}
