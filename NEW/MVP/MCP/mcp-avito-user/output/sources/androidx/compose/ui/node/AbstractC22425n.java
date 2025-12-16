package androidx.compose.ui.node;

import androidx.compose.ui.v;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: DelegatingNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22425n extends v.d {

    /* renamed from: p, reason: collision with root package name */
    public final int f40860p = A0.e(this);

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public v.d f40861q;

    @Override // androidx.compose.ui.v.d
    public final void a2() {
        super.a2();
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.j2(this.f42887i);
            if (!dVar.f42893o) {
                dVar.a2();
            }
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void b2() {
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.b2();
        }
        super.b2();
    }

    @Override // androidx.compose.ui.v.d
    public final void f2() {
        super.f2();
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.f2();
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void g2() {
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.g2();
        }
        super.g2();
    }

    @Override // androidx.compose.ui.v.d
    public final void h2() {
        super.h2();
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.h2();
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void i2(@Y61.k v.d dVar) {
        this.f42880b = dVar;
        for (v.d dVar2 = this.f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
            dVar2.i2(dVar);
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void j2(@Y61.l AbstractC22443w0 abstractC22443w0) {
        this.f42887i = abstractC22443w0;
        for (v.d dVar = this.f40861q; dVar != null; dVar = dVar.f42885g) {
            dVar.j2(abstractC22443w0);
        }
    }

    @Y61.k
    public final <T extends InterfaceC22419k> T k2(@Y61.k T t12) {
        v.d f42880b = t12.getF42880b();
        if (f42880b != t12) {
            v.d dVar = t12 instanceof v.d ? (v.d) t12 : null;
            v.d dVar2 = dVar != null ? dVar.f42884f : null;
            if (f42880b == this.f42880b && kotlin.jvm.internal.L.f(dVar2, this)) {
                return t12;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (f42880b.f42893o) {
            C47949a.b("Cannot delegate to an already attached node");
        }
        f42880b.i2(this.f42880b);
        int i12 = this.f42882d;
        int iF2 = A0.f(f42880b);
        f42880b.f42882d = iF2;
        int i13 = this.f42882d;
        int i14 = iF2 & 2;
        if (i14 != 0 && (i13 & 2) != 0 && !(this instanceof K)) {
            C47949a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + f42880b);
        }
        f42880b.f42885g = this.f40861q;
        this.f40861q = f42880b;
        f42880b.f42884f = this;
        m2(iF2 | this.f42882d, false);
        if (this.f42893o) {
            if (i14 == 0 || (i12 & 2) != 0) {
                j2(this.f42887i);
            } else {
                C22437t0 c22437t0 = C22421l.g(this).f40615I;
                this.f42880b.j2(null);
                c22437t0.h();
            }
            f42880b.a2();
            f42880b.g2();
            if (!f42880b.f42893o) {
                C47949a.b("autoInvalidateInsertedNode called on unattached node");
            }
            A0.a(f42880b, -1, 1);
        }
        return t12;
    }

    public final void l2(@Y61.k InterfaceC22419k interfaceC22419k) {
        v.d dVar = null;
        for (v.d dVar2 = this.f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
            if (dVar2 == interfaceC22419k) {
                boolean z12 = dVar2.f42893o;
                if (z12) {
                    androidx.collection.M0<Object> m02 = A0.f40544a;
                    if (!z12) {
                        C47949a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    A0.a(dVar2, -1, 2);
                    dVar2.h2();
                    dVar2.b2();
                }
                dVar2.i2(dVar2);
                dVar2.f42883e = 0;
                if (dVar == null) {
                    this.f40861q = dVar2.f42885g;
                } else {
                    dVar.f42885g = dVar2.f42885g;
                }
                dVar2.f42885g = null;
                dVar2.f42884f = null;
                int i12 = this.f42882d;
                int iF2 = A0.f(this);
                m2(iF2, true);
                if (this.f42893o && (i12 & 2) != 0 && (iF2 & 2) == 0) {
                    C22437t0 c22437t0 = C22421l.g(this).f40615I;
                    this.f42880b.j2(null);
                    c22437t0.h();
                    return;
                }
                return;
            }
            dVar = dVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC22419k).toString());
    }

    public final void m2(int i12, boolean z12) {
        v.d dVar;
        int i13 = this.f42882d;
        this.f42882d = i12;
        if (i13 != i12) {
            v.d dVar2 = this.f42880b;
            if (dVar2 == this) {
                this.f42883e = i12;
            }
            if (this.f42893o) {
                v.d dVar3 = this;
                while (dVar3 != null) {
                    i12 |= dVar3.f42882d;
                    dVar3.f42882d = i12;
                    if (dVar3 == dVar2) {
                        break;
                    } else {
                        dVar3 = dVar3.f42884f;
                    }
                }
                if (z12 && dVar3 == dVar2) {
                    i12 = A0.f(dVar2);
                    dVar2.f42882d = i12;
                }
                int i14 = i12 | ((dVar3 == null || (dVar = dVar3.f42885g) == null) ? 0 : dVar.f42883e);
                while (dVar3 != null) {
                    i14 |= dVar3.f42882d;
                    dVar3.f42883e = i14;
                    dVar3 = dVar3.f42884f;
                }
            }
        }
    }
}
