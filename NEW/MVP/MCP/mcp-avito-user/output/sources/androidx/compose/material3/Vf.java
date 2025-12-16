package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/Vf;", "", "a", "packedValue", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class Vf {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f35682b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f35683c = Tf.e(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f35684a;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Vf$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final float a(long j12) {
        if (j12 == f35683c) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        int i12 = kotlin.jvm.internal.A.f406820a;
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    public static final float b(long j12) {
        if (j12 == f35683c) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        int i12 = kotlin.jvm.internal.A.f406820a;
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Vf) {
            return this.f35684a == ((Vf) obj).f35684a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35684a);
    }

    @Y61.k
    public final String toString() {
        float f12 = Tf.f35500b;
        f35682b.getClass();
        long j12 = f35683c;
        long j13 = this.f35684a;
        if (j13 == j12) {
            return "FloatRange.Unspecified";
        }
        return b(j13) + ".." + a(j13);
    }
}
