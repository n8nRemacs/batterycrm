package com.avito.android.clientEventBus;

import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBuses.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/clientEventBus/k;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class r<T, R> implements l41.o {

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iOrdinal = ((ConnectionState) obj).ordinal();
        if (iOrdinal == 0) {
            new Date().getTime();
            throw null;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        new Date().getTime();
        throw null;
    }
}
