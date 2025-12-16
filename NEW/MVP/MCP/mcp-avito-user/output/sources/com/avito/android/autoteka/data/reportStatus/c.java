package com.avito.android.autoteka.data.reportStatus;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.autoteka.helpers.i;
import com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaReportStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "attempts", "Lcom/avito/android/autoteka/helpers/i;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse;", "<anonymous>", "(J)Lcom/avito/android/autoteka/helpers/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.reportStatus.AutotekaReportGenerationStatusInteractorImpl$loadReportGenerationStatus$2", f = "AutotekaReportStatusInteractor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<Long, Continuation<? super i<GetStepReportStatusApiResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96206q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f96207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f96208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f96209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f96208s = dVar;
        this.f96209t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f96208s, this.f96209t, continuation);
        cVar.f96207r = ((Number) obj).longValue();
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Long l12, Continuation<? super i<GetStepReportStatusApiResponse>> continuation) {
        return ((c) create(Long.valueOf(l12.longValue()), continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96206q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = this.f96207r;
            InterfaceC50257a interfaceC50257a = this.f96208s.f96210a;
            this.f96206q = 1;
            obj = interfaceC50257a.a(this.f96209t, j12, this);
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
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return new i(typedResult, true, 0L, 4, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        GetStepReportStatusApiResponse.Status status = ((GetStepReportStatusApiResponse) success.getResult()).getStatus();
        if (status != GetStepReportStatusApiResponse.Status.Completed && status != GetStepReportStatusApiResponse.Status.Failed) {
            z12 = false;
        }
        Long retryAfterMs = ((GetStepReportStatusApiResponse) success.getResult()).getRetryAfterMs();
        return new i(typedResult, z12, retryAfterMs != null ? retryAfterMs.longValue() : 10000L);
    }
}
