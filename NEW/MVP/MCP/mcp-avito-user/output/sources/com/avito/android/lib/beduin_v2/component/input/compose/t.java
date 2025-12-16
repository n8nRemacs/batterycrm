package com.avito.android.lib.beduin_v2.component.input.compose;

import com.akita.compose.component.input.v;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: InputComposeStyle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer-compose_component_input"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t {
    public static final v.a a(v.a aVar, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.theme.f<r.b> fVar, com.avito.beduin.v2.theme.f<r.b> fVar2, com.avito.beduin.v2.theme.f<r.b> fVar3, com.avito.beduin.v2.theme.f<r.b> fVar4) {
        com.akita.compose.foundation.p pVarA;
        com.akita.compose.foundation.p pVarA2;
        com.akita.compose.foundation.p pVarD = aVar.f61854a.d(fVar != null ? bU.j.a(fVar, kVar) : null);
        com.akita.compose.foundation.p pVar = aVar.f61855b;
        if (pVar != null) {
            pVarA = pVar.d(fVar2 != null ? bU.j.a(fVar2, kVar) : null);
        } else {
            pVarA = fVar2 != null ? bU.j.a(fVar2, kVar) : null;
        }
        com.akita.compose.foundation.p pVar2 = aVar.f61856c;
        if (pVar2 != null) {
            pVarA2 = pVar2.d(fVar3 != null ? bU.j.a(fVar3, kVar) : null);
        } else {
            pVarA2 = fVar3 != null ? bU.j.a(fVar3, kVar) : null;
        }
        com.akita.compose.foundation.p pVar3 = aVar.f61857d;
        if (pVar3 != null) {
            pVarA = pVar3.d(fVar4 != null ? bU.j.a(fVar4, kVar) : null);
        } else if (fVar4 != null) {
            pVarA = bU.j.a(fVar4, kVar);
        }
        return new v.a(pVarD, pVarA, pVarA2, pVarA);
    }
}
