package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RxConvert.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asFlow$1", f = "RxConvert.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements Y41.p<I0<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f412128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f412129r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.E<T> f412130s;

        /* compiled from: RxConvert.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.rx3.y$a$a, reason: collision with other inner class name */
        public static final class C11737a extends kotlin.jvm.internal.N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AtomicReference<io.reactivex.rxjava3.disposables.d> f412131l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11737a(AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
                super(0);
                this.f412131l = atomicReference;
            }

            @Override // Y41.a
            public final G0 invoke() {
                io.reactivex.rxjava3.disposables.d andSet = this.f412131l.getAndSet(EmptyDisposable.f401988b);
                if (andSet != null) {
                    andSet.dispose();
                }
                return G0.f406611a;
            }
        }

        /* compiled from: RxConvert.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/rx3/y$a$b", "Lio/reactivex/rxjava3/core/G;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements io.reactivex.rxjava3.core.G<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<T> f412132b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AtomicReference<io.reactivex.rxjava3.disposables.d> f412133c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(I0<? super T> i02, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
                this.f412132b = i02;
                this.f412133c = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
                AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference;
                do {
                    atomicReference = this.f412133c;
                    if (atomicReference.compareAndSet(null, dVar)) {
                        return;
                    }
                } while (atomicReference.get() == null);
                dVar.dispose();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                this.f412132b.h(null);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(@Y61.k Throwable th2) {
                this.f412132b.h(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(@Y61.k T t12) {
                try {
                    kotlinx.coroutines.channels.D.c(this.f412132b, t12);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.reactivex.rxjava3.core.E<T> e12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f412130s = e12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f412130s, continuation);
            aVar.f412129r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((I0) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f412128q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f412129r;
                AtomicReference atomicReference = new AtomicReference();
                this.f412130s.c(new b(i02, atomicReference));
                C11737a c11737a = new C11737a(atomicReference);
                this.f412128q = 1;
                if (F0.a(i02, c11737a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> a(@Y61.k io.reactivex.rxjava3.core.E<T> e12) {
        return C43175k.d(new a(e12, null));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.C b(final InterfaceC43160i interfaceC43160i) {
        final EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        return new io.reactivex.rxjava3.internal.operators.observable.C(new io.reactivex.rxjava3.core.C() { // from class: kotlinx.coroutines.rx3.w
            @Override // io.reactivex.rxjava3.core.C
            public final void f(io.reactivex.rxjava3.core.B b12) {
                b12.f(new C43293p((AbstractC43075a) C43259k.c(D0.f410691b, C43262l0.f411946b.plus(emptyCoroutineContext), CoroutineStart.f410682d, new A(interfaceC43160i, b12, null))));
            }
        });
    }

    @Y61.k
    public static final C42006d c(@Y61.k InterfaceC43076a0 interfaceC43076a0, @Y61.k kotlinx.coroutines.M m12) {
        return Q.a(m12, new B(interfaceC43076a0, null));
    }
}
