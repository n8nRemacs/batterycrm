package com.avito.android.lib.beduin_v2.component.button.compose;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.component.button.t;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import kotlin.Metadata;

/* compiled from: ButtonComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer-compose_component_button"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k C36216a c36216a, @k t tVar, @l v vVar, @l A a12, int i12) {
        v vVarA;
        B bE2 = a12.E(-2139745747);
        Y41.a aVar = c36216a.f333939e;
        if (aVar == null) {
            aVar = b.f175517l;
        }
        Y41.a aVar2 = aVar;
        bE2.C(2070833170);
        com.avito.beduin.v2.avito.component.button.state.v vVar2 = c36216a.f333941g;
        Integer numA = vVar2 == null ? null : e.a(vVar2, bE2);
        bE2.X(false);
        bE2.C(2070834802);
        com.avito.beduin.v2.avito.component.button.state.v vVar3 = c36216a.f333942h;
        Integer numA2 = vVar3 != null ? e.a(vVar3, bE2) : null;
        bE2.X(false);
        String str = c36216a.f333946l;
        m.c(c36216a.f333935a, aVar2, tVar, (str == null || (vVarA = C22501m2.a(vVar, str)) == null) ? vVar : vVarA, c36216a.f333936b, numA, numA2, c36216a.f333938d, c36216a.f333937c, null, bE2, 512 | ((i12 << 3) & 896), 512);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c36216a, tVar, vVar, i12);
        }
    }
}
