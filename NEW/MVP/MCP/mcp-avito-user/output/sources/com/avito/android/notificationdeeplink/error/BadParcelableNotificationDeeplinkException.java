package com.avito.android.notificationdeeplink.error;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: BadParcelableNotificationDeeplinkException.kt */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notificationdeeplink/error/BadParcelableNotificationDeeplinkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BadParcelableNotificationDeeplinkException extends RuntimeException {

    @k
    private final String message;

    public BadParcelableNotificationDeeplinkException(@k String str) {
        this.message = "Bad parcelable notification deeplink exception:  ".concat(str);
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        return this.message;
    }
}
