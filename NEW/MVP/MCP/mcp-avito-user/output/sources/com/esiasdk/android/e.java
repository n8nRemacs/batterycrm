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
@DebugMetadata(c = "com.esiasdk.android.EsiaAuthVm$loadPermissionsUrl$1", f = "EsiaAuthVm.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements Y41.l<Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f339694q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f339695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f339696s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ClientSessionInfo f339697t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f339698u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, String str, ClientSessionInfo clientSessionInfo, String str2, Continuation<? super e> continuation) {
        super(1, continuation);
        this.f339695r = nVar;
        this.f339696s = str;
        this.f339697t = clientSessionInfo;
        this.f339698u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new e(this.f339695r, this.f339696s, this.f339697t, this.f339698u, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super String> continuation) {
        return ((e) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f339694q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n nVar = this.f339695r;
            this.f339694q = 1;
            com.esiasdk.android.domain.a aVar = nVar.f339722E;
            aVar.getClass();
            obj = com.esiasdk.android.domain.c.b(aVar, this.f339696s, this.f339697t, this.f339698u, this);
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
