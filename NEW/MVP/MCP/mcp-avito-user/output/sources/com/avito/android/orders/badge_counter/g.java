package com.avito.android.orders.badge_counter;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/orders/badge_counter/OrdersBadgeState;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/orders/badge_counter/OrdersBadgeState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f209951b;

    public g(f fVar) {
        this.f209951b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        OrdersBadgeState ordersBadgeState = (OrdersBadgeState) obj;
        OrdersBadgeState ordersBadgeState2 = OrdersBadgeState.f209935b;
        if (ordersBadgeState != ordersBadgeState2) {
            return z.c0(ordersBadgeState);
        }
        f fVar = this.f209951b;
        return z.q(z.c0(ordersBadgeState2), fVar.f209947c.o().p(new j(fVar)).l0(new k(fVar)));
    }
}
