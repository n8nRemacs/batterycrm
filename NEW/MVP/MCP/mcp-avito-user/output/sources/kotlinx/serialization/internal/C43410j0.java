package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/j0;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/i0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43410j0 extends J0<Long, long[], C43408i0> implements KSerializer<long[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43410j0 f412873c = new C43410j0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43410j0() {
        super(C43412k0.f412877a);
        int i12 = kotlin.jvm.internal.Q.f406822a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        C43408i0 c43408i0 = (C43408i0) obj;
        long jP2 = cVar.p(this.f412784b, i12);
        c43408i0.b(c43408i0.getF412869b() + 1);
        long[] jArr = c43408i0.f412868a;
        int i13 = c43408i0.f412869b;
        c43408i0.f412869b = i13 + 1;
        jArr[i13] = jP2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        C43408i0 c43408i0 = new C43408i0();
        c43408i0.f412868a = jArr;
        c43408i0.f412869b = jArr.length;
        c43408i0.b(10);
        return c43408i0;
    }

    @Override // kotlinx.serialization.internal.J0
    public final long[] j() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, long[] jArr, int i12) {
        long[] jArr2 = jArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.o(this.f412784b, i13, jArr2[i13]);
        }
    }
}
