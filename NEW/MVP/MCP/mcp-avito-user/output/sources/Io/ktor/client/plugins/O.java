package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpRequestLifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/O;", "", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f399050a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C41586b<O> f399051b = new C41586b<>("RequestLifecycle");

    /* compiled from: HttpRequestLifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/O$a;", "Lio/ktor/client/plugins/A;", "Lkotlin/G0;", "Lio/ktor/client/plugins/O;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements A<G0, O> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(O o12, io.ktor.client.a aVar) {
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399751h, new N(aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final O b(Y41.l<? super G0, G0> lVar) {
            return new O(null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<O> getKey() {
            return O.f399051b;
        }

        public a() {
        }
    }

    public /* synthetic */ O(C42822w c42822w) {
        this();
    }

    public O() {
    }
}
