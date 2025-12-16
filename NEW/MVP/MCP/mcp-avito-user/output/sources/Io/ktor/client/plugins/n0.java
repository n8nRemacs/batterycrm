package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAgent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/n0;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C41586b<n0> f399596b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399597a;

    /* compiled from: UserAgent.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/n0$a;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public String f399598a;

        public a() {
            this(null, 1, null);
        }

        public a(String str, int i12, C42822w c42822w) {
            this.f399598a = (i12 & 1) != 0 ? "Ktor http-client" : str;
        }
    }

    /* compiled from: UserAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/n0$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/n0$a;", "Lio/ktor/client/plugins/n0;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, n0> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(n0 n0Var, io.ktor.client.a aVar) {
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399752i, new o0(n0Var, null));
        }

        @Override // io.ktor.client.plugins.A
        public final n0 b(Y41.l<? super a, G0> lVar) {
            a aVar = new a(null, 1, null);
            lVar.invoke(aVar);
            return new n0(aVar.f399598a, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<n0> getKey() {
            return n0.f399596b;
        }

        public b() {
        }
    }

    static {
        new b(null);
        f399596b = new C41586b<>("UserAgent");
    }

    public n0(String str, C42822w c42822w) {
        this.f399597a = str;
    }
}
