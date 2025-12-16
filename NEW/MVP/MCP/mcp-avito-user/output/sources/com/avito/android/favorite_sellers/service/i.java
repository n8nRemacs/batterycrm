package com.avito.android.favorite_sellers.service;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: FavoriteSellerServiceIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/service/i;", "Lcom/avito/android/favorite_sellers/service/h;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f156124a;

    @Inject
    public i(@Y61.k Context context) {
        this.f156124a = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    @Override // com.avito.android.favorite_sellers.service.h
    @Y61.k
    public final Intent a(@Y61.k String str, int i12, @Y61.l String str2, @Y61.k String str3, @Y61.l LinkedHashMap linkedHashMap) {
        Intent intentPutExtra = new Intent(this.f156124a, (Class<?>) FavoriteSellerService.class).putExtra("action", FavoriteSellerServiceAction.f156111b).putExtra("user_key", str).putExtra("notification_id", i12).putExtra("notification_tag", str2);
        LinkedHashMap linkedHashMapC = linkedHashMap;
        if (linkedHashMap == null) {
            linkedHashMapC = P0.c();
        }
        return intentPutExtra.putExtra("notification_analytics", new NotificationAnalyticParams(linkedHashMapC, str3));
    }
}
