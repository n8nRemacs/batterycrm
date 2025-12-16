package com.avito.android.notifications_settings.screen.mvi;

import c40.InterfaceC26937b;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationsSettingsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lc40/b;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.arch.mvi.t<NotificationsSettingsInternalAction, InterfaceC26937b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC26937b b(NotificationsSettingsInternalAction notificationsSettingsInternalAction) {
        NotificationsSettingsInternalAction notificationsSettingsInternalAction2 = notificationsSettingsInternalAction;
        if (notificationsSettingsInternalAction2.equals(NotificationsSettingsInternalAction.OpenSettingsDialog.f208122b)) {
            return InterfaceC26937b.a.f57634a;
        }
        if (notificationsSettingsInternalAction2 instanceof NotificationsSettingsInternalAction.ShowSaveError) {
            return new InterfaceC26937b.C2029b(((NotificationsSettingsInternalAction.ShowSaveError) notificationsSettingsInternalAction2).f208123b);
        }
        return null;
    }
}
