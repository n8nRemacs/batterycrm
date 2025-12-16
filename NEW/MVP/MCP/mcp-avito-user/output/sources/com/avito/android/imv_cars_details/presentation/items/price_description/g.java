package com.avito.android.imv_cars_details.presentation.items.price_description;

import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.remote.imv_cars_details.models.ImvPriceDetails;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsPriceDescriptionsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/price_description/g;", "Lcom/avito/android/imv_cars_details/presentation/items/price_description/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f170205b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ViewGroup f170206c;

    public g(@Y61.k View view) {
        super(view);
        this.f170205b = new a();
        this.f170206c = view instanceof ViewGroup ? (ViewGroup) view : null;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.price_description.f
    public final void PS() {
        D6.w(this.f170206c);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.price_description.f
    public final void Ph(@l ImvPriceDetails imvPriceDetails, @l ImvPriceDetails imvPriceDetails2) {
        ViewGroup viewGroup = this.f170206c;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.f170205b.getClass();
        List listA = a.a(imvPriceDetails, viewGroup);
        List listA2 = a.a(imvPriceDetails2, viewGroup);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
        }
        Iterator it2 = listA2.iterator();
        while (it2.hasNext()) {
            viewGroup.addView((View) it2.next());
        }
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.price_description.f
    public final void Ul() {
        D6.H(this.f170206c);
    }
}
