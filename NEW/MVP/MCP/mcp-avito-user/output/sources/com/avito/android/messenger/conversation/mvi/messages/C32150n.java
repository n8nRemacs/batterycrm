package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.sync.K;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K$c;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/sync/K$c;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32150n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193041d;

    public C32150n(C32141e c32141e, C32141e.b bVar, String str) {
        this.f193039b = c32141e;
        this.f193040c = bVar;
        this.f193041d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        K.c cVar = (K.c) obj;
        int i12 = cVar.f194605a;
        C32141e c32141e = this.f193039b;
        c32141e.getClass();
        int iNe = C32141e.ne(i12, null) * 100;
        C32141e.b bVar = this.f193040c;
        MessengerUserHashInfo messengerUserHashInfo = bVar.f192921d;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new C32149m(iNe, bVar, c32141e)).k(new C32148l(c32141e, this.f193041d, cVar.f194606b, iNe));
    }
}
