package x5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import x5.InterfaceC49771a;

/* compiled from: AdvertDetailsAddressGeoDistanceAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx5/b;", "Lx5/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC49771a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f442210a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442211b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f442212c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public volatile String f442213d;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str, @k Gson gson) {
        this.f442210a = interfaceC28373a;
        this.f442211b = str;
        this.f442212c = gson;
    }

    @Override // x5.InterfaceC49771a
    public final void a(@l String str) {
        this.f442213d = str;
    }

    @Override // x5.InterfaceC49771a
    public final void b(@k InterfaceC49771a.C12844a c12844a) {
        this.f442210a.c(new d(this.f442213d, this.f442211b, this.f442212c.l(c12844a)));
    }
}
