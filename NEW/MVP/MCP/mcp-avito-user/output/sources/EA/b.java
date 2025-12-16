package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.di.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileCarouselAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA/b;", "LeA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements InterfaceC39978a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f395000a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f395001b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f395002c;

    /* renamed from: d, reason: collision with root package name */
    public int f395003d;

    @Inject
    public b(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @r.h @Y61.k String str) {
        this.f395000a = e12;
        this.f395001b = interfaceC28373a;
        this.f395002c = str;
    }

    @Override // eA.InterfaceC39978a
    public final void a() {
        int i12;
        String strA = this.f395000a.a();
        if (strA == null || (i12 = this.f395003d) <= 0) {
            return;
        }
        this.f395001b.c(new d(strA, this.f395002c, i12));
    }

    @Override // eA.InterfaceC39978a
    public final void x(int i12) {
        this.f395003d = Integer.max(this.f395003d, i12 + 1);
    }
}
