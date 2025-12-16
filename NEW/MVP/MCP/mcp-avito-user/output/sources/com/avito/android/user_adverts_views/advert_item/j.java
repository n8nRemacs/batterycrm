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
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItem f316510l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f316511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, UserAdvertItem userAdvertItem) {
        super(0);
        this.f316510l = userAdvertItem;
        this.f316511m = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        UserAdvertItem.r f393808k = this.f316510l.getF393808k();
        if (f393808k != null && (deepLink = f393808k.f316721b) != null) {
            this.f316511m.f316516b.get().K(deepLink);
        }
        return G0.f406611a;
    }
}
