package com.avito.android.tariff_cpt.levels.deeplink;

import KC0.m;
import Y41.l;
import com.avito.android.tariff_cpt.levels.deeplink.TariffCptLevelSaveV3Link;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: TariffCptLevelSaveV3DeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class c extends H implements l<m, G0> {
    @Override // Y41.l
    public final G0 invoke(m mVar) {
        m mVar2 = mVar;
        e eVar = (e) this.receiver;
        eVar.getClass();
        if (mVar2 instanceof m.a) {
            eVar.j(new TariffCptLevelSaveV3Link.b.c(((m.a) mVar2).getDeeplink()));
        } else if (mVar2 instanceof m.b) {
            m.b bVar = (m.b) mVar2;
            eVar.i(new TariffCptLevelSaveV3Link.b.C9126b(bVar.getSuccessFinishFlowUri()), eVar.f298549h, bVar.getDeeplink());
        }
        return G0.f406611a;
    }
}
