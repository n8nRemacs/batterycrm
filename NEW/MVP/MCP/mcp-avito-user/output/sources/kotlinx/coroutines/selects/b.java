package kotlinx.coroutines.selects;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43131e0;

/* compiled from: OnTimeout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class b extends H implements Y41.q<c, r<?>, Object, G0> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f412200b = new b();

    public b() {
        super(3, c.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.q
    public final G0 invoke(c cVar, r<?> rVar, Object obj) {
        c cVar2 = cVar;
        r<?> rVar2 = rVar;
        long j12 = cVar2.f412201a;
        if (j12 <= 0) {
            rVar2.d(G0.f406611a);
        } else {
            RunnableC43301a runnableC43301a = new RunnableC43301a(rVar2, cVar2);
            CoroutineContext f412215b = rVar2.getF412215b();
            rVar2.b(C43131e0.d(f412215b).g(j12, runnableC43301a, f412215b));
        }
        return G0.f406611a;
    }
}
