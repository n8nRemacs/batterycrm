package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C20501s;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {1125}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class B extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27192q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20501s<Object> f27193r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f27194s;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/foundation/gestures/T0;", "invoke", "()Landroidx/compose/foundation/gestures/T0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<T0<Object>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20501s<Object> f27195l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20501s<Object> c20501s) {
            super(0);
            this.f27195l = c20501s;
        }

        @Override // Y41.a
        public final T0<Object> invoke() {
            return this.f27195l.c();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/foundation/gestures/T0;", "latestAnchors", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/T0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {1126}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T0<Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27196q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27197r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f27198s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C20501s<Object> f27199t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.q<? super InterfaceC20430a, ? super T0<Object>, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C20501s<Object> c20501s, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f27198s = (SuspendLambda) qVar;
            this.f27199t = c20501s;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f27198s, this.f27199t, continuation);
            bVar.f27197r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T0<Object> t02, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27196q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T0 t02 = (T0) this.f27197r;
                C20501s.e eVar = this.f27199t.f27976o;
                this.f27196q = 1;
                if (this.f27198s.invoke(eVar, t02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(Y41.q qVar, C20501s c20501s, Continuation continuation) {
        super(1, continuation);
        this.f27193r = c20501s;
        this.f27194s = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
        return new B(this.f27194s, this.f27193r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((B) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27192q;
        C20501s<Object> c20501s = this.f27193r;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(c20501s);
            b bVar = new b(this.f27194s, c20501s, null);
            this.f27192q = 1;
            if (C20438c.d(aVar, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        T0<Object> t0C = c20501s.c();
        InterfaceC22192v1 interfaceC22192v1 = c20501s.f27971j;
        Object objA = t0C.a(((C22040c3) interfaceC22192v1).f());
        if (objA != null) {
            if (Math.abs(((C22040c3) interfaceC22192v1).f() - c20501s.c().c(objA)) < 0.5f && c20501s.f27962a.invoke(objA).booleanValue()) {
                ((C22082i3) c20501s.f27969h).setValue(objA);
                c20501s.g(objA);
            }
        }
        return kotlin.G0.f406611a;
    }
}
