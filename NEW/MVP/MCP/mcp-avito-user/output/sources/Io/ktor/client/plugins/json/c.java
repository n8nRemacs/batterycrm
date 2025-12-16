package io.ktor.client.plugins.json;

import Y41.l;
import Y61.k;
import io.ktor.client.plugins.A;
import io.ktor.client.request.j0;
import io.ktor.client.statement.i;
import io.ktor.http.C41524i;
import io.ktor.http.InterfaceC41526j;
import io.ktor.util.C41586b;
import io.ktor.util.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JsonPlugin.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/json/c;", "", "a", "b", "ktor-client-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C41586b<c> f399459e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f399460a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C41524i> f399461b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<InterfaceC41526j> f399462c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<kotlin.reflect.d<?>> f399463d;

    /* compiled from: JsonPlugin.kt */
    @k0
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/json/c$a;", "", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashSet f399464a = C42745f0.O0(b1.h(f.f399477a, g.f399478a));

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f399465b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f399466c;

        public a() {
            C41524i.a.f400035a.getClass();
            this.f399465b = C42745f0.e0(C41524i.a.f400036b);
            this.f399466c = C42745f0.e0(new io.ktor.client.plugins.json.b());
        }
    }

    /* compiled from: JsonPlugin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/json/c$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/json/c$a;", "Lio/ktor/client/plugins/json/c;", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, c> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(c cVar, io.ktor.client.a aVar) {
            c cVar2 = cVar;
            j0.f399750g.getClass();
            aVar.f398779f.g(j0.f399753j, new d(cVar2, null));
            i.f399792g.getClass();
            aVar.f398780g.g(i.f399795j, new e(cVar2, null));
        }

        @Override // io.ktor.client.plugins.A
        public final c b(l<? super a, G0> lVar) {
            Object obj;
            a aVar = new a();
            lVar.invoke(aVar);
            List listM0 = C42745f0.M0(ServiceLoader.load(h.class));
            if (listM0.isEmpty()) {
                throw new IllegalStateException("Fail to find serializer. Consider to add one of the following dependencies: \n - ktor-client-gson\n - ktor-client-json\n - ktor-client-serialization");
            }
            Iterator it = listM0.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    do {
                        Object next2 = it.next();
                        if ("javaClass".compareTo("javaClass") < 0) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            return new c((h) obj, C42745f0.M0(aVar.f399465b), aVar.f399466c, aVar.f399464a);
        }

        @Override // io.ktor.client.plugins.A
        @k
        public final C41586b<c> getKey() {
            return c.f399459e;
        }

        public b() {
        }
    }

    static {
        new b(null);
        f399459e = new C41586b<>("Json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k h hVar, @k List<C41524i> list, @k List<? extends InterfaceC41526j> list2, @k Set<? extends kotlin.reflect.d<?>> set) {
        this.f399460a = hVar;
        this.f399461b = list;
        this.f399462c = list2;
        this.f399463d = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@Y61.k io.ktor.http.C41524i r3) {
        /*
            r2 = this;
            java.util.List<io.ktor.http.i> r0 = r2.f399461b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L12
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L29
        L12:
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            io.ktor.http.i r1 = (io.ktor.http.C41524i) r1
            boolean r1 = r3.b(r1)
            if (r1 == 0) goto L16
            goto L51
        L29:
            java.util.List<io.ktor.http.j> r0 = r2.f399462c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3b
            goto L53
        L3b:
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            io.ktor.http.j r1 = (io.ktor.http.InterfaceC41526j) r1
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L3f
        L51:
            r3 = 1
            goto L54
        L53:
            r3 = 0
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.json.c.a(io.ktor.http.i):boolean");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(h hVar, List list, List list2, Set set, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            C41524i.a.f400035a.getClass();
            list = Collections.singletonList(C41524i.a.f400036b);
        }
        this(hVar, list, (i12 & 4) != 0 ? Collections.singletonList(new io.ktor.client.plugins.json.b()) : list2, (i12 & 8) != 0 ? b1.h(g.f399478a, f.f399477a) : set);
    }
}
