package com.avito.android.mortgage.steps_details;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageStepsDetailsScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.steps_details.model.StepDetailsModel;
import com.avito.android.mortgage.steps_details.model.StepsDetailsArguments;
import com.avito.android.mortgage.widgets.VerticalStepsBar;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StepsDetailsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/steps_details/StepsDetailsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StepsDetailsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: i0, reason: collision with root package name */
    @k
    public static final a f203813i0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f203814h0;

    /* compiled from: StepsDetailsDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/steps_details/StepsDetailsDialog$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: StepsDetailsDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.steps_details.StepsDetailsDialog$a$a, reason: collision with other inner class name */
        public static final class C6075a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ StepsDetailsArguments f203815l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6075a(StepsDetailsArguments stepsDetailsArguments) {
                super(1);
                this.f203815l = stepsDetailsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("STEPS_DETAILS_DATA", this.f203815l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static StepsDetailsDialog a(@k StepsDetailsArguments stepsDetailsArguments) {
            StepsDetailsDialog stepsDetailsDialog = new StepsDetailsDialog();
            C35966w1.a(stepsDetailsDialog, -1, new C6075a(stepsDetailsArguments));
            return stepsDetailsDialog;
        }

        public a() {
        }
    }

    /* compiled from: StepsDetailsDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            StepsDetailsDialog stepsDetailsDialog = StepsDetailsDialog.this;
            ScreenPerformanceTracker screenPerformanceTracker = stepsDetailsDialog.f203814h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
            View viewFindViewById = view2.findViewById(R.id.steps);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.VerticalStepsBar");
            }
            VerticalStepsBar verticalStepsBar = (VerticalStepsBar) viewFindViewById;
            StepsDetailsArguments stepsDetailsArgumentsF5 = stepsDetailsDialog.f5();
            Iterable iterable = stepsDetailsArgumentsF5 != null ? stepsDetailsArgumentsF5.f203825c : null;
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            Iterable<StepDetailsModel> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
            for (StepDetailsModel stepDetailsModel : iterable2) {
                arrayList.add(new VerticalStepsBar.c(stepDetailsModel.f203821b, stepDetailsModel.f203822c, stepDetailsModel.f203823d, null, 8, null));
            }
            StepsDetailsArguments stepsDetailsArgumentsF52 = stepsDetailsDialog.f5();
            int i12 = stepsDetailsArgumentsF52 != null ? stepsDetailsArgumentsF52.f203826d : 0;
            int i13 = VerticalStepsBar.f203971y;
            verticalStepsBar.b(null, arrayList);
            verticalStepsBar.setCurrentStep(i12);
            ScreenPerformanceTracker screenPerformanceTracker2 = stepsDetailsDialog.f203814h0;
            if (screenPerformanceTracker2 == null) {
                screenPerformanceTracker2 = null;
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: StepsDetailsDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TZ.b f203817l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TZ.b bVar) {
            super(1);
            this.f203817l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            button.setText(R.string.button_understand);
            button.setOnClickListener(new TZ.a(this.f203817l, 3));
            return G0.f406611a;
        }
    }

    public StepsDetailsDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.mortgage.steps_details.di.a.a().a((o) C29972i.a(C29972i.b(this), o.class), new C28478k(MortgageStepsDetailsScreen.f90430d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f203814h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final StepsDetailsArguments f5() {
        Bundle bundleRequireArguments = requireArguments();
        return (StepsDetailsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("STEPS_DETAILS_DATA", StepsDetailsArguments.class) : bundleRequireArguments.getParcelable("STEPS_DETAILS_DATA"));
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f203814h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.B(R.layout.mortgage_steps_details_content_layout, R.layout.button_footer_layout, new b(), new c(bVar), false);
        StepsDetailsArguments stepsDetailsArgumentsF5 = f5();
        bVar.setTitle(stepsDetailsArgumentsF5 != null ? stepsDetailsArgumentsF5.f203824b : null);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f203814h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }
}
