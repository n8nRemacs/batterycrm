package com.avito.android.advert.item.safedeal;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: CartItemInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/safedeal/a;", "typedResult", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class Q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f78762b;

    public Q(S s5) {
        this.f78762b = s5;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        return !(typedResult instanceof TypedResult.Success) ? io.reactivex.rxjava3.core.I.q(typedResult) : this.f78762b.f78764b.a(Integer.valueOf(((com.avito.android.remote.safedeal.a) ((TypedResult.Success) typedResult).getResult()).getQuantity())).B(typedResult);
    }
}
