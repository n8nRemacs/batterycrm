package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: BbipPrivateCustomBudgetsWidgetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0005²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/r;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "", "Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/o;", "items", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f260820J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final TextView f260821E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final TextView f260822F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final ShimmerLayout f260823G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public Integer f260824H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Z1<List<o>> f260825I;

    /* compiled from: BbipPrivateCustomBudgetsWidgetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(60041955, new q(r.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public r(@Y61.k Context context, @Y61.k String str, @Y61.k String str2, int i12, @Y61.k Y41.l<? super Integer, G0> lVar) {
        super(context, 0, 2, null);
        this.f260825I = p2.a(C42784z0.f406748b);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        D(R.layout.bbip_private_custom_budgets_widget_view, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        ComposeView composeView = (ComposeView) findViewById(R.id.bbip_private_custom_budgets_compose_view);
        this.f260821E = (TextView) findViewById(R.id.bbip_private_custom_budgets_contacts_forecast);
        this.f260822F = (TextView) findViewById(R.id.bbip_private_custom_budgets_views_forecast);
        this.f260823G = (ShimmerLayout) findViewById(R.id.bbip_private_custom_budgets_forecast_shimmer);
        String strI = H.i(' ', str2, context.getResources().getQuantityString(R.plurals.duration, i12, Integer.valueOf(i12)));
        TextView textView = (TextView) findViewById(R.id.bbip_private_custom_budgets_forecast_subtitle);
        if (textView != null) {
            textView.setText(strI);
        }
        Button button = (Button) findViewById(R.id.bbip_private_custom_budgets_action);
        if (button != null) {
            button.setText(str);
            button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(26, (Y41.l) lVar, (Object) this));
        }
        if (composeView != null) {
            composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
            composeView.setContent(new C22096n(1223099102, new a(), true));
        }
    }

    public final void V(int i12) {
        Z1<List<o>> z12 = this.f260825I;
        o oVar = (o) C42745f0.K(i12, z12.getValue());
        if (oVar != null) {
            int i13 = oVar.f260812a;
            this.f260824H = Integer.valueOf(i13);
            TextView textView = this.f260821E;
            String str = oVar.f260815d;
            if (textView != null) {
                I5.a(textView, str, false);
            }
            TextView textView2 = this.f260822F;
            String str2 = oVar.f260816e;
            if (textView2 != null) {
                I5.a(textView2, str2, false);
            }
            ShimmerLayout shimmerLayout = this.f260823G;
            if (str == null || str2 == null) {
                if (shimmerLayout != null) {
                    D6.H(shimmerLayout);
                }
                if (shimmerLayout != null) {
                    shimmerLayout.c();
                }
            } else {
                if (shimmerLayout != null) {
                    shimmerLayout.d();
                }
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                }
            }
            List<o> value = z12.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(value, 10));
            for (o oVar2 : value) {
                arrayList.add(o.a(oVar2, oVar2.f260812a == i13));
            }
            z12.setValue(arrayList);
        }
    }
}
