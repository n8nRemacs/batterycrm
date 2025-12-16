package androidx.compose.material3;

import androidx.compose.material3.C21916v;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {577}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22004z extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37819q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21916v<Object> f37820r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f37821s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f37822t;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/material3/N6;", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.z$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.Q<? extends N6<Object>, Object>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21916v<Object> f37823l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21916v<Object> c21916v) {
            super(0);
            this.f37823l = c21916v;
        }

        @Override // Y41.a
        public final kotlin.Q<? extends N6<Object>, Object> invoke() {
            C21916v<Object> c21916v = this.f37823l;
            return new kotlin.Q<>(c21916v.e(), c21916v.f37496h.getF42167b());
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/material3/N6;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.z$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlin.Q<? extends N6<Object>, Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37824q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f37825r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f37826s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C21916v<Object> f37827t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.r<? super InterfaceC21735n, ? super N6<Object>, Object, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, C21916v<Object> c21916v, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37826s = (SuspendLambda) rVar;
            this.f37827t = c21916v;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f37826s, this.f37827t, continuation);
            bVar.f37825r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends N6<Object>, Object> q12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37824q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlin.Q q12 = (kotlin.Q) this.f37825r;
                N6 n62 = (N6) q12.f406619b;
                C21916v.f fVar = this.f37827t.f37503o;
                this.f37824q = 1;
                if (this.f37826s.invoke(fVar, n62, q12.f406620c, this) == coroutine_suspended) {
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
    public C22004z(C21916v<Object> c21916v, Object obj, Y41.r<? super InterfaceC21735n, ? super N6<Object>, Object, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, Continuation<? super C22004z> continuation) {
        super(1, continuation);
        this.f37820r = c21916v;
        this.f37821s = obj;
        this.f37822t = (SuspendLambda) rVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
        return new C22004z(this.f37820r, this.f37821s, this.f37822t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((C22004z) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37819q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = C21916v.f37488p;
            Object obj2 = this.f37821s;
            C21916v<Object> c21916v = this.f37820r;
            c21916v.i(obj2);
            a aVar = new a(c21916v);
            b bVar = new b(this.f37822t, c21916v, null);
            this.f37819q = 1;
            if (C21894u.b(aVar, bVar, this) == coroutine_suspended) {
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
