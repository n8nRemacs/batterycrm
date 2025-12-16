package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vcd {
    public final ve2 a;
    public final qv3 b;
    public final j0e c;

    public vcd(ve2 ve2Var, qv3 qv3Var, j0e j0eVar) {
        this.a = ve2Var;
        this.b = qv3Var;
        this.c = j0eVar;
    }

    public final List a() {
        List listO = this.a.O(ve2.I);
        wqi.c("vcd", "getRecentContacts:", new Object[0]);
        int i = 0;
        int i2 = 18;
        return (List) new ora(new ora(new ora(vqa.i(listO).g(new ucd(this, i)).s().n(), new t9f(i2, new ov5(21)), 5), pdf.b, 4).h(new iqa(20), Integer.MAX_VALUE), new iqa(i2), i).q(10).s().n().h(new z9a(this, 12, listO), Integer.MAX_VALUE).s().e();
    }

    public final List b() {
        int i = 5;
        vk3 vk3Var = new vk3(i, new lta[]{new ora(vqa.i(this.a.O(ve2.I)).g(new iqa(22, this)), new iqa(19), i), new ora(vqa.i(this.b.j(qv3.o, qv3.q)).g(new iqa(27, this)).g(new ucd(this, 3)), new iqa(21), i)});
        lcj lcjVar = pdf.b;
        return (List) new ora(new ora(new ora(vk3Var.h(lcjVar, 2).s().n(), new t9f(18, ln6.a), i), lcjVar, 4).q(10), new iqa(25), i).s().e();
    }
}
