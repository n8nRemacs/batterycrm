package com.avito.android.favorites;

import com.avito.android.remote.model.FavoritesRemoveAdvertResponse;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/FavoritesRemoveAdvertResponse;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/FavoritesRemoveAdvertResponse;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30696u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30700w f157548b;

    public C30696u(C30700w c30700w) {
        this.f157548b = c30700w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // l41.o
    public final Object apply(Object obj) {
        ?? arrayList;
        List<Long> removedIds = ((FavoritesRemoveAdvertResponse) obj).getRemovedIds();
        if (removedIds != null) {
            List<Long> list = removedIds;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        C30700w c30700w = this.f157548b;
        c30700w.m(null, C42745f0.h0(c30700w.f157576l.f156272e ? c30700w.f157568d.l() : C42784z0.f406748b, (Collection) arrayList), null);
        return c30700w.f157576l.f156272e ? new C41986s0(io.reactivex.rxjava3.core.z.W(new CallableC30668j(c30700w, 1))) : C41823n.f402260b;
    }
}
