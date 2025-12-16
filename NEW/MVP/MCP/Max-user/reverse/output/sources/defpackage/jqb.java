package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class jqb {
    public final w8a a;
    public final ui5 b;
    public final boolean c;
    public final erb d;
    public final yi5 e;
    public final lzf f;
    public final bwf g;
    public final bwf h;
    public final bwf i;

    public jqb(w8a w8aVar, ui5 ui5Var, boolean z, erb erbVar, yi5 yi5Var, lzf lzfVar) {
        this.a = w8aVar;
        this.b = ui5Var;
        this.c = z;
        this.d = erbVar;
        this.e = yi5Var;
        this.f = lzfVar;
        final int i = 0;
        this.g = new bwf(new cm6(this) { // from class: hqb
            public final /* synthetic */ jqb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                jqb jqbVar = this.b;
                switch (i2) {
                    case 0:
                        w8a w8aVar2 = jqbVar.a;
                        ArrayList arrayList = new ArrayList(w8aVar2.b);
                        Object[] objArr = w8aVar2.a;
                        int i3 = w8aVar2.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayList.add((bi5) ((em6) objArr[i4]).invoke(jqbVar));
                        }
                        return Collections.unmodifiableList(arrayList);
                    case 1:
                        return ys.t(new ui5[]{new uh3(), jqbVar.b});
                    default:
                        lzf lzfVar2 = jqbVar.f;
                        if (lzfVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        z74 z74VarA = ((q2b) lzfVar2).a();
                        yi5 yi5Var2 = jqbVar.e;
                        if (yi5Var2 != null) {
                            return d7j.a(zk6.a().plus(z74VarA).plus(new zi5(yi5Var2, 0)));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i2 = 1;
        this.h = new bwf(new cm6(this) { // from class: hqb
            public final /* synthetic */ jqb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                jqb jqbVar = this.b;
                switch (i22) {
                    case 0:
                        w8a w8aVar2 = jqbVar.a;
                        ArrayList arrayList = new ArrayList(w8aVar2.b);
                        Object[] objArr = w8aVar2.a;
                        int i3 = w8aVar2.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayList.add((bi5) ((em6) objArr[i4]).invoke(jqbVar));
                        }
                        return Collections.unmodifiableList(arrayList);
                    case 1:
                        return ys.t(new ui5[]{new uh3(), jqbVar.b});
                    default:
                        lzf lzfVar2 = jqbVar.f;
                        if (lzfVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        z74 z74VarA = ((q2b) lzfVar2).a();
                        yi5 yi5Var2 = jqbVar.e;
                        if (yi5Var2 != null) {
                            return d7j.a(zk6.a().plus(z74VarA).plus(new zi5(yi5Var2, 0)));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i3 = 2;
        this.i = new bwf(new cm6(this) { // from class: hqb
            public final /* synthetic */ jqb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                jqb jqbVar = this.b;
                switch (i22) {
                    case 0:
                        w8a w8aVar2 = jqbVar.a;
                        ArrayList arrayList = new ArrayList(w8aVar2.b);
                        Object[] objArr = w8aVar2.a;
                        int i32 = w8aVar2.b;
                        for (int i4 = 0; i4 < i32; i4++) {
                            arrayList.add((bi5) ((em6) objArr[i4]).invoke(jqbVar));
                        }
                        return Collections.unmodifiableList(arrayList);
                    case 1:
                        return ys.t(new ui5[]{new uh3(), jqbVar.b});
                    default:
                        lzf lzfVar2 = jqbVar.f;
                        if (lzfVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        z74 z74VarA = ((q2b) lzfVar2).a();
                        yi5 yi5Var2 = jqbVar.e;
                        if (yi5Var2 != null) {
                            return d7j.a(zk6.a().plus(z74VarA).plus(new zi5(yi5Var2, 0)));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    public final void a(Exception exc) {
        yi5 yi5Var = this.e;
        if (yi5Var != null) {
            ((y3b) yi5Var).a(new d1("ONEME-25589", exc, 5));
        }
    }
}
