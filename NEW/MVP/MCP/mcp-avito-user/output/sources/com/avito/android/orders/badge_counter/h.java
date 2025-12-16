package com.avito.android.orders.badge_counter;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: OrdersBadgeCounterRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/orders/badge_counter/OrdersBadgeState;", "kotlin.jvm.PlatformType", "apply", "(Lcom/avito/android/orders/badge_counter/OrdersBadgeState;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f209952b;

    public h(f fVar) {
        this.f209952b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int i12;
        int i13 = f.f209944e;
        this.f209952b.getClass();
        int iOrdinal = ((OrdersBadgeState) obj).ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        return Integer.valueOf(i12);
    }
}
