package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/g;", "Lkotlinx/serialization/internal/H0;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43403g extends H0<boolean[]> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public boolean[] f412857a;

    /* renamed from: b, reason: collision with root package name */
    public int f412858b;

    @Override // kotlinx.serialization.internal.H0
    public final boolean[] a() {
        return Arrays.copyOf(this.f412857a, this.f412858b);
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        boolean[] zArr = this.f412857a;
        if (zArr.length < i12) {
            int length = zArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412857a = Arrays.copyOf(zArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412858b() {
        return this.f412858b;
    }
}
