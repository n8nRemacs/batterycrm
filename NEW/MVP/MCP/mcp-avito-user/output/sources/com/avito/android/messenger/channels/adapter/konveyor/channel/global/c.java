package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelItemPresenterGlobal.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/c;", "LTV0/d;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/g;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements TV0.d<g, ChannelsListItem.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<a> f186859b;

    /* compiled from: ChannelItemPresenterGlobal.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/c$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k ChannelsListItem.b bVar);

        void b(@k ChannelsListItem.b bVar, int i12);
    }

    @Inject
    public c(@k h31.e<a> eVar) {
        this.f186859b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ChannelsListItem.b bVar = (ChannelsListItem.b) aVar;
        ((g) eVar).fW(bVar, new d(this, bVar, i12), new e(this, bVar));
    }
}
