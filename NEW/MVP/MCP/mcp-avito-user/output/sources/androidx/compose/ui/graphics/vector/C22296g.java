package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22286u;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.O0;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/g;", "Landroidx/compose/ui/graphics/vector/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22296g extends AbstractC22301l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.J f39900b;

    /* renamed from: c, reason: collision with root package name */
    public float f39901c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public List<? extends AbstractC22297h> f39902d;

    /* renamed from: e, reason: collision with root package name */
    public float f39903e;

    /* renamed from: f, reason: collision with root package name */
    public float f39904f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.J f39905g;

    /* renamed from: h, reason: collision with root package name */
    public int f39906h;

    /* renamed from: i, reason: collision with root package name */
    public int f39907i;

    /* renamed from: j, reason: collision with root package name */
    public float f39908j;

    /* renamed from: k, reason: collision with root package name */
    public float f39909k;

    /* renamed from: l, reason: collision with root package name */
    public float f39910l;

    /* renamed from: m, reason: collision with root package name */
    public float f39911m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39912n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39913o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39914p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.drawscope.o f39915q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C22277p f39916r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public C22277p f39917s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Object f39918t;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/O0;", "invoke", "()Landroidx/compose/ui/graphics/O0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<O0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f39919l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final O0 invoke() {
            return new C22286u(new PathMeasure());
        }
    }

    public C22296g() {
        super(null);
        this.f39901c = 1.0f;
        this.f39902d = U.f39811a;
        this.f39903e = 1.0f;
        this.f39906h = 0;
        this.f39907i = 0;
        this.f39908j = 4.0f;
        this.f39910l = 1.0f;
        this.f39912n = true;
        this.f39913o = true;
        C22277p c22277pA = C22315w.a();
        this.f39916r = c22277pA;
        this.f39917s = c22277pA;
        this.f39918t = C42727D.b(LazyThreadSafetyMode.f406616d, a.f39919l);
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC22301l
    public final void a(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        if (this.f39912n) {
            C22300k.b(this.f39902d, this.f39916r);
            e();
        } else if (this.f39914p) {
            e();
        }
        this.f39912n = false;
        this.f39914p = false;
        androidx.compose.ui.graphics.J j12 = this.f39900b;
        if (j12 != null) {
            androidx.compose.ui.graphics.drawscope.g.Y0(gVar, this.f39917s, j12, this.f39901c, null, 56);
        }
        androidx.compose.ui.graphics.J j13 = this.f39905g;
        if (j13 != null) {
            androidx.compose.ui.graphics.drawscope.o oVar = this.f39915q;
            if (this.f39913o || oVar == null) {
                oVar = new androidx.compose.ui.graphics.drawscope.o(this.f39904f, this.f39908j, this.f39906h, this.f39907i, null, 16, null);
                this.f39915q = oVar;
                this.f39913o = false;
            }
            androidx.compose.ui.graphics.drawscope.g.Y0(gVar, this.f39917s, j13, this.f39903e, oVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.C] */
    public final void e() {
        float f12 = this.f39909k;
        C22277p c22277p = this.f39916r;
        if (f12 == 0.0f && this.f39910l == 1.0f) {
            this.f39917s = c22277p;
            return;
        }
        if (kotlin.jvm.internal.L.f(this.f39917s, c22277p)) {
            this.f39917s = C22315w.a();
        } else {
            int iH2 = this.f39917s.h();
            this.f39917s.rewind();
            this.f39917s.l(iH2);
        }
        ?? r02 = this.f39918t;
        ((O0) r02.getValue()).b(c22277p);
        float length = ((O0) r02.getValue()).getLength();
        float f13 = this.f39909k;
        float f14 = this.f39911m;
        float f15 = ((f13 + f14) % 1.0f) * length;
        float f16 = ((this.f39910l + f14) % 1.0f) * length;
        if (f15 <= f16) {
            ((O0) r02.getValue()).a(f15, f16, this.f39917s);
        } else {
            ((O0) r02.getValue()).a(f15, length, this.f39917s);
            ((O0) r02.getValue()).a(0.0f, f16, this.f39917s);
        }
    }

    @Y61.k
    public final String toString() {
        return this.f39916r.toString();
    }
}
