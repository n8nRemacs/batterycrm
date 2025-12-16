package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class vlf implements fie {
    public final /* synthetic */ wlf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xwg d;
    public final /* synthetic */ ob0 e;
    public final /* synthetic */ ob0 f;

    public /* synthetic */ vlf(wlf wlfVar, String str, String str2, xwg xwgVar, ob0 ob0Var, ob0 ob0Var2) {
        this.a = wlfVar;
        this.b = str;
        this.c = str2;
        this.d = xwgVar;
        this.e = ob0Var;
        this.f = ob0Var2;
    }

    @Override // defpackage.fie
    public final void a(hie hieVar) {
        wlf wlfVar = this.a;
        if (wlfVar.c() == null) {
            return;
        }
        wlfVar.F();
        wlfVar.E(wlfVar.G(this.b, this.c, this.d, this.e, this.f));
        wlfVar.q();
        lih lihVar = wlfVar.q;
        lihVar.getClass();
        jei.b();
        Iterator it = lihVar.a.iterator();
        while (it.hasNext()) {
            lihVar.b((uwg) it.next());
        }
    }
}
