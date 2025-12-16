package com.avito.android.orders.badge_counter;

import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import l41.o;

/* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "authorized", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/orders/badge_counter/OrdersBadgeState;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f209954b;

    public j(f fVar) {
        this.f209954b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f fVar = this.f209954b;
        if (zBooleanValue) {
            return fVar.f209945a.get().c().F().T(new i(fVar), Integer.MAX_VALUE);
        }
        fVar.f209948d.accept(OrdersBadgeState.f209937d);
        return U.f403867b;
    }
}
