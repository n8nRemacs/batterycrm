package Fc1;

/* loaded from: classes9.dex */
public final class T0 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, kotlin.G0> f5186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5187m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(int i12, Y41.l lVar) {
        super(3);
        this.f5186l = lVar;
        this.f5187m = i12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            J6.a(a13, 0);
            L6.a(this.f5186l, a13, this.f5187m & 14);
            C13726s4.a(a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
