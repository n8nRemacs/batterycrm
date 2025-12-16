package com.avito.android.advert.item.ownership_cost.items.input_form;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostInputsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/input_form/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/k;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/d;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k, com.avito.android.advert.item.ownership_cost.items.input_form.views.d, com.avito.android.advert.item.ownership_cost.items.input_form.views.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f78009i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert.item.ownership_cost.items.input_form.views.e f78010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert.item.ownership_cost.items.input_form.views.b f78011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f78012d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f78013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f78014f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Input f78015g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f78016h;

    public l(@Y61.k View view, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f78010b = new com.avito.android.advert.item.ownership_cost.items.input_form.views.e(view);
        this.f78011c = new com.avito.android.advert.item.ownership_cost.items.input_form.views.b(view, interfaceC35745a5);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78012d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78013e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.region_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f78014f = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.region_select);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f78015g = (Input) viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void AF() {
        this.f78010b.AF();
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    public final void DN(@Y61.l String str) {
        Input.t(this.f78015g, str, false, 6);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void GU(boolean z12) {
        this.f78011c.GU(z12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void I0(int i12) {
        this.f78010b.I0(i12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void Y30(@Y61.l String str, @Y61.l Y41.l<? super String, G0> lVar) {
        this.f78010b.Y30(str, lVar);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    public final void ci(@Y61.l Y41.a aVar, @Y61.k String str, @Y61.l String str2) {
        this.f78014f.setTitle(str);
        Input input = this.f78015g;
        Input.t(input, str2, false, 6);
        input.setOnClickListener(new n(29, aVar));
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void e6(boolean z12) {
        this.f78011c.e6(z12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f78016h;
        if (aVar != null) {
            ((f) aVar).invoke();
        }
        this.f78016h = null;
        y yVar = this.f78011c.f78019d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        com.avito.android.advert.item.ownership_cost.items.input_form.views.e eVar = this.f78010b;
        s sVar = eVar.f78023d;
        if (sVar != null) {
            eVar.f78022c.h(sVar);
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    public final void n(@Y61.l String str) {
        I5.a(this.f78013e, str, false);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void pk(@Y61.k String str, @Y61.l Y41.a<G0> aVar) {
        this.f78011c.pk(str, aVar);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void sY(@Y61.l String str) {
        this.f78010b.sY(str);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    public final void setTitle(@Y61.k String str) {
        this.f78012d.setText(str);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.k
    public final void t(@Y61.l Y41.a<G0> aVar) {
        this.f78016h = aVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void xy(@Y61.k String str) {
        this.f78010b.xy(str);
    }
}
