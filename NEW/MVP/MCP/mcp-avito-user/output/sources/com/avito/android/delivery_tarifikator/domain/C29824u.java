package com.avito.android.delivery_tarifikator.domain;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: LocationTermsDataGuard.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/u;", "Lcom/avito/android/delivery_tarifikator/domain/t;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29824u implements InterfaceC29823t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Mv.i f135338a;

    @Inject
    public C29824u(@Y61.k Mv.i iVar) {
        this.f135338a = iVar;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29823t
    public final void a(@Y61.k cw.f fVar) {
        if (fVar.getCustomTariffId() != null && fVar.getTermsType() != null) {
            long jLongValue = fVar.getCustomTariffId().longValue();
            String termsType = fVar.getTermsType();
            Long locationId = fVar.getLocationId();
            this.f135338a.c(jLongValue, Long.valueOf(locationId != null ? locationId.longValue() : -1L), termsType);
        }
        if (fVar.getCustomTariffId() == null || fVar.getPrice() == null) {
            return;
        }
        long jLongValue2 = fVar.getCustomTariffId().longValue();
        long jLongValue3 = fVar.getPrice().longValue();
        Long locationId2 = fVar.getLocationId();
        this.f135338a.d(jLongValue2, jLongValue3, Long.valueOf(locationId2 != null ? locationId2.longValue() : -1L));
    }
}
