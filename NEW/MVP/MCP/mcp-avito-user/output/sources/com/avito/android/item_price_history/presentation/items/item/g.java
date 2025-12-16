package com.avito.android.item_price_history.presentation.items.item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: ItemPriceHistoryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/presentation/items/item/g;", "Lcom/avito/android/item_price_history/presentation/items/item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f173766b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f173767c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f173768d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f173769e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f173770f;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f173766b = aVar;
        this.f173767c = (TextView) view.findViewById(R.id.date);
        this.f173768d = (TextView) view.findViewById(R.id.description);
        this.f173769e = (TextView) view.findViewById(R.id.price);
        this.f173770f = (TextView) view.findViewById(R.id.priceDelta);
    }

    @Override // com.avito.android.item_price_history.presentation.items.item.f
    public final void cM(@k ItemPriceHistoryItemItem itemPriceHistoryItemItem) {
        TextView textView = this.f173767c;
        AttributedText attributedText = itemPriceHistoryItemItem.f173754c;
        com.avito.android.util.text.a aVar = this.f173766b;
        j.a(textView, attributedText, aVar);
        j.a(this.f173768d, itemPriceHistoryItemItem.f173755d, aVar);
        j.a(this.f173769e, itemPriceHistoryItemItem.f173756e, aVar);
        j.a(this.f173770f, itemPriceHistoryItemItem.f173757f, aVar);
    }
}
