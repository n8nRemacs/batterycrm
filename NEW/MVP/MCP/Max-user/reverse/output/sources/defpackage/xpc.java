package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xpc implements zfe {
    public final k18 a;
    public final k18 b;

    public xpc(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    @Override // defpackage.zfe
    public final void a(String str, String str2) {
        wqi.c("xpc", "onProxyEnableChange: oldValue=" + str + ", newValue=" + str2, new Object[0]);
        ((zzf) this.a.getValue()).f(str2);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        ((j94) this.b.getValue()).b("proxy", str2);
    }

    @Override // defpackage.zfe
    public final void b(List list, List list2) {
        wqi.c("xpc", "onProxyDomainsChanged: oldValue=" + list + ", newValue=" + list2, new Object[0]);
        zzf zzfVar = (zzf) this.a.getValue();
        synchronized (zzfVar) {
            zzfVar.f = list2;
        }
        if (list2.isEmpty()) {
            return;
        }
        ((j94) this.b.getValue()).b("proxyDomains", ue3.N(list2, null, null, null, null, 63));
    }
}
