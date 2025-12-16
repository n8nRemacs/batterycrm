package Fc1;

/* loaded from: classes9.dex */
public final class T6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogC13657k6 f5197l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(DialogC13657k6 dialogC13657k6) {
        super(2);
        this.f5197l = dialogC13657k6;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            I7.a(androidx.compose.runtime.internal.r.b(a13, 1789237091, new C13791z6(this.f5197l)), a13, 6);
        }
        return kotlin.G0.f406611a;
    }
}
