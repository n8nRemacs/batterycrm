package NS;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.switcher.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.M5;
import com.avito.beduin.v2.avito.component.common.e;
import com.avito.beduin.v2.avito.component.switcher.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: SwitcherStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LNS/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/switcher/state/j;", "Lcom/avito/android/lib/design/switcher/a;", "_design-modules_beduin-v2_renderer_component_switcher"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<j, com.avito.android.lib.design.switcher.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.switcher.a f11522c;

    public b(@k Context context, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(context);
        a.C5304a c5304a = com.avito.android.lib.design.switcher.a.f180669j;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c5304a.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178926I0);
        com.avito.android.lib.design.switcher.a aVarB = a.C5304a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        this.f11522c = aVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f11522c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.switcher.a aVar = (com.avito.android.lib.design.switcher.a) obj;
        j jVar = (j) mVar;
        f<Integer> fVar = jVar.f335245d;
        c11616a.getClass();
        Integer numC = AbstractC42628a.C11616a.c(fVar);
        int iIntValue = numC != null ? numC.intValue() : aVar.f180670a;
        Integer numC2 = AbstractC42628a.C11616a.c(jVar.f335256o);
        int iIntValue2 = numC2 != null ? numC2.intValue() : aVar.f180671b;
        Integer numC3 = AbstractC42628a.C11616a.c(jVar.f335257p);
        int iIntValue3 = numC3 != null ? numC3.intValue() : aVar.f180672c;
        Integer numC4 = AbstractC42628a.C11616a.c(jVar.f335244c);
        int iIntValue4 = numC4 != null ? numC4.intValue() : aVar.f180673d;
        M5 m5D = c11616a.d(aVar.f180675f, jVar.f335248g, jVar.f335249h, jVar.f335252k, jVar.f335253l);
        f<e> fVar2 = jVar.f335246e;
        f<e> fVar3 = jVar.f335247f;
        return new com.avito.android.lib.design.switcher.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, aVar.f180674e, m5D, c11616a.d(aVar.f180676g, fVar2, fVar3, fVar2, fVar3), c11616a.d(aVar.f180677h, jVar.f335250i, jVar.f335251j, jVar.f335254m, jVar.f335255n), aVar.f180678i);
    }
}
