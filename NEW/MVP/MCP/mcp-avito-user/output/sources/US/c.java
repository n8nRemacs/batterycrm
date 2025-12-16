package US;

import PK0.n;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.view.d;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.time_line.s;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.time_line.state.k;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: TimeLineStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LUS/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/time_line/state/k;", "Lcom/avito/android/lib/design/time_line/s;", "_design-modules_beduin-v2_renderer_component_time-line"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<k, s> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f16384c;

    public c(@Y61.k d dVar) throws Resources.NotFoundException {
        super(dVar);
        s.a aVar = s.f181035h;
        int iJ2 = C35835l0.j(R.attr.timeLineStandard, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f178940P0);
        s sVarB = s.a.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f16384c = sVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f16384c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        s sVar = (s) obj;
        k kVar = (k) mVar;
        n nVar = (n) D.b(kVar.f335414c, c11616a.f337938b, sVar.f181036a);
        f<r.b> fVar = kVar.f335415d;
        com.avito.beduin.v2.theme.k kVar2 = c11616a.f337938b;
        boolean z12 = c11616a.f337939c;
        Integer numA = F.a(fVar, kVar2, z12);
        int iIntValue = numA != null ? numA.intValue() : sVar.f181037b;
        Integer numA2 = F.a(kVar.f335416e, kVar2, z12);
        int iIntValue2 = numA2 != null ? numA2.intValue() : sVar.f181038c;
        n nVar2 = (n) D.b(kVar.f335417f, kVar2, sVar.f181039d);
        Integer numA3 = F.a(kVar.f335418g, kVar2, z12);
        int iIntValue3 = numA3 != null ? numA3.intValue() : sVar.f181040e;
        Integer numA4 = F.a(kVar.f335419h, kVar2, z12);
        int iIntValue4 = numA4 != null ? numA4.intValue() : sVar.f181041f;
        Integer numC = AbstractC42628a.C11616a.c(kVar.f335420i);
        return new s(nVar, iIntValue, iIntValue2, nVar2, iIntValue3, iIntValue4, numC != null ? numC.intValue() : sVar.f181042g);
    }
}
