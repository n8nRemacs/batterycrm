package kotlinx.coroutines.internal;

import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002**\b\u0000\u0010\u0003\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004"}, d2 = {"E", "Lkotlin/Function1;", "Lkotlin/G0;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q {

    /* compiled from: OnUndeliveredElement.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<E, G0> f411881l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ E f411882m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f411883n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super E, G0> lVar, E e12, CoroutineContext coroutineContext) {
            super(1);
            this.f411881l = lVar;
            this.f411882m = e12;
            this.f411883n = coroutineContext;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Q.b(this.f411881l, this.f411882m, this.f411883n);
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final <E> Y41.l<Throwable, G0> a(@Y61.k Y41.l<? super E, G0> lVar, E e12, @Y61.k CoroutineContext coroutineContext) {
        return new a(lVar, e12, coroutineContext);
    }

    public static final <E> void b(@Y61.k Y41.l<? super E, G0> lVar, E e12, @Y61.k CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionC = c(lVar, e12, null);
        if (undeliveredElementExceptionC != null) {
            kotlinx.coroutines.P.a(coroutineContext, undeliveredElementExceptionC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final <E> UndeliveredElementException c(@Y61.k Y41.l<? super E, G0> lVar, E e12, @Y61.l UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e12);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException(androidx.camera.view.k.a(e12, "Exception in undelivered element handler for "), th2);
            }
            C42833p.a(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }
}
