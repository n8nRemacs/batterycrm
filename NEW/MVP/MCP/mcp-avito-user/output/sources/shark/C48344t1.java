package shark;

import java.io.IOException;
import kotlin.Metadata;
import okio.C44802l;
import okio.InterfaceC44804n;

/* compiled from: ConstantMemoryMetricsDualSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/t1;", "Lshark/u1;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.t1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48344t1 implements InterfaceC48348u1 {

    /* renamed from: a, reason: collision with root package name */
    public long f438698a;

    /* renamed from: b, reason: collision with root package name */
    public long f438699b;

    /* renamed from: c, reason: collision with root package name */
    public long f438700c;

    /* renamed from: d, reason: collision with root package name */
    public long f438701d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f438702e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f438703f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final p3 f438704g;

    /* compiled from: ConstantMemoryMetricsDualSourceProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/t1$a", "Lshark/d3;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.t1$a */
    public static final class a implements d3 {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d3 f438706c;

        public a(d3 d3Var) {
            this.f438706c = d3Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f438706c.close();
        }

        @Override // shark.d3
        public final long i4(long j12, @Y61.k C44802l c44802l, long j13) {
            long jI4 = this.f438706c.i4(j12, c44802l, j13);
            C48344t1 c48344t1 = C48344t1.this;
            c48344t1.f438698a += jI4;
            c48344t1.f438699b++;
            long j14 = c48344t1.f438701d;
            if (j14 != -1) {
                c48344t1.f438700c = Math.abs(j12 - j14) + c48344t1.f438700c;
                c48344t1.f438702e = kotlin.ranges.s.d(c48344t1.f438702e, j12);
                c48344t1.f438703f = kotlin.ranges.s.b(c48344t1.f438703f, j12);
            } else {
                c48344t1.f438702e = j12;
                c48344t1.f438703f = j12;
            }
            c48344t1.f438701d = j12;
            return jI4;
        }
    }

    public C48344t1(@Y61.k p3 p3Var) {
        this.f438704g = p3Var;
    }

    @Override // shark.f3
    @Y61.k
    public final d3 a() {
        return new a(this.f438704g.a());
    }

    @Override // shark.o3
    @Y61.k
    public final InterfaceC44804n b() {
        return this.f438704g.b();
    }
}
