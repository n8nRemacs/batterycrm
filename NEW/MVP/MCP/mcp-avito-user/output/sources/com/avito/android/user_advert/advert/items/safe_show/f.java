package com.avito.android.user_advert.advert.items.safe_show;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SafeShowItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_show/f;", "Lcom/avito/android/user_advert/advert/items/safe_show/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310088b;

    @Inject
    public f() {
    }

    @Override // com.avito.android.user_advert.advert.items.safe_show.d
    public final void E5(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310088b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.r50(aVar2.f310079c);
        hVar.Sf(new e(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.safe_show.d
    public final void c0() {
        this.f310088b = null;
    }
}
