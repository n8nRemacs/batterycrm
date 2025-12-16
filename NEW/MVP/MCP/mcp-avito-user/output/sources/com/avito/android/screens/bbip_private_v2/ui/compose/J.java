package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2Skeleton.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class J extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.skeleton.d f261156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(com.akita.compose.component.skeleton.d dVar) {
        super(4);
        this.f261156l = dVar;
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
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(10, 0.0f, 2, C20588k2.d(C20588k2.f(androidx.compose.ui.v.f42878y1, 168), 1.0f));
            O.f261162a.getClass();
            C20632w.a(com.akita.compose.component.skeleton.b.c(vVarK, O.f261165d, this.f261156l, false, a13, 54, 4), a13, 0);
            com.akita.compose.foundation.ui.g.a(iIntValue == 2 ? 0 : 12, null, a13, 0);
        }
        return G0.f406611a;
    }
}
