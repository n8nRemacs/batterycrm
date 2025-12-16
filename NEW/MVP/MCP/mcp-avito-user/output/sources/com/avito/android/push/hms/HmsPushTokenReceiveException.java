package com.avito.android.push.hms;

import Y61.k;
import kotlin.Metadata;

/* compiled from: HmsPushTokenReceiveException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/hms/HmsPushTokenReceiveException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "_avito_push-hms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HmsPushTokenReceiveException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245936b = "Error receive hms push token from HmsInstanceId";

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f245936b;
    }
}
