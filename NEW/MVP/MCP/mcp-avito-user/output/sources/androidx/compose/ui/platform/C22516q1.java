package androidx.compose.ui.platform;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22516q1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.platform.q1$a */
    public static final class a<R> extends SuspendLambda implements Y41.l<Continuation<? super R>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f41529q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, R> f41530r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Long, ? extends R> lVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f41530r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Continuation<?> continuation) {
            return new a(this.f41530r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Object obj) {
            return ((a) create((Continuation) obj)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f41529q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f41529q = 1;
                obj = androidx.compose.runtime.X0.a(getF411960f()).N(this.f41530r, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Y61.l
    public static final <R> Object a(@Y61.k Y41.l<? super Long, ? extends R> lVar, @Y61.k Continuation<? super R> continuation) {
        InterfaceC22512p1 interfaceC22512p1 = (InterfaceC22512p1) continuation.getF411960f().get(InterfaceC22512p1.f41525E1);
        if (interfaceC22512p1 == null) {
            return androidx.compose.runtime.X0.a(continuation.getF411960f()).N(lVar, continuation);
        }
        new a(lVar, null);
        return interfaceC22512p1.u();
    }
}
