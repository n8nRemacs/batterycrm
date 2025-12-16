package com.avito.avcalls.android.signaling.transport;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.avcalls.android.signaling.transport.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/avcalls/android/call/models/MessagePayload;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.signaling.transport.SignalingProcessorImpl$sendMessageAndContinue$resultPayload$1", f = "SignalingProcessorImpl.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class j extends SuspendLambda implements p<T, Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332211q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f332212r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g.b f332213s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, g.b bVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f332212r = gVar;
        this.f332213s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new j(this.f332212r, this.f332213s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super String> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332211q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.signaling.transport.external.h hVar = this.f332212r.f332188b;
            g.b bVar = this.f332213s;
            String str = bVar.f332195a;
            String str2 = bVar.f332196b;
            this.f332211q = 1;
            obj = hVar.b(str, str2, this);
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
