package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import Zh0.InterfaceC19559a;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LotsListLoaded.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "index", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class u extends N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f251483l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Y41.l lVar, ArrayList arrayList) {
        super(4);
        this.f251483l = arrayList;
        this.f251484m = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && a13.c()) {
            a13.f();
        } else {
            i.a((Yh0.d) this.f251483l.get(iIntValue), this.f251484m, a13, 8);
        }
        return G0.f406611a;
    }
}
