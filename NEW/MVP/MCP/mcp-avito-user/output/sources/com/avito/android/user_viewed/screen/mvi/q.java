package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: UserViewedReducer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Content;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class q extends N implements Y41.l<UserViewedState.Content, UserViewedState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserViewedInternalAction f318455l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f318456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, UserViewedInternalAction userViewedInternalAction) {
        super(1);
        this.f318455l = userViewedInternalAction;
        this.f318456m = wVar;
    }

    @Override // Y41.l
    public final UserViewedState invoke(UserViewedState.Content content) {
        UserViewedState.Content content2 = content;
        boolean z12 = content2.f318421c;
        UserViewedInternalAction userViewedInternalAction = this.f318455l;
        if (z12) {
            return UserViewedState.Content.a(content2, ((UserViewedInternalAction.Content) userViewedInternalAction).f318411b, false, true, 8);
        }
        List<UserViewedAdvert> list = ((UserViewedInternalAction.Content) userViewedInternalAction).f318411b;
        this.f318456m.getClass();
        List<UserViewedAdvert> list2 = content2.f318420b;
        List<UserViewedAdvert> list3 = list2;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserViewedAdvert) it.next()).f318368b);
        }
        HashSet hashSetK0 = C42745f0.K0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!hashSetK0.contains(((UserViewedAdvert) obj).f318368b)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.addAll(list2);
        return UserViewedState.Content.a(content2, arrayList3, false, false, 8);
    }
}
