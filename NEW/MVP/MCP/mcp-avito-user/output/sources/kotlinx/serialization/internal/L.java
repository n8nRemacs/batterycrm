package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/L;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/K;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class L extends J0<Float, float[], K> implements KSerializer<float[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final L f412787c = new L();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L() {
        super(M.f412790a);
        int i12 = kotlin.jvm.internal.A.f406820a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        K k12 = (K) obj;
        float fK2 = cVar.k(this.f412784b, i12);
        k12.b(k12.getF412816b() + 1);
        float[] fArr = k12.f412785a;
        int i13 = k12.f412786b;
        k12.f412786b = i13 + 1;
        fArr[i13] = fK2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        K k12 = new K();
        k12.f412785a = fArr;
        k12.f412786b = fArr.length;
        k12.b(10);
        return k12;
    }

    @Override // kotlinx.serialization.internal.J0
    public final float[] j() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, float[] fArr, int i12) {
        float[] fArr2 = fArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.s(this.f412784b, i13, fArr2[i13]);
        }
    }
}
