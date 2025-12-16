package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/W;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class W extends H0<int[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public int[] f412824a;

    /* renamed from: b, reason: collision with root package name */
    public int f412825b;

    @Override // kotlinx.serialization.internal.H0
    public final int[] a() {
        return Arrays.copyOf(this.f412824a, this.f412825b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        int[] iArr = this.f412824a;
        if (iArr.length < i12) {
            int length = iArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412824a = Arrays.copyOf(iArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412858b() {
        return this.f412825b;
    }
}
