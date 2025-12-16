package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.AbstractC22297h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PathParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22300k {
    public static final void a(Path path, double d12, double d13, double d14, double d15, double d16, double d17, double d18, boolean z12, boolean z13) {
        double d19;
        double d22;
        double d23 = d16;
        double d24 = (d18 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d24);
        double dSin = Math.sin(d24);
        double d25 = ((d13 * dSin) + (d12 * dCos)) / d23;
        double d26 = ((d13 * dCos) + ((-d12) * dSin)) / d17;
        double d27 = ((d15 * dSin) + (d14 * dCos)) / d23;
        double d28 = ((d15 * dCos) + ((-d14) * dSin)) / d17;
        double d29 = d25 - d27;
        double d32 = d26 - d28;
        double d33 = 2;
        double d34 = (d25 + d27) / d33;
        double d35 = (d26 + d28) / d33;
        double d36 = (d32 * d32) + (d29 * d29);
        if (d36 == 0.0d) {
            return;
        }
        double d37 = (1.0d / d36) - 0.25d;
        if (d37 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d36) / 1.99999d);
            a(path, d12, d13, d14, d15, d23 * dSqrt, d17 * dSqrt, d18, z12, z13);
            return;
        }
        double dSqrt2 = Math.sqrt(d37);
        double d38 = d29 * dSqrt2;
        double d39 = dSqrt2 * d32;
        if (z12 == z13) {
            d19 = d34 - d39;
            d22 = d35 + d38;
        } else {
            d19 = d34 + d39;
            d22 = d35 - d38;
        }
        double dAtan2 = Math.atan2(d26 - d22, d25 - d19);
        double dAtan22 = Math.atan2(d28 - d22, d27 - d19) - dAtan2;
        if (z13 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d42 = d19 * d23;
        double d43 = d22 * d17;
        double d44 = (d42 * dCos) - (d43 * dSin);
        double d45 = (d43 * dCos) + (d42 * dSin);
        double d46 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d46) / 3.141592653589793d));
        double dCos2 = Math.cos(d24);
        double dSin2 = Math.sin(d24);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d47 = -d23;
        double d48 = d47 * dCos2;
        double d49 = d17 * dSin2;
        double d52 = (d48 * dSin3) - (d49 * dCos3);
        double d53 = d47 * dSin2;
        double d54 = d17 * dCos2;
        double d55 = (dCos3 * d54) + (dSin3 * d53);
        double d56 = dAtan22 / iCeil;
        double d57 = d12;
        double d58 = dAtan2;
        double d59 = d52;
        int i12 = 0;
        double d62 = d55;
        double d63 = d13;
        while (i12 < iCeil) {
            double d64 = d58 + d56;
            double dSin4 = Math.sin(d64);
            double dCos4 = Math.cos(d64);
            double d65 = d56;
            double d66 = (((d23 * dCos2) * dCos4) + d44) - (d49 * dSin4);
            int i13 = iCeil;
            double d67 = (d54 * dSin4) + (d23 * dSin2 * dCos4) + d45;
            double d68 = (d48 * dSin4) - (d49 * dCos4);
            double d69 = (dCos4 * d54) + (dSin4 * d53);
            double d72 = d64 - d58;
            double dTan = Math.tan(d72 / d33);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d46) - 1) * Math.sin(d72)) / 3;
            path.m((float) ((d59 * dSqrt3) + d57), (float) ((d62 * dSqrt3) + d63), (float) (d66 - (dSqrt3 * d68)), (float) (d67 - (dSqrt3 * d69)), (float) d66, (float) d67);
            i12++;
            dSin2 = dSin2;
            dCos2 = dCos2;
            d57 = d66;
            d63 = d67;
            iCeil = i13;
            d58 = d64;
            d62 = d69;
            d59 = d68;
            d56 = d65;
            d23 = d16;
        }
    }

    @Y61.k
    public static final void b(@Y61.k List list, @Y61.k Path path) {
        AbstractC22297h abstractC22297h;
        float f12;
        int i12;
        int i13;
        AbstractC22297h abstractC22297h2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        List list2 = list;
        Path path2 = path;
        int iH2 = path.h();
        path.rewind();
        path2.l(iH2);
        AbstractC22297h abstractC22297h3 = list.isEmpty() ? AbstractC22297h.b.f39945c : (AbstractC22297h) list2.get(0);
        int size = list2.size();
        float f28 = 0.0f;
        int i14 = 0;
        float f29 = 0.0f;
        float f32 = 0.0f;
        float f33 = 0.0f;
        float f34 = 0.0f;
        float f35 = 0.0f;
        float f36 = 0.0f;
        while (i14 < size) {
            AbstractC22297h abstractC22297h4 = (AbstractC22297h) list2.get(i14);
            if (abstractC22297h4 instanceof AbstractC22297h.b) {
                path.close();
                abstractC22297h2 = abstractC22297h4;
                f12 = f28;
                i12 = i14;
                i13 = size;
                f29 = f35;
                f33 = f29;
                f32 = f36;
            } else {
                if (abstractC22297h4 instanceof AbstractC22297h.n) {
                    AbstractC22297h.n nVar = (AbstractC22297h.n) abstractC22297h4;
                    float f37 = nVar.f39983c;
                    f33 += f37;
                    float f38 = nVar.f39984d;
                    f34 += f38;
                    path2.o(f37, f38);
                    f35 = f33;
                    f36 = f34;
                } else if (abstractC22297h4 instanceof AbstractC22297h.f) {
                    AbstractC22297h.f fVar = (AbstractC22297h.f) abstractC22297h4;
                    float f39 = fVar.f39955c;
                    float f42 = fVar.f39956d;
                    path2.i(f39, f42);
                    f34 = f42;
                    f36 = f34;
                    f33 = f39;
                    f35 = f33;
                } else if (abstractC22297h4 instanceof AbstractC22297h.m) {
                    AbstractC22297h.m mVar = (AbstractC22297h.m) abstractC22297h4;
                    float f43 = mVar.f39981c;
                    float f44 = mVar.f39982d;
                    path2.n(f43, f44);
                    f33 += mVar.f39981c;
                    f34 += f44;
                } else {
                    if (abstractC22297h4 instanceof AbstractC22297h.e) {
                        AbstractC22297h.e eVar = (AbstractC22297h.e) abstractC22297h4;
                        float f45 = eVar.f39953c;
                        f17 = eVar.f39954d;
                        path2.r(f45, f17);
                        f33 = eVar.f39953c;
                    } else if (abstractC22297h4 instanceof AbstractC22297h.l) {
                        AbstractC22297h.l lVar = (AbstractC22297h.l) abstractC22297h4;
                        path2.n(lVar.f39980c, f28);
                        f33 += lVar.f39980c;
                    } else if (abstractC22297h4 instanceof AbstractC22297h.d) {
                        AbstractC22297h.d dVar = (AbstractC22297h.d) abstractC22297h4;
                        path2.r(dVar.f39952c, f34);
                        f33 = dVar.f39952c;
                    } else if (abstractC22297h4 instanceof AbstractC22297h.r) {
                        AbstractC22297h.r rVar = (AbstractC22297h.r) abstractC22297h4;
                        path2.n(f28, rVar.f39995c);
                        f34 += rVar.f39995c;
                    } else if (abstractC22297h4 instanceof AbstractC22297h.s) {
                        AbstractC22297h.s sVar = (AbstractC22297h.s) abstractC22297h4;
                        path2.r(f33, sVar.f39996c);
                        f34 = sVar.f39996c;
                    } else {
                        if (abstractC22297h4 instanceof AbstractC22297h.k) {
                            AbstractC22297h.k kVar = (AbstractC22297h.k) abstractC22297h4;
                            path.p(kVar.f39974c, kVar.f39975d, kVar.f39976e, kVar.f39977f, kVar.f39978g, kVar.f39979h);
                            f15 = kVar.f39976e + f33;
                            f16 = kVar.f39977f + f34;
                            f33 += kVar.f39978g;
                            f27 = kVar.f39979h;
                        } else {
                            if (abstractC22297h4 instanceof AbstractC22297h.c) {
                                AbstractC22297h.c cVar = (AbstractC22297h.c) abstractC22297h4;
                                path.m(cVar.f39946c, cVar.f39947d, cVar.f39948e, cVar.f39949f, cVar.f39950g, cVar.f39951h);
                                f15 = cVar.f39948e;
                                f22 = cVar.f39949f;
                                f23 = cVar.f39950g;
                                f24 = cVar.f39951h;
                            } else if (abstractC22297h4 instanceof AbstractC22297h.p) {
                                if (abstractC22297h3.f39936a) {
                                    f26 = f34 - f32;
                                    f25 = f33 - f29;
                                } else {
                                    f25 = f28;
                                    f26 = f25;
                                }
                                AbstractC22297h.p pVar = (AbstractC22297h.p) abstractC22297h4;
                                path.p(f25, f26, pVar.f39989c, pVar.f39990d, pVar.f39991e, pVar.f39992f);
                                f15 = pVar.f39989c + f33;
                                f16 = pVar.f39990d + f34;
                                f33 += pVar.f39991e;
                                f27 = pVar.f39992f;
                            } else if (abstractC22297h4 instanceof AbstractC22297h.C1662h) {
                                if (abstractC22297h3.f39936a) {
                                    float f46 = 2;
                                    f19 = (f46 * f34) - f32;
                                    f18 = (f33 * f46) - f29;
                                } else {
                                    f18 = f33;
                                    f19 = f34;
                                }
                                AbstractC22297h.C1662h c1662h = (AbstractC22297h.C1662h) abstractC22297h4;
                                path.m(f18, f19, c1662h.f39961c, c1662h.f39962d, c1662h.f39963e, c1662h.f39964f);
                                f15 = c1662h.f39961c;
                                f22 = c1662h.f39962d;
                                f23 = c1662h.f39963e;
                                f24 = c1662h.f39964f;
                            } else if (abstractC22297h4 instanceof AbstractC22297h.o) {
                                AbstractC22297h.o oVar = (AbstractC22297h.o) abstractC22297h4;
                                float f47 = oVar.f39985c;
                                float f48 = oVar.f39986d;
                                float f49 = oVar.f39987e;
                                float f52 = oVar.f39988f;
                                path2.f(f47, f48, f49, f52);
                                float f53 = oVar.f39985c + f33;
                                f32 = f48 + f34;
                                f33 += f49;
                                f34 += f52;
                                f29 = f53;
                            } else if (abstractC22297h4 instanceof AbstractC22297h.g) {
                                AbstractC22297h.g gVar = (AbstractC22297h.g) abstractC22297h4;
                                float f54 = gVar.f39957c;
                                f32 = gVar.f39958d;
                                float f55 = gVar.f39959e;
                                f17 = gVar.f39960f;
                                path2.s(f54, f32, f55, f17);
                                f29 = gVar.f39957c;
                                f33 = f55;
                            } else if (abstractC22297h4 instanceof AbstractC22297h.q) {
                                if (abstractC22297h3.f39937b) {
                                    f13 = f33 - f29;
                                    f14 = f34 - f32;
                                } else {
                                    f13 = f28;
                                    f14 = f13;
                                }
                                AbstractC22297h.q qVar = (AbstractC22297h.q) abstractC22297h4;
                                float f56 = qVar.f39993c;
                                float f57 = qVar.f39994d;
                                path2.f(f13, f14, f56, f57);
                                f15 = f13 + f33;
                                f16 = f14 + f34;
                                f33 += qVar.f39993c;
                                f34 += f57;
                                f32 = f16;
                                abstractC22297h2 = abstractC22297h4;
                                f12 = f28;
                                i12 = i14;
                                i13 = size;
                                f29 = f15;
                                i14 = i12 + 1;
                                list2 = list;
                                path2 = path;
                                f28 = f12;
                                abstractC22297h3 = abstractC22297h2;
                                size = i13;
                            } else {
                                if (abstractC22297h4 instanceof AbstractC22297h.i) {
                                    if (abstractC22297h3.f39937b) {
                                        float f58 = 2;
                                        f33 = (f33 * f58) - f29;
                                        f34 = (f58 * f34) - f32;
                                    }
                                    AbstractC22297h.i iVar = (AbstractC22297h.i) abstractC22297h4;
                                    float f59 = iVar.f39965c;
                                    float f62 = iVar.f39966d;
                                    path2.s(f33, f34, f59, f62);
                                    f29 = f33;
                                    abstractC22297h2 = abstractC22297h4;
                                    f12 = f28;
                                    i12 = i14;
                                    i13 = size;
                                    f33 = iVar.f39965c;
                                    float f63 = f34;
                                    f34 = f62;
                                    f32 = f63;
                                } else {
                                    if (abstractC22297h4 instanceof AbstractC22297h.j) {
                                        AbstractC22297h.j jVar = (AbstractC22297h.j) abstractC22297h4;
                                        float f64 = jVar.f39972h + f33;
                                        float f65 = jVar.f39973i + f34;
                                        i12 = i14;
                                        abstractC22297h = abstractC22297h4;
                                        f12 = 0.0f;
                                        i13 = size;
                                        a(path, f33, f34, f64, f65, jVar.f39967c, jVar.f39968d, jVar.f39969e, jVar.f39970f, jVar.f39971g);
                                        f29 = f64;
                                        f33 = f29;
                                        f32 = f65;
                                        f34 = f32;
                                    } else {
                                        abstractC22297h = abstractC22297h4;
                                        f12 = f28;
                                        i12 = i14;
                                        i13 = size;
                                        if (abstractC22297h instanceof AbstractC22297h.a) {
                                            AbstractC22297h.a aVar = (AbstractC22297h.a) abstractC22297h;
                                            double d12 = aVar.f39943h;
                                            float f66 = aVar.f39944i;
                                            abstractC22297h2 = abstractC22297h;
                                            a(path, f33, f34, d12, f66, aVar.f39938c, aVar.f39939d, aVar.f39940e, aVar.f39941f, aVar.f39942g);
                                            f29 = aVar.f39943h;
                                            f33 = f29;
                                            f32 = f66;
                                        }
                                    }
                                    abstractC22297h2 = abstractC22297h;
                                }
                                i14 = i12 + 1;
                                list2 = list;
                                path2 = path;
                                f28 = f12;
                                abstractC22297h3 = abstractC22297h2;
                                size = i13;
                            }
                            f33 = f23;
                            f34 = f24;
                            abstractC22297h2 = abstractC22297h4;
                            f12 = f28;
                            i12 = i14;
                            i13 = size;
                            f32 = f22;
                            f29 = f15;
                            i14 = i12 + 1;
                            list2 = list;
                            path2 = path;
                            f28 = f12;
                            abstractC22297h3 = abstractC22297h2;
                            size = i13;
                        }
                        f34 += f27;
                        f32 = f16;
                        abstractC22297h2 = abstractC22297h4;
                        f12 = f28;
                        i12 = i14;
                        i13 = size;
                        f29 = f15;
                        i14 = i12 + 1;
                        list2 = list;
                        path2 = path;
                        f28 = f12;
                        abstractC22297h3 = abstractC22297h2;
                        size = i13;
                    }
                    f34 = f17;
                }
                abstractC22297h2 = abstractC22297h4;
                f12 = f28;
                i12 = i14;
                i13 = size;
                i14 = i12 + 1;
                list2 = list;
                path2 = path;
                f28 = f12;
                abstractC22297h3 = abstractC22297h2;
                size = i13;
            }
            f34 = f32;
            i14 = i12 + 1;
            list2 = list;
            path2 = path;
            f28 = f12;
            abstractC22297h3 = abstractC22297h2;
            size = i13;
        }
    }
}
