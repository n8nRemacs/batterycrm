package GR;

import PK0.n;
import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.badge.g;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.badge.state.l;
import com.avito.beduin.v2.avito.component.badge.state.q;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: BadgeStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LGR/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/badge/state/l;", "Lcom/avito/android/lib/design/badge/g;", "_design-modules_beduin-v2_renderer_component_badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<l, g> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f6500c;

    public b(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        g.a aVar = g.f178395r;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        this.f6500c = g.a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f6500c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        n nVar;
        Integer numB;
        Integer numB2;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        g gVar = (g) obj;
        l lVar = (l) mVar;
        q qVarA = lVar.f333817e.a();
        f<Float> fVar = lVar.f333815c;
        c11616a.getClass();
        Integer numB3 = AbstractC42628a.C11616a.b(fVar);
        int iIntValue = numB3 != null ? numB3.intValue() : gVar.f178405j;
        Integer numB4 = AbstractC42628a.C11616a.b(lVar.f333816d);
        int iIntValue2 = numB4 != null ? numB4.intValue() : gVar.f178404i;
        int iIntValue3 = (qVarA == null || (numB2 = AbstractC42628a.C11616a.b(qVarA.f333825b)) == null) ? gVar.f178397b : numB2.intValue();
        int iIntValue4 = (qVarA == null || (numB = AbstractC42628a.C11616a.b(qVarA.f333826c)) == null) ? gVar.f178398c : numB.intValue();
        n nVar2 = gVar.f178396a;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        if (qVarA == null || (nVar = (n) D.b(qVarA.f333827d, kVar, nVar2)) == null) {
            nVar = nVar2;
        }
        float fIntValue = AbstractC42628a.C11616a.b(lVar.f333818f) != null ? r6.intValue() : gVar.f178406k;
        C35763c0 c35763c0 = gVar.f178401f;
        return g.a(gVar, nVar, iIntValue3, iIntValue4, c35763c0 != null ? C35771d0.a(c35763c0, F.a(lVar.f333819g, kVar, c11616a.f337939c), null, null, null, 14) : null, 0, null, iIntValue2, iIntValue, fIntValue, null, 129240);
    }
}
