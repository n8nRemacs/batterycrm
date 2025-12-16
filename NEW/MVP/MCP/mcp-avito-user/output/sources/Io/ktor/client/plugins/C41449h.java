package io.ktor.client.plugins;

import io.ktor.client.plugins.C41448g;
import io.ktor.http.B0;
import io.ktor.http.C41554x0;
import io.ktor.http.C41558z0;
import io.ktor.http.I0;
import io.ktor.http.L0;
import io.ktor.http.O0;
import io.ktor.http.S0;
import io.ktor.http.T0;
import io.ktor.http.a1;
import io.ktor.util.C41586b;
import io.ktor.util.InterfaceC41588c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultRequest.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.client.plugins.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41449h extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399438q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C41448g f399439r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41449h(C41448g c41448g, Continuation<? super C41449h> continuation) {
        super(3, continuation);
        this.f399439r = c41448g;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        C41449h c41449h = new C41449h(this.f399439r, continuation);
        c41449h.f399438q = eVar;
        return c41449h.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        io.ktor.util.pipeline.e eVar = this.f399438q;
        String string = ((io.ktor.client.request.d0) eVar.f400528b).f399707a.toString();
        C41448g.a aVar = new C41448g.a();
        io.ktor.client.request.d0 d0Var = (io.ktor.client.request.d0) eVar.f400528b;
        io.ktor.http.U u12 = d0Var.f399709c;
        io.ktor.http.U u13 = aVar.f399430a;
        io.ktor.util.G0.a(u13, u12);
        this.f399439r.f399429a.invoke(aVar);
        T0 t0B = aVar.f399431b.b();
        C41448g.b bVar = C41448g.f399427b;
        I0 i02 = d0Var.f399707a;
        bVar.getClass();
        O0 o02 = i02.f399862a;
        O0.f399884c.getClass();
        boolean zF2 = kotlin.jvm.internal.L.f(o02, O0.f399885d);
        O0 o03 = t0B.f399902a;
        if (zF2) {
            i02.f399862a = o03;
        }
        if (i02.f399863b.length() <= 0) {
            I0 i03 = new I0(null, null, 0, null, null, null, null, null, false, 511, null);
            i03.f399862a = o03;
            i03.f399863b = t0B.f399903b;
            int i12 = t0B.f399904c;
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 == 0) {
                numValueOf = null;
            }
            i03.f399864c = numValueOf != null ? numValueOf.intValue() : o03.f399890b;
            L0.d(i03, (String) t0B.f399911j.getValue());
            i03.f399866e = (String) t0B.f399914m.getValue();
            i03.f399867f = (String) t0B.f399915n.getValue();
            C41554x0 c41554x0A = C41558z0.a();
            c41554x0A.e(B0.b((String) t0B.f399912k.getValue()));
            i03.f399870i = c41554x0A;
            i03.f399871j = new a1(c41554x0A);
            i03.f399868g = (String) t0B.f399916o.getValue();
            i03.f399865d = t0B.f399909h;
            i03.f399862a = i02.f399862a;
            int i13 = i02.f399864c;
            if (i13 != 0) {
                i03.f399864c = i13;
            }
            List<String> listP = i03.f399869h;
            List<String> list = i02.f399869h;
            if (!list.isEmpty()) {
                if (listP.isEmpty() || ((CharSequence) C42745f0.E(list)).length() == 0) {
                    listP = list;
                } else {
                    kotlin.collections.builders.b bVar2 = new kotlin.collections.builders.b((list.size() + listP.size()) - 1);
                    int size = listP.size() - 1;
                    for (int i14 = 0; i14 < size; i14++) {
                        bVar2.add(listP.get(i14));
                    }
                    bVar2.addAll(list);
                    listP = C42745f0.p(bVar2);
                }
            }
            i03.f399869h = listP;
            if (i02.f399868g.length() > 0) {
                i03.f399868g = i02.f399868g;
            }
            C41554x0 c41554x0A2 = C41558z0.a();
            io.ktor.util.G0.a(c41554x0A2, i03.f399870i);
            C41554x0 c41554x0 = i02.f399870i;
            i03.f399870i = c41554x0;
            i03.f399871j = new a1(c41554x0);
            Iterator<T> it = c41554x0A2.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                if (!i03.f399870i.f400385b.containsKey(str)) {
                    i03.f399870i.c(list2, str);
                }
            }
            S0.c(i02, i03);
        }
        InterfaceC41588c interfaceC41588c = aVar.f399432c;
        for (C41586b<?> c41586b : interfaceC41588c.b()) {
            if (!d0Var.f399712f.c(c41586b)) {
                d0Var.f399712f.a(c41586b, interfaceC41588c.g(c41586b));
            }
        }
        d0Var.f399709c.f();
        d0Var.f399709c.e(u13.l());
        org.slf4j.a aVar2 = C41451j.f399448a;
        StringBuilder sbA = androidx.appcompat.app.r.A("Applied DefaultRequest to ", string, ". New url: ");
        sbA.append(d0Var.f399707a);
        aVar2.e(sbA.toString());
        return G0.f406611a;
    }
}
