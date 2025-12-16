package aX0;

import I41.h;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import uW0.C48986a;

/* compiled from: ForwardingRequestListener.java */
@Nullsafe
/* renamed from: aX0.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C19833d implements InterfaceC19835f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20908a;

    public C19833d(Set<InterfaceC19835f> set) {
        this.f20908a = new ArrayList(set.size());
        for (InterfaceC19835f interfaceC19835f : set) {
            if (interfaceC19835f != null) {
                this.f20908a.add(interfaceC19835f);
            }
        }
    }

    public static void l(String str, Exception exc) {
        C48986a.c("ForwardingRequestListener", str, exc);
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void a(String str, String str2) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).a(str, str2);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerStart", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void b(String str, String str2, @h Map<String, String> map) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).b(str, str2, map);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithSuccess", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void c(String str, String str2, boolean z12) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).c(str, str2, z12);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithSuccess", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19835f
    public final void d(String str) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).d(str);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestCancellation", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19835f
    public final void e(ImageRequest imageRequest, String str, boolean z12) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).e(imageRequest, str, z12);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestSuccess", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void f(String str, String str2, Throwable th2, @h Map<String, String> map) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).f(str, str2, th2, map);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithFailure", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void g(String str, String str2) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).g(str, str2);
            } catch (Exception e12) {
                l("InternalListener exception in onProducerFinishWithCancellation", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void h(String str) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).h(str);
            } catch (Exception e12) {
                l("InternalListener exception in onIntermediateChunkStart", e12);
            }
        }
    }

    @Override // aX0.InterfaceC19835f
    public final void i(ImageRequest imageRequest, Object obj, String str, boolean z12) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).i(imageRequest, obj, str, z12);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestStart", e12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final boolean j(String str) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((InterfaceC19835f) arrayList.get(i12)).j(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // aX0.InterfaceC19835f
    public final void k(ImageRequest imageRequest, String str, Throwable th2, boolean z12) {
        ArrayList arrayList = this.f20908a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                ((InterfaceC19835f) arrayList.get(i12)).k(imageRequest, str, th2, z12);
            } catch (Exception e12) {
                l("InternalListener exception in onRequestFailure", e12);
            }
        }
    }

    public C19833d(InterfaceC19835f... interfaceC19835fArr) {
        this.f20908a = new ArrayList(interfaceC19835fArr.length);
        for (InterfaceC19835f interfaceC19835f : interfaceC19835fArr) {
            if (interfaceC19835f != null) {
                this.f20908a.add(interfaceC19835f);
            }
        }
    }
}
