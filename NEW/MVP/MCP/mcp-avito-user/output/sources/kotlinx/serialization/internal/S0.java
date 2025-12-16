package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/S0;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class S0 extends H0<short[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public short[] f412815a;

    /* renamed from: b, reason: collision with root package name */
    public int f412816b;

    @Override // kotlinx.serialization.internal.H0
    public final short[] a() {
        return Arrays.copyOf(this.f412815a, this.f412816b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        short[] sArr = this.f412815a;
        if (sArr.length < i12) {
            int length = sArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412815a = Arrays.copyOf(sArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412816b() {
        return this.f412816b;
    }
}
