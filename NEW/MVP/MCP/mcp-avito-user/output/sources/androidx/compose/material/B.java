package androidx.compose.material;

import androidx.compose.material.C21398x;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {574}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class B extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32364q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21398x<Object> f32365r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f32366s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.r<InterfaceC21292p, InterfaceC21153e3<Object>, Object, Continuation<? super kotlin.G0>, Object> f32367t;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/material/e3;", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.Q<? extends InterfaceC21153e3<Object>, Object>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<Object> f32368l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21398x<Object> c21398x) {
            super(0);
            this.f32368l = c21398x;
        }

        @Override // Y41.a
        public final kotlin.Q<? extends InterfaceC21153e3<Object>, Object> invoke() {
            C21398x<Object> c21398x = this.f32368l;
            return new kotlin.Q<>(c21398x.e(), c21398x.f34354h.getF42167b());
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Q;", "Landroidx/compose/material/e3;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {576}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlin.Q<? extends InterfaceC21153e3<Object>, Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f32369q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32370r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.r<InterfaceC21292p, InterfaceC21153e3<Object>, Object, Continuation<? super kotlin.G0>, Object> f32371s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C21398x<Object> f32372t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.r<? super InterfaceC21292p, ? super InterfaceC21153e3<Object>, Object, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, C21398x<Object> c21398x, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32371s = rVar;
            this.f32372t = c21398x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f32371s, this.f32372t, continuation);
            bVar.f32370r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends InterfaceC21153e3<Object>, Object> q12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f32369q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlin.Q q12 = (kotlin.Q) this.f32370r;
                InterfaceC21153e3<Object> interfaceC21153e3 = (InterfaceC21153e3) q12.f406619b;
                C21398x.f fVar = this.f32372t.f34361o;
                this.f32369q = 1;
                if (((C21333s) this.f32371s).invoke(fVar, interfaceC21153e3, q12.f406620c, this) == coroutine_suspended) {
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
    public B(C21398x<Object> c21398x, Object obj, Y41.r<? super InterfaceC21292p, ? super InterfaceC21153e3<Object>, Object, ? super Continuation<? super kotlin.G0>, ? extends Object> rVar, Continuation<? super B> continuation) {
        super(1, continuation);
        this.f32365r = c21398x;
        this.f32366s = obj;
        this.f32367t = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
        return new B(this.f32365r, this.f32366s, this.f32367t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((B) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32364q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = C21398x.f34346p;
            Object obj2 = this.f32366s;
            C21398x<Object> c21398x = this.f32365r;
            c21398x.i(obj2);
            a aVar = new a(c21398x);
            b bVar = new b(this.f32367t, c21398x, null);
            this.f32364q = 1;
            if (C21385w.b(aVar, bVar, this) == coroutine_suspended) {
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
