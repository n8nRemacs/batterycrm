package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsUpdateHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/messenger/Channel;", "kotlin.jvm.PlatformType", "channel", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/messenger/Channel;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.i0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31840i0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188492c;

    public C31840i0(C31834f0 c31834f0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188491b = c31834f0;
        this.f188492c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C31834f0 c31834f0 = this.f188491b;
        return c31834f0.f188473b.j(this.f188492c, (Channel) obj).q(c31834f0.f188472a.c());
    }
}
