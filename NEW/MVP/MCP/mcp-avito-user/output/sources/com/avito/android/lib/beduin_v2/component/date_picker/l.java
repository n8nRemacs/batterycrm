package com.avito.android.lib.beduin_v2.component.date_picker;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import com.avito.beduin.v2.avito.component.date_picker.state.k;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import kT.AbstractC42628a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerStyleComposer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/date_picker/l;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/k;", "Lcom/avito/android/lib/beduin_v2/component/date_picker/m;", "_design-modules_beduin-v2_renderer_component_date-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends AbstractC42628a<com.avito.beduin.v2.avito.component.date_picker.state.k, m> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f175561c;

    public l(@Y61.k androidx.appcompat.view.d dVar) {
        super(dVar);
        this.f175561c = new m("datePickerDefault", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null);
    }

    public static r i(com.avito.beduin.v2.avito.component.text.state.j jVar) {
        Integer numA = jVar.f335353c.a();
        if (numA != null) {
            long jE2 = z.e(numA.intValue());
            Integer numA2 = jVar.f335354d.a();
            if (numA2 != null) {
                return new r(null, null, jE2, z.e(numA2.intValue()), null, null, null, 0.0f, 0L, 0L, 1011, null);
            }
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175561c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, com.avito.beduin.v2.theme.m mVar) {
        r rVarI;
        p pVarA;
        p pVarA2;
        p pVarA3;
        p pVarA4;
        p pVarA5;
        p pVarA6;
        p pVarA7;
        p pVarA8;
        p pVarA9;
        p pVarA10;
        r rVarI2;
        r rVarI3;
        Integer numA;
        Integer numA2;
        Integer numA3;
        Integer numA4;
        Integer numA5;
        com.avito.beduin.v2.avito.component.text.state.j jVar;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        m mVar2 = (m) obj;
        com.avito.beduin.v2.avito.component.date_picker.state.k kVar = (com.avito.beduin.v2.avito.component.date_picker.state.k) mVar;
        com.avito.beduin.v2.theme.f<k.a> fVar = kVar.f334188c;
        k.a aVarA = fVar.a();
        if (aVarA == null || (jVar = (com.avito.beduin.v2.avito.component.text.state.j) aVarA.f334196a.a()) == null || (rVarI = i(jVar)) == null) {
            rVarI = mVar2.f175563b;
        }
        r rVar = rVarI;
        k.a aVarA2 = fVar.a();
        androidx.compose.ui.unit.h hVarA = (aVarA2 == null || (numA5 = aVarA2.f334197b.a()) == null) ? mVar2.f175564c : androidx.compose.ui.unit.h.a(numA5.intValue());
        k.a aVarA3 = fVar.a();
        com.avito.beduin.v2.theme.k kVar2 = c11616a.f337938b;
        if (aVarA3 == null || (pVarA = bU.j.a(aVarA3.f334198c, kVar2)) == null) {
            pVarA = mVar2.f175565d;
        }
        p pVar = pVarA;
        k.a aVarA4 = fVar.a();
        androidx.compose.ui.unit.h hVarA2 = (aVarA4 == null || (numA4 = aVarA4.f334199d.a()) == null) ? mVar2.f175566e : androidx.compose.ui.unit.h.a(numA4.intValue());
        k.a aVarA5 = fVar.a();
        androidx.compose.ui.unit.l lVarA = null;
        p pVarA11 = aVarA5 != null ? bU.j.a(aVarA5.f334200e, kVar2) : null;
        k.a aVarA6 = fVar.a();
        androidx.compose.ui.unit.h hVarA3 = (aVarA6 == null || (numA3 = aVarA6.f334201f.a()) == null) ? mVar2.f175568g : androidx.compose.ui.unit.h.a(numA3.intValue());
        k.a aVarA7 = fVar.a();
        if (aVarA7 == null || (pVarA2 = bU.j.a(aVarA7.f334202g, kVar2)) == null) {
            pVarA2 = mVar2.f175569h;
        }
        p pVar2 = pVarA2;
        k.a aVarA8 = fVar.a();
        if (aVarA8 == null || (pVarA3 = bU.j.a(aVarA8.f334203h, kVar2)) == null) {
            pVarA3 = mVar2.f175570i;
        }
        p pVar3 = pVarA3;
        k.a aVarA9 = fVar.a();
        if (aVarA9 == null || (pVarA4 = bU.j.a(aVarA9.f334204i, kVar2)) == null) {
            pVarA4 = mVar2.f175571j;
        }
        p pVar4 = pVarA4;
        k.a aVarA10 = fVar.a();
        if (aVarA10 == null || (pVarA5 = bU.j.a(aVarA10.f334205j, kVar2)) == null) {
            pVarA5 = mVar2.f175572k;
        }
        p pVar5 = pVarA5;
        k.a aVarA11 = fVar.a();
        if (aVarA11 == null || (pVarA6 = bU.j.a(aVarA11.f334206k, kVar2)) == null) {
            pVarA6 = mVar2.f175573l;
        }
        p pVar6 = pVarA6;
        k.a aVarA12 = fVar.a();
        if (aVarA12 == null || (pVarA7 = bU.j.a(aVarA12.f334207l, kVar2)) == null) {
            pVarA7 = mVar2.f175574m;
        }
        p pVar7 = pVarA7;
        k.a aVarA13 = fVar.a();
        if (aVarA13 == null || (pVarA8 = bU.j.a(aVarA13.f334208m, kVar2)) == null) {
            pVarA8 = mVar2.f175575n;
        }
        p pVar8 = pVarA8;
        k.a aVarA14 = fVar.a();
        if (aVarA14 == null || (pVarA9 = bU.j.a(aVarA14.f334209n, kVar2)) == null) {
            pVarA9 = mVar2.f175576o;
        }
        p pVar9 = pVarA9;
        k.a aVarA15 = fVar.a();
        if (aVarA15 == null || (pVarA10 = bU.j.a(aVarA15.f334210o, kVar2)) == null) {
            pVarA10 = mVar2.f175577p;
        }
        p pVar10 = pVarA10;
        k.a aVarA16 = fVar.a();
        if (aVarA16 != null && (numA = aVarA16.f334211p.a()) != null) {
            float fIntValue = numA.intValue();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            k.a aVarA17 = fVar.a();
            if (aVarA17 != null && (numA2 = aVarA17.f334212q.a()) != null) {
                lVarA = androidx.compose.ui.unit.l.a(androidx.compose.ui.unit.i.a(fIntValue, numA2.intValue()));
            }
        }
        androidx.compose.ui.unit.l lVar = lVarA == null ? mVar2.f175578q : lVarA;
        p pVarA12 = bU.j.a(kVar.f334189d, kVar2);
        if (pVarA12 == null) {
            pVarA12 = mVar2.f175579r;
        }
        p pVar11 = pVarA12;
        com.avito.beduin.v2.avito.component.text.state.j jVar2 = (com.avito.beduin.v2.avito.component.text.state.j) kVar.f334190e.a();
        if (jVar2 == null || (rVarI2 = i(jVar2)) == null) {
            rVarI2 = mVar2.f175580s;
        }
        r rVar2 = rVarI2;
        com.avito.beduin.v2.avito.component.text.state.j jVar3 = (com.avito.beduin.v2.avito.component.text.state.j) kVar.f334191f.a();
        if (jVar3 == null || (rVarI3 = i(jVar3)) == null) {
            rVarI3 = mVar2.f175581t;
        }
        return new m(mVar2.f175562a, rVar, hVarA, pVar, hVarA2, pVarA11, hVarA3, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, lVar, pVar11, rVar2, rVarI3, kVar.f334192g.a() != null ? androidx.compose.ui.unit.h.a(r0.intValue()) : mVar2.f175582u, kVar.f334193h.a() != null ? androidx.compose.ui.unit.h.a(r0.intValue()) : mVar2.f175583v, kVar.f334194i.a() != null ? androidx.compose.ui.unit.h.a(r0.intValue()) : mVar2.f175584w, kVar.f334195j.a() != null ? androidx.compose.ui.unit.h.a(r0.intValue()) : mVar2.f175585x, null);
    }
}
