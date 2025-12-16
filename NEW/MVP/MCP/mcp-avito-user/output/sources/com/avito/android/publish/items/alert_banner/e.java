package com.avito.android.publish.items.alert_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AlertBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/alert_banner/e;", "Lcom/avito/android/publish/items/alert_banner/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f236754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f236755c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236754b = cVar;
        this.f236755c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.items.alert_banner.c
    @Y61.k
    public final z<DeepLink> B() {
        return this.f236755c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AlertBannerItem alertBannerItem = (AlertBannerItem) aVar;
        gVar.b(alertBannerItem.f236744c);
        gVar.x3(alertBannerItem.f236745d);
        gVar.X4(alertBannerItem.f236746e);
        gVar.cL(alertBannerItem.f236747f);
        gVar.c(alertBannerItem.f236748g != null ? new d(this, alertBannerItem) : null);
    }
}
