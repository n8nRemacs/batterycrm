package com.avito.android.delivery_tarifikator.domain;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;

/* compiled from: TarifikatorSettingsDiffer.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/m0;", "Lcom/avito/android/delivery_tarifikator/domain/l0;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Set<Ov.g> f135308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Set<Ov.g> f135309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public List<Ov.g> f135310c;

    @Inject
    public m0() {
        B0 b02 = B0.f406639b;
        this.f135308a = b02;
        this.f135309b = b02;
        this.f135310c = C42784z0.f406748b;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.l0
    @Y61.k
    public final List<Ov.g> ba() {
        return this.f135310c;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.l0
    public final boolean ca() {
        return !this.f135310c.isEmpty();
    }

    @Override // com.avito.android.delivery_tarifikator.domain.l0
    public final void da(@Y61.k Map<Long, Ov.g> map) {
        Set<Ov.g> setP0 = C42745f0.P0(map.values());
        this.f135308a = setP0;
        this.f135309b = setP0;
        this.f135310c = C42784z0.f406748b;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.l0
    @Y61.k
    public final H e() {
        return new H(C42745f0.M0(this.f135308a), C42745f0.M0(this.f135309b));
    }

    @Override // com.avito.android.delivery_tarifikator.domain.l0
    public final void ea(@Y61.k Map<Long, Ov.g> map) {
        Set<Ov.g> setP0 = C42745f0.P0(map.values());
        this.f135309b = setP0;
        this.f135310c = C42745f0.M0(b1.f(setP0, this.f135308a));
    }
}
