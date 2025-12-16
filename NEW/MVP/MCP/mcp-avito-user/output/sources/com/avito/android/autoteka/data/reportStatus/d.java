package com.avito.android.autoteka.data.reportStatus;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaReportStatusInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/reportStatus/d;", "Lcom/avito/android/autoteka/data/reportStatus/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50257a f96210a;

    @Inject
    public d(@k InterfaceC50257a interfaceC50257a) {
        this.f96210a = interfaceC50257a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.autoteka.data.reportStatus.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.avito.android.autoteka.data.reportStatus.b
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.autoteka.data.reportStatus.b r0 = (com.avito.android.autoteka.data.reportStatus.b) r0
            int r1 = r0.f96205s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96205s = r1
            goto L18
        L13:
            com.avito.android.autoteka.data.reportStatus.b r0 = new com.avito.android.autoteka.data.reportStatus.b
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f96203q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96205s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r11)
            goto L43
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.C42729a0.b(r11)
            com.avito.android.autoteka.data.reportStatus.c r11 = new com.avito.android.autoteka.data.reportStatus.c
            r2 = 0
            r11.<init>(r9, r10, r2)
            r0.f96205s = r3
            java.lang.Object r11 = com.avito.android.autoteka.helpers.h.a(r11, r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L7a
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r10 = r11.getResult()
            com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse r10 = (com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse) r10
            vf.b r11 = new vf.b
            r11.<init>()
            com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse$Status r4 = r10.getStatus()
            com.avito.android.autoteka.items.reportGenerationResponse.c r11 = new com.avito.android.autoteka.items.reportGenerationResponse.c
            java.lang.String r2 = r10.getTitle()
            com.avito.android.remote.model.text.AttributedText r3 = r10.getDescription()
            Dj0.a r5 = r10.getAction()
            java.lang.String r6 = r10.getReportPublicId()
            r1 = 0
            r7 = 1
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.avito.android.remote.model.TypedResult$Success r10 = new com.avito.android.remote.model.TypedResult$Success
            r10.<init>(r11)
            r11 = r10
            goto L7e
        L7a:
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto L7f
        L7e:
            return r11
        L7f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.reportStatus.d.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
