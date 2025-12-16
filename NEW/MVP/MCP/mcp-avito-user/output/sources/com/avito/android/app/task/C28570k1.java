package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "sentMessage", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.k1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28570k1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28598u0 f91642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f91643d;

    public C28570k1(C28582o1 c28582o1, InterfaceC28598u0 interfaceC28598u0, AtomicInteger atomicInteger) {
        this.f91641b = c28582o1;
        this.f91642c = interfaceC28598u0;
        this.f91643d = atomicInteger;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LocalMessage localMessage = (LocalMessage) obj;
        C28582o1 c28582o1 = this.f91641b;
        return new C41821l(c28582o1.f91670c.f0(localMessage), new C28567j1(this.f91642c, c28582o1, localMessage, this.f91643d));
    }
}
