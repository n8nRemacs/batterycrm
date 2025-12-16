package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.internal.C43242l;
import kotlinx.coroutines.internal.C43243m;
import kotlinx.coroutines.internal.C43254y;
import kotlinx.coroutines.internal.C43255z;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/M;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class M extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f410711b = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    @InterfaceC43017s
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/M$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/M;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextKey<ContinuationInterceptor, M> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "Lkotlinx/coroutines/M;", "invoke", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlinx/coroutines/M;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.M$a$a, reason: collision with other inner class name */
        public static final class C11709a extends kotlin.jvm.internal.N implements Y41.l<CoroutineContext.Element, M> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11709a f410712l = new C11709a();

            public C11709a() {
                super(1);
            }

            @Override // Y41.l
            public final M invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof M) {
                    return (M) element2;
                }
                return null;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(ContinuationInterceptor.INSTANCE, C11709a.f410712l);
        }
    }

    public M() {
        super(ContinuationInterceptor.INSTANCE);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    public abstract void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable);

    @Override // kotlin.coroutines.ContinuationInterceptor
    @Y61.k
    public final <T> Continuation<T> interceptContinuation(@Y61.k Continuation<? super T> continuation) {
        return new C43242l(this, continuation);
    }

    @I0
    public void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        h(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    public boolean p(@Y61.k CoroutineContext coroutineContext) {
        return !(this instanceof E1);
    }

    @B0
    @Y61.k
    public M q(int i12) {
        C43255z.a(i12);
        return new C43254y(this, i12);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(@Y61.k Continuation<?> continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C43242l c43242l = (C43242l) continuation;
        do {
            atomicReferenceFieldUpdater = C43242l.f411913i;
        } while (atomicReferenceFieldUpdater.get(c43242l) == C43243m.f411919b);
        Object obj = atomicReferenceFieldUpdater.get(c43242l);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            rVar.l();
        }
    }

    @Y61.k
    public String toString() {
        return getClass().getSimpleName() + '@' + X.a(this);
    }
}
