package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f271250l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f271251m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f271252n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271253o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271254p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(v vVar, O o12, v vVar2, AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2) {
        super(0);
        this.f271250l = vVar;
        this.f271251m = o12;
        this.f271252n = vVar2;
        this.f271253o = advertXlItem;
        this.f271254p = advertXlItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        v vVar = this.f271250l;
        vVar.l5(null);
        vVar.H0();
        vVar.d(null);
        vVar.w4();
        vVar.W2();
        O o12 = this.f271251m;
        h31.e<InterfaceC28616b> eVar = o12.f271285d;
        if (eVar.get().N6()) {
            String str = this.f271253o.f268777c;
            o12.f271286e.p(this.f271252n, str);
        } else {
            eVar.get().M6(this.f271254p);
        }
        return G0.f406611a;
    }
}
