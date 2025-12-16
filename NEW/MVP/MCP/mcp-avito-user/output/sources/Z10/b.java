package Z10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationContactInfoAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ10/b;", "LZ10/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f19833a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f19833a = interfaceC28373a;
    }

    @Override // Z10.a
    public final void a(@l String str) {
        this.f19833a.c(new f(str));
    }

    @Override // Z10.a
    public final void b(@l String str) {
        this.f19833a.c(new d(str));
    }

    @Override // Z10.a
    public final void c(@l String str) {
        this.f19833a.c(new e(str));
    }
}
