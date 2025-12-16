package com.avito.android.messenger.conversation.mvi.send;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00020\u00000\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/P0;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.w0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32244w0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194568b;

    public C32244w0(D d12) {
        this.f194568b = d12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406619b;
        String str = (String) q12.f406620c;
        return this.f194568b.f194203f0.b(str, messengerUserHashInfo).d0(new C32242v0(str));
    }
}
