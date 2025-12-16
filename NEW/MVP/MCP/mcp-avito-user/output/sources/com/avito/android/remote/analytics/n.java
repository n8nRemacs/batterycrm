package com.avito.android.remote.analytics;

import arrow.core.AbstractC23662a;
import com.avito.android.remote.error.ApiError;
import j.InterfaceC42148d;
import j.l0;
import kotlin.Metadata;

/* compiled from: NetworkErrorsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/n;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface n {
    @l0
    void a(@Y61.k ApiError apiError, @Y61.k Throwable th2);

    @Y61.l
    @InterfaceC42148d
    C34244a b(@Y61.k AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a);

    @Y61.k
    @l0
    C34244a c(@Y61.k Throwable th2);
}
