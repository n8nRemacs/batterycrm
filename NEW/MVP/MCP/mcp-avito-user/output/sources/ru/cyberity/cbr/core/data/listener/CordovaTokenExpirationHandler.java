package ru.cyberity.cbr.core.data.listener;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: TokenExpirationHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CordovaTokenExpirationHandler;", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "()V", "onTokenExpired", "", "onTokenExpiredMain", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CordovaTokenExpirationHandler implements TokenExpirationHandler {

    /* compiled from: TokenExpirationHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1", f = "TokenExpirationHandler.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super String>, Object> {
        int label;

        /* compiled from: TokenExpirationHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1", f = "TokenExpirationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C124391 extends SuspendLambda implements p<T, Continuation<? super String>, Object> {
            int label;
            final /* synthetic */ CordovaTokenExpirationHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C124391(CordovaTokenExpirationHandler cordovaTokenExpirationHandler, Continuation<? super C124391> continuation) {
                super(2, continuation);
                this.this$0 = cordovaTokenExpirationHandler;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C124391(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return this.this$0.onTokenExpiredMain();
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k T t12, @l Continuation<? super String> continuation) {
                return ((C124391) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CordovaTokenExpirationHandler.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = C43262l0.f411945a;
                AbstractC43129d1 abstractC43129d1 = K.f411877a;
                C124391 c124391 = new C124391(CordovaTokenExpirationHandler.this, null);
                this.label = 1;
                obj = C43259k.g(abstractC43129d1, c124391, this);
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

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    @Override // ru.cyberity.cbr.core.data.listener.TokenExpirationHandler
    @l
    public String onTokenExpired() {
        return (String) C43259k.e(EmptyCoroutineContext.INSTANCE, new AnonymousClass1(null));
    }

    @l
    public abstract String onTokenExpiredMain();
}
