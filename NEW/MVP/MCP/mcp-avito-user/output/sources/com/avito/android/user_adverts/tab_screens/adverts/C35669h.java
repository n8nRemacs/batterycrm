package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.user_adverts.tab_screens.adverts.C35662a;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: UserAdvertListViewBinder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final /* synthetic */ class C35669h extends C42801a implements Y41.r<UserAdvertsListState, com.avito.android.lib.beduin_v2.beduin_item.a, BannerState, Continuation<? super C35662a.C9735a>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final C35669h f315157b = new C35669h();

    public C35669h() {
        super(4, C35662a.C9735a.class, "<init>", "<init>(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;Lcom/avito/android/lib/beduin_v2/beduin_item/BeduinItemsState;Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState;)V", 4);
    }

    @Override // Y41.r
    public final Object invoke(UserAdvertsListState userAdvertsListState, com.avito.android.lib.beduin_v2.beduin_item.a aVar, BannerState bannerState, Continuation<? super C35662a.C9735a> continuation) {
        return new C35662a.C9735a(userAdvertsListState, aVar, bannerState, null, 8, null);
    }
}
