package com.avito.android.tariff_lf_publication.level.ui;

import UD0.c;
import androidx.compose.foundation.layout.InterfaceC20611q1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationLevelInfo.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/q1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/q1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p extends N implements Y41.q<InterfaceC20611q1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b.C1110b f300993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UD0.a, G0> f300994m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(c.b.C1110b c1110b, Y41.l<? super UD0.a, G0> lVar) {
        super(3);
        this.f300993l = c1110b;
        this.f300994m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20611q1 interfaceC20611q1, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20611q1 interfaceC20611q12 = interfaceC20611q1;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20611q12) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            c.b.C1110b c1110b = this.f300993l;
            String str = c1110b.f16296a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65233d;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.p.b(str, rVar, C22501m2.a(R1.m(interfaceC20611q12.d(aVar), 0.0f, 0.0f, 8, 0.0f, 11), "level_info_price"), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
            String str2 = c1110b.f16297b;
            if (str2 != null) {
                C22602e.b bVar = new C22602e.b(0, 1, null);
                bVar.f(str2);
                com.akita.compose.foundation.r rVar2 = iVar.f65241l;
                String str3 = c1110b.f16298c;
                if (str3 != null) {
                    bVar.c((char) 160);
                    com.akita.compose.foundation.ui.o.d(bVar, str3, rVar2);
                }
                com.akita.compose.foundation.ui.a.a(bVar.m(), new o(c1110b, this.f300994m), C22501m2.a(interfaceC20611q12.d(aVar), "level_info_bonuses"), rVar2.d(new Object[0], a13), false, 0, 0, null, null, a13, 0, 496);
            }
        }
        return G0.f406611a;
    }
}
