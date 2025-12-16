package Fc1;

/* loaded from: classes9.dex */
public final class V3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A4 f5262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(A4 a42) {
        super(0);
        this.f5262l = a42;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        A4 a42 = this.f5262l;
        a42.cancel();
        A1 a12 = a42.f4807i;
        if (a12 == null) {
            return null;
        }
        a12.invoke();
        return kotlin.G0.f406611a;
    }
}
