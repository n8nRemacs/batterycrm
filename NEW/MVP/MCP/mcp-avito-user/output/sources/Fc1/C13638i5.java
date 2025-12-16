package Fc1;

/* renamed from: Fc1.i5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13638i5 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C13623h, kotlin.G0> f5580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13638i5(int i12, Y41.l lVar) {
        super(3);
        this.f5580l = lVar;
        this.f5581m = i12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            J6.a(a13, 0);
            K6.a(this.f5580l, a13, this.f5581m & 14);
            C13726s4.a(a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
