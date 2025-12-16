package com.avito.android.extended_profile.search;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.InterfaceC30394c;
import com.avito.android.extended_profile.di.r;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpLink;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/search/k;", "Lcom/avito/android/extended_profile/search/d;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150515a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<N> f150516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.converter.a f150517c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30995b f150518d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f150519e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.location.a f150520f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f150521g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E f150522h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f150523i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30394c f150524j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R0 f150525k;

    /* renamed from: l, reason: collision with root package name */
    public final long f150526l;

    @Inject
    public k(@r.h @Y61.k String str, @Y61.k h31.e<N> eVar, @Y61.k com.avito.android.extended_profile.converter.a aVar, @Y61.k InterfaceC30995b interfaceC30995b, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k com.avito.android.extended_profile.location.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar, @Y61.k InterfaceC30394c interfaceC30394c, @Y61.k R0 r02, @Y61.k com.avito.android.analytics.provider.e eVar2) {
        this.f150515a = str;
        this.f150516b = eVar;
        this.f150517c = aVar;
        this.f150518d = interfaceC30995b;
        this.f150519e = searchParamsConverter;
        this.f150520f = aVar2;
        this.f150521g = interfaceC28373a;
        this.f150522h = e12;
        this.f150523i = bVar;
        this.f150524j = interfaceC30394c;
        this.f150525k = r02;
        this.f150526l = eVar2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.extended_profile.search.k r12, com.avito.android.remote.model.SearchParams r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof com.avito.android.extended_profile.search.e
            if (r0 == 0) goto L16
            r0 = r14
            com.avito.android.extended_profile.search.e r0 = (com.avito.android.extended_profile.search.e) r0
            int r1 = r0.f150492s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f150492s = r1
            goto L1b
        L16:
            com.avito.android.extended_profile.search.e r0 = new com.avito.android.extended_profile.search.e
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f150490q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f150492s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L69
            goto L51
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.C42729a0.b(r14)
            com.avito.android.inline_filters.b r5 = r12.f150518d     // Catch: java.lang.Throwable -> L69
            java.util.Map r7 = kotlin.collections.P0.c()     // Catch: java.lang.Throwable -> L69
            r11 = 60
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r13
            io.reactivex.rxjava3.core.z r12 = com.avito.android.inline_filters.InterfaceC30995b.a.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L69
            r0.f150492s = r4     // Catch: java.lang.Throwable -> L69
            java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.c(r12, r0)     // Catch: java.lang.Throwable -> L69
            if (r14 != r1) goto L51
            goto L6d
        L51:
            com.avito.android.remote.model.search.InlineFilters r14 = (com.avito.android.remote.model.search.InlineFilters) r14     // Catch: java.lang.Throwable -> L69
            com.avito.android.remote.model.search.Result r12 = r14.getResult()     // Catch: java.lang.Throwable -> L69
            if (r12 == 0) goto L69
            com.avito.android.remote.model.search.Header r12 = r12.getHeader()     // Catch: java.lang.Throwable -> L69
            if (r12 == 0) goto L69
            java.lang.Integer r12 = r12.getSelectedFiltersCount()     // Catch: java.lang.Throwable -> L69
            if (r12 == 0) goto L69
            int r3 = r12.intValue()     // Catch: java.lang.Throwable -> L69
        L69:
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.search.k.d(com.avito.android.extended_profile.search.k, com.avito.android.remote.model.SearchParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.extended_profile.search.k r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.avito.android.extended_profile.search.f
            if (r0 == 0) goto L16
            r0 = r5
            com.avito.android.extended_profile.search.f r0 = (com.avito.android.extended_profile.search.f) r0
            int r1 = r0.f150495s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f150495s = r1
            goto L1b
        L16:
            com.avito.android.extended_profile.search.f r0 = new com.avito.android.extended_profile.search.f
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f150493q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f150495s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r5)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r5)
            r0.f150495s = r3
            com.avito.android.extended_profile.location.a r4 = r4.f150520f
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L42
            goto L57
        L42:
            com.avito.android.remote.model.Location r5 = (com.avito.android.remote.model.Location) r5
            if (r5 == 0) goto L52
            java.lang.String r4 = r5.getId()
            java.lang.String r5 = "selectedLocationId"
            java.util.Map r4 = java.util.Collections.singletonMap(r5, r4)
        L50:
            r1 = r4
            goto L57
        L52:
            java.util.Map r4 = kotlin.collections.P0.c()
            goto L50
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.search.k.e(com.avito.android.extended_profile.search.k, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile.search.d
    @Y61.k
    public final C43152f0 a(@Y61.k a.C4397a c4397a) {
        InterfaceC43160i interfaceC43160iW;
        if (c4397a.f150256f) {
            interfaceC43160iW = C43175k.w();
        } else {
            interfaceC43160iW = C43175k.I(this.f150525k.a(), C43175k.G(new g(this, c4397a, null)));
        }
        return new C43152f0(interfaceC43160iW, new h(3, null));
    }

    @Override // com.avito.android.extended_profile.search.d
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileInternalAction> b(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.k ExtendedProfileSerpStartMode extendedProfileSerpStartMode) {
        SearchParams searchParams;
        String strA = this.f150522h.a();
        if (strA == null) {
            strA = "";
        }
        this.f150521g.c(new eA.k(strA, this.f150515a, str));
        InterfaceC30394c interfaceC30394c = this.f150524j;
        if (str2 != null || extendedProfileSerpStartMode != ExtendedProfileSerpStartMode.f152656b) {
            if (deepLink instanceof ExtendedProfileSerpLink) {
                ExtendedProfileSerpLink extendedProfileSerpLink = (ExtendedProfileSerpLink) deepLink;
                SearchParams searchParams2 = extendedProfileSerpLink.f152653d;
                if (searchParams2 == null || (searchParams = searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : str2, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null)) == null) {
                    searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 1, null);
                }
                return InterfaceC30394c.a.a(interfaceC30394c, null, new ExtendedProfileSerpLink(extendedProfileSerpLink.f152651b, extendedProfileSerpLink.f152652c, searchParams, extendedProfileSerpLink.f152654e, extendedProfileSerpStartMode), 5);
            }
        }
        return InterfaceC30394c.a.a(interfaceC30394c, null, deepLink, 5);
    }

    @Override // com.avito.android.extended_profile.search.d
    @Y61.k
    public final C43152f0 c(@Y61.k a.C4397a c4397a, boolean z12) {
        return new C43152f0(C43175k.I(this.f150525k.a(), C43175k.G(new i(c4397a, this, z12, null))), new j(c4397a, null));
    }
}
