package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import Zh0.InterfaceC19559a;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.lazy.n0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LotsListLoaded.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class v extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f251485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f251486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f251488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LotSortingType f251489p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, boolean z12, Y41.l lVar, boolean z13, LotSortingType lotSortingType) {
        super(1);
        this.f251485l = arrayList;
        this.f251486m = z12;
        this.f251487n = lVar;
        this.f251488o = z13;
        this.f251489p = lotSortingType;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        Y41.l<InterfaceC19559a, G0> lVar = this.f251487n;
        m0Var2.c(null, null, new C22096n(1790255751, new q(lVar), true));
        m0Var2.c(null, null, new C22096n(510888048, new t(this.f251488o, lVar, this.f251489p), true));
        ArrayList arrayList = this.f251485l;
        m0Var2.a(arrayList.size(), null, n0.f29560l, new C22096n(1741057310, new u(lVar, arrayList), true));
        if (this.f251486m) {
            b.f251427a.getClass();
            m0Var2.c(null, null, b.f251428b);
        }
        return G0.f406611a;
    }
}
