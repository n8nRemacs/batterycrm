package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.colorspace.r;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Rgb.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/r;", "Landroidx/compose/ui/graphics/colorspace/c;", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends androidx.compose.ui.graphics.colorspace.c {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f39446r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final e f39447s = new e(4);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f39448d;

    /* renamed from: e, reason: collision with root package name */
    public final float f39449e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39450f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final s f39451g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final float[] f39452h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final float[] f39453i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final float[] f39454j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final j f39455k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Double, Double> f39456l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final o f39457m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final j f39458n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Double, Double> f39459o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final o f39460p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f39461q;

    /* compiled from: Rgb.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/r$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/j;", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/j;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            float f18 = (((((f14 * f17) + ((f13 * f16) + (f12 * f15))) - (f15 * f16)) - (f13 * f14)) - (f12 * f17)) * 0.5f;
            return f18 < 0.0f ? -f18 : f18;
        }

        public a() {
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Double, Double> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Double invoke(Double d12) {
            double dDoubleValue = d12.doubleValue();
            return Double.valueOf(r.this.f39458n.a(kotlin.ranges.s.e(dDoubleValue, r8.f39449e, r8.f39450f)));
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Double, Double> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Double invoke(Double d12) {
            return Double.valueOf(kotlin.ranges.s.e(r.this.f39455k.a(d12.doubleValue()), r10.f39449e, r10.f39450f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0227 A[EDGE_INSN: B:53:0x0227->B:71:0x0287 BREAK  A[LOOP:0: B:63:0x024e->B:69:0x027f], EDGE_INSN: B:81:0x0227->B:53:0x0227 BREAK  A[LOOP:1: B:48:0x020b->B:54:0x0229]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@Y61.k java.lang.String r32, @Y61.k float[] r33, @Y61.k androidx.compose.ui.graphics.colorspace.u r34, @Y61.l float[] r35, @Y61.k androidx.compose.ui.graphics.colorspace.j r36, @Y61.k androidx.compose.ui.graphics.colorspace.j r37, float r38, float r39, @Y61.l androidx.compose.ui.graphics.colorspace.s r40, int r41) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.r.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.u, float[], androidx.compose.ui.graphics.colorspace.j, androidx.compose.ui.graphics.colorspace.j, float, float, androidx.compose.ui.graphics.colorspace.s, int):void");
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] a(@Y61.k float[] fArr) {
        d.h(this.f39454j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d12 = fArr[0];
        o oVar = this.f39457m;
        fArr[0] = (float) oVar.a(d12);
        fArr[1] = (float) oVar.a(fArr[1]);
        fArr[2] = (float) oVar.a(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i12) {
        return this.f39450f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i12) {
        return this.f39449e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: d, reason: from getter */
    public final boolean getF39461q() {
        return this.f39461q;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f12, float f13, float f14) {
        double d12 = f12;
        o oVar = this.f39460p;
        float fA2 = (float) oVar.a(d12);
        float fA3 = (float) oVar.a(f13);
        float fA4 = (float) oVar.a(f14);
        float[] fArr = this.f39453i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f15 = (fArr[6] * fA4) + (fArr[3] * fA3) + (fArr[0] * fA2);
        float f16 = (fArr[7] * fA4) + (fArr[4] * fA3) + (fArr[1] * fA2);
        return (Float.floatToRawIntBits(f16) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(rVar.f39449e, this.f39449e) != 0 || Float.compare(rVar.f39450f, this.f39450f) != 0 || !L.f(this.f39448d, rVar.f39448d) || !Arrays.equals(this.f39452h, rVar.f39452h)) {
            return false;
        }
        s sVar = rVar.f39451g;
        s sVar2 = this.f39451g;
        if (sVar2 != null) {
            return L.f(sVar2, sVar);
        }
        if (sVar == null) {
            return true;
        }
        if (L.f(this.f39455k, rVar.f39455k)) {
            return L.f(this.f39458n, rVar.f39458n);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] f(@Y61.k float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d12 = fArr[0];
        o oVar = this.f39460p;
        fArr[0] = (float) oVar.a(d12);
        fArr[1] = (float) oVar.a(fArr[1]);
        fArr[2] = (float) oVar.a(fArr[2]);
        d.h(this.f39453i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f12, float f13, float f14) {
        double d12 = f12;
        o oVar = this.f39460p;
        float fA2 = (float) oVar.a(d12);
        float fA3 = (float) oVar.a(f13);
        float fA4 = (float) oVar.a(f14);
        float[] fArr = this.f39453i;
        return (fArr[8] * fA4) + (fArr[5] * fA3) + (fArr[2] * fA2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f12, float f13, float f14, float f15, @Y61.k androidx.compose.ui.graphics.colorspace.c cVar) {
        float[] fArr = this.f39454j;
        float f16 = (fArr[6] * f14) + (fArr[3] * f13) + (fArr[0] * f12);
        float f17 = (fArr[7] * f14) + (fArr[4] * f13) + (fArr[1] * f12);
        float f18 = (fArr[8] * f14) + (fArr[5] * f13) + (fArr[2] * f12);
        o oVar = this.f39457m;
        return V.a((float) oVar.a(f16), (float) oVar.a(f17), (float) oVar.a(f18), f15, cVar);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f39452h) + ((this.f39448d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f12 = this.f39449e;
        int iFloatToIntBits = (iHashCode + (f12 == 0.0f ? 0 : Float.floatToIntBits(f12))) * 31;
        float f13 = this.f39450f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f13 == 0.0f ? 0 : Float.floatToIntBits(f13))) * 31;
        s sVar = this.f39451g;
        int iHashCode2 = iFloatToIntBits2 + (sVar != null ? sVar.hashCode() : 0);
        if (sVar == null) {
            return this.f39458n.hashCode() + ((this.f39455k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(@Y61.k String str, @Y61.k float[] fArr, @Y61.k u uVar, final double d12, float f12, float f13, int i12) {
        j jVar;
        j jVar2 = f39447s;
        if (d12 == 1.0d) {
            jVar = jVar2;
        } else {
            final int i13 = 0;
            jVar = new j() { // from class: androidx.compose.ui.graphics.colorspace.p
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d13) {
                    double d14 = d12;
                    switch (i13) {
                        case 0:
                            r.a aVar = r.f39446r;
                            if (d13 < 0.0d) {
                                d13 = 0.0d;
                            }
                            return Math.pow(d13, 1.0d / d14);
                        default:
                            r.a aVar2 = r.f39446r;
                            if (d13 < 0.0d) {
                                d13 = 0.0d;
                            }
                            return Math.pow(d13, d14);
                    }
                }
            };
        }
        if (d12 != 1.0d) {
            final int i14 = 1;
            jVar2 = new j() { // from class: androidx.compose.ui.graphics.colorspace.p
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d13) {
                    double d14 = d12;
                    switch (i14) {
                        case 0:
                            r.a aVar = r.f39446r;
                            if (d13 < 0.0d) {
                                d13 = 0.0d;
                            }
                            return Math.pow(d13, 1.0d / d14);
                        default:
                            r.a aVar2 = r.f39446r;
                            if (d13 < 0.0d) {
                                d13 = 0.0d;
                            }
                            return Math.pow(d13, d14);
                    }
                }
            };
        }
        this(str, fArr, uVar, null, jVar, jVar2, f12, f13, new s(d12, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i12);
    }

    public r(@Y61.k String str, @Y61.k float[] fArr, @Y61.k u uVar, @Y61.k final s sVar, int i12) {
        j jVar;
        j jVar2;
        f39446r.getClass();
        double d12 = sVar.f39464a;
        boolean z12 = d12 == -3.0d;
        double d13 = sVar.f39470g;
        double d14 = sVar.f39469f;
        if (z12) {
            final int i13 = 4;
            jVar = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i13) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else if (d12 == -2.0d) {
            final int i14 = 5;
            jVar = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i14) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else if (d14 == 0.0d && d13 == 0.0d) {
            final int i15 = 6;
            jVar = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i15) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else {
            final int i16 = 7;
            jVar = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i16) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        }
        j jVar3 = jVar;
        if (d12 == -3.0d) {
            final int i17 = 0;
            jVar2 = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i17) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else if (d12 == -2.0d) {
            final int i18 = 1;
            jVar2 = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i18) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else if (d14 == 0.0d && d13 == 0.0d) {
            final int i19 = 2;
            jVar2 = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i19) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        } else {
            final int i22 = 3;
            jVar2 = new j() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.j
                public final double a(double d15) {
                    switch (i22) {
                        case 0:
                            f fVar = f.f39390a;
                            s sVar2 = sVar;
                            fVar.getClass();
                            return f.a(sVar2, d15);
                        case 1:
                            f fVar2 = f.f39390a;
                            s sVar3 = sVar;
                            fVar2.getClass();
                            return f.c(sVar3, d15);
                        case 2:
                            s sVar4 = sVar;
                            return d15 >= sVar4.f39468e ? Math.pow((sVar4.f39465b * d15) + sVar4.f39466c, sVar4.f39464a) : d15 * sVar4.f39467d;
                        case 3:
                            s sVar5 = sVar;
                            double d16 = sVar5.f39465b;
                            if (d15 >= sVar5.f39468e) {
                                return Math.pow((d16 * d15) + sVar5.f39466c, sVar5.f39464a) + sVar5.f39469f;
                            }
                            return sVar5.f39470g + (sVar5.f39467d * d15);
                        case 4:
                            f fVar3 = f.f39390a;
                            s sVar6 = sVar;
                            fVar3.getClass();
                            return f.b(sVar6, d15);
                        case 5:
                            f fVar4 = f.f39390a;
                            s sVar7 = sVar;
                            fVar4.getClass();
                            return f.d(sVar7, d15);
                        case 6:
                            s sVar8 = sVar;
                            double d17 = sVar8.f39468e;
                            double d18 = sVar8.f39467d;
                            return d15 >= d17 * d18 ? (Math.pow(d15, 1.0d / sVar8.f39464a) - sVar8.f39466c) / sVar8.f39465b : d15 / d18;
                        default:
                            s sVar9 = sVar;
                            double d19 = sVar9.f39465b;
                            double d22 = sVar9.f39468e;
                            double d23 = sVar9.f39467d;
                            return d15 >= d22 * d23 ? (Math.pow(d15 - sVar9.f39469f, 1.0d / sVar9.f39464a) - sVar9.f39466c) / d19 : (d15 - sVar9.f39470g) / d23;
                    }
                }
            };
        }
        this(str, fArr, uVar, null, jVar3, jVar2, 0.0f, 1.0f, sVar, i12);
    }
}
