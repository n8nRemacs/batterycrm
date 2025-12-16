package com.avito.android.app_foreground_provider.util_module;

import Y61.k;
import io.reactivex.rxjava3.internal.operators.observable.L;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: AppForegroundStatusProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/a;", "", "_avito_app-foreground-status-provider_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @k
    Z1 a();

    @k
    L b();

    void c();

    @k
    AppForegroundStatus getStatus();
}
