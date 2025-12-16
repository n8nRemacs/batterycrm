package com.avito.avcalls.android.call;

import android.content.pm.PackageManager;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.proto.CreateCallResponse;
import com.avito.avcalls.android.signaling.proto.EndpointInfo;
import com.avito.avcalls.android.signaling.proto.IceConfig;
import com.avito.avcalls.android.signaling.proto.OptionsUpdate;
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
import xQ0.f;
import xQ0.k;

/* compiled from: OutgoingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.OutgoingCallSession$create$1", f = "OutgoingCallSession.kt", i = {}, l = {107, 121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class M extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331452q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f331453r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(L l12, Continuation<? super M> continuation) {
        super(2, continuation);
        this.f331453r = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new M(this.f331453r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((M) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws PackageManager.NameNotFoundException {
        Object objD;
        Boolean bool;
        Boolean bool2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331452q;
        L l12 = this.f331453r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("OutgoingCallSession", "create()");
            l12.f331587j = Boxing.boxLong(System.currentTimeMillis());
            if (!kotlin.jvm.internal.L.f(l12.c().f442471d, f.c.f442482b)) {
                throw new IllegalStateException("Check failed.");
            }
            x xVar = l12.f331581d;
            String str = l12.c().f442468a;
            String str2 = l12.c().f442469b;
            String str3 = l12.c().f442473f.f442492a;
            boolean z12 = l12.c().f442474g;
            EndpointInfo.Companion companion = EndpointInfo.INSTANCE;
            com.avito.avcalls.android.utils.b bVarA = l12.f331444n.a();
            companion.getClass();
            EndpointInfo endpointInfoA = EndpointInfo.Companion.a(bVarA);
            this.f331452q = 1;
            objD = xVar.d(str, str2, str3, z12, endpointInfoA, l12.f331445o, this);
            if (objD == coroutine_suspended) {
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
            objD = obj;
        }
        com.avito.avcalls.android.signaling.v vVar = (com.avito.avcalls.android.signaling.v) objD;
        if (!(vVar instanceof v.c)) {
            if (!(vVar instanceof v.b)) {
                throw new NoWhenBranchMatchedException();
            }
            v.b bVar = (v.b) vVar;
            g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "OutgoingCallSession", "create(): can't create call, error=[" + bVar + ']');
            k.Companion companion2 = xQ0.k.INSTANCE;
            com.avito.avcalls.android.signaling.t tVar = bVar.f332214a;
            companion2.getClass();
            xQ0.k kVarA = k.Companion.a(tVar);
            this.f331452q = 2;
            if (l12.h(kVarA, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        CreateCallResponse createCallResponse = (CreateCallResponse) ((v.c) vVar).f332215a;
        g.Companion companion3 = com.avito.avcalls.android.logger.g.INSTANCE;
        String str4 = "create(): ice config received [" + createCallResponse.f332081a + ']';
        companion3.getClass();
        g.Companion.c("OutgoingCallSession", str4);
        l12.g(l12.f331446p.getF331656d(), k.f.f442500b);
        Z1<xQ0.b> z13 = l12.f331590m;
        xQ0.b value = z13.getValue();
        f.b bVar2 = f.b.f442481b;
        OptionsUpdate optionsUpdate = createCallResponse.f332082b;
        boolean zBooleanValue = (optionsUpdate == null || (bool2 = optionsUpdate.f332118a) == null) ? l12.c().f442475h : bool2.booleanValue();
        CameraPosition cameraPositionA = xQ0.c.a(optionsUpdate != null ? optionsUpdate.f332119b : null);
        if (cameraPositionA == null) {
            cameraPositionA = l12.c().f442476i;
        }
        z13.setValue(xQ0.b.a(value, bVar2, null, null, zBooleanValue, cameraPositionA, (optionsUpdate == null || (bool = optionsUpdate.f332120c) == null) ? l12.c().f442477j : bool.booleanValue(), createCallResponse.f332083c, 119));
        IceConfig iceConfig = createCallResponse.f332081a;
        if (iceConfig != null) {
            l12.f331585h.g(iceConfig);
        }
        return G0.f406611a;
    }
}
