package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class z2g implements tm6, m7c {
    public final /* synthetic */ a3g a;
    public final /* synthetic */ List b;

    public /* synthetic */ z2g(a3g a3gVar, List list) {
        this.a = a3gVar;
        this.b = list;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        a3g a3gVar = this.a;
        a3gVar.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return nk3.a;
        }
        lqc lqcVar = a3gVar.c;
        z2g z2gVar = new z2g(a3gVar, this.b);
        lqcVar.getClass();
        return new nsa(new tsa(lqcVar, z2gVar, 2));
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        this.a.getClass();
        List list = this.b;
        return !((Boolean) new k2f(new wk3(5, new u64(r4, 9, list)), new oh2(26, list), 1).h(new vef(23)).e()).booleanValue();
    }
}
