package com.avito.android.remote.model.notifications_settings;

import Jk0.C14207a;
import Jk0.C14208b;
import Jk0.C14209c;
import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsEntityMapper.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJk0/c;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings;", "toNotificationsSettings", "(LJk0/c;)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings;", "LJk0/a;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section;", "toSection", "(LJk0/a;)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section;", "LJk0/b;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "toChannel", "(LJk0/b;)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "_avito-discouraged_avito-api_notifications"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationsSettingsEntityMapperKt {
    @k
    public static final NotificationsSettings.Section.Channel toChannel(@k C14208b c14208b) {
        String type = c14208b.getType();
        return L.f(type, "email") ? new NotificationsSettings.Section.Channel.Email(c14208b.getType(), c14208b.getTitle(), c14208b.getValue()) : L.f(type, "push") ? new NotificationsSettings.Section.Channel.Push(c14208b.getType(), c14208b.getTitle(), c14208b.getValue()) : new NotificationsSettings.Section.Channel.Other(c14208b.getType(), c14208b.getTitle(), c14208b.getValue());
    }

    @k
    public static final NotificationsSettings toNotificationsSettings(@k C14209c c14209c) {
        String info = c14209c.getInfo();
        List<C14207a> listB = c14209c.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(toSection((C14207a) it.next()));
        }
        return new NotificationsSettings(arrayList, info);
    }

    @k
    public static final NotificationsSettings.Section toSection(@k C14207a c14207a) {
        String type = c14207a.getType();
        String title = c14207a.getTitle();
        String subtitle = c14207a.getSubtitle();
        List<C14208b> listA = c14207a.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(toChannel((C14208b) it.next()));
        }
        return new NotificationsSettings.Section(type, title, subtitle, arrayList);
    }
}
