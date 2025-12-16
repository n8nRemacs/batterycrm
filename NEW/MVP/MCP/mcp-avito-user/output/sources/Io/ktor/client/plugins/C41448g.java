package io.ktor.client.plugins;

import io.ktor.http.I0;
import io.ktor.http.InterfaceC41525i0;
import io.ktor.util.C41586b;
import io.ktor.util.C41592e;
import io.ktor.util.InterfaceC41588c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/g;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41448g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f399427b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C41586b<C41448g> f399428c = new C41586b<>("DefaultRequest");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<a, G0> f399429a;

    /* compiled from: DefaultRequest.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/g$a;", "Lio/ktor/http/i0;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.g$a */
    public static final class a implements InterfaceC41525i0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.ktor.http.U f399430a = new io.ktor.http.U(0, 1, null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final I0 f399431b = new I0(null, null, 0, null, null, null, null, null, false, 511, null);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC41588c f399432c = C41592e.a();

        @Override // io.ktor.http.InterfaceC41525i0
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final io.ktor.http.U getF399430a() {
            return this.f399430a;
        }
    }

    /* compiled from: DefaultRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/g$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/g$a;", "Lio/ktor/client/plugins/g;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.g$b */
    public static final class b implements A<a, C41448g> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(C41448g c41448g, io.ktor.client.a aVar) {
            io.ktor.client.request.j0.f399750g.getClass();
            aVar.f398779f.g(io.ktor.client.request.j0.f399751h, new C41449h(c41448g, null));
        }

        @Override // io.ktor.client.plugins.A
        public final C41448g b(Y41.l<? super a, G0> lVar) {
            return new C41448g(lVar, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<C41448g> getKey() {
            return C41448g.f399428c;
        }

        public b() {
        }
    }

    public C41448g() {
        throw null;
    }

    public C41448g(Y41.l lVar, C42822w c42822w) {
        this.f399429a = lVar;
    }
}
