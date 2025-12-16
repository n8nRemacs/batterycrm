package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.RingingState;
import com.avito.avcalls.android.logger.g;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import xQ0.f;

/* compiled from: IncomingCallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.IncomingCallSession$acceptCall$1", f = "IncomingCallSession.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class G extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331428q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f331429r;

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
                RingingState.Progress progress = RingingState.Progress.f331464b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RingingState.Progress progress2 = RingingState.Progress.f331464b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(F f12, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f331429r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G(this.f331429r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331428q;
        F f12 = this.f331429r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("IncomingCallSession", "acceptCall()");
            int iOrdinal = f12.f331426u.f331462a.ordinal();
            if (iOrdinal == 0) {
                g.Companion.a("IncomingCallSession", "acceptCall(): 'acceptCall' was invoked before 'sendRinging', ringingState=" + f12.f331426u + ", invitingState=" + f12.c().f442471d + ". Let's invoke 'sendRinging' manually", null);
                f12.f331426u.f331463b = true;
                C43259k.d(f12.f331579b, null, null, new I(f12, null), 3);
                return G0.f406611a;
            }
            if (iOrdinal == 1) {
                g.Companion.a("IncomingCallSession", "acceptCall(): 'acceptCall' was invoked while 'sendRinging' is in progress, ringingState=" + f12.f331426u + ", invitingState=" + f12.c().f442471d + ".'acceptCall' will be automatically invoked again after 'sendRinging'.", null);
                f12.f331426u.f331463b = true;
                return G0.f406611a;
            }
            if (!kotlin.jvm.internal.L.f(f12.c().f442471d, f.d.f442483b)) {
                g.Companion.a("IncomingCallSession", "acceptCall(): called in invalid state: " + f12.c().f442471d, null);
                return G0.f406611a;
            }
            f12.f(f.a.f442480b);
            this.f331428q = 1;
            if (F.j(f12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        f12.getClass();
        C43259k.d(f12.f331579b, null, null, new r(f12, null), 3);
        return G0.f406611a;
    }
}
