package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HttpRedirect.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/J;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f399022c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C41586b<J> f399023d = new C41586b<>("HttpRedirect");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.events.a<io.ktor.client.statement.d> f399024e = new io.ktor.events.a<>();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f399025a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f399026b;

    /* compiled from: HttpRedirect.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/J$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: HttpRedirect.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/J$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/J$a;", "Lio/ktor/client/plugins/J;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, J> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:38:0x00d0, B:48:0x00f6], limit reached: 78 */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01f9  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, io.ktor.client.request.d0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d7 -> B:75:0x01e0). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object c(io.ktor.client.plugins.J.b r17, io.ktor.client.plugins.m0 r18, io.ktor.client.request.d0 r19, io.ktor.client.call.b r20, boolean r21, io.ktor.client.a r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.J.b.c(io.ktor.client.plugins.J$b, io.ktor.client.plugins.m0, io.ktor.client.request.d0, io.ktor.client.call.b, boolean, io.ktor.client.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        @Override // io.ktor.client.plugins.A
        public final void a(J j12, io.ktor.client.a aVar) {
            e0 e0Var = (e0) C.a(aVar, e0.f399413c);
            e0Var.f399416b.add(new L(j12, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final J b(Y41.l<? super a, G0> lVar) {
            lVar.invoke(new a());
            return new J(true, false, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<J> getKey() {
            return J.f399023d;
        }

        public b() {
        }
    }

    public J(boolean z12, boolean z13, C42822w c42822w) {
        this.f399025a = z12;
        this.f399026b = z13;
    }
}
