package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f280323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Image f280324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280325n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, Image image, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f280323l = list;
        this.f280324m = image;
        this.f280325n = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l lVar = (Y41.l) this.f280325n.getF42167b();
        List<Image> list = this.f280323l;
        lVar.invoke(new InterfaceC43503b.d(list, list.indexOf(this.f280324m)));
        return G0.f406611a;
    }
}
