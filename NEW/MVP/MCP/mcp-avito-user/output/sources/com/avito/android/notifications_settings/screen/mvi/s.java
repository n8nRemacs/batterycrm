package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationsSettingsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements u<NotificationsSettingsInternalAction, NotificationsSettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notifications_settings.screen.i f208163b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f208164c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I30.d f208165d;

    @Inject
    public s(@Y61.k com.avito.android.notifications_settings.screen.i iVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k I30.d dVar) {
        this.f208163b = iVar;
        this.f208164c = interfaceC35741a1;
        this.f208165d = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final NotificationsSettingsState a(NotificationsSettingsInternalAction notificationsSettingsInternalAction, NotificationsSettingsState notificationsSettingsState) {
        NotificationsSettingsInternalAction notificationsSettingsInternalAction2 = notificationsSettingsInternalAction;
        NotificationsSettingsState notificationsSettingsState2 = notificationsSettingsState;
        boolean z12 = notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.Content;
        com.avito.android.notifications_settings.screen.i iVar = this.f208163b;
        I30.d dVar = this.f208165d;
        if (z12) {
            NotificationsSettingsInternalAction.Content content = (NotificationsSettingsInternalAction.Content) notificationsSettingsInternalAction2;
            return new NotificationsSettingsState(dVar.b(), false, null, iVar.a(content.f208119b, dVar.b()), content.f208119b);
        }
        if (notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.UpdateContent) {
            NotificationsSettingsInternalAction.UpdateContent updateContent = (NotificationsSettingsInternalAction.UpdateContent) notificationsSettingsInternalAction2;
            return NotificationsSettingsState.a(notificationsSettingsState2, dVar.b(), false, null, iVar.a(updateContent.f208124b, dVar.b()), updateContent.f208124b, 6);
        }
        if (notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.Error) {
            return NotificationsSettingsState.a(notificationsSettingsState2, false, false, InterfaceC35741a1.a.a(this.f208164c, ((NotificationsSettingsInternalAction.Error) notificationsSettingsInternalAction2).f208120b, null, null, 6), null, null, 25);
        }
        if (notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.Loading) {
            return NotificationsSettingsState.a(notificationsSettingsState2, false, true, null, null, null, 29);
        }
        if (notificationsSettingsInternalAction2.equals(NotificationsSettingsInternalAction.UpdateNotificationsEnabled.f208125b)) {
            boolean zB2 = dVar.b();
            NotificationsSettings notificationsSettings = notificationsSettingsState2.f208130f;
            return NotificationsSettingsState.a(notificationsSettingsState2, zB2, false, null, notificationsSettings != null ? iVar.a(notificationsSettings, dVar.b()) : null, null, 22);
        }
        if (notificationsSettingsInternalAction2.equals(NotificationsSettingsInternalAction.OpenSettingsDialog.f208122b) ? true : notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.ShowSaveError) {
            return notificationsSettingsState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
