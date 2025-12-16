package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "LX81/i;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32007v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190401b;

    public C32007v(C31988b c31988b) {
        this.f190401b = c31988b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C31988b c31988b = this.f190401b;
        return c31988b.f190243X.C(X81.i.class).N(new C32006u(c31988b, (MessengerUserHashInfo) obj));
    }
}
