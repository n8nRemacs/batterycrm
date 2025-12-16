package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.A0;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.k1;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "Landroidx/compose/ui/graphics/vector/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22292c extends AbstractC22301l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public float[] f39832b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f39833c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39834d;

    /* renamed from: e, reason: collision with root package name */
    public long f39835e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public List<? extends AbstractC22297h> f39836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39837g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C22277p f39838h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f39839i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.l<AbstractC22301l, G0> f39840j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public String f39841k;

    /* renamed from: l, reason: collision with root package name */
    public float f39842l;

    /* renamed from: m, reason: collision with root package name */
    public float f39843m;

    /* renamed from: n, reason: collision with root package name */
    public float f39844n;

    /* renamed from: o, reason: collision with root package name */
    public float f39845o;

    /* renamed from: p, reason: collision with root package name */
    public float f39846p;

    /* renamed from: q, reason: collision with root package name */
    public float f39847q;

    /* renamed from: r, reason: collision with root package name */
    public float f39848r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39849s;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/l;", "node", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/vector/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<AbstractC22301l, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(AbstractC22301l abstractC22301l) {
            AbstractC22301l abstractC22301l2 = abstractC22301l;
            C22292c c22292c = C22292c.this;
            c22292c.g(abstractC22301l2);
            ?? r02 = c22292c.f39839i;
            if (r02 != 0) {
                r02.invoke(abstractC22301l2);
            }
            return G0.f406611a;
        }
    }

    public C22292c() {
        super(null);
        this.f39833c = new ArrayList();
        this.f39834d = true;
        androidx.compose.ui.graphics.T.f39320b.getClass();
        this.f39835e = androidx.compose.ui.graphics.T.f39330l;
        this.f39836f = U.f39811a;
        this.f39837g = true;
        this.f39840j = new a();
        this.f39841k = "";
        this.f39845o = 1.0f;
        this.f39846p = 1.0f;
        this.f39849s = true;
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC22301l
    public final void a(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        if (this.f39849s) {
            float[] fArrB = this.f39832b;
            if (fArrB == null) {
                fArrB = A0.b();
                this.f39832b = fArrB;
            } else {
                A0.e(fArrB);
            }
            A0.i(fArrB, this.f39847q + this.f39843m, this.f39848r + this.f39844n);
            A0.f(fArrB, this.f39842l);
            A0.g(fArrB, this.f39845o, this.f39846p);
            A0.i(fArrB, -this.f39843m, -this.f39844n);
            this.f39849s = false;
        }
        if (this.f39837g) {
            if (!this.f39836f.isEmpty()) {
                C22277p c22277pA = this.f39838h;
                if (c22277pA == null) {
                    c22277pA = C22315w.a();
                    this.f39838h = c22277pA;
                }
                C22300k.b(this.f39836f, c22277pA);
            }
            this.f39837g = false;
        }
        a.b f39478c = gVar.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            androidx.compose.ui.graphics.drawscope.b bVar = f39478c.f39485a;
            float[] fArr = this.f39832b;
            if (fArr != null) {
                bVar.f39488a.a().l(A0.a(fArr).f39216a);
            }
            C22277p c22277p = this.f39838h;
            if (!this.f39836f.isEmpty() && c22277p != null) {
                androidx.compose.ui.graphics.S.f39317b.getClass();
                bVar.a(c22277p, androidx.compose.ui.graphics.S.f39318c);
            }
            ArrayList arrayList = this.f39833c;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((AbstractC22301l) arrayList.get(i12)).a(gVar);
            }
            androidx.compose.foundation.H.C(f39478c, jE2);
        } catch (Throwable th2) {
            androidx.compose.foundation.H.C(f39478c, jE2);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<androidx.compose.ui.graphics.vector.l, kotlin.G0>, kotlin.jvm.internal.N] */
    @Override // androidx.compose.ui.graphics.vector.AbstractC22301l
    @Y61.l
    public final Y41.l<AbstractC22301l, G0> b() {
        return this.f39839i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.vector.AbstractC22301l
    public final void d(@Y61.l Y41.l<? super AbstractC22301l, G0> lVar) {
        this.f39839i = (kotlin.jvm.internal.N) lVar;
    }

    public final void e(int i12, @Y61.k AbstractC22301l abstractC22301l) {
        ArrayList arrayList = this.f39833c;
        if (i12 < arrayList.size()) {
            arrayList.set(i12, abstractC22301l);
        } else {
            arrayList.add(abstractC22301l);
        }
        g(abstractC22301l);
        abstractC22301l.d(this.f39840j);
        c();
    }

    public final void f(long j12) {
        if (this.f39834d && j12 != 16) {
            long j13 = this.f39835e;
            if (j13 == 16) {
                this.f39835e = j12;
                return;
            }
            C42784z0 c42784z0 = U.f39811a;
            if (androidx.compose.ui.graphics.T.i(j13) == androidx.compose.ui.graphics.T.i(j12) && androidx.compose.ui.graphics.T.h(j13) == androidx.compose.ui.graphics.T.h(j12) && androidx.compose.ui.graphics.T.f(j13) == androidx.compose.ui.graphics.T.f(j12)) {
                return;
            }
            this.f39834d = false;
            androidx.compose.ui.graphics.T.f39320b.getClass();
            this.f39835e = androidx.compose.ui.graphics.T.f39330l;
        }
    }

    public final void g(AbstractC22301l abstractC22301l) {
        if (!(abstractC22301l instanceof C22296g)) {
            if (abstractC22301l instanceof C22292c) {
                C22292c c22292c = (C22292c) abstractC22301l;
                if (c22292c.f39834d && this.f39834d) {
                    f(c22292c.f39835e);
                    return;
                }
                this.f39834d = false;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                this.f39835e = androidx.compose.ui.graphics.T.f39330l;
                return;
            }
            return;
        }
        C22296g c22296g = (C22296g) abstractC22301l;
        androidx.compose.ui.graphics.J j12 = c22296g.f39900b;
        if (this.f39834d && j12 != null) {
            if (j12 instanceof k1) {
                f(((k1) j12).f39547b);
            } else {
                this.f39834d = false;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                this.f39835e = androidx.compose.ui.graphics.T.f39330l;
            }
        }
        androidx.compose.ui.graphics.J j13 = c22296g.f39905g;
        if (this.f39834d && j13 != null) {
            if (j13 instanceof k1) {
                f(((k1) j13).f39547b);
                return;
            }
            this.f39834d = false;
            androidx.compose.ui.graphics.T.f39320b.getClass();
            this.f39835e = androidx.compose.ui.graphics.T.f39330l;
        }
    }

    public final void h(int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            ArrayList arrayList = this.f39833c;
            if (i12 < arrayList.size()) {
                ((AbstractC22301l) arrayList.get(i12)).d(null);
                arrayList.remove(i12);
            }
        }
        c();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f39841k);
        ArrayList arrayList = this.f39833c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC22301l abstractC22301l = (AbstractC22301l) arrayList.get(i12);
            sb2.append("\t");
            sb2.append(abstractC22301l.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
