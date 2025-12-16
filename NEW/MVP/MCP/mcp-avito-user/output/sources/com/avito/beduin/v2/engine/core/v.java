package com.avito.beduin.v2.engine.core;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.core.manager.c;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ObservingScope.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/core/v;", "Lcom/avito/beduin/v2/engine/core/z;", "Lcom/avito/beduin/v2/engine/r;", "LYT0/a;", "Lcom/avito/beduin/v2/engine/s;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v implements z, com.avito.beduin.v2.engine.r, YT0.a, com.avito.beduin.v2.engine.s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336696a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public c.a f336697b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public HashSet f336698c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f336699d;

    public v(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k c.a aVar) {
        this.f336696a = interfaceC36274k;
        this.f336697b = aVar;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j A() {
        return new com.avito.beduin.v2.engine.field.o(com.avito.beduin.v2.engine.utils.f.a(), null);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final K B(@Y61.k p pVar, @Y61.l Object obj, @Y61.k C36240c c36240c) {
        com.avito.beduin.v2.engine.core.manager.b bVar = (com.avito.beduin.v2.engine.core.manager.b) this.f336697b.b(pVar.getF336629a());
        if (!kotlin.jvm.internal.L.f(bVar != null ? bVar.f336657b : null, pVar)) {
            throw new IllegalStateException(("Attempting to update value (" + pVar.getF336629a() + ") from another scope. You must use createValueIfNeeded and updateValueIfNeeded with value from the same scope").toString());
        }
        c.a aVar = this.f336697b;
        String f336629a = pVar.getF336629a();
        pVar.n(c36240c);
        G0 g02 = G0.f406611a;
        aVar.c(f336629a, new com.avito.beduin.v2.engine.core.manager.b(obj, pVar));
        return pVar;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R extends L> R C(@Y61.k String str) {
        com.avito.beduin.v2.engine.core.manager.b bVar = (R) this.f336697b.b(str);
        this.f336697b.c(str, bVar);
        return bVar instanceof com.avito.beduin.v2.engine.core.manager.b ? (R) bVar.f336657b : bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ZT0.i D(@Y61.k com.avito.beduin.v2.engine.InterfaceC36274k r3, @Y61.k java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r2.f336699d
            if (r0 != 0) goto L32
            com.avito.beduin.v2.engine.core.manager.c$a r0 = r2.f336697b
            com.avito.beduin.v2.engine.core.L r0 = r0.b(r4)
            if (r0 == 0) goto L1b
            com.avito.beduin.v2.engine.k r1 = r0.getF336647b()
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            goto L2a
        L1b:
            ZT0.e r0 = new ZT0.e
            com.avito.beduin.v2.engine.k r1 = r2.f336696a
            com.avito.beduin.v2.engine.H r1 = r1.getF336924h()
            boolean r1 = r1.f336486m
            r1 = r1 ^ 1
            r0.<init>(r3, r1)
        L2a:
            com.avito.beduin.v2.engine.core.manager.c$a r3 = r2.f336697b
            r3.a(r4, r0)
            ZT0.i r0 = (ZT0.i) r0
            return r0
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "You shouldn't use closed Scope"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.core.v.D(com.avito.beduin.v2.engine.k, java.lang.String):ZT0.i");
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final InterfaceC36252b E(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        if (this.f336699d) {
            throw new IllegalStateException("You shouldn't use closed Scope");
        }
        L lB2 = this.f336697b.b(str);
        if (lB2 == null || !kotlin.jvm.internal.L.f(lB2.getF336647b(), interfaceC36274k)) {
            lB2 = null;
        }
        com.avito.beduin.v2.engine.core.manager.b bVar = lB2 instanceof com.avito.beduin.v2.engine.core.manager.b ? (com.avito.beduin.v2.engine.core.manager.b) lB2 : null;
        InterfaceC36252b c36257g = bVar != null ? (InterfaceC36252b) bVar.f336657b : new C36257g(interfaceC36274k);
        if (bVar != null && !kotlin.jvm.internal.L.f(bVar.f336656a, obj)) {
            c36257g.clear();
        }
        this.f336697b.a(str, new com.avito.beduin.v2.engine.core.manager.b(obj, c36257g));
        return c36257g;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean F() {
        return a().f336483j;
    }

    @Override // com.avito.beduin.v2.engine.s
    public final void G(@Y61.k dU0.f fVar) {
        this.f336696a.G(fVar);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final Set<N> H() {
        return C42745f0.P0(this.f336698c);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final dU0.c I(@Y61.k String str) {
        return this.f336696a.I(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.H a() {
        return this.f336696a.getF336924h();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void close() {
        this.f336699d = true;
        this.f336698c = null;
        this.f336697b = null;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean d(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        Map<Object, L> map;
        if (this.f336699d) {
            throw new IllegalStateException("You shouldn't use closed Scope");
        }
        c.a aVar = this.f336697b;
        Map<Object, L> map2 = aVar.f336663c;
        L lB2 = ((map2 == null || !map2.containsKey(str)) && ((map = aVar.f336662b) == null || !map.containsKey(str))) ? null : this.f336697b.b(str);
        if (lB2 != null) {
            if (kotlin.jvm.internal.L.f(lB2 instanceof com.avito.beduin.v2.engine.core.manager.b ? ((com.avito.beduin.v2.engine.core.manager.b) lB2).f336656a : null, obj) && kotlin.jvm.internal.L.f(lB2.getF336647b(), interfaceC36274k)) {
                return true;
            }
        }
        return false;
    }

    @Override // YT0.a
    @Y61.k
    /* renamed from: e */
    public final YT0.b getF175484a() {
        return this.f336696a.getF175484a();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R> u<R> f(@Y61.k u<R> uVar, @Y61.l Object obj, R r12) {
        com.avito.beduin.v2.engine.core.manager.b bVar = (com.avito.beduin.v2.engine.core.manager.b) this.f336697b.b(uVar.getF336641a());
        if (!kotlin.jvm.internal.L.f(bVar != null ? bVar.f336657b : null, uVar)) {
            throw new IllegalStateException(("Attempting to update value (" + uVar.getF336641a() + ") from another scope. You must use createValueIfNeeded and updateValueIfNeeded with value from the same scope").toString());
        }
        c.a aVar = this.f336697b;
        String f336641a = uVar.getF336641a();
        uVar.set(r12);
        G0 g02 = G0.f406611a;
        aVar.c(f336641a, new com.avito.beduin.v2.engine.core.manager.b(obj, uVar));
        return uVar;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final c.a getF336697b() {
        return this.f336697b;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336696a() {
        return this.f336696a;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) {
        return this.f336696a.h(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R extends com.avito.beduin.v2.engine.field.d> com.avito.beduin.v2.engine.core.y<R> k(@Y61.k com.avito.beduin.v2.engine.InterfaceC36274k r3, @Y61.k java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r2.f336699d
            if (r0 != 0) goto L28
            com.avito.beduin.v2.engine.core.manager.c$a r0 = r2.f336697b
            com.avito.beduin.v2.engine.core.L r0 = r0.b(r4)
            if (r0 == 0) goto L1b
            com.avito.beduin.v2.engine.k r1 = r0.getF336647b()
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            com.avito.beduin.v2.engine.core.m r0 = new com.avito.beduin.v2.engine.core.m
            r0.<init>(r3, r4)
        L20:
            com.avito.beduin.v2.engine.core.manager.c$a r3 = r2.f336697b
            r3.a(r4, r0)
            com.avito.beduin.v2.engine.core.y r0 = (com.avito.beduin.v2.engine.core.y) r0
            return r0
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "You shouldn't use closed Scope"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.core.v.k(com.avito.beduin.v2.engine.k, java.lang.String):com.avito.beduin.v2.engine.core.y");
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> l(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        if (this.f336699d) {
            throw new IllegalStateException("You shouldn't use closed Scope");
        }
        L lB2 = this.f336697b.b(str);
        if (lB2 == null || !kotlin.jvm.internal.L.f(lB2.getF336647b(), interfaceC36274k)) {
            lB2 = null;
        }
        com.avito.beduin.v2.engine.core.manager.b bVar = lB2 instanceof com.avito.beduin.v2.engine.core.manager.b ? (com.avito.beduin.v2.engine.core.manager.b) lB2 : null;
        if (bVar == null) {
            bVar = new com.avito.beduin.v2.engine.core.manager.b(null, getF336696a().getF336928l().f336536a.a(interfaceC36274k, str));
        }
        this.f336697b.a(str, bVar);
        return (u) bVar.f336657b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.core.InterfaceC36254d n(@Y61.k com.avito.beduin.v2.engine.InterfaceC36274k r3, @Y61.k java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r2.f336699d
            if (r0 != 0) goto L28
            com.avito.beduin.v2.engine.core.manager.c$a r0 = r2.f336697b
            com.avito.beduin.v2.engine.core.L r0 = r0.b(r4)
            if (r0 == 0) goto L1b
            com.avito.beduin.v2.engine.k r1 = r0.getF336647b()
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            com.avito.beduin.v2.engine.core.h r0 = new com.avito.beduin.v2.engine.core.h
            r0.<init>(r3, r4)
        L20:
            com.avito.beduin.v2.engine.core.manager.c$a r3 = r2.f336697b
            r3.a(r4, r0)
            com.avito.beduin.v2.engine.core.d r0 = (com.avito.beduin.v2.engine.core.InterfaceC36254d) r0
            return r0
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "You shouldn't use closed Scope"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.core.v.n(com.avito.beduin.v2.engine.k, java.lang.String):com.avito.beduin.v2.engine.core.d");
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final p o(@Y61.k C36239b.a aVar, @Y61.k String str) {
        if (this.f336699d) {
            throw new IllegalStateException("You shouldn't use closed Scope");
        }
        L lB2 = this.f336697b.b(str);
        if (lB2 == null || !kotlin.jvm.internal.L.f(lB2.getF336647b(), aVar)) {
            lB2 = null;
        }
        com.avito.beduin.v2.engine.core.manager.b bVar = lB2 instanceof com.avito.beduin.v2.engine.core.manager.b ? (com.avito.beduin.v2.engine.core.manager.b) lB2 : null;
        if (bVar == null) {
            bVar = new com.avito.beduin.v2.engine.core.manager.b(null, new C36259i(str, aVar, null, 4, null));
        }
        this.f336697b.a(str, bVar);
        return (p) bVar.f336657b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ZT0.a p(@Y61.k com.avito.beduin.v2.engine.InterfaceC36274k r3, @Y61.k java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r2.f336699d
            if (r0 != 0) goto L28
            com.avito.beduin.v2.engine.core.manager.c$a r0 = r2.f336697b
            com.avito.beduin.v2.engine.core.L r0 = r0.b(r4)
            if (r0 == 0) goto L1b
            com.avito.beduin.v2.engine.k r1 = r0.getF336647b()
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            ZT0.c r0 = new ZT0.c
            r0.<init>(r3)
        L20:
            com.avito.beduin.v2.engine.core.manager.c$a r3 = r2.f336697b
            r3.a(r4, r0)
            ZT0.a r0 = (ZT0.a) r0
            return r0
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "You shouldn't use closed Scope"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.core.v.p(com.avito.beduin.v2.engine.k, java.lang.String):ZT0.a");
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final InterfaceC27104b q(@Y61.k String str) {
        return this.f336696a.q(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j r(@Y61.k String str) {
        return new com.avito.beduin.v2.engine.field.o(com.avito.beduin.v2.engine.utils.f.a(), str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> t(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        if (this.f336699d) {
            throw new IllegalStateException("You shouldn't use closed Scope");
        }
        L lB2 = this.f336697b.b(str);
        if (lB2 == null || !kotlin.jvm.internal.L.f(lB2.getF336647b(), interfaceC36274k)) {
            lB2 = null;
        }
        com.avito.beduin.v2.engine.core.manager.b bVar = lB2 instanceof com.avito.beduin.v2.engine.core.manager.b ? (com.avito.beduin.v2.engine.core.manager.b) lB2 : null;
        if (bVar == null) {
            bVar = new com.avito.beduin.v2.engine.core.manager.b(null, new C36261k(interfaceC36274k, str));
        }
        this.f336697b.a(str, bVar);
        return (u) bVar.f336657b;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean u() {
        return a().f336484k;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final C27107e v(@Y61.k String str) {
        return this.f336696a.v(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void w(@Y61.k N n12) {
        this.f336698c.add(n12);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final z x(@Y61.k String str, boolean z12) {
        return z12 ? this : new J(this, str);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final AbstractC36250j z(@Y61.k String str) {
        return this.f336696a.z(str);
    }
}
