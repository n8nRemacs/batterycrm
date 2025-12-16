package com.yandex.div.core.expression.triggers;

import C21.h;
import Y61.k;
import Y61.l;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.n0;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.a;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTrigger;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TriggersController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/expression/triggers/f;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f367478a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.d f367479b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.yandex.div.evaluable.e f367480c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<DivAction> f367481d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.b<DivTrigger.Mode> f367482e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367483f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C37916k f367484g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.yandex.div.core.expression.variables.k f367485h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.yandex.div.core.view2.errors.d f367486i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC37915j f367487j;

    /* renamed from: l, reason: collision with root package name */
    @k
    public InterfaceC37911f f367489l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f367491n;

    /* renamed from: p, reason: collision with root package name */
    @l
    public n0 f367493p;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Y41.l<h, G0> f367488k = new c(this);

    /* renamed from: m, reason: collision with root package name */
    @k
    public DivTrigger.Mode f367490m = DivTrigger.Mode.ON_CONDITION;

    /* renamed from: o, reason: collision with root package name */
    @k
    public InterfaceC37911f f367492o = InterfaceC37911f.f367528l2;

    public f(@k String str, @k a.d dVar, @k com.yandex.div.evaluable.e eVar, @k List list, @k com.yandex.div.json.expressions.b bVar, @k com.yandex.div.json.expressions.e eVar2, @k C37916k c37916k, @k com.yandex.div.core.expression.variables.k kVar, @k com.yandex.div.core.view2.errors.d dVar2, @k InterfaceC37915j interfaceC37915j) {
        this.f367478a = str;
        this.f367479b = dVar;
        this.f367480c = eVar;
        this.f367481d = list;
        this.f367482e = bVar;
        this.f367483f = eVar2;
        this.f367484g = c37916k;
        this.f367485h = kVar;
        this.f367486i = dVar2;
        this.f367487j = interfaceC37915j;
        this.f367489l = bVar.e(eVar2, new d(this));
    }

    public final void a(@l n0 n0Var) throws Exception {
        this.f367493p = n0Var;
        if (n0Var == null) {
            this.f367489l.close();
            this.f367492o.close();
            return;
        }
        this.f367489l.close();
        List<String> listB = this.f367479b.b();
        Y41.l<h, G0> lVar = this.f367488k;
        com.yandex.div.core.expression.variables.k kVar = this.f367485h;
        kVar.getClass();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            kVar.e((String) it.next(), null, false, lVar);
        }
        this.f367492o = new com.yandex.div.core.expression.c(listB, kVar, lVar, 2);
        this.f367489l = this.f367482e.e(this.f367483f, new e(this));
        b();
    }

    public final void b() {
        com.yandex.div.internal.a.a();
        n0 n0Var = this.f367493p;
        if (n0Var == null) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) this.f367480c.a(this.f367479b)).booleanValue();
            boolean z12 = this.f367491n;
            this.f367491n = zBooleanValue;
            if (zBooleanValue) {
                if (this.f367490m == DivTrigger.Mode.ON_CONDITION && z12 && zBooleanValue) {
                    return;
                }
                for (DivAction divAction : this.f367481d) {
                    this.f367487j.getClass();
                    InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                    this.f367484g.handleAction(divAction, n0Var);
                }
            }
        } catch (EvaluableException e12) {
            this.f367486i.a(new RuntimeException(AK.c.s(new StringBuilder("Condition evaluation failed: '"), this.f367478a, "'!"), e12));
        }
    }
}
