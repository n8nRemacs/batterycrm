package com.avito.android.user_advert.advert.items.job_list_item;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobListItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/job_list_item/f;", "Lcom/avito/android/user_advert/advert/items/job_list_item/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f309553b;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f309553b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.cR(new kV.f(aVar2.f309543c, aVar2.f309546f, null, null, null, false, false, null, null, 508, null));
        hVar.Hi(aVar2.f309544d);
        hVar.a(new e(this, aVar2));
    }
}
