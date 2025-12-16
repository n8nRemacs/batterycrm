package kotlinx.serialization.internal;

import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/f1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/t0;", "Lkotlinx/serialization/internal/J0;", "Lkotlin/s0;", "Lkotlinx/serialization/internal/e1;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class f1 extends J0<kotlin.s0, kotlin.t0, e1> implements KSerializer<kotlin.t0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final f1 f412856c = new f1();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1() {
        super(g1.f412860a);
        int i12 = kotlin.s0.f410475c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((kotlin.t0) obj).f410567b.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        e1 e1Var = (e1) obj;
        int iZ2 = cVar.x(this.f412784b, i12).z();
        int i13 = kotlin.s0.f410475c;
        e1Var.b(e1Var.getF412880b() + 1);
        int[] iArr = e1Var.f412853a;
        int i14 = e1Var.f412854b;
        e1Var.f412854b = i14 + 1;
        iArr[i14] = iZ2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new e1(((kotlin.t0) obj).f410567b, null);
    }

    @Override // kotlinx.serialization.internal.J0
    public final kotlin.t0 j() {
        return kotlin.t0.a(new int[0]);
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, kotlin.t0 t0Var, int i12) {
        int[] iArr = t0Var.f410567b;
        for (int i13 = 0; i13 < i12; i13++) {
            Encoder encoderX = dVar.x(this.f412784b, i13);
            int i14 = iArr[i13];
            int i15 = kotlin.s0.f410475c;
            encoderX.m(i14);
        }
    }
}
