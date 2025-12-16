package com.avito.android.sales_items;

import com.avito.android.remote.model.FavoriteSalesItemsCount;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: FavoriteSalesCounterInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/FavoriteSalesItemsCount;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f258225b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return z.c0(FavoriteSalesItemsCount.INSTANCE.empty());
    }
}
