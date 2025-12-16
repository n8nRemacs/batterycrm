package com.avito.android.serp.adapter.location_notification;

import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.D5;
import com.avito.android.di.module.E5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationNotificationItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/m;", "Lcom/avito/android/serp/adapter/location_notification/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<a> f270265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<a> f270266c;

    @Inject
    public m(@Y61.k @D5 com.jakewharton.rxrelay3.d<a> dVar, @E5 @Y61.k com.jakewharton.rxrelay3.d<a> dVar2) {
        this.f270265b = dVar;
        this.f270266c = dVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        LocationNotificationItem locationNotificationItem = (LocationNotificationItem) aVar;
        oVar.UX(locationNotificationItem.f270236d);
        oVar.wT(locationNotificationItem.f270238f);
        oVar.Mt(locationNotificationItem.f270237e);
        oVar.R60().u0(new g(this, locationNotificationItem), h.f270258b);
        oVar.getF270274g().u0(new i(this, locationNotificationItem), j.f270261b);
        oVar.getF270276i().u0(new k(this, locationNotificationItem), l.f270264b);
    }
}
