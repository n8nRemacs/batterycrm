package com.avito.android.lib.beduin_v2.component.description_list_parameter_line;

import Y61.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.description_list.parameter_line.b;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.description_list_parameter_line.state.n;
import com.avito.beduin.v2.avito.component.text.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.l;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: DescriptionListParameterLineStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list_parameter_line/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/n;", "Lcom/avito/android/lib/design/description_list/parameter_line/b;", "_design-modules_beduin-v2_renderer_component_description-list-parameter_line"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<n, com.avito.android.lib.design.description_list.parameter_line.b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.description_list.parameter_line.b f175591c;

    public c(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(dVar);
        b.a aVar = com.avito.android.lib.design.description_list.parameter_line.b.f179063o;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f178994t);
        com.avito.android.lib.design.description_list.parameter_line.b bVarB = b.a.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f175591c = bVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175591c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.description_list.parameter_line.b bVar = (com.avito.android.lib.design.description_list.parameter_line.b) obj;
        n nVar = (n) mVar;
        if (bVar == null) {
            return null;
        }
        l<j> lVar = nVar.f334299c;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        PK0.n nVar2 = (PK0.n) D.b(lVar, kVar, bVar.f179064a);
        f<r.b> fVar = nVar.f334300d;
        com.avito.beduin.v2.theme.k kVar2 = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        C35763c0 c35763c0A = C35771d0.a(bVar.f179065b, F.a(fVar, kVar2, z12), null, null, null, 14);
        PK0.n nVar3 = (PK0.n) D.b(nVar.f334303g, kVar, bVar.f179066c);
        C35763c0 c35763c0A2 = C35771d0.a(bVar.f179067d, F.a(nVar.f334304h, kVar2, z12), null, null, null, 14);
        C35763c0 c35763c0A3 = C35771d0.a(bVar.f179068e, F.a(nVar.f334307k, kVar2, z12), null, null, null, 14);
        if (c35763c0A3 == null) {
            c35763c0A3 = C35771d0.b(ColorStateList.valueOf(0));
        }
        C35763c0 c35763c0 = c35763c0A3;
        Integer numC = AbstractC42628a.C11616a.c(nVar.f334305i);
        int iIntValue = numC != null ? numC.intValue() : bVar.f179069f;
        Integer numC2 = AbstractC42628a.C11616a.c(nVar.f334306j);
        return new com.avito.android.lib.design.description_list.parameter_line.b(nVar2, c35763c0A, nVar3, c35763c0A2, c35763c0, iIntValue, numC2 != null ? numC2.intValue() : bVar.f179070g, bVar.f179071h, bVar.f179072i, bVar.f179073j, bVar.f179074k, bVar.f179075l, bVar.f179076m, bVar.f179077n);
    }
}
