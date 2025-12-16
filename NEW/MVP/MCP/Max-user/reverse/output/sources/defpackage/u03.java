package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class u03 implements g37 {
    public static final List f = Collections.singletonList(new t03());
    public final bwf b;
    public final bwf c;
    public final o00 d = new o00(10);
    public final o00 e = new o00(11);

    public u03(final k18 k18Var, final bwf bwfVar) {
        final int i = 0;
        this.b = new bwf(new cm6(bwfVar, k18Var, this, i) { // from class: s03
            public final /* synthetic */ int a;
            public final /* synthetic */ bwf b;
            public final /* synthetic */ k18 c;

            {
                this.a = i;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                Object next;
                switch (this.a) {
                    case 0:
                        f86 f86VarA = ((h13) this.b.getValue()).a();
                        c23 b23Var = f86VarA.a() ? a23.a : new b23(f86VarA.o, f86VarA.d, f86VarA.z0, f86VarA.A0, f86VarA.Y);
                        ch2 ch2Var = (ch2) this.c.getValue();
                        ch2Var.getClass();
                        pb2 pb2Var = (pb2) lee.i(ch2Var.a(ch2.b(new at(2, ((ve2) ch2Var.c.getValue()).O(b23Var.getComparator())), b23Var), b23Var));
                        Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                    default:
                        f86 f86VarA2 = ((h13) this.b.getValue()).a();
                        c23 b23Var2 = f86VarA2.a() ? a23.a : new b23(f86VarA2.o, f86VarA2.d, f86VarA2.z0, f86VarA2.A0, f86VarA2.Y);
                        ch2 ch2Var2 = (ch2) this.c.getValue();
                        ch2Var2.getClass();
                        Iterator it = ch2Var2.a(ch2.b(new at(2, ((ve2) ch2Var2.c.getValue()).O(b23Var2.getComparator())), b23Var2), b23Var2).iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                        } else {
                            next = null;
                        }
                        pb2 pb2Var2 = (pb2) next;
                        Long lValueOf2 = pb2Var2 != null ? Long.valueOf(pb2Var2.a) : null;
                        return Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : -1L);
                }
            }
        });
        final int i2 = 1;
        this.c = new bwf(new cm6(bwfVar, k18Var, this, i2) { // from class: s03
            public final /* synthetic */ int a;
            public final /* synthetic */ bwf b;
            public final /* synthetic */ k18 c;

            {
                this.a = i2;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                Object next;
                switch (this.a) {
                    case 0:
                        f86 f86VarA = ((h13) this.b.getValue()).a();
                        c23 b23Var = f86VarA.a() ? a23.a : new b23(f86VarA.o, f86VarA.d, f86VarA.z0, f86VarA.A0, f86VarA.Y);
                        ch2 ch2Var = (ch2) this.c.getValue();
                        ch2Var.getClass();
                        pb2 pb2Var = (pb2) lee.i(ch2Var.a(ch2.b(new at(2, ((ve2) ch2Var.c.getValue()).O(b23Var.getComparator())), b23Var), b23Var));
                        Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                    default:
                        f86 f86VarA2 = ((h13) this.b.getValue()).a();
                        c23 b23Var2 = f86VarA2.a() ? a23.a : new b23(f86VarA2.o, f86VarA2.d, f86VarA2.z0, f86VarA2.A0, f86VarA2.Y);
                        ch2 ch2Var2 = (ch2) this.c.getValue();
                        ch2Var2.getClass();
                        Iterator it = ch2Var2.a(ch2.b(new at(2, ((ve2) ch2Var2.c.getValue()).O(b23Var2.getComparator())), b23Var2), b23Var2).iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                        } else {
                            next = null;
                        }
                        pb2 pb2Var2 = (pb2) next;
                        Long lValueOf2 = pb2Var2 != null ? Long.valueOf(pb2Var2.a) : null;
                        return Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : -1L);
                }
            }
        });
    }

    @Override // defpackage.g37
    public final boolean a() {
        return false;
    }

    @Override // defpackage.g37
    public final Comparator c() {
        return this.d;
    }

    @Override // defpackage.g37
    public final Comparator e() {
        return this.e;
    }

    @Override // defpackage.g37
    public final long g() {
        return ((Number) this.b.getValue()).longValue();
    }

    @Override // defpackage.g37
    public final long h() {
        return ((Number) this.c.getValue()).longValue();
    }

    @Override // defpackage.g37
    public final List j() {
        return f;
    }
}
