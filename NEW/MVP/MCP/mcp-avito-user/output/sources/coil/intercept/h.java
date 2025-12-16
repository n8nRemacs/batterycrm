package coil.intercept;

import Y41.p;
import Y61.l;
import coil.intercept.a;
import coil.request.t;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: EngineInterceptor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/intercept/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/intercept/a$b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {246}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes10.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super a.b>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ coil.f f58481A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ coil.request.p f58482B;

    /* renamed from: q, reason: collision with root package name */
    public List f58483q;

    /* renamed from: r, reason: collision with root package name */
    public t f58484r;

    /* renamed from: s, reason: collision with root package name */
    public int f58485s;

    /* renamed from: t, reason: collision with root package name */
    public int f58486t;

    /* renamed from: u, reason: collision with root package name */
    public int f58487u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f58488v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f58489w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a.b f58490x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f58491y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List<L2.c> f58492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(a aVar, a.b bVar, t tVar, List<? extends L2.c> list, coil.f fVar, coil.request.p pVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f58489w = aVar;
        this.f58490x = bVar;
        this.f58491y = tVar;
        this.f58492z = list;
        this.f58481A = fVar;
        this.f58482B = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f58489w, this.f58490x, this.f58491y, this.f58492z, this.f58481A, this.f58482B, continuation);
        hVar.f58488v = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.b> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f7 -> B:30:0x00fa). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
