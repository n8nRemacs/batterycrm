package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsUpdateHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/Channel;", "newChannel", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/messenger/Channel;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31828c0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188428c;

    public C31828c0(C31834f0 c31834f0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188427b = c31834f0;
        this.f188428c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C31834f0 c31834f0 = this.f188427b;
        return c31834f0.f188473b.j(this.f188428c, (Channel) obj).q(c31834f0.f188472a.c());
    }
}
