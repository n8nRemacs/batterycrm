package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.async_phone.InterfaceC28616b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f268860n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f268861o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268862p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, AdvertXlItem advertXlItem, x xVar, x xVar2, AdvertXlItem advertXlItem2) {
        super(0);
        this.f268858l = uVar;
        this.f268859m = advertXlItem;
        this.f268860n = xVar;
        this.f268861o = xVar2;
        this.f268862p = advertXlItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        u uVar = this.f268858l;
        AdvertXlItem advertXlItem = this.f268859m;
        uVar.f268878m.c(advertXlItem.f268777c);
        x xVar = this.f268860n;
        xVar.x7(null);
        xVar.F0(null);
        xVar.c(null);
        xVar.oC(null);
        xVar.d(null);
        xVar.w4();
        InterfaceC28616b interfaceC28616b = uVar.f268871f;
        if (interfaceC28616b.N6()) {
            String str = this.f268862p.f268777c;
            uVar.f268872g.p(this.f268861o, str);
        } else {
            interfaceC28616b.M6(advertXlItem);
        }
        return G0.f406611a;
    }
}
