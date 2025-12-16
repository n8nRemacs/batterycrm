package com.avito.android.clientEventBus;

import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBuses.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class n<T, R> implements l41.o {

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118552a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f118552a = iArr;
        }
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (a.f118552a[((ConnectionState) obj).ordinal()] != 1) {
            return U.f403867b;
        }
        L.l();
        throw null;
    }
}
