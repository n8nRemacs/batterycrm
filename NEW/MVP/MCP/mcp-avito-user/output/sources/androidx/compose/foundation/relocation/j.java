package androidx.compose.foundation.relocation;

import Y41.p;
import androidx.compose.ui.node.AbstractC22443w0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class j extends SuspendLambda implements p<T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f30078q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f30079r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC22443w0 f30080s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l0.j> f30081t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l0.j> f30082u;

    /* compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30083q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f30084r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC22443w0 f30085s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<l0.j> f30086t;

        /* compiled from: BringIntoViewResponder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.relocation.j$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1599a extends H implements Y41.a<l0.j> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f30087b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC22443w0 f30088c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Y41.a<l0.j> f30089d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1599a(l lVar, AbstractC22443w0 abstractC22443w0, Y41.a aVar) {
                super(0, L.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f30087b = lVar;
                this.f30088c = abstractC22443w0;
                this.f30089d = aVar;
            }

            @Override // Y41.a
            public final l0.j invoke() {
                Y41.a<l0.j> aVar = this.f30089d;
                return l.k2(this.f30087b, this.f30088c, aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, AbstractC22443w0 abstractC22443w0, Y41.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f30084r = lVar;
            this.f30085s = abstractC22443w0;
            this.f30086t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f30084r, this.f30085s, this.f30086t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30083q;
            if (i12 == 0) {
                C42729a0.b(obj);
                l lVar = this.f30084r;
                androidx.compose.foundation.gestures.L l12 = lVar.f30096p;
                C1599a c1599a = new C1599a(lVar, this.f30085s, this.f30086t);
                this.f30083q = 1;
                if (l12.l2(c1599a, this) == coroutine_suspended) {
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

    /* compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30090q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f30091r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<l0.j> f30092s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, Y41.a<l0.j> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30091r = lVar;
            this.f30092s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f30091r, this.f30092s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30090q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f30090q = 1;
                if (androidx.compose.ui.relocation.c.a(this.f30091r, this.f30092s, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC22443w0 abstractC22443w0, Y41.a aVar, Y41.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f30079r = lVar;
        this.f30080s = abstractC22443w0;
        this.f30081t = aVar;
        this.f30082u = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        Y41.a<l0.j> aVar = this.f30081t;
        Y41.a<l0.j> aVar2 = this.f30082u;
        j jVar = new j(this.f30079r, this.f30080s, aVar, aVar2, continuation);
        jVar.f30078q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super N0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f30078q;
        AbstractC22443w0 abstractC22443w0 = this.f30080s;
        Y41.a<l0.j> aVar = this.f30081t;
        l lVar = this.f30079r;
        C43259k.d(t12, null, null, new a(lVar, abstractC22443w0, aVar, null), 3);
        return C43259k.d(t12, null, null, new b(lVar, this.f30082u, null), 3);
    }
}
