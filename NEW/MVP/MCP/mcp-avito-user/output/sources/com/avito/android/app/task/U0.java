package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lorg/reactivestreams/c;", "", "Lj41/e;", "apply", "(Ljava/lang/Throwable;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class U0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f91534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91535c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91536d;

    public U0(AtomicInteger atomicInteger, LocalMessage localMessage, C28582o1 c28582o1) {
        this.f91534b = atomicInteger;
        this.f91535c = localMessage;
        this.f91536d = c28582o1;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        int i12 = this.f91534b.get();
        if (i12 >= 6 || (th2 instanceof NoRetryException)) {
            return AbstractC41777j.a(th2);
        }
        long j12 = 1 << i12;
        V2 v22 = V2.f318762a;
        StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "Retry after ", " seconds: ");
        sbQ.append(this.f91535c.getLocalId());
        v22.i("PendingMessageHandler", sbQ.toString(), null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.rxjava3.core.H hC2 = this.f91536d.f91675h.c();
        int i13 = AbstractC41777j.f401972b;
        Objects.requireNonNull(timeUnit, "unit is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.V1(Math.max(0L, j12), timeUnit, hC2);
    }
}
