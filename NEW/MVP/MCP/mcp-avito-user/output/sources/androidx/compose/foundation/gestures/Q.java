package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C20438c;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/Q;", "T", "Landroidx/compose/foundation/gestures/T0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q<T> implements T0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f27434a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final float[] f27435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27436c;

    public Q(@Y61.k List<? extends T> list, @Y61.k float[] fArr) {
        this.f27434a = list;
        this.f27435b = fArr;
        list.size();
        this.f27436c = fArr.length;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.T0
    @Y61.l
    public final T a(float f12) {
        float[] fArr = this.f27435b;
        int length = fArr.length;
        int i12 = -1;
        float f13 = Float.POSITIVE_INFINITY;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = i14 + 1;
            float fAbs = Math.abs(f12 - fArr[i13]);
            if (fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            i13++;
            i14 = i15;
        }
        return (T) this.f27434a.get(i12);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.T0
    @Y61.l
    public final T b(float f12, boolean z12) {
        float[] fArr = this.f27435b;
        int length = fArr.length;
        int i12 = -1;
        int i13 = 0;
        float f13 = Float.POSITIVE_INFINITY;
        int i14 = 0;
        while (i13 < length) {
            float f14 = fArr[i13];
            int i15 = i14 + 1;
            float f15 = z12 ? f14 - f12 : f12 - f14;
            if (f15 < 0.0f) {
                f15 = Float.POSITIVE_INFINITY;
            }
            if (f15 <= f13) {
                i12 = i14;
                f13 = f15;
            }
            i13++;
            i14 = i15;
        }
        return (T) this.f27434a.get(i12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.T0
    public final float c(T t12) {
        int iIndexOf = this.f27434a.indexOf(t12);
        Y41.l<Integer, Float> lVar = C20438c.f27582b;
        if (iIndexOf >= 0) {
            float[] fArr = this.f27435b;
            if (iIndexOf <= fArr.length - 1) {
                return fArr[iIndexOf];
            }
        }
        ((C20438c.b) lVar).invoke(Integer.valueOf(iIndexOf));
        return Float.valueOf(Float.NaN).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.T0
    public final float d() {
        Float fValueOf;
        float[] fArr = this.f27435b;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMax = fArr[0];
            int i12 = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i12]);
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            fValueOf = Float.valueOf(fMax);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.T0
    public final float e() {
        Float fValueOf;
        float[] fArr = this.f27435b;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMin = fArr[0];
            int i12 = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i12]);
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            fValueOf = Float.valueOf(fMin);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q12 = (Q) obj;
        return kotlin.jvm.internal.L.f(this.f27434a, q12.f27434a) && Arrays.equals(this.f27435b, q12.f27435b) && this.f27436c == q12.f27436c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.T0
    public final boolean f(T t12) {
        return this.f27434a.indexOf(t12) != -1;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f27435b) + (this.f27434a.hashCode() * 31)) * 31) + this.f27436c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r7.f27436c
            if (r1 >= r2) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r4 = r7.f27434a
            java.lang.Object r4 = kotlin.collections.C42745f0.K(r1, r4)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            Y41.l<java.lang.Integer, java.lang.Float> r4 = androidx.compose.foundation.gestures.C20438c.f27582b
            if (r1 < 0) goto L2d
            float[] r5 = r7.f27435b
            int r6 = r5.length
            int r6 = r6 + (-1)
            if (r1 > r6) goto L2d
            r4 = r5[r1]
            goto L38
        L2d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            androidx.compose.foundation.gestures.c$b r4 = (androidx.compose.foundation.gestures.C20438c.b) r4
            r4.invoke(r5)
            r4 = 2143289344(0x7fc00000, float:NaN)
        L38:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L4b
            java.lang.String r2 = ", "
            r0.append(r2)
        L4b:
            int r1 = r1 + 1
            goto L8
        L4e:
            java.lang.String r1 = "})"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.Q.toString():java.lang.String");
    }
}
