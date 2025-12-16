package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: FeesApplyByPackageDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/deeplink/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<FeesApplyByPackageV2Link> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AE.a f157968g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f157969h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f157970i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f157971j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final R0 f157972k;

    @Inject
    public c(@k AE.a aVar, @k a.i iVar, @k a.g gVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k R0 r02) {
        super(r02);
        this.f157968g = aVar;
        this.f157969h = iVar;
        this.f157970i = gVar;
        this.f157971j = aVar2;
        this.f157972k = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((FeesApplyByPackageV2Link) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.avito.android.fees_methods.screen.fees_by_package.deeplink.a
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.fees_methods.screen.fees_by_package.deeplink.a r0 = (com.avito.android.fees_methods.screen.fees_by_package.deeplink.a) r0
            int r1 = r0.f157964t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157964t = r1
            goto L18
        L13:
            com.avito.android.fees_methods.screen.fees_by_package.deeplink.a r0 = new com.avito.android.fees_methods.screen.fees_by_package.deeplink.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f157962r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f157964t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.fees_methods.screen.fees_by_package.deeplink.c r12 = r0.f157961q
            kotlin.C42729a0.b(r13)
            goto L57
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.C42729a0.b(r13)
            com.avito.android.deeplink_handler.view.a$g r13 = r11.f157970i
            com.avito.android.deeplink_handler.handler.bundle.a r2 = r11.d()
            r13.g(r2, r3)
            com.avito.android.util.R0 r13 = r11.f157972k
            kotlinx.coroutines.scheduling.b r13 = r13.a()
            com.avito.android.fees_methods.screen.fees_by_package.deeplink.b r2 = new com.avito.android.fees_methods.screen.fees_by_package.deeplink.b
            r4 = 0
            r2.<init>(r11, r12, r4)
            r0.f157961q = r11
            r0.f157964t = r3
            java.lang.Object r13 = kotlinx.coroutines.C43259k.g(r13, r2, r0)
            if (r13 != r1) goto L56
            return r1
        L56:
            r12 = r11
        L57:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            if (r0 == 0) goto L7f
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r13 = r13.getResult()
            DE.a r13 = (DE.a) r13
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r12.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r12.f157970i
            r2.g(r0, r1)
            com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link$b$b r0 = com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link.b.C4617b.f157942b
            com.avito.android.deep_linking.links.DeepLink r13 = r13.getUri()
            com.avito.android.deep_linking.links.DeepLink[] r13 = new com.avito.android.deep_linking.links.DeepLink[]{r13}
            com.avito.android.deeplink_handler.handler.composite.a r1 = r12.f157971j
            r12.i(r0, r1, r13)
            goto Lba
        L7f:
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lbd
            com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
            com.avito.android.remote.error.ApiError r0 = r13.getError()
            java.lang.Throwable r13 = r13.getCause()
            com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r0, r13)
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r12.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r12.f157970i
            r2.g(r0, r1)
            java.lang.String r0 = com.avito.android.error.z.l(r13)
            com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.f(r0)
            com.avito.android.lib.design.toast_bar.ToastBarPosition r7 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
            com.avito.android.component.toast.f$c r5 = new com.avito.android.component.toast.f$c
            r5.<init>(r13)
            r6 = 0
            r10 = 1966(0x7ae, float:2.755E-42)
            com.avito.android.deeplink_handler.view.a$i r1 = r12.f157969h
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            com.avito.android.deeplink_handler.view.a.i.C4057a.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link$b$a r13 = com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link.b.a.f157941b
            r12.j(r13)
        Lba:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Lbd:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.fees_methods.screen.fees_by_package.deeplink.c.o(com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
