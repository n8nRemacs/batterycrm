package com.avito.android.location_picker.job;

import Y61.k;
import com.avito.android.analytics.clickstream.I;
import com.avito.android.geo_common.interactor.g;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;

/* compiled from: JobAssistantInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/job/d;", "Lcom/avito/android/location_picker/job/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f182417a;

    @Inject
    public d(@k g gVar) {
        this.f182417a = gVar;
    }

    @Override // com.avito.android.location_picker.job.a
    @k
    public final U a(@k String str, double d12, double d13, @k String str2) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new c(this, str, d12, d13, str2, null)).r(b.f182410b).u(new I(19));
    }
}
