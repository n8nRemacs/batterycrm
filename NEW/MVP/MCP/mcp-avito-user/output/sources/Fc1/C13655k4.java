package Fc1;

/* renamed from: Fc1.k4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13655k4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A4 f5627l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13655k4(A4 a42) {
        super(2);
        this.f5627l = a42;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            A4.r(this.f5627l, a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
