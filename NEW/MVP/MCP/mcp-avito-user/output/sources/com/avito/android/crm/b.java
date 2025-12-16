package com.avito.android.crm;

import Is.InterfaceC14152a;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CrmDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/crm/CrmDeeplink;", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<CrmDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC14152a f129127g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f129128h;

    @Inject
    public b(@k InterfaceC14152a interfaceC14152a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        super(r02);
        this.f129127g = interfaceC14152a;
        this.f129128h = aVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((CrmDeeplink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.crm.CrmDeeplink r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.crm.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.crm.a r0 = (com.avito.android.crm.a) r0
            int r1 = r0.f129126t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129126t = r1
            goto L18
        L13:
            com.avito.android.crm.a r0 = new com.avito.android.crm.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f129124r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129126t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.crm.b r5 = r0.f129123q
            kotlin.C42729a0.b(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            java.lang.String r6 = r5.f129121c
            r0.f129123q = r4
            r0.f129126t = r3
            java.lang.String r2 = r5.f129120b
            java.lang.String r5 = r5.f129122d
            Is.a r3 = r4.f129127g
            java.lang.Object r6 = r3.a(r6, r2, r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L56
            Ju.d$b r6 = Ju.AbstractC14250d.b.f9170c
            r5.j(r6)
            goto Laf
        L56:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            if (r0 == 0) goto L5e
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            goto L5f
        L5e:
            r6 = r1
        L5f:
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r6.getResult()
            Js.a r6 = (Js.C14242a) r6
            if (r6 == 0) goto L6e
            com.avito.android.deep_linking.links.DeepLink r6 = r6.getRedirectLink()
            goto L6f
        L6e:
            r6 = r1
        L6f:
            java.lang.Class<com.avito.android.crm.b> r0 = com.avito.android.crm.b.class
            if (r6 == 0) goto L99
            com.avito.android.deeplink_handler.handler.composite.a r2 = r5.f129128h     // Catch: java.lang.Throwable -> L7f
            r3 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r2, r6, r1, r1, r3)     // Catch: java.lang.Throwable -> L7f
            Ju.d$c r6 = Ju.AbstractC14250d.c.f9171c     // Catch: java.lang.Throwable -> L7f
            r5.j(r6)     // Catch: java.lang.Throwable -> L7f
            goto Laf
        L7f:
            r6 = move-exception
            Ju.d$b r1 = Ju.AbstractC14250d.b.f9170c
            r5.j(r1)
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            kotlin.jvm.internal.n0 r1 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r0 = r1.b(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.d(r0, r6)
            goto Laf
        L99:
            Ju.d$b r6 = Ju.AbstractC14250d.b.f9170c
            r5.j(r6)
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            kotlin.jvm.internal.n0 r6 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r6 = r6.b(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "empty redirectLink"
            r5.d(r6, r0)
        Laf:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm.b.o(com.avito.android.crm.CrmDeeplink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
