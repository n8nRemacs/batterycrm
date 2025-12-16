package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.adapter.konveyor.channel.c;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/y;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.view.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31895y implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelsListFragment f188844a;

    public C31895y(ChannelsListFragment channelsListFragment) {
        this.f188844a = channelsListFragment;
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void a(@Y61.k ChannelsListItem.b bVar) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.k(bVar));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void b(@Y61.k ChannelsListItem.b bVar, int i12) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.C0411b(bVar.f186789d, i12, bVar.f186809x));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void c(@Y61.k ChannelsListItem.b bVar) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.d(bVar.f186789d, bVar.f186790e));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void d(@Y61.k ChannelsListItem.b bVar) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.e(bVar));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void e(@Y61.k ChannelsListItem.b bVar, boolean z12) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.i(bVar, z12));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.c.a
    public final void f(@Y61.k ChannelsListItem.b bVar, boolean z12) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188844a.q5().accept(new c.b.j(bVar, z12));
    }
}
