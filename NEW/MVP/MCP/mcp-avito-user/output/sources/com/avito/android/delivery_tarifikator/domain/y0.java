package com.avito.android.delivery_tarifikator.domain;

import Ov.C14739b;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: TarifikatorUiDataRepository.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/y0;", "Lcom/avito/android/delivery_tarifikator/domain/x0;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z1<Ov.p> f135349a = p2.a(null);

    @Inject
    public y0() {
    }

    @Override // com.avito.android.delivery_tarifikator.domain.x0
    public final void a(@Y61.k Ov.p pVar) {
        this.f135349a.setValue(pVar);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.x0
    public final void b(@Y61.k List<C14739b> list) {
        Z1<Ov.p> z12 = this.f135349a;
        Ov.p value = z12.getValue();
        z12.setValue(value != null ? new Ov.p(value.f12704a, value.f12705b, list, value.f12707d, value.f12708e) : null);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.x0
    public final void clear() {
        this.f135349a.setValue(null);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.x0
    @Y61.k
    public final C43189o1 getData() {
        return new C43189o1(this.f135349a);
    }
}
