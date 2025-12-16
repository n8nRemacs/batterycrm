package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.di.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfilePremiumBannerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA/h;", "LeA/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f395011a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f395012b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f395013c;

    /* renamed from: d, reason: collision with root package name */
    public int f395014d;

    @Inject
    public h(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @r.h @Y61.k String str) {
        this.f395011a = e12;
        this.f395012b = interfaceC28373a;
        this.f395013c = str;
    }

    @Override // eA.g
    public final void a() {
        int i12;
        String strA = this.f395011a.a();
        if (strA == null || (i12 = this.f395014d) <= 0) {
            return;
        }
        this.f395012b.c(new j(strA, this.f395013c, i12));
    }

    @Override // eA.g
    public final void x(int i12) {
        this.f395014d = Integer.max(this.f395014d, i12 + 1);
    }
}
