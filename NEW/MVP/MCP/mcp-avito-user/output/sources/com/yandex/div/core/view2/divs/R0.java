package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div2.AbstractC38265b3;
import com.yandex.div2.C38502q1;
import com.yandex.div2.C38599x6;
import com.yandex.div2.C38656z6;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.G5;
import com.yandex.div2.K5;
import com.yandex.div2.U4;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivIndicatorBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/R0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivIndicator;", "Lcom/yandex/div/core/view2/divs/widgets/m;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class R0 implements com.yandex.div.core.view2.N<DivIndicator, com.yandex.div.core.view2.divs.widgets.m> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C2 f368207b;

    @Inject
    public R0(@Y61.k C38006w c38006w, @Y61.k C2 c22) {
        this.f368206a = c38006w;
        this.f368207b = c22;
    }

    public static void a(com.yandex.div.core.view2.divs.widgets.m mVar, com.yandex.div.json.expressions.e eVar, DivIndicator divIndicator) {
        IndicatorParams.a bVar;
        int i12;
        DisplayMetrics displayMetrics = mVar.getResources().getDisplayMetrics();
        U4 u42 = divIndicator.f371616d;
        float fDoubleValue = (float) divIndicator.f371615c.a(eVar).doubleValue();
        float fDoubleValue2 = (float) divIndicator.f371634v.a(eVar).doubleValue();
        com.yandex.div.json.expressions.b<Integer> bVar2 = divIndicator.f371629q;
        U4 u43 = divIndicator.f371631s;
        IndicatorParams.c cVarD = u43 == null ? null : d(u43, displayMetrics, eVar, bVar2, 1.0f);
        U4 u44 = divIndicator.f371630r;
        if (cVarD == null) {
            cVarD = u42 == null ? null : d(u42, displayMetrics, eVar, bVar2, 1 / fDoubleValue);
            if (cVarD == null) {
                cVarD = u44 == null ? null : d(u44, displayMetrics, eVar, bVar2, fDoubleValue2);
                if (cVarD == null) {
                    G5 g52 = divIndicator.f371601A;
                    if (g52 instanceof G5.d) {
                        cVarD = d(((G5.d) g52).f372491c, displayMetrics, eVar, bVar2, 1.0f);
                    } else {
                        if (!(g52 instanceof G5.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVarD = new IndicatorParams.c.a(bVar2.a(eVar).intValue(), new IndicatorParams.b.a(C37931a.R(((G5.a) g52).f372489c.f373702b, displayMetrics, eVar) * 1.0f));
                    }
                }
            }
        }
        com.yandex.div.json.expressions.b<Integer> bVar3 = divIndicator.f371614b;
        IndicatorParams.c cVarD2 = u42 == null ? null : d(u42, displayMetrics, eVar, bVar3, 1.0f);
        if (cVarD2 == null) {
            cVarD2 = c(cVarD, fDoubleValue, bVar3.a(eVar));
        }
        IndicatorParams.c cVarD3 = u44 == null ? null : d(u44, displayMetrics, eVar, bVar2, 1.0f);
        if (cVarD3 == null) {
            cVarD3 = c(cVarD, fDoubleValue2, null);
        }
        IndicatorParams.c cVar = cVarD3;
        DivIndicator.Animation animationA = divIndicator.f371620h.a(eVar);
        IndicatorParams.Animation animation = animationA == DivIndicator.Animation.WORM ? IndicatorParams.Animation.f370283c : animationA == DivIndicator.Animation.SLIDER ? IndicatorParams.Animation.f370284d : IndicatorParams.Animation.f370282b;
        com.yandex.div.json.b cVar2 = divIndicator.f371632t;
        if (cVar2 == null) {
            cVar2 = new AbstractC38265b3.c(new com.yandex.div2.M0(divIndicator.f371602B));
        }
        if (cVar2 instanceof AbstractC38265b3.c) {
            bVar = new IndicatorParams.a.C10930a(C37931a.P(((AbstractC38265b3.c) cVar2).f374397c.f372775a, displayMetrics, eVar));
        } else {
            if (!(cVar2 instanceof AbstractC38265b3.d)) {
                throw new NoWhenBranchMatchedException();
            }
            C38599x6 c38599x6 = ((AbstractC38265b3.d) cVar2).f374398c;
            float fP2 = C37931a.P(c38599x6.f376968a, displayMetrics, eVar);
            long jLongValue = c38599x6.f376969b.a(eVar).longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            bVar = new IndicatorParams.a.b(fP2, i12);
        }
        mVar.setStyle(new IndicatorParams.d(animation, cVarD2, cVarD, cVar, bVar));
    }

    public static IndicatorParams.c c(IndicatorParams.c cVar, float f12, Integer num) {
        if (!(cVar instanceof IndicatorParams.c.b)) {
            if (cVar instanceof IndicatorParams.c.a) {
                return new IndicatorParams.c.a(num == null ? ((IndicatorParams.c.a) cVar).f370293a : num.intValue(), new IndicatorParams.b.a(((IndicatorParams.c.a) cVar).f370294b.f370289a * f12));
            }
            throw new NoWhenBranchMatchedException();
        }
        int iIntValue = num == null ? ((IndicatorParams.c.b) cVar).f370295a : num.intValue();
        IndicatorParams.c.b bVar = (IndicatorParams.c.b) cVar;
        IndicatorParams.b.C10931b c10931b = bVar.f370296b;
        return C37931a.n(iIntValue, c10931b.f370290a, c10931b.f370291b, c10931b.f370292c, f12, Float.valueOf(bVar.f370297c), Integer.valueOf(bVar.f370298d));
    }

    public static IndicatorParams.c.b d(U4 u42, DisplayMetrics displayMetrics, com.yandex.div.json.expressions.e eVar, com.yandex.div.json.expressions.b bVar, float f12) {
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar2;
        com.yandex.div.json.expressions.b<Long> bVar3;
        Long lA2;
        com.yandex.div.json.expressions.b<Integer> bVar4;
        C38656z6 c38656z6 = u42.f373696e;
        Integer numA = null;
        DivSizeUnit divSizeUnitA = (c38656z6 == null || (bVar2 = c38656z6.f377434b) == null) ? null : bVar2.a(eVar);
        if (divSizeUnitA == null) {
            divSizeUnitA = DivSizeUnit.DP;
        }
        C38656z6 c38656z62 = u42.f373696e;
        Integer numValueOf = (c38656z62 == null || (bVar3 = c38656z62.f377435c) == null || (lA2 = bVar3.a(eVar)) == null) ? null : Integer.valueOf(C37931a.T(lA2, displayMetrics, divSizeUnitA));
        com.yandex.div.json.expressions.b<Integer> bVar5 = u42.f373692a;
        if (bVar5 != null) {
            bVar = bVar5;
        }
        int iIntValue = ((Number) bVar.a(eVar)).intValue();
        float fR2 = C37931a.R(u42.f373695d, displayMetrics, eVar);
        float fR3 = C37931a.R(u42.f373694c, displayMetrics, eVar);
        float fR4 = C37931a.R(u42.f373693b, displayMetrics, eVar);
        Float fValueOf = numValueOf == null ? null : Float.valueOf(numValueOf.intValue());
        if (c38656z62 != null && (bVar4 = c38656z62.f377433a) != null) {
            numA = bVar4.a(eVar);
        }
        return C37931a.n(iIntValue, fR2, fR3, fR4, f12, fValueOf, numA);
    }

    public final void b(@Y61.k com.yandex.div.core.view2.divs.widgets.m mVar, @Y61.k DivIndicator divIndicator, @Y61.k C38029k c38029k) {
        String str = divIndicator.f371636x;
        if (str != null) {
            WeakHashMap<String, List<com.yandex.div.core.view2.divs.widgets.m>> weakHashMap = this.f368207b.f368026b;
            List<com.yandex.div.core.view2.divs.widgets.m> arrayList = weakHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                weakHashMap.put(str, arrayList);
            }
            arrayList.add(mVar);
        }
        DivIndicator div = mVar.getDiv();
        if (divIndicator.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        mVar.g();
        mVar.setDiv$div_release(divIndicator);
        C38006w c38006w = this.f368206a;
        if (div != null) {
            c38006w.h(c38029k, mVar, div);
        }
        c38006w.d(mVar, divIndicator, div, c38029k);
        a(mVar, expressionResolver, divIndicator);
        Q0 q02 = new Q0(this, mVar, expressionResolver, divIndicator);
        mVar.e(divIndicator.f371620h.d(expressionResolver, q02));
        mVar.e(divIndicator.f371614b.d(expressionResolver, q02));
        mVar.e(divIndicator.f371615c.d(expressionResolver, q02));
        mVar.e(divIndicator.f371629q.d(expressionResolver, q02));
        mVar.e(divIndicator.f371634v.d(expressionResolver, q02));
        C37931a.G(mVar, expressionResolver, divIndicator.f371601A, q02);
        U4 u42 = divIndicator.f371616d;
        if (u42 != null) {
            C37931a.F(mVar, expressionResolver, u42, q02);
        }
        U4 u43 = divIndicator.f371631s;
        if (u43 != null) {
            C37931a.F(mVar, expressionResolver, u43, q02);
        }
        U4 u44 = divIndicator.f371630r;
        if (u44 != null) {
            C37931a.F(mVar, expressionResolver, u44, q02);
        }
        com.yandex.div.json.b cVar = divIndicator.f371632t;
        if (cVar == null) {
            cVar = new AbstractC38265b3.c(new com.yandex.div2.M0(divIndicator.f371602B));
        }
        if (cVar instanceof AbstractC38265b3.c) {
            com.yandex.div2.M0 m02 = ((AbstractC38265b3.c) cVar).f374397c;
            mVar.e(m02.f372775a.f376152b.d(expressionResolver, q02));
            mVar.e(m02.f372775a.f376151a.d(expressionResolver, q02));
        } else if (cVar instanceof AbstractC38265b3.d) {
            C38599x6 c38599x6 = ((AbstractC38265b3.d) cVar).f374398c;
            mVar.e(c38599x6.f376968a.f376152b.d(expressionResolver, q02));
            mVar.e(c38599x6.f376968a.f376151a.d(expressionResolver, q02));
            mVar.e(c38599x6.f376969b.d(expressionResolver, q02));
        }
        K5 k52 = divIndicator.f371612L;
        if (k52 instanceof K5.c) {
            mVar.e(((C38502q1) k52.a()).f376152b.d(expressionResolver, q02));
        }
        K5 k53 = divIndicator.f371627o;
        if (k53 instanceof K5.c) {
            mVar.e(((C38502q1) k53.a()).f376152b.d(expressionResolver, q02));
        }
    }
}
