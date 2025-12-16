package com.avito.android.util.rx3;

import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: Observables.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f319005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f319006c;

    public O(TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f319005b = timeUnit;
        this.f319006c = h12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        Long l12 = (Long) q12.f406620c;
        C41998x0 c41998x0C0 = io.reactivex.rxjava3.core.z.c0(q12.f406619b);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jConvert = this.f319005b.convert(300L, timeUnit);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - l12.longValue() >= jConvert) {
            return c41998x0C0;
        }
        return c41998x0C0.z(l12.longValue() + (jConvert - jCurrentTimeMillis), timeUnit, this.f319006c);
    }
}
