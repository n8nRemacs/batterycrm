package io.ktor.client.plugins.contentnegotiation;

import Y41.l;
import Y61.k;
import io.ktor.client.plugins.A;
import io.ktor.client.request.j0;
import io.ktor.http.C41524i;
import io.ktor.http.InterfaceC41526j;
import io.ktor.util.C41586b;
import io.ktor.util.k0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ContentNegotiation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/a;", "", "a", "b", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f399304c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C41586b<a> f399305d = new C41586b<>("ContentNegotiation");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f399306a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashSet f399307b;

    /* compiled from: ContentNegotiation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/a$a;", "Lio/ktor/serialization/a;", "<init>", "()V", "a", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.contentnegotiation.a$a, reason: collision with other inner class name */
    public static final class C11402a implements io.ktor.serialization.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashSet f399308a = C42745f0.O0(b1.h(i.f399337a, h.f399336b));

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f399309b = new ArrayList();

        /* compiled from: ContentNegotiation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/a$a$a;", "", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.client.plugins.contentnegotiation.a$a$a, reason: collision with other inner class name */
        public static final class C11403a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final io.ktor.serialization.kotlinx.i f399310a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C41524i f399311b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final InterfaceC41526j f399312c;

            public C11403a(@k io.ktor.serialization.kotlinx.i iVar, @k C41524i c41524i, @k InterfaceC41526j interfaceC41526j) {
                this.f399310a = iVar;
                this.f399311b = c41524i;
                this.f399312c = interfaceC41526j;
            }
        }
    }

    /* compiled from: ContentNegotiation.kt */
    @k0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/a$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/contentnegotiation/a$a;", "Lio/ktor/client/plugins/contentnegotiation/a;", "<init>", "()V", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<C11402a, a> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(a aVar, io.ktor.client.a aVar2) {
            a aVar3 = aVar;
            j0.f399750g.getClass();
            aVar2.f398779f.g(j0.f399753j, new c(aVar3, null));
            io.ktor.client.statement.i.f399792g.getClass();
            aVar2.f398780g.g(io.ktor.client.statement.i.f399795j, new d(aVar3, null));
        }

        @Override // io.ktor.client.plugins.A
        public final a b(l<? super C11402a, G0> lVar) {
            C11402a c11402a = new C11402a();
            lVar.invoke(c11402a);
            return new a(c11402a.f399309b, c11402a.f399308a);
        }

        @Override // io.ktor.client.plugins.A
        @k
        public final C41586b<a> getKey() {
            return a.f399305d;
        }

        public b() {
        }
    }

    public a(@k ArrayList arrayList, @k LinkedHashSet linkedHashSet) {
        this.f399306a = arrayList;
        this.f399307b = linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01cf -> B:70:0x01d9). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.client.request.d0 r19, @Y61.k java.lang.Object r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws io.ktor.client.plugins.contentnegotiation.ContentConverterException {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.a.a(io.ktor.client.request.d0, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.T0 r9, @Y61.k U31.b r10, @Y61.k java.lang.Object r11, @Y61.k io.ktor.http.C41524i r12, @Y61.k java.nio.charset.Charset r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws io.ktor.serialization.ContentConvertException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.a.b(io.ktor.http.T0, U31.b, java.lang.Object, io.ktor.http.i, java.nio.charset.Charset, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
