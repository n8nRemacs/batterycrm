package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.remote.model.messenger.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChannelsResponse;

/* compiled from: Completables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31847m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelsResponse f188499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31829d f188500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f188502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet f188503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SortedSet f188504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Boolean f188505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f188506i;

    public C31847m(ChannelsResponse channelsResponse, C31829d c31829d, MessengerUserHashInfo messengerUserHashInfo, List list, SortedSet sortedSet, SortedSet sortedSet2, Boolean bool, ArrayList arrayList) {
        this.f188499b = channelsResponse;
        this.f188500c = c31829d;
        this.f188501d = messengerUserHashInfo;
        this.f188502e = list;
        this.f188503f = sortedSet;
        this.f188504g = sortedSet2;
        this.f188505h = bool;
        this.f188506i = arrayList;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Channel channel;
        if (!this.f188499b.getHasMore()) {
            return io.reactivex.rxjava3.core.I.q(ChannelSyncAgent.c.b.f188322a);
        }
        this.f188500c.f188433e.k(this.f188501d, (r8.getChannels().size() + this.f188502e.size()) - 1, this.f188503f, this.f188504g, this.f188505h).n(new C31849n());
        Iterator<T> it = this.f188506i.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                long updated = ((Channel) next).getUpdated();
                do {
                    T next2 = it.next();
                    long updated2 = ((Channel) next2).getUpdated();
                    if (updated < updated2) {
                        next = next2;
                        updated = updated2;
                    }
                } while (it.hasNext());
            }
            channel = next;
        } else {
            channel = null;
        }
        Channel channel2 = channel;
        return io.reactivex.rxjava3.core.I.q(new ChannelSyncAgent.c.a(channel2 != null ? channel2.getUpdated() : 0L));
    }
}
