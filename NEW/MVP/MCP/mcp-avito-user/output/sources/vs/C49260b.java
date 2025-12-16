package vS;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.page_indicator.state.m;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;
import sV.C48110a;
import sV.C48111b;

/* compiled from: PageIndicatorStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LvS/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/page_indicator/state/m;", "LsV/b;", "_design-modules_beduin-v2_renderer_component_page-indicator"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49260b extends AbstractC42628a<m, C48111b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C48111b f440788c;

    public C49260b(@k Context context, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(context);
        C48111b.a aVar = C48111b.f437674l;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178967f0);
        C48111b c48111bB = C48111b.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        this.f440788c = c48111bB;
    }

    public static C48110a i(AbstractC42628a.C11616a c11616a, C48110a c48110a, f fVar) {
        if (fVar.isEmpty()) {
            return c48110a;
        }
        com.avito.beduin.v2.avito.component.page_indicator.state.a aVar = (com.avito.beduin.v2.avito.component.page_indicator.state.a) fVar.get();
        f<Integer> fVar2 = aVar.f334775a;
        c11616a.getClass();
        Integer numC = AbstractC42628a.C11616a.c(fVar2);
        int iIntValue = numC != null ? numC.intValue() : c48110a.f437670a;
        Integer numC2 = AbstractC42628a.C11616a.c(aVar.f334776b);
        int iIntValue2 = numC2 != null ? numC2.intValue() : c48110a.f437671b;
        Integer numA = F.a(aVar.f334777c, c11616a.f337938b, c11616a.f337939c);
        int iIntValue3 = numA != null ? numA.intValue() : c48110a.f437672c;
        Integer numC3 = AbstractC42628a.C11616a.c(aVar.f334778d);
        int iIntValue4 = numC3 != null ? numC3.intValue() : c48110a.f437673d;
        c48110a.getClass();
        return new C48110a(iIntValue, iIntValue2, iIntValue3, iIntValue4);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f440788c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, com.avito.beduin.v2.theme.m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        C48111b c48111b = (C48111b) obj;
        m mVar2 = (m) mVar;
        Integer numA = AbstractC36331a.C10471a.a(c11616a, mVar2.f334799c);
        int iIntValue = numA != null ? numA.intValue() : c48111b.f437675a;
        Integer numC = AbstractC42628a.C11616a.c(mVar2.f334800d);
        int iIntValue2 = numC != null ? numC.intValue() : c48111b.f437676b;
        Integer numC2 = AbstractC42628a.C11616a.c(mVar2.f334801e);
        int iIntValue3 = numC2 != null ? numC2.intValue() : c48111b.f437677c;
        Integer numC3 = AbstractC42628a.C11616a.c(mVar2.f334802f);
        int iIntValue4 = numC3 != null ? numC3.intValue() : c48111b.f437678d;
        Integer numC4 = AbstractC42628a.C11616a.c(mVar2.f334803g);
        int iIntValue5 = numC4 != null ? numC4.intValue() : c48111b.f437679e;
        Integer numA2 = F.a(mVar2.f334804h, c11616a.f337938b, c11616a.f337939c);
        int iIntValue6 = numA2 != null ? numA2.intValue() : c48111b.f437680f;
        Number numberC = AbstractC42628a.C11616a.c(mVar2.f334809m);
        if (numberC == null) {
            numberC = Long.valueOf(c48111b.f437685k);
        }
        return new C48111b(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, i(c11616a, c48111b.f437681g, mVar2.f334805i), i(c11616a, c48111b.f437682h, mVar2.f334806j), i(c11616a, c48111b.f437683i, mVar2.f334807k), i(c11616a, c48111b.f437684j, mVar2.f334808l), numberC.longValue());
    }
}
