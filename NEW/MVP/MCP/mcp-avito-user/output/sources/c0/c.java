package C0;

import Y61.k;
import Y61.l;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontScaleConverterTable.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LC0/c;", "LC0/a;", "a", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class c implements C0.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f1855c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final float[] f1856a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final float[] f1857b;

    /* compiled from: FontScaleConverterTable.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC0/c$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final float a(a aVar, float f12, float[] fArr, float[] fArr2) {
            float f13;
            float f14;
            float f15;
            float f16;
            float fMax;
            aVar.getClass();
            float fAbs = Math.abs(f12);
            float fSignum = Math.signum(f12);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fMax = fSignum * fArr2[iBinarySearch];
            } else {
                int i12 = -(iBinarySearch + 1);
                int i13 = i12 - 1;
                if (i13 >= fArr.length - 1) {
                    float f17 = fArr[fArr.length - 1];
                    float f18 = fArr2[fArr.length - 1];
                    if (f17 == 0.0f) {
                        return 0.0f;
                    }
                    return (f18 / f17) * f12;
                }
                if (i13 == -1) {
                    float f19 = fArr[0];
                    f15 = fArr2[0];
                    f16 = f19;
                    f14 = 0.0f;
                    f13 = 0.0f;
                } else {
                    float f22 = fArr[i13];
                    float f23 = fArr[i12];
                    f13 = fArr2[i13];
                    f14 = f22;
                    f15 = fArr2[i12];
                    f16 = f23;
                }
                d.f1858a.getClass();
                fMax = fSignum * (((f15 - f13) * Math.max(0.0f, Math.min(1.0f, f14 == f16 ? 0.0f : (fAbs - f14) / (f16 - f14)))) + f13);
            }
            return fMax;
        }

        public a() {
        }
    }

    @RestrictTo
    public c(@k float[] fArr, @k float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f1856a = fArr;
        this.f1857b = fArr2;
    }

    @Override // C0.a
    public final float a(float f12) {
        return a.a(f1855c, f12, this.f1856a, this.f1857b);
    }

    @Override // C0.a
    public final float b(float f12) {
        return a.a(f1855c, f12, this.f1857b, this.f1856a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f1856a, cVar.f1856a) && Arrays.equals(this.f1857b, cVar.f1857b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1857b) + (Arrays.hashCode(this.f1856a) * 31);
    }

    @k
    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.f1856a) + ", toDpValues=" + Arrays.toString(this.f1857b) + '}';
    }
}
