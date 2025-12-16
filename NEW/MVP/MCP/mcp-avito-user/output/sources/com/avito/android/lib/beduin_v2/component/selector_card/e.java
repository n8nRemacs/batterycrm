package com.avito.android.lib.beduin_v2.component.selector_card;

import PK0.n;
import Y61.k;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.selector_card.style.c;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.selector_card.state.l;
import com.avito.beduin.v2.avito.component.text.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: SelectorCardStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/selector_card/e;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/l;", "Lcom/avito/android/lib/design/selector_card/style/c;", "_design-modules_beduin-v2_renderer_component_selector-card"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends AbstractC42628a<l, com.avito.android.lib.design.selector_card.style.c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.selector_card.style.c f175896c;

    public e(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(dVar);
        c.a aVar = com.avito.android.lib.design.selector_card.style.c.f180435l;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f179003x0);
        aVar.getClass();
        com.avito.android.lib.design.selector_card.style.c cVarB = c.a.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f175896c = cVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175896c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        n nVar;
        n nVarA;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.selector_card.style.c cVar = (com.avito.android.lib.design.selector_card.style.c) obj;
        l lVar = (l) mVar;
        n nVar2 = (n) D.b(lVar.f335091k, c11616a.f337938b, cVar.f180442g);
        com.avito.beduin.v2.theme.l<j> lVar2 = lVar.f335093m;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        n nVar3 = (n) D.b(lVar2, kVar, cVar.f180443h);
        f<r.b> fVar = lVar.f335083c;
        boolean z12 = c11616a.f337939c;
        Integer numA = F.a(fVar, kVar, z12);
        com.avito.android.lib.design.toggle.a aVar = (com.avito.android.lib.design.toggle.a) D.b(lVar.f335097q, kVar, cVar.f180436a);
        com.avito.android.lib.design.switcher.a aVar2 = (com.avito.android.lib.design.switcher.a) D.b(lVar.f335098r, kVar, cVar.f180437b);
        com.avito.android.lib.design.selector_card.style.a aVarA = com.avito.android.lib.design.selector_card.style.b.a(cVar.f180438c, numA, numA, F.a(lVar.f335084d, kVar, z12), numA);
        float fIntValue = AbstractC42628a.C11616a.c(lVar.f335088h) != null ? r5.intValue() : cVar.f180439d;
        com.avito.android.lib.design.selector_card.style.a aVarA2 = com.avito.android.lib.design.selector_card.style.b.a(cVar.f180440e, null, F.a(lVar.f335085e, kVar, z12), null, null);
        float fIntValue2 = AbstractC42628a.C11616a.c(lVar.f335086f) != null ? r5.intValue() : cVar.f180441f;
        if (nVar2 != null) {
            nVar = null;
            nVarA = n.a(nVar2, null, C35771d0.a(nVar2.f12988b, F.a(lVar.f335092l, kVar, z12), null, null, null, 14), null, null, null, null, null, null, null, 8189);
        } else {
            nVar = null;
            nVarA = null;
        }
        n nVarA2 = nVar3 != null ? n.a(nVar3, null, C35771d0.a(nVar3.f12988b, F.a(lVar.f335094n, kVar, z12), null, null, null, 14), null, null, null, null, null, null, null, 8189) : nVar;
        ET0.b bVar = lVar.f335081a;
        c.b bVar2 = bVar != null ? new c.b(y6.b(bVar.f4016a), y6.b(bVar.f4019d), y6.b(bVar.f4017b), y6.b(bVar.f4018c)) : cVar.f180444i;
        ET0.b bVar3 = lVar.f335082b;
        c.b bVar4 = bVar3 != null ? new c.b(y6.b(bVar3.f4016a), y6.b(bVar3.f4019d), y6.b(bVar3.f4017b), y6.b(bVar3.f4018c)) : cVar.f180445j;
        Integer numC = AbstractC42628a.C11616a.c(lVar.f335089i);
        return new com.avito.android.lib.design.selector_card.style.c(aVar, aVar2, aVarA, fIntValue, aVarA2, fIntValue2, nVarA, nVarA2, bVar2, bVar4, numC != null ? numC.intValue() : cVar.f180446k);
    }
}
