package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import com.avito.android.user_adverts.tab_screens.adverts.C35662a;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: UserAdvertListViewBinder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final /* synthetic */ class C35668g extends C42801a implements Y41.s<UserAdvertsListState, com.avito.android.lib.beduin_v2.beduin_item.a, BannerState, PersonalSelectionsItemState, Continuation<? super C35662a.C9735a>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final C35668g f315156b = new C35668g();

    public C35668g() {
        super(5, C35662a.C9735a.class, "<init>", "<init>(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;Lcom/avito/android/lib/beduin_v2/beduin_item/BeduinItemsState;Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState;)V", 4);
    }

    @Override // Y41.s
    public final Object invoke(UserAdvertsListState userAdvertsListState, com.avito.android.lib.beduin_v2.beduin_item.a aVar, BannerState bannerState, PersonalSelectionsItemState personalSelectionsItemState, Continuation<? super C35662a.C9735a> continuation) {
        return new C35662a.C9735a(userAdvertsListState, aVar, bannerState, personalSelectionsItemState);
    }
}
