package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<y0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gn.h f115483l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gn.e f115484m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.painter.e f115485n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115486o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(gn.h hVar, gn.e eVar, androidx.compose.ui.graphics.painter.e eVar2, Y41.l<Object, G0> lVar) {
        super(1);
        this.f115483l = hVar;
        this.f115484m = eVar;
        this.f115485n = eVar2;
        this.f115486o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(y0 y0Var) {
        y0 y0Var2 = y0Var;
        C29351q c29351q = C29351q.f115650l;
        gn.e eVar = this.f115484m;
        androidx.compose.ui.graphics.painter.e eVar2 = this.f115485n;
        Y41.l<Object, G0> lVar = this.f115486o;
        y0Var2.d(c29351q, new C22096n(884739436, new C29352s(eVar, eVar2, lVar), true));
        t tVar = t.f115656l;
        gn.h hVar = this.f115483l;
        y0Var2.d(tVar, new C22096n(-1926836971, new u(hVar), true));
        float f12 = M.f115510a;
        if (hVar != null && !hVar.f396836b.isEmpty()) {
            y0Var2.d(v.f115658l, new C22096n(-1632236175, new w(hVar), true));
            x xVar = x.f115660l;
            N.f115512a.getClass();
            y0Var2.d(xVar, N.f115513b);
            List<gn.i> list = hVar.f396836b;
            y0.e(y0Var2, list.size(), new y(list), new C22096n(-166919574, new C(lVar, list), true), 12);
        }
        return G0.f406611a;
    }
}
