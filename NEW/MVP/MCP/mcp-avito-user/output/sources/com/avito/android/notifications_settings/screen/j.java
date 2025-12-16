package com.avito.android.notifications_settings.screen;

import com.avito.android.notifications_settings.info.NotificationsSettingsInfoItem;
import com.avito.android.notifications_settings.title.NotificationsSettingsTitleItem;
import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/screen/j;", "Lcom/avito/android/notifications_settings/screen/i;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements i {
    @Inject
    public j() {
    }

    @Override // com.avito.android.notifications_settings.screen.i
    @Y61.k
    public final ArrayList a(@Y61.k NotificationsSettings notificationsSettings, boolean z12) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : notificationsSettings.getSections()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            NotificationsSettings.Section section = (NotificationsSettings.Section) obj;
            arrayList.add(new NotificationsSettingsTitleItem("", section.getTitle(), section.getSubtitle()));
            for (NotificationsSettings.Section.Channel channel : section.getChannels()) {
                if (channel instanceof NotificationsSettings.Section.Channel.Push) {
                    arrayList.add(new NotificationsSettingsToggleItem("", section.getType(), channel.getType(), channel.getTitle(), z12 && channel.getValue()));
                } else {
                    arrayList.add(new NotificationsSettingsToggleItem("", section.getType(), channel.getType(), channel.getTitle(), channel.getValue()));
                }
            }
            i12 = i13;
        }
        arrayList.add(new NotificationsSettingsInfoItem("", notificationsSettings.getInfo()));
        return arrayList;
    }
}
