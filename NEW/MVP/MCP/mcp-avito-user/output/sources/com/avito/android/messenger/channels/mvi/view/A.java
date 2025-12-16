package com.avito.android.messenger.channels.mvi.view;

import HY.c;
import com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.e;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/A;", "Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelsListFragment f188591a;

    public A(ChannelsListFragment channelsListFragment) {
        this.f188591a = channelsListFragment;
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.e.a
    public final void a() {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188591a.q5().accept(c.a.b.f7143a);
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.e.a
    public final void b() {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        this.f188591a.q5().accept(c.a.C0410a.f7142a);
    }
}
