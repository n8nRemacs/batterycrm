package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r77 extends xfh {
    public final ArrayList X;
    public final tcf Y;
    public final ci5 Z;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final SharedPreferences o;

    public r77() {
        su4 su4Var = su4.a;
        Context context = (Context) su4Var.getAccessor().c(12);
        bwf bwfVarD = su4Var.getAccessor().d(31);
        bwf bwfVarD2 = su4Var.getAccessor().d(32);
        bwf bwfVarD3 = su4Var.getAccessor().d(8);
        this.b = bwfVarD2;
        this.c = bwfVarD3;
        this.d = bwfVarD;
        this.o = context.getSharedPreferences("dev_tools", 0);
        List listJ = ve3.j("api.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru", "api-test2.oneme.ru");
        ArrayList arrayList = new ArrayList(listJ.size());
        arrayList.addAll(listJ);
        af3.t(arrayList, new String[0]);
        this.X = arrayList;
        this.Y = ucf.a(u());
        this.Z = new ci5(0);
    }

    public final z7c t() {
        return (z7c) this.b.getValue();
    }

    public final o98 u() {
        o98 o98VarD = ve3.d();
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(new x67(str, Boolean.valueOf(fni.a(str, t().a.I()))));
        }
        o98VarD.addAll(arrayList2);
        String strI = "";
        String string = this.o.getString("Custom", "");
        if (string != null && string.length() != 0) {
            strI = ho7.i(" (", string, ")");
        }
        o98VarD.add(new x67(wy1.h("Custom", strI), Boolean.valueOf(fni.a(string, t().a.I()))));
        return ve3.a(o98VarD);
    }

    public final void v(String str) {
        svi.e(this.a, ((q2b) ((lzf) this.c.getValue())).a().plus(bia.a), null, new q77(str, this, null), 2);
    }
}
