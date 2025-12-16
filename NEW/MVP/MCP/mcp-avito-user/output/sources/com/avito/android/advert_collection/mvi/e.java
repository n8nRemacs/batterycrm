package com.avito.android.advert_collection.mvi;

import I7.a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.advert_collection.i;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.OrderEntity;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.select.Arguments;
import com.avito.android.select.item_with_iconbutton.ItemWithIconButtonRightEntity;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import kv.C43501a;

/* compiled from: AdvertCollectionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LI7/a;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.arch.mvi.a<I7.a, AdvertCollectionInternalAction, AdvertCollectionState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.i f81564a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f81565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f81566c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f81567d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.l f81568e;

    @Inject
    public e(@Y61.k com.avito.android.advert_collection.i iVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.analytics.provider.e eVar, @Y61.k com.avito.android.advert_collection.l lVar) {
        this.f81564a = iVar;
        this.f81565b = nVar;
        this.f81566c = bVar;
        this.f81567d = eVar;
        this.f81568e = lVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AdvertCollectionInternalAction> b(I7.a aVar, AdvertCollectionState advertCollectionState) {
        C43210w c43210w;
        X x12;
        String str;
        String str2;
        String str3;
        I7.a aVar2 = aVar;
        AdvertCollectionState advertCollectionState2 = advertCollectionState;
        boolean zEquals = aVar2.equals(a.t.f7974a);
        com.avito.android.advert_collection.i iVar = this.f81564a;
        if (zEquals) {
            return iVar.b(advertCollectionState2.f81617d);
        }
        if (aVar2 instanceof a.d) {
            return iVar.h(((a.d) aVar2).f7957a.toString());
        }
        if (aVar2 instanceof a.s) {
            c43210w = new C43210w(new AdvertCollectionInternalAction.RetryLoadNextPage(((a.s) aVar2).f7973a));
        } else {
            boolean zEquals2 = aVar2.equals(a.n.f7967a);
            AdvertCollectionState.Actions actions = advertCollectionState2.f81619f;
            if (zEquals2) {
                kotlin.collections.builders.b bVarT = C42745f0.t();
                boolean z12 = actions.f81626g;
                com.avito.android.advert_collection.l lVar = this.f81568e;
                if (z12) {
                    bVarT.add(new ItemWithIconButtonRightEntity("publish", lVar.getF81548j(), "visibility", "questionFilled", "onboarding", "gray20"));
                }
                if (actions.f81627h) {
                    bVarT.add(new ItemWithIconButtonRightEntity("unpublish", lVar.getF81549k(), "visibilityOff", null, null, null, 56, null));
                }
                if (actions.f81621b != null) {
                    bVarT.add(new ItemWithIconButtonRightEntity("edit", lVar.getF81547i(), "edit", null, null, null, 56, null));
                }
                if (actions.f81623d) {
                    bVarT.add(new ItemWithIconButtonRightEntity("delete", lVar.getF81544f(), "delete", null, null, null, 56, null));
                }
                c43210w = new C43210w(new AdvertCollectionInternalAction.OpenSelectBottomSheet(new Arguments(false, "menuRequestId", null, C42745f0.p(bVarT), C42784z0.f406748b, "", null, false, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -134257851, 255, null)));
            } else {
                String str4 = null;
                if (aVar2 instanceof a.p) {
                    a.p pVar = (a.p) aVar2;
                    FavoriteAdvertItem favoriteAdvertItem = pVar.f7969a;
                    DeepLink deepLink = favoriteAdvertItem.f156415m;
                    if (deepLink == null) {
                        return C43175k.w();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("title", favoriteAdvertItem.f156405c);
                    bundle.putParcelable("tree_parent", new TreeClickStreamParent(this.f81567d.a(), "ADVERT_COLLECTION", null, null));
                    bundle.putLong("click_time", SystemClock.elapsedRealtime());
                    bundle.putString("price", favoriteAdvertItem.f156406d);
                    String str5 = favoriteAdvertItem.f156407e;
                    if (str5 != null) {
                        bundle.putString("old_price", str5);
                    }
                    Image image = pVar.f7970b;
                    if (image != null) {
                        bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
                    }
                    c43210w = new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(bundle, deepLink, null));
                } else if (aVar2 instanceof a.u) {
                    c43210w = new C43210w(new AdvertCollectionInternalAction.ShowSimilarAdverts(((a.u) aVar2).f7975a));
                } else {
                    if (aVar2 instanceof a.l) {
                        com.avito.android.favorite.n nVar = this.f81565b;
                        FavoriteAdvertItem favoriteAdvertItem2 = ((a.l) aVar2).f7965a;
                        nVar.Ld(favoriteAdvertItem2, null);
                        this.f81566c.c(favoriteAdvertItem2);
                        return C43175k.w();
                    }
                    if (aVar2.equals(a.b.f7955a)) {
                        c43210w = new C43210w(AdvertCollectionInternalAction.CloseScreen.f81571b);
                    } else if (aVar2 instanceof a.h) {
                        c43210w = new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(null, ((a.h) aVar2).f7961a, null));
                    } else {
                        boolean zEquals3 = aVar2.equals(a.o.f7968a);
                        AdvertCollectionState.OrderState orderState = advertCollectionState2.f81616c;
                        if (zEquals3) {
                            OrderEntity orderEntityC = orderState.c();
                            return orderEntityC == null ? C43175k.w() : new C43210w(new AdvertCollectionInternalAction.OpenSelectBottomSheet(new Arguments(false, "orderRequestId", null, orderState.f81631e, Collections.singletonList(orderEntityC), "", null, false, false, false, false, true, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -40123, 255, null)));
                        }
                        if (aVar2 instanceof a.q) {
                            OrderEntity orderEntity = ((a.q) aVar2).f7971a;
                            String str6 = orderEntity != null ? orderEntity.f156311b : null;
                            if (L.f(str6, orderState.f81629c)) {
                                return C43175k.w();
                            }
                            if (L.f(str6, "distance__asc")) {
                                return new C43207v(new AdvertCollectionInternalAction[]{new AdvertCollectionInternalAction.OrderSelected("distance__asc"), AdvertCollectionInternalAction.RequestLocation.f81601b});
                            }
                            if (orderEntity == null || (str2 = orderEntity.f156311b) == null) {
                                OrderEntity orderEntityD = orderState.d();
                                str2 = orderEntityD != null ? orderEntityD.f156311b : null;
                            }
                            if (orderEntity == null || (str3 = orderEntity.f156311b) == null) {
                                OrderEntity orderEntityD2 = orderState.d();
                                if (orderEntityD2 != null) {
                                    str4 = orderEntityD2.f156311b;
                                }
                            } else {
                                str4 = str3;
                            }
                            C43210w c43210w2 = new C43210w(new AdvertCollectionInternalAction.OrderSelected(str4));
                            String str7 = orderState.f81628b;
                            return C43175k.N(c43210w2, i.a.a(iVar, (str7 == null || str2 == null) ? P0.c() : Collections.singletonMap(str7, str2), 1));
                        }
                        if (aVar2.equals(a.f.f7959a)) {
                            c43210w = new C43210w(AdvertCollectionInternalAction.LocationNotFound.f81593b);
                        } else {
                            if (aVar2.equals(a.e.f7958a)) {
                                String str8 = orderState.f81628b;
                                return i.a.a(iVar, (str8 == null || (str = orderState.f81629c) == null) ? P0.c() : Collections.singletonMap(str8, str), 1);
                            }
                            if (aVar2.equals(a.c.f7956a)) {
                                return iVar.d();
                            }
                            if (aVar2.equals(a.r.f7972a)) {
                                return c(advertCollectionState2);
                            }
                            if (aVar2 instanceof a.i) {
                                return new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(null, com.avito.android.autoteka.helpers.b.b(com.avito.android.autoteka.helpers.b.f96647a, ((a.i) aVar2).f7962a, FromBlock.f96092l, null).f97068b, null));
                            }
                            if (!(aVar2 instanceof a.j)) {
                                if (!(aVar2 instanceof a.g)) {
                                    if (aVar2 instanceof a.k) {
                                        C43501a c43501a = ((a.k) aVar2).f7964a;
                                        com.avito.android.deeplink_handler.handler.bundle.a aVar3 = c43501a.f413260a;
                                        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                                        boolean z13 = interfaceC14249c instanceof m.c;
                                        String str9 = aVar3.f134521b;
                                        return (z13 && L.f(str9, "updateCollection")) ? C43175k.G(new c(interfaceC14249c, advertCollectionState2, null)) : (z13 && L.f(str9, "addItems")) ? c(advertCollectionState2) : C43175k.w();
                                    }
                                    if (aVar2.equals(a.C0448a.f7954a)) {
                                        DeepLink deepLink2 = actions.f81622c;
                                        return deepLink2 != null ? new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(null, deepLink2, "addItems")) : C43175k.w();
                                    }
                                    if (aVar2.equals(a.m.f7966a)) {
                                        return advertCollectionState2.f81620g.f81632b ? iVar.g() : iVar.e();
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                ItemWithIconButtonRightEntity itemWithIconButtonRightEntity = ((a.g) aVar2).f7960a;
                                String str10 = itemWithIconButtonRightEntity != null ? itemWithIconButtonRightEntity.f265545b : null;
                                if (str10 != null) {
                                    switch (str10.hashCode()) {
                                        case -1335458389:
                                            if (str10.equals("delete")) {
                                                c43210w = new C43210w(AdvertCollectionInternalAction.OpenDeleteCollectionDialog.f81597b);
                                                break;
                                            }
                                            break;
                                        case -235365105:
                                            if (str10.equals("publish")) {
                                                x12 = new X(iVar.f(true), new a(this, advertCollectionState2, null));
                                                return x12;
                                            }
                                            break;
                                        case 3108362:
                                            if (str10.equals("edit")) {
                                                DeepLink deepLink3 = actions.f81621b;
                                                return deepLink3 != null ? new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(null, deepLink3, "updateCollection")) : C43175k.w();
                                            }
                                            break;
                                        case 21116443:
                                            if (str10.equals("onboarding")) {
                                                c43210w = new C43210w(AdvertCollectionInternalAction.PublishOnboardingClick.f81600b);
                                                break;
                                            }
                                            break;
                                        case 1476436054:
                                            if (str10.equals("unpublish")) {
                                                x12 = new X(iVar.f(false), new b(this, advertCollectionState2, null));
                                                return x12;
                                            }
                                            break;
                                    }
                                }
                                return C43175k.w();
                            }
                            c43210w = new C43210w(new AdvertCollectionInternalAction.OpenDeeplink(null, ((a.j) aVar2).f7963a, null));
                        }
                    }
                }
            }
        }
        return c43210w;
    }

    public final X c(AdvertCollectionState advertCollectionState) {
        String str;
        C43210w c43210w = new C43210w(AdvertCollectionInternalAction.ShowSwipeToRefreshView.f81608b);
        AdvertCollectionState.OrderState orderState = advertCollectionState.f81616c;
        String str2 = orderState.f81628b;
        Map mapC = (str2 == null || (str = orderState.f81629c) == null) ? P0.c() : Collections.singletonMap(str2, str);
        com.avito.android.advert_collection.i iVar = this.f81564a;
        return new X(C43175k.N(c43210w, i.a.a(iVar, mapC, 1), iVar.a()), new d(3, null));
    }
}
