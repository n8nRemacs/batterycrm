package com.avito.android.remote.config;

import Y61.k;
import com.avito.android.remote.config.AppConfig;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppConfigVersionValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/config/b;", "", "<init>", "()V", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b {
    @Inject
    public b() {
    }

    @k
    public static ValidateVersionStatus a(@k AppConfig appConfig, int i12, int i13, boolean z12) {
        boolean z13 = i13 >= appConfig.f253325d;
        long j12 = i12;
        boolean z14 = j12 >= appConfig.f253322a;
        List<Long> list = appConfig.f253332k;
        if (list != null && list.contains(Long.valueOf(j12))) {
            return z13 ? ValidateVersionStatus.f253348d : ValidateVersionStatus.f253349e;
        }
        List<Long> list2 = appConfig.f253331j;
        if (list2 != null && list2.contains(Long.valueOf(j12))) {
            return ValidateVersionStatus.f253346b;
        }
        if (j12 >= appConfig.f253323b) {
            return ValidateVersionStatus.f253346b;
        }
        if (z13) {
            return appConfig.f253326e == AppConfig.UpdateSource.f253335e ? z14 ? ValidateVersionStatus.f253346b : ValidateVersionStatus.f253349e : z14 ? !z12 ? ValidateVersionStatus.f253347c : ValidateVersionStatus.f253346b : ValidateVersionStatus.f253348d;
        }
        return z14 ? ValidateVersionStatus.f253346b : ValidateVersionStatus.f253349e;
    }
}
