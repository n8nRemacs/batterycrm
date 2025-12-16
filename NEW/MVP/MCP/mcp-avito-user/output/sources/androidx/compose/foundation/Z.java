package androidx.compose.foundation;

import androidx.compose.runtime.C22082i3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {310, 312}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Z extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f26902q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20411b0 f26903r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Continuation<? super kotlin.G0>, Object> f26904s;

    /* compiled from: BasicTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f26905q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Continuation<? super kotlin.G0>, Object> f26906r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Continuation<? super kotlin.G0>, ? extends Object> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26906r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f26906r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f26905q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f26905q = 1;
                if (((C20408a0) this.f26906r).invoke(this) == coroutine_suspended) {
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
    public Z(C20411b0 c20411b0, Y41.l<? super Continuation<? super kotlin.G0>, ? extends Object> lVar, Continuation<? super Z> continuation) {
        super(1, continuation);
        this.f26903r = c20411b0;
        this.f26904s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
        return new Z(this.f26903r, this.f26904s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((Z) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f26902q;
        C20411b0 c20411b0 = this.f26903r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                c20411b0.getClass();
                Y41.l<Continuation<? super kotlin.G0>, Object> lVar = this.f26904s;
                this.f26902q = 1;
                if (((C20408a0) lVar).invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((C22082i3) c20411b0.f26950b).setValue(Boolean.FALSE);
            return kotlin.G0.f406611a;
        } catch (Throwable th2) {
            ((C22082i3) c20411b0.f26950b).setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
