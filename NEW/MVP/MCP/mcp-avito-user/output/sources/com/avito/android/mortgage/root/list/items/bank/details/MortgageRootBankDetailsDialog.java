package com.avito.android.mortgage.root.list.items.bank.details;

import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.mortgage.screens.MortgageBankDetailsScreen;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootBankDetailsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/details/MortgageRootBankDetailsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageRootBankDetailsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f202316j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f202317h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f202318i0;

    /* compiled from: MortgageRootBankDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/details/MortgageRootBankDetailsDialog$a;", "", "<init>", "()V", "", "MORTGAGE_ROOT_BANK_DETAILS", "Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: MortgageRootBankDetailsDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.root.list.items.bank.details.MortgageRootBankDetailsDialog$a$a, reason: collision with other inner class name */
        public static final class C6010a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ MortgageRootBankDetails f202319l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6010a(MortgageRootBankDetails mortgageRootBankDetails) {
                super(1);
                this.f202319l = mortgageRootBankDetails;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("MORTGAGE_ROOT_BANK_DETAILS", this.f202319l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static MortgageRootBankDetailsDialog a(@k MortgageRootBankDetails mortgageRootBankDetails) {
            MortgageRootBankDetailsDialog mortgageRootBankDetailsDialog = new MortgageRootBankDetailsDialog();
            C35966w1.a(mortgageRootBankDetailsDialog, -1, new C6010a(mortgageRootBankDetails));
            return mortgageRootBankDetailsDialog;
        }

        public a() {
        }
    }

    /* compiled from: MortgageRootBankDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = MortgageRootBankDetailsDialog.this.f202317h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: MortgageRootBankDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                MortgageRootBankDetailsDialog mortgageRootBankDetailsDialog = MortgageRootBankDetailsDialog.this;
                q.b((com.avito.android.analytics.screens.compose.a) mortgageRootBankDetailsDialog.f202318i0.getValue(), r.c(1120364308, new com.avito.android.mortgage.root.list.items.bank.details.c(mortgageRootBankDetailsDialog), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    public MortgageRootBankDetailsDialog() {
        super(0, 1, null);
        this.f202318i0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.mortgage.root.list.items.bank.details.di.a.a().a((o) C29972i.a(C29972i.b(this), o.class), new C28478k(MortgageBankDetailsScreen.f203381d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f202317h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f202317h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-1435596684, new c(), true));
        dVar.setContentView(composeView);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f202317h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
