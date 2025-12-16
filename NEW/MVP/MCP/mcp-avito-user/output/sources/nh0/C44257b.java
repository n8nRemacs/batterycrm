package nH0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiUrgencyEventsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnH0/b;", "LnH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44257b implements InterfaceC44256a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414981a;

    @Inject
    public C44257b(@k InterfaceC28373a interfaceC28373a) {
        this.f414981a = interfaceC28373a;
    }

    @Override // nH0.InterfaceC44256a
    public final void a(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar) {
        this.f414981a.c(new e(cVar.f309639c, cVar.f309640d, cVar.f309641e, cVar.f309642f, cVar.f309647k));
    }

    @Override // nH0.InterfaceC44256a
    public final void b(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar) {
        this.f414981a.c(new d(cVar.f309639c, cVar.f309640d, cVar.f309641e));
    }
}
