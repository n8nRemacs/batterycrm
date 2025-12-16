package com.yandex.div.core.expression.variables;

import com.yandex.div.core.expression.variables.e;
import com.yandex.div.core.q0;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.util.r;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VariableController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/variables/k;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super C21.h, G0> f367521d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f367518a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f367519b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f367520c = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C21.h, G0> f367522e = new b();

    /* compiled from: VariableController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC21/h;", "it", "Lkotlin/G0;", "invoke", "(LC21/h;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<C21.h, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C21.h hVar) {
            C21.h hVar2 = hVar;
            k kVar = k.this;
            hVar2.f1884a.b(kVar.f367522e);
            kVar.d(hVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: VariableController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC21/h;", "v", "Lkotlin/G0;", "invoke", "(LC21/h;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.l<C21.h, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C21.h hVar) {
            k.this.d(hVar);
            return G0.f406611a;
        }
    }

    public final void a(@Y61.k m mVar) {
        Y41.l<C21.h, G0> lVar = this.f367522e;
        Iterator it = mVar.f367525a.values().iterator();
        while (it.hasNext()) {
            ((C21.h) it.next()).f1884a.b(lVar);
        }
        a aVar = new a();
        r<Y41.l<C21.h, G0>> rVar = mVar.f367527c;
        synchronized (rVar.f370186a) {
            rVar.f370186a.add(aVar);
        }
        this.f367519b.add(mVar);
    }

    public final void b(@Y61.k C21.h hVar) {
        LinkedHashMap linkedHashMap = this.f367518a;
        C21.h hVar2 = (C21.h) linkedHashMap.put(hVar.getF1897b(), hVar);
        if (hVar2 == null) {
            hVar.f1884a.b(this.f367522e);
            d(hVar);
        } else {
            linkedHashMap.put(hVar.getF1897b(), hVar2);
            throw new VariableDeclarationException("Variable '" + hVar.getF1897b() + "' already declared!", null, 2, null);
        }
    }

    @Y61.l
    public final C21.h c(@Y61.k String str) {
        C21.h hVar = (C21.h) this.f367518a.get(str);
        if (hVar != null) {
            return hVar;
        }
        Iterator it = this.f367519b.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            ((e.a) mVar.f367526b).invoke(str);
            C21.h hVar2 = (C21.h) mVar.f367525a.get(str);
            if (hVar2 != null) {
                return hVar2;
            }
        }
        return null;
    }

    public final void d(C21.h hVar) {
        com.yandex.div.internal.a.a();
        Y41.l<? super C21.h, G0> lVar = this.f367521d;
        if (lVar != null) {
            lVar.invoke(hVar);
        }
        q0 q0Var = (q0) this.f367520c.get(hVar.getF1897b());
        if (q0Var == null) {
            return;
        }
        Iterator<E> it = q0Var.iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(hVar);
        }
    }

    public final void e(String str, com.yandex.div.core.view2.errors.d dVar, boolean z12, Y41.l<? super C21.h, G0> lVar) {
        C21.h hVarC = c(str);
        LinkedHashMap linkedHashMap = this.f367520c;
        if (hVarC == null) {
            if (dVar != null) {
                dVar.a(new ParsingException(ParsingExceptionReason.f370546d, L.j(str, "No variable could be resolved for '"), null, null, null, 24, null));
            }
            Object q0Var = linkedHashMap.get(str);
            if (q0Var == null) {
                q0Var = new q0();
                linkedHashMap.put(str, q0Var);
            }
            ((q0) q0Var).b(lVar);
            return;
        }
        if (z12) {
            com.yandex.div.internal.a.a();
            lVar.invoke(hVarC);
        }
        Object q0Var2 = linkedHashMap.get(str);
        if (q0Var2 == null) {
            q0Var2 = new q0();
            linkedHashMap.put(str, q0Var2);
        }
        ((q0) q0Var2).b(lVar);
    }
}
