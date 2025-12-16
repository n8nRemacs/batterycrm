package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.advert_list.progress.a;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertsListNextPageDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.user_adverts.tab_screens.converters.g;
import com.avito.android.user_adverts.tab_screens.converters.j;
import eJ0.InterfaceC40015b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/U;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class U implements com.avito.android.arch.mvi.u<UserAdvertsListInternalAction, UserAdvertsListState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_screens.converters.j f315267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_screens.converters.g f315268c;

    /* compiled from: UserAdvertsListReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UserAdvertsListParams.SearchInfo.StartType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsListParams.SearchInfo.StartType startType = UserAdvertsListParams.SearchInfo.StartType.f314705b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public U(@Y61.k com.avito.android.user_adverts.tab_screens.converters.j jVar, @Y61.k com.avito.android.user_adverts.tab_screens.converters.g gVar) {
        this.f315267b = jVar;
        this.f315268c = gVar;
    }

    public static UserAdvertsListState.ViewState c(U u12, UserAdvertsListState userAdvertsListState, UserAdvertsListState.ChoiceMode choiceMode, UserAdvertsListState.DataState dataState, int i12) {
        if ((i12 & 1) != 0) {
            choiceMode = userAdvertsListState.f315397o;
        }
        if ((i12 & 2) != 0) {
            dataState = userAdvertsListState.f315396n;
        }
        return u12.b(userAdvertsListState, choiceMode, dataState);
    }

    @Override // com.avito.android.arch.mvi.u
    public final UserAdvertsListState a(UserAdvertsListInternalAction userAdvertsListInternalAction, UserAdvertsListState userAdvertsListState) {
        UserAdvertsSearchStartFromType userAdvertsSearchStartFromType;
        UserAdvertActionsInfoDomain userAdvertActionsInfoDomain;
        UserAdvertActionsInfoDomain userAdvertActionsInfoDomain2;
        ArrayList arrayListH0;
        UserAdvertsListState.ChoiceMode multiply;
        UserAdvertsListInternalAction userAdvertsListInternalAction2 = userAdvertsListInternalAction;
        UserAdvertsListState userAdvertsListState2 = userAdvertsListState;
        Object obj = null;
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingError) {
            InterfaceC40015b.a aVar = ((UserAdvertsListInternalAction.LoadingError) userAdvertsListInternalAction2).f315344b;
            UserAdvertsListState.DataState.Error error = new UserAdvertsListState.DataState.Error(aVar.f395102a, aVar.f395103b);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, error, null, c(this, userAdvertsListState2, null, error, 1), null, 45055);
        }
        boolean z12 = userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingResult;
        UserAdvertsListState.ChoiceMode choiceMode = userAdvertsListState2.f315397o;
        com.avito.android.user_adverts.tab_screens.converters.g gVar = this.f315268c;
        if (z12) {
            UserAdvertsListInternalAction.LoadingResult loadingResult = (UserAdvertsListInternalAction.LoadingResult) userAdvertsListInternalAction2;
            UserAdvertsListState.DataState.Loaded loadedB = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2);
            boolean z13 = loadingResult.f315352c;
            InterfaceC40015b.C11066b c11066b = loadingResult.f315351b;
            if (z13) {
                List<UserAdvertsBaseItemDomain> list = loadedB != null ? loadedB.f315409b : null;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                arrayListH0 = C42745f0.h0(c11066b.f395104a, list);
            } else {
                arrayListH0 = c11066b.f395104a;
            }
            ArrayList arrayList = arrayListH0;
            if (choiceMode instanceof UserAdvertsListState.ChoiceMode.Multiply) {
                UserAdvertsListState.ChoiceMode.Multiply multiply2 = (UserAdvertsListState.ChoiceMode.Multiply) choiceMode;
                UserAdvertActionsInfoDomain userAdvertActionsInfoDomain3 = c11066b.f395107d;
                multiply = userAdvertActionsInfoDomain3 == null ? UserAdvertsListState.ChoiceMode.None.f315402b : new UserAdvertsListState.ChoiceMode.Multiply(gVar.c(multiply2.f315400b, gVar.a(arrayList)), userAdvertActionsInfoDomain3);
            } else {
                boolean z14 = choiceMode instanceof UserAdvertsListState.ChoiceMode.None;
                UserAdvertsListState.ChoiceMode choiceMode2 = choiceMode;
                if (!z14) {
                    if (!(choiceMode instanceof UserAdvertsListState.ChoiceMode.Single)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserAdvertsListState.ChoiceMode.Single single = (UserAdvertsListState.ChoiceMode.Single) choiceMode;
                    if (z13) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            UserAdvertsBaseItemDomain userAdvertsBaseItemDomain = (UserAdvertsBaseItemDomain) next;
                            if ((userAdvertsBaseItemDomain instanceof UserAdvertItemDomain) && kotlin.jvm.internal.L.f(((UserAdvertItemDomain) userAdvertsBaseItemDomain).f315030P, single.getF315406b())) {
                                obj = next;
                                break;
                            }
                        }
                        choiceMode2 = single;
                        if (((UserAdvertsBaseItemDomain) obj) == null) {
                            choiceMode2 = UserAdvertsListState.ChoiceMode.None.f315402b;
                        }
                    } else {
                        choiceMode2 = UserAdvertsListState.ChoiceMode.None.f315402b;
                    }
                }
                multiply = choiceMode2;
            }
            UserAdvertsListState.DataState.Loaded loaded = new UserAdvertsListState.DataState.Loaded(arrayList, c11066b.f395105b, c11066b.f395106c, c11066b.f395107d, false, (loadedB != null ? loadedB.f315414g : 0) + 1);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, loaded, multiply, b(userAdvertsListState2, multiply, loaded), null, 36863);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingStart) {
            UserAdvertsListState.DataState.Loading loading = UserAdvertsListState.DataState.Loading.f315415b;
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, loading, null, c(this, userAdvertsListState2, null, loading, 1), null, 45055);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingSearch) {
            UserAdvertsListInternalAction.LoadingSearch loadingSearch = (UserAdvertsListInternalAction.LoadingSearch) userAdvertsListInternalAction2;
            UserAdvertsListState.DataState.Loading loading2 = UserAdvertsListState.DataState.Loading.f315415b;
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, loadingSearch.f315357d, loadingSearch.f315358e, loadingSearch.f315359f, loadingSearch.f315360g, loadingSearch.f315361h, loading2, null, c(this, userAdvertsListState2, null, loading2, 1), null, 41087);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.AdvertsUnselected) {
            if (!(choiceMode instanceof UserAdvertsListState.ChoiceMode.Multiply)) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.None none = UserAdvertsListState.ChoiceMode.None.f315402b;
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, none, c(this, userAdvertsListState2, none, null, 2), null, 40959);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.AdvertsGroupSelected) {
            UserAdvertsListInternalAction.AdvertsGroupSelected advertsGroupSelected = (UserAdvertsListInternalAction.AdvertsGroupSelected) userAdvertsListInternalAction2;
            UserAdvertsListState.DataState.Loaded loadedB2 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2);
            if (loadedB2 == null || (userAdvertActionsInfoDomain2 = loadedB2.f315412e) == null) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.Multiply multiply3 = new UserAdvertsListState.ChoiceMode.Multiply(gVar.b(choiceMode instanceof UserAdvertsListState.ChoiceMode.Multiply ? ((UserAdvertsListState.ChoiceMode.Multiply) choiceMode).f315400b : gVar.a(loadedB2.f315409b), new g.a.b(advertsGroupSelected.f315338b, advertsGroupSelected.f315339c)), userAdvertActionsInfoDomain2);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, multiply3, c(this, userAdvertsListState2, multiply3, null, 2), null, 40959);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.AdvertSelected) {
            UserAdvertsListInternalAction.AdvertSelected advertSelected = (UserAdvertsListInternalAction.AdvertSelected) userAdvertsListInternalAction2;
            UserAdvertsListState.DataState.Loaded loadedB3 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2);
            if (loadedB3 == null || (userAdvertActionsInfoDomain = loadedB3.f315412e) == null) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.Multiply multiply4 = new UserAdvertsListState.ChoiceMode.Multiply(gVar.b(choiceMode instanceof UserAdvertsListState.ChoiceMode.Multiply ? ((UserAdvertsListState.ChoiceMode.Multiply) choiceMode).f315400b : gVar.a(loadedB3.f315409b), new g.a.C9789a(advertSelected.f315334b, advertSelected.f315335c, advertSelected.f315336d)), userAdvertActionsInfoDomain);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, multiply4, c(this, userAdvertsListState2, multiply4, null, 2), null, 40959);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.ClosePositionAnimation) {
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, null, c(this, userAdvertsListState2, null, null, 3), null, 49151);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.ParamsChanged) {
            UserAdvertsListInternalAction.ParamsChanged paramsChanged = (UserAdvertsListInternalAction.ParamsChanged) userAdvertsListInternalAction2;
            UserAdvertsListParams userAdvertsListParams = paramsChanged.f315367b;
            UserAdvertsListParams.UserInfo userInfo = userAdvertsListParams.f314697c;
            UserAdvertsSpace userAdvertsSpace = userInfo.f314714b;
            UserAdvertsListParams.ShortcutInfo shortcutInfo = userAdvertsListParams.f314696b;
            int i12 = shortcutInfo.f314711d;
            UserAdvertsListParams.SearchInfo searchInfo = userAdvertsListParams.f314698d;
            String str = searchInfo.f314700b;
            int iOrdinal = searchInfo.f314704f.ordinal();
            if (iOrdinal == 0) {
                userAdvertsSearchStartFromType = UserAdvertsSearchStartFromType.f312778b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                userAdvertsSearchStartFromType = UserAdvertsSearchStartFromType.f312779c;
            }
            return UserAdvertsListState.a(userAdvertsListState2, userAdvertsSpace, userInfo.f314715c, i12, shortcutInfo.f314712e, userInfo.f314716d, userInfo.f314717e, str, userAdvertsSearchStartFromType, searchInfo.f314701c, searchInfo.f314702d, searchInfo.f314703e, null, null, null, paramsChanged.f315367b, 28673);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.ProfileStatesChanged) {
            UserAdvertsListInternalAction.ProfileStatesChanged profileStatesChanged = (UserAdvertsListInternalAction.ProfileStatesChanged) userAdvertsListInternalAction2;
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, profileStatesChanged.f315368b, profileStatesChanged.f315369c, null, null, false, null, null, null, null, null, null, 65439);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingMore) {
            UserAdvertsListState.DataState.Loaded loadedB4 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2);
            return loadedB4 == null ? userAdvertsListState2 : UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, new UserAdvertsListState.DataState.Loaded(loadedB4.f315409b, loadedB4.f315410c, loadedB4.f315411d, loadedB4.f315412e, true, loadedB4.f315414g), null, null, null, 61439);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.SingeSelectLoaded) {
            UserAdvertsListInternalAction.SingeSelectLoaded singeSelectLoaded = (UserAdvertsListInternalAction.SingeSelectLoaded) userAdvertsListInternalAction2;
            if (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2) == null) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.Single.Loaded loaded2 = new UserAdvertsListState.ChoiceMode.Single.Loaded(singeSelectLoaded.f315375b, singeSelectLoaded.f315376c, singeSelectLoaded.f315377d);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, loaded2, c(this, userAdvertsListState2, loaded2, null, 2), null, 40959);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.SingleSelect) {
            UserAdvertsListInternalAction.SingleSelect singleSelect = (UserAdvertsListInternalAction.SingleSelect) userAdvertsListInternalAction2;
            if (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2) == null) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.Single.Loading loading3 = new UserAdvertsListState.ChoiceMode.Single.Loading(singleSelect.f315378b);
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, loading3, c(this, userAdvertsListState2, loading3, null, 2), null, 40959);
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.SingleSelectError) {
            if (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2) == null) {
                return userAdvertsListState2;
            }
            UserAdvertsListState.ChoiceMode.None none2 = UserAdvertsListState.ChoiceMode.None.f315402b;
            return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, none2, c(this, userAdvertsListState2, none2, null, 2), null, 40959);
        }
        if (!(userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.SingleUnselect)) {
            if ((userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.NoChange) || (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.RefreshingStart)) {
                return userAdvertsListState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        UserAdvertsListInternalAction.SingleUnselect singleUnselect = (UserAdvertsListInternalAction.SingleUnselect) userAdvertsListInternalAction2;
        if (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState2) == null || !(choiceMode instanceof UserAdvertsListState.ChoiceMode.Single) || !kotlin.jvm.internal.L.f(((UserAdvertsListState.ChoiceMode.Single) choiceMode).getF315406b(), singleUnselect.f315383b)) {
            return userAdvertsListState2;
        }
        UserAdvertsListState.ChoiceMode.None none3 = UserAdvertsListState.ChoiceMode.None.f315402b;
        return UserAdvertsListState.a(userAdvertsListState2, null, false, 0, 0, null, null, null, null, false, null, null, null, none3, c(this, userAdvertsListState2, none3, null, 2), null, 40959);
    }

    public final UserAdvertsListState.ViewState b(UserAdvertsListState userAdvertsListState, UserAdvertsListState.ChoiceMode choiceMode, UserAdvertsListState.DataState dataState) {
        j.a.InterfaceC9790a cVar;
        j.a.InterfaceC9790a interfaceC9790a;
        if (dataState instanceof UserAdvertsListState.DataState.Error) {
            UserAdvertsListState.DataState.Error error = (UserAdvertsListState.DataState.Error) dataState;
            return new UserAdvertsListState.ViewState(Collections.singletonList(new com.avito.android.user_adverts.tab_screens.advert_list.progress.a(new a.AbstractC9732a.b(error.f315407b, com.avito.android.error.z.k(error.f315407b)))));
        }
        if (!(dataState instanceof UserAdvertsListState.DataState.Loaded)) {
            if (dataState instanceof UserAdvertsListState.DataState.Loading) {
                return new UserAdvertsListState.ViewState(Collections.singletonList(new com.avito.android.user_adverts.tab_screens.advert_list.progress.a(a.AbstractC9732a.C9733a.f314751a)));
            }
            if (dataState instanceof UserAdvertsListState.DataState.None) {
                return new UserAdvertsListState.ViewState(null, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        UserAdvertsListState.DataState.Loaded loaded = (UserAdvertsListState.DataState.Loaded) dataState;
        String str = userAdvertsListState.f315384b;
        if (userAdvertsListState.c() && loaded.f315409b.isEmpty()) {
            return new UserAdvertsListState.ViewState(Collections.singletonList(com.avito.android.user_adverts.tab_screens.advert_list.empty_search.a.f314735b));
        }
        UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = loaded.f315412e;
        if (choiceMode instanceof UserAdvertsListState.ChoiceMode.Multiply) {
            cVar = new j.a.InterfaceC9790a.C9791a(((UserAdvertsListState.ChoiceMode.Multiply) choiceMode).f315400b);
        } else {
            if (choiceMode instanceof UserAdvertsListState.ChoiceMode.None) {
                interfaceC9790a = j.a.InterfaceC9790a.b.f315802a;
                return new UserAdvertsListState.ViewState(this.f315267b.a(new j.a(userAdvertActionsInfoDomain, str, loaded.f315409b, interfaceC9790a, !(loaded.f315410c instanceof UserAdvertsListNextPageDomain.Empty))));
            }
            if (choiceMode instanceof UserAdvertsListState.ChoiceMode.Single.Loaded) {
                cVar = new j.a.InterfaceC9790a.c(((UserAdvertsListState.ChoiceMode.Single.Loaded) choiceMode).f315403b, false);
            } else {
                if (!(choiceMode instanceof UserAdvertsListState.ChoiceMode.Single.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new j.a.InterfaceC9790a.c(((UserAdvertsListState.ChoiceMode.Single.Loading) choiceMode).f315406b, true);
            }
        }
        interfaceC9790a = cVar;
        return new UserAdvertsListState.ViewState(this.f315267b.a(new j.a(userAdvertActionsInfoDomain, str, loaded.f315409b, interfaceC9790a, !(loaded.f315410c instanceof UserAdvertsListNextPageDomain.Empty))));
    }
}
