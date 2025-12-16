package pO;

import Y61.k;
import Y61.l;
import android.location.Location;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import javax.inject.Inject;
import kotlin.Metadata;
import lW.e;
import qO.C47325a;
import qO.C47326b;
import qO.d;

/* compiled from: ItemMapAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpO/b;", "LpO/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pO.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46984b implements InterfaceC46983a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f428517a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f428518b;

    @Inject
    public C46984b(@k InterfaceC28373a interfaceC28373a, @l TreeClickStreamParent treeClickStreamParent) {
        this.f428517a = interfaceC28373a;
        this.f428518b = treeClickStreamParent;
    }

    @Override // pO.InterfaceC46983a
    public final void a(@k String str) {
        this.f428517a.c(new d(str));
    }

    @Override // pO.InterfaceC46983a
    public final void b(@k String str, @k String str2) {
        this.f428517a.c(new f8.b(this.f428518b, str, str2, "fullmap"));
    }

    @Override // pO.InterfaceC46983a
    public final void c(@l String str) {
        if (str == null) {
            return;
        }
        this.f428517a.c(new C47326b(str));
    }

    @Override // pO.InterfaceC46983a
    public final void d(@k String str) {
        this.f428517a.c(new H8.a(str));
    }

    @Override // pO.InterfaceC46983a
    public final void e(@k String str, @l Location location, @k String str2) {
        this.f428517a.c(new qO.c(str, location != null ? e.a(location) : null, str2));
    }

    @Override // pO.InterfaceC46983a
    public final void f(@l Location location, @k String str) {
        this.f428517a.c(new C47325a(str, location != null ? e.a(location) : null));
    }
}
