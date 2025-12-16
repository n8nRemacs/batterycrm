package com.avito.avcalls.call;

import com.avito.avcalls.call.RingingState;
import com.avito.avcalls.call.models.InvitingState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: IncomingCallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.IncomingCallSession$acceptCall$1", f = "IncomingCallSession.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class L extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332595q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f332596r;

    /* compiled from: IncomingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RingingState.Progress.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RingingState.Progress progress = RingingState.Progress.f332622b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RingingState.Progress progress2 = RingingState.Progress.f332622b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(K k12, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f332596r = k12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new L(this.f332596r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((L) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332595q;
        K k12 = this.f332596r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.utils.logs.a aVar = K.f332585x;
            aVar.b("acceptCall", k12.f332593v);
            int iOrdinal = k12.f332593v.f332620a.ordinal();
            if (iOrdinal == 0) {
                aVar.c("'acceptCall' was invoked before 'sendRinging. Let's invoke 'sendRinging' manually", "acceptCall", new Object[0]);
                k12.f332593v.f332621b = true;
                C43259k.d(k12.f332792b, null, null, new N(k12, null), 3);
                return G0.f406611a;
            }
            if (iOrdinal == 1) {
                aVar.c("'acceptCall' was invoked while 'sendRinging' is in progress. It will be automatically invoked again after 'sendRinging'", "acceptCall", new Object[0]);
                k12.f332593v.f332621b = true;
                return G0.f406611a;
            }
            if (!kotlin.jvm.internal.L.f(k12.b(), InvitingState.Ringing.INSTANCE)) {
                aVar.a("acceptCall", "'acceptCall' was invoked in invalid state", null);
                return G0.f406611a;
            }
            k12.f(InvitingState.Active.INSTANCE);
            this.f332595q = 1;
            if (K.k(k12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        k12.getClass();
        r.f332790n.b("startSendingNewCandidatesToServer", new Object[0]);
        C43259k.d(k12.f332792b, null, null, new C36214u(k12, null), 3);
        return G0.f406611a;
    }
}
