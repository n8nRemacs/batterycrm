package Jb;

import Kb.C14292a;
import Kb.C14293b;
import Kb.C14294c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AssistantAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJb/b;", "LJb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC14183a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f9042a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f9042a = interfaceC28373a;
    }

    @Override // Jb.InterfaceC14183a
    public final void a(@k String str) {
        this.f9042a.c(new C14294c(str));
    }

    @Override // Jb.InterfaceC14183a
    public final void b(@l Boolean bool, @k String str, @k String str2) {
        this.f9042a.c(new C14293b(str, str2, bool));
    }

    @Override // Jb.InterfaceC14183a
    public final void c(@k NonFatalErrorEvent nonFatalErrorEvent) {
        this.f9042a.c(nonFatalErrorEvent);
    }

    @Override // Jb.InterfaceC14183a
    public final void d(@k String str, @l String str2) {
        this.f9042a.c(new C14292a(str2, str));
    }
}
