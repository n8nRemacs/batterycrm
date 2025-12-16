package com.avito.android.edit_seller_type;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.edit_seller_type.mvi.entity.c;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class B extends N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f146667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f146668m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Y41.l lVar, ArrayList arrayList) {
        super(4);
        this.f146667l = arrayList;
        this.f146668m = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            c.d dVar = (c.d) this.f146667l.get(iIntValue);
            a13.C(-164619827);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(a13, C20588k2.f(aVar, 12));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.g.c(com.akita.compose.theme.re23.b.b(a13).getF66889a(), C20588k2.d(aVar, 1.0f), null, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(1335607332, new x(dVar, this.f146668m), a13), a13, com.akita.compose.component.banner.h.f60462o | 12582960, 124);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
