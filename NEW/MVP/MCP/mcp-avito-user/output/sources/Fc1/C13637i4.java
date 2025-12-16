package Fc1;

/* renamed from: Fc1.i4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13637i4 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f5578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5579m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13637i4(int i12, Y41.a aVar) {
        super(3);
        this.f5578l = aVar;
        this.f5579m = i12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            Z4.a(this.f5578l, a13, this.f5579m & 14);
        }
        return kotlin.G0.f406611a;
    }
}
