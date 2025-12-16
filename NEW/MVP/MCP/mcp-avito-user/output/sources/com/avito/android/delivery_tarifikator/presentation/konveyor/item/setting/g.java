package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import Rv.C15084a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SettingPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/g;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/f;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f135419b;

    @Inject
    public g(@Y61.k e eVar) {
        this.f135419b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.Aj(this.f135419b);
        iVar.ly((d) aVar, null);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C15084a.b) {
                obj = obj2;
            }
        }
        iVar.ly(dVar, (C15084a.b) (obj instanceof C15084a.b ? obj : null));
    }
}
