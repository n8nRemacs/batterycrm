package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.channels.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43114p extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f410966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43108m<Object> f410967m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.selects.r<?> f410968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43114p(Object obj, C43108m<Object> c43108m, kotlinx.coroutines.selects.r<?> rVar) {
        super(1);
        this.f410966l = obj;
        this.f410967m = c43108m;
        this.f410968n = rVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        kotlinx.coroutines.internal.a0 a0Var = C43122v.f411013l;
        Object obj = this.f410966l;
        if (obj != a0Var) {
            kotlinx.coroutines.internal.Q.b(this.f410967m.f410944c, obj, this.f410968n.getF412215b());
        }
        return kotlin.G0.f406611a;
    }
}
