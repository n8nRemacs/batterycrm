package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: LotsListSortingBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f250982l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f250983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250984n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LotSortingType f250985o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar, LotSortingType lotSortingType) {
        super(0);
        this.f250982l = t12;
        this.f250983m = i12;
        this.f250984n = lVar;
        this.f250985o = lotSortingType;
    }

    @Override // Y41.a
    public final G0 invoke() {
        N0 n0D = C43259k.d(this.f250982l, null, null, new N(this.f250983m, null), 3);
        V0 v02 = (V0) n0D;
        v02.k(new O(this.f250984n, this.f250985o));
        return G0.f406611a;
    }
}
