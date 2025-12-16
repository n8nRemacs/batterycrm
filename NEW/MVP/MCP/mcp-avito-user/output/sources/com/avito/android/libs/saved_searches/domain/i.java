package com.avito.android.libs.saved_searches.domain;

import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/domain/i;", "", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public interface i {

    /* compiled from: SearchSubscriptionInteractorRx.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    @InterfaceC42830m
    C41982q1 a(@Y61.k FavoritesSpace favoritesSpace);

    @Y61.k
    @InterfaceC42830m
    L0 b(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2);

    @Y61.k
    @InterfaceC42830m
    L0 k(@Y61.k String str);
}
