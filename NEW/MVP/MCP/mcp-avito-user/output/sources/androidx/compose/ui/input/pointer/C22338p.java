package androidx.compose.ui.input.pointer;

import androidx.collection.C20204c0;
import androidx.collection.N0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.P0;
import androidx.compose.ui.v;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/p;", "Landroidx/compose/ui/input/pointer/q;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22338p extends C22339q {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v.d f40267c;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public AbstractC22443w0 f40270f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C22340s f40271g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40272h;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r0.c f40268d = new r0.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C20204c0<C> f40269e = new C20204c0<>(2);

    /* renamed from: i, reason: collision with root package name */
    public boolean f40273i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40274j = true;

    public C22338p(@Y61.k v.d dVar) {
        this.f40267c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031c A[EDGE_INSN: B:163:0x031c->B:164:0x031d BREAK  A[LOOP:8: B:157:0x02fe->B:161:0x0317]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // androidx.compose.ui.input.pointer.C22339q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@Y61.k androidx.collection.C20204c0<androidx.compose.ui.input.pointer.C> r55, @Y61.k androidx.compose.ui.layout.A r56, @Y61.k androidx.compose.ui.input.pointer.C22333k r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C22338p.a(androidx.collection.c0, androidx.compose.ui.layout.A, androidx.compose.ui.input.pointer.k, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.input.pointer.C22339q
    public final void b(@Y61.k C22333k c22333k) {
        super.b(c22333k);
        C22340s c22340s = this.f40271g;
        if (c22340s == null) {
            return;
        }
        this.f40272h = this.f40273i;
        ?? r12 = c22340s.f40278a;
        int size = ((Collection) r12).size();
        for (int i12 = 0; i12 < size; i12++) {
            C c12 = (C) r12.get(i12);
            boolean z12 = c12.f40119d;
            long j12 = c12.f40116a;
            boolean zA2 = c22333k.a(j12);
            boolean z13 = this.f40273i;
            if ((!z12 && !zA2) || (!z12 && !z13)) {
                this.f40268d.c(j12);
            }
        }
        this.f40273i = false;
        int i13 = c22340s.f40282e;
        C22342u.f40283b.getClass();
        this.f40274j = C22342u.a(i13, C22342u.f40288g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.collection.e] */
    public final void c() {
        androidx.compose.runtime.collection.e<C22338p> eVar = this.f40275a;
        C22338p[] c22338pArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            c22338pArr[i13].c();
        }
        AbstractC22425n abstractC22425nB = this.f40267c;
        ?? eVar2 = 0;
        while (abstractC22425nB != 0) {
            if (abstractC22425nB instanceof P0) {
                ((P0) abstractC22425nB).p1();
            } else if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                v.d dVar = abstractC22425nB.f40861q;
                int i14 = 0;
                abstractC22425nB = abstractC22425nB;
                eVar2 = eVar2;
                while (dVar != null) {
                    if ((dVar.f42882d & 16) != 0) {
                        i14++;
                        eVar2 = eVar2;
                        if (i14 == 1) {
                            abstractC22425nB = dVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                            }
                            if (abstractC22425nB != 0) {
                                eVar2.b(abstractC22425nB);
                                abstractC22425nB = 0;
                            }
                            eVar2.b(dVar);
                        }
                    }
                    dVar = dVar.f42885g;
                    abstractC22425nB = abstractC22425nB;
                    eVar2 = eVar2;
                }
                if (i14 == 1) {
                }
            }
            abstractC22425nB = C22421l.b(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(@Y61.k C22333k c22333k) {
        C20204c0<C> c20204c0 = this.f40269e;
        boolean z12 = false;
        z12 = false;
        if (!c20204c0.j()) {
            v.d dVar = this.f40267c;
            if (dVar.f42893o) {
                C22340s c22340s = this.f40271g;
                long j12 = this.f40270f.f40347d;
                AbstractC22425n abstractC22425nB = dVar;
                ?? eVar = 0;
                while (abstractC22425nB != 0) {
                    if (abstractC22425nB instanceof P0) {
                        ((P0) abstractC22425nB).r0(c22340s, PointerEventPass.f40175d, j12);
                    } else if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                        v.d dVar2 = abstractC22425nB.f40861q;
                        int i12 = 0;
                        abstractC22425nB = abstractC22425nB;
                        eVar = eVar;
                        while (dVar2 != null) {
                            if ((dVar2.f42882d & 16) != 0) {
                                i12++;
                                eVar = eVar;
                                if (i12 == 1) {
                                    abstractC22425nB = dVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                    }
                                    if (abstractC22425nB != 0) {
                                        eVar.b(abstractC22425nB);
                                        abstractC22425nB = 0;
                                    }
                                    eVar.b(dVar2);
                                }
                            }
                            dVar2 = dVar2.f42885g;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC22425nB = C22421l.b(eVar);
                }
                if (dVar.f42893o) {
                    androidx.compose.runtime.collection.e<C22338p> eVar2 = this.f40275a;
                    C22338p[] c22338pArr = eVar2.f38260b;
                    int i13 = eVar2.f38262d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        c22338pArr[i14].d(c22333k);
                    }
                }
                z12 = true;
            }
        }
        b(c22333k);
        c20204c0.a();
        this.f40270f = null;
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(@Y61.k C22333k c22333k, boolean z12) {
        if (this.f40269e.j()) {
            return false;
        }
        AbstractC22425n abstractC22425nB = this.f40267c;
        if (!abstractC22425nB.f42893o) {
            return false;
        }
        C22340s c22340s = this.f40271g;
        long j12 = this.f40270f.f40347d;
        AbstractC22425n abstractC22425nB2 = abstractC22425nB;
        ?? eVar = 0;
        while (abstractC22425nB2 != 0) {
            if (abstractC22425nB2 instanceof P0) {
                ((P0) abstractC22425nB2).r0(c22340s, PointerEventPass.f40173b, j12);
            } else if ((abstractC22425nB2.f42882d & 16) != 0 && (abstractC22425nB2 instanceof AbstractC22425n)) {
                v.d dVar = abstractC22425nB2.f40861q;
                int i12 = 0;
                abstractC22425nB2 = abstractC22425nB2;
                eVar = eVar;
                while (dVar != null) {
                    if ((dVar.f42882d & 16) != 0) {
                        i12++;
                        eVar = eVar;
                        if (i12 == 1) {
                            abstractC22425nB2 = dVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                            }
                            if (abstractC22425nB2 != 0) {
                                eVar.b(abstractC22425nB2);
                                abstractC22425nB2 = 0;
                            }
                            eVar.b(dVar);
                        }
                    }
                    dVar = dVar.f42885g;
                    abstractC22425nB2 = abstractC22425nB2;
                    eVar = eVar;
                }
                if (i12 == 1) {
                }
            }
            abstractC22425nB2 = C22421l.b(eVar);
        }
        if (abstractC22425nB.f42893o) {
            androidx.compose.runtime.collection.e<C22338p> eVar2 = this.f40275a;
            C22338p[] c22338pArr = eVar2.f38260b;
            int i13 = eVar2.f38262d;
            for (int i14 = 0; i14 < i13; i14++) {
                c22338pArr[i14].e(c22333k, z12);
            }
        }
        if (abstractC22425nB.f42893o) {
            ?? eVar3 = 0;
            while (abstractC22425nB != 0) {
                if (abstractC22425nB instanceof P0) {
                    ((P0) abstractC22425nB).r0(c22340s, PointerEventPass.f40174c, j12);
                } else if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                    v.d dVar2 = abstractC22425nB.f40861q;
                    int i15 = 0;
                    abstractC22425nB = abstractC22425nB;
                    eVar3 = eVar3;
                    while (dVar2 != null) {
                        if ((dVar2.f42882d & 16) != 0) {
                            i15++;
                            eVar3 = eVar3;
                            if (i15 == 1) {
                                abstractC22425nB = dVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (abstractC22425nB != 0) {
                                    eVar3.b(abstractC22425nB);
                                    abstractC22425nB = 0;
                                }
                                eVar3.b(dVar2);
                            }
                        }
                        dVar2 = dVar2.f42885g;
                        abstractC22425nB = abstractC22425nB;
                        eVar3 = eVar3;
                    }
                    if (i15 == 1) {
                    }
                }
                abstractC22425nB = C22421l.b(eVar3);
            }
        }
        return true;
    }

    public final void f(long j12, @Y61.k N0<C22338p> n02) {
        r0.c cVar = this.f40268d;
        if (cVar.b(j12) && n02.c(this) < 0) {
            cVar.c(j12);
            this.f40269e.m(j12);
        }
        androidx.compose.runtime.collection.e<C22338p> eVar = this.f40275a;
        C22338p[] c22338pArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            c22338pArr[i13].f(j12, n02);
        }
    }

    @Y61.k
    public final String toString() {
        return "Node(modifierNode=" + this.f40267c + ", children=" + this.f40275a + ", pointerIds=" + this.f40268d + ')';
    }
}
