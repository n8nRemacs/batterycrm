package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/X;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/W;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class X extends J0<Integer, int[], W> implements KSerializer<int[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final X f412826c = new X();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X() {
        super(Y.f412835a);
        int i12 = kotlin.jvm.internal.J.f406821a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        W w12 = (W) obj;
        int iQ2 = cVar.q(this.f412784b, i12);
        w12.b(w12.getF412825b() + 1);
        int[] iArr = w12.f412824a;
        int i13 = w12.f412825b;
        w12.f412825b = i13 + 1;
        iArr[i13] = iQ2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        W w12 = new W();
        w12.f412824a = iArr;
        w12.f412825b = iArr.length;
        w12.b(10);
        return w12;
    }

    @Override // kotlinx.serialization.internal.J0
    public final int[] j() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, int[] iArr, int i12) {
        int[] iArr2 = iArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.D(i13, iArr2[i13], this.f412784b);
        }
    }
}
