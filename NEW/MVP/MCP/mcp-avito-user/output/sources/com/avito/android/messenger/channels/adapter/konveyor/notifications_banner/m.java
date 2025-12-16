package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelsNotificationsBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/m;", "LTV0/d;", "Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/w;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$e;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements TV0.d<w, ChannelsListItem.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<a> f187006b;

    /* compiled from: ChannelsNotificationsBannerPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/m$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    @Inject
    public m(@Y61.k h31.e<a> eVar) {
        this.f187006b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((w) eVar).uq((ChannelsListItem.e) aVar, new n(this), new o(this));
    }
}
