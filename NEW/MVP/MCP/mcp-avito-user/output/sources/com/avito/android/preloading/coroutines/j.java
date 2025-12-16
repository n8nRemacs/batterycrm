package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.AbstractC33302a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CoroutinesPreloadingPromise.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Params", "Response", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.preloading.coroutines.CoroutinesPreloadingPromise$waitResultOrLoad$resultsFlow$2", f = "CoroutinesPreloadingPromise.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC33302a<Object, Object> f221823q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f221824r;

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "it", "", "invoke", "(Lcom/avito/android/preloading/coroutines/a$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<AbstractC33302a.b<Object, Object>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f221825l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(AbstractC33302a.b<Object, Object> bVar) {
            return Boolean.valueOf(bVar instanceof AbstractC33302a.b.C6712b);
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "invoke", "()Lcom/avito/android/preloading/coroutines/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<AbstractC33302a.b<Object, Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f221826l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC33302a.b<Object, Object> invoke() {
            return AbstractC33302a.b.C6711a.f221805a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC33302a<Object, Object> abstractC33302a, Y41.a<G0> aVar, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f221823q = abstractC33302a;
        this.f221824r = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        return new j(this.f221823q, this.f221824r, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        a aVar = a.f221825l;
        b bVar = b.f221826l;
        AbstractC33302a.C6710a c6710a = AbstractC33302a.f221798g;
        this.f221823q.b(bVar, aVar);
        this.f221824r.invoke();
        return G0.f406611a;
    }
}
