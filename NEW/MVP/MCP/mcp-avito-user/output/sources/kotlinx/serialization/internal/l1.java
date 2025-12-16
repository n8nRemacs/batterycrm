package kotlinx.serialization.internal;

import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/l1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/D0;", "Lkotlinx/serialization/internal/J0;", "Lkotlin/C0;", "Lkotlinx/serialization/internal/k1;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class l1 extends J0<kotlin.C0, kotlin.D0, k1> implements KSerializer<kotlin.D0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final l1 f412888c = new l1();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1() {
        super(m1.f412893a);
        int i12 = kotlin.C0.f406602c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((kotlin.D0) obj).f406604b.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        k1 k1Var = (k1) obj;
        short sT2 = cVar.x(this.f412784b, i12).t();
        int i13 = kotlin.C0.f406602c;
        k1Var.b(k1Var.getF412880b() + 1);
        short[] sArr = k1Var.f412879a;
        int i14 = k1Var.f412880b;
        k1Var.f412880b = i14 + 1;
        sArr[i14] = sT2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new k1(((kotlin.D0) obj).f406604b, null);
    }

    @Override // kotlinx.serialization.internal.J0
    public final kotlin.D0 j() {
        return kotlin.D0.a(new short[0]);
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, kotlin.D0 d02, int i12) {
        short[] sArr = d02.f406604b;
        for (int i13 = 0; i13 < i12; i13++) {
            Encoder encoderX = dVar.x(this.f412784b, i13);
            short s5 = sArr[i13];
            int i14 = kotlin.C0.f406602c;
            encoderX.i(s5);
        }
    }
}
