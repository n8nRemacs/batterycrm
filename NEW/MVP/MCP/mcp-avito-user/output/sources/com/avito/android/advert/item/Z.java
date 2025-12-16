package com.avito.android.advert.item;

import com.avito.android.advert.item.similars.SimilarsStartMarkerItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import kotlin.Metadata;

/* compiled from: AdvertDetailsItemsPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "invoke", "(Lcom/avito/android/serp/adapter/PersistableSpannedItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.l<PersistableSpannedItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final Z f72291l = new Z();

    public Z() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(PersistableSpannedItem persistableSpannedItem) {
        return Boolean.valueOf(persistableSpannedItem instanceof SimilarsStartMarkerItem);
    }
}
