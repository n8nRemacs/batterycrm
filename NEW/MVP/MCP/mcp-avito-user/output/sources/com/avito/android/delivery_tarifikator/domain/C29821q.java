package com.avito.android.delivery_tarifikator.domain;

import Ov.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: LocationSettingMapper.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/q;", "Lcom/avito/android/delivery_tarifikator/domain/p;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29821q implements InterfaceC29820p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final U f135322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29823t f135323b;

    @Inject
    public C29821q(@Y61.k U u12, @Y61.k InterfaceC29823t interfaceC29823t) {
        this.f135322a = u12;
        this.f135323b = interfaceC29823t;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29820p
    @Y61.k
    public final Ov.g a(@Y61.k cw.f fVar) throws Pv.d, Pv.c {
        Ov.l lVarA;
        Long locationId = fVar.getLocationId();
        if (locationId == null) {
            throw new Pv.c(null);
        }
        long jLongValue = locationId.longValue();
        if (fVar.getCustomTariffId() != null) {
            lVarA = l.b.a(fVar.getCustomTariffId().longValue());
        } else {
            if (fVar.getTermsType() == null) {
                throw new Pv.c(locationId);
            }
            lVarA = l.c.a(fVar.getTermsType());
        }
        Ov.l lVar = lVarA;
        if (this.f135322a.a(lVar) != null) {
            this.f135323b.a(fVar);
            return new Ov.g(new Ov.d(jLongValue, fVar.getName()), lVar, fVar.getPrice(), fVar.getMinDeliveryDays(), fVar.getMaxDeliveryDays());
        }
        l.b bVar = lVar instanceof l.b ? (l.b) lVar : null;
        Long lValueOf = bVar != null ? Long.valueOf(bVar.f12697a) : null;
        String str = lVar instanceof l.c ? ((l.c) lVar).f12698a : null;
        throw new Pv.d(locationId, lValueOf, str != null ? str : null);
    }
}
