package androidx.compose.ui.input.pointer;

import androidx.collection.H0;
import androidx.collection.N0;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22328f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.layout.A f40215a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40216b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40217c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40218d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40219e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final N0<v.d> f40220f = new N0<>(0, 1, null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C22339q f40221g = new C22339q();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final H0<N0<C22338p>> f40222h = new H0<>(10);

    /* compiled from: HitPathTracker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.input.pointer.f$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v.d f40224m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v.d dVar) {
            super(0);
            this.f40224m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            C22328f.this.d(this.f40224m);
            return G0.f406611a;
        }
    }

    public C22328f(@Y61.k androidx.compose.ui.layout.A a12) {
        this.f40215a = a12;
    }

    public final void a(long j12, @Y61.k List<? extends v.d> list, boolean z12) {
        long[] jArr;
        long[] jArr2;
        int i12;
        C22338p c22338p;
        C22339q c22339q = this.f40221g;
        H0<N0<C22338p>> h02 = this.f40222h;
        h02.c();
        int size = list.size();
        C22339q c22339q2 = c22339q;
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            v.d dVar = list.get(i13);
            if (dVar.f42893o) {
                dVar.f42892n = new a(dVar);
                if (z13) {
                    androidx.compose.runtime.collection.e<C22338p> eVar = c22339q2.f40275a;
                    C22338p[] c22338pArr = eVar.f38260b;
                    int i14 = eVar.f38262d;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            c22338p = null;
                            break;
                        }
                        c22338p = c22338pArr[i15];
                        if (kotlin.jvm.internal.L.f(c22338p.f40267c, dVar)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    C22338p c22338p2 = c22338p;
                    if (c22338p2 != null) {
                        c22338p2.f40273i = true;
                        c22338p2.f40268d.a(j12);
                        N0<C22338p> n0B = h02.b(j12);
                        if (n0B == null) {
                            n0B = new N0<>(0, 1, null);
                            h02.h(j12, n0B);
                        }
                        n0B.f(c22338p2);
                        c22339q2 = c22338p2;
                    } else {
                        z13 = false;
                    }
                }
                C22338p c22338p3 = new C22338p(dVar);
                c22338p3.f40268d.a(j12);
                N0<C22338p> n0B2 = h02.b(j12);
                if (n0B2 == null) {
                    n0B2 = new N0<>(0, 1, null);
                    h02.h(j12, n0B2);
                }
                n0B2.f(c22338p3);
                c22339q2.f40275a.b(c22338p3);
                c22339q2 = c22338p3;
            }
        }
        int i16 = 0;
        if (!z12) {
            return;
        }
        long[] jArr3 = h02.f25653b;
        Object[] objArr = h02.f25654c;
        long[] jArr4 = h02.f25652a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j13 = jArr4[i17];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8;
                int i19 = 8 - ((~(i17 - length)) >>> 31);
                int i22 = i16;
                while (i22 < i19) {
                    if ((255 & j13) < 128) {
                        int i23 = (i17 << 3) + i22;
                        long j14 = jArr3[i23];
                        N0<C22338p> n02 = (N0) objArr[i23];
                        androidx.compose.runtime.collection.e<C22338p> eVar2 = c22339q.f40275a;
                        C22338p[] c22338pArr2 = eVar2.f38260b;
                        int i24 = eVar2.f38262d;
                        int i25 = 0;
                        while (i25 < i24) {
                            c22338pArr2[i25].f(j14, n02);
                            i25++;
                            jArr3 = jArr3;
                        }
                        jArr2 = jArr3;
                        i12 = 8;
                    } else {
                        jArr2 = jArr3;
                        i12 = i18;
                    }
                    j13 >>= i12;
                    i22++;
                    i18 = i12;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i19 != i18) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i17 == length) {
                return;
            }
            i17++;
            jArr3 = jArr;
            i16 = 0;
        }
    }

    public final boolean b(@Y61.k C22333k c22333k, boolean z12) {
        C22339q c22339q = this.f40221g;
        if (!c22339q.a(c22333k.f40257a, this.f40215a, c22333k, z12)) {
            return false;
        }
        boolean z13 = true;
        this.f40216b = true;
        androidx.compose.runtime.collection.e<C22338p> eVar = c22339q.f40275a;
        C22338p[] c22338pArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        boolean z14 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z14 = c22338pArr[i13].e(c22333k, z12) || z14;
        }
        C22338p[] c22338pArr2 = eVar.f38260b;
        int i14 = eVar.f38262d;
        boolean z15 = false;
        for (int i15 = 0; i15 < i14; i15++) {
            z15 = c22338pArr2[i15].d(c22333k) || z15;
        }
        c22339q.b(c22333k);
        if (!z15 && !z14) {
            z13 = false;
        }
        this.f40216b = false;
        if (this.f40219e) {
            this.f40219e = false;
            N0<v.d> n02 = this.f40220f;
            int i16 = n02.f25660b;
            for (int i17 = 0; i17 < i16; i17++) {
                d(n02.b(i17));
            }
            n02.i();
        }
        if (this.f40217c) {
            this.f40217c = false;
            c();
        }
        if (this.f40218d) {
            this.f40218d = false;
            c22339q.f40275a.g();
        }
        return z13;
    }

    public final void c() {
        if (this.f40216b) {
            this.f40217c = true;
            return;
        }
        C22339q c22339q = this.f40221g;
        androidx.compose.runtime.collection.e<C22338p> eVar = c22339q.f40275a;
        C22338p[] c22338pArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            c22338pArr[i13].c();
        }
        if (this.f40218d) {
            this.f40218d = true;
        } else {
            c22339q.f40275a.g();
        }
    }

    public final void d(v.d dVar) {
        if (this.f40216b) {
            this.f40219e = true;
            this.f40220f.f(dVar);
            return;
        }
        C22339q c22339q = this.f40221g;
        N0<C22339q> n02 = c22339q.f40276b;
        n02.i();
        n02.f(c22339q);
        while (true) {
            int i12 = n02.f25660b;
            if (i12 == 0) {
                return;
            }
            C22339q c22339qK = n02.k(i12 - 1);
            int i13 = 0;
            while (true) {
                androidx.compose.runtime.collection.e<C22338p> eVar = c22339qK.f40275a;
                if (i13 < eVar.f38262d) {
                    C22338p c22338p = eVar.f38260b[i13];
                    if (kotlin.jvm.internal.L.f(c22338p.f40267c, dVar)) {
                        c22339qK.f40275a.j(c22338p);
                        c22338p.c();
                    } else {
                        n02.f(c22338p);
                        i13++;
                    }
                }
            }
        }
    }
}
