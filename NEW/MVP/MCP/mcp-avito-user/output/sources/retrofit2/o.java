package retrofit2;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "L;", "it", "Lkotlin/G0;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
final class o extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47646b f430011l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC47646b interfaceC47646b) {
        super(1);
        this.f430011l = interfaceC47646b;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f430011l.cancel();
        return G0.f406611a;
    }
}
