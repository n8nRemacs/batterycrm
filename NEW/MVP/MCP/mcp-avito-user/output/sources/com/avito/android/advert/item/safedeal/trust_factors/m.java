package com.avito.android.advert.item.safedeal.trust_factors;

import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsTooltipHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.l<com.avito.android.lib.design.tooltip.k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f79212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.TooltipData f79213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f79214n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f79215o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, SafeDeal.TooltipData tooltipData, d dVar, String str) {
        super(1);
        this.f79212l = iVar;
        this.f79213m = tooltipData;
        this.f79214n = dVar;
        this.f79215o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.k kVar) {
        com.avito.android.lib.design.tooltip.k kVar2 = kVar;
        int i12 = 1;
        r.d dVar = new r.d(null, i12, 0 == true ? 1 : 0);
        dVar.f181263d = new r.a(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        kVar2.f181224j = dVar;
        i iVar = this.f79212l;
        int i13 = iVar.f79177h;
        int i14 = kVar2.f181229o;
        kVar2.f181228n = i13;
        kVar2.f181229o = i14;
        SafeDeal.TooltipData tooltipData = this.f79213m;
        d dVar2 = this.f79214n;
        p.a(kVar2, new l(tooltipData, kVar2, dVar2));
        kVar2.setOnDismissListener(new j(iVar, dVar2, this.f79215o, tooltipData, 0));
        return G0.f406611a;
    }
}
