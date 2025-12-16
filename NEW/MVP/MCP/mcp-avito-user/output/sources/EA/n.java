package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.di.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionsAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA/n;", "LeA/m;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f395021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f395022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f395023c;

    /* renamed from: d, reason: collision with root package name */
    public int f395024d;

    @Inject
    public n(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @r.h @Y61.k String str) {
        this.f395021a = e12;
        this.f395022b = interfaceC28373a;
        this.f395023c = str;
    }

    @Override // eA.m
    public final void a() {
        int i12;
        String strA = this.f395021a.a();
        if (strA == null || (i12 = this.f395024d) <= 0) {
            return;
        }
        this.f395022b.c(new l(strA, this.f395023c, i12));
    }

    @Override // eA.m
    public final void x(int i12) {
        this.f395024d = Integer.max(this.f395024d, i12 + 1);
    }
}
