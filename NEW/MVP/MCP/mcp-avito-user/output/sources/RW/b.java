package rW;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.location_list.analytics.FromBlock;
import javax.inject.Inject;
import kotlin.Metadata;
import sW.C48114a;
import sW.C48115b;

/* compiled from: LocationListAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrW/b;", "LrW/a;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC47603a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429853a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f429853a = interfaceC28373a;
    }

    @Override // rW.InterfaceC47603a
    public final void a(@l String str, @l String str2) {
        this.f429853a.c(new C48115b(str, str2));
    }

    @Override // rW.InterfaceC47603a
    public final void b(@l String str, @l String str2, @k String str3, @k FromBlock fromBlock) {
        this.f429853a.c(new C48114a(str, str2, str3, fromBlock));
    }
}
