package com.avito.android.lib.beduin_v2.component.input;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.input.v;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import kT.AbstractC42628a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputStyleComposer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/E;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/input/state/c;", "Lcom/avito/android/lib/beduin_v2/component/input/F;", "_design-modules_beduin-v2_renderer_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E extends AbstractC42628a<com.avito.beduin.v2.avito.component.input.state.c, F> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final F f175650c;

    static {
        v.a.C2090a c2090a = v.a.f61852e;
    }

    public E(@Y61.k Context context, @Y61.k String str) {
        super(context);
        this.f175650c = new F(str, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
    }

    public static v.a i(AbstractC42628a.C11616a c11616a, com.avito.beduin.v2.theme.f fVar, com.avito.beduin.v2.theme.f fVar2, com.avito.beduin.v2.theme.f fVar3, com.avito.beduin.v2.theme.f fVar4) {
        com.akita.compose.foundation.p pVarA;
        com.akita.compose.foundation.p pVarA2;
        com.akita.compose.foundation.p pVarA3;
        com.akita.compose.foundation.p pVarA4;
        if (fVar == null || (pVarA = bU.j.a(fVar, c11616a.f337938b)) == null) {
            com.akita.compose.foundation.p.f63635e.getClass();
            pVarA = com.akita.compose.foundation.p.f63636f;
        }
        if (fVar2 == null || (pVarA2 = bU.j.a(fVar2, c11616a.f337938b)) == null) {
            com.akita.compose.foundation.p.f63635e.getClass();
            pVarA2 = com.akita.compose.foundation.p.f63636f;
        }
        if (fVar3 == null || (pVarA3 = bU.j.a(fVar3, c11616a.f337938b)) == null) {
            com.akita.compose.foundation.p.f63635e.getClass();
            pVarA3 = com.akita.compose.foundation.p.f63636f;
        }
        if (fVar4 == null || (pVarA4 = bU.j.a(fVar4, c11616a.f337938b)) == null) {
            com.akita.compose.foundation.p.f63635e.getClass();
            pVarA4 = com.akita.compose.foundation.p.f63636f;
        }
        return new v.a(pVarA, pVarA2, pVarA3, pVarA4);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175650c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, com.avito.beduin.v2.theme.m mVar) {
        com.akita.compose.foundation.r rVar;
        com.akita.compose.component.spinner.h hVar;
        float fIntValue;
        float fIntValue2;
        long jE2;
        long jE3;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        F f12 = (F) obj;
        com.avito.beduin.v2.avito.component.input.state.c cVar = (com.avito.beduin.v2.avito.component.input.state.c) mVar;
        com.avito.beduin.v2.avito.component.text.state.j jVar = (com.avito.beduin.v2.avito.component.text.state.j) cVar.f334503d.a();
        androidx.compose.foundation.shape.n nVarA = null;
        if (jVar != null) {
            Integer numA = jVar.f335353c.a();
            if (numA != null) {
                jE2 = androidx.compose.ui.unit.z.e(numA.intValue());
            } else {
                androidx.compose.ui.unit.y.f42874b.getClass();
                jE2 = androidx.compose.ui.unit.y.f42876d;
            }
            long j12 = jE2;
            Integer numA2 = jVar.f335354d.a();
            if (numA2 != null) {
                jE3 = androidx.compose.ui.unit.z.e(numA2.intValue());
            } else {
                androidx.compose.ui.unit.y.f42874b.getClass();
                jE3 = androidx.compose.ui.unit.y.f42876d;
            }
            rVar = new com.akita.compose.foundation.r(null, null, j12, jE3, null, null, null, 0.0f, 0L, 0L, 1011, null);
        } else {
            rVar = null;
        }
        v.a aVarI = i(c11616a, cVar.f334504e, cVar.f334505f, cVar.f334506g, cVar.f334507h);
        v.a aVarI2 = i(c11616a, cVar.f334508i, cVar.f334509j, cVar.f334510k, cVar.f334511l);
        v.a aVarI3 = i(c11616a, cVar.f334512m, cVar.f334515p, cVar.f334513n, cVar.f334514o);
        v.a aVarI4 = i(c11616a, cVar.f334497H, null, null, null);
        androidx.compose.ui.unit.h hVarA = cVar.f334516q.a() != null ? androidx.compose.ui.unit.h.a(r3.intValue()) : null;
        v.a aVarI5 = i(c11616a, cVar.f334517r, cVar.f334520u, cVar.f334518s, cVar.f334519t);
        androidx.compose.ui.unit.h hVarA2 = cVar.f334502c.a() != null ? androidx.compose.ui.unit.h.a(r3.intValue()) : null;
        Integer numA3 = cVar.f334499J.a();
        com.avito.beduin.v2.avito.component.spinner.state.h hVar2 = (com.avito.beduin.v2.avito.component.spinner.state.h) cVar.f334493D.a();
        if (hVar2 != null) {
            Integer numA4 = hVar2.f335146c.a();
            if (numA4 != null) {
                fIntValue = numA4.intValue();
            } else {
                androidx.compose.ui.unit.h.f42849c.getClass();
                fIntValue = androidx.compose.ui.unit.h.f42851e;
            }
            com.akita.compose.foundation.p pVarA = bU.j.a(hVar2.f335148e, c11616a.f337938b);
            if (pVarA == null) {
                com.akita.compose.foundation.p.f63635e.getClass();
                pVarA = com.akita.compose.foundation.p.f63636f;
            }
            Integer numA5 = hVar2.f335147d.a();
            if (numA5 != null) {
                fIntValue2 = numA5.intValue();
            } else {
                androidx.compose.ui.unit.h.f42849c.getClass();
                fIntValue2 = androidx.compose.ui.unit.h.f42851e;
            }
            hVar = new com.akita.compose.component.spinner.h(fIntValue, pVarA, fIntValue2, null);
        } else {
            hVar = null;
        }
        v.a aVarI6 = i(c11616a, cVar.f334521v, cVar.f334524y, cVar.f334522w, cVar.f334523x);
        v.a aVarI7 = i(c11616a, cVar.f334525z, cVar.f334492C, cVar.f334490A, cVar.f334491B);
        Integer numA6 = cVar.f334498I.a();
        if (numA6 != null) {
            float fIntValue3 = numA6.intValue();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            nVarA = androidx.compose.foundation.shape.o.a(fIntValue3);
        }
        return new F(f12.f175651a, rVar, aVarI, aVarI2, aVarI3, aVarI4, aVarI5, hVarA, hVarA2, numA3, hVar, aVarI6, aVarI7, nVarA, null);
    }
}
