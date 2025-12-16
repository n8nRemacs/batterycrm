package androidx.compose.ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.compose.ui.graphics.p1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/z0;", "Landroidx/compose/ui/graphics/d1;", "", "Landroidx/compose/ui/graphics/T;", "colors", "", "stops", "Ll0/g;", "start", "end", "Landroidx/compose/ui/graphics/p1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22322z0 extends d1 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<T> f40037d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Float> f40038e;

    /* renamed from: f, reason: collision with root package name */
    public final long f40039f;

    /* renamed from: g, reason: collision with root package name */
    public final long f40040g;

    /* renamed from: h, reason: collision with root package name */
    public final int f40041h;

    public C22322z0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22322z0(List list, List list2, long j12, long j13, int i12, int i13, C42822w c42822w) {
        int i14;
        List list3 = (i13 & 2) != 0 ? null : list2;
        if ((i13 & 16) != 0) {
            p1.f39721b.getClass();
            i14 = 0;
        } else {
            i14 = i12;
        }
        this(list, list3, j12, j13, i14, null);
    }

    @Override // androidx.compose.ui.graphics.d1
    @Y61.k
    public final Shader b(long j12) {
        long j13 = this.f40039f;
        int i12 = (int) (j13 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j12 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        int i13 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j12 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13);
        long j14 = this.f40040g;
        int i14 = (int) (j14 >> 32);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j12 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i14);
        int i15 = (int) (j14 & 4294967295L);
        if (Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY) {
            i15 = (int) (j12 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
        List<T> list = this.f40037d;
        List<Float> list2 = this.f40038e;
        C22321z.c(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), C22321z.a(list), C22321z.b(list2, list), A.a(this.f40041h));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22322z0)) {
            return false;
        }
        C22322z0 c22322z0 = (C22322z0) obj;
        return kotlin.jvm.internal.L.f(this.f40037d, c22322z0.f40037d) && kotlin.jvm.internal.L.f(this.f40038e, c22322z0.f40038e) && l0.g.d(this.f40039f, c22322z0.f40039f) && l0.g.d(this.f40040g, c22322z0.f40040g) && p1.a(this.f40041h, c22322z0.f40041h);
    }

    public final int hashCode() {
        int iHashCode = this.f40037d.hashCode() * 31;
        List<Float> list = this.f40038e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        g.a aVar = l0.g.f413384b;
        int iG2 = androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(iHashCode2, 31, this.f40039f), 31, this.f40040g);
        p1.a aVar2 = p1.f39721b;
        return Integer.hashCode(this.f40041h) + iG2;
    }

    @Y61.k
    public final String toString() {
        String str;
        long j12 = this.f40039f;
        String str2 = "";
        if (((((j12 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) l0.g.l(j12)) + ", ";
        } else {
            str = "";
        }
        long j13 = this.f40040g;
        if (((((j13 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) l0.g.l(j13)) + ", ";
        }
        return "LinearGradient(colors=" + this.f40037d + ", stops=" + this.f40038e + ", " + str + str2 + "tileMode=" + ((Object) p1.b(this.f40041h)) + ')';
    }

    public C22322z0(List list, List list2, long j12, long j13, int i12, C42822w c42822w) {
        this.f40037d = list;
        this.f40038e = list2;
        this.f40039f = j12;
        this.f40040g = j13;
        this.f40041h = i12;
    }
}
