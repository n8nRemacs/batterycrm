package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BodyProgress.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/a;", "", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41437a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C11399a f399078a = new C11399a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C41586b<C41437a> f399079b = new C41586b<>("BodyProgress");

    /* compiled from: BodyProgress.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/a$a;", "Lio/ktor/client/plugins/A;", "Lkotlin/G0;", "Lio/ktor/client/plugins/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.a$a, reason: collision with other inner class name */
    public static final class C11399a implements A<G0, C41437a> {
        public /* synthetic */ C11399a(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(C41437a c41437a, io.ktor.client.a aVar) throws io.ktor.util.pipeline.b {
            C11399a c11399a = C41437a.f399078a;
            io.ktor.util.pipeline.k kVar = new io.ktor.util.pipeline.k("ObservableContent");
            io.ktor.client.request.j0.f399750g.getClass();
            io.ktor.util.pipeline.k kVar2 = io.ktor.client.request.j0.f399754k;
            io.ktor.client.request.j0 j0Var = aVar.f398779f;
            j0Var.f(kVar2, kVar);
            j0Var.g(kVar, new C41442b(3, null));
            io.ktor.client.statement.c.f399780g.getClass();
            aVar.f398782i.g(io.ktor.client.statement.c.f399783j, new C41443c(3, null));
        }

        @Override // io.ktor.client.plugins.A
        public final C41437a b(Y41.l<? super G0, G0> lVar) {
            return new C41437a();
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<C41437a> getKey() {
            return C41437a.f399079b;
        }

        public C11399a() {
        }
    }
}
