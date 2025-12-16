package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/v;", "event", "", "test", "(LX81/v;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class I<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190180c;

    public I(C31988b c31988b, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190179b = c31988b;
        this.f190180c = messengerUserHashInfo;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        X81.v vVar = (X81.v) obj;
        return kotlin.jvm.internal.L.f(vVar.getChannelId(), this.f190179b.f190241V) && kotlin.jvm.internal.L.f(vVar.getFromId(), this.f190180c.f430682d);
    }
}
