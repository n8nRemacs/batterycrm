package com.avito.android.captcha;

import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: CaptchaInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/captcha/p;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaInteractor$getCaptcha$2", f = "CaptchaInteractor.kt", i = {}, l = {37, 43}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.captcha.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29329j extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<p>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115097q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f115098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f115099s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29329j(n nVar, boolean z12, Continuation<? super C29329j> continuation) {
        super(2, continuation);
        this.f115098r = nVar;
        this.f115099s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29329j(this.f115098r, this.f115099s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<p>> continuation) {
        return ((C29329j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f115097q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.C42729a0.b(r6)
            goto L8f
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.C42729a0.b(r6)
            goto L47
        L1f:
            kotlin.C42729a0.b(r6)
            com.avito.android.captcha.n r6 = r5.f115098r
            com.avito.android.D r1 = r6.f115111c
            DE0.a r1 = r1.v()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r4 = r5.f115099s
            if (r1 == 0) goto L80
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r5.f115097q = r3
            Mj0.a r6 = r6.f115110b
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            com.avito.android.remote.captcha.generated.api.get_v_3__api.GetV3ApiResponse r6 = (com.avito.android.remote.captcha.generated.api.get_v_3__api.GetV3ApiResponse) r6
            Nj0.a r6 = r6.getResult()
            java.lang.Object r6 = r6.getCaptcha()
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L64
            java.util.Map r6 = (java.util.Map) r6
            goto L65
        L64:
            r6 = 0
        L65:
            com.avito.android.captcha.u r0 = com.avito.android.captcha.u.f115136a
            r0.getClass()
            com.avito.android.captcha.p r6 = com.avito.android.captcha.u.b(r6, r3)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r6)
        L73:
            r6 = r0
            goto Lb4
        L75:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L7a
            goto Lb4
        L7a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L80:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r5.f115097q = r2
            Lj0.a r6 = r6.f115109a
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 != r0) goto L8f
            return r0
        L8f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto Lb0
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            Pj0.a r6 = (Pj0.C14794a) r6
            com.avito.android.captcha.u r0 = com.avito.android.captcha.u.f115136a
            com.avito.android.remote.captcha.model.CaptchaData r6 = r6.getCaptcha()
            r0.getClass()
            com.avito.android.captcha.p r6 = com.avito.android.captcha.u.a(r6, r3)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r6)
            goto L73
        Lb0:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lb5
        Lb4:
            return r6
        Lb5:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.C29329j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
