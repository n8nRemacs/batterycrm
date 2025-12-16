package Fc1;

/* renamed from: Fc1.p4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13700p4 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f5752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13700p4(int i12, Y41.l lVar) {
        super(3);
        this.f5752l = lVar;
        this.f5753m = i12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            J6.a(a13, 0);
            J1.a(this.f5752l, a13, this.f5753m & 14);
            C13726s4.a(a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
