package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessageInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody;", "messageBody", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Lcom/avito/android/remote/model/messenger/message/MessageBody;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32245x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f194569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Quote f194571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f194572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194573f;

    public C32245x(A a12, MessengerUserHashInfo messengerUserHashInfo, Quote quote, Long l12, AtomicBoolean atomicBoolean) {
        this.f194569b = a12;
        this.f194570c = messengerUserHashInfo;
        this.f194571d = quote;
        this.f194572e = l12;
        this.f194573f = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessageBody messageBody = (MessageBody) obj;
        Quote quote = this.f194571d;
        Quote quote2 = (quote == null || !this.f194573f.getAndSet(false)) ? null : quote;
        A a12 = this.f194569b;
        return A.k(a12, messageBody, this.f194570c, quote2, a12.f194165i.f189243f, this.f194572e, null, 2300);
    }
}
