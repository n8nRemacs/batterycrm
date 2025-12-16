package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/o1;", "Landroidx/compose/ui/graphics/d1;", "Ll0/g;", "center", "", "Landroidx/compose/ui/graphics/T;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o1 extends d1 {

    /* renamed from: d, reason: collision with root package name */
    public final long f39713d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<T> f39714e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<Float> f39715f;

    public o1() {
        throw null;
    }

    public /* synthetic */ o1(long j12, List list, List list2, int i12, C42822w c42822w) {
        this(j12, list, (i12 & 4) != 0 ? null : list2, null);
    }

    @Override // androidx.compose.ui.graphics.d1
    @Y61.k
    public final Shader b(long j12) {
        long jFloatToRawIntBits;
        long j13 = this.f39713d;
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            jFloatToRawIntBits = l0.o.b(j12);
        } else {
            int i12 = (int) (j13 >> 32);
            if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
                i12 = (int) (j12 >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i12);
            int i13 = (int) (j13 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j12 & 4294967295L)) : Float.intBitsToFloat(i13);
            jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            g.a aVar = l0.g.f413384b;
        }
        List<T> list = this.f39714e;
        List<Float> list2 = this.f39715f;
        C22321z.c(list, list2);
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), C22321z.a(list), C22321z.b(list2, list));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return l0.g.d(this.f39713d, o1Var.f39713d) && kotlin.jvm.internal.L.f(this.f39714e, o1Var.f39714e) && kotlin.jvm.internal.L.f(this.f39715f, o1Var.f39715f);
    }

    public final int hashCode() {
        g.a aVar = l0.g.f413384b;
        int iE2 = androidx.compose.foundation.H.e(Long.hashCode(this.f39713d) * 31, 31, this.f39714e);
        List<Float> list = this.f39715f;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        String str;
        long j12 = this.f39713d;
        if ((9223372034707292159L & j12) != 9205357640488583168L) {
            str = "center=" + ((Object) l0.g.l(j12)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbA = androidx.appcompat.app.r.A("SweepGradient(", str, "colors=");
        sbA.append(this.f39714e);
        sbA.append(", stops=");
        return androidx.compose.foundation.H.p(sbA, this.f39715f, ')');
    }

    public o1(long j12, List list, List list2, C42822w c42822w) {
        this.f39713d = j12;
        this.f39714e = list;
        this.f39715f = list2;
    }
}
