package com.avito.android.notification_center.counter;

import com.avito.android.remote.notification.PushParameters;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationCenterPushHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/counter/l;", "Lcom/avito/android/notification_center/counter/k;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f207502a;

    @Inject
    public l(@Y61.k j jVar) {
        this.f207502a = jVar;
    }

    @Override // com.avito.android.remote.notification.z
    public final boolean b(@Y61.k PushParameters pushParameters) {
        Map<String, Object> mapC = pushParameters.f253976c.c();
        if (mapC == null || !mapC.containsValue("notification-center")) {
            return false;
        }
        this.f207502a.a();
        return false;
    }
}
