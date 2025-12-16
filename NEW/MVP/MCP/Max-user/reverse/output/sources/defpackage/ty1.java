package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ty1 implements Runnable {
    public final /* synthetic */ ob0 X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ ez1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ hie d;
    public final /* synthetic */ xwg o;

    public /* synthetic */ ty1(ez1 ez1Var, String str, hie hieVar, xwg xwgVar, ob0 ob0Var, List list, int i) {
        this.a = i;
        this.b = ez1Var;
        this.c = str;
        this.d = hieVar;
        this.o = xwgVar;
        this.X = ob0Var;
        this.Y = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez1 ez1Var = this.b;
                String str = this.c;
                hie hieVar = this.d;
                xwg xwgVar = this.o;
                ob0 ob0Var = this.X;
                List list = this.Y;
                ez1Var.t("Use case " + str + " RESET", null);
                ez1Var.a.B(str, hieVar, xwgVar, ob0Var, list);
                ez1Var.p();
                ez1Var.D();
                ez1Var.K();
                if (ez1Var.R0 == 9) {
                    ez1Var.B();
                    break;
                }
                break;
            case 1:
                ez1 ez1Var2 = this.b;
                String str2 = this.c;
                hie hieVar2 = this.d;
                xwg xwgVar2 = this.o;
                ob0 ob0Var2 = this.X;
                List list2 = this.Y;
                ez1Var2.getClass();
                ez1Var2.t("Use case " + str2 + " UPDATED", null);
                ez1Var2.a.B(str2, hieVar2, xwgVar2, ob0Var2, list2);
                ez1Var2.K();
                break;
            default:
                ez1 ez1Var3 = this.b;
                String str3 = this.c;
                hie hieVar3 = this.d;
                xwg xwgVar3 = this.o;
                ob0 ob0Var3 = this.X;
                List list3 = this.Y;
                ez1Var3.t("Use case " + str3 + " ACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) ez1Var3.a.c;
                vwg vwgVar = (vwg) linkedHashMap.get(str3);
                if (vwgVar == null) {
                    vwgVar = new vwg(hieVar3, xwgVar3, ob0Var3, list3);
                    linkedHashMap.put(str3, vwgVar);
                }
                vwgVar.f = true;
                ez1Var3.a.B(str3, hieVar3, xwgVar3, ob0Var3, list3);
                ez1Var3.K();
                break;
        }
    }
}
