package com.avito.android.favorites;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/FavoritesResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30700w f157429b;

    public r(C30700w c30700w) {
        this.f157429b = c30700w;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        C30700w c30700w = this.f157429b;
        if (z12) {
            c30700w.f157577m.j();
        } else if (typedResult instanceof TypedResult.Error) {
            c30700w.f157577m.f(((TypedResult.Error) typedResult).getError());
        }
    }
}
