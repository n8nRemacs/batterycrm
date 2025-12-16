package com.avito.android.carousel_items.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.V0;
import com.avito.android.remote.error.j;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselItemsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/carousel_items/domain/e;", "Lcom/avito/android/carousel_items/domain/a;", "_avito_carousel-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<V0> f115277a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f115278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f115279c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC34904z0 f115280d;

    @Inject
    public e(@k h31.e<V0> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar, @k InterfaceC34904z0 interfaceC34904z0) {
        this.f115277a = eVar;
        this.f115278b = interfaceC35745a5;
        this.f115279c = fVar;
        this.f115280d = interfaceC34904z0;
    }

    @Override // com.avito.android.carousel_items.domain.a
    @k
    public final z<P2<g>> a(@k ItemsRequestParams itemsRequestParams, @l Location location, @l String str, @l Integer num, @k String str2) {
        ItemsRequestParams.ParamRecs paramRecs = itemsRequestParams.getParamRecs();
        if (!L.f(itemsRequestParams.getSource(), ItemsCarouselWidget.RECS_PARAMS_SOURCE) || paramRecs == null) {
            return z.c0(new P2.a(j.a(2, "Incorrect parameters", null)));
        }
        F f12 = new F(new b(this, paramRecs, str2, location, str, num));
        InterfaceC35745a5 interfaceC35745a5 = this.f115278b;
        return f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.c()).d0(new c(this, paramRecs)).r0(P2.c.f318721a).m0(new d(this));
    }
}
