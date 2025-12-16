package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.deep_linking.links.DeepLink;
import ga.InterfaceC40639a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertSellerProfilePresenter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/F;", "Lcom/avito/android/advert_details_items/sellerprofile/E;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40639a f85560a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC28278h f85562c;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public ShowSellersProfileSource f85561b = ShowSellersProfileSource.f84282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f85563d = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f85564e = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f85565f = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f85566g = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f85567h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdvertSellerProfilePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85568a;

        static {
            int[] iArr = new int[SellerSubscriptionState.values().length];
            try {
                SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SellerSubscriptionState sellerSubscriptionState2 = SellerSubscriptionState.f85639b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85568a = iArr;
        }
    }

    @Inject
    public F(@Y61.k InterfaceC40639a interfaceC40639a) {
        this.f85560a = interfaceC40639a;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    @Y61.k
    /* renamed from: E3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85564e() {
        return this.f85564e;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    public final void J(@Y61.k InterfaceC28278h interfaceC28278h) {
        this.f85562c = interfaceC28278h;
        io.reactivex.rxjava3.disposables.c cVar = this.f85567h;
        cVar.e();
        cVar.b(interfaceC28278h.kb().t0(this.f85563d));
        cVar.b(interfaceC28278h.E3().t0(this.f85564e));
        io.reactivex.rxjava3.core.z<DeepLink> zVarV4 = interfaceC28278h.v4();
        if (zVarV4 != null) {
            cVar.b(zVarV4.t0(this.f85565f));
        }
        cVar.b(interfaceC28278h.Q1().t0(this.f85566g));
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    public final void Na(@Y61.k ShowSellersProfileSource showSellersProfileSource) {
        this.f85561b = showSellersProfileSource;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    @Y61.k
    /* renamed from: Q1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85566g() {
        return this.f85566g;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    public final void e0() {
        this.f85567h.e();
        this.f85562c = null;
    }

    @Override // S9.a
    @Y61.k
    /* renamed from: kb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85563d() {
        return this.f85563d;
    }

    @Override // S9.a
    @Y61.k
    /* renamed from: lb, reason: from getter */
    public final ShowSellersProfileSource getF85561b() {
        return this.f85561b;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.E
    @Y61.k
    /* renamed from: v4, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85565f() {
        return this.f85565f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    @Override // com.avito.android.advert_details_items.sellerprofile.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w4(@Y61.k com.avito.android.remote.model.AdvertSeller r27, @Y61.k com.avito.android.remote.model.advert_details.UserIconType r28, @Y61.l com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState r29, boolean r30, boolean r31) {
        /*
            r26 = this;
            r0 = r26
            com.avito.android.advert_details_items.sellerprofile.h r1 = r0.f85562c
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.String r3 = r27.getName()
            java.lang.String r4 = r27.getCompanyName()
            java.lang.String r5 = r27.getPostfix()
            java.lang.String r6 = r27.getSummary()
            java.lang.String r7 = r27.getManager()
            com.avito.android.remote.model.SellerAvatar r2 = r27.getAvatar()
            if (r2 == 0) goto L2a
            com.avito.android.remote.model.Image r2 = r2.getImage()
            if (r2 != 0) goto L28
            goto L2a
        L28:
            r10 = r2
            goto L2f
        L2a:
            com.avito.android.remote.model.Image r2 = r27.getImage()
            goto L28
        L2f:
            com.avito.android.remote.model.SellerRating r2 = r27.getRating()
            if (r2 == 0) goto L3e
            java.lang.Float r2 = r2.getScoreFloat()
            if (r2 != 0) goto L3c
            goto L3e
        L3c:
            r12 = r2
            goto L4e
        L3e:
            com.avito.android.remote.model.SellerRating r2 = r27.getRating()
            if (r2 == 0) goto L4d
            float r2 = r2.getScore()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L3c
        L4d:
            r12 = 0
        L4e:
            com.avito.android.remote.model.SellerRating r2 = r27.getRating()
            if (r2 == 0) goto L5a
            java.lang.String r2 = r2.getText()
            r13 = r2
            goto L5b
        L5a:
            r13 = 0
        L5b:
            java.lang.Boolean r2 = r27.isVerified()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r14 = kotlin.jvm.internal.L.f(r2, r9)
            com.avito.android.remote.model.badge_bar.SerpBadgeBar r2 = r27.getBadgeBar()
            if (r2 == 0) goto L71
            java.util.List r2 = r2.getBadges()
            r15 = r2
            goto L72
        L71:
            r15 = 0
        L72:
            com.avito.android.remote.model.service_seller_type.ServiceSellerType r16 = r27.getSellerType()
            com.avito.android.remote.model.SellerAvatar r2 = r27.getAvatar()
            if (r2 == 0) goto L82
            com.avito.android.remote.model.AvatarShape r2 = r2.getShape()
            r11 = r2
            goto L83
        L82:
            r11 = 0
        L83:
            if (r29 != 0) goto L87
            r2 = -1
            goto L8f
        L87:
            int[] r2 = com.avito.android.advert_details_items.sellerprofile.F.a.f85568a
            int r9 = r29.ordinal()
            r2 = r2[r9]
        L8f:
            ga.a r9 = r0.f85560a
            r8 = 1
            if (r2 == r8) goto La1
            r8 = 2
            if (r2 == r8) goto L9a
            r19 = 0
            goto La6
        L9a:
            java.lang.String r2 = r9.b()
        L9e:
            r19 = r2
            goto La6
        La1:
            java.lang.String r2 = r9.a()
            goto L9e
        La6:
            com.avito.android.deep_linking.links.DeepLink r20 = r27.getEntryPointShowEvent()
            ir.f r9 = new ir.f
            r2 = r9
            r8 = 0
            r24 = 1
            r21 = 0
            r22 = 262176(0x40020, float:3.67387E-40)
            r23 = 0
            r25 = r9
            r9 = r28
            r17 = r30
            r18 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.avito.android.deep_linking.links.DeepLink r2 = r27.getLink()
            if (r2 == 0) goto Lcd
            r8 = r24
        Lca:
            r2 = r25
            goto Lcf
        Lcd:
            r8 = 0
            goto Lca
        Lcf:
            r1.DZ(r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.sellerprofile.F.w4(com.avito.android.remote.model.AdvertSeller, com.avito.android.remote.model.advert_details.UserIconType, com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState, boolean, boolean):void");
    }
}
