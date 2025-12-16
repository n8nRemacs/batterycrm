package com.avito.android.mortgage.terms;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageTermsScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.MortgageTerms;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.terms.model.MortgageTermsArguments;
import com.avito.android.mortgage.widgets.StackedImageView;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageTermsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/terms/MortgageTermsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageTermsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f203827k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f203828h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f203829i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f203830j0;

    /* compiled from: MortgageTermsDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/terms/MortgageTermsDialog$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: MortgageTermsDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.terms.MortgageTermsDialog$a$a, reason: collision with other inner class name */
        public static final class C6078a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ MortgageTermsArguments f203831l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6078a(MortgageTermsArguments mortgageTermsArguments) {
                super(1);
                this.f203831l = mortgageTermsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("MORTGAGE_TERMS_ARGS", this.f203831l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static MortgageTermsDialog a(@k MortgageTermsArguments mortgageTermsArguments) {
            MortgageTermsDialog mortgageTermsDialog = new MortgageTermsDialog();
            C35966w1.a(mortgageTermsDialog, -1, new C6078a(mortgageTermsArguments));
            return mortgageTermsDialog;
        }

        public a() {
        }
    }

    /* compiled from: MortgageTermsDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            List<String> listD;
            View view2 = view;
            MortgageTermsDialog mortgageTermsDialog = MortgageTermsDialog.this;
            ScreenPerformanceTracker screenPerformanceTracker = mortgageTermsDialog.f203829i0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
            View viewFindViewById = view2.findViewById(R.id.terms);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            MortgageTerms mortgageTerms = mortgageTermsDialog.f5().f203842d;
            j.a(textView, mortgageTerms != null ? mortgageTerms.getTerms() : null, null);
            View viewFindViewById2 = view2.findViewById(R.id.banks);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.StackedImageView");
            }
            StackedImageView stackedImageView = (StackedImageView) viewFindViewById2;
            MortgageTerms mortgageTerms2 = mortgageTermsDialog.f5().f203842d;
            if (mortgageTerms2 == null || (listD = mortgageTerms2.d()) == null) {
                listD = C42784z0.f406748b;
            }
            List listE0 = C42745f0.E0(listD, 3);
            ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                arrayList.add(new StackedImageView.b.a((String) it.next(), Integer.valueOf(R.drawable.placeholder_circle_bg), Integer.valueOf(R.drawable.placeholder_circle_bg)));
            }
            if (arrayList.isEmpty()) {
                D6.w(stackedImageView);
            } else {
                stackedImageView.a(listD.size() - arrayList.size(), arrayList);
            }
            ScreenPerformanceTracker screenPerformanceTracker2 = mortgageTermsDialog.f203829i0;
            if (screenPerformanceTracker2 == null) {
                screenPerformanceTracker2 = null;
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageTermsDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TZ.b f203834m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TZ.b bVar) {
            super(1);
            this.f203834m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            ActionButton action;
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            D6.w((Button) viewFindViewById);
            View viewFindViewById2 = view2.findViewById(R.id.footer_secondary_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById2;
            a aVar = MortgageTermsDialog.f203827k0;
            MortgageTermsDialog mortgageTermsDialog = MortgageTermsDialog.this;
            MortgageTerms mortgageTerms = mortgageTermsDialog.f5().f203842d;
            com.avito.android.lib.design.button.b.a(button, (mortgageTerms == null || (action = mortgageTerms.getAction()) == null) ? null : action.getTitle(), false);
            button.setOnClickListener(new h(28, mortgageTermsDialog, this.f203834m));
            return G0.f406611a;
        }
    }

    public MortgageTermsDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.mortgage.terms.di.a.a().a((o) C29972i.a(C29972i.b(this), o.class), cv.c.b(this), new C28478k(MortgageTermsScreen.f90432d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f203829i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final MortgageTermsArguments f5() {
        Bundle bundleRequireArguments = requireArguments();
        return (MortgageTermsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("MORTGAGE_TERMS_ARGS", MortgageTermsArguments.class) : bundleRequireArguments.getParcelable("MORTGAGE_TERMS_ARGS"));
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f203829i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.B(R.layout.mortgage_terms_content, R.layout.button_footer_layout, new b(), new c(bVar), false);
        MortgageTerms mortgageTerms = f5().f203842d;
        bVar.setTitle(mortgageTerms != null ? mortgageTerms.getTitle() : null);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f203829i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }
}
