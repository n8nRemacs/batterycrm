package com.avito.android.messenger.channels.filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelsFilterAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/filter/b;", "Lcom/avito/android/messenger/channels/filter/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f187148b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12) {
        this.f187147a = interfaceC28373a;
        this.f187148b = f12;
    }

    @Override // com.avito.android.messenger.channels.filter.a
    public final void a() {
        this.f187147a.c(new y.a(this.f187148b.a(NotificationsSettings.Section.SECTION_MESSENGER, "filter", "top_filter_all_clicked", "{{%app_ver%}}").f91030a, 1L));
    }

    @Override // com.avito.android.messenger.channels.filter.a
    public final void b() {
        this.f187147a.c(new y.a(this.f187148b.a(NotificationsSettings.Section.SECTION_MESSENGER, "filter", "icon_filter_applied", "{{%app_ver%}}").f91030a, 1L));
    }

    @Override // com.avito.android.messenger.channels.filter.a
    public final void c() {
        this.f187147a.c(new y.a(this.f187148b.a(NotificationsSettings.Section.SECTION_MESSENGER, "filter", "top_filter_unread_clicked", "{{%app_ver%}}").f91030a, 1L));
    }

    @Override // com.avito.android.messenger.channels.filter.a
    public final void d() {
        this.f187147a.c(new y.a(this.f187148b.a(NotificationsSettings.Section.SECTION_MESSENGER, "filter", "icon_filter_clicked", "{{%app_ver%}}").f91030a, 1L));
    }
}
