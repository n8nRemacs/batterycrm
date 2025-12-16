package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class v28 implements ui8 {
    public final n9a X;
    public final ij7 a;
    public final k18 b;
    public final tcf c;
    public final hbd d;
    public final ContextScope o;

    public v28(ij7 ij7Var, k18 k18Var, lzf lzfVar) {
        this.a = ij7Var;
        this.b = k18Var;
        tcf tcfVarA = ucf.a(new cpg(new ek8(10)));
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        this.o = d7j.a(((q2b) lzfVar).a());
        Symbol symbol = o9a.a;
        this.X = new n9a();
        ij7Var.u0 = this;
    }

    public static final void a(v28 v28Var, long j) {
        boolean z;
        tcf tcfVar = v28Var.c;
        List listB = v28Var.a.b(j);
        int i = 1;
        if (listB == null) {
            z = false;
        } else {
            int i2 = 0;
            z = false;
            while (i2 < listB.size()) {
                sia siaVar = (sia) ((Map.Entry) listB.get(i2)).getValue();
                i2++;
                sia siaVar2 = i2 < listB.size() ? (sia) ((Map.Entry) listB.get(i2)).getValue() : null;
                if (siaVar2 != null) {
                    s00 s00Var = siaVar2.b;
                    s00 s00Var2 = siaVar.b;
                    if (s00Var2 == null) {
                        if (s00Var != null) {
                            z = true;
                        }
                    } else if (!s00Var2.equals(s00Var)) {
                        z = true;
                    }
                }
            }
        }
        s00 s00Var3 = z ? s00.UNKNOWN : (listB == null || listB.isEmpty()) ? null : ((sia) ((Map.Entry) listB.get(0)).getValue()).b;
        switch (s00Var3 == null ? -1 : t28.$EnumSwitchMapping$0[s00Var3.ordinal()]) {
            case 1:
                i = 5;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 6;
                break;
        }
        CharSequence charSequenceG = ((ij2) v28Var.b.getValue()).g(j);
        if (charSequenceG == null) {
            charSequenceG = "";
        }
        uz2 uz2Var = new uz2(j, i, charSequenceG);
        cpg cpgVar = (cpg) tcfVar.getValue();
        ek8 ek8Var = new ek8(cpgVar.a.g());
        ek8 ek8Var2 = cpgVar.a;
        int iG = ek8Var2.g();
        for (int i3 = 0; i3 < iG; i3++) {
            ek8Var.e(ek8Var2.d(i3), ek8Var2.h(i3));
        }
        ek8Var.e(j, uz2Var);
        tcfVar.m(null, new cpg(ek8Var));
    }

    public static final void b(v28 v28Var, long j) {
        tcf tcfVar = v28Var.c;
        cpg cpgVar = (cpg) tcfVar.getValue();
        ek8 ek8Var = new ek8(cpgVar.a.g());
        ek8 ek8Var2 = cpgVar.a;
        int iG = ek8Var2.g();
        for (int i = 0; i < iG; i++) {
            ek8Var.e(ek8Var2.d(i), ek8Var2.h(i));
        }
        ek8Var.f(j);
        tcfVar.m(null, new cpg(ek8Var));
    }

    @Override // defpackage.ui8
    public final void c() {
        this.a.u0 = null;
    }
}
