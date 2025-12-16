package com.avito.android.profile.pro.impl.converters;

import B90.b;
import F90.a;
import SK0.b;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.ProfileProAvitoFinanceStubItem;
import com.avito.android.profile.pro.impl.screen.item.delivery_restriction.ProfileProDeliveryRestrictionBannerItem;
import com.avito.android.profile.pro.impl.screen.item.name.ProfileProNameItem;
import com.avito.android.profile.pro.impl.screen.item.rating.ProfileProRatingItem;
import com.avito.android.profile.pro.impl.screen.item.recommendations.ProfileProRecommendationsItem;
import com.avito.android.profile.pro.impl.screen.item.reputation.ProfileProReputationItem;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.ProfileProSbBlockStubItem;
import com.avito.android.profile.pro.impl.screen.item.walletandprepayment.ProfileProWalletAndPrepaymentItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import v90.InterfaceC49182a;

/* compiled from: ProfileProItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/q;", "Lcom/avito/android/profile/pro/impl/converters/p;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f222459a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f222460b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f222461c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49182a f222462d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33352g f222463e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33346a f222464f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SK0.b f222465g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33355j f222466h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final s f222467i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final E f222468j;

    @Inject
    public q(@Y61.k y yVar, @Y61.k v vVar, @Y61.k m mVar, @Y61.k InterfaceC49182a interfaceC49182a, @Y61.k InterfaceC33352g interfaceC33352g, @Y61.k InterfaceC33346a interfaceC33346a, @Y61.k SK0.b bVar, @Y61.k InterfaceC33355j interfaceC33355j, @Y61.k s sVar, @Y61.k E e12) {
        this.f222459a = yVar;
        this.f222460b = vVar;
        this.f222461c = mVar;
        this.f222462d = interfaceC49182a;
        this.f222463e = interfaceC33352g;
        this.f222464f = interfaceC33346a;
        this.f222465g = bVar;
        this.f222466h = interfaceC33355j;
        this.f222467i = sVar;
        this.f222468j = e12;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.profile.pro.impl.converters.p
    @Y61.k
    public final List a(@Y61.k ArrayList arrayList, @Y61.l OrdersNeedActionResponse ordersNeedActionResponse, @Y61.l TypedResult typedResult, @Y61.k com.avito.android.profile.pro.impl.interactor.a aVar) {
        List<com.avito.conveyor_item.a> listSingletonList;
        TypedResult typedResult2 = typedResult;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProfileTabWidget profileTabWidget = (ProfileTabWidget) it.next();
            if (profileTabWidget instanceof ProfileTabWidget.Passport) {
                listSingletonList = this.f222459a.a((ProfileTabWidget.Passport) profileTabWidget, aVar.f222683b);
            } else if (profileTabWidget instanceof ProfileTabWidget.c) {
                InterfaceC49182a interfaceC49182a = this.f222462d;
                if (typedResult2 != null && !interfaceC49182a.b(typedResult2)) {
                    b.a.a(this.f222465g, a.b.f4576b, null, null, null, 14);
                }
                listSingletonList = interfaceC49182a.a(typedResult2);
            } else if (profileTabWidget instanceof ProfileTabWidget.d) {
                listSingletonList = Collections.singletonList(new com.avito.android.profile.pro.impl.screen.item.beduin.e(((ProfileTabWidget.d) profileTabWidget).f222779c));
            } else if (profileTabWidget instanceof ProfileTabWidget.a) {
                listSingletonList = this.f222464f.a((ProfileTabWidget.a) profileTabWidget, aVar);
            } else if (profileTabWidget instanceof ProfileTabWidget.g) {
                ProfileTabWidget.g gVar = (ProfileTabWidget.g) profileTabWidget;
                listSingletonList = Collections.singletonList(new ProfileProNameItem(gVar.f222798c, "name", gVar.f222797b));
            } else if (profileTabWidget instanceof ProfileTabWidget.i) {
                ProfileTabWidget.i iVar = (ProfileTabWidget.i) profileTabWidget;
                listSingletonList = Collections.singletonList(new ProfileProRatingItem(iVar.f222806c, "rating", iVar.f222805b));
            } else {
                if (profileTabWidget instanceof ProfileTabWidget.h) {
                    listSingletonList = this.f222460b.a((ProfileTabWidget.h) profileTabWidget, ordersNeedActionResponse);
                } else if (profileTabWidget instanceof ProfileTabWidget.l) {
                    ProfileTabWidget.l lVar = (ProfileTabWidget.l) profileTabWidget;
                    ProfileTabWidget.l.b bVar = lVar.f222829b;
                    ProfileProWalletAndPrepaymentItem.Wallet wallet = new ProfileProWalletAndPrepaymentItem.Wallet(bVar.f222835a, bVar.f222836b, bVar.f222837c, bVar.f222838d);
                    ProfileTabWidget.l.a aVar2 = lVar.f222830c;
                    listSingletonList = Collections.singletonList(new ProfileProWalletAndPrepaymentItem("walletAndPrepayment", wallet, aVar2 != null ? new ProfileProWalletAndPrepaymentItem.Prepayment(aVar2.f222831a, aVar2.f222832b, aVar2.f222833c, aVar2.f222834d) : null));
                } else if (profileTabWidget instanceof ProfileTabWidget.ReputationAndRating) {
                    ProfileTabWidget.ReputationAndRating reputationAndRating = (ProfileTabWidget.ReputationAndRating) profileTabWidget;
                    String str = reputationAndRating.f222752b;
                    String str2 = reputationAndRating.f222753c;
                    boolean z12 = !(str2 == null || str2.length() == 0);
                    ProfileProReputationItem.f223440k.getClass();
                    ProfileTabWidget.ReputationAndRating.RepColor repColor = reputationAndRating.f222755e;
                    int i12 = repColor == null ? -1 : ProfileProReputationItem.a.C6765a.f223455a[repColor.ordinal()];
                    listSingletonList = Collections.singletonList(new ProfileProReputationItem("reputation", str, z12, reputationAndRating.f222754d, i12 != 1 ? i12 != 2 ? ProfileProReputationItem.ProfileProReputationItemColor.f223450b : ProfileProReputationItem.ProfileProReputationItemColor.f223451c : ProfileProReputationItem.ProfileProReputationItemColor.f223452d, reputationAndRating.f222756f, reputationAndRating.f222757g, reputationAndRating.f222758h, reputationAndRating.f222759i));
                } else if (profileTabWidget instanceof ProfileTabWidget.e) {
                    ProfileTabWidget.e eVar = (ProfileTabWidget.e) profileTabWidget;
                    AttributedText attributedText = eVar.f222781b;
                    ProfileTabWidget.e.a aVar3 = eVar.f222782c;
                    listSingletonList = Collections.singletonList(new ProfileProDeliveryRestrictionBannerItem("deliveryRestriction", attributedText, new ProfileProDeliveryRestrictionBannerItem.DeliveryRestrictionAction(aVar3.f222784a, aVar3.f222785b), eVar.f222783d));
                } else if (profileTabWidget instanceof ProfileTabWidget.j) {
                    ProfileTabWidget.j jVar = (ProfileTabWidget.j) profileTabWidget;
                    String str3 = jVar.f222808b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    ArrayList<ProfileTabWidget.j.a> arrayList3 = jVar.f222810d;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                    for (ProfileTabWidget.j.a aVar4 : arrayList3) {
                        arrayList4.add(new ProfileProRecommendationsItem.Item(aVar4.f222816f, aVar4.f222811a, aVar4.f222812b, aVar4.f222813c, aVar4.f222814d, aVar4.f222815e));
                    }
                    listSingletonList = Collections.singletonList(new ProfileProRecommendationsItem(jVar.f222809c, "recommendations", str3, arrayList4));
                } else if (profileTabWidget instanceof B90.d) {
                    listSingletonList = this.f222463e.a((B90.d) profileTabWidget);
                } else if (profileTabWidget instanceof ProfileTabWidget.k) {
                    listSingletonList = Collections.singletonList(new ProfileProSbBlockStubItem("serviceBookingStubBlock"));
                } else if (profileTabWidget instanceof ProfileTabWidget.f) {
                    listSingletonList = this.f222466h.a((ProfileTabWidget.f) profileTabWidget);
                } else if (profileTabWidget instanceof b.c) {
                    listSingletonList = this.f222461c.a((b.c) profileTabWidget);
                } else if (profileTabWidget instanceof b.C0038b) {
                    listSingletonList = this.f222467i.a((b.C0038b) profileTabWidget);
                } else if (profileTabWidget instanceof b.d) {
                    listSingletonList = this.f222468j.a((b.d) profileTabWidget);
                } else {
                    if (!(profileTabWidget instanceof ProfileTabWidget.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listSingletonList = Collections.singletonList(new ProfileProAvitoFinanceStubItem("avitoFinanceStubBlock"));
                }
                C42745f0.h(listSingletonList, arrayList2);
                typedResult2 = typedResult;
            }
            C42745f0.h(listSingletonList, arrayList2);
            typedResult2 = typedResult;
        }
        return arrayList2;
    }
}
