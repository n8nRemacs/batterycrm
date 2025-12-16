package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce;

import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.IacCallMethodsDialogFragmentResult;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink;
import com.avito.android.permissions.z;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vN.C49237a;

/* compiled from: IacForceCallMethodsDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/iacForce/IacForceCallMethodsDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacForceCallMethodsDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f168467o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public z f168468h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f168469i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public C49237a f168470j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168471k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168472l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168473m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168474n0;

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/iacForce/IacForceCallMethodsDialogFragment$a;", "", "<init>", "()V", "", "ARG_LINK", "Ljava/lang/String;", "ARG_REQUEST_KEY", "VIDEO_CALL_OPTION", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = IacForceCallMethodsDialogFragment.this.f168469i0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r5 = this;
                com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment r0 = com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment.this
                vN.a r1 = r0.f168470j0
                r2 = 0
                if (r1 == 0) goto L8
                goto L9
            L8:
                r1 = r2
            L9:
                r1.getClass()
                kotlin.reflect.n<java.lang.Object>[] r3 = vN.C49237a.f440707l
                r4 = 3
                r3 = r3[r4]
                com.avito.android.A0$a r1 = r1.f440711d
                DE0.a r1 = r1.a()
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4b
                com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink r1 = r0.g5()
                com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink r1 = r1.f168693b
                com.avito.android.iac_dialer_models.abstract_module.IacCallInfo r1 = r1.f168711b
                com.avito.android.iac_dialer_models.abstract_module.IacCanCallData r1 = r1.f166842l
                if (r1 == 0) goto L4b
                boolean r1 = r1.f166856c
                r3 = 1
                if (r1 != r3) goto L4b
                com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink r0 = r0.g5()
                com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink r0 = r0.f168693b
                com.avito.android.iac_dialer_models.abstract_module.IacCallInfo r0 = r0.f168711b
                com.avito.android.iac_dialer_models.abstract_module.IacCanCallData r0 = r0.f166842l
                if (r0 == 0) goto L42
                java.lang.String r2 = r0.f166857d
            L42:
                java.lang.String r0 = "videoCall"
                boolean r0 = kotlin.jvm.internal.L.f(r2, r0)
                if (r0 == 0) goto L4b
                goto L4c
            L4b:
                r3 = 0
            L4c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment.c.invoke():java.lang.Object");
        }
    }

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacShowCallMethodsDialogSheetLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<IacShowCallMethodsDialogSheetLink> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final IacShowCallMethodsDialogSheetLink invoke() {
            IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink;
            Bundle arguments = IacForceCallMethodsDialogFragment.this.getArguments();
            if (arguments != null) {
                iacShowCallMethodsDialogSheetLink = (IacShowCallMethodsDialogSheetLink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("call_methods_link", IacShowCallMethodsDialogSheetLink.class) : arguments.getParcelable("call_methods_link"));
            } else {
                iacShowCallMethodsDialogSheetLink = null;
            }
            if (iacShowCallMethodsDialogSheetLink != null) {
                return iacShowCallMethodsDialogSheetLink;
            }
            throw new IllegalArgumentException("Call method PHONE is not provided");
        }
    }

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f168478l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacForceCallMethodsDialogFragment f168479m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f168480n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComposeView composeView, IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(2);
            this.f168478l = composeView;
            this.f168479m = iacForceCallMethodsDialogFragment;
            this.f168480n = dVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f168478l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                com.akita.compose.theme.re23.c.a(false, r.c(1668984157, new i(this.f168479m, this.f168480n), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacForceCallMethodsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = IacForceCallMethodsDialogFragment.this.requireArguments().getString("request_key");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Request key is not provided");
        }
    }

    public IacForceCallMethodsDialogFragment() {
        super(0, 1, null);
        this.f168471k0 = C42727D.c(new b());
        this.f168472l0 = C42727D.c(new d());
        this.f168473m0 = C42727D.c(new f());
        this.f168474n0 = C42727D.c(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b5  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f5(@Y61.k com.avito.android.remote.model.text.AttributedText r35, boolean r36, @Y61.k Y41.a r37, @Y61.k Y41.a r38, @Y61.l androidx.compose.runtime.A r39, int r40) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment.f5(com.avito.android.remote.model.text.AttributedText, boolean, Y41.a, Y41.a, androidx.compose.runtime.A, int):void");
    }

    @Y61.k
    public final IacShowCallMethodsDialogSheetLink g5() {
        return (IacShowCallMethodsDialogSheetLink) this.f168472l0.getValue();
    }

    public final void h5(String str, IacCallMethodsDialogFragmentResult iacCallMethodsDialogFragmentResult) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putParcelable("callMethods.dialogs.IacCallMethodsDialogFragmentResult", iacCallMethodsDialogFragmentResult);
        parentFragmentManager.o0(bundle, str);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        h5((String) this.f168473m0.getValue(), new IacCallMethodsDialogFragmentResult.OnCallMethodsDialogCanceled(g5()));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.a.a().a(this, s.b(this), (b.InterfaceC4984b) C29972i.a(C29972i.b(this), b.InterfaceC4984b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f168469i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        setStyle(0, R.style.Re23_BottomSheet_Default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f168469i0;
        Object[] objArr = 0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, objArr == true ? 1 : 0);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1225792002, new e(composeView, this, dVar), true));
        dVar.G(composeView, true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f168469i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        h5((String) this.f168473m0.getValue(), new IacCallMethodsDialogFragmentResult.OnCallMethodsDialogCanceled(g5()));
    }
}
