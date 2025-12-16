package com.avito.android.remote.notification.error;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: NotificationNotSupportedException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/notification/error/NotificationNotSupportedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationNotSupportedException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254049b;

    public NotificationNotSupportedException(@k DeepLink deepLink) {
        this.f254049b = "Unsupported link in notification: " + deepLink.getPath();
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f254049b;
    }
}
