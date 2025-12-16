package com.avito.android.enabler;

import AK.c;
import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.C;
import kotlin.Metadata;

/* compiled from: Monitors.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0004\"\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/util/C;", RequestReviewResultKt.INFO_TYPE, "", "basePrefix", "(Lcom/avito/android/util/C;)Ljava/lang/String;", "buildInfo", "", "appVersion", "(Lcom/avito/android/util/C;)I", "appName", "METRIC_NAME", "Ljava/lang/String;", "_common_features-enabler_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MonitorsKt {

    @k
    private static final String METRIC_NAME = "remote-toggle";

    private static final String appName(C c12) {
        c12.o().getClass();
        return c12.b().replace('.', '_');
    }

    private static final int appVersion(C c12) {
        return c12.a();
    }

    @k
    public static final String basePrefix(@k C c12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(appName(c12));
        sb2.append('.');
        return c.i(appVersion(c12), ".remote-toggle", sb2);
    }
}
