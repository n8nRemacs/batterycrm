package com.avito.android.remote;

import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.model.notification_center.NotificationCenterLandingRecommends;
import com.avito.android.remote.model.notification_center.landing.unified.NotificationCenterLandingField;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.notification.PushNotification;
import com.avito.android.remote.parse.adapter.NotificationCenterLandingRecommendsTypeAdapter;
import com.avito.android.remote.parse.adapter.NotificationCenterUnifiedFieldDeserializer;
import com.avito.android.remote.parse.adapter.NotificationOpenAtTabTypeAdapter;
import com.avito.android.remote.parse.adapter.NotificationParametersPayloadTypeAdapter;
import com.avito.android.remote.parse.adapter.NotificationParametersStyleTypeAdapter;
import com.avito.android.remote.parse.adapter.NotificationsSettingsSectionChannelDeserializer;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: NotificationsJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/s0;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.s0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34387s0 implements dagger.internal.h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C34387s0 f254338a = new C34387s0();

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = C34385r0.f254334a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(NotificationCenterLandingRecommends.Element.class, new NotificationCenterLandingRecommendsTypeAdapter()));
        linkedHashSet.add(new X5(Payload.class, new NotificationParametersPayloadTypeAdapter()));
        linkedHashSet.add(new X5(PushNotification.Style.class, new NotificationParametersStyleTypeAdapter()));
        linkedHashSet.add(new X5(NotificationCenterLandingField.class, new NotificationCenterUnifiedFieldDeserializer()));
        linkedHashSet.add(new X5(NotificationsSettings.Section.Channel.class, new NotificationsSettingsSectionChannelDeserializer()));
        linkedHashSet.add(new X5(NotificationOpenAtTab.class, new NotificationOpenAtTabTypeAdapter()));
        return linkedHashSet;
    }
}
