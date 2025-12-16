package com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard;

import Rv.C15084a;
import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/f;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/e;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f135473b;

    @Inject
    public f(@k d dVar) {
        this.f135473b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        hVar.eA(this.f135473b);
        hVar.YK((c) aVar, null);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C15084a.c) {
                obj = obj2;
            }
        }
        hVar.YK(cVar, (C15084a.c) (obj instanceof C15084a.c ? obj : null));
    }
}
