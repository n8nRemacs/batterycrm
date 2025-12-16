package com.avito.android.favorites;

import com.avito.android.remote.model.FavoritesRemoveAdvertResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/FavoritesRemoveAdvertResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/FavoritesRemoveAdvertResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30698v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30700w f157558b;

    public C30698v(C30700w c30700w) {
        this.f157558b = c30700w;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<Long> removedIds = ((FavoritesRemoveAdvertResponse) obj).getRemovedIds();
        if (removedIds != null) {
            List<Long> list = removedIds;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            this.f157558b.m(null, arrayList, null);
        }
    }
}
