package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/T0;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/S0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class T0 extends J0<Short, short[], S0> implements KSerializer<short[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final T0 f412818c = new T0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0() {
        super(U0.f412820a);
        int i12 = kotlin.jvm.internal.q0.f406848a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        S0 s02 = (S0) obj;
        short sF2 = cVar.F(this.f412784b, i12);
        s02.b(s02.getF412816b() + 1);
        short[] sArr = s02.f412815a;
        int i13 = s02.f412816b;
        s02.f412816b = i13 + 1;
        sArr[i13] = sF2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        S0 s02 = new S0();
        s02.f412815a = sArr;
        s02.f412816b = sArr.length;
        s02.b(10);
        return s02;
    }

    @Override // kotlinx.serialization.internal.J0
    public final short[] j() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, short[] sArr, int i12) {
        short[] sArr2 = sArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.n(this.f412784b, i13, sArr2[i13]);
        }
    }
}
