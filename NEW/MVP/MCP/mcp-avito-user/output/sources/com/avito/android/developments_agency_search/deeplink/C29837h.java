package com.avito.android.developments_agency_search.deeplink;

import Ju.AbstractC14250d;
import Qw.InterfaceC14939a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import rw.InterfaceC47923a;

/* compiled from: DealRoomLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/h;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29837h extends com.avito.android.deeplink_handler.handler.base.coroutines.a<DealRoomLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f136434g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f136435h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47923a f136436i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f136437j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f136438k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.features.a f136439l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f136440m;

    @Inject
    public C29837h(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.g gVar, @Y61.k InterfaceC47923a interfaceC47923a, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.developments_agency_search.features.a aVar2, @Y61.k R0 r02) {
        super(r02);
        this.f136434g = interfaceC4053a;
        this.f136435h = gVar;
        this.f136436i = interfaceC47923a;
        this.f136437j = interfaceC14939a;
        this.f136438k = aVar;
        this.f136439l = aVar2;
        this.f136440m = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((DealRoomLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.developments_agency_search.deeplink.DealRoomLink r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.developments_agency_search.deeplink.C29835f
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.developments_agency_search.deeplink.f r0 = (com.avito.android.developments_agency_search.deeplink.C29835f) r0
            int r1 = r0.f136427v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136427v = r1
            goto L18
        L13:
            com.avito.android.developments_agency_search.deeplink.f r0 = new com.avito.android.developments_agency_search.deeplink.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f136425t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f136427v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            kotlin.jvm.internal.l0$h r7 = r0.f136424s
            com.avito.android.developments_agency_search.deeplink.DealRoomLink r1 = r0.f136423r
            com.avito.android.developments_agency_search.deeplink.h r0 = r0.f136422q
            kotlin.C42729a0.b(r8)
            goto L89
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.C42729a0.b(r8)
            java.lang.String r8 = r7.f136364d
            java.lang.String r2 = "agent_cabinet_client_name"
            boolean r8 = kotlin.jvm.internal.L.f(r8, r2)
            if (r8 != 0) goto Lb2
            com.avito.android.developments_agency_search.features.a r8 = r6.f136439l
            r8.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.developments_agency_search.features.a.f136535e
            r5 = 2
            r2 = r2[r5]
            com.avito.android.A0$a r8 = r8.f136537c
            DE0.a r8 = r8.a()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L62
            goto Lb2
        L62:
            com.avito.android.deeplink_handler.view.a$g r8 = r6.f136435h
            r8.g(r3, r4)
            kotlin.jvm.internal.l0$h r8 = new kotlin.jvm.internal.l0$h
            r8.<init>()
            com.avito.android.util.R0 r2 = r6.f136440m
            kotlinx.coroutines.scheduling.b r2 = r2.a()
            com.avito.android.developments_agency_search.deeplink.g r5 = new com.avito.android.developments_agency_search.deeplink.g
            r5.<init>(r6, r7, r8, r3)
            r0.f136422q = r6
            r0.f136423r = r7
            r0.f136424s = r8
            r0.f136427v = r4
            java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r2, r5, r0)
            if (r0 != r1) goto L86
            return r1
        L86:
            r0 = r6
            r1 = r7
            r7 = r8
        L89:
            com.avito.android.deeplink_handler.view.a$g r8 = r0.f136435h
            r2 = 0
            r8.g(r3, r2)
            T r7 = r7.f406842b
            com.avito.android.deep_linking.links.DeepLink r7 = (com.avito.android.deep_linking.links.DeepLink) r7
            if (r7 == 0) goto Laa
            boolean r8 = r7 instanceof com.avito.android.deep_linking.links.NoMatchLink
            if (r8 != 0) goto L9a
            goto L9b
        L9a:
            r7 = r3
        L9b:
            if (r7 == 0) goto Laa
            com.avito.android.developments_agency_search.deeplink.DealCabinetLink$c r8 = com.avito.android.developments_agency_search.deeplink.DealCabinetLink.c.f136361b
            com.avito.android.deeplink_handler.handler.composite.a r2 = r0.f136438k
            com.avito.android.deep_linking.links.DeepLink[] r7 = new com.avito.android.deep_linking.links.DeepLink[]{r7}
            r0.i(r8, r2, r7)
            kotlin.G0 r3 = kotlin.G0.f406611a
        Laa:
            if (r3 != 0) goto Laf
            r0.p(r1)
        Laf:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        Lb2:
            r6.p(r7)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.deeplink.C29837h.o(com.avito.android.developments_agency_search.deeplink.DealRoomLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void p(DealRoomLink dealRoomLink) {
        this.f136434g.R(this.f136436i.c(new DealRoomArguments.ClientIdArguments(dealRoomLink.f136362b, dealRoomLink.f136363c, dealRoomLink.f136364d)), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }
}
