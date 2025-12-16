package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioProjectSellerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.l<y0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Image> f280332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280333m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f280332l = list;
        this.f280333m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(y0 y0Var) {
        y0 y0Var2 = y0Var;
        j jVar = j.f280326l;
        List<Image> list = this.f280332l;
        y0Var2.f(list.size(), null, null, new m(jVar, list), new C22096n(699646206, new n(list, list, this.f280333m), true));
        return G0.f406611a;
    }
}
