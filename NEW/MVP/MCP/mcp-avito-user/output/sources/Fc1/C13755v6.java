package Fc1;

/* renamed from: Fc1.v6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13755v6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogC13630h6 f5863l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13755v6(DialogC13630h6 dialogC13630h6) {
        super(2);
        this.f5863l = dialogC13630h6;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f5863l.f(a13, 8);
        }
        return kotlin.G0.f406611a;
    }
}
