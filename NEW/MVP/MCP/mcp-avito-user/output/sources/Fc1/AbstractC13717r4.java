package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;

/* renamed from: Fc1.r4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13717r4 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f5782k;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I6 f5783a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13714r1 f5784b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f5785c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f5786d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f5787e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<l0.g> f5788f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C13609f3 f5789g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C13609f3 f5790h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C13609f3 f5791i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC13642j0 f5792j;

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.r4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                InterfaceC13642j0 interfaceC13642j0 = (InterfaceC13642j0) a13.o(I2.f5012a);
                AbstractC13717r4 abstractC13717r4 = AbstractC13717r4.this;
                abstractC13717r4.getClass();
                abstractC13717r4.f5792j = interfaceC13642j0;
                abstractC13717r4.a(a13, 8);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.r4$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            AbstractC13717r4.this.c(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.r4$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                C13714r1 c13714r1 = AbstractC13717r4.this.f5784b;
                c13714r1.f5779d.clear();
                c13714r1.f5781f.clear();
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        kotlin.jvm.internal.Y y12 = new kotlin.jvm.internal.Y(AbstractC13717r4.class, "offset", "getOffset-F1C5BW0()J", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f5782k = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(AbstractC13717r4.class, "isError", "isError()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AbstractC13717r4.class, "isEnabled", "isEnabled()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AbstractC13717r4.class, "isVisible", "isVisible()Z", 0, n0Var)};
    }

    public AbstractC13717r4(@Y61.k I6 i62) {
        this.f5783a = i62;
        this.f5784b = new C13714r1(i62.getId(), i62.d());
        InterfaceC22204y1<Boolean> interfaceC22204y1G = C22126m3.g(Boolean.FALSE);
        this.f5785c = interfaceC22204y1G;
        Boolean bool = Boolean.TRUE;
        this.f5786d = C22126m3.g(bool);
        InterfaceC22204y1<Boolean> interfaceC22204y1G2 = C22126m3.g(bool);
        this.f5787e = interfaceC22204y1G2;
        l0.g.f413384b.getClass();
        InterfaceC22204y1<l0.g> interfaceC22204y1G3 = C22126m3.g(l0.g.a(0L));
        this.f5788f = interfaceC22204y1G3;
        this.f5789g = new C13609f3(interfaceC22204y1G3, null);
        this.f5790h = new C13609f3(interfaceC22204y1G, null);
        this.f5791i = new C13609f3(interfaceC22204y1G2, new c());
    }

    @InterfaceC22132o
    public abstract void a(@Y61.l androidx.compose.runtime.A a12, int i12);

    public final void b(boolean z12) {
        this.f5790h.setValue(this, f5782k[1], Boolean.valueOf(z12));
    }

    @InterfaceC22132o
    public final void c(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(286273314);
        androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{S3.f5172a.b(this.f5783a), C13788z3.f5920a.b(this.f5785c), C13771x4.f5888a.b(this.f5787e), Z2.f5350a.b(this.f5786d), C13619g4.f5529a.b(this.f5788f)}, androidx.compose.runtime.internal.r.b(bE2, 1476014690, new a()), bE2, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(i12);
    }
}
