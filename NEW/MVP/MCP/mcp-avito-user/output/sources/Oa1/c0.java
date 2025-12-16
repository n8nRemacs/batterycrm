package Oa1;

/* loaded from: classes9.dex */
public final class c0 extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Throwable f12355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Throwable th2) {
        super(0);
        this.f12355l = th2;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Http request was failed with: " + this.f12355l;
    }
}
