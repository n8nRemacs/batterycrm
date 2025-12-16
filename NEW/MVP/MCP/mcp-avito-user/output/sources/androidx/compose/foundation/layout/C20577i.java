package androidx.compose.foundation.layout;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/i;", "", "<init>", "()V", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20577i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20577i f28642a = new C20577i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final float[] f28643b = new float[UpdateStatusCode.DialogButton.CONFIRM];

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final float[] f28644c = new float[UpdateStatusCode.DialogButton.CONFIRM];

    /* compiled from: WindowInsetsConnection.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/i$a;", "", "packedValue", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    /* renamed from: androidx.compose.foundation.layout.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f28645a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f28645a == ((a) obj).f28645a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f28645a);
        }

        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("FlingResult(packedValue="), this.f28645a, ')');
        }
    }

    static {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f22 = 0.0f;
        float f23 = 0.0f;
        for (int i12 = 0; i12 < 100; i12++) {
            float f24 = i12 / 100;
            float f25 = 1.0f;
            while (true) {
                f12 = ((f25 - f22) / 2.0f) + f22;
                f13 = 1.0f - f12;
                f14 = f12 * 3.0f * f13;
                f15 = f12 * f12 * f12;
                float f26 = (((f12 * 0.35000002f) + (f13 * 0.175f)) * f14) + f15;
                if (Math.abs(f26 - f24) < 1.0E-5d) {
                    break;
                } else if (f26 > f24) {
                    f25 = f12;
                } else {
                    f22 = f12;
                }
            }
            float f27 = 0.5f;
            f28643b[i12] = (((f13 * 0.5f) + f12) * f14) + f15;
            float f28 = 1.0f;
            while (true) {
                f16 = ((f28 - f23) / 2.0f) + f23;
                f17 = 1.0f - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f29 = (((f17 * f27) + f16) * f18) + f19;
                if (Math.abs(f29 - f24) >= 1.0E-5d) {
                    if (f29 > f24) {
                        f28 = f16;
                    } else {
                        f23 = f16;
                    }
                    f27 = 0.5f;
                }
            }
            f28644c[i12] = (((f16 * 0.35000002f) + (f17 * 0.175f)) * f18) + f19;
        }
        f28644c[100] = 1.0f;
        f28643b[100] = 1.0f;
    }

    public static long a(float f12) {
        float fC2;
        float f13;
        float f14 = 100;
        int i12 = (int) (f14 * f12);
        if (i12 < 100) {
            float f15 = i12 / f14;
            int i13 = i12 + 1;
            float f16 = i13 / f14;
            float[] fArr = f28643b;
            float f17 = fArr[i12];
            f13 = (fArr[i13] - f17) / (f16 - f15);
            fC2 = androidx.appcompat.app.r.c(f12, f15, f13, f17);
        } else {
            fC2 = 1.0f;
            f13 = 0.0f;
        }
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(fC2) << 32);
    }
}
