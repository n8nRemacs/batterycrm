package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class sh6 implements end {
    public final ArrayList a;

    public sh6(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.rac
    public final void a(oac oacVar, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).a(oacVar, str, map);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.end
    public final void b(kke kkeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).b(kkeVar);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // defpackage.rac
    public final void c(oac oacVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).c(oacVar);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // defpackage.rac
    public final void d(oac oacVar, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).d(oacVar, str, th, map);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // defpackage.rac
    public final void e(oac oacVar, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).e(oacVar, str, z);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.end
    public final void f(oac oacVar, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).f(oacVar, th);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // defpackage.end
    public final void g(oac oacVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).g(oacVar);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // defpackage.end
    public final void h(oac oacVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).h(oacVar);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // defpackage.rac
    public final boolean i(oac oacVar, String str) {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((end) it.next()).i(oacVar, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rac
    public final void j(oac oacVar, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).j(oacVar, str);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // defpackage.rac
    public final void k(oac oacVar, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((end) it.next()).k(oacVar, str);
            } catch (Exception e) {
                op5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }
}
