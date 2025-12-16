package com.avito.android.favorite_sellers;

import android.net.Uri;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoriteSellersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/l;", "", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30588l {

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.l$a */
    public static final class a {
    }

    @Y61.k
    C43152f0 a(@Y61.k List list);

    @Y61.k
    InterfaceC43160i<FavoriteSellersInternalAction> b();

    @Y61.k
    InterfaceC43160i<FavoriteSellersInternalAction> c(boolean z12);

    @Y61.k
    InterfaceC43160i d(int i12, int i13, @Y61.k List list);

    @Y61.k
    InterfaceC43160i<FavoriteSellersInternalAction> e(@Y61.k SubscribableItem subscribableItem);

    @Y61.k
    C43152f0 f(@Y61.k SubscribableItem subscribableItem);

    @Y61.k
    InterfaceC43160i<FavoriteSellersInternalAction> g(@Y61.k Uri uri);

    @Y61.k
    InterfaceC43160i<FavoriteSellersInternalAction> h(@Y61.k SubscribableItem subscribableItem);

    @Y61.k
    List i(@Y61.k String str, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k List list);
}
