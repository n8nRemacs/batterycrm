package androidx.compose.ui.graphics;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Color.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/T;", "", "a", "value", "Lkotlin/w0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39320b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f39321c = V.d(4278190080L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f39322d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f39323e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f39324f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f39325g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f39326h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f39327i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f39328j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f39329k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f39330l;

    /* renamed from: a, reason: collision with root package name */
    public final long f39331a;

    /* compiled from: Color.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/T$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static long a() {
            return T.f39321c;
        }

        public a() {
        }
    }

    static {
        V.d(4282664004L);
        f39322d = V.d(4287137928L);
        V.d(4291611852L);
        f39323e = V.d(4294967295L);
        f39324f = V.d(4294901760L);
        f39325g = V.d(4278255360L);
        f39326h = V.d(4278190335L);
        f39327i = V.d(4294967040L);
        V.d(4278255615L);
        f39328j = V.d(4294902015L);
        f39329k = V.b(0);
        androidx.compose.ui.graphics.colorspace.f.f39390a.getClass();
        f39330l = V.a(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.f.f39411v);
    }

    private /* synthetic */ T(long j12) {
        this.f39331a = j12;
    }

    public static final /* synthetic */ T a(long j12) {
        return new T(j12);
    }

    public static final long b(long j12, @Y61.k androidx.compose.ui.graphics.colorspace.c cVar) {
        androidx.compose.ui.graphics.colorspace.h hVarD;
        androidx.compose.ui.graphics.colorspace.c cVarG = g(j12);
        androidx.compose.ui.graphics.colorspace.n.f39435b.getClass();
        int i12 = cVarG.f39388c;
        int i13 = cVar.f39388c;
        if ((i12 | i13) < 0) {
            hVarD = androidx.compose.ui.graphics.colorspace.d.d(cVarG, cVar);
        } else {
            androidx.collection.A0<androidx.compose.ui.graphics.colorspace.h> a02 = androidx.compose.ui.graphics.colorspace.i.f39424a;
            int i14 = i12 | (i13 << 6);
            androidx.compose.ui.graphics.colorspace.h hVarB = a02.b(i14);
            if (hVarB == null) {
                hVarB = androidx.compose.ui.graphics.colorspace.d.d(cVarG, cVar);
                a02.h(i14, hVarB);
            }
            hVarD = hVarB;
        }
        return hVarD.a(j12);
    }

    public static long c(long j12, float f12) {
        return V.a(i(j12), h(j12), f(j12), f12, g(j12));
    }

    public static final boolean d(long j12, long j13) {
        int i12 = kotlin.w0.f410662c;
        return j12 == j13;
    }

    public static final float e(long j12) {
        float fA2;
        float f12;
        long j13 = 63 & j12;
        int i12 = kotlin.w0.f410662c;
        if (j13 == 0) {
            fA2 = (float) kotlin.J0.a((j12 >>> 56) & 255);
            f12 = 255.0f;
        } else {
            fA2 = (float) kotlin.J0.a((j12 >>> 6) & 1023);
            f12 = 1023.0f;
        }
        return fA2 / f12;
    }

    public static final float f(long j12) {
        int i12;
        int i13;
        int i14;
        long j13 = 63 & j12;
        int i15 = kotlin.w0.f410662c;
        if (j13 == 0) {
            return ((float) kotlin.J0.a((j12 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j12 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i16 = Short.MIN_VALUE & s5;
        int i17 = ((65535 & s5) >>> 10) & 31;
        int i18 = s5 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i12 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i12 = i17 + 112;
            }
            int i22 = i12;
            i13 = i19;
            i14 = i22;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - C22262k0.f39546a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i14 = 0;
            i13 = 0;
        }
        return Float.intBitsToFloat((i14 << 23) | (i16 << 16) | i13);
    }

    @Y61.k
    public static final androidx.compose.ui.graphics.colorspace.c g(long j12) {
        androidx.compose.ui.graphics.colorspace.f fVar = androidx.compose.ui.graphics.colorspace.f.f39390a;
        int i12 = kotlin.w0.f410662c;
        fVar.getClass();
        return androidx.compose.ui.graphics.colorspace.f.f39415z[(int) (j12 & 63)];
    }

    public static final float h(long j12) {
        int i12;
        int i13;
        int i14;
        long j13 = 63 & j12;
        int i15 = kotlin.w0.f410662c;
        if (j13 == 0) {
            return ((float) kotlin.J0.a((j12 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j12 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i16 = Short.MIN_VALUE & s5;
        int i17 = ((65535 & s5) >>> 10) & 31;
        int i18 = s5 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i12 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i12 = i17 + 112;
            }
            int i22 = i12;
            i13 = i19;
            i14 = i22;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - C22262k0.f39546a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i14 = 0;
            i13 = 0;
        }
        return Float.intBitsToFloat((i14 << 23) | (i16 << 16) | i13);
    }

    public static final float i(long j12) {
        int i12;
        int i13;
        int i14;
        long j13 = 63 & j12;
        int i15 = kotlin.w0.f410662c;
        if (j13 == 0) {
            return ((float) kotlin.J0.a((j12 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j12 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i16 = Short.MIN_VALUE & s5;
        int i17 = ((65535 & s5) >>> 10) & 31;
        int i18 = s5 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i12 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i12 = i17 + 112;
            }
            int i22 = i12;
            i13 = i19;
            i14 = i22;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - C22262k0.f39546a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i14 = 0;
            i13 = 0;
        }
        return Float.intBitsToFloat((i14 << 23) | (i16 << 16) | i13);
    }

    @Y61.k
    public static String j(long j12) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(i(j12));
        sb2.append(", ");
        sb2.append(h(j12));
        sb2.append(", ");
        sb2.append(f(j12));
        sb2.append(", ");
        sb2.append(e(j12));
        sb2.append(", ");
        return C22026a.c(sb2, g(j12).f39386a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f39331a == ((T) obj).f39331a;
        }
        return false;
    }

    public final int hashCode() {
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f39331a);
    }

    @Y61.k
    public final String toString() {
        return j(this.f39331a);
    }
}
