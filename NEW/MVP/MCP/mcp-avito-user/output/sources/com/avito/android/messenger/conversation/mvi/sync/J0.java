package com.avito.android.messenger.conversation.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\u0003R\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194602b;

    public J0(C32293v0 c32293v0) {
        this.f194602b = c32293v0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        C32293v0 c32293v0 = this.f194602b;
        return c32293v0.f194857Z.K(new C32301z0(c32293v0, messengerUserHashInfo)).N(new A0(messengerUserHashInfo)).d0(new B0(c32293v0)).Z(C0.f194583b).T(new I0(c32293v0, messengerUserHashInfo), Integer.MAX_VALUE);
    }
}
