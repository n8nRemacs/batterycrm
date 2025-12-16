package com.avito.android.tariff.cpa.deeplink;

import bC0.h;
import com.avito.android.tariff.deeplink.TariffCpaPublicationSaveLink;
import com.avito.android.util.P2;
import com.avito.android.util.T2;
import kotlin.Metadata;

/* compiled from: TariffCpaPublicationSaveHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LbC0/h;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f294581b;

    public i(k kVar) {
        this.f294581b = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        bC0.h hVar = (bC0.h) T2.a((P2) obj);
        boolean z12 = hVar instanceof h.b;
        k kVar = this.f294581b;
        com.avito.android.deeplink_handler.handler.composite.a aVar = kVar.f294583f;
        if (z12) {
            h.b bVar = (h.b) hVar;
            kVar.i(new TariffCpaPublicationSaveLink.b.C9076b(bVar.getSuccessFinishFlowUri()), aVar, bVar.getDeeplink());
        } else if (hVar instanceof h.a) {
            kVar.f294587j.s1();
            kVar.i(TariffCpaPublicationSaveLink.b.c.f297378b, aVar, ((h.a) hVar).getDeeplink());
        }
    }
}
