package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import Rv.C15084a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CustomTariffsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/h;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/g;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f135376b;

    @Inject
    public h(@Y61.k e eVar) {
        this.f135376b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        jVar.rA(this.f135376b);
        jVar.gK((d) aVar, null);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C15084a.C0992a) {
                obj = obj2;
            }
        }
        jVar.gK(dVar, (C15084a.C0992a) (obj instanceof C15084a.C0992a ? obj : null));
    }
}
