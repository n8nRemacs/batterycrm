package com.avito.android.messenger.conversation.mvi.context;

import arrow.core.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Larrow/core/Y0;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class S<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final S<T, R> f190194b = new S<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!o0.b(messengerUserHashInfo)) {
            messengerUserHashInfo = null;
        }
        return Z0.b(messengerUserHashInfo);
    }
}
