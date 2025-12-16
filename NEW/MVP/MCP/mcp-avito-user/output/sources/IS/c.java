package IS;

import PK0.n;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.stepper.i;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.spinner.state.h;
import com.avito.beduin.v2.avito.component.stepper.state.l;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: StepperStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LIS/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/stepper/state/l;", "Lcom/avito/android/lib/design/stepper/i;", "_design-modules_beduin-v2_renderer_component_stepper"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<l, i> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f8181c;

    public c(@k Context context, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(context);
        i.a aVar = i.f180624x;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178922G0);
        i iVarB = i.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        this.f8181c = iVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f8181c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        Integer numM;
        Integer numM2;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        i iVar = (i) obj;
        l lVar = (l) mVar;
        n nVar = (n) D.b(lVar.f335189e, c11616a.f337938b, iVar.f180628d);
        com.avito.beduin.v2.theme.l<h> lVar2 = lVar.f335190f;
        com.avito.beduin.v2.theme.k kVar = c11616a.f337938b;
        com.avito.android.lib.design.spinner.a aVar = (com.avito.android.lib.design.spinner.a) D.b(lVar2, kVar, iVar.f180630f);
        f<Integer> fVar = lVar.f335187c;
        Integer numC = AbstractC42628a.C11616a.c(fVar);
        int iIntValue = numC != null ? numC.intValue() : iVar.f180626b;
        Integer numC2 = AbstractC42628a.C11616a.c(fVar);
        int iIntValue2 = numC2 != null ? numC2.intValue() : iVar.f180625a;
        Integer numC3 = AbstractC42628a.C11616a.c(lVar.f335188d);
        int iIntValue3 = numC3 != null ? numC3.intValue() : iVar.f180627c;
        f<r.b> fVar2 = lVar.f335191g;
        boolean z12 = c11616a.f337939c;
        C35763c0 c35763c0A = C35771d0.a(iVar.f180631g, F.a(fVar2, kVar, z12), F.a(lVar.f335193i, kVar, z12), F.a(lVar.f335194j, kVar, z12), null, 8);
        C35763c0 c35763c0A2 = C35771d0.a(iVar.f180632h, F.a(lVar.f335192h, kVar, z12), null, null, null, 14);
        C35763c0 c35763c0A3 = C35771d0.a(iVar.f180636l, 0, null, null, F.a(lVar.f335195k, kVar, z12), 6);
        Integer numC4 = AbstractC42628a.C11616a.c(lVar.f335196l);
        int iIntValue4 = numC4 != null ? numC4.intValue() : iVar.f180639o;
        Integer numC5 = AbstractC42628a.C11616a.c(lVar.f335197m);
        int iIntValue5 = numC5 != null ? numC5.intValue() : iVar.f180640p;
        String strA = lVar.f335201q.a();
        Integer numValueOf = null;
        Context context = c11616a.f337937a;
        Integer numValueOf2 = (strA == null || (numM2 = com.avito.android.lib.util.f.m(strA)) == null) ? null : Integer.valueOf(com.avito.android.lib.util.f.s(numM2.intValue(), context));
        int iIntValue6 = numValueOf2 != null ? numValueOf2.intValue() : iVar.f180644t;
        String strA2 = lVar.f335202r.a();
        if (strA2 != null && (numM = com.avito.android.lib.util.f.m(strA2)) != null) {
            numValueOf = Integer.valueOf(com.avito.android.lib.util.f.s(numM.intValue(), context));
        }
        return new i(iIntValue2, iIntValue, iIntValue3, nVar, nVar, aVar, c35763c0A, c35763c0A2, iVar.f180633i, iVar.f180634j, iVar.f180635k, c35763c0A3, iVar.f180637m, iVar.f180638n, iIntValue4, iIntValue5, iVar.f180641q, iVar.f180642r, iVar.f180643s, iIntValue6, numValueOf != null ? numValueOf.intValue() : iVar.f180645u, iVar.f180646v, iVar.f180647w);
    }
}
