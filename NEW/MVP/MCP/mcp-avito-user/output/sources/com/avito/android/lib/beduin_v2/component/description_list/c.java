package com.avito.android.lib.beduin_v2.component.description_list;

import PK0.n;
import Y61.k;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.description_list.d;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.description_list.state.m;
import com.avito.beduin.v2.avito.component.text.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.l;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: DescriptionListStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/description_list/state/m;", "Lcom/avito/android/lib/design/description_list/d;", "_design-modules_beduin-v2_renderer_component_description-list"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<m, com.avito.android.lib.design.description_list.d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.description_list.d f175588c;

    public c(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(dVar);
        d.a aVar = com.avito.android.lib.design.description_list.d.f179028j;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f178992s);
        com.avito.android.lib.design.description_list.d dVarB = d.a.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f175588c = dVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175588c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, com.avito.beduin.v2.theme.m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.description_list.d dVar = (com.avito.android.lib.design.description_list.d) obj;
        m mVar2 = (m) mVar;
        if (dVar == null) {
            return null;
        }
        l<j> lVar = mVar2.f334253c;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        n nVar = (n) D.b(lVar, kVar, dVar.f179029a);
        f<r.b> fVar = mVar2.f334254d;
        com.avito.beduin.v2.theme.k kVar2 = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        Integer numA = F.a(fVar, kVar2, z12);
        int iIntValue = numA != null ? numA.intValue() : dVar.f179030b;
        n nVar2 = (n) D.b(mVar2.f334255e, kVar, dVar.f179031c);
        Integer numA2 = F.a(mVar2.f334256f, kVar2, z12);
        int iIntValue2 = numA2 != null ? numA2.intValue() : dVar.f179032d;
        C35763c0 c35763c0A = C35771d0.a(dVar.f179033e, F.a(mVar2.f334258h, kVar2, z12), null, null, null, 14);
        Integer numC = AbstractC42628a.C11616a.c(mVar2.f334259i);
        Integer numC2 = AbstractC42628a.C11616a.c(mVar2.f334257g);
        return new com.avito.android.lib.design.description_list.d(nVar, iIntValue, nVar2, iIntValue2, c35763c0A, numC, numC2 != null ? numC2.intValue() : dVar.f179035g, 0, 0);
    }
}
