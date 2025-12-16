package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: AndroidGraphicsLayer.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/c;", "", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.layer.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22267c {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final n f39575y;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f39576a;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Outline f39581f;

    /* renamed from: h, reason: collision with root package name */
    public long f39583h;

    /* renamed from: i, reason: collision with root package name */
    public long f39584i;

    /* renamed from: j, reason: collision with root package name */
    public float f39585j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public D0 f39586k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public C22277p f39587l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public C22277p f39588m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39589n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.drawscope.a f39590o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C22273n f39591p;

    /* renamed from: q, reason: collision with root package name */
    public int f39592q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C22265a f39593r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39594s;

    /* renamed from: t, reason: collision with root package name */
    public long f39595t;

    /* renamed from: u, reason: collision with root package name */
    public long f39596u;

    /* renamed from: v, reason: collision with root package name */
    public long f39597v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39598w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public RectF f39599x;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f39577b = androidx.compose.ui.graphics.drawscope.f.f39489a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f39578c = LayoutDirection.f42838b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public N f39579d = C22269e.f39601l;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> f39580e = new C22268d(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f39582g = true;

    /* compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/layer/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/n;", "SnapshotImpl", "Landroidx/compose/ui/graphics/layer/n;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.layer.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        n nVar;
        new a(null);
        m.f39686a.getClass();
        if (m.f39687b) {
            nVar = o.f39688a;
        } else if (Build.VERSION.SDK_INT >= 28) {
            nVar = s.f39693a;
        } else {
            B.f39552a.getClass();
            nVar = r.f39692a;
        }
        f39575y = nVar;
    }

    public C22267c(@Y61.k g gVar) {
        this.f39576a = gVar;
        l0.g.f413384b.getClass();
        this.f39583h = 0L;
        l0.n.f413402b.getClass();
        this.f39584i = l0.n.f413403c;
        this.f39593r = new C22265a();
        gVar.p(false);
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f39595t = 0L;
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f39596u = 0L;
        this.f39597v = l0.g.f413386d;
    }

    public final void a() {
        Outline outline;
        if (this.f39582g) {
            boolean z12 = this.f39598w;
            g gVar = this.f39576a;
            Outline outline2 = null;
            if (z12 || gVar.getF39680u() > 0.0f) {
                C22277p c22277p = this.f39587l;
                if (c22277p != null) {
                    RectF rectF = this.f39599x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f39599x = rectF;
                    }
                    Path path = c22277p.f39716a;
                    path.computeBounds(rectF, false);
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 > 28 || path.isConvex()) {
                        outline = this.f39581f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f39581f = outline;
                        }
                        if (i12 >= 30) {
                            w.f39695a.getClass();
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f39589n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f39581f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f39589n = true;
                        outline = null;
                    }
                    this.f39587l = c22277p;
                    if (outline != null) {
                        outline.setAlpha(gVar.getF39674o());
                        outline2 = outline;
                    }
                    u.a aVar = androidx.compose.ui.unit.u.f42871b;
                    gVar.m(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f39589n && this.f39598w) {
                        gVar.p(false);
                        gVar.f();
                    } else {
                        gVar.p(this.f39598w);
                    }
                } else {
                    gVar.p(this.f39598w);
                    l0.n.f413402b.getClass();
                    Outline outline4 = this.f39581f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f39581f = outline4;
                    }
                    long jC2 = androidx.compose.ui.unit.v.c(this.f39596u);
                    long j12 = this.f39583h;
                    long j13 = this.f39584i;
                    long j14 = j13 == 9205357640488583168L ? jC2 : j13;
                    int i13 = (int) (j12 >> 32);
                    int i14 = (int) (j12 & 4294967295L);
                    outline4.setRoundRect(Math.round(Float.intBitsToFloat(i13)), Math.round(Float.intBitsToFloat(i14)), Math.round(Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13)), Math.round(Float.intBitsToFloat((int) (4294967295L & j14)) + Float.intBitsToFloat(i14)), this.f39585j);
                    outline4.setAlpha(gVar.getF39674o());
                    gVar.m(outline4, androidx.compose.ui.unit.v.b(j14));
                }
            } else {
                gVar.p(false);
                androidx.compose.ui.unit.u.f42871b.getClass();
                gVar.m(null, 0L);
            }
        }
        this.f39582g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f39594s
            if (r0 == 0) goto L71
            int r0 = r15.f39592q
            if (r0 != 0) goto L71
            androidx.compose.ui.graphics.layer.a r0 = r15.f39593r
            androidx.compose.ui.graphics.layer.c r1 = r0.f39566a
            if (r1 == 0) goto L1a
            int r2 = r1.f39592q
            int r2 = r2 + (-1)
            r1.f39592q = r2
            r1.b()
            r1 = 0
            r0.f39566a = r1
        L1a:
            androidx.collection.S0<androidx.compose.ui.graphics.layer.c> r0 = r0.f39568c
            if (r0 == 0) goto L6c
            java.lang.Object[] r1 = r0.f25730b
            long[] r2 = r0.f25729a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = 0
            r5 = r4
        L29:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L64
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L43:
            if (r10 >= r8) goto L62
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.c r11 = (androidx.compose.ui.graphics.layer.C22267c) r11
            int r12 = r11.f39592q
            int r12 = r12 + (-1)
            r11.f39592q = r12
            r11.b()
        L5e:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L43
        L62:
            if (r8 != r9) goto L69
        L64:
            if (r5 == r3) goto L69
            int r5 = r5 + 1
            goto L29
        L69:
            r0.g()
        L6c:
            androidx.compose.ui.graphics.layer.g r0 = r15.f39576a
            r0.f()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.C22267c.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.compose.ui.graphics.drawscope.g r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.a r0 = r14.f39593r
            androidx.compose.ui.graphics.layer.c r1 = r0.f39566a
            r0.f39567b = r1
            androidx.collection.S0<androidx.compose.ui.graphics.layer.c> r1 = r0.f39568c
            if (r1 == 0) goto L20
            boolean r2 = r1.d()
            if (r2 == 0) goto L20
            androidx.collection.S0<androidx.compose.ui.graphics.layer.c> r2 = r0.f39569d
            if (r2 != 0) goto L1a
            androidx.collection.S0 r2 = androidx.collection.k1.a()
            r0.f39569d = r2
        L1a:
            r2.l(r1)
            r1.g()
        L20:
            r1 = 1
            r0.f39570e = r1
            kotlin.jvm.internal.N r1 = r14.f39579d
            r1.invoke(r15)
            r15 = 0
            r0.f39570e = r15
            androidx.compose.ui.graphics.layer.c r1 = r0.f39567b
            if (r1 == 0) goto L38
            int r2 = r1.f39592q
            int r2 = r2 + (-1)
            r1.f39592q = r2
            r1.b()
        L38:
            androidx.collection.S0<androidx.compose.ui.graphics.layer.c> r0 = r0.f39569d
            if (r0 == 0) goto L8f
            boolean r1 = r0.d()
            if (r1 == 0) goto L8f
            java.lang.Object[] r1 = r0.f25730b
            long[] r2 = r0.f25729a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8c
            r4 = r15
        L4c:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L87
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L66:
            if (r9 >= r7) goto L85
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L81
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.c r10 = (androidx.compose.ui.graphics.layer.C22267c) r10
            int r11 = r10.f39592q
            int r11 = r11 + (-1)
            r10.f39592q = r11
            r10.b()
        L81:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L66
        L85:
            if (r7 != r8) goto L8c
        L87:
            if (r4 == r3) goto L8c
            int r4 = r4 + 1
            goto L4c
        L8c:
            r0.g()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.C22267c.c(androidx.compose.ui.graphics.drawscope.g):void");
    }

    @Y61.k
    public final D0 d() {
        D0 bVar;
        D0 d02 = this.f39586k;
        C22277p c22277p = this.f39587l;
        if (d02 != null) {
            return d02;
        }
        if (c22277p != null) {
            D0.a aVar = new D0.a(c22277p);
            this.f39586k = aVar;
            return aVar;
        }
        long jC2 = androidx.compose.ui.unit.v.c(this.f39596u);
        long j12 = this.f39583h;
        long j13 = this.f39584i;
        if (j13 != 9205357640488583168L) {
            jC2 = j13;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC2 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC2 & 4294967295L)) + fIntBitsToFloat2;
        if (this.f39585j > 0.0f) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0));
            C43522a.C11768a c11768a = C43522a.f413378b;
            bVar = new D0.c(l0.m.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, jFloatToRawIntBits));
        } else {
            bVar = new D0.b(new l0.j(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f39586k = bVar;
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, long j12, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        boolean zC2 = androidx.compose.ui.unit.u.c(this.f39596u, j12);
        g gVar = this.f39576a;
        if (!zC2) {
            this.f39596u = j12;
            long j13 = this.f39595t;
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            gVar.F((int) (j13 >> 32), (int) (j13 & 4294967295L), j12);
            if (this.f39584i == 9205357640488583168L) {
                this.f39582g = true;
                a();
            }
        }
        this.f39577b = dVar;
        this.f39578c = layoutDirection;
        this.f39579d = (N) lVar;
        gVar.J(dVar, layoutDirection, this, this.f39580e);
    }

    public final void f() {
        this.f39586k = null;
        this.f39587l = null;
        l0.n.f413402b.getClass();
        this.f39584i = l0.n.f413403c;
        l0.g.f413384b.getClass();
        this.f39583h = 0L;
        this.f39585j = 0.0f;
        this.f39582g = true;
        this.f39589n = false;
    }

    public final void g(float f12) {
        g gVar = this.f39576a;
        if (gVar.getF39674o() == f12) {
            return;
        }
        gVar.setAlpha(f12);
    }

    public final void h(long j12, long j13, float f12) {
        if (l0.g.d(this.f39583h, j12) && l0.n.b(this.f39584i, j13) && this.f39585j == f12 && this.f39587l == null) {
            return;
        }
        f();
        this.f39583h = j12;
        this.f39584i = j13;
        this.f39585j = f12;
        a();
    }
}
