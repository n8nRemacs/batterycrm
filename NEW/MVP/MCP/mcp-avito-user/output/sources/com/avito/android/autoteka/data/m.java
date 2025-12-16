package com.avito.android.autoteka.data;

import Hj0.InterfaceC13998a;
import Y41.p;
import com.avito.android.remote.autoteka.model.AutotekaPreviewStatus;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseAutotekaStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LHj0/d;", "LHj0/a;", "T", "", "it", "Lcom/avito/android/autoteka/helpers/i;", "<anonymous>", "(J)Lcom/avito/android/autoteka/helpers/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.BaseAutotekaStatusPollingInteractorImpl$checkStatus$result$1", f = "BaseAutotekaStatusInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class m extends SuspendLambda implements p<Long, Continuation<? super com.avito.android.autoteka.helpers.i<Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96141q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p<Long, Continuation<? super TypedResult<Object>>, Object> f96142r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.autoteka.data.previewSearch.b f96143s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, com.avito.android.autoteka.data.previewSearch.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f96142r = pVar;
        this.f96143s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f96142r, this.f96143s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Long l12, Continuation<? super com.avito.android.autoteka.helpers.i<Object>> continuation) {
        return ((m) create(Long.valueOf(l12.longValue()), continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.autoteka.helpers.i iVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96141q;
        com.avito.android.autoteka.data.previewSearch.b bVar = this.f96143s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Long lBoxLong = Boxing.boxLong(bVar.f96144a);
            this.f96141q = 1;
            obj = this.f96142r.invoke(lBoxLong, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            TypedResult.Success success = (TypedResult.Success) typedResult;
            AutotekaPreviewStatus status = ((Hj0.d) success.getResult()).getStatus();
            if (status == null) {
                iVar = new com.avito.android.autoteka.helpers.i(new TypedResult.Error(new ApiError.Failure("unsupported status"), null, 2, null), true, 0L, 4, null);
            } else {
                Long delay = ((InterfaceC13998a) success.getResult()).getDelay();
                iVar = new com.avito.android.autoteka.helpers.i(typedResult, status.f253293b, delay != null ? delay.longValue() : 10000L);
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = new com.avito.android.autoteka.helpers.i(typedResult, true, 0L, 4, null);
        }
        bVar.f96144a++;
        return iVar;
    }
}
