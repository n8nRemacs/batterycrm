package com.avito.android.favorites;

import com.avito.android.remote.model.FavoritesResult;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/FavoritesResult;", "it", "Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "apply", "(Lcom/avito/android/remote/model/FavoritesResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30672l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30700w f157380b;

    public C30672l(C30700w c30700w) {
        this.f157380b = c30700w;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return C30700w.k(this.f157380b, (FavoritesResult) obj);
    }
}
