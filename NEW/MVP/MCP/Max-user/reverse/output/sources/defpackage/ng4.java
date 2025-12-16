package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ng4 {
    public final /* synthetic */ int a;
    public final long b;
    public boolean c;
    public final Object d;

    public ng4(long j, lk6 lk6Var) throws NumberFormatException {
        this.a = 1;
        this.b = j;
        this.d = new ArrayList();
        if (lk6Var.b == 404) {
            return;
        }
        String str = (String) ((HashMap) lk6Var.c).get("Range");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : vmf.S(str, new String[]{","}, 6)) {
            if (!TextUtils.isEmpty(str2)) {
                List listS = vmf.S(str2, new String[]{"/"}, 6);
                if (listS.size() == 2 && !TextUtils.isEmpty((CharSequence) listS.get(0))) {
                    List listS2 = vmf.S((CharSequence) listS.get(0), new String[]{"-"}, 6);
                    if (listS2.size() == 2) {
                        long j2 = Long.parseLong((String) listS2.get(0));
                        long j3 = 1 + (Long.parseLong((String) listS2.get(1)) - j2);
                        ((ArrayList) this.d).add(new c93(j2, j3, j3));
                    }
                }
            }
        }
    }

    public long a() {
        Iterator it = ((ArrayList) this.d).iterator();
        long j = 0;
        while (it.hasNext()) {
            c93 c93Var = (c93) it.next();
            if (c93Var.a()) {
                j += c93Var.b;
            }
        }
        return j;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sbM = az1.m("(");
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    c93 c93Var = (c93) it.next();
                    if (sbM.length() > 1) {
                        sbM.append(",");
                    }
                    sbM.append(c93Var.a);
                    sbM.append("-");
                    sbM.append((c93Var.a + c93Var.b) - 1);
                }
                sbM.append(")");
                return sbM.toString();
            default:
                return super.toString();
        }
    }

    public ng4(long j) {
        this.a = 0;
        this.b = j;
        this.c = true;
        this.d = new e44(7, this);
    }
}
