package com.avito.android.comfortable_deal.deal.item.callrecord.need_load;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.player.r;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import up.C49088a;

/* compiled from: CallRecordNeedLoadPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/callrecord/need_load/e;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/callrecord/need_load/g;", "Lup/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, C49088a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121263b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13517a, G0> lVar) {
        this.f121263b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        C49088a c49088a = (C49088a) aVar;
        gVar.Po(c49088a.f440292h);
        gVar.TK(0);
        Long l12 = c49088a.f440290f;
        gVar.Cn(r.b(l12 != null ? l12.longValue() : 0L));
        gVar.oU(c49088a.f440288d);
        gVar.sy(c49088a.f440289e);
        gVar.eg(new c(this));
        gVar.Lj(new d(this, c49088a));
    }
}
