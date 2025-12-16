package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/K;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class K extends H0<float[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public float[] f412785a;

    /* renamed from: b, reason: collision with root package name */
    public int f412786b;

    @Override // kotlinx.serialization.internal.H0
    public final float[] a() {
        return Arrays.copyOf(this.f412785a, this.f412786b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        float[] fArr = this.f412785a;
        if (fArr.length < i12) {
            int length = fArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412785a = Arrays.copyOf(fArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412786b() {
        return this.f412786b;
    }
}
