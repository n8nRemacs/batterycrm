package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.L;

/* compiled from: RxScheduler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class N extends kotlin.jvm.internal.H implements Y41.l<Continuation<? super G0>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.disposables.d f412063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f412064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f412065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(io.reactivex.rxjava3.disposables.d dVar, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, L.a.class, "task", "scheduleTask$task(Lio/reactivex/rxjava3/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f412063b = dVar;
        this.f412064c = coroutineContext;
        this.f412065d = runnable;
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        Runnable runnable = this.f412065d;
        return O.b(this.f412063b, this.f412064c, runnable, continuation);
    }
}
