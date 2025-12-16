package com.avito.android.beduin.v2.onboarding.impl;

import Fi.C13804a;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35959v1;
import com.avito.android.util.C35966w1;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: BeduinV2OnboardingFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2OnboardingFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f104672l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f104673m0;

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final C35959v1 f104674h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final C35959v1 f104675i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final C35959v1 f104676j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f104677k0;

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingFragment$a;", "", "<init>", "()V", "", "DEFAULT_BOTTOM_SHEET_LOADING_HEIGHT", "I", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            a aVar = BeduinV2OnboardingFragment.f104672l0;
            BeduinV2OnboardingFragment beduinV2OnboardingFragment = BeduinV2OnboardingFragment.this;
            String strG5 = beduinV2OnboardingFragment.g5();
            if (strG5 != null) {
                int iHashCode = strG5.hashCode();
                if (iHashCode != 101393) {
                    if (iHashCode != 107876) {
                        if (iHashCode == 3194931 && strG5.equals("half")) {
                            return Integer.valueOf(C35835l0.g(beduinV2OnboardingFragment.requireContext()).y / 2);
                        }
                    } else if (strG5.equals("max")) {
                        return Integer.valueOf(C35835l0.g(beduinV2OnboardingFragment.requireContext()).y);
                    }
                } else if (strG5.equals("fit")) {
                    return Integer.valueOf((int) (120 * Resources.getSystem().getDisplayMetrics().density));
                }
            }
            return null;
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingFragment$c", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.lib.design.bottom_sheet.d {
        public c(Context context) {
            super(context, 0, 2, null);
            T();
            com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            Integer num = (Integer) BeduinV2OnboardingFragment.this.f104677k0.getValue();
            if (num != null) {
                S(num.intValue());
                J(true);
            }
            if (L.f(BeduinV2OnboardingFragment.this.g5(), "fit")) {
                com.avito.android.lib.design.bottom_sheet.d.I(this, true);
            }
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        @InterfaceC42830m
        public final void onBackPressed() {
            BeduinV2OnboardingFragment.this.requireActivity().getF21241d().c();
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Bundle, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            BeduinV2OnboardingFragment beduinV2OnboardingFragment = BeduinV2OnboardingFragment.this;
            bundle2.putAll(beduinV2OnboardingFragment.getArguments());
            Integer num = (Integer) beduinV2OnboardingFragment.f104677k0.getValue();
            if (num != null) {
                bundle2.putInt("extra_content_height", num.intValue());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingBaseFragment f104681l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingFragment f104682m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment, BeduinV2OnboardingFragment beduinV2OnboardingFragment) {
            super(0);
            this.f104681l = beduinV2OnboardingBaseFragment;
            this.f104682m = beduinV2OnboardingFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = this.f104681l;
            beduinV2OnboardingBaseFragment.f104644B0 = null;
            beduinV2OnboardingBaseFragment.f104645C0 = null;
            InterfaceC28373a interfaceC28373a = beduinV2OnboardingBaseFragment.f104650s0;
            BeduinV2OnboardingFragment.f5(this.f104682m, interfaceC28373a != null ? interfaceC28373a : null);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingBaseFragment f104683l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment) {
            super(1);
            this.f104683l = beduinV2OnboardingBaseFragment;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f104683l.f104645C0 = null;
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingFragment f104684l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingBaseFragment f104685m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment, BeduinV2OnboardingFragment beduinV2OnboardingFragment) {
            super(0);
            this.f104684l = beduinV2OnboardingFragment;
            this.f104685m = beduinV2OnboardingBaseFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC28373a interfaceC28373a = this.f104685m.f104650s0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            BeduinV2OnboardingFragment.f5(this.f104684l, interfaceC28373a);
            return G0.f406611a;
        }
    }

    static {
        h0 h0Var = new h0(BeduinV2OnboardingFragment.class, "bottomSheetMode", "getBottomSheetMode()Ljava/lang/String;", 0);
        n0 n0Var = m0.f406844a;
        f104673m0 = new n[]{n0Var.i(h0Var), C0.k(BeduinV2OnboardingFragment.class, "onboardingID", "getOnboardingID()Ljava/lang/String;", 0, n0Var), C0.k(BeduinV2OnboardingFragment.class, "eventEncoded", "getEventEncoded()Ljava/lang/String;", 0, n0Var)};
        f104672l0 = new a(null);
    }

    public BeduinV2OnboardingFragment() {
        super(0, 1, null);
        this.f104674h0 = new C35959v1(this, "bottomSheetHeightMode");
        this.f104675i0 = new C35959v1(this, "onboardingID");
        this.f104676j0 = new C35959v1(this, "eventEncoded");
        this.f104677k0 = C42727D.c(new b());
    }

    public static final void f5(BeduinV2OnboardingFragment beduinV2OnboardingFragment, InterfaceC28373a interfaceC28373a) {
        n<Object>[] nVarArr = f104673m0;
        interfaceC28373a.c(new C13804a((String) beduinV2OnboardingFragment.f104675i0.getValue(beduinV2OnboardingFragment, nVarArr[1]), (String) beduinV2OnboardingFragment.f104676j0.getValue(beduinV2OnboardingFragment, nVarArr[2])));
    }

    public final String g5() {
        return (String) this.f104674h0.getValue(this, f104673m0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return new c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_onboarding_empty, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            BeduinV2OnboardingBaseFragment.f104642D0.getClass();
            BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = new BeduinV2OnboardingBaseFragment();
            C35966w1.a(beduinV2OnboardingBaseFragment, -1, new d());
            if (L.f(g5(), "fit")) {
                beduinV2OnboardingBaseFragment.f104644B0 = new e(beduinV2OnboardingBaseFragment, this);
                beduinV2OnboardingBaseFragment.f104645C0 = new f(beduinV2OnboardingBaseFragment);
            } else {
                beduinV2OnboardingBaseFragment.f104644B0 = new g(beduinV2OnboardingBaseFragment, this);
            }
            H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.content_container, beduinV2OnboardingBaseFragment, null);
            hE2.e();
        }
    }
}
