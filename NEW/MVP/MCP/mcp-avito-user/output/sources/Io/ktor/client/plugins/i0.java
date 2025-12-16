package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpTimeout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/i0;", "", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f399440d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41586b<i0> f399441e = new C41586b<>("TimeoutPlugin");

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Long f399442a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f399443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f399444c;

    /* compiled from: HttpTimeout.kt */
    @io.ktor.util.k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/i0$a;", "", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public Long f399445a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Long f399446b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Long f399447c;

        /* compiled from: HttpTimeout.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/i0$a$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.client.plugins.i0$a$a, reason: collision with other inner class name */
        public static final class C11404a {
            public /* synthetic */ C11404a(C42822w c42822w) {
                this();
            }

            public C11404a() {
            }
        }

        static {
            new C11404a(null);
            new C41586b("TimeoutConfiguration");
        }

        public a(Long l12, Long l13, Long l14, int i12, C42822w c42822w) {
            l12 = (i12 & 1) != 0 ? null : l12;
            l13 = (i12 & 2) != 0 ? null : l13;
            l14 = (i12 & 4) != 0 ? null : l14;
            this.f399445a = 0L;
            this.f399446b = 0L;
            this.f399447c = 0L;
            a(l12);
            this.f399445a = l12;
            a(l13);
            this.f399446b = l13;
            a(l14);
            this.f399447c = l14;
        }

        public static void a(Long l12) {
            if (l12 != null && l12.longValue() <= 0) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f399445a, aVar.f399445a) && kotlin.jvm.internal.L.f(this.f399446b, aVar.f399446b) && kotlin.jvm.internal.L.f(this.f399447c, aVar.f399447c);
        }

        public final int hashCode() {
            Long l12 = this.f399445a;
            int iHashCode = (l12 != null ? l12.hashCode() : 0) * 31;
            Long l13 = this.f399446b;
            int iHashCode2 = (iHashCode + (l13 != null ? l13.hashCode() : 0)) * 31;
            Long l14 = this.f399447c;
            return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
        }
    }

    /* compiled from: HttpTimeout.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/plugins/i0$b;", "Lio/ktor/client/plugins/A;", "Lio/ktor/client/plugins/i0$a;", "Lio/ktor/client/plugins/i0;", "Lio/ktor/client/engine/h;", "<init>", "()V", "", "INFINITE_TIMEOUT_MS", "J", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements A<a, i0>, io.ktor.client.engine.h<a> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // io.ktor.client.plugins.A
        public final void a(i0 i0Var, io.ktor.client.a aVar) {
            e0 e0Var = (e0) C.a(aVar, e0.f399413c);
            e0Var.f399416b.add(new j0(i0Var, aVar, null));
        }

        @Override // io.ktor.client.plugins.A
        public final i0 b(Y41.l<? super a, G0> lVar) {
            a aVar = new a(null, null, null, 7, null);
            lVar.invoke(aVar);
            return new i0(aVar.f399445a, aVar.f399446b, aVar.f399447c, null);
        }

        @Override // io.ktor.client.plugins.A
        @Y61.k
        public final C41586b<i0> getKey() {
            return i0.f399441e;
        }

        public b() {
        }
    }

    public i0(Long l12, Long l13, Long l14, C42822w c42822w) {
        this.f399442a = l12;
        this.f399443b = l13;
        this.f399444c = l14;
    }
}
