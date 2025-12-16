package com.avito.android.paid_services_impl;

import com.avito.android.paid_services.PaidServicesResultRepository;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaidServicesResultRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/paid_services_impl/k;", "Lcom/avito/android/paid_services/PaidServicesResultRepository;", "<init>", "()V", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements PaidServicesResultRepository {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public PaidServicesResultRepository.Result f210652a = PaidServicesResultRepository.Result.f210609c;

    @Inject
    public k() {
    }

    @Override // com.avito.android.paid_services.PaidServicesResultRepository
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final PaidServicesResultRepository.Result getF210652a() {
        return this.f210652a;
    }

    @Override // com.avito.android.paid_services.PaidServicesResultRepository
    public final void b() {
        PaidServicesResultRepository.Result result = PaidServicesResultRepository.Result.f210608b;
        if (this.f210652a != result) {
            this.f210652a = result;
        }
    }
}
