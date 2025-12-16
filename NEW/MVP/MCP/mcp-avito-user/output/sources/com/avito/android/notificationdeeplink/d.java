package com.avito.android.notificationdeeplink;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.NotificationIdentifier;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationDeepLinkIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notificationdeeplink/d;", "Lcom/avito/android/notificationdeeplink/c;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f207764a;

    @Inject
    public d(@k Context context) {
        this.f207764a = context;
    }

    @Override // com.avito.android.notificationdeeplink.c
    @k
    public final Intent a(@k DeepLink deepLink, @l String str, int i12, @l Payload payload, @l LinkedHashMap linkedHashMap, @l String str2, @k String str3) {
        return new Intent(this.f207764a, (Class<?>) NotificationDeepLinkActivity.class).putExtra("key_analytics", (str2 == null && linkedHashMap == null) ? null : new AnalyticParams(linkedHashMap, str2)).putExtra("key_deep_link", deepLink).putExtra("key_deep_link_uri", deepLink.getPath()).putExtra("key_identifier", new NotificationIdentifier(str, i12)).putExtra("key_payload", payload).putExtra("key_push_provider", str3);
    }
}
