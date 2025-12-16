package com.avito.android.comfortable_deal.deal.item.callrecord.loaded;

import Ep.InterfaceC13517a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.view.AbstractC22973F;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import up.C49088a;

/* compiled from: CallRecordLoadedPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/callrecord/loaded/j;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/callrecord/loaded/l;", "Lup/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements TV0.d<l, C49088a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.deal.player.f f121233b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC22973F f121234c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13517a, G0> f121235d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k com.avito.android.comfortable_deal.deal.player.f fVar, @Y61.k AbstractC22973F abstractC22973F, @Y61.k Y41.l<? super InterfaceC13517a, G0> lVar) {
        this.f121233b = fVar;
        this.f121234c = abstractC22973F;
        this.f121235d = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        C49088a c49088a = (C49088a) aVar;
        lVar.Po(c49088a.f440292h);
        com.avito.android.comfortable_deal.deal.player.f fVar = this.f121233b;
        InterfaceC23144m interfaceC23144mA = fVar.f121764a.a();
        lVar.TK(kotlin.math.b.a(interfaceC23144mA.getCurrentPosition() / (interfaceC23144mA.getDuration() / 10000.0d)));
        lVar.Cn(fVar.a(c49088a.f440290f));
        lVar.og(fVar.f121764a.a().k());
        lVar.oU(c49088a.f440288d);
        lVar.sy(c49088a.f440289e);
        lVar.eg(new c(this));
        lVar.Lj(new d(this));
        lVar.AL(new e(this));
        h hVar = new h(this, lVar, null);
        AbstractC22973F abstractC22973F = this.f121234c;
        lVar.U2(new f(C43259k.d(abstractC22973F, null, null, hVar, 3), C43259k.d(abstractC22973F, null, null, new i(this, c49088a, lVar, null), 3), C43259k.d(abstractC22973F, null, null, new g(this, lVar, null), 3)));
    }
}
