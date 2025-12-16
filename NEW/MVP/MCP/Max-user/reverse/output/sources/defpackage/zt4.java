package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class zt4 implements wt4 {
    public final z2i d;
    public int f;
    public int g;
    public z2i a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public uw4 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public zt4(z2i z2iVar) {
        this.d = z2iVar;
    }

    @Override // defpackage.wt4
    public final void a(wt4 wt4Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((zt4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        z2i z2iVar = this.a;
        if (z2iVar != null) {
            z2iVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        zt4 zt4Var = null;
        int i = 0;
        while (it2.hasNext()) {
            zt4 zt4Var2 = (zt4) it2.next();
            if (!(zt4Var2 instanceof uw4)) {
                i++;
                zt4Var = zt4Var2;
            }
        }
        if (zt4Var != null && i == 1 && zt4Var.j) {
            uw4 uw4Var = this.i;
            if (uw4Var != null) {
                if (!uw4Var.j) {
                    return;
                } else {
                    this.f = this.h * uw4Var.g;
                }
            }
            d(zt4Var.g + this.f);
        }
        z2i z2iVar2 = this.a;
        if (z2iVar2 != null) {
            z2iVar2.a(this);
        }
    }

    public final void b(z2i z2iVar) {
        this.k.add(z2iVar);
        if (this.j) {
            z2iVar.a(z2iVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            wt4 wt4Var = (wt4) it.next();
            wt4Var.a(wt4Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
