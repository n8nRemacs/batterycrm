package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import rw.InterfaceC47923a;

/* compiled from: DealCabinetLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/developments_agency_search/deeplink/DealCabinetLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29832c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<DealCabinetLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f136408g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f136409h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47923a f136410i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f136411j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f136412k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.features.a f136413l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f136414m;

    @Inject
    public C29832c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.g gVar, @Y61.k InterfaceC47923a interfaceC47923a, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.developments_agency_search.features.a aVar2, @Y61.k R0 r02) {
        super(r02);
        this.f136408g = interfaceC4053a;
        this.f136409h = gVar;
        this.f136410i = interfaceC47923a;
        this.f136411j = interfaceC14939a;
        this.f136412k = aVar;
        this.f136413l = aVar2;
        this.f136414m = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((DealCabinetLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.developments_agency_search.deeplink.DealCabinetLink r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.developments_agency_search.deeplink.C29830a
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.developments_agency_search.deeplink.a r0 = (com.avito.android.developments_agency_search.deeplink.C29830a) r0
            int r1 = r0.f136402v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136402v = r1
            goto L18
        L13:
            com.avito.android.developments_agency_search.deeplink.a r0 = new com.avito.android.developments_agency_search.deeplink.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f136400t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f136402v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            kotlin.jvm.internal.l0$h r7 = r0.f136399s
            com.avito.android.developments_agency_search.deeplink.DealCabinetLink r1 = r0.f136398r
            com.avito.android.developments_agency_search.deeplink.c r0 = r0.f136397q
            kotlin.C42729a0.b(r8)
            goto L9a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.C42729a0.b(r8)
            com.avito.android.developments_agency_search.features.a r8 = r6.f136413l
            r8.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.developments_agency_search.features.a.f136535e
            r5 = 2
            r2 = r2[r5]
            com.avito.android.A0$a r8 = r8.f136537c
            DE0.a r8 = r8.a()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L73
            com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments r8 = new com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments
            java.lang.String r0 = r7.f136360c
            java.lang.String r7 = r7.f136359b
            r8.<init>(r0, r7)
            rw.a r7 = r6.f136410i
            android.content.Intent r7 = r7.a(r8)
            com.avito.android.deeplink_handler.view.a$a r8 = r6.f136408g
            com.avito.android.deeplink_handler.view.a.InterfaceC4053a.C4054a.a(r8, r7)
            Ju.d$c r7 = Ju.AbstractC14250d.c.f9171c
            r6.j(r7)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L73:
            com.avito.android.deeplink_handler.view.a$g r8 = r6.f136409h
            r8.g(r3, r4)
            kotlin.jvm.internal.l0$h r8 = new kotlin.jvm.internal.l0$h
            r8.<init>()
            com.avito.android.util.R0 r2 = r6.f136414m
            kotlinx.coroutines.scheduling.b r2 = r2.a()
            com.avito.android.developments_agency_search.deeplink.b r5 = new com.avito.android.developments_agency_search.deeplink.b
            r5.<init>(r6, r8, r3)
            r0.f136397q = r6
            r0.f136398r = r7
            r0.f136399s = r8
            r0.f136402v = r4
            java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r2, r5, r0)
            if (r0 != r1) goto L97
            return r1
        L97:
            r0 = r6
            r1 = r7
            r7 = r8
        L9a:
            com.avito.android.deeplink_handler.view.a$g r8 = r0.f136409h
            r2 = 0
            r8.g(r3, r2)
            T r7 = r7.f406842b
            com.avito.android.deep_linking.links.DeepLink r7 = (com.avito.android.deep_linking.links.DeepLink) r7
            if (r7 == 0) goto Lbb
            boolean r8 = r7 instanceof com.avito.android.deep_linking.links.NoMatchLink
            if (r8 != 0) goto Lab
            goto Lac
        Lab:
            r7 = r3
        Lac:
            if (r7 == 0) goto Lbb
            com.avito.android.developments_agency_search.deeplink.DealCabinetLink$c r8 = com.avito.android.developments_agency_search.deeplink.DealCabinetLink.c.f136361b
            com.avito.android.deeplink_handler.handler.composite.a r2 = r0.f136412k
            com.avito.android.deep_linking.links.DeepLink[] r7 = new com.avito.android.deep_linking.links.DeepLink[]{r7}
            r0.i(r8, r2, r7)
            kotlin.G0 r3 = kotlin.G0.f406611a
        Lbb:
            if (r3 != 0) goto Ld6
            com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments r7 = new com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments
            java.lang.String r8 = r1.f136360c
            java.lang.String r1 = r1.f136359b
            r7.<init>(r8, r1)
            rw.a r8 = r0.f136410i
            android.content.Intent r7 = r8.a(r7)
            com.avito.android.deeplink_handler.view.a$a r8 = r0.f136408g
            com.avito.android.deeplink_handler.view.a.InterfaceC4053a.C4054a.a(r8, r7)
            Ju.d$c r7 = Ju.AbstractC14250d.c.f9171c
            r0.j(r7)
        Ld6:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.deeplink.C29832c.o(com.avito.android.developments_agency_search.deeplink.DealCabinetLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
