package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class wjb {
    public final long a;
    public final String b;
    public final sz c;
    public final yjb d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final ss4 h;

    public wjb(vjb vjbVar) {
        this.a = vjbVar.a;
        this.b = vjbVar.b;
        this.c = vjbVar.c;
        this.d = vjbVar.d;
        this.e = vjbVar.e;
        this.f = vjbVar.f;
        this.g = vjbVar.g;
        this.h = vjbVar.h;
    }

    public final us a() {
        us usVar = new us(0);
        usVar.put("cid", Long.valueOf(this.a));
        String str = this.b;
        if (!l8g.c(str)) {
            usVar.put("text", str);
        }
        usVar.put("detectShare", Boolean.valueOf(this.e));
        sz szVar = this.c;
        if (szVar != null && szVar.size() > 0) {
            usVar.put("attaches", szVar);
        }
        yjb yjbVar = this.d;
        if (yjbVar != null) {
            usVar.put("link", yjbVar);
        }
        usVar.put("isLive", Boolean.valueOf(this.f));
        List list = this.g;
        if (list != null) {
            usVar.put("elements", list);
        }
        ss4 ss4Var = this.h;
        if (ss4Var != null) {
            usVar.put("delayedAttributes", ss4Var.a());
        }
        return usVar;
    }

    public final String toString() {
        int iA = zdi.a(this.g);
        StringBuilder sbN = ho7.n("OutgoingMessage{cid=", this.a, ", text=", "***");
        sbN.append(", attaches=");
        sbN.append(this.c);
        sbN.append(", link=");
        sbN.append(this.d);
        hf3.f(", detectShare=", ", live='", sbN, this.e, this.f);
        sbN.append("', elements=");
        sbN.append(iA);
        sbN.append("}");
        return sbN.toString();
    }
}
