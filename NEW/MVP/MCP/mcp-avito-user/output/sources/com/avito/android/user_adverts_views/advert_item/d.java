package com.avito.android.user_adverts_views.advert_item;

import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.android.user_adverts_views_pub.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<UserAdvertItem.RightAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f316483l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItem f316484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, UserAdvertItem userAdvertItem) {
        super(1);
        this.f316483l = mVar;
        this.f316484m = userAdvertItem;
    }

    @Override // Y41.l
    public final G0 invoke(UserAdvertItem.RightAction rightAction) {
        this.f316483l.f316516b.get().X(new a.InterfaceC9834a.c(rightAction, this.f316484m));
        return G0.f406611a;
    }
}
