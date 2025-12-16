package com.avito.android.item_price_history.deeplink;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemPriceHistoryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f173666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ItemPriceHistoryLink f173667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f173668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, ItemPriceHistoryLink itemPriceHistoryLink, boolean z12) {
        super(0);
        this.f173666l = bundle;
        this.f173667m = itemPriceHistoryLink;
        this.f173668n = z12;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        Bundle bundle = this.f173666l;
        String string = bundle != null ? bundle.getString("key.item_price_history_context") : null;
        ItemPriceHistoryDialogFragment.a aVar = ItemPriceHistoryDialogFragment.f173686u0;
        ItemPriceHistoryLink itemPriceHistoryLink = this.f173667m;
        ItemPriceHistoryInitialData itemPriceHistoryInitialData = new ItemPriceHistoryInitialData(itemPriceHistoryLink.f173659e, itemPriceHistoryLink.f173656b, itemPriceHistoryLink.f173657c, itemPriceHistoryLink.f173658d, string, this.f173668n);
        aVar.getClass();
        return ItemPriceHistoryDialogFragment.a.a(itemPriceHistoryInitialData);
    }
}
