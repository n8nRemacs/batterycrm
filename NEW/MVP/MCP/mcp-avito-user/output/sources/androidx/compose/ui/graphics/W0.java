package androidx.compose.ui.graphics;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.compose.ui.graphics.p1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/W0;", "Landroidx/compose/ui/graphics/d1;", "", "Landroidx/compose/ui/graphics/T;", "colors", "", "stops", "Ll0/g;", "center", "radius", "Landroidx/compose/ui/graphics/p1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W0 extends d1 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<T> f39339d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Float> f39340e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39341f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39342g;

    /* renamed from: h, reason: collision with root package name */
    public final int f39343h;

    public W0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W0(List list, List list2, long j12, float f12, int i12, int i13, C42822w c42822w) {
        int i14;
        List list3 = (i13 & 2) != 0 ? null : list2;
        if ((i13 & 16) != 0) {
            p1.f39721b.getClass();
            i14 = 0;
        } else {
            i14 = i12;
        }
        this(list, list3, j12, f12, i14, null);
    }

    @Override // androidx.compose.ui.graphics.d1
    @Y61.k
    public final Shader b(long j12) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j13 = this.f39341f;
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            long jB2 = l0.o.b(j12);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jB2 >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        } else {
            int i12 = (int) (j13 >> 32);
            if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
                i12 = (int) (j12 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i12);
            int i13 = (int) (j13 & 4294967295L);
            if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
                i13 = (int) (j12 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i13);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        float fD2 = this.f39342g;
        if (fD2 == Float.POSITIVE_INFINITY) {
            fD2 = l0.n.d(j12) / 2;
        }
        float f12 = fD2;
        List<T> list = this.f39339d;
        List<Float> list2 = this.f39340e;
        C22321z.c(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f12, C22321z.a(list), C22321z.b(list2, list), A.a(this.f39343h));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return kotlin.jvm.internal.L.f(this.f39339d, w02.f39339d) && kotlin.jvm.internal.L.f(this.f39340e, w02.f39340e) && l0.g.d(this.f39341f, w02.f39341f) && this.f39342g == w02.f39342g && p1.a(this.f39343h, w02.f39343h);
    }

    public final int hashCode() {
        int iHashCode = this.f39339d.hashCode() * 31;
        List<Float> list = this.f39340e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        g.a aVar = l0.g.f413384b;
        int iD2 = androidx.appcompat.app.r.d(this.f39342g, androidx.appcompat.app.r.g(iHashCode2, 31, this.f39341f), 31);
        p1.a aVar2 = p1.f39721b;
        return Integer.hashCode(this.f39343h) + iD2;
    }

    @Y61.k
    public final String toString() {
        String str;
        long j12 = this.f39341f;
        String str2 = "";
        if ((9223372034707292159L & j12) != 9205357640488583168L) {
            str = "center=" + ((Object) l0.g.l(j12)) + ", ";
        } else {
            str = "";
        }
        float f12 = this.f39342g;
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f12 + ", ";
        }
        return "RadialGradient(colors=" + this.f39339d + ", stops=" + this.f39340e + ", " + str + str2 + "tileMode=" + ((Object) p1.b(this.f39343h)) + ')';
    }

    public W0(List list, List list2, long j12, float f12, int i12, C42822w c42822w) {
        this.f39339d = list;
        this.f39340e = list2;
        this.f39341f = j12;
        this.f39342g = f12;
        this.f39343h = i12;
    }
}
