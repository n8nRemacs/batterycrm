package com.avito.android.advert.item.ownership_cost.items;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.RunnableC22211b;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/ownership_cost/items/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f78030i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f78031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.ownership_cost.items.results.j f78032c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f78033d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f78034e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f78035f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f78036g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f78037h;

    public l(@Y61.k View view, @Y61.k i iVar) {
        super(view);
        this.f78031b = iVar;
        View viewFindViewById = view.findViewById(R.id.content_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f78033d = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ownership_cost_top_divider);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f78034e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ownership_cost_bottom_divider);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f78035f = viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    public final void D30(boolean z12) {
        D6.G(this.f78034e, z12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    public final void E4(@Y61.l Y41.a<G0> aVar) {
        this.f78036g = aVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    public final void Ij(@Y61.k Y41.a<G0> aVar) {
        this.f78037h = aVar;
        this.itemView.post(new RunnableC22211b(2, aVar));
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    public final void WD() {
        ViewGroup viewGroup = this.f78033d;
        viewGroup.removeAllViews();
        D6.w(viewGroup);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.items.results.j Zo() {
        com.avito.android.advert.item.ownership_cost.items.results.j jVar = this.f78032c;
        if (jVar != null) {
            return jVar;
        }
        i iVar = this.f78031b;
        ViewGroup viewGroup = this.f78033d;
        com.avito.android.advert.item.ownership_cost.items.results.l lVarA = iVar.a(viewGroup);
        D6.G(viewGroup, true);
        this.f78032c = lVarA;
        return lVarA;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f78037h;
        if (aVar != null) {
            this.itemView.removeCallbacks(new RunnableC22211b(3, aVar));
        }
        this.f78037h = null;
        Y41.a<G0> aVar2 = this.f78036g;
        if (aVar2 != null) {
            ((e) aVar2).invoke();
        }
        this.f78036g = null;
        com.avito.android.advert.item.ownership_cost.items.results.j jVar = this.f78032c;
        if (jVar != null) {
            jVar.j5();
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.h
    public final void xS(boolean z12) {
        D6.G(this.f78035f, z12);
    }
}
