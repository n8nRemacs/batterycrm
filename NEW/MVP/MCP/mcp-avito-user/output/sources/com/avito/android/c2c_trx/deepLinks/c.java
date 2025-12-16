package com.avito.android.c2c_trx.deeplinks;

import Pl.InterfaceC14800a;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: AddAutoToC2CTrxDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/c2c_trx/deeplinks/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/c2c_trx/deepLinks/AddAutoToC2CTrxLink;", "_avito_c2c-trx_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<AddAutoToC2CTrxLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f113294g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC14800a f113295h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f113296i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final R0 f113297j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final x f113298k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f113299l;

    @Inject
    public c(@k Context context, @k a.g gVar, @k InterfaceC14800a interfaceC14800a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02, @k x xVar) {
        super(r02);
        this.f113294g = gVar;
        this.f113295h = interfaceC14800a;
        this.f113296i = aVar;
        this.f113297j = r02;
        this.f113298k = xVar;
        this.f113299l = context.getResources().getString(R.string.unknown_error);
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o(bundle, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.l android.os.Bundle r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.c2c_trx.deeplinks.a
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.c2c_trx.deeplinks.a r0 = (com.avito.android.c2c_trx.deeplinks.a) r0
            int r1 = r0.f113290t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113290t = r1
            goto L18
        L13:
            com.avito.android.c2c_trx.deeplinks.a r0 = new com.avito.android.c2c_trx.deeplinks.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f113288r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f113290t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.avito.android.c2c_trx.deeplinks.c r6 = r0.f113287q
            kotlin.C42729a0.b(r7)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.C42729a0.b(r7)
            if (r6 == 0) goto Lcc
            com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink$a r7 = com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink.f113283b
            r7.getClass()
            java.lang.String r7 = "publish_draft_id_key"
            android.os.Parcelable r6 = r6.getParcelable(r7)
            com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink$Arguments r6 = (com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink.Arguments) r6
            if (r6 != 0) goto L4a
            goto Lcc
        L4a:
            com.avito.android.deeplink_handler.view.a$g r7 = r5.f113294g
            com.avito.android.deeplink_handler.handler.bundle.a r2 = r5.d()
            r7.g(r2, r4)
            com.avito.android.util.R0 r7 = r5.f113297j
            kotlinx.coroutines.scheduling.b r7 = r7.a()
            com.avito.android.c2c_trx.deeplinks.b r2 = new com.avito.android.c2c_trx.deeplinks.b
            r2.<init>(r5, r6, r3)
            r0.f113287q = r5
            r0.f113290t = r4
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r7, r2, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            r6 = r5
        L6a:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L8e
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            Ol.a r7 = (Ol.C14707a) r7
            com.avito.android.deeplink_handler.handler.composite.a r0 = r6.f113296i
            java.lang.String r7 = r7.getDeepLinkUri()
            com.avito.android.deep_linking.x r1 = r6.f113298k
            com.avito.android.deep_linking.links.DeepLink r7 = r1.b(r7)
            r1 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r7, r3, r3, r1)
            Kl.a$b r7 = Kl.InterfaceC14324a.b.f9643b
            r6.j(r7)
            goto Lb9
        L8e:
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lc6
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r0 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r0, r7)
            Kl.a$a r0 = new Kl.a$a
            java.lang.String r1 = r7.getMessage()
            if (r1 != 0) goto Laa
            java.lang.String r1 = r6.f113299l
        Laa:
            r0.<init>(r1)
            r6.j(r0)
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            java.lang.String r1 = "AutoC2CTRXAddDeepLinkHandler"
            java.lang.String r2 = "Failed to send draft to auto c2c trx"
            r0.a(r1, r2, r7)
        Lb9:
            com.avito.android.deeplink_handler.view.a$g r7 = r6.f113294g
            com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.d()
            r0 = 0
            r7.g(r6, r0)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        Lc6:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lcc:
            Kl.a$a r6 = new Kl.a$a
            java.lang.String r7 = r5.f113299l
            r6.<init>(r7)
            r5.j(r6)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.c2c_trx.deeplinks.c.o(android.os.Bundle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
