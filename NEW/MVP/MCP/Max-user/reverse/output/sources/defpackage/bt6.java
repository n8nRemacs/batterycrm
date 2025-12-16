package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class bt6 extends l0g {
    public final /* synthetic */ int c;
    public ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt6(tm9 tm9Var, int i) {
        super(tm9Var);
        this.c = i;
        switch (i) {
            case 1:
                super(tm9Var);
                if (this.d == null) {
                    this.d = new ArrayList();
                    break;
                }
                break;
            default:
                break;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("calls")) {
                    this.d = new ArrayList();
                    int iF = efi.f(tm9Var);
                    for (int i = 0; i < iF; i++) {
                        this.d.add(h1h.a(tm9Var));
                    }
                    break;
                } else {
                    tm9Var.v();
                    break;
                }
            default:
                if (fni.a(str, "members")) {
                    int iF2 = efi.f(tm9Var);
                    this.d = new ArrayList();
                    to7 to7VarH = n7j.h(0, iF2);
                    ArrayList arrayList = new ArrayList(we3.q(to7VarH, 10));
                    Iterator it = to7VarH.iterator();
                    while (((so7) it).c) {
                        ((so7) it).nextInt();
                        arrayList.add(ar2.a(tm9Var));
                    }
                    ArrayList arrayList2 = this.d;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    arrayList2.addAll(arrayList);
                    break;
                } else {
                    tm9Var.v();
                    break;
                }
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        switch (this.c) {
            case 0:
                return "Response{calls=" + this.d + "}";
            default:
                ArrayList arrayList = this.d;
                if (arrayList == null) {
                    arrayList = null;
                }
                return ho7.i("{members : [", ue3.N(arrayList, null, null, null, new u7g(5), 31), "]}");
        }
    }
}
