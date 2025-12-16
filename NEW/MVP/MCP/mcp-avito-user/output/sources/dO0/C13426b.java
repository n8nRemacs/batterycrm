package Do0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDo0/b;", "LDo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Do0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13426b implements InterfaceC13425a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f3454a;

    @Inject
    public C13426b(@k InterfaceC28373a interfaceC28373a) {
        this.f3454a = interfaceC28373a;
    }

    @Override // Do0.InterfaceC13425a
    public final void a(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f3454a.c(new d(str, str2, str3, str4, str5));
    }

    @Override // Do0.InterfaceC13425a
    public final void b(@l String str, @l String str2, @l String str3) {
        this.f3454a.c(new e(str, str2, str3));
    }
}
