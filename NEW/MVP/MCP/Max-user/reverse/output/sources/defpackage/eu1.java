package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class eu1 extends xfh {
    public static final imb o = new imb(fui.a("", Long.MIN_VALUE), mwg.c(i0b.A0).toString());
    public final k18 b;
    public final tcf c;
    public final hbd d;

    public eu1(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.b = k18Var2;
        tcf tcfVarA = ucf.a(yt1.a);
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        gw0.w(gw0.u(new g56(((v11) ((z01) k18Var2.getValue())).t0, new du1(this, k18Var, null), 1), ((q2b) ((lzf) k18Var3.getValue())).a()), this.a);
    }

    public static final o98 t(eu1 eu1Var, List list) {
        boolean z = list.size() > 3;
        List<gs1> listY = ue3.Y(list, z ? 2 : list.size());
        ArrayList arrayList = new ArrayList(we3.q(listY, 10));
        for (gs1 gs1Var : listY) {
            arrayList.add(new imb(fui.a(gs1Var.j(), Long.valueOf(gs1Var.d())), gs1Var.q()));
        }
        o98 o98VarD = ve3.d();
        o98VarD.addAll(arrayList);
        if (z) {
            o98VarD.add(o);
        }
        return ve3.a(o98VarD);
    }

    public static final CharSequence u(eu1 eu1Var, String str) {
        if (!vmf.F(str)) {
            List listR = vmf.R(vmf.c0(str), new char[]{' '});
            if (listR.size() >= 2) {
                Object objG = ue3.G(listR);
                CharSequence charSequence = (CharSequence) ue3.P(listR);
                if (charSequence.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                return objG + " " + String.valueOf(charSequence.charAt(0)).toUpperCase(Locale.ROOT) + ".";
            }
        }
        return str;
    }
}
