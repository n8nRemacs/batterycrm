package com.avito.android.user_adverts_views.advert_item;

import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSelected", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f316485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItem f316486m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, UserAdvertItem userAdvertItem) {
        super(1);
        this.f316485l = mVar;
        this.f316486m = userAdvertItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.avito.android.user_adverts_views_pub.a aVar = this.f316485l.f316516b.get();
        UserAdvertItem userAdvertItem = this.f316486m;
        aVar.u3(userAdvertItem.getF419716c(), userAdvertItem.getF419721h(), zBooleanValue);
        return G0.f406611a;
    }
}
