package com.avito.android.iac_problems.impl_module.miui_permission;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Fc1.D3;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.iac_problems.impl_module.miui_permission.ui.MiuiBottomsheetRemoteImageLanguage;
import com.avito.android.iac_problems.impl_module.miui_permission.ui.h;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacMiuiPermissionBottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacMiuiPermissionBottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f168779j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f168780h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f168781i0;

    /* compiled from: IacMiuiPermissionBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetFragment$a;", "", "<init>", "()V", "", "ARG_LANGUAGE", "Ljava/lang/String;", "ARG_REQUEST_KEY", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacMiuiPermissionBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MiuiBottomsheetRemoteImageLanguage f168782l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f168783m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ IacMiuiPermissionBottomSheetFragment f168784n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MiuiBottomsheetRemoteImageLanguage miuiBottomsheetRemoteImageLanguage, com.avito.android.lib.design.bottom_sheet.d dVar, IacMiuiPermissionBottomSheetFragment iacMiuiPermissionBottomSheetFragment) {
            super(2);
            this.f168782l = miuiBottomsheetRemoteImageLanguage;
            this.f168783m = dVar;
            this.f168784n = iacMiuiPermissionBottomSheetFragment;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a13.C(96876579);
                Object objT = a13.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                com.avito.android.lib.design.bottom_sheet.d dVar = this.f168783m;
                if (objT == c1651a) {
                    objT = new com.avito.android.iac_problems.impl_module.miui_permission.a(this.f168784n, dVar);
                    a13.H(objT);
                }
                a13.h();
                com.avito.android.iac_problems.impl_module.miui_permission.b bVar = new com.avito.android.iac_problems.impl_module.miui_permission.b(0, dVar, com.avito.android.lib.design.bottom_sheet.d.class, "close", "close()V", 0);
                h.a(this.f168782l, (Y41.a) objT, bVar, null, a13, 48, 8);
            }
            return G0.f406611a;
        }
    }

    public IacMiuiPermissionBottomSheetFragment() {
        super(0, 1, null);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void f5(IacMiuiPermissionBottomSheetDialogResult iacMiuiPermissionBottomSheetDialogResult) {
        if (!this.f168781i0) {
            String string = requireArguments().getString("request_key");
            if (string == null) {
                throw new IllegalArgumentException("Request key is not provided");
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            IacMiuiPermissionBottomSheetDialogResult.f168776b.getClass();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.avito.android.iac_problems.impl_module.miui_permission.KEY_RESULT", iacMiuiPermissionBottomSheetDialogResult);
            parentFragmentManager.o0(bundle, string);
            this.f168781i0 = true;
        }
        dismiss();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.iac_problems.impl_module.miui_permission.di.a.a().a(this, s.b(this), (com.avito.android.iac_problems.impl_module.miui_permission.di.c) C29972i.a(C29972i.b(this), com.avito.android.iac_problems.impl_module.miui_permission.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f168780h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f168780h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        MiuiBottomsheetRemoteImageLanguage miuiBottomsheetRemoteImageLanguage;
        ScreenPerformanceTracker screenPerformanceTracker = this.f168780h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i12 = arguments.getInt("language");
            AbstractC42734a abstractC42734a = (AbstractC42734a) MiuiBottomsheetRemoteImageLanguage.f168813e;
            abstractC42734a.getClass();
            miuiBottomsheetRemoteImageLanguage = ((MiuiBottomsheetRemoteImageLanguage[]) C42821v.b(abstractC42734a, new MiuiBottomsheetRemoteImageLanguage[0]))[i12];
        } else {
            miuiBottomsheetRemoteImageLanguage = null;
        }
        if (miuiBottomsheetRemoteImageLanguage == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.T();
        dVar.S(C35835l0.g(dVar.getContext()).y);
        ComposeView composeView = new ComposeView(dVar.getContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(138173002, new b(miuiBottomsheetRemoteImageLanguage, dVar, this), true));
        dVar.setContentView(composeView);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f168780h0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f168780h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 18));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnCancelListener(new D3(this, 10));
        }
    }
}
