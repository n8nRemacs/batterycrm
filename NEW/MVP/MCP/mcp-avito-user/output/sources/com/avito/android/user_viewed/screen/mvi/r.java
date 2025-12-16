package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: UserViewedReducer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Content;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class r extends N implements Y41.l<UserViewedState.Content, UserViewedState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f318457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserViewedInternalAction f318458m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, UserViewedInternalAction userViewedInternalAction) {
        super(1);
        this.f318457l = wVar;
        this.f318458m = userViewedInternalAction;
    }

    @Override // Y41.l
    public final UserViewedState invoke(UserViewedState.Content content) {
        UserViewedState.Content content2 = content;
        UserViewedInternalAction.UpdateFavoriteStatus updateFavoriteStatus = (UserViewedInternalAction.UpdateFavoriteStatus) this.f318458m;
        HashSet hashSet = updateFavoriteStatus.f318418b;
        this.f318457l.getClass();
        List<UserViewedAdvert> list = content2.f318420b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UserViewedAdvert userViewedAdvertA : list) {
            if (hashSet.contains(userViewedAdvertA.f318368b)) {
                userViewedAdvertA = UserViewedAdvert.a(userViewedAdvertA, updateFavoriteStatus.f318419c);
            }
            arrayList.add(userViewedAdvertA);
        }
        return UserViewedState.Content.a(content2, arrayList, false, false, 10);
    }
}
