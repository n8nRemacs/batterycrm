package com.avito.android.app.task;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "allPendingMessagesObservable", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lio/reactivex/rxjava3/core/z;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.e1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28552e1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f91589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91590d;

    public C28552e1(C28582o1 c28582o1, io.reactivex.rxjava3.core.H h12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f91588b = c28582o1;
        this.f91589c = messengerUserHashInfo;
        this.f91590d = h12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.z zVar = (io.reactivex.rxjava3.core.z) obj;
        C28582o1 c28582o1 = this.f91588b;
        c28582o1.getClass();
        T0 t02 = T0.f91530l;
        MessengerUserHashInfo messengerUserHashInfo = this.f91589c;
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = zVar.d0(new S0(messengerUserHashInfo, t02));
        io.reactivex.rxjava3.core.H h12 = this.f91590d;
        return io.reactivex.rxjava3.core.z.g0(c28582o1.b(b0D0, messengerUserHashInfo, h12).A(), c28582o1.b(zVar.d0(new S0(messengerUserHashInfo, R0.f91506l)), messengerUserHashInfo, h12).A());
    }
}
