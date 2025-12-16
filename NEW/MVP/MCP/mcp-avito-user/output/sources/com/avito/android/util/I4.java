package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: Retries.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "e", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class I4<T, R> implements l41.o {
    static {
        new I4();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        return th2 instanceof ShouldRetryException ? io.reactivex.rxjava3.core.I.q(((ShouldRetryException) th2).f318735b) : io.reactivex.rxjava3.core.I.l(th2);
    }
}
