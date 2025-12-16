package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000b\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/j;", "", "errors", "Lorg/reactivestreams/c;", "Lj41/e;", "apply", "(Lio/reactivex/rxjava3/core/j;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class V0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f91541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91543d;

    public V0(AtomicInteger atomicInteger, LocalMessage localMessage, C28582o1 c28582o1) {
        this.f91541b = atomicInteger;
        this.f91542c = localMessage;
        this.f91543d = c28582o1;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((AbstractC41777j) obj).c(FlowableInternalHelper.a(new U0(this.f91541b, this.f91542c, this.f91543d)));
    }
}
