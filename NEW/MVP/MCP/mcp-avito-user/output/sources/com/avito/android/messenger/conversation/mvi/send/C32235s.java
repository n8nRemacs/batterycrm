package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.InterfaceC32218j;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessageInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/j$a;", "photo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/send/j$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32235s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f194549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Quote f194552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194553f;

    public C32235s(A a12, String str, MessengerUserHashInfo messengerUserHashInfo, Quote quote, AtomicBoolean atomicBoolean) {
        this.f194549b = a12;
        this.f194550c = str;
        this.f194551d = messengerUserHashInfo;
        this.f194552e = quote;
        this.f194553f = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC32218j.a aVar = (InterfaceC32218j.a) obj;
        MessageBody.LocalImage localImage = new MessageBody.LocalImage(aVar.f194523b, this.f194550c, aVar.f194522a);
        Quote quote = this.f194552e;
        return A.k(this.f194549b, localImage, this.f194551d, (quote == null || !this.f194553f.getAndSet(false)) ? null : quote, null, null, null, 3836);
    }
}
