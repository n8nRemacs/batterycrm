package com.avito.android.user_adverts_views.advert_item;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItem f316507l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f316508m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, UserAdvertItem userAdvertItem) {
        super(0);
        this.f316507l = userAdvertItem;
        this.f316508m = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        UserAdvertItem.m f393794m = this.f316507l.getF393794M();
        if (f393794m != null && (deepLink = f393794m.f316710c) != null) {
            this.f316508m.f316516b.get().U3(deepLink);
        }
        return G0.f406611a;
    }
}
