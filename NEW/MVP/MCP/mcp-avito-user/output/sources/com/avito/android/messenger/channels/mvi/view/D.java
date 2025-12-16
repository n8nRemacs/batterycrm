package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.adapter.konveyor.support_channel.c;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/D;", "Lcom/avito/android/messenger/channels/adapter/konveyor/support_channel/c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelsListFragment f188648a;

    public D(ChannelsListFragment channelsListFragment) {
        this.f188648a = channelsListFragment;
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.support_channel.c.a
    public final void a(@Y61.k ChannelsListItem.g gVar, int i12) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188648a.q5().accept(new c.b.C0411b(gVar.f186827d, i12, ""));
    }
}
