package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes10.dex */
public class o implements n, a.b, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f59250e;

    /* renamed from: f, reason: collision with root package name */
    public final B f59251f;

    /* renamed from: g, reason: collision with root package name */
    public final PolystarShape.Type f59252g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59253h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f59254i;

    /* renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59255j;

    /* renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.a<?, PointF> f59256k;

    /* renamed from: l, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59257l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59258m;

    /* renamed from: n, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59259n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59260o;

    /* renamed from: p, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59261p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f59263r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f59246a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f59247b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f59248c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f59249d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final b f59262q = new b();

    /* compiled from: PolystarContent.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59264a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f59264a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59264a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(B b12, com.airbnb.lottie.model.layer.b bVar, PolystarShape polystarShape) {
        this.f59251f = b12;
        this.f59250e = polystarShape.f59679a;
        PolystarShape.Type type = polystarShape.f59680b;
        this.f59252g = type;
        this.f59253h = polystarShape.f59688j;
        this.f59254i = polystarShape.f59689k;
        com.airbnb.lottie.animation.keyframe.d dVarC = polystarShape.f59681c.c();
        this.f59255j = dVarC;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC = polystarShape.f59682d.c();
        this.f59256k = aVarC;
        com.airbnb.lottie.animation.keyframe.d dVarC2 = polystarShape.f59683e.c();
        this.f59257l = dVarC2;
        com.airbnb.lottie.animation.keyframe.d dVarC3 = polystarShape.f59685g.c();
        this.f59259n = dVarC3;
        com.airbnb.lottie.animation.keyframe.d dVarC4 = polystarShape.f59687i.c();
        this.f59261p = dVarC4;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f59258m = polystarShape.f59684f.c();
            this.f59260o = polystarShape.f59686h.c();
        } else {
            this.f59258m = null;
            this.f59260o = null;
        }
        bVar.f(dVarC);
        bVar.f(aVarC);
        bVar.f(dVarC2);
        bVar.f(dVarC3);
        bVar.f(dVarC4);
        if (type == type2) {
            bVar.f(this.f59258m);
            bVar.f(this.f59260o);
        }
        dVarC.a(this);
        aVarC.a(this);
        dVarC2.a(this);
        dVarC3.a(this);
        dVarC4.a(this);
        if (type == type2) {
            this.f59258m.a(this);
            this.f59260o.a(this);
        }
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        com.airbnb.lottie.animation.keyframe.d dVar;
        com.airbnb.lottie.animation.keyframe.d dVar2;
        if (colorFilter == H.f59099r) {
            this.f59255j.k(jVar);
            return;
        }
        if (colorFilter == H.f59100s) {
            this.f59257l.k(jVar);
            return;
        }
        if (colorFilter == H.f59090i) {
            this.f59256k.k(jVar);
            return;
        }
        if (colorFilter == H.f59101t && (dVar2 = this.f59258m) != null) {
            dVar2.k(jVar);
            return;
        }
        if (colorFilter == H.f59102u) {
            this.f59259n.k(jVar);
            return;
        }
        if (colorFilter == H.f59103v && (dVar = this.f59260o) != null) {
            dVar.k(jVar);
        } else if (colorFilter == H.f59104w) {
            this.f59261p.k(jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i12 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i12);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f59303c == ShapeTrimPath.Type.f59712b) {
                    this.f59262q.f59176a.add(vVar);
                    vVar.a(this);
                }
            }
            i12++;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59263r = false;
        this.f59251f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59250e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        o oVar;
        Path path;
        float f12;
        double d12;
        float fCos;
        float fSin;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i12;
        o oVar2;
        int i13;
        double d13;
        float f18;
        Path path2;
        o oVar3 = this;
        boolean z12 = oVar3.f59263r;
        Path path3 = oVar3.f59246a;
        if (z12) {
            return path3;
        }
        path3.reset();
        if (oVar3.f59253h) {
            oVar3.f59263r = true;
            return path3;
        }
        int iOrdinal = oVar3.f59252g.ordinal();
        com.airbnb.lottie.animation.keyframe.d dVar = oVar3.f59259n;
        com.airbnb.lottie.animation.keyframe.d dVar2 = oVar3.f59261p;
        com.airbnb.lottie.animation.keyframe.d dVar3 = oVar3.f59257l;
        com.airbnb.lottie.animation.keyframe.d dVar4 = oVar3.f59255j;
        com.airbnb.lottie.animation.keyframe.a<?, PointF> aVar = oVar3.f59256k;
        if (iOrdinal == 0) {
            oVar = oVar3;
            path = path3;
            float fFloatValue = dVar4.f().floatValue();
            double radians = Math.toRadians((dVar3 != null ? dVar3.f().floatValue() : 0.0d) - 90.0d);
            double d14 = fFloatValue;
            float f19 = (float) (6.283185307179586d / d14);
            if (oVar.f59254i) {
                f19 *= -1.0f;
            }
            float f22 = f19 / 2.0f;
            float f23 = fFloatValue - ((int) fFloatValue);
            if (f23 != 0.0f) {
                radians += (1.0f - f23) * f22;
            }
            float fFloatValue2 = dVar.f().floatValue();
            float fFloatValue3 = oVar.f59258m.f().floatValue();
            com.airbnb.lottie.animation.keyframe.d dVar5 = oVar.f59260o;
            float fFloatValue4 = dVar5 != null ? dVar5.f().floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = dVar2 != null ? dVar2.f().floatValue() / 100.0f : 0.0f;
            if (f23 != 0.0f) {
                float fC2 = androidx.appcompat.app.r.c(fFloatValue2, fFloatValue3, f23, fFloatValue3);
                double d15 = fC2;
                fCos = (float) (Math.cos(radians) * d15);
                fSin = (float) (d15 * Math.sin(radians));
                path.moveTo(fCos, fSin);
                d12 = radians + ((f19 * f23) / 2.0f);
                f13 = fC2;
                f12 = f22;
            } else {
                double d16 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d16);
                float fSin2 = (float) (Math.sin(radians) * d16);
                path.moveTo(fCos2, fSin2);
                f12 = f22;
                d12 = radians + f12;
                fCos = fCos2;
                fSin = fSin2;
                f13 = 0.0f;
            }
            double dCeil = Math.ceil(d14) * 2.0d;
            int i14 = 0;
            boolean z13 = false;
            double d17 = d12;
            while (true) {
                double d18 = i14;
                if (d18 >= dCeil) {
                    break;
                }
                float f24 = z13 ? fFloatValue2 : fFloatValue3;
                if (f13 == 0.0f || d18 != dCeil - 2.0d) {
                    f14 = f19;
                    f15 = f12;
                } else {
                    f14 = f19;
                    f15 = (f19 * f23) / 2.0f;
                }
                if (f13 != 0.0f && d18 == dCeil - 1.0d) {
                    f24 = f13;
                }
                double d19 = f24;
                float f25 = f12;
                float f26 = f13;
                float fCos3 = (float) (Math.cos(d17) * d19);
                float fSin3 = (float) (d19 * Math.sin(d17));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f16 = fFloatValue2;
                    f17 = fFloatValue3;
                    i12 = i14;
                } else {
                    f16 = fFloatValue2;
                    f17 = fFloatValue3;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f27 = fCos;
                    float f28 = fSin;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f29 = z13 ? fFloatValue4 : fFloatValue5;
                    float f32 = z13 ? fFloatValue5 : fFloatValue4;
                    float f33 = (z13 ? f17 : f16) * f29 * 0.47829f;
                    float f34 = fCos4 * f33;
                    float f35 = f33 * fSin4;
                    float f36 = (z13 ? f16 : f17) * f32 * 0.47829f;
                    float f37 = fCos5 * f36;
                    float f38 = f36 * fSin5;
                    if (f23 == 0.0f) {
                        i12 = i14;
                        path.cubicTo(f27 - f34, f28 - f35, fCos3 + f37, fSin3 + f38, fCos3, fSin3);
                    } else if (i14 == 0) {
                        f34 *= f23;
                        f35 *= f23;
                        i12 = i14;
                        path.cubicTo(f27 - f34, f28 - f35, fCos3 + f37, fSin3 + f38, fCos3, fSin3);
                    } else {
                        if (d18 == dCeil - 1.0d) {
                            f37 *= f23;
                            f38 *= f23;
                        }
                        i12 = i14;
                        path.cubicTo(f27 - f34, f28 - f35, fCos3 + f37, fSin3 + f38, fCos3, fSin3);
                    }
                }
                d17 += f15;
                z13 = !z13;
                i14 = i12 + 1;
                fCos = fCos3;
                fSin = fSin3;
                f19 = f14;
                fFloatValue2 = f16;
                fFloatValue3 = f17;
                f12 = f25;
                f13 = f26;
            }
            PointF pointFF = aVar.f();
            path.offset(pointFF.x, pointFF.y);
            path.close();
        } else if (iOrdinal != 1) {
            oVar = oVar3;
            path = path3;
        } else {
            int iFloor = (int) Math.floor(dVar4.f().floatValue());
            double radians2 = Math.toRadians((dVar3 != null ? dVar3.f().floatValue() : 0.0d) - 90.0d);
            double d22 = iFloor;
            float fFloatValue6 = dVar2.f().floatValue() / 100.0f;
            float fFloatValue7 = dVar.f().floatValue();
            double d23 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d23);
            float fSin6 = (float) (Math.sin(radians2) * d23);
            path3.moveTo(fCos6, fSin6);
            double d24 = (float) (6.283185307179586d / d22);
            double dCeil2 = Math.ceil(d22);
            double d25 = radians2 + d24;
            int i15 = 0;
            while (true) {
                double d26 = i15;
                if (d26 >= dCeil2) {
                    break;
                }
                Path path4 = path3;
                float fCos7 = (float) (Math.cos(d25) * d23);
                double d27 = d24;
                float fSin7 = (float) (Math.sin(d25) * d23);
                if (fFloatValue6 != 0.0f) {
                    d13 = d23;
                    int i16 = i15;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    f18 = fSin7;
                    i13 = i16;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f39 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f42 = fCos8 * f39;
                    float f43 = fSin8 * f39;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f39;
                    float fSin9 = f39 * ((float) Math.sin(dAtan24));
                    if (d26 == dCeil2 - 1.0d) {
                        oVar2 = this;
                        Path path5 = oVar2.f59247b;
                        path5.reset();
                        path5.moveTo(fCos6, fSin6);
                        float f44 = fCos6 - f42;
                        float f45 = fSin6 - f43;
                        float f46 = fCos7 + fCos9;
                        float f47 = f18 + fSin9;
                        path5.cubicTo(f44, f45, f46, f47, fCos7, f18);
                        PathMeasure pathMeasure = oVar2.f59248c;
                        pathMeasure.setPath(path5, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = oVar2.f59249d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path4.cubicTo(f44, f45, f46, f47, fArr[0], fArr[1]);
                    } else {
                        oVar2 = this;
                        path4.cubicTo(fCos6 - f42, fSin6 - f43, fCos7 + fCos9, f18 + fSin9, fCos7, f18);
                    }
                    path2 = path4;
                } else {
                    oVar2 = oVar3;
                    i13 = i15;
                    d13 = d23;
                    f18 = fSin7;
                    if (d26 == dCeil2 - 1.0d) {
                        path2 = path4;
                        fSin6 = f18;
                        i15 = i13 + 1;
                        fCos6 = fCos7;
                        d23 = d13;
                        path3 = path2;
                        oVar3 = oVar2;
                        d24 = d27;
                    } else {
                        path2 = path4;
                        path2.lineTo(fCos7, f18);
                    }
                }
                d25 += d27;
                fSin6 = f18;
                i15 = i13 + 1;
                fCos6 = fCos7;
                d23 = d13;
                path3 = path2;
                oVar3 = oVar2;
                d24 = d27;
            }
            oVar = oVar3;
            path = path3;
            PointF pointFF2 = aVar.f();
            path.offset(pointFF2.x, pointFF2.y);
            path.close();
        }
        path.close();
        oVar.f59262q.a(path);
        oVar.f59263r = true;
        return path;
    }
}
