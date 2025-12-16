package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: NotificationsSettingsSectionChannelDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationsSettingsSectionChannelDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationsSettingsSectionChannelDeserializer implements com.google.gson.h<NotificationsSettings.Section.Channel> {
    @Override // com.google.gson.h
    public final NotificationsSettings.Section.Channel deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("type").s();
        String strS2 = kVarI.D("title").s();
        boolean zD2 = kVarI.D("value").d();
        return kotlin.jvm.internal.L.f(strS, "email") ? new NotificationsSettings.Section.Channel.Email(strS, strS2, zD2) : kotlin.jvm.internal.L.f(strS, "push") ? new NotificationsSettings.Section.Channel.Push(strS, strS2, zD2) : new NotificationsSettings.Section.Channel.Other(strS, strS2, zD2);
    }
}
