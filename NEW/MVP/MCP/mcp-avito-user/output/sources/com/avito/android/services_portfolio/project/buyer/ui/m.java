package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.Image;
import iv0.AbstractC42117c;
import iv0.InterfaceC42115a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.l<y0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f280097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC42117c.b f280099n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(List<Image> list, Y41.l<? super InterfaceC42115a, G0> lVar, AbstractC42117c.b bVar) {
        super(1);
        this.f280097l = list;
        this.f280098m = lVar;
        this.f280099n = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(y0 y0Var) {
        y0 y0Var2 = y0Var;
        h hVar = h.f280090l;
        List<Image> list = this.f280097l;
        y0Var2.f(list.size(), null, null, new k(hVar, list), new C22096n(699646206, new l(list, this.f280098m, list, this.f280099n), true));
        return G0.f406611a;
    }
}
