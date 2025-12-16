package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.l0;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K {

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f410705l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext.Element element2 = element;
            return element2 instanceof I ? coroutineContext2.plus(((I) element2).m()) : coroutineContext2.plus(element2);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<CoroutineContext> f410706l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f410707m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<CoroutineContext> hVar, boolean z12) {
            super(2);
            this.f410706l = hVar;
            this.f410707m = z12;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // Y41.p
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof I)) {
                return coroutineContext2.plus(element2);
            }
            l0.h<CoroutineContext> hVar = this.f410706l;
            if (hVar.f406842b.get(element2.getKey()) != null) {
                hVar.f406842b = hVar.f406842b.minusKey(element2.getKey());
                return coroutineContext2.plus(((I) element2).z());
            }
            I iM2 = (I) element2;
            if (this.f410707m) {
                iM2 = iM2.m();
            }
            return coroutineContext2.plus(iM2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z12) {
        Boolean bool = Boolean.FALSE;
        L l12 = L.f410708l;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, l12)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, l12)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        l0.h hVar = new l0.h();
        hVar.f406842b = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new b(hVar, z12));
        if (zBooleanValue2) {
            hVar.f406842b = ((CoroutineContext) hVar.f406842b).fold(emptyCoroutineContext, a.f410705l);
        }
        return coroutineContext3.plus((CoroutineContext) hVar.f406842b);
    }

    @I0
    @Y61.k
    public static final CoroutineContext b(@Y61.k CoroutineContext coroutineContext, @Y61.k CoroutineContext coroutineContext2) {
        return !((Boolean) coroutineContext2.fold(Boolean.FALSE, L.f410708l)).booleanValue() ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @B0
    @Y61.k
    public static final CoroutineContext c(@Y61.k T t12, @Y61.k CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(t12.getF401642c(), coroutineContext, true);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        return (coroutineContextA == cVar || coroutineContextA.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextA : coroutineContextA.plus(cVar);
    }

    @Y61.l
    public static final F1<?> d(@Y61.k Continuation<?> continuation, @Y61.k CoroutineContext coroutineContext, @Y61.l Object obj) {
        F1<?> f12 = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(G1.f410698b) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((callerFrame instanceof C43226h0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof F1) {
                    f12 = (F1) callerFrame;
                    break;
                }
            }
            if (f12 != null) {
                f12.G0(coroutineContext, obj);
            }
        }
        return f12;
    }
}
