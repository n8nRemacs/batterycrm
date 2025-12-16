package com.avito.android.comparison.mvi;

import Rq.InterfaceC15071a;
import Rq.b;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.Y5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "it", "Lkotlinx/coroutines/flow/i;", "LRq/b$c;", "<anonymous>", "(Lio/reactivex/rxjava3/core/z;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$2", f = "ComparisonActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<io.reactivex.rxjava3.core.z<TypedResult<ComparisonResponse>>, Continuation<? super InterfaceC43160i<? extends b.c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f124125q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f124126r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15071a f124127s;

    /* compiled from: ComparisonActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "response", "LSq/j;", "apply", "(Lcom/avito/android/comparison/remote/model/ComparisonResponse;)LSq/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f124128b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15071a f124129c;

        public a(m mVar, InterfaceC15071a interfaceC15071a) {
            this.f124128b = mVar;
            this.f124129c = interfaceC15071a;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return this.f124128b.f124143c.a((ComparisonResponse) obj, ((InterfaceC15071a.k) this.f124129c).f14674a);
        }
    }

    /* compiled from: ComparisonActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSq/j;", "items", "LRq/b$c;", "apply", "(LSq/j;)LRq/b$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f124130b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new b.c((Sq.j) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC15071a interfaceC15071a, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f124126r = mVar;
        this.f124127s = interfaceC15071a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f124127s, this.f124126r, continuation);
        eVar.f124125q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(io.reactivex.rxjava3.core.z<TypedResult<ComparisonResponse>> zVar, Continuation<? super InterfaceC43160i<? extends b.c>> continuation) {
        return ((e) create(zVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return kotlinx.coroutines.rx3.y.a(Y5.a((io.reactivex.rxjava3.core.z) this.f124125q).d0(new a(this.f124126r, this.f124127s)).d0(b.f124130b));
    }
}
