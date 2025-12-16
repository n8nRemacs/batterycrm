package aX0;

import I41.h;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import uW0.C48986a;

/* compiled from: ForwardingRequestListener2.java */
@Nullsafe
/* renamed from: aX0.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C19832c implements InterfaceC19834e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20907a;

    public C19832c(Set<InterfaceC19834e> set) {
        this.f20907a = new ArrayList(set.size());
        for (InterfaceC19834e interfaceC19834e : set) {
            if (interfaceC19834e != null) {
                this.f20907a.add(interfaceC19834e);
            }
        }
    }

    public static void l(String str, Exception exc) {
        C48986a.c("ForwardingRequestListener2", str, exc);
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void a(k0 k0Var) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).a(k0Var);
            } catch (Exception e12) {
                l("InternalListener exception in onIntermediateChunkStart", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void b(k0 k0Var, String str, boolean z12) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).b(k0Var, str, z12);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithSuccess", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void c(k0 k0Var, String str) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).c(k0Var, str);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerStart", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final boolean d(k0 k0Var, String str) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((InterfaceC19834e) arrayList.get(i12)).d(k0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // aX0.InterfaceC19834e
    public final void e(k0 k0Var) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).e(k0Var);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestCancellation", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void f(k0 k0Var, String str) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).f(k0Var, str);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithCancellation", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void g(k0 k0Var, Throwable th2) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).g(k0Var, th2);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestFailure", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void h(k0 k0Var, String str, Throwable th2, @h Map<String, String> map) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).h(k0Var, str, th2, map);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithFailure", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void i(k0 k0Var) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).i(k0Var);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestSuccess", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void j(k0 k0Var, String str, @h Map<String, String> map) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).j(k0Var, str, map);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithSuccess", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void k(t0 t0Var) {
        ArrayList arrayList = this.f20907a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19834e) arrayList.get(i12)).k(t0Var);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestStart", e12);
            }
        }
    }
}
