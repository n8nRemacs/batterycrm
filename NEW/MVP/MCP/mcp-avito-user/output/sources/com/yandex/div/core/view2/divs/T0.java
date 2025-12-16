package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.AbstractC38578v3;
import com.yandex.div2.C38467o1;
import com.yandex.div2.C38566u0;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.InterfaceC38587w3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivInputBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/T0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivInput;", "Lcom/yandex/div/core/view2/divs/widgets/j;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class T0 implements com.yandex.div.core.view2.N<DivInput, com.yandex.div.core.view2.divs.widgets.j> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.J f368228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.variables.h f368229c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368230d;

    /* compiled from: DivInputBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivInput.KeyboardType.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[4] = 3;
            iArr[5] = 4;
            iArr[3] = 5;
            iArr[2] = 6;
        }
    }

    @Inject
    public T0(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.view2.J j12, @Y61.k com.yandex.div.core.expression.variables.h hVar, @Y61.k com.yandex.div.core.view2.errors.f fVar) {
        this.f368227a = c38006w;
        this.f368228b = j12;
        this.f368229c = hVar;
        this.f368230d = fVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.j jVar, @Y61.k DivInput divInput, @Y61.k C38029k c38029k) {
        com.yandex.div.json.expressions.b<String> bVar;
        InterfaceC37911f interfaceC37911fD;
        DivInput div = jVar.getDiv();
        if (divInput.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        jVar.g();
        jVar.setDiv$div_release(divInput);
        C38006w c38006w = this.f368227a;
        if (div != null) {
            c38006w.h(c38029k, jVar, div);
        }
        Drawable background = jVar.getBackground();
        c38006w.d(jVar, divInput, div, c38029k);
        jVar.setFocusable(true);
        jVar.setFocusableInTouchMode(true);
        jVar.setTextAlignment(5);
        if (background != null) {
            DivInput.j jVar2 = divInput.f371737z;
            com.yandex.div.json.expressions.b<Integer> bVar2 = jVar2 == null ? null : jVar2.f371759a;
            if (bVar2 != null) {
                jVar.e(bVar2.e(expressionResolver, new U0(this, jVar, divInput, c38029k, expressionResolver, background)));
            }
        }
        V0 v02 = new V0(this, jVar, expressionResolver, divInput);
        jVar.e(divInput.f371723l.e(expressionResolver, v02));
        jVar.e(divInput.f371732u.d(expressionResolver, v02));
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar3 = divInput.f371724m;
        jVar.e(bVar3.d(expressionResolver, v02));
        C37982n1 c37982n1 = new C37982n1(this, jVar, expressionResolver, divInput);
        jVar.e(divInput.f371722k.e(expressionResolver, c37982n1));
        jVar.e(divInput.f371725n.d(expressionResolver, c37982n1));
        jVar.e(divInput.f371699E.e(expressionResolver, new C37979m1(jVar, divInput, expressionResolver)));
        DivSizeUnit divSizeUnitA = bVar3.a(expressionResolver);
        com.yandex.div.json.expressions.b<Long> bVar4 = divInput.f371733v;
        if (bVar4 == null) {
            jVar.setFixedLineHeight(null);
            C37931a.e(jVar, null, divSizeUnitA);
        } else {
            jVar.e(bVar4.e(expressionResolver, new C37933a1(this, jVar, bVar4, expressionResolver, divSizeUnitA)));
        }
        com.yandex.div.json.expressions.b<Long> bVar5 = divInput.f371736y;
        if (bVar5 != null) {
            jVar.e(bVar5.e(expressionResolver, new C37961h1(jVar, bVar5, expressionResolver)));
        }
        com.yandex.div.json.expressions.b<String> bVar6 = divInput.f371729r;
        if (bVar6 != null) {
            jVar.e(bVar6.e(expressionResolver, new Y0(jVar, bVar6, expressionResolver)));
        }
        jVar.e(divInput.f371728q.e(expressionResolver, new X0(jVar, divInput, expressionResolver)));
        com.yandex.div.json.expressions.b<Integer> bVar7 = divInput.f371727p;
        if (bVar7 != null) {
            jVar.e(bVar7.e(expressionResolver, new W0(jVar, bVar7, expressionResolver)));
        }
        jVar.e(divInput.f371731t.e(expressionResolver, new Z0(this, jVar)));
        jVar.e(divInput.f371697C.e(expressionResolver, new C37965i1(jVar, divInput, expressionResolver)));
        jVar.removeTextChangedListener(jVar.f368944k);
        jVar.f368944k = null;
        l0.h hVar = new l0.h();
        C37969j1 c37969j1 = new C37969j1(hVar, jVar);
        l0.h hVar2 = new l0.h();
        com.yandex.div.core.view2.errors.d dVarA = this.f368230d.a(c38029k.getDivData(), c38029k.getDataTag());
        C37957g1 c37957g1 = new C37957g1(divInput, hVar2, jVar, jVar.getKeyListener(), expressionResolver, c37969j1, new C37937b1(dVarA), dVarA);
        AbstractC38578v3 abstractC38578v3 = divInput.f371735x;
        InterfaceC38587w3 interfaceC38587w3A = abstractC38578v3 == null ? null : abstractC38578v3.a();
        if (interfaceC38587w3A instanceof C38467o1) {
            C38467o1 c38467o1 = (C38467o1) interfaceC38587w3A;
            jVar.e(c38467o1.f375889b.d(expressionResolver, c37957g1));
            for (C38467o1.c cVar : c38467o1.f375890c) {
                jVar.e(cVar.f375898a.d(expressionResolver, c37957g1));
                com.yandex.div.json.expressions.b<String> bVar8 = cVar.f375900c;
                if (bVar8 != null) {
                    jVar.e(bVar8.d(expressionResolver, c37957g1));
                }
                jVar.e(cVar.f375899b.d(expressionResolver, c37957g1));
            }
            jVar.e(c38467o1.f375888a.d(expressionResolver, c37957g1));
        } else if ((interfaceC38587w3A instanceof C38566u0) && (bVar = ((C38566u0) interfaceC38587w3A).f376616a) != null && (interfaceC37911fD = bVar.d(expressionResolver, c37957g1)) != null) {
            jVar.e(interfaceC37911fD);
        }
        c37957g1.invoke(kotlin.G0.f406611a);
        l0.h hVar3 = new l0.h();
        ?? r52 = divInput.f371700F;
        String str = r52;
        if (abstractC38578v3 != null) {
            InterfaceC38587w3 interfaceC38587w3A2 = abstractC38578v3.a();
            String f375891d = interfaceC38587w3A2 == null ? null : interfaceC38587w3A2.getF376617b();
            if (f375891d == null) {
                return;
            }
            hVar3.f406842b = r52;
            str = f375891d;
        }
        jVar.e(this.f368229c.a(c38029k, str, new C37973k1(hVar, jVar, new C37976l1(hVar3, c38029k))));
    }
}
