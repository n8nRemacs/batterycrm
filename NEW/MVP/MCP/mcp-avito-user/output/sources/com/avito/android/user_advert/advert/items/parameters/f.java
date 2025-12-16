package com.avito.android.user_advert.advert.items.parameters;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertParameterItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/parameters/f;", "Lcom/avito/android/user_advert/advert/items/parameters/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309782b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        MyAdvertParameterItem myAdvertParameterItem = (MyAdvertParameterItem) aVar;
        ((h) eVar).vt(myAdvertParameterItem.f309768d, myAdvertParameterItem.f309769e, myAdvertParameterItem.f309770f, myAdvertParameterItem.f309771g, myAdvertParameterItem.f309773i, new d(myAdvertParameterItem, this), new e(myAdvertParameterItem, this));
    }

    @Override // com.avito.android.user_advert.advert.items.parameters.c
    public final void Q2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309782b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.parameters.c
    public final void c0() {
        this.f309782b = null;
    }
}
