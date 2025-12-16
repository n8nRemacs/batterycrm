package com.avito.android.push.hms;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.huawei.hms.api.HuaweiApiAvailability;
import kotlin.Metadata;

/* compiled from: HmsAvailabilityChecker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/hms/b;", "", "<init>", "()V", "_avito_push-hms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f245938a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static volatile Boolean f245939b;

    public static boolean a(@k Context context) {
        if (f245939b != null) {
            return f245939b.booleanValue();
        }
        f245939b = Boolean.valueOf(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0);
        return f245939b.booleanValue();
    }
}
