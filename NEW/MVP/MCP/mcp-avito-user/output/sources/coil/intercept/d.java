package coil.intercept;

import Y41.p;
import Y61.l;
import coil.fetch.m;
import coil.intercept.a;
import coil.request.t;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.T;

/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/intercept/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/intercept/a$b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super a.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58449q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f58450r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.h<coil.fetch.g> f58451s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.h<coil.e> f58452t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ coil.request.p f58453u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f58454v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0.h<t> f58455w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ coil.f f58456x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, l0.h<coil.fetch.g> hVar, l0.h<coil.e> hVar2, coil.request.p pVar, Object obj, l0.h<t> hVar3, coil.f fVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f58450r = aVar;
        this.f58451s = hVar;
        this.f58452t = hVar2;
        this.f58453u = pVar;
        this.f58454v = obj;
        this.f58455w = hVar3;
        this.f58456x = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f58450r, this.f58451s, this.f58452t, this.f58453u, this.f58454v, this.f58455w, this.f58456x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.b> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58449q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m mVar = (m) this.f58451s.f406842b;
            coil.e eVar = this.f58452t.f406842b;
            t tVar = this.f58455w.f406842b;
            this.f58449q = 1;
            obj = a.b(this.f58450r, mVar, eVar, this.f58453u, this.f58454v, tVar, this.f58456x, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
