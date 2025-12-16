package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43387f;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/b1;", "Lkotlinx/serialization/internal/H0;", "Lkotlin/p0;", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/w;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class b1 extends H0<kotlin.p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public byte[] f412845a;

    /* renamed from: b, reason: collision with root package name */
    public int f412846b;

    public b1(byte[] bArr, C42822w c42822w) {
        this.f412845a = bArr;
        this.f412846b = bArr.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.H0
    public final kotlin.p0 a() {
        return kotlin.p0.a(Arrays.copyOf(this.f412845a, this.f412846b));
    }

    @Override // kotlinx.serialization.internal.H0
    public final void b(int i12) {
        byte[] bArr = this.f412845a;
        if (bArr.length < i12) {
            int length = bArr.length * 2;
            if (i12 < length) {
                i12 = length;
            }
            this.f412845a = Arrays.copyOf(bArr, i12);
        }
    }

    @Override // kotlinx.serialization.internal.H0
    /* renamed from: d, reason: from getter */
    public final int getF412854b() {
        return this.f412846b;
    }
}
