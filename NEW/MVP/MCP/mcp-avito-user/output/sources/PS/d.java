package PS;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_group.e;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.tab_group.state.n;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: TabGroupStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"LPS/d;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/n;", "Lcom/avito/android/lib/design/tab_group/e;", "_design-modules_beduin-v2_renderer_component_tab-group"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC42628a<n, e> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f13072c;

    public d(@k Context context, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(context);
        e.a aVar = e.f180739j;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178932L0);
        try {
            e eVarA = e.a.a(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            this.f13072c = eVarA;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f13072c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        e eVar = (e) obj;
        n nVar = (n) mVar;
        if (eVar == null) {
            return null;
        }
        f<Integer> fVar = nVar.f335299d;
        c11616a.getClass();
        Integer numC = AbstractC42628a.C11616a.c(fVar);
        int iIntValue = numC != null ? numC.intValue() : eVar.f180741b;
        Integer numC2 = AbstractC42628a.C11616a.c(nVar.f335298c);
        int iIntValue2 = numC2 != null ? numC2.intValue() : eVar.f180740a;
        f<r.b> fVar2 = nVar.f335300e;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        C35763c0 c35763c0A = C35771d0.a(eVar.f180742c, F.a(fVar2, kVar, z12), null, null, null, 14);
        C35763c0 c35763c0A2 = C35771d0.a(eVar.f180743d, F.a(nVar.f335301f, kVar, z12), null, null, null, 14);
        Integer numC3 = AbstractC42628a.C11616a.c(nVar.f335302g);
        int iIntValue3 = numC3 != null ? numC3.intValue() : eVar.f180744e;
        Integer numC4 = AbstractC42628a.C11616a.c(nVar.f335303h);
        int iIntValue4 = numC4 != null ? numC4.intValue() : eVar.f180745f;
        e.b bVar = eVar.f180746g;
        return new e(iIntValue2, iIntValue, c35763c0A, c35763c0A2, iIntValue3, iIntValue4, new e.b(bVar.f180749a, bVar.f180750b, bVar.f180751c, bVar.f180752d, bVar.f180753e, bVar.f180754f, bVar.f180755g, bVar.f180756h, bVar.f180757i), eVar.f180747h, eVar.f180748i);
    }
}
