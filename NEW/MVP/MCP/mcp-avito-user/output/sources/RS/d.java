package RS;

import PK0.n;
import Y61.k;
import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.i;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.text.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: TextStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"LRS/d;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/text/state/j;", "LPK0/n;", "_design-modules_beduin-v2_renderer_component_text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC42628a<j, n> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f14448c;

    public d(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        dVar.getClass();
        this.f14448c = com.avito.android.lib.design.text_view.d.a(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f14448c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        n nVar = (n) obj;
        j jVar = (j) mVar;
        Typeface typefaceC = null;
        if (nVar == null) {
            return null;
        }
        Integer numA = AbstractC36331a.C10471a.a(c11616a, jVar.f335356f);
        f<r.b> fVar = jVar.f335357g;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        Integer numA2 = F.a(fVar, kVar, z12);
        Float fValueOf = AbstractC42628a.C11616a.c(jVar.f335353c) != null ? Float.valueOf(r4.intValue()) : nVar.f12987a;
        C35763c0 c35763c0 = nVar.f12988b;
        C35763c0 c35763c0A = c35763c0 != null ? C35771d0.a(c35763c0, numA, numA, numA, null, 8) : null;
        Integer numA3 = jVar.f335354d.a();
        Integer numValueOf = numA3 != null ? Integer.valueOf(y6.f(numA3.intValue())) : null;
        if (numValueOf == null) {
            numValueOf = nVar.f12991e;
        }
        String strA = jVar.f335355e.a();
        if (strA != null) {
            Context context = c11616a.f337937a;
            typefaceC = i.c(com.avito.android.lib.util.f.g(context, strA), context);
        }
        Typeface typeface = typefaceC == null ? nVar.f12989c : typefaceC;
        Integer numA4 = F.a(jVar.f335358h, kVar, z12);
        if (numA4 == null) {
            numA4 = nVar.f12993g;
        }
        Integer num = numA4;
        C35763c0 c35763c0A2 = C35771d0.a(nVar.f12994h, numA2, numA2, numA2, null, 8);
        if (c35763c0A2 == null) {
            c35763c0A2 = nVar.f12994h;
        }
        return n.a(nVar, fValueOf, c35763c0A, typeface, numValueOf, num, c35763c0A2, null, null, null, 7976);
    }
}
