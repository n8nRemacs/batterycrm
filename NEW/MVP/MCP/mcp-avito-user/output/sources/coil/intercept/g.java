package coil.intercept;

import Y41.p;
import Y61.l;
import coil.memory.MemoryCache;
import coil.request.t;
import coil.request.x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: EngineInterceptor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/x;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/x;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super x>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58473q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f58474r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ coil.request.p f58475s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f58476t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f58477u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ coil.f f58478v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MemoryCache.Key f58479w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f58480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, coil.request.p pVar, Object obj, t tVar, coil.f fVar, MemoryCache.Key key, k kVar, Continuation continuation) {
        super(2, continuation);
        this.f58474r = aVar;
        this.f58475s = pVar;
        this.f58476t = obj;
        this.f58477u = tVar;
        this.f58478v = fVar;
        this.f58479w = key;
        this.f58480x = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f58474r, this.f58475s, this.f58476t, this.f58477u, this.f58478v, this.f58479w, this.f58480x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super x> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
