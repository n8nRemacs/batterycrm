package com.avito.android.advert.item.ownership_cost.items.results;

import Ca1.ViewOnClickListenerC13236c;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CostTabsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/e;", "Lcom/avito/android/advert/item/ownership_cost/items/results/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f78044b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f78045c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f78046d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f78047e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super OwnershipCostResponse.OwnershipCostResults.CostResultTab, G0> f78048f;

    public e(@Y61.k View view, @Y61.k b bVar) {
        this.f78044b = bVar;
        View viewFindViewById = view.findViewById(R.id.tabs_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f78045c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rows_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f78046d = (LinearLayout) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.a
    public final void LG(@Y61.l Y41.l<? super OwnershipCostResponse.OwnershipCostResults.CostResultTab, G0> lVar) {
        throw null;
    }

    public final void a(View view, OwnershipCostResponse.OwnershipCostResults.CostResultTab costResultTab, boolean z12) {
        Y41.l<? super OwnershipCostResponse.OwnershipCostResults.CostResultTab, G0> lVar;
        if (view.isActivated()) {
            return;
        }
        if (!z12 && (lVar = this.f78048f) != null) {
            ((f) lVar).invoke(costResultTab);
        }
        View view2 = this.f78047e;
        if (view2 != null) {
            view2.setActivated(false);
            view2.setClickable(true);
        }
        view.setActivated(true);
        view.setClickable(false);
        this.f78047e = view;
        List<OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow> rows = costResultTab.getRows();
        OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow total = costResultTab.getTotal();
        LinearLayout linearLayout = this.f78046d;
        linearLayout.removeAllViews();
        List<OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow> list = rows;
        if ((list == null || list.isEmpty()) && total == null) {
            D6.w(linearLayout);
            return;
        }
        D6.H(linearLayout);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        LinearLayout linearLayout2 = this.f78045c;
        b bVar = this.f78044b;
        if (rows != null) {
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                linearLayout.addView(bVar.a((OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow) it.next(), linearLayout2, layoutInflaterFrom, false));
            }
        }
        if (total != null) {
            linearLayout.addView(bVar.a(total, linearLayout2, layoutInflaterFrom, true));
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.a
    public final void u4(@Y61.l List<OwnershipCostResponse.OwnershipCostResults.CostResultTab> list) {
        LinearLayout linearLayout = this.f78045c;
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f78046d;
        linearLayout2.removeAllViews();
        List<OwnershipCostResponse.OwnershipCostResults.CostResultTab> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(linearLayout);
            D6.w(linearLayout2);
            return;
        }
        D6.H(linearLayout);
        D6.H(linearLayout2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        for (OwnershipCostResponse.OwnershipCostResults.CostResultTab costResultTab : list) {
            TextView textViewB = this.f78044b.b(costResultTab.getTitle(), linearLayout, layoutInflaterFrom);
            textViewB.setOnClickListener(new ViewOnClickListenerC13236c((Object) this, (View) textViewB, (Parcelable) costResultTab, 4));
            ((LinearLayout.LayoutParams) textViewB.getLayoutParams()).weight = 1.0f;
            linearLayout.addView(textViewB);
        }
        a(linearLayout.getChildAt(0), (OwnershipCostResponse.OwnershipCostResults.CostResultTab) C42745f0.E(list), true);
    }
}
