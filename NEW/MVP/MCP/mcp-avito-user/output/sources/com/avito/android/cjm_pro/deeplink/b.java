package com.avito.android.cjm_pro.deeplink;

import Bo.InterfaceC13170a;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: CjmProDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cjm_pro/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink;", "_avito_cjm-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<CjmProDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC13170a f118519g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f118520h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f118521i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f118522j;

    @Inject
    public b(@k InterfaceC13170a interfaceC13170a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k R0 r02) {
        super(r02);
        this.f118519g = interfaceC13170a;
        this.f118520h = aVar;
        this.f118521i = gVar;
        this.f118522j = iVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((CjmProDeepLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.cjm_pro.deeplink.CjmProDeepLink r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.avito.android.cjm_pro.deeplink.a
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.cjm_pro.deeplink.a r0 = (com.avito.android.cjm_pro.deeplink.a) r0
            int r1 = r0.f118518t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118518t = r1
            goto L18
        L13:
            com.avito.android.cjm_pro.deeplink.a r0 = new com.avito.android.cjm_pro.deeplink.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f118516r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f118518t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.cjm_pro.deeplink.b r12 = r0.f118515q
            kotlin.C42729a0.b(r13)
            goto L4f
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.C42729a0.b(r13)
            com.avito.android.deeplink_handler.view.a$g r13 = r11.f118521i
            com.avito.android.deeplink_handler.handler.bundle.a r2 = r11.d()
            r13.g(r2, r3)
            java.lang.String r12 = r12.f118512b
            r0.f118515q = r11
            r0.f118518t = r3
            Bo.a r13 = r11.f118519g
            java.lang.Object r13 = r13.a(r12, r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            r12 = r11
        L4f:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            if (r0 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r13 = r13.getResult()
            Co.a r13 = (Co.C13333a) r13
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r12.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r12.f118521i
            r2.g(r0, r1)
            com.avito.android.cjm_pro.deeplink.CjmProDeepLink$b$b r0 = com.avito.android.cjm_pro.deeplink.CjmProDeepLink.b.C3451b.f118514b
            com.avito.android.deep_linking.links.DeepLink r13 = r13.getUri()
            com.avito.android.deep_linking.links.DeepLink[] r13 = new com.avito.android.deep_linking.links.DeepLink[]{r13}
            com.avito.android.deeplink_handler.handler.composite.a r1 = r12.f118520h
            r12.i(r0, r1, r13)
            goto Lb2
        L77:
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lb5
            com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
            com.avito.android.remote.error.ApiError r0 = r13.getError()
            java.lang.Throwable r13 = r13.getCause()
            com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r0, r13)
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r12.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r12.f118521i
            r2.g(r0, r1)
            java.lang.String r0 = com.avito.android.error.z.l(r13)
            com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.f(r0)
            com.avito.android.component.toast.f$c r5 = new com.avito.android.component.toast.f$c
            r5.<init>(r13)
            com.avito.android.lib.design.toast_bar.ToastBarPosition r7 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
            r6 = 0
            r10 = 1966(0x7ae, float:2.755E-42)
            com.avito.android.deeplink_handler.view.a$i r1 = r12.f118522j
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            com.avito.android.deeplink_handler.view.a.i.C4057a.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.avito.android.cjm_pro.deeplink.CjmProDeepLink$b$a r13 = com.avito.android.cjm_pro.deeplink.CjmProDeepLink.b.a.f118513b
            r12.j(r13)
        Lb2:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Lb5:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cjm_pro.deeplink.b.o(com.avito.android.cjm_pro.deeplink.CjmProDeepLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
