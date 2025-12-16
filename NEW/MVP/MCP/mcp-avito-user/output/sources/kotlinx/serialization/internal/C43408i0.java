package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/i0;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43408i0 extends H0<long[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public long[] f412868a;

    /* renamed from: b, reason: collision with root package name */
    public int f412869b;

    @Override // kotlinx.serialization.internal.H0
    public final long[] a() {
        return Arrays.copyOf(this.f412868a, this.f412869b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        long[] jArr = this.f412868a;
        if (jArr.length < i12) {
            int length = jArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412868a = Arrays.copyOf(jArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412872b() {
        return this.f412869b;
    }
}
