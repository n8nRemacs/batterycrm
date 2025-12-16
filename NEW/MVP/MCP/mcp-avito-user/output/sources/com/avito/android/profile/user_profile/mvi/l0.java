package com.avito.android.profile.user_profile.mvi;

import android.content.Context;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import com.avito.android.remote.model.user_profile.items.EmptyAddressItem;
import com.avito.android.remote.model.user_profile.items.PhonesItem;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: UserProfileReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/l0;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l0 implements com.avito.android.arch.mvi.u<UserProfileInternalAction, UserProfileState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.u f226503b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.q f226504c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.active_orders.k f226505d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.wallet.a f226506e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.f f226507f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f226508g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final N90.p f226509h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N90.b f226510i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Context f226511j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final gD.f f226512k;

    @Inject
    public l0(@Y61.k com.avito.android.profile.user_profile.u uVar, @Y61.k com.avito.android.profile.user_profile.q qVar, @Y61.k com.avito.android.profile.user_profile.cards.active_orders.k kVar, @Y61.k com.avito.android.profile.user_profile.cards.wallet.a aVar, @Y61.k com.avito.android.lib.util.groupable_item.f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k N90.p pVar, @Y61.k N90.b bVar, @Y61.k Context context, @Y61.k gD.f fVar2) {
        this.f226503b = uVar;
        this.f226504c = qVar;
        this.f226505d = kVar;
        this.f226506e = aVar;
        this.f226507f = fVar;
        this.f226508g = interfaceC28373a;
        this.f226509h = pVar;
        this.f226510i = bVar;
        this.f226511j = context;
        this.f226512k = fVar2;
    }

    @Override // com.avito.android.arch.mvi.u
    public final UserProfileState a(UserProfileInternalAction userProfileInternalAction, UserProfileState userProfileState) {
        UserProfileResult userProfileResult;
        UserProfileResult userProfileResult2;
        UserProfileResult userProfileResult3;
        ArrayList arrayList;
        UserProfileState.Data dataA;
        UserProfileState.VisibleData visibleDataA;
        UserProfileResult userProfileResultCopy$default;
        ArrayList arrayList2;
        UserProfileResult userProfileResult4;
        UserProfileState.Data dataA2;
        UserProfileState.VisibleData visibleDataA2;
        UserProfileInternalAction userProfileInternalAction2 = userProfileInternalAction;
        UserProfileState userProfileState2 = userProfileState;
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.DataLoadingInProgress) {
            UserProfileState.f226447h.getClass();
            return UserProfileState.a(UserProfileState.f226448i, null, null, true, null, false, 59);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.DataLoaded) {
            UserProfileInternalAction.DataLoaded dataLoaded = (UserProfileInternalAction.DataLoaded) userProfileInternalAction2;
            CardItem.SilentUpdateItem silentUpdateItem = dataLoaded.f226420b;
            UserProfileResult userProfileResult5 = dataLoaded.f226421c;
            List<CardItem.PromoBlockItem> list = dataLoaded.f226422d;
            OrdersNeedActionResponse ordersNeedActionResponse = dataLoaded.f226423e;
            AvitoFinanceResponse avitoFinanceResponse = dataLoaded.f226424f;
            CardItem.AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem = dataLoaded.f226425g;
            return UserProfileState.a(userProfileState2, new UserProfileState.Data(silentUpdateItem, userProfileResult5, list, ordersNeedActionResponse, avitoFinanceResponse, avitoFinanceDynamicCardItem, null), c(silentUpdateItem, userProfileResult5, list, ordersNeedActionResponse, avitoFinanceResponse, avitoFinanceDynamicCardItem, null), false, null, false, 48);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.DataError) {
            return UserProfileState.a(userProfileState2, null, d(), false, ((UserProfileInternalAction.DataError) userProfileInternalAction2).f226418c, false, 16);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.LogoutError) {
            return UserProfileState.a(userProfileState2, null, d(), false, ((UserProfileInternalAction.LogoutError) userProfileInternalAction2).f226428b, false, 16);
        }
        boolean z12 = userProfileInternalAction2 instanceof UserProfileInternalAction.OnActiveServiceBookingsLoaded;
        UserProfileState.Data data = userProfileState2.f226449b;
        UserProfileState.VisibleData.HeaderState headerState = null;
        ArrayList arrayList3 = null;
        if (z12) {
            if (data == null || data.f226456c == null) {
                return userProfileState2;
            }
            UserProfileState.Data.ServiceBookingState serviceBookingState = new UserProfileState.Data.ServiceBookingState(((UserProfileInternalAction.OnActiveServiceBookingsLoaded) userProfileInternalAction2).f226430b, false, 2, null);
            return UserProfileState.a(userProfileState2, UserProfileState.Data.a(userProfileState2.f226449b, null, null, null, null, serviceBookingState, 63), c(data.f226455b, data.f226456c, data.f226457d, data.f226458e, data.f226459f, data.f226460g, serviceBookingState), false, null, false, 60);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.OnActiveServiceBookingsLoadingFailure) {
            if (data == null || data.f226456c == null) {
                return userProfileState2;
            }
            UserProfileState.Data.ServiceBookingState serviceBookingState2 = new UserProfileState.Data.ServiceBookingState(null, true, 1, null);
            return UserProfileState.a(userProfileState2, UserProfileState.Data.a(userProfileState2.f226449b, null, null, null, null, serviceBookingState2, 63), c(data.f226455b, data.f226456c, data.f226457d, data.f226458e, data.f226459f, data.f226460g, serviceBookingState2), false, null, false, 60);
        }
        boolean z13 = userProfileInternalAction2 instanceof UserProfileInternalAction.NotificationCenterCounterUpdate;
        UserProfileState.VisibleData visibleData = userProfileState2.f226450c;
        if (z13) {
            if (visibleData == null) {
                return userProfileState2;
            }
            UserProfileState.VisibleData.HeaderState headerState2 = visibleData.f226465c;
            int iIndexOf = headerState2.f226471d.indexOf((ActionMenu) this.f226503b.f226591c.getValue());
            if (iIndexOf != -1) {
                return UserProfileState.a(userProfileState2, null, UserProfileState.VisibleData.a(visibleData, new UserProfileState.VisibleData.HeaderState(headerState2.f226469b, headerState2.f226470c, headerState2.f226471d, headerState2.f226472e, new UserProfileState.VisibleData.HeaderState.NotificationsState(iIndexOf, ((UserProfileInternalAction.NotificationCenterCounterUpdate) userProfileInternalAction2).f226429b)), null, 29), false, null, false, 61);
            }
            return userProfileState2;
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.ShowLogoutProgress) {
            return UserProfileState.a(userProfileState2, null, null, false, null, true, 31);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.AuthorizationError) {
            UserProfileState.f226447h.getClass();
            return UserProfileState.a(UserProfileState.f226448i, null, d(), false, null, false, 44);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateVisibleItems) {
            return (data != null ? data.f226456c : null) != null ? UserProfileState.a(userProfileState2, null, c(data.f226455b, data.f226456c, data.f226457d, data.f226458e, data.f226459f, data.f226460g, data.f226461h), false, null, false, 61) : userProfileState2;
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.RemovePromoBlock) {
            if (data != null) {
                List<CardItem.PromoBlockItem> list2 = data.f226457d;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list2) {
                    if (!kotlin.jvm.internal.L.f((CardItem.PromoBlockItem) obj, ((UserProfileInternalAction.RemovePromoBlock) userProfileInternalAction2).f226440b)) {
                        arrayList4.add(obj);
                    }
                }
                dataA2 = UserProfileState.Data.a(data, null, arrayList4, null, null, null, 123);
            } else {
                dataA2 = null;
            }
            if (visibleData != null) {
                List<CardItem> list3 = visibleData.f226466d;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list3) {
                    if (!kotlin.jvm.internal.L.f((CardItem) obj2, ((UserProfileInternalAction.RemovePromoBlock) userProfileInternalAction2).f226440b)) {
                        arrayList5.add(obj2);
                    }
                }
                visibleDataA2 = UserProfileState.VisibleData.a(visibleData, null, arrayList5, 27);
            } else {
                visibleDataA2 = null;
            }
            return UserProfileState.a(userProfileState2, dataA2, visibleDataA2, false, null, false, 60);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.UpdatePhones) {
            if (data == null || (userProfileResult4 = data.f226456c) == null) {
                return userProfileState2;
            }
            List<UserProfileItem> items = userProfileResult4.getItems();
            if (items != null) {
                List<UserProfileItem> list4 = items;
                arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (UserProfileItem phonesItem : list4) {
                    if (phonesItem instanceof PhonesItem) {
                        phonesItem = new PhonesItem(((UserProfileInternalAction.UpdatePhones) userProfileInternalAction2).f226445b, ((PhonesItem) phonesItem).getVoipSessions(), null, 4, null);
                    }
                    arrayList3.add(phonesItem);
                }
            }
            UserProfileResult userProfileResultCopy$default2 = UserProfileResult.copy$default(userProfileResult4, arrayList3, null, null, null, null, 30, null);
            return UserProfileState.a(userProfileState2, UserProfileState.Data.a(userProfileState2.f226449b, userProfileResultCopy$default2, null, null, null, null, 125), c(data.f226455b, userProfileResultCopy$default2, data.f226457d, data.f226458e, data.f226459f, data.f226460g, data.f226461h), false, null, false, 60);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.HideSuggestedAddress) {
            if (data != null) {
                UserProfileResult userProfileResult6 = data.f226456c;
                if (userProfileResult6 != null) {
                    List<UserProfileItem> items2 = userProfileResult6.getItems();
                    if (items2 != null) {
                        List<UserProfileItem> list5 = items2;
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(list5, 10));
                        for (Object objCopy : list5) {
                            if (objCopy instanceof EmptyAddressItem) {
                                EmptyAddressItem emptyAddressItem = (EmptyAddressItem) objCopy;
                                objCopy = emptyAddressItem.copy((447 & 1) != 0 ? emptyAddressItem.geosessionId : null, (447 & 2) != 0 ? emptyAddressItem.badge : null, (447 & 4) != 0 ? emptyAddressItem.title : null, (447 & 8) != 0 ? emptyAddressItem.icon : null, (447 & 16) != 0 ? emptyAddressItem.description : null, (447 & 32) != 0 ? emptyAddressItem.image : null, (447 & 64) != 0 ? emptyAddressItem.suggestedAddress : null, (447 & 128) != 0 ? emptyAddressItem.profileAddress : null, (447 & 256) != 0 ? emptyAddressItem.action : null);
                            }
                            arrayList6.add(objCopy);
                        }
                        arrayList2 = arrayList6;
                    } else {
                        arrayList2 = null;
                    }
                    userProfileResultCopy$default = UserProfileResult.copy$default(userProfileResult6, arrayList2, null, null, null, null, 30, null);
                } else {
                    userProfileResultCopy$default = null;
                }
                dataA = UserProfileState.Data.a(data, userProfileResultCopy$default, null, null, null, null, 125);
            } else {
                dataA = null;
            }
            if (visibleData != null) {
                List<CardItem> list6 = visibleData.f226466d;
                ArrayList arrayList7 = new ArrayList(C42745f0.q(list6, 10));
                for (CardItem emptyAddressCardItem : list6) {
                    if (emptyAddressCardItem instanceof CardItem.EmptyAddressCardItem) {
                        CardItem.EmptyAddressCardItem emptyAddressCardItem2 = (CardItem.EmptyAddressCardItem) emptyAddressCardItem;
                        emptyAddressCardItem = new CardItem.EmptyAddressCardItem(emptyAddressCardItem2.f224392c, emptyAddressCardItem2.f224393d, emptyAddressCardItem2.f224394e, emptyAddressCardItem2.f224395f, emptyAddressCardItem2.f224396g, emptyAddressCardItem2.f224397h, emptyAddressCardItem2.f224398i, null, emptyAddressCardItem2.f224400k, emptyAddressCardItem2.f224401l);
                    }
                    arrayList7.add(emptyAddressCardItem);
                    headerState = null;
                }
                visibleDataA = UserProfileState.VisibleData.a(visibleData, headerState, arrayList7, 27);
            } else {
                visibleDataA = null;
            }
            return UserProfileState.a(userProfileState2, dataA, visibleDataA, false, null, false, 60);
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.ActiveOrdersUpdate) {
            if (data == null || data.f226456c == null) {
                return userProfileState2;
            }
            UserProfileInternalAction.ActiveOrdersUpdate activeOrdersUpdate = (UserProfileInternalAction.ActiveOrdersUpdate) userProfileInternalAction2;
            return UserProfileState.a(userProfileState2, UserProfileState.Data.a(data, null, null, activeOrdersUpdate.f226414b, null, null, 119), c(data.f226455b, data.f226456c, data.f226457d, activeOrdersUpdate.f226414b, data.f226459f, data.f226460g, data.f226461h), false, null, false, 60);
        }
        if (!(userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateWallet)) {
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateAvitoFinance) {
                if (data == null || (userProfileResult2 = data.f226456c) == null) {
                    return userProfileState2;
                }
                UserProfileInternalAction.UpdateAvitoFinance updateAvitoFinance = (UserProfileInternalAction.UpdateAvitoFinance) userProfileInternalAction2;
                return UserProfileState.a(userProfileState2, UserProfileState.Data.a(data, null, null, null, updateAvitoFinance.f226444b, null, 111), c(data.f226455b, userProfileResult2, data.f226457d, data.f226458e, updateAvitoFinance.f226444b, data.f226460g, data.f226461h), false, null, false, 60);
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateAvitoFinanceDynamic) {
                return (data == null || (userProfileResult = data.f226456c) == null) ? userProfileState2 : UserProfileState.a(userProfileState2, UserProfileState.Data.a(data, null, null, null, null, null, 95), c(data.f226455b, userProfileResult, data.f226457d, data.f226458e, data.f226459f, null, data.f226461h), false, null, false, 60);
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.HideSilentUpdateBanner) {
                return UserProfileState.a(userProfileState2, data != null ? UserProfileState.Data.a(data, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : null, visibleData != null ? UserProfileState.VisibleData.a(visibleData, null, null, 30) : null, false, null, false, 60);
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.CloseScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenMainScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenAvatarActionDialog ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenEditProfileScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenHelpCenter ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenLoginScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenNotificationCenter ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenPhotoPicker ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenProfileSettingsScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenSettings ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenShareDialog ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OpenUserAdvertsScreen ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.ShowSnackBar ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.ShowSuccessActionToast ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.ShowToastBar) {
                return userProfileState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (data == null || (userProfileResult3 = data.f226456c) == null) {
            return userProfileState2;
        }
        List<UserProfileItem> items3 = userProfileResult3.getItems();
        if (items3 != null) {
            List<UserProfileItem> list7 = items3;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list7, 10));
            for (Object obj3 : list7) {
                if (obj3 instanceof WalletItem) {
                    obj3 = ((UserProfileInternalAction.UpdateWallet) userProfileInternalAction2).f226446b;
                }
                arrayList8.add(obj3);
            }
            arrayList = arrayList8;
        } else {
            arrayList = null;
        }
        UserProfileResult userProfileResultCopy$default3 = UserProfileResult.copy$default(userProfileResult3, arrayList, null, null, null, null, 30, null);
        return UserProfileState.a(userProfileState2, UserProfileState.Data.a(userProfileState2.f226449b, userProfileResultCopy$default3, null, null, null, null, 125), c(data.f226455b, userProfileResultCopy$default3, data.f226457d, data.f226458e, data.f226459f, data.f226460g, data.f226461h), false, null, false, 60);
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ActionMenu(((Action) it.next()).getTitle(), 0, null, null, null, 28, null));
        }
        arrayList.addAll(arrayList2);
        com.avito.android.profile.user_profile.u uVar = this.f226503b;
        arrayList.add((ActionMenu) uVar.f226591c.getValue());
        arrayList.add((ActionMenu) uVar.f226590b.getValue());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0284  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.profile.user_profile.mvi.entity.UserProfileState.VisibleData c(com.avito.android.profile.user_profile.cards.CardItem.SilentUpdateItem r19, com.avito.android.remote.model.user_profile.UserProfileResult r20, java.util.List<com.avito.android.profile.user_profile.cards.CardItem.PromoBlockItem> r21, com.avito.android.activeOrders.OrdersNeedActionResponse r22, com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse r23, com.avito.android.profile.user_profile.cards.CardItem r24, com.avito.android.profile.user_profile.mvi.entity.UserProfileState.Data.ServiceBookingState r25) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.l0.c(com.avito.android.profile.user_profile.cards.CardItem$SilentUpdateItem, com.avito.android.remote.model.user_profile.UserProfileResult, java.util.List, com.avito.android.activeOrders.OrdersNeedActionResponse, com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse, com.avito.android.profile.user_profile.cards.CardItem, com.avito.android.profile.user_profile.mvi.entity.UserProfileState$Data$ServiceBookingState):com.avito.android.profile.user_profile.mvi.entity.UserProfileState$VisibleData");
    }

    public final UserProfileState.VisibleData d() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new UserProfileState.VisibleData(null, new UserProfileState.VisibleData.HeaderState(true, c42784z0, b(c42784z0), null, null, 24, null), c42784z0, null, null, 17, null);
    }
}
