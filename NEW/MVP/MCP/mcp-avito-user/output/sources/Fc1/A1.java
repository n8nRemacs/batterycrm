package Fc1;

/* loaded from: classes9.dex */
public final class A1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13615g0 f4803l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13602e5 f4804m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(C13615g0 c13615g0, C13602e5 c13602e5) {
        super(0);
        this.f4803l = c13615g0;
        this.f4804m = c13602e5;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        int i12 = C13615g0.f5512s;
        C13615g0 c13615g0 = this.f4803l;
        c13615g0.d().remove(this.f4804m);
        c13615g0.f5784b.a(c13615g0.d());
        InterfaceC13642j0 interfaceC13642j0 = c13615g0.f5792j;
        if (interfaceC13642j0 == null) {
            interfaceC13642j0 = null;
        }
        interfaceC13642j0.a(c13615g0);
        return kotlin.G0.f406611a;
    }
}
