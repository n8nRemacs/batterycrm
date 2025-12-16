package com.yandex.div.core.expression;

import C21.h;
import Y61.k;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.dagger.z;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.function.C38060d;
import com.yandex.div2.AbstractC38363g8;
import com.yandex.div2.H0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: ExpressionsRuntimeProvider.kt */
@z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/expression/g;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.yandex.div.core.expression.variables.e f367465a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C37916k f367466b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.yandex.div.core.view2.errors.f f367467c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC37915j f367468d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Object, e> f367469e = Collections.synchronizedMap(new LinkedHashMap());

    @Inject
    public g(@k com.yandex.div.core.expression.variables.e eVar, @k C37916k c37916k, @k com.yandex.div.core.view2.errors.f fVar, @k InterfaceC37915j interfaceC37915j) {
        this.f367465a = eVar;
        this.f367466b = c37916k;
        this.f367467c = fVar;
        this.f367468d = interfaceC37915j;
    }

    @k
    public final e a(@k H0 h02, @k q21.c cVar) {
        List<AbstractC38363g8> list;
        boolean z12;
        String str = cVar.f428995a;
        Map<Object, e> map = this.f367469e;
        e eVar = map.get(str);
        com.yandex.div.core.view2.errors.f fVar = this.f367467c;
        List<AbstractC38363g8> list2 = h02.f372515f;
        if (eVar == null) {
            com.yandex.div.core.view2.errors.d dVarA = fVar.a(h02, cVar);
            com.yandex.div.core.expression.variables.k kVar = new com.yandex.div.core.expression.variables.k();
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        kVar.b(com.yandex.div.core.expression.variables.c.a((AbstractC38363g8) it.next()));
                    } catch (VariableDeclarationException e12) {
                        dVarA.a(e12);
                    }
                }
            }
            kVar.a(this.f367465a.f367503c);
            C38060d c38060d = new C38060d(new f(kVar, 0));
            d dVar = new d(kVar, new a(c38060d), dVarA);
            list = list2;
            e eVar2 = new e(dVar, kVar, new com.yandex.div.core.expression.triggers.g(h02.f372514e, kVar, dVar, this.f367466b, new com.yandex.div.evaluable.e(new f(kVar, 1), c38060d), dVarA, this.f367468d));
            map.put(str, eVar2);
            eVar = eVar2;
        } else {
            list = list2;
        }
        e eVar3 = eVar;
        com.yandex.div.core.view2.errors.d dVarA2 = fVar.a(h02, cVar);
        if (list != null) {
            for (AbstractC38363g8 abstractC38363g8 : list) {
                String strA = h.a(abstractC38363g8);
                com.yandex.div.core.expression.variables.k kVar2 = eVar3.f367461b;
                C21.h hVarC = kVar2.c(strA);
                if (hVarC == null) {
                    try {
                        kVar2.b(com.yandex.div.core.expression.variables.c.a(abstractC38363g8));
                    } catch (VariableDeclarationException e13) {
                        dVarA2.a(e13);
                    }
                } else {
                    if (abstractC38363g8 instanceof AbstractC38363g8.a) {
                        z12 = hVarC instanceof h.a;
                    } else if (abstractC38363g8 instanceof AbstractC38363g8.f) {
                        z12 = hVarC instanceof h.e;
                    } else if (abstractC38363g8 instanceof AbstractC38363g8.g) {
                        z12 = hVarC instanceof h.d;
                    } else if (abstractC38363g8 instanceof AbstractC38363g8.h) {
                        z12 = hVarC instanceof h.f;
                    } else if (abstractC38363g8 instanceof AbstractC38363g8.b) {
                        z12 = hVarC instanceof h.b;
                    } else if (abstractC38363g8 instanceof AbstractC38363g8.i) {
                        z12 = hVarC instanceof h.g;
                    } else {
                        if (!(abstractC38363g8 instanceof AbstractC38363g8.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z12 = hVarC instanceof h.c;
                    }
                    if (!z12) {
                        dVarA2.a(new IllegalArgumentException(C43066x.E0("\n                           Variable inconsistency detected!\n                           at DivData: " + h.a(abstractC38363g8) + " (" + abstractC38363g8 + ")\n                           at VariableController: " + kVar2.c(h.a(abstractC38363g8)) + "\n                        ")));
                    }
                }
            }
        }
        return eVar3;
    }
}
