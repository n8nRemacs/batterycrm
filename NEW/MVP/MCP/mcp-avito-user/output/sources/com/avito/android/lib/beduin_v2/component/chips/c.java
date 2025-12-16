package com.avito.android.lib.beduin_v2.component.chips;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.chips.state.n;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.l;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: ChipsStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/chips/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/chips/state/n;", "Lcom/avito/android/lib/design/chips/ui/g;", "_design-modules_beduin-v2_renderer_component_chips"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<n, g> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f175530c;

    public c(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        g.b bVar = g.f178794f;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        bVar.getClass();
        this.f175530c = g.b.c(iJ2, context);
    }

    public static g.a i(AbstractC42628a.C11616a c11616a, g.a aVar, l lVar) {
        VU.a aVar2;
        if (lVar.isEmpty()) {
            return aVar;
        }
        VU.b bVar = (VU.b) D.a(lVar, c11616a.f337938b);
        VU.b bVar2 = bVar == null ? aVar.f178800a : bVar;
        int i12 = aVar.f178801b;
        if (bVar == null || (aVar2 = bVar.f17149a) == null) {
            aVar2 = aVar.f178803d;
        }
        return new g.a(bVar2, i12, aVar.f178802c, aVar2);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175530c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        g gVar = (g) obj;
        n nVar = (n) mVar;
        f<Integer> fVar = nVar.f334081c;
        c11616a.getClass();
        Integer numC = AbstractC42628a.C11616a.c(fVar);
        int iIntValue = numC != null ? numC.intValue() : gVar.f178795a;
        Integer numC2 = AbstractC42628a.C11616a.c(nVar.f334082d);
        return new g(iIntValue, numC2 != null ? numC2.intValue() : gVar.f178796b, i(c11616a, gVar.f178797c, nVar.f334083e), i(c11616a, gVar.f178798d, nVar.f334084f), i(c11616a, gVar.f178799e, nVar.f334085g));
    }
}
