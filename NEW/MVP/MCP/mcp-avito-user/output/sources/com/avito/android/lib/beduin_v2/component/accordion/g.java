package com.avito.android.lib.beduin_v2.component.accordion;

import PK0.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.accordion.a;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.accordion.state.k;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionStyleComposer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/accordion/g;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/accordion/state/k;", "Lcom/avito/android/lib/design/accordion/a;", "_design-modules_beduin-v2_renderer_component_accordion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC42628a<k, com.avito.android.lib.design.accordion.a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.accordion.a f175505c;

    public g(@Y61.k Context context, @InterfaceC42150f int i12) {
        super(context);
        a.C5252a c5252a = com.avito.android.lib.design.accordion.a.f178201p;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c5252a.getClass();
        this.f175505c = a.C5252a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175505c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        Integer numA;
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.accordion.a aVar = (com.avito.android.lib.design.accordion.a) obj;
        k kVar = (k) mVar;
        if (aVar == null) {
            return null;
        }
        n nVar = (n) D.b(kVar.f333728c, c11616a.f337938b, aVar.f178202a);
        Integer numB = AbstractC42628a.C11616a.b(kVar.f333730e);
        int iIntValue = numB != null ? numB.intValue() : aVar.f178203b;
        Integer numB2 = AbstractC42628a.C11616a.b(kVar.f333731f);
        int iIntValue2 = numB2 != null ? numB2.intValue() : aVar.f178204c;
        String strA = kVar.f333732g.a();
        Drawable drawable = strA != null ? (Drawable) c11616a.f337938b.f338363a.c(strA, null) : aVar.f178205d;
        Integer numB3 = AbstractC42628a.C11616a.b(kVar.f333733h);
        int iIntValue3 = numB3 != null ? numB3.intValue() : aVar.f178206e;
        Integer numB4 = AbstractC42628a.C11616a.b(kVar.f333734i);
        int iIntValue4 = numB4 != null ? numB4.intValue() : aVar.f178207f;
        Integer numB5 = AbstractC42628a.C11616a.b(kVar.f333735j);
        int iIntValue5 = numB5 != null ? numB5.intValue() : aVar.f178208g;
        Integer numB6 = AbstractC42628a.C11616a.b(kVar.f333736k);
        int iIntValue6 = numB6 != null ? numB6.intValue() : aVar.f178209h;
        com.avito.beduin.v2.avito.component.spinner.state.h hVar = (com.avito.beduin.v2.avito.component.spinner.state.h) kVar.f333737l.a();
        int iIntValue7 = (hVar == null || (numA = hVar.f335146c.a()) == null) ? aVar.f178210i : numA.intValue();
        Float fA2 = kVar.f333738m.a();
        return new com.avito.android.lib.design.accordion.a(nVar, iIntValue, iIntValue2, drawable, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, fA2 != null ? (long) fA2.floatValue() : aVar.f178211j, aVar.f178212k, aVar.f178213l, aVar.f178214m, aVar.f178215n, aVar.f178216o);
    }
}
