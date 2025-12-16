package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32180t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193548d;

    public C32180t(int i12, C32141e.b bVar, C32141e c32141e) {
        this.f193546b = c32141e;
        this.f193547c = bVar;
        this.f193548d = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32141e c32141e = this.f193546b;
        c32141e.f192916j0.accept((Throwable) obj);
        C32141e.b bVar = this.f193547c;
        MessengerUserHashInfo messengerUserHashInfo = bVar.f192921d;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new C32179s(this.f193548d, bVar, c32141e));
    }
}
