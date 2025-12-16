package com.avito.android.notifications_settings.toggle;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationsSettingsTogglePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/toggle/e;", "Lcom/avito/android/notifications_settings/toggle/c;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem> f208191b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<NotificationsSettingsToggleItem, G0> f208192c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem> dVar, @k l<? super NotificationsSettingsToggleItem, G0> lVar) {
        this.f208191b = dVar;
        this.f208192c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        NotificationsSettingsToggleItem notificationsSettingsToggleItem = (NotificationsSettingsToggleItem) aVar;
        gVar.setTitle(notificationsSettingsToggleItem.f208183e);
        gVar.setChecked(notificationsSettingsToggleItem.f208184f);
        gVar.fd(new d(this, notificationsSettingsToggleItem));
    }
}
