package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42823x;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/E;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/D;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class E extends J0<Double, double[], D> implements KSerializer<double[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final E f412763c = new E();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E() {
        super(F.f412769a);
        int i12 = C42823x.f406860a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        D d12 = (D) obj;
        double dL2 = cVar.l(this.f412784b, i12);
        d12.b(d12.getF412786b() + 1);
        double[] dArr = d12.f412760a;
        int i13 = d12.f412761b;
        d12.f412761b = i13 + 1;
        dArr[i13] = dL2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        D d12 = new D();
        d12.f412760a = dArr;
        d12.f412761b = dArr.length;
        d12.b(10);
        return d12;
    }

    @Override // kotlinx.serialization.internal.J0
    public final double[] j() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, double[] dArr, int i12) {
        double[] dArr2 = dArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.G(this.f412784b, i13, dArr2[i13]);
        }
    }
}
