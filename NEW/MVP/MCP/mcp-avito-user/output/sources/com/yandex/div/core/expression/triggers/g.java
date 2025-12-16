package com.yandex.div.core.expression.triggers;

import Y61.k;
import Y61.l;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.n0;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.a;
import com.yandex.div2.DivTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TriggersController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/expression/triggers/g;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.yandex.div.core.expression.variables.k f367494a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367495b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C37916k f367496c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.yandex.div.evaluable.e f367497d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.yandex.div.core.view2.errors.d f367498e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC37915j f367499f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f367500g;

    public g(@l List<? extends DivTrigger> list, @k com.yandex.div.core.expression.variables.k kVar, @k com.yandex.div.json.expressions.e eVar, @k C37916k c37916k, @k com.yandex.div.evaluable.e eVar2, @k com.yandex.div.core.view2.errors.d dVar, @k InterfaceC37915j interfaceC37915j) {
        this.f367494a = kVar;
        this.f367495b = eVar;
        this.f367496c = c37916k;
        this.f367497d = eVar2;
        this.f367498e = dVar;
        this.f367499f = interfaceC37915j;
        this.f367500g = new ArrayList();
        if (list == null) {
            return;
        }
        for (DivTrigger divTrigger : list) {
            String string = divTrigger.f372181b.getF370554c().toString();
            try {
                com.yandex.div.evaluable.a.f369377c.getClass();
                a.d dVar2 = new a.d(string);
                if ((dVar2.b().isEmpty() ? new RuntimeException("No variables defined!") : null) == null) {
                    this.f367500g.add(new f(string, dVar2, this.f367497d, divTrigger.f372180a, divTrigger.f372182c, this.f367495b, this.f367496c, this.f367494a, this.f367498e, this.f367499f));
                } else {
                    Objects.toString(divTrigger.f372181b);
                }
            } catch (EvaluableException unused) {
            }
        }
    }

    public final void a() {
        Iterator it = this.f367500g.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(null);
        }
    }

    public final void b(@k n0 n0Var) {
        Iterator it = this.f367500g.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(n0Var);
        }
    }

    public /* synthetic */ g(List list, com.yandex.div.core.expression.variables.k kVar, com.yandex.div.json.expressions.e eVar, C37916k c37916k, com.yandex.div.evaluable.e eVar2, com.yandex.div.core.view2.errors.d dVar, InterfaceC37915j interfaceC37915j, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, kVar, eVar, c37916k, eVar2, dVar, interfaceC37915j);
    }
}
