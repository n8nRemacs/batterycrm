package com.esiasdk.android;

import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.esiasdk.android.EsiaAuthVm$loadAuthUrl$1", f = "EsiaAuthVm.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.l<Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f339677q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f339678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f339679s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ClientSessionInfo f339680t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str, ClientSessionInfo clientSessionInfo, Continuation<? super b> continuation) {
        super(1, continuation);
        this.f339678r = nVar;
        this.f339679s = str;
        this.f339680t = clientSessionInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new b(this.f339678r, this.f339679s, this.f339680t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super String> continuation) {
        return ((b) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f339677q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n nVar = this.f339678r;
            this.f339677q = 1;
            obj = nVar.f339722E.a(this.f339679s, this.f339680t);
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
