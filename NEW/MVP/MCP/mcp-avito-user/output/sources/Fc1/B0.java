package Fc1;

/* loaded from: classes9.dex */
public final class B0 extends kotlin.jvm.internal.N implements Y41.l<C13602e5, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13615g0 f4817l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C13615g0 c13615g0) {
        super(1);
        this.f4817l = c13615g0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C13602e5 c13602e5) {
        int i12 = C13615g0.f5512s;
        C13615g0 c13615g0 = this.f4817l;
        c13615g0.d().add(c13602e5);
        c13615g0.f5784b.a(c13615g0.d());
        InterfaceC13642j0 interfaceC13642j0 = c13615g0.f5792j;
        if (interfaceC13642j0 == null) {
            interfaceC13642j0 = null;
        }
        interfaceC13642j0.a(c13615g0);
        return kotlin.G0.f406611a;
    }
}
