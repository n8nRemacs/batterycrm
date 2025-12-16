package shark;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import okio.C44802l;
import shark.AbstractC48345t2;
import shark.M1;
import shark.internal.C48296t;
import shark.internal.X;

/* compiled from: HprofHeapGraph.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/c2;", "Lshark/s1;", "a", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.c2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48240c2 implements InterfaceC48340s1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A1 f438253b = new A1();

    /* renamed from: c, reason: collision with root package name */
    public final shark.internal.s0<Long, AbstractC48345t2.b.c> f438254c = new shark.internal.s0<>(f438251j);

    /* renamed from: d, reason: collision with root package name */
    public final M1.b f438255d = c("java.lang.Object");

    /* renamed from: e, reason: collision with root package name */
    public final int f438256e;

    /* renamed from: f, reason: collision with root package name */
    public final int f438257f;

    /* renamed from: g, reason: collision with root package name */
    public final C48236b2 f438258g;

    /* renamed from: h, reason: collision with root package name */
    public final c3 f438259h;

    /* renamed from: i, reason: collision with root package name */
    public final shark.internal.P f438260i;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f438252k = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f438251j = 3000;

    /* compiled from: HprofHeapGraph.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/c2$a;", "", "<init>", "()V", "shark-graph"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.c2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: HprofHeapGraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/t2$b$c;", "T", "Lshark/u2;", "invoke", "(Lshark/u2;)Lshark/t2$b$c;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.c2$b */
    public static final class b<T> extends kotlin.jvm.internal.N implements Y41.l<C48349u2, T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f438261l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            super(1);
            this.f438261l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final Object invoke(C48349u2 c48349u2) {
            return (AbstractC48345t2.b.c) this.f438261l.invoke(c48349u2);
        }
    }

    public C48240c2(@Y61.k C48236b2 c48236b2, @Y61.k c3 c3Var, @Y61.k shark.internal.P p12) {
        this.f438258g = c48236b2;
        this.f438259h = c3Var;
        this.f438260i = p12;
        int i12 = c48236b2.f438248d;
        PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
        this.f438256e = (i12 * 2) + 8;
        this.f438257f = i12 + 9;
    }

    @Override // shark.L1
    public final int a() {
        return this.f438258g.f438248d;
    }

    @Override // shark.L1
    @Y61.l
    public final M1 b(long j12) {
        shark.internal.hppc.b bVar;
        M1.b bVar2 = this.f438255d;
        if (bVar2 != null && j12 == bVar2.f438147e) {
            return bVar2;
        }
        shark.internal.P p12 = this.f438260i;
        shark.internal.H0 h02 = p12.f438419d;
        int iA2 = h02.a(j12);
        int i12 = p12.f438416a;
        if (iA2 >= 0) {
            C48296t c48296tC = h02.c(iA2);
            bVar = new shark.internal.hppc.b(iA2, new X.a(c48296tC.d(i12), c48296tC.b(), c48296tC.c(), c48296tC.d(p12.f438425j), (int) c48296tC.d(p12.f438431p)));
        } else {
            shark.internal.H0 h03 = p12.f438420e;
            int iA3 = h03.a(j12);
            int i13 = h02.f438358c;
            if (iA3 >= 0) {
                C48296t c48296tC2 = h03.c(iA3);
                bVar = new shark.internal.hppc.b(i13 + iA3, new X.b(c48296tC2.d(i12), c48296tC2.b(), c48296tC2.d(p12.f438426k)));
            } else {
                shark.internal.H0 h04 = p12.f438421f;
                int iA4 = h04.a(j12);
                int i14 = h03.f438358c;
                if (iA4 >= 0) {
                    C48296t c48296tC3 = h04.c(iA4);
                    bVar = new shark.internal.hppc.b(i13 + i14 + iA4, new X.c(c48296tC3.d(i12), c48296tC3.b(), c48296tC3.d(p12.f438427l)));
                } else {
                    shark.internal.H0 h05 = p12.f438422g;
                    int iA5 = h05.a(j12);
                    if (iA5 >= 0) {
                        C48296t c48296tC4 = h05.c(iA5);
                        bVar = new shark.internal.hppc.b(i13 + i14 + iA5 + h05.f438358c, new X.d(c48296tC4.d(i12), PrimitiveType.values()[c48296tC4.a()], c48296tC4.d(p12.f438428m)));
                    } else {
                        bVar = null;
                    }
                }
            }
        }
        if (bVar != null) {
            return n(bVar.f438527b, j12);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    @Override // shark.L1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final shark.M1.b c(@Y61.k java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.C48240c2.c(java.lang.String):shark.M1$b");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f438259h.close();
    }

    @Override // shark.L1
    @Y61.k
    public final kotlin.sequences.o0 d() {
        l0.f fVar = new l0.f();
        fVar.f406840b = h();
        return new kotlin.sequences.o0(this.f438260i.c(), new C48252f2(this, fVar));
    }

    @Override // shark.L1
    @Y61.k
    public final M1 f(long j12) {
        M1 m1B = b(j12);
        if (m1B != null) {
            return m1B;
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "Object id ", " not found in heap dump."));
    }

    @Y61.k
    public final String g(long j12) {
        String str;
        shark.internal.P p12 = this.f438260i;
        String strA = p12.a(p12.f438418c.c(j12));
        a3 a3Var = p12.f438424i;
        if (a3Var != null && (str = a3Var.f438236a.get(strA)) != null) {
            strA = str;
        }
        if (p12.f438429n) {
            strA = strA.replace('/', '.');
        }
        if (this.f438258g.f438247c == HprofVersion.ANDROID || !C43066x.j0(strA, '[')) {
            return strA;
        }
        int iM2 = C43066x.M('[', 0, 6, strA);
        int i12 = iM2 + 1;
        String strZ = C43066x.Z(i12, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        char cCharAt = strA.charAt(i12);
        if (cCharAt == 'F') {
            return androidx.camera.camera2.internal.G.f("float", strZ);
        }
        if (cCharAt == 'L') {
            return strA.substring(iM2 + 2, strA.length() - 1) + strZ;
        }
        if (cCharAt == 'S') {
            return androidx.camera.camera2.internal.G.f("short", strZ);
        }
        if (cCharAt == 'Z') {
            return androidx.camera.camera2.internal.G.f(BooleanParameter.TYPE, strZ);
        }
        if (cCharAt == 'I') {
            return androidx.camera.camera2.internal.G.f(IntParameter.TYPE, strZ);
        }
        if (cCharAt == 'J') {
            return androidx.camera.camera2.internal.G.f(Constants.LONG, strZ);
        }
        switch (cCharAt) {
            case 'B':
                return androidx.camera.camera2.internal.G.f("byte", strZ);
            case 'C':
                return androidx.camera.camera2.internal.G.f(CharParameter.TYPE, strZ);
            case 'D':
                return androidx.camera.camera2.internal.G.f("double", strZ);
            default:
                throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.l("Unexpected type char ", cCharAt).toString());
        }
    }

    @Override // shark.L1
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final A1 getF438253b() {
        return this.f438253b;
    }

    public final int h() {
        return this.f438260i.f438419d.f438358c;
    }

    public final int i() {
        return this.f438260i.f438420e.f438358c;
    }

    @Y61.k
    public final kotlin.sequences.o0 j() {
        l0.f fVar = new l0.f();
        fVar.f406840b = 0;
        return new kotlin.sequences.o0(this.f438260i.d(), new C48260h2(this, fVar));
    }

    public final boolean k(long j12) {
        shark.internal.P p12 = this.f438260i;
        shark.internal.H0 h02 = p12.f438419d;
        int iA2 = h02.a(j12);
        if ((iA2 < 0 ? null : h02.c(iA2)) != null) {
            return true;
        }
        shark.internal.H0 h03 = p12.f438420e;
        int iA3 = h03.a(j12);
        if ((iA3 < 0 ? null : h03.c(iA3)) != null) {
            return true;
        }
        shark.internal.H0 h04 = p12.f438421f;
        int iA4 = h04.a(j12);
        if ((iA4 < 0 ? null : h04.c(iA4)) != null) {
            return true;
        }
        shark.internal.H0 h05 = p12.f438422g;
        int iA5 = h05.a(j12);
        return (iA5 >= 0 ? h05.c(iA5) : null) != null;
    }

    public final <T extends AbstractC48345t2.b.c> T m(long j12, shark.internal.X x12, Y41.l<? super C48349u2, ? extends T> lVar) {
        Long lValueOf = Long.valueOf(j12);
        shark.internal.s0<Long, AbstractC48345t2.b.c> s0Var = this.f438254c;
        Object obj = s0Var.f438596a.get(lValueOf);
        if (obj != null) {
            s0Var.f438597b++;
        } else {
            s0Var.f438598c++;
            obj = null;
        }
        T t12 = (T) obj;
        if (t12 != null) {
            return t12;
        }
        long f438480b = x12.getF438480b();
        long f438481c = x12.getF438481c();
        b bVar = new b(lVar);
        c3 c3Var = this.f438259h;
        if (f438481c <= 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(f438481c, "recordSize ", " must be > 0").toString());
        }
        long j13 = f438480b;
        while (f438481c > 0) {
            long jI4 = c3Var.f438265d.i4(j13, c3Var.f438263b, f438481c);
            if (jI4 <= 0) {
                throw new IllegalStateException(AK.c.j(j13 - f438480b, ", got 0 bytes instead.", androidx.compose.foundation.H.q(f438481c, "Requested ", " bytes after reading ")).toString());
            }
            j13 += jI4;
            f438481c -= jI4;
        }
        Object objInvoke = bVar.invoke(c3Var.f438264c);
        C44802l c44802l = c3Var.f438263b;
        if (c44802l.f420125c != 0) {
            throw new IllegalStateException(AK.c.j(c44802l.f420125c, " bytes left", new StringBuilder("Buffer not fully consumed: ")).toString());
        }
        T t13 = (T) objInvoke;
        s0Var.f438596a.put(Long.valueOf(j12), t13);
        return t13;
    }

    public final M1 n(shark.internal.X x12, long j12) {
        if (x12 instanceof X.a) {
            return new M1.b(this, (X.a) x12, j12);
        }
        if (x12 instanceof X.b) {
            return new M1.c(this, (X.b) x12, j12);
        }
        if (x12 instanceof X.c) {
            return new M1.d(this, (X.c) x12, j12);
        }
        if (x12 instanceof X.d) {
            return new M1.e(this, (X.d) x12, j12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
