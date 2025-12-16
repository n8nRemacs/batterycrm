package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38267b5;
import com.yandex.div2.DivSizeUnit;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DivSelectBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/G1;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/b5;", "Lcom/yandex/div/core/view2/divs/widgets/p;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class G1 implements com.yandex.div.core.view2.N<C38267b5, com.yandex.div.core.view2.divs.widgets.p> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368077a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.J f368078b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.variables.h f368079c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368080d;

    @Inject
    public G1(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.view2.J j12, @Y61.k com.yandex.div.core.expression.variables.h hVar, @Y61.k com.yandex.div.core.view2.errors.f fVar) {
        this.f368077a = c38006w;
        this.f368078b = j12;
        this.f368079c = hVar;
        this.f368080d = fVar;
    }

    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.p pVar, @Y61.k C38267b5 c38267b5, @Y61.k C38029k c38029k) {
        C38267b5 div = pVar.getDiv();
        if (c38267b5.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        pVar.g();
        q21.c dataTag = c38029k.getDataTag();
        com.yandex.div.core.view2.errors.d dVarA = this.f368080d.a(c38029k.getDivData(), dataTag);
        pVar.setDiv(c38267b5);
        C38006w c38006w = this.f368077a;
        if (div != null) {
            c38006w.h(c38029k, pVar, div);
        }
        c38006w.d(pVar, c38267b5, div, c38029k);
        pVar.setTextAlignment(5);
        com.yandex.div.json.expressions.e expressionResolver2 = c38029k.getExpressionResolver();
        C37931a.I(pVar, c38029k, com.yandex.div.core.view2.animations.j.f367963a, null);
        com.yandex.div.json.expressions.e expressionResolver3 = c38029k.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : c38267b5.f374475v) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C38267b5.i iVar = (C38267b5.i) obj;
            com.yandex.div.json.expressions.b<String> bVar = iVar.f374489a;
            if (bVar == null) {
                bVar = iVar.f374490b;
            }
            arrayList.add(bVar.a(expressionResolver3));
            bVar.d(expressionResolver3, new C38016x1(arrayList, i12, pVar));
            i12 = i13;
        }
        pVar.setItems(arrayList);
        pVar.setOnItemSelectedListener(new C38008w1(pVar, arrayList, c38267b5, expressionResolver2));
        this.f368079c.a(c38029k, c38267b5.f374449G, new F1(c38267b5, pVar, dVarA, c38029k.getExpressionResolver()));
        C38019y1 c38019y1 = new C38019y1(c38267b5, expressionResolver, pVar);
        pVar.e(c38267b5.f374465l.e(expressionResolver, c38019y1));
        pVar.e(c38267b5.f374472s.d(expressionResolver, c38019y1));
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar2 = c38267b5.f374466m;
        pVar.e(bVar2.d(expressionResolver, c38019y1));
        D1 d12 = new D1(pVar, this, c38267b5, expressionResolver);
        pVar.e(c38267b5.f374464k.e(expressionResolver, d12));
        pVar.e(c38267b5.f374467n.d(expressionResolver, d12));
        pVar.e(c38267b5.f374479z.e(expressionResolver, new C1(pVar)));
        com.yandex.div.json.expressions.b<Long> bVar3 = c38267b5.f374473t;
        if (bVar3 == null) {
            C37931a.e(pVar, null, bVar2.a(expressionResolver));
        } else {
            B1 b12 = new B1(bVar3, expressionResolver, c38267b5, pVar);
            pVar.e(bVar3.e(expressionResolver, b12));
            pVar.e(bVar2.d(expressionResolver, b12));
        }
        com.yandex.div.json.expressions.b<String> bVar4 = c38267b5.f374470q;
        if (bVar4 != null) {
            pVar.e(bVar4.e(expressionResolver, new A1(pVar)));
        }
        pVar.e(c38267b5.f374469p.e(expressionResolver, new C38022z1(pVar)));
    }
}
