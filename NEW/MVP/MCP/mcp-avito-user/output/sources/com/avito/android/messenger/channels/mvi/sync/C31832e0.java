package com.avito.android.messenger.channels.mvi.sync;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsUpdateHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/Channel;", "updatedChannels", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31832e0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188471c;

    public C31832e0(C31834f0 c31834f0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188470b = c31834f0;
        this.f188471c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f188470b.f188473b.r(this.f188471c, (List) obj);
    }
}
