package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: ChannelsUpdateHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/Channel;", "channel", "Lru/avito/messenger/api/entity/Channel;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.b0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31826b0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188426c;

    public C31826b0(C31834f0 c31834f0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188425b = c31834f0;
        this.f188426c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f188425b.f188475d.c(this.f188426c, (Channel) obj);
    }
}
