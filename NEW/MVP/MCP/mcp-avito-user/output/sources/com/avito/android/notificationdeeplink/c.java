package com.avito.android.notificationdeeplink;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.notification.Payload;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: NotificationDeepLinkIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notificationdeeplink/c;", "", "_avito_notification-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {
    @k
    Intent a(@k DeepLink deepLink, @l String str, int i12, @l Payload payload, @l LinkedHashMap linkedHashMap, @l String str2, @k String str3);
}
