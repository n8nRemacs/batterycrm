package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C20456g1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/compose/foundation/gestures/g1$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/compose/foundation/gestures/g1$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20464i1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super C20456g1.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27758q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27759r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43108m f27760s;

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.i1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27761q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27762r;

        /* compiled from: MouseWheelScrollable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.i1$a$a, reason: collision with other inner class name */
        public static final class C1581a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1581a f27763l = new C1581a();

            public C1581a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Long l12) {
                l12.longValue();
                return kotlin.G0.f406611a;
            }
        }

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f27762r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27761q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (kotlinx.coroutines.T) this.f27762r;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (kotlinx.coroutines.T) this.f27762r;
                C42729a0.b(obj);
            }
            while (kotlinx.coroutines.Q0.h(t12.getF399611e())) {
                C1581a c1581a = C1581a.f27763l;
                this.f27762r = t12;
                this.f27761q = 1;
                if (androidx.compose.runtime.X0.a(getF411447c()).N(c1581a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20464i1(C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f27760s = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20464i1 c20464i1 = new C20464i1(this.f27760s, continuation);
        c20464i1.f27759r = obj;
        return c20464i1;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super C20456g1.a> continuation) {
        return ((C20464i1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlinx.coroutines.N0 n02;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27758q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.N0 n0D = C43259k.d((kotlinx.coroutines.T) this.f27759r, null, null, new a(2, null), 3);
            try {
                C43108m c43108m = this.f27760s;
                this.f27759r = n0D;
                this.f27758q = 1;
                Object objM = c43108m.M(this);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n02 = n0D;
                obj = objM;
            } catch (Throwable th3) {
                n02 = n0D;
                th2 = th3;
                n02.c(null);
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n02 = (kotlinx.coroutines.N0) this.f27759r;
            try {
                C42729a0.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                n02.c(null);
                throw th2;
            }
        }
        C20456g1.a aVar = (C20456g1.a) obj;
        n02.c(null);
        return aVar;
    }
}
