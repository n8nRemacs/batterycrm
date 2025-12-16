package com.avito.android.service.short_task.metrics;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendMetricTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/t;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class t implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f274099a;

    @Inject
    public t(@Y61.k w wVar) {
        this.f274099a = wVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        return this.f274099a.a(bundle.getString("TIME_TO_INTERACT", null));
    }
}
