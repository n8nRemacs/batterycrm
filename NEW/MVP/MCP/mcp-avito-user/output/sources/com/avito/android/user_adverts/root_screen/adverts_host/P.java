package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsHostListParamsProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/P;", "Lcom/avito/android/user_adverts/tab_screens/adverts/dataProvider/g;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P implements com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 f312263a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f312264b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings.u f312265c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.l f312266d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsSpace f312267e;

    /* compiled from: UserAdvertsHostListParamsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UserAdvertsSearchStartFromType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = UserAdvertsSearchStartFromType.f312778b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UserAdvertsHostListParamsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.r<UserAdvertsListParams.ShortcutInfo, UserAdvertsListParams.UserInfo, UserAdvertsListParams.SearchInfo, Continuation<? super UserAdvertsListParams>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final b f312268b = new b();

        public b() {
            super(4, UserAdvertsListParams.class, "<init>", "<init>(Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$ShortcutInfo;Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$UserInfo;Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$SearchInfo;)V", 4);
        }

        @Override // Y41.r
        public final Object invoke(UserAdvertsListParams.ShortcutInfo shortcutInfo, UserAdvertsListParams.UserInfo userInfo, UserAdvertsListParams.SearchInfo searchInfo, Continuation<? super UserAdvertsListParams> continuation) {
            return new UserAdvertsListParams(shortcutInfo, userInfo, searchInfo);
        }
    }

    @Inject
    public P(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12, @Y61.k com.avito.android.profile_settings.u uVar, @Y61.k com.avito.android.passport.profile_add.l lVar, @Y61.k UserAdvertsSpace userAdvertsSpace) {
        this.f312263a = e0Var;
        this.f312264b = f12;
        this.f312265c = uVar;
        this.f312266d = lVar;
        this.f312267e = userAdvertsSpace;
    }

    @Override // com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g
    @Y61.k
    public final InterfaceC43160i<UserAdvertsListParams> a(@Y61.k String str) {
        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = this.f312263a;
        return C43175k.r(C43175k.k(new S(e0Var.getState(), this, str), C43175k.k(e0Var.getState(), this.f312265c.b(), this.f312266d.b(), new T(4, this, P.class, "userInfo", "userInfo(Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsState;Lcom/avito/android/profile_settings/ProfileSettingsStateProvider$State;Lcom/avito/android/passport/profile_add/ReAgentProfileStateProvider$State;)Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams$UserInfo;", 4)), new Q(this.f312264b.getState(), this), b.f312268b));
    }
}
