package xs0;

import Y61.k;
import android.location.Location;
import com.avito.android.analytics.clickstream.H;
import com.avito.android.geo.j;
import com.avito.android.remote.t1;
import com.avito.android.util.C35755b0;
import com.avito.android.util.InterfaceC35950u;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AvitoCommonParametersProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxs0/a;", "Lcom/avito/android/analytics/clickstream/H$a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49991a implements H.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35950u f442676a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.remote.H f442677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final t1 f442678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f442679d;

    @Inject
    public C49991a(@k InterfaceC35950u interfaceC35950u, @k com.avito.android.remote.H h12, @k t1 t1Var, @k j jVar) {
        this.f442676a = interfaceC35950u;
        this.f442677b = h12;
        this.f442678c = t1Var;
        this.f442679d = jVar;
    }

    @Override // com.avito.android.analytics.clickstream.H.a
    @k
    public final LinkedHashMap a() {
        Q q12 = new Q("ua", this.f442678c.a());
        Q q13 = new Q("device_id", this.f442677b.getValue());
        Location locationJ = this.f442679d.j();
        return C35755b0.c(P0.g(q12, q13, new Q("geo", locationJ != null ? new Number[]{Double.valueOf(locationJ.getLatitude()), Double.valueOf(locationJ.getLongitude()), Float.valueOf(locationJ.getAccuracy()), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(locationJ.getTime()))} : null), new Q("app_store", Integer.valueOf(this.f442676a.p().getF318554r()))));
    }
}
