package UR;

import PK0.n;
import Y61.k;
import android.content.Context;
import bV.C25568a;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.docking_badge.state.v;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: DockingBadgeStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LUR/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/v;", "LbV/a;", "_design-modules_beduin-v2_renderer_component_docking-badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<v, C25568a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C25568a f16382c;

    public b(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        C25568a.C2002a c2002a = C25568a.f57090g;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c2002a.getClass();
        this.f16382c = C25568a.C2002a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f16382c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        C25568a c25568a = (C25568a) obj;
        v vVar = (v) mVar;
        n nVar = (n) D.b(vVar.f334353c, c11616a.f337938b, c25568a.f57091a);
        f<r.b> fVar = vVar.f334354d;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        Integer numA = F.a(fVar, kVar, z12);
        int iIntValue = numA != null ? numA.intValue() : c25568a.f57092b;
        Integer numA2 = F.a(vVar.f334355e, kVar, z12);
        int iIntValue2 = numA2 != null ? numA2.intValue() : c25568a.f57093c;
        Integer numC = AbstractC42628a.C11616a.c(vVar.f334356f);
        int iIntValue3 = numC != null ? numC.intValue() : c25568a.f57094d;
        Integer numC2 = AbstractC42628a.C11616a.c(vVar.f334357g);
        return C25568a.a(c25568a, nVar, iIntValue, iIntValue2, iIntValue3, numC2 != null ? numC2.intValue() : c25568a.f57095e, 32);
    }
}
