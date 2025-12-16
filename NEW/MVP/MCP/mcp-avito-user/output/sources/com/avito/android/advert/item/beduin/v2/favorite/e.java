package com.avito.android.advert.item.beduin.v2.favorite;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.x;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteButtonComponentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/favorite/e;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/advert/item/beduin/v2/favorite/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends n<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<InterfaceC34863v> f73327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f73328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x f73329e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73330f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@Y61.k Y41.a<? extends InterfaceC34863v> aVar, @Y61.k com.avito.android.favorite.h hVar, @Y61.k x xVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(l.f73344c);
        this.f73327c = aVar;
        this.f73328d = hVar;
        this.f73329e = xVar;
        this.f73330f = interfaceC35745a5;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        return new d(this.f73327c.invoke(), this.f73328d, this.f73329e, this.f73330f);
    }
}
