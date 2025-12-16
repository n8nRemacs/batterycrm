package com.avito.android.imv_cars_details.presentation.items.title_Item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/title_Item/f;", "Lcom/avito/android/imv_cars_details/presentation/items/title_Item/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f170249b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170250c;

    public f(@k View view) {
        super(view);
        this.f170249b = view;
        this.f170250c = (TextView) view;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.title_Item.e
    public final void b(@k String str) {
        I5.a(this.f170250c, str, false);
    }
}
