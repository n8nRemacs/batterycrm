package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/i;", "event", "", "test", "(LX81/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32006u<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190400c;

    public C32006u(C31988b c31988b, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190399b = c31988b;
        this.f190400c = messengerUserHashInfo;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        X81.i iVar = (X81.i) obj;
        return kotlin.jvm.internal.L.f(iVar.getChannelId(), this.f190399b.f190241V) && !kotlin.jvm.internal.L.f(iVar.getFromId(), this.f190400c.f430682d);
    }
}
