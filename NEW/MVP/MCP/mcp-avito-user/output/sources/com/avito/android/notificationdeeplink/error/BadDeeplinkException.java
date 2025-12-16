package com.avito.android.notificationdeeplink.error;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;

/* compiled from: BadDeeplinkException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notificationdeeplink/error/BadDeeplinkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BadDeeplinkException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f207785b;

    public BadDeeplinkException(@l String str) {
        this.f207785b = G.f("Bad deep link on path: ", str);
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f207785b;
    }
}
