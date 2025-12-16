package com.avito.android.orders.badge_counter;

import com.avito.android.orders.api.model.OrdersBadgeResponse;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders/api/model/OrdersBadgeResponse;", "ordersBadgeResponse", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/orders/badge_counter/OrdersBadgeState;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f209953b;

    public i(f fVar) {
        this.f209953b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        OrdersBadgeState ordersBadgeState;
        TypedResult typedResult = (TypedResult) obj;
        int i12 = f.f209944e;
        f fVar = this.f209953b;
        fVar.getClass();
        if (typedResult instanceof TypedResult.Error) {
            ordersBadgeState = OrdersBadgeState.f209937d;
        } else {
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ordersBadgeState = ((OrdersBadgeResponse) ((TypedResult.Success) typedResult).getResult()).getShowOrdersBadge() ? OrdersBadgeState.f209936c : OrdersBadgeState.f209937d;
        }
        fVar.f209948d.accept(ordersBadgeState);
        return U.f403867b;
    }
}
