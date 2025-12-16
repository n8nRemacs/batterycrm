package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/messages/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32182v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193645c;

    public C32182v(C32141e c32141e, C32141e.b bVar) {
        this.f193644b = c32141e;
        this.f193645c = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32141e.b bVar = this.f193645c;
        MessengerUserHashInfo messengerUserHashInfo = bVar.f192921d;
        C32141e c32141e = this.f193644b;
        io.reactivex.rxjava3.disposables.c cVar = c32141e.f192913g0;
        int iG2 = cVar.g();
        Integer num = bVar.f192923f;
        InterfaceC35745a5 interfaceC35745a5 = c32141e.f207133K;
        if (iG2 == 0) {
            cVar.b(c32141e.f192902V.j(c32141e.f192907a0, messengerUserHashInfo).j0(interfaceC35745a5.a()).N(new T(num)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).D0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).x0(interfaceC35745a5.a()).t0(new U(c32141e)));
        }
        io.reactivex.rxjava3.disposables.c cVar2 = c32141e.f192914h0;
        if (cVar2.g() == 0) {
            cVar2.b(c32141e.f192904X.C(X81.k.class).j0(interfaceC35745a5.a()).N(new W(c32141e)).x0(interfaceC35745a5.a()).t0(new X(c32141e, bVar.f192921d, num)));
        }
    }
}
