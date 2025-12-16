package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vl7 extends j5c {
    public final boolean l;

    public vl7(String str, wl7 wl7Var) {
        super(str, wl7Var, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    @Override // defpackage.j5c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vl7) {
            ree reeVar = (ree) obj;
            if (fni.a(this.a, reeVar.a())) {
                vl7 vl7Var = (vl7) obj;
                if (vl7Var.l && Arrays.equals((ree[]) this.j.getValue(), (ree[]) vl7Var.j.getValue())) {
                    int iF = reeVar.f();
                    int i = this.c;
                    if (i == iF) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (fni.a(i(i2).a(), reeVar.i(i2).a()) && fni.a(i(i2).e(), reeVar.i(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.j5c
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.j5c, defpackage.ree
    public final boolean isInline() {
        return this.l;
    }
}
