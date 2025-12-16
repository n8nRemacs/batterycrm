package com.avito.android.comfortable_deal.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealStageInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/domain/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f122004a;

    /* compiled from: DealStageInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3608a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122005a;

        static {
            int[] iArr = new int[DealStageApiResponse.DealStage.values().length];
            try {
                iArr[DealStageApiResponse.DealStage.Introduction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DealStageApiResponse.DealStage.Meeting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122005a = iArr;
        }
    }

    @Inject
    public a(@k com.avito.android.comfortable_deal.repository.a aVar) {
        this.f122004a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.comfortable_deal.domain.b
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.comfortable_deal.domain.b r0 = (com.avito.android.comfortable_deal.domain.b) r0
            int r1 = r0.f122008s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122008s = r1
            goto L18
        L13:
            com.avito.android.comfortable_deal.domain.b r0 = new com.avito.android.comfortable_deal.domain.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f122006q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f122008s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f122008s = r3
            com.avito.android.comfortable_deal.repository.a r5 = r4.f122004a
            java.lang.Object r5 = r5.l(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L64
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse r5 = (com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse) r5
            com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse$DealStage r5 = r5.getDealStage()
            int[] r0 = com.avito.android.comfortable_deal.domain.a.C3608a.f122005a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L61
            r0 = 2
            if (r5 == r0) goto L61
            com.avito.android.comfortable_deal.domain.d$a r5 = com.avito.android.comfortable_deal.domain.d.a.f122010a
            goto L74
        L61:
            com.avito.android.comfortable_deal.domain.d$c r5 = com.avito.android.comfortable_deal.domain.d.c.f122012a
            goto L74
        L64:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L75
            com.avito.android.comfortable_deal.domain.d$b r0 = new com.avito.android.comfortable_deal.domain.d$b
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r5 = r5.getError()
            r0.<init>(r5)
            r5 = r0
        L74:
            return r5
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.domain.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
