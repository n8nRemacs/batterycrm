package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/D;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class D extends H0<double[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public double[] f412760a;

    /* renamed from: b, reason: collision with root package name */
    public int f412761b;

    @Override // kotlinx.serialization.internal.H0
    public final double[] a() {
        return Arrays.copyOf(this.f412760a, this.f412761b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        double[] dArr = this.f412760a;
        if (dArr.length < i12) {
            int length = dArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412760a = Arrays.copyOf(dArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412761b() {
        return this.f412761b;
    }
}
