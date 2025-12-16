package Ew;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: HelpCenterAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEw/d;", "LEw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements InterfaceC13538c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4404a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HelpCenterArguments f4405b;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k HelpCenterArguments helpCenterArguments) {
        this.f4404a = interfaceC28373a;
        this.f4405b = helpCenterArguments;
    }

    @Override // Ew.InterfaceC13538c
    public final void a() {
        String str = this.f4405b.f137995c;
        this.f4404a.c(new C13536a(str != null ? C43066x.y0(str) : null));
    }

    @Override // Ew.InterfaceC13538c
    public final void b(@k String str) {
        this.f4404a.c(new C13537b(str));
    }

    @Override // Ew.InterfaceC13538c
    public final void c() {
        String str = this.f4405b.f137995c;
        this.f4404a.c(new g(str != null ? C43066x.y0(str) : null));
    }

    @Override // Ew.InterfaceC13538c
    public final void d() {
        this.f4404a.c(new f(this.f4405b.f137994b));
    }
}
