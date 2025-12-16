package kotlinx.serialization.internal;

import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: PrimitiveArraysSerializers.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/i1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/x0;", "Lkotlinx/serialization/internal/J0;", "Lkotlin/w0;", "Lkotlinx/serialization/internal/h1;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
@kotlin.X
/* loaded from: classes8.dex */
public final class i1 extends J0<kotlin.w0, kotlin.x0, h1> implements KSerializer<kotlin.x0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final i1 f412870c = new i1();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1() {
        super(j1.f412874a);
        int i12 = kotlin.w0.f410662c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((kotlin.x0) obj).f410664b.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        h1 h1Var = (h1) obj;
        long jR2 = cVar.x(this.f412784b, i12).r();
        int i13 = kotlin.w0.f410662c;
        h1Var.b(h1Var.getF412865b() + 1);
        long[] jArr = h1Var.f412864a;
        int i14 = h1Var.f412865b;
        h1Var.f412865b = i14 + 1;
        jArr[i14] = jR2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new h1(((kotlin.x0) obj).f410664b, null);
    }

    @Override // kotlinx.serialization.internal.J0
    public final kotlin.x0 j() {
        return kotlin.x0.a(new long[0]);
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, kotlin.x0 x0Var, int i12) {
        long[] jArr = x0Var.f410664b;
        for (int i13 = 0; i13 < i12; i13++) {
            Encoder encoderX = dVar.x(this.f412784b, i13);
            long j12 = jArr[i13];
            int i14 = kotlin.w0.f410662c;
            encoderX.r(j12);
        }
    }
}
