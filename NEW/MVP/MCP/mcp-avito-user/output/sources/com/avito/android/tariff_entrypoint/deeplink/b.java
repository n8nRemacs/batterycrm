package com.avito.android.tariff_entrypoint.deeplink;

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

/* compiled from: TariffEntryPointDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink;", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<TariffEntryPointLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final NC0.a f298710g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f298711h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f298712i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f298713j;

    @Inject
    public b(@k NC0.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k a.g gVar, @k a.i iVar, @k R0 r02) {
        super(r02);
        this.f298710g = aVar;
        this.f298711h = aVar2;
        this.f298712i = gVar;
        this.f298713j = iVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((TariffEntryPointLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.avito.android.tariff_entrypoint.deeplink.a
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.tariff_entrypoint.deeplink.a r0 = (com.avito.android.tariff_entrypoint.deeplink.a) r0
            int r1 = r0.f298709t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298709t = r1
            goto L18
        L13:
            com.avito.android.tariff_entrypoint.deeplink.a r0 = new com.avito.android.tariff_entrypoint.deeplink.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f298707r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f298709t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.tariff_entrypoint.deeplink.b r11 = r0.f298706q
            kotlin.C42729a0.b(r12)
            goto L4f
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.C42729a0.b(r12)
            com.avito.android.deeplink_handler.view.a$g r12 = r10.f298712i
            com.avito.android.deeplink_handler.handler.bundle.a r2 = r10.d()
            r12.g(r2, r3)
            java.lang.String r11 = r11.f298703b
            r0.f298706q = r10
            r0.f298709t = r3
            NC0.a r12 = r10.f298710g
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            r11 = r10
        L4f:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            if (r0 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r12 = r12.getResult()
            OC0.a r12 = (OC0.a) r12
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r11.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r11.f298712i
            r2.g(r0, r1)
            com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink$b$b r0 = com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink.b.C9135b.f298705b
            com.avito.android.deep_linking.links.DeepLink r12 = r12.getUri()
            com.avito.android.deep_linking.links.DeepLink[] r12 = new com.avito.android.deep_linking.links.DeepLink[]{r12}
            com.avito.android.deeplink_handler.handler.composite.a r1 = r11.f298711h
            r11.i(r0, r1, r12)
            goto Lb6
        L77:
            boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lb9
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r0 = r12.getError()
            java.lang.Throwable r12 = r12.getCause()
            com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r0, r12)
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r11.d()
            com.avito.android.deeplink_handler.view.a$g r2 = r11.f298712i
            r2.g(r0, r1)
            java.lang.String r12 = com.avito.android.error.z.l(r12)
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.f(r12)
            com.avito.android.component.toast.f$c$a r12 = com.avito.android.component.toast.f.c.f125255c
            r12.getClass()
            com.avito.android.component.toast.f$c r4 = com.avito.android.component.toast.f.c.a.b()
            com.avito.android.lib.design.toast_bar.ToastBarPosition r6 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
            r5 = 0
            r9 = 1966(0x7ae, float:2.755E-42)
            com.avito.android.deeplink_handler.view.a$i r0 = r11.f298713j
            r2 = 0
            r3 = 0
            r7 = 0
            r8 = 0
            com.avito.android.deeplink_handler.view.a.i.C4057a.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink$b$a r12 = com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink.b.a.f298704b
            r11.j(r12)
        Lb6:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Lb9:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_entrypoint.deeplink.b.o(com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
