package com.avito.android.advert.item.service_order_request;

import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderRequestItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f79905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f79906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f79907n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2, com.avito.android.lib.design.tooltip.k kVar) {
        super(1);
        this.f79905l = str;
        this.f79906m = str2;
        this.f79907n = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        oVar2.i(this.f79905l);
        oVar2.b(this.f79906m);
        com.avito.android.lib.design.tooltip.k kVar = this.f79907n;
        oVar2.e(new com.avito.android.advert.item.safedeal.trust_factors.k(kVar, 1));
        kVar.d(new com.avito.android.advert.item.safedeal.trust_factors.k(kVar, 2));
        oVar2.f(true);
        int iB2 = y6.b(311);
        int i12 = kVar.f181229o;
        kVar.f181228n = iB2;
        kVar.f181229o = i12;
        return G0.f406611a;
    }
}
