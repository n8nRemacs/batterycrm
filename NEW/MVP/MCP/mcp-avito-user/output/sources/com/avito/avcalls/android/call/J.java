package com.avito.avcalls.android.call;

import android.content.pm.PackageManager;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.proto.EndpointInfo;
import com.avito.avcalls.android.signaling.proto.FetchIncomingCallResponse;
import com.avito.avcalls.android.signaling.proto.OptionsUpdate;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import com.avito.avcalls.android.signaling.v;
import com.avito.avcalls.android.video.CameraPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import vQ0.AbstractC49254b;
import vQ0.C49253a;
import xQ0.f;
import xQ0.k;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.IncomingCallSession$start$1", f = "IncomingCallSession.kt", i = {}, l = {105, 119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class J extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331437q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f331438r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(F f12, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f331438r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new J(this.f331438r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((J) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws PackageManager.NameNotFoundException {
        Object objE;
        Boolean bool;
        Boolean bool2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331437q;
        F f12 = this.f331438r;
        Z1<xQ0.b> z12 = f12.f331590m;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("IncomingCallSession", "start()");
            f12.f331587j = Boxing.boxLong(System.currentTimeMillis());
            if (!kotlin.jvm.internal.L.f(f12.c().f442471d, f.c.f442482b)) {
                throw new IllegalStateException("Check failed.");
            }
            x xVar = f12.f331581d;
            String str = z12.getValue().f442468a;
            String str2 = f12.c().f442469b;
            EndpointInfo.Companion companion = EndpointInfo.INSTANCE;
            com.avito.avcalls.android.utils.b bVarA = f12.f331419n.a();
            companion.getClass();
            EndpointInfo endpointInfoA = EndpointInfo.Companion.a(bVarA);
            this.f331437q = 1;
            objE = xVar.e(str, str2, endpointInfoA, this);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            objE = obj;
        }
        com.avito.avcalls.android.signaling.v vVar = (com.avito.avcalls.android.signaling.v) objE;
        if (!(vVar instanceof v.c)) {
            if (!(vVar instanceof v.b)) {
                throw new NoWhenBranchMatchedException();
            }
            v.b bVar = (v.b) vVar;
            g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "IncomingCallSession", "start(): can't fetch incoming call, error=[" + bVar + ']');
            k.Companion companion2 = xQ0.k.INSTANCE;
            com.avito.avcalls.android.signaling.t tVar = bVar.f332214a;
            companion2.getClass();
            xQ0.k kVarA = k.Companion.a(tVar);
            this.f331437q = 2;
            if (f12.h(kVarA, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        FetchIncomingCallResponse fetchIncomingCallResponse = (FetchIncomingCallResponse) ((v.c) vVar).f332215a;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("IncomingCallSession", "start(): incoming call fetched");
        VoipMessage voipMessage = fetchIncomingCallResponse.f332094b;
        f12.f331421p = voipMessage.f332130b;
        f12.f331422q = voipMessage.f332131c;
        f12.f331425t = voipMessage.f332134f;
        f12.g(f12.f331420o.getF331659g(), k.a.f442496b);
        VoipMessage voipMessage2 = fetchIncomingCallResponse.f332094b;
        OptionsUpdate optionsUpdate = voipMessage2.f332135g;
        CameraPosition cameraPositionA = xQ0.c.a(optionsUpdate != null ? optionsUpdate.f332119b : null);
        xQ0.b bVarC = f12.c();
        xQ0.j jVar = f12.c().f442473f;
        VoipMessage.MediaSender mediaSender = voipMessage2.f332132d;
        xQ0.j jVarA = xQ0.j.a(jVar, fetchIncomingCallResponse.f332095c, mediaSender != null ? xQ0.h.a(f12.c().f442473f.f442494c, new xQ0.g(mediaSender.f332136a, mediaSender.f332137b), false, 2) : f12.c().f442473f.f442494c, 6);
        f.b bVar2 = f.b.f442481b;
        OptionsUpdate optionsUpdate2 = voipMessage2.f332135g;
        boolean zBooleanValue = (optionsUpdate2 == null || (bool2 = optionsUpdate2.f332118a) == null) ? f12.c().f442475h : bool2.booleanValue();
        if (cameraPositionA == null) {
            cameraPositionA = f12.c().f442476i;
        }
        z12.setValue(xQ0.b.a(bVarC, bVar2, null, jVarA, zBooleanValue, cameraPositionA, (optionsUpdate2 == null || (bool = optionsUpdate2.f332120c) == null) ? f12.c().f442477j : bool.booleanValue(), fetchIncomingCallResponse.f332096d, 87));
        C49253a.Companion companion3 = C49253a.INSTANCE;
        AbstractC49254b.AbstractC12773b.C12774b c12774b = new AbstractC49254b.AbstractC12773b.C12774b(f12.f331578a, f12.c().f442474g, f12.c().f442478k);
        companion3.getClass();
        C49253a.Companion.a(c12774b);
        f12.f331585h.g(fetchIncomingCallResponse.f332093a);
        return G0.f406611a;
    }
}
