package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43387f;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/h1;", "Lkotlinx/serialization/internal/H0;", "Lkotlin/x0;", "bufferWithData", "<init>", "([JLkotlin/jvm/internal/w;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class h1 extends H0<kotlin.x0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public long[] f412864a;

    /* renamed from: b, reason: collision with root package name */
    public int f412865b;

    public h1(long[] jArr, C42822w c42822w) {
        this.f412864a = jArr;
        this.f412865b = jArr.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.H0
    public final kotlin.x0 a() {
        return kotlin.x0.a(Arrays.copyOf(this.f412864a, this.f412865b));
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        long[] jArr = this.f412864a;
        if (jArr.length < i12) {
            int length = jArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412864a = Arrays.copyOf(jArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412880b() {
        return this.f412865b;
    }
}
