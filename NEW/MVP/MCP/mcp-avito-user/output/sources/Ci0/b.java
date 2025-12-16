package CI0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsFiltersTooltipStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCI0/b;", "LCI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f2079a;

    @Inject
    public b(@k l lVar) {
        this.f2079a = lVar;
    }

    @Override // CI0.a
    public final boolean a() {
        return this.f2079a.getBoolean("user_adverts_filters_show_new_fixed_tooltip_key", true);
    }

    @Override // CI0.a
    public final void b() {
        this.f2079a.putBoolean("user_adverts_filters_show_new_fixed_tooltip_key", false);
    }
}
