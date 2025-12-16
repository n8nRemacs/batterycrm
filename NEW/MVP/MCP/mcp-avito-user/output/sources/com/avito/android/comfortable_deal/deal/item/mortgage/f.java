package com.avito.android.comfortable_deal.deal.item.mortgage;

import Ep.InterfaceC13517a;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f121439l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f121440m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c cVar) {
        super(0);
        this.f121439l = gVar;
        this.f121440m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f121439l;
        l<InterfaceC13517a, G0> lVar = gVar.f121441b;
        c cVar = this.f121440m;
        lVar.invoke(new InterfaceC13517a.o(cVar.f121435d));
        gVar.f121442c.a(cVar.f121434c);
        return G0.f406611a;
    }
}
