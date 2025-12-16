package com.avito.android.delivery_tarifikator.domain;

import Ov.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TariffProvider.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/V;", "Lcom/avito/android/delivery_tarifikator/domain/U;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V implements U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h0 f135262a;

    @Inject
    public V(@Y61.k h0 h0Var) {
        this.f135262a = h0Var;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.U
    @Y61.l
    public final Ov.k a(@Y61.k Ov.l lVar) {
        boolean z12 = lVar instanceof l.b;
        h0 h0Var = this.f135262a;
        if (z12) {
            return h0Var.h(((l.b) lVar).f12697a);
        }
        if (lVar instanceof l.c) {
            return h0Var.g(((l.c) lVar).f12698a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
