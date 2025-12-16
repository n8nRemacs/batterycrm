package com.avito.android.services_portfolio.project.buyer.ui;

import com.avito.android.remote.model.Image;
import iv0.AbstractC42117c;
import iv0.InterfaceC42115a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Image> f280087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Image f280088n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC42117c.b f280089o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Y41.l<? super InterfaceC42115a, G0> lVar, List<Image> list, Image image, AbstractC42117c.b bVar) {
        super(0);
        this.f280086l = lVar;
        this.f280087m = list;
        this.f280088n = image;
        this.f280089o = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<Image> list = this.f280087m;
        int iIndexOf = list.indexOf(this.f280088n);
        AbstractC42117c.b bVar = this.f280089o;
        this.f280086l.invoke(new InterfaceC42115a.e(list, iIndexOf, bVar.f405377f, bVar.f405376e));
        return G0.f406611a;
    }
}
