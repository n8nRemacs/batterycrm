package ZA;

import Y61.k;
import Y61.l;
import com.avito.android.advert.viewed.persistance.j;
import com.avito.android.favorite.x;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSerpAdvertConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZA/b;", "LZA/a;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f19949a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f19950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC34904z0 f19951c;

    @Inject
    public b(@k x xVar, @k j jVar, @k InterfaceC34904z0 interfaceC34904z0) {
        this.f19949a = xVar;
        this.f19950b = jVar;
        this.f19951c = interfaceC34904z0;
    }

    @Override // ZA.a
    @k
    public final AdvertItem a(@k SerpAdvert serpAdvert, @l Boolean bool) {
        AdvertItem advertItemA = InterfaceC34904z0.a.a(this.f19951c, serpAdvert, false, false, L.f(bool, Boolean.TRUE) ? SerpDisplayType.List : SerpDisplayType.Grid, null, 0, null, null, false, 2038);
        boolean isFavorite = serpAdvert.getIsFavorite();
        x xVar = this.f19949a;
        String str = advertItemA.f268425c;
        advertItemA.f268380G = xVar.b(str, isFavorite);
        advertItemA.f268394N = this.f19950b.a(str);
        return advertItemA;
    }
}
