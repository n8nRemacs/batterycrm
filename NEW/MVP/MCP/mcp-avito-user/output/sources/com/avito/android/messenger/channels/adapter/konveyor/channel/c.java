package com.avito.android.messenger.channels.adapter.konveyor.channel;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/c;", "LTV0/d;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/k;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements TV0.d<k, ChannelsListItem.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<a> f186840b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b f186841c;

    /* compiled from: ChannelItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/c$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k ChannelsListItem.b bVar);

        void b(@Y61.k ChannelsListItem.b bVar, int i12);

        void c(@Y61.k ChannelsListItem.b bVar);

        void d(@Y61.k ChannelsListItem.b bVar);

        void e(@Y61.k ChannelsListItem.b bVar, boolean z12);

        void f(@Y61.k ChannelsListItem.b bVar, boolean z12);
    }

    @Inject
    public c(@Y61.k h31.e<a> eVar, @Y61.k com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b bVar) {
        this.f186840b = eVar;
        this.f186841c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ChannelsListItem.b bVar = (ChannelsListItem.b) aVar;
        ((k) eVar).aL(bVar, this.f186841c, new d(this, bVar, i12), new e(this, bVar), new f(this, bVar), new g(this, bVar), new h(this, bVar), new i(this, bVar));
    }
}
