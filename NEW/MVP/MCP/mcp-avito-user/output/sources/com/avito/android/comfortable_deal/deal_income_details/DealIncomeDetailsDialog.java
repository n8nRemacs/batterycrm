package com.avito.android.comfortable_deal.deal_income_details;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.ComfortableDealDealIncomeScreen;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.deal_income_details.model.DealIncomeDetailsDialogArguments;
import com.avito.android.di.C29972i;
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

/* compiled from: DealIncomeDetailsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/deal_income_details/DealIncomeDetailsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealIncomeDetailsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f121803m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f121804h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f121805i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f121806j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f121807k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f121808l0;

    /* compiled from: DealIncomeDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal_income_details/DealIncomeDetailsDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DealIncomeDetailsDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.deal_income_details.DealIncomeDetailsDialog$a$a, reason: collision with other inner class name */
        public static final class C3598a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DealIncomeDetailsDialogArguments f121809l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ CommissionDetailsDialogArguments f121810m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3598a(DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments, CommissionDetailsDialogArguments commissionDetailsDialogArguments) {
                super(1);
                this.f121809l = dealIncomeDetailsDialogArguments;
                this.f121810m = commissionDetailsDialogArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("arguments", this.f121809l);
                bundle2.putParcelable("commission_arguments", this.f121810m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static DealIncomeDetailsDialog a(@Y61.k DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments, @Y61.l CommissionDetailsDialogArguments commissionDetailsDialogArguments) {
            DealIncomeDetailsDialog dealIncomeDetailsDialog = new DealIncomeDetailsDialog();
            C35966w1.a(dealIncomeDetailsDialog, -1, new C3598a(dealIncomeDetailsDialogArguments, commissionDetailsDialogArguments));
            return dealIncomeDetailsDialog;
        }

        public a() {
        }
    }

    /* compiled from: DealIncomeDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/deal_income_details/model/DealIncomeDetailsDialogArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<DealIncomeDetailsDialogArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final DealIncomeDetailsDialogArguments invoke() {
            Parcelable parcelable = DealIncomeDetailsDialog.this.requireArguments().getParcelable("arguments");
            if (parcelable != null) {
                return (DealIncomeDetailsDialogArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: DealIncomeDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/commission_details/model/CommissionDetailsDialogArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<CommissionDetailsDialogArguments> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final CommissionDetailsDialogArguments invoke() {
            return (CommissionDetailsDialogArguments) DealIncomeDetailsDialog.this.requireArguments().getParcelable("commission_arguments");
        }
    }

    /* compiled from: DealIncomeDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = DealIncomeDetailsDialog.this.f121804h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    public DealIncomeDetailsDialog() {
        super(0, 1, null);
        this.f121805i0 = C42727D.c(new d());
        this.f121807k0 = C42727D.c(new b());
        this.f121808l0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.deal_income_details.di.a.a().a((com.avito.android.comfortable_deal.di.a) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.di.a.class), cv.c.b(this), new C28478k(ComfortableDealDealIncomeScreen.f119740d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f121804h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f121804h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, true, 4);
        ComposeView composeView = new ComposeView(dVar.getContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-1254313825, new e(this, dVar), true));
        dVar.setContentView(composeView);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f121804h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
