package Xv0;

import Y61.k;
import Y61.l;
import Yv0.C18331a;
import Yv0.C18332b;
import Yv0.C18333c;
import Yv0.C18334d;
import Yv0.C18337g;
import Yv0.C18338h;
import Yv0.C18339i;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import dF0.C39574a;
import dF0.C39575b;
import dF0.C39577d;
import hw0.InterfaceC41182a;
import hw0.InterfaceC41183b;
import hw0.d;
import hw0.h;
import hw0.j;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSoftBookingAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXv0/b;", "LXv0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC17053a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f19155a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19157c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f19158d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f19159e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f19160f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19161g;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @InterfaceC41182a @k String str, @j @k String str2, @h @l Boolean bool, @l @InterfaceC41183b Date date, @l @hw0.c Date date2, @d @l String str3, @k E e12) {
        this.f19155a = interfaceC28373a;
        this.f19156b = str;
        this.f19157c = str2;
        this.f19158d = bool;
        this.f19159e = str3;
        this.f19160f = e12.a();
        this.f19161g = (date == null || date2 == null) ? 0 : 1;
    }

    @Override // Xv0.InterfaceC17053a
    public final void a() {
        this.f19155a.c(new C18334d(this.f19156b, this.f19160f, this.f19157c));
    }

    @Override // Xv0.InterfaceC17053a
    public final void b(@k String str) {
        this.f19155a.c(new C39574a("preview_open_form", this.f19156b, this.f19160f, str, null, 16, null));
    }

    @Override // Xv0.InterfaceC17053a
    public final void c(@l ParcelableClickStreamEvent parcelableClickStreamEvent) {
        if (parcelableClickStreamEvent != null) {
            this.f19155a.c(parcelableClickStreamEvent);
        }
    }

    @Override // Xv0.InterfaceC17053a
    public final void d(@l String str) {
        this.f19155a.c(new C18332b(this.f19156b, this.f19157c, str));
    }

    @Override // Xv0.InterfaceC17053a
    public final void e(@l String str) {
        this.f19155a.c(new C39577d("travel_open_form", this.f19160f, this.f19156b, str));
    }

    @Override // Xv0.InterfaceC17053a
    public final void f() {
        Boolean bool = Boolean.FALSE;
        this.f19155a.c(new C18331a(this.f19156b, this.f19160f, this.f19157c, bool));
    }

    @Override // Xv0.InterfaceC17053a
    public final void g(@l Long l12, @l String str) {
        this.f19155a.c(new C39575b(l12, "preview_open_form", this.f19160f, this.f19156b, null, str));
    }

    @Override // Xv0.InterfaceC17053a
    public final void h(boolean z12) {
        this.f19155a.c(new C18337g(this.f19156b, z12));
    }

    @Override // Xv0.InterfaceC17053a
    public final void i(@k String str, @l String str2) {
        this.f19155a.c(new C18333c(this.f19156b, this.f19160f, this.f19157c, str, str2));
    }

    @Override // Xv0.InterfaceC17053a
    public final void j() {
        this.f19155a.c(new Yv0.j(this.f19156b, this.f19160f, this.f19157c));
    }

    @Override // Xv0.InterfaceC17053a
    public final void k() {
        Integer numValueOf = Integer.valueOf(this.f19161g);
        Boolean bool = this.f19158d;
        this.f19155a.c(new C18338h(numValueOf, this.f19156b, this.f19160f, this.f19157c, this.f19159e, bool != null ? bool.booleanValue() : false));
    }

    @Override // Xv0.InterfaceC17053a
    public final void l(boolean z12) {
        this.f19155a.c(new C18339i(this.f19156b, z12));
    }
}
