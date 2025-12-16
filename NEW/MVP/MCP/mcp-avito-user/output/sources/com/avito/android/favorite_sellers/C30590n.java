package com.avito.android.favorite_sellers;

import kotlin.Metadata;

/* compiled from: FavoriteSellersInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/favorite_sellers/SubscribableItem;", "invoke", "(Lcom/avito/android/favorite_sellers/SubscribableItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30590n extends kotlin.jvm.internal.N implements Y41.l<SubscribableItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f156084l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30590n(String str) {
        super(1);
        this.f156084l = str;
    }

    @Override // Y41.l
    public final Boolean invoke(SubscribableItem subscribableItem) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(subscribableItem.getF155720c(), this.f156084l));
    }
}
