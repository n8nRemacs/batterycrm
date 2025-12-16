package com.avito.android.messenger.channels.mvi.sync;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsResponse;

/* compiled from: ChannelSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsResponse;", "chatsFromServerResponse", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "apply", "(Lru/avito/messenger/api/entity/ChannelsResponse;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31851o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31829d f188510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188511c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Long> f188512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SortedSet<String> f188513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet<String> f188514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f188515g;

    public C31851o(C31829d c31829d, MessengerUserHashInfo messengerUserHashInfo, List<Long> list, SortedSet<String> sortedSet, SortedSet<String> sortedSet2, Boolean bool) {
        this.f188510b = c31829d;
        this.f188511c = messengerUserHashInfo;
        this.f188512d = list;
        this.f188513e = sortedSet;
        this.f188514f = sortedSet2;
        this.f188515g = bool;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ChannelsResponse channelsResponse = (ChannelsResponse) obj;
        List<Channel> channels = channelsResponse.getChannels();
        ArrayList arrayList = new ArrayList(C42745f0.q(channels, 10));
        Iterator<T> it = channels.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C31829d c31829d = this.f188510b;
            MessengerUserHashInfo messengerUserHashInfo = this.f188511c;
            if (!zHasNext) {
                io.reactivex.rxjava3.internal.operators.completable.T tB2 = c31829d.f188433e.r(messengerUserHashInfo, arrayList).B(kotlin.G0.f406611a);
                SortedSet<String> sortedSet = this.f188514f;
                return tB2.n(new C31847m(channelsResponse, this.f188510b, this.f188511c, this.f188512d, this.f188513e, sortedSet, this.f188515g, arrayList));
            }
            arrayList.add(c31829d.f188432d.c(messengerUserHashInfo, (Channel) it.next()));
        }
    }
}
