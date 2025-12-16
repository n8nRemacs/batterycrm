package com.avito.android.mortgage.acceptance_dialog;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageAcceptanceScreen;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.di.o;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AcceptanceDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/acceptance_dialog/AcceptanceDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AcceptanceDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f198162j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f198163h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f198164i0;

    /* compiled from: AcceptanceDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/acceptance_dialog/AcceptanceDialog$a;", "", "<init>", "()V", "", "ACCEPTANCE_ARGS", "Ljava/lang/String;", "ACCEPTANCE_RESULT", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AcceptanceDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.acceptance_dialog.AcceptanceDialog$a$a, reason: collision with other inner class name */
        public static final class C5840a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AcceptanceDialogArguments f198165l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5840a(AcceptanceDialogArguments acceptanceDialogArguments) {
                super(1);
                this.f198165l = acceptanceDialogArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("ACCEPTANCE_ARGS", this.f198165l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static AcceptanceDialog a(@k AcceptanceDialogArguments acceptanceDialogArguments) {
            AcceptanceDialog acceptanceDialog = new AcceptanceDialog();
            C35966w1.a(acceptanceDialog, -1, new C5840a(acceptanceDialogArguments));
            return acceptanceDialog;
        }

        public a() {
        }
    }

    /* compiled from: AcceptanceDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = AcceptanceDialog.this.f198163h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: AcceptanceDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TZ.b f198168m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TZ.b bVar) {
            super(1);
            this.f198168m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.setContent(new C22096n(-1626205223, new e(AcceptanceDialog.this, this.f198168m), true));
            }
            return G0.f406611a;
        }
    }

    public AcceptanceDialog() {
        super(0, 1, null);
        this.f198164i0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.mortgage.acceptance_dialog.di.b.a().a((o) C29972i.a(C29972i.b(this), o.class), new C28478k(MortgageAcceptanceScreen.f90413d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198163h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final AcceptanceDialogArguments f5() {
        Bundle bundleRequireArguments = requireArguments();
        return (AcceptanceDialogArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("ACCEPTANCE_ARGS", AcceptanceDialogArguments.class) : bundleRequireArguments.getParcelable("ACCEPTANCE_ARGS"));
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f198163h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.C(R.layout.compose_content_layout, new c(bVar));
        bVar.setTitle(f5().f198188c.k0(requireContext()));
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198163h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }
}
