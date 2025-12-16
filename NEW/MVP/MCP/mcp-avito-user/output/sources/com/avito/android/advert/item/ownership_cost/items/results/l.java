package com.avito.android.advert.item.ownership_cost.items.results;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.OwnershipCostButton;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostResultsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/ownership_cost/items/results/j;", "Lcom/avito/android/advert/item/ownership_cost/items/results/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements j, a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f78065h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f78066b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f78067c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f78068d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f78069e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f78070f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f78071g;

    public l(@Y61.k View view, @Y61.k b bVar) {
        super(view);
        this.f78066b = new e(view, bVar);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78067c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78068d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.links_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f78069e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.first_link);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78070f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.second_link);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78071g = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.a
    public final void LG(@Y61.l Y41.l<? super OwnershipCostResponse.OwnershipCostResults.CostResultTab, G0> lVar) {
        this.f78066b.f78048f = lVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.j
    public final void Xl(@Y61.k final Y41.l lVar, @Y61.l List list) {
        boolean zA2 = O2.a(list);
        D6.G(this.f78069e, zA2);
        TextView textView = this.f78070f;
        D6.G(textView, zA2);
        TextView textView2 = this.f78071g;
        D6.G(textView2, zA2);
        if (zA2) {
            final OwnershipCostButton ownershipCostButton = (OwnershipCostButton) C42745f0.K(0, list);
            if (ownershipCostButton != null) {
                textView.setText(ownershipCostButton.getLabel());
                final int i12 = 0;
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.ownership_cost.items.results.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnershipCostButton ownershipCostButton2 = ownershipCostButton;
                        Y41.l lVar2 = lVar;
                        switch (i12) {
                            case 0:
                                int i13 = l.f78065h;
                                lVar2.invoke(ownershipCostButton2);
                                break;
                            default:
                                int i14 = l.f78065h;
                                lVar2.invoke(ownershipCostButton2);
                                break;
                        }
                    }
                });
            }
            final OwnershipCostButton ownershipCostButton2 = (OwnershipCostButton) C42745f0.K(1, list);
            if (ownershipCostButton2 != null) {
                textView2.setText(ownershipCostButton2.getLabel());
                final int i13 = 1;
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.ownership_cost.items.results.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnershipCostButton ownershipCostButton22 = ownershipCostButton2;
                        Y41.l lVar2 = lVar;
                        switch (i13) {
                            case 0:
                                int i132 = l.f78065h;
                                lVar2.invoke(ownershipCostButton22);
                                break;
                            default:
                                int i14 = l.f78065h;
                                lVar2.invoke(ownershipCostButton22);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.j
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        e eVar = this.f78066b;
        eVar.f78047e = null;
        eVar.f78048f = null;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.j
    public final void n(@Y61.l String str) {
        I5.a(this.f78068d, str, false);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.j
    public final void setTitle(@Y61.k String str) {
        this.f78067c.setText(str);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.a
    public final void u4(@Y61.l List<OwnershipCostResponse.OwnershipCostResults.CostResultTab> list) {
        this.f78066b.u4(list);
    }
}
