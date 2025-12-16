package kotlinx.serialization.internal;

import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/c1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/p0;", "Lkotlinx/serialization/internal/J0;", "Lkotlin/o0;", "Lkotlinx/serialization/internal/b1;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class c1 extends J0<kotlin.o0, kotlin.p0, b1> implements KSerializer<kotlin.p0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c1 f412849c = new c1();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1() {
        super(d1.f412850a);
        int i12 = kotlin.o0.f406874c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((kotlin.p0) obj).f406876b.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        b1 b1Var = (b1) obj;
        byte bN2 = cVar.x(this.f412784b, i12).n();
        int i13 = kotlin.o0.f406874c;
        b1Var.b(b1Var.getF412880b() + 1);
        byte[] bArr = b1Var.f412845a;
        int i14 = b1Var.f412846b;
        b1Var.f412846b = i14 + 1;
        bArr[i14] = bN2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new b1(((kotlin.p0) obj).f406876b, null);
    }

    @Override // kotlinx.serialization.internal.J0
    public final kotlin.p0 j() {
        return kotlin.p0.a(new byte[0]);
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, kotlin.p0 p0Var, int i12) {
        byte[] bArr = p0Var.f406876b;
        for (int i13 = 0; i13 < i12; i13++) {
            Encoder encoderX = dVar.x(this.f412784b, i13);
            byte b12 = bArr[i13];
            int i14 = kotlin.o0.f406874c;
            encoderX.w(b12);
        }
    }
}
