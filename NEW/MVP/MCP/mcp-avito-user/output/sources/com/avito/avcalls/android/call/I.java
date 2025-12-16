package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.RingingState;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import vQ0.AbstractC49254b;
import vQ0.C49253a;
import xQ0.f;
import xQ0.k;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.IncomingCallSession$sendRinging$1", f = "IncomingCallSession.kt", i = {}, l = {168, 174, 185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class I extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f331436r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(F f12, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f331436r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new I(this.f331436r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((I) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331435q;
        F f12 = this.f331436r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("IncomingCallSession", "sendRinging()");
            RingingState ringingState = f12.f331426u;
            if (ringingState.f331462a != RingingState.Progress.f331464b) {
                g.Companion.a("IncomingCallSession", "sendRinging(): Wrong state ringingState=" + f12.f331426u + ", invitingState=" + f12.c().f442471d, null);
                return G0.f406611a;
            }
            ringingState.f331462a = RingingState.Progress.f331465c;
            f12.f(f.d.f442483b);
            C49253a.Companion companion = C49253a.INSTANCE;
            AbstractC49254b.AbstractC12773b.c cVar = new AbstractC49254b.AbstractC12773b.c(f12.f331578a, f12.c().f442474g, f12.c().f442478k);
            companion.getClass();
            C49253a.Companion.a(cVar);
            x xVar = f12.f331581d;
            String str = f12.c().f442468a;
            String str2 = f12.c().f442469b;
            String str3 = f12.c().f442473f.f442492a;
            this.f331435q = 1;
            obj = xVar.h(str, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        com.avito.avcalls.android.signaling.v vVar = (com.avito.avcalls.android.signaling.v) obj;
        if (!(vVar instanceof v.c)) {
            if (!(vVar instanceof v.b)) {
                throw new NoWhenBranchMatchedException();
            }
            v.b bVar = (v.b) vVar;
            g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "IncomingCallSession", "sendRinging(): can't send Ringing, error=[" + bVar + ']');
            k.Companion companion2 = xQ0.k.INSTANCE;
            com.avito.avcalls.android.signaling.t tVar = bVar.f332214a;
            companion2.getClass();
            xQ0.k kVarA = k.Companion.a(tVar);
            this.f331435q = 2;
            if (f12.h(kVarA, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        RingingState ringingState2 = f12.f331426u;
        ringingState2.f331462a = RingingState.Progress.f331466d;
        if (ringingState2.f331463b) {
            C43259k.d(f12.f331579b, null, null, new G(f12, null), 3);
        } else {
            if (f12.f331420o.getF331662j()) {
                com.avito.avcalls.android.rtc.i iVar = f12.f331585h;
                iVar.getClass();
                com.avito.avcalls.android.logger.g.INSTANCE.getClass();
                g.Companion.c("PCSession", "disableAudioDevice()");
                iVar.f331923f.a(iVar.f331926i.f331968a, false);
                iVar.f331935r = true;
            }
            if (f12.f331425t) {
                this.f331435q = 3;
                if (F.j(f12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
