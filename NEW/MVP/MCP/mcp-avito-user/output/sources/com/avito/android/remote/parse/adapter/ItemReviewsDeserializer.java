package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemReviewsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ItemReviewsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/item_reviews/ItemReviews;", "<init>", "()V", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemReviewsDeserializer implements com.google.gson.h<ItemReviews> {
    @Override // com.google.gson.h
    public final ItemReviews deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("header");
        ItemReviewsHeader itemReviewsHeader = (ItemReviewsHeader) (iVarD == null ? null : gVar.b(iVarD, ItemReviewsHeader.class));
        com.google.gson.i iVarD2 = kVarI.D("type");
        ItemReviews.Type type2 = (ItemReviews.Type) (iVarD2 == null ? null : gVar.b(iVarD2, ItemReviews.Type.class));
        com.google.gson.i iVarD3 = kVarI.D("main");
        return new ItemReviews(type2, itemReviewsHeader, (ItemReviewsMain) (iVarD3 != null ? gVar.b(iVarD3, ItemReviewsMain.class) : null));
    }
}
