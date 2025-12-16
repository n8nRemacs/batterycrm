package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "", "index", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class C extends kotlin.jvm.internal.N implements Y41.r<X, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<gn.i> f115455l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y41.l lVar, List list) {
        super(4);
        this.f115455l = list;
        this.f115456m = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(X x12, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && a13.c()) {
            a13.f();
        } else {
            gn.i iVar = this.f115455l.get(iIntValue);
            gn.f fVar = iVar.f396838b;
            Y41.l<Object, G0> lVar = this.f115456m;
            z zVar = new z(iIntValue, lVar, iVar);
            A a14 = new A(iIntValue, lVar, iVar);
            B b12 = new B(iIntValue, lVar, iVar);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            M.a(fVar, iVar.f396839c, iVar.f396840d, iVar.f396841e, iVar.f396842f, iVar.f396843g, zVar, a14, b12, C22501m2.a(R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 24, 7), "snippet"), a13, 805568512);
        }
        return G0.f406611a;
    }
}
