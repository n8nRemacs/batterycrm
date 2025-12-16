package com.avito.android.advertising.loaders.buzzoola;

import Hq0.C14020b;
import com.avito.android.advertising.loaders.x;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rb.InterfaceC47628b;
import xb.InterfaceC49915a;

/* compiled from: BuzzoolaBannerLoader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/l;", "Lcom/avito/android/advertising/loaders/buzzoola/f;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC49915a> f88322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f88323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f88324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47628b f88325d;

    @Inject
    public l(@Y61.k h31.e eVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k a aVar, @Y61.k InterfaceC47628b interfaceC47628b, @Y61.k x xVar) {
        this.f88322a = eVar;
        this.f88323b = cVar;
        this.f88324c = aVar;
        this.f88325d = interfaceC47628b;
        xVar.b().x(new g(this), h.f88316b);
    }

    @Override // com.avito.android.advertising.loaders.buzzoola.f
    @Y61.k
    public final O a(@Y61.k BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new F(new C14020b(4, this, buzzoolaNetworkBannerItem)).d0(new i(this, jCurrentTimeMillis)).K(new j(this, buzzoolaNetworkBannerItem)).I(new k(jCurrentTimeMillis));
    }
}
