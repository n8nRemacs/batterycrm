package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Q2;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.l0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import l0.g;

/* compiled from: HandwritingGesture.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X {
    public static final long a(long j12, CharSequence charSequence) {
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        int iCharCount = (int) (j12 >> 32);
        int iCharCount2 = (int) (4294967295L & j12);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (n(iCodePointBefore) && (m(iCodePointAt) || l(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (n(iCodePointBefore));
            return androidx.compose.ui.text.w0.a(iCharCount, iCharCount2);
        }
        if (!n(iCodePointAt)) {
            return j12;
        }
        if (!m(iCodePointBefore) && !l(iCodePointBefore)) {
            return j12;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (n(iCodePointAt));
        return androidx.compose.ui.text.w0.a(iCharCount, iCharCount2);
    }

    public static final long b(androidx.compose.ui.text.o0 o0Var, long j12, long j13, androidx.compose.ui.layout.A a12, InterfaceC22544x2 interfaceC22544x2) {
        if (o0Var == null || a12 == null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        long jM2 = a12.M(j12);
        long jM3 = a12.M(j13);
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        int iH2 = h(g12, jM2, interfaceC22544x2);
        int iH3 = h(g12, jM3, interfaceC22544x2);
        if (iH2 != -1) {
            if (iH3 != -1) {
                iH2 = Math.min(iH2, iH3);
            }
            iH3 = iH2;
        } else if (iH3 == -1) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        float fB2 = (g12.b(iH3) + g12.f(iH3)) / 2;
        int i12 = (int) (jM2 >> 32);
        int i13 = (int) (jM3 >> 32);
        l0.j jVar = new l0.j(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), fB2 - 0.1f, Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), fB2 + 0.1f);
        androidx.compose.ui.text.k0.f42491b.getClass();
        androidx.compose.ui.text.l0.f42495a.getClass();
        return g12.h(jVar, 0, l0.a.f42497b);
    }

    public static final long c(C20985q1 c20985q1, l0.j jVar, l0.j jVar2, int i12, androidx.compose.ui.graphics.colorspace.e eVar) {
        long j12 = j(c20985q1, jVar, i12, eVar);
        if (androidx.compose.ui.text.v0.d(j12)) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        long j13 = j(c20985q1, jVar2, i12, eVar);
        if (androidx.compose.ui.text.v0.d(j13)) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        int i13 = (int) (j12 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return androidx.compose.ui.text.w0.a(Math.min(i13, i13), Math.max(i14, i14));
    }

    public static final long d(p1 p1Var, l0.j jVar, l0.j jVar2, int i12, androidx.compose.ui.graphics.colorspace.e eVar) {
        long jK2 = k(p1Var, jVar, i12, eVar);
        if (androidx.compose.ui.text.v0.d(jK2)) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        long jK3 = k(p1Var, jVar2, i12, eVar);
        if (androidx.compose.ui.text.v0.d(jK3)) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        int i13 = (int) (jK2 >> 32);
        int i14 = (int) (jK3 & 4294967295L);
        return androidx.compose.ui.text.w0.a(Math.min(i13, i13), Math.max(i14, i14));
    }

    public static final boolean e(androidx.compose.ui.text.o0 o0Var, int i12) {
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        int iD2 = g12.d(i12);
        if (i12 == o0Var.i(iD2) || i12 == g12.c(iD2, false)) {
            if (o0Var.j(i12) == o0Var.a(i12)) {
                return false;
            }
        } else if (o0Var.a(i12) == o0Var.a(i12 - 1)) {
            return false;
        }
        return true;
    }

    public static final long f(int i12, CharSequence charSequence) {
        int iCharCount = i12;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!m(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i12 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i12);
            if (!m(iCodePointAt)) {
                break;
            }
            i12 += Character.charCount(iCodePointAt);
        }
        return androidx.compose.ui.text.w0.a(iCharCount, i12);
    }

    public static final long g(PointF pointF) {
        float f12 = pointF.x;
        float f13 = pointF.y;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public static final int h(androidx.compose.ui.text.G g12, long j12, InterfaceC22544x2 interfaceC22544x2) {
        float fA2 = interfaceC22544x2 != null ? interfaceC22544x2.a() : 0.0f;
        int i12 = (int) (4294967295L & j12);
        int iE2 = g12.e(Float.intBitsToFloat(i12));
        if (Float.intBitsToFloat(i12) >= g12.f(iE2) - fA2 && Float.intBitsToFloat(i12) <= g12.b(iE2) + fA2) {
            int i13 = (int) (j12 >> 32);
            if (Float.intBitsToFloat(i13) >= (-fA2) && Float.intBitsToFloat(i13) <= g12.f41919d + fA2) {
                return iE2;
            }
        }
        return -1;
    }

    public static final int i(androidx.compose.ui.text.G g12, long j12, androidx.compose.ui.layout.A a12, InterfaceC22544x2 interfaceC22544x2) {
        long jM2;
        int iH2;
        if (a12 == null || (iH2 = h(g12, (jM2 = a12.M(j12)), interfaceC22544x2)) == -1) {
            return -1;
        }
        return g12.g(l0.g.b(1, jM2, (g12.b(iH2) + g12.f(iH2)) / 2.0f));
    }

    public static final long j(C20985q1 c20985q1, l0.j jVar, int i12, androidx.compose.ui.graphics.colorspace.e eVar) {
        androidx.compose.ui.text.o0 o0Var;
        Q2 q2D = c20985q1.d();
        androidx.compose.ui.text.G g12 = (q2D == null || (o0Var = q2D.f30513a) == null) ? null : o0Var.f42527b;
        androidx.compose.ui.layout.A aC2 = c20985q1.c();
        if (g12 == null || aC2 == null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        l0.g.f413384b.getClass();
        return g12.h(jVar.n(aC2.M(0L)), i12, eVar);
    }

    public static final long k(p1 p1Var, l0.j jVar, int i12, androidx.compose.ui.graphics.colorspace.e eVar) {
        androidx.compose.ui.text.o0 o0VarB = p1Var.b();
        androidx.compose.ui.text.G g12 = o0VarB != null ? o0VarB.f42527b : null;
        androidx.compose.ui.layout.A aC2 = p1Var.c();
        if (g12 == null || aC2 == null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        l0.g.f413384b.getClass();
        return g12.h(jVar.n(aC2.M(0L)), i12, eVar);
    }

    public static final boolean l(int i12) {
        int type = Character.getType(i12);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean m(int i12) {
        return Character.isWhitespace(i12) || i12 == 160;
    }

    public static final boolean n(int i12) {
        int type;
        return (!m(i12) || (type = Character.getType(i12)) == 14 || type == 13 || i12 == 10) ? false : true;
    }
}
