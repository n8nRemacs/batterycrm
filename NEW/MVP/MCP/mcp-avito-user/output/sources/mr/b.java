package MR;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.M5;
import com.avito.beduin.v2.avito.component.checkbox.state.j;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: CheckboxStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LMR/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/checkbox/state/j;", "Lcom/avito/android/lib/design/toggle/a;", "_design-modules_beduin-v2_renderer_component_checkbox"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<j, com.avito.android.lib.design.toggle.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.toggle.a f10687c;

    public b(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c5326a.getClass();
        this.f10687c = a.C5326a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f10687c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.toggle.a aVar = (com.avito.android.lib.design.toggle.a) obj;
        j jVar = (j) mVar;
        M5 m5E = AbstractC42628a.C11616a.e(c11616a, aVar.f181175b, jVar.f334026c, jVar.f334027d);
        M5 m5D = c11616a.d(aVar.f181176c, jVar.f334028e, jVar.f334029f, jVar.f334032i, jVar.f334033j);
        M5 m5D2 = c11616a.d(aVar.f181178e, jVar.f334030g, jVar.f334031h, jVar.f334034k, jVar.f334035l);
        Integer numC = AbstractC42628a.C11616a.c(jVar.f334036m);
        int iIntValue = numC != null ? numC.intValue() : aVar.f181180g;
        Integer numC2 = AbstractC42628a.C11616a.c(jVar.f334037n);
        int iIntValue2 = numC2 != null ? numC2.intValue() : aVar.f181179f;
        Integer numC3 = AbstractC42628a.C11616a.c(jVar.f334038o);
        int iIntValue3 = numC3 != null ? numC3.intValue() : aVar.f181181h;
        Integer numC4 = AbstractC42628a.C11616a.c(jVar.f334039p);
        int iIntValue4 = numC4 != null ? numC4.intValue() : aVar.f181182i;
        Integer numC5 = AbstractC42628a.C11616a.c(jVar.f334040q);
        return com.avito.android.lib.design.toggle.a.a(aVar, m5E, m5D, m5D2, iIntValue2, iIntValue, iIntValue3, iIntValue4, numC5 != null ? numC5.intValue() : aVar.f181183j);
    }
}
