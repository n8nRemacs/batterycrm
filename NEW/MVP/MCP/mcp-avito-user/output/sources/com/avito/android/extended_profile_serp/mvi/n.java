package com.avito.android.extended_profile_serp.mvi;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import android.os.SystemClock;
import bB.InterfaceC25487a;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.i1;
import com.avito.android.arch.mvi.a;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_phone_dialog.deep_linking.d;
import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.extended_profile_serp.InterfaceC30552o;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oB.u;
import okhttp3.internal.ws.WebSocketProtocol;
import sc.C48156e;

/* compiled from: ExtendedProfileSerpActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "LbB/a;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements com.avito.android.arch.mvi.a<InterfaceC25487a, ExtendedProfileSerpInternalAction, ExtendedProfileSerpState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSerpConfig f153021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30552o f153022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f153023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f153024d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f153025e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f153026f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.g f153027g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f153028h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final R0 f153029i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final E f153030j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C29640d f153031k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.search_input.suggest.a f153032l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C48156e f153033m = C48156e.f437918a;

    @Inject
    public n(@Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig, @Y61.k InterfaceC30552o interfaceC30552o, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.extended_profile_phone_dialog.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k E e12, @Y61.k C29640d c29640d, @Y61.k com.avito.android.extended_profile_ui_components.search_input.suggest.a aVar2) {
        this.f153021a = extendedProfileSerpConfig;
        this.f153022b = interfaceC30552o;
        this.f153023c = bVar;
        this.f153024d = nVar;
        this.f153025e = interfaceC31062w;
        this.f153026f = aVar;
        this.f153027g = gVar;
        this.f153028h = interfaceC28373a;
        this.f153029i = r02;
        this.f153030j = e12;
        this.f153031k = c29640d;
        this.f153032l = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileSerpInternalAction> b(InterfaceC25487a interfaceC25487a, ExtendedProfileSerpState extendedProfileSerpState) {
        InterfaceC43160i<ExtendedProfileSerpInternalAction> c43210w;
        Bundle bundleA;
        Bundle bundle;
        InterfaceC25487a interfaceC25487a2 = interfaceC25487a;
        ExtendedProfileSerpState extendedProfileSerpState2 = extendedProfileSerpState;
        if (interfaceC25487a2 instanceof InterfaceC25487a.d) {
            return C43175k.G(new g(this, extendedProfileSerpState2, null));
        }
        if (interfaceC25487a2 instanceof InterfaceC25487a.q) {
            return C43175k.G(new h(interfaceC25487a2, this, extendedProfileSerpState2, null));
        }
        if (interfaceC25487a2 instanceof InterfaceC25487a.p) {
            return C43175k.G(new i(interfaceC25487a2, this, extendedProfileSerpState2, null));
        }
        boolean z12 = interfaceC25487a2 instanceof InterfaceC25487a.o;
        SearchParams searchParams = extendedProfileSerpState2.f152954d;
        C30558v c30558v = extendedProfileSerpState2.f152955e;
        if (z12) {
            if (c30558v == null || !c30558v.f153120k) {
                return C43175k.w();
            }
            c43210w = new f(this.f153032l.b(((InterfaceC25487a.o) interfaceC25487a2).f56964a, searchParams.getCategoryId()));
        } else {
            if (interfaceC25487a2 instanceof InterfaceC25487a.j) {
                return C43175k.G(new j(interfaceC25487a2, this, extendedProfileSerpState2, null));
            }
            boolean z13 = interfaceC25487a2 instanceof InterfaceC25487a.C1993a;
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f153026f;
            if (z13) {
                InterfaceC25487a.C1993a c1993a = (InterfaceC25487a.C1993a) interfaceC25487a2;
                AdvertItem advertItem = c1993a.f56948a;
                if (advertItem.f268396O instanceof AdvertDetailsLink) {
                    bundle = new Bundle();
                    bundle.putString("title", advertItem.f268428d);
                    bundle.putString("key_category_id", advertItem.f268420a0);
                    bundle.putLong("click_time", SystemClock.elapsedRealtime());
                    bundle.putParcelable("screen_source", ScreenSource.EXTENDED_PROFILE.f251780d);
                    String str = advertItem.f268440i;
                    if (str != null) {
                        bundle.putString("price", str);
                    }
                    String str2 = advertItem.f268446l;
                    if (str2 != null) {
                        bundle.putString("old_price", str2);
                    }
                    Image image = c1993a.f56949b;
                    if (image != null) {
                        bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
                    }
                } else {
                    bundle = null;
                }
                b.a.a(aVar, advertItem.f268396O, null, bundle, 2);
                return C43175k.w();
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.b) {
                S s5 = ((InterfaceC25487a.b) interfaceC25487a2).f56950a;
                this.f153024d.Ld(s5, null);
                this.f153023c.c(s5);
                return C43175k.w();
            }
            boolean z14 = interfaceC25487a2 instanceof InterfaceC25487a.l;
            InterfaceC30552o interfaceC30552o = this.f153022b;
            int i12 = extendedProfileSerpState2.f152963m;
            if (z14) {
                return ((InterfaceC25487a.l) interfaceC25487a2).f56961a ? InterfaceC30552o.a.a(interfaceC30552o, 0, searchParams, c30558v, 5) : InterfaceC30552o.a.a(interfaceC30552o, i12 + 1, searchParams, c30558v, 4);
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.c) {
                return interfaceC30552o.a(i12 + 1, searchParams, false, c30558v);
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.e) {
                return C43175k.G(new d(this, extendedProfileSerpState2, null));
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.i) {
                return C43175k.G(new k(interfaceC25487a2, this, extendedProfileSerpState2, null));
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.f) {
                return C43175k.G(new b(((InterfaceC25487a.f) interfaceC25487a2).f56954a, this, extendedProfileSerpState2, null, null));
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.m) {
                DeepLink deepLink = ((InterfaceC25487a.m) interfaceC25487a2).f56962a;
                return deepLink instanceof ItemsSearchLink ? InterfaceC30552o.a.a(interfaceC30552o, 0, ((ItemsSearchLink) deepLink).f133403b, c30558v, 1) : C43175k.G(new b(deepLink, this, extendedProfileSerpState2, null, null));
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.r) {
                return C43175k.G(new l(extendedProfileSerpState2, null));
            }
            if (interfaceC25487a2 instanceof InterfaceC25487a.s) {
                c43210w = new C43210w(ExtendedProfileSerpInternalAction.UpdateItems.f152949b);
            } else if (interfaceC25487a2 instanceof InterfaceC25487a.h) {
                c43210w = new C43210w(ExtendedProfileSerpInternalAction.OnPhoneCallCanceled.f152936b);
            } else {
                boolean z15 = interfaceC25487a2 instanceof InterfaceC25487a.g;
                ExtendedProfileSerpConfig extendedProfileSerpConfig = this.f153021a;
                if (z15) {
                    InterfaceC14249c interfaceC14249c = ((InterfaceC25487a.g) interfaceC25487a2).f56956b;
                    if (interfaceC14249c instanceof d.b.C4431d) {
                        return new C43210w(new ExtendedProfileSerpInternalAction.ShowPhoneDialog(((d.b.C4431d) interfaceC14249c).f151579c, this.f153030j.a(), extendedProfileSerpConfig.f152442b));
                    }
                    if (interfaceC14249c instanceof JobApplyCreateLink.b.a) {
                        b.a.a(aVar, ((JobApplyCreateLink.b.a) interfaceC14249c).f134084b, null, null, 6);
                        return C43175k.w();
                    }
                    if (interfaceC14249c instanceof JobApplyCreateLink.b.C4032b) {
                        b.a.a(aVar, ((JobApplyCreateLink.b.C4032b) interfaceC14249c).f134085b, null, null, 6);
                        return C43175k.w();
                    }
                    if (!(interfaceC14249c instanceof CvValidationLink.b.C3943b)) {
                        return C43175k.w();
                    }
                    b.a.a(aVar, new CreateChannelLink(((CvValidationLink.b.C3943b) interfaceC14249c).f131799b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null), null, null, 6);
                    return C43175k.w();
                }
                if (interfaceC25487a2 instanceof InterfaceC25487a.k) {
                    return C43175k.G(new e(this, (InterfaceC25487a.k) interfaceC25487a2, null));
                }
                if (interfaceC25487a2 instanceof InterfaceC25487a.t) {
                    oB.k kVar = ((InterfaceC25487a.t) interfaceC25487a2).f56969a;
                    if (kVar instanceof u.b) {
                        return C43175k.G(new b(((u.b) kVar).f419533b, this, extendedProfileSerpState2, null, null));
                    }
                    if (!(kVar instanceof u.a)) {
                        return C43175k.w();
                    }
                    u.a aVar2 = (u.a) kVar;
                    DeepLink deepLink2 = aVar2.f419531b;
                    String fromSpace = SearchParamsSegmentParser.INSTANCE.fromParam(extendedProfileSerpConfig.f152444d).getFromSpace();
                    PhoneRequestLink phoneRequestLink = deepLink2 instanceof PhoneRequestLink ? (PhoneRequestLink) deepLink2 : null;
                    if (phoneRequestLink != null) {
                        bundleA = PhoneRequestDeepLinkAnalyticsData.a.a(PhoneRequestDeepLinkAnalyticsData.f92253b, new PhoneRequestDeepLinkAnalyticsData.ExtendedProfile(c30558v != null ? c30558v.f153115f : null, extendedProfileSerpConfig.f152442b, phoneRequestLink.f92281b, phoneRequestLink.f92282c, "s", c30558v != null ? c30558v.f153113d : null, fromSpace));
                    } else {
                        bundleA = null;
                    }
                    return C43175k.N(C43175k.I(this.f153029i.a(), C43175k.G(new a(this, extendedProfileSerpState2, deepLink2, aVar2.f419532c, null))), C43175k.G(new b(deepLink2, this, extendedProfileSerpState2, bundleA, null)));
                }
                if (!(interfaceC25487a2 instanceof InterfaceC25487a.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                String query = searchParams.getQuery();
                if (query == null) {
                    query = "";
                }
                c43210w = new C43210w(new ExtendedProfileSerpInternalAction.UpdateSearchInputText(query));
            }
        }
        return c43210w;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.avito.android.extended_profile_serp.mvi.m
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.extended_profile_serp.mvi.m r0 = (com.avito.android.extended_profile_serp.mvi.m) r0
            int r1 = r0.f153020w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153020w = r1
            goto L18
        L13:
            com.avito.android.extended_profile_serp.mvi.m r0 = new com.avito.android.extended_profile_serp.mvi.m
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f153018u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f153020w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r10 = r0.f153017t
            java.lang.String r8 = r0.f153016s
            com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState r7 = r0.f153015r
            com.avito.android.extended_profile_serp.mvi.n r9 = r0.f153014q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L31
            goto L52
        L31:
            r11 = move-exception
            goto L59
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.C42729a0.b(r11)
            com.avito.android.extended_profile_phone_dialog.g r11 = r6.f153027g     // Catch: java.lang.Throwable -> L57
            r0.f153014q = r6     // Catch: java.lang.Throwable -> L57
            r0.f153015r = r7     // Catch: java.lang.Throwable -> L57
            r0.f153016s = r8     // Catch: java.lang.Throwable -> L57
            r0.f153017t = r10     // Catch: java.lang.Throwable -> L57
            r0.f153020w = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r9 = r11.a(r8, r9, r0)     // Catch: java.lang.Throwable -> L57
            if (r9 != r1) goto L51
            return r1
        L51:
            r9 = r6
        L52:
            r1 = r8
            r4 = r10
            goto L63
        L55:
            r9 = r6
            goto L59
        L57:
            r11 = move-exception
            goto L55
        L59:
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            java.lang.String r1 = "DEFAULT_TAG"
            java.lang.String r2 = "ExtendedProfileSerpActor"
            r0.a(r1, r2, r11)
            goto L52
        L63:
            com.avito.android.analytics.a r8 = r9.f153028h
            com.avito.android.analytics.event.r$a r0 = com.avito.android.analytics.event.r.f90128e
            com.avito.android.extended_profile_serp.v r7 = r7.f152955e
            r10 = 0
            if (r7 == 0) goto L70
            java.lang.String r11 = r7.f153113d
            r2 = r11
            goto L71
        L70:
            r2 = r10
        L71:
            if (r7 == 0) goto L77
            java.lang.Integer r7 = r7.f153115f
            r3 = r7
            goto L78
        L77:
            r3 = r10
        L78:
            r5 = 24
            com.avito.android.analytics.event.r r7 = com.avito.android.analytics.event.r.a.b(r0, r1, r2, r3, r4, r5)
            r8.c(r7)
            sc.e r7 = r9.f153033m
            r7.a()
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_serp.mvi.n.c(com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(ExtendedProfileSerpState extendedProfileSerpState, String str, String str2) {
        i1.a aVar = i1.f90069v;
        String str3 = this.f153021a.f152442b;
        C30558v c30558v = extendedProfileSerpState.f152955e;
        String str4 = c30558v != null ? c30558v.f153113d : null;
        String str5 = c30558v != null ? c30558v.f153114e : null;
        Integer num = c30558v != null ? c30558v.f153115f : null;
        aVar.getClass();
        C29640d c29640d = this.f153031k;
        InterfaceC28373a interfaceC28373a = this.f153028h;
        interfaceC28373a.c(new i1(c29640d, interfaceC28373a, 0L, str4, str3, str5, num, (String) null, (String) null, str, str2, (C42822w) null));
        this.f153033m.a();
    }
}
