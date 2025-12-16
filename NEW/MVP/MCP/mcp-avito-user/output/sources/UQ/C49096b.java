package uq;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealInfoAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luq/b;", "Luq/a;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49096b implements InterfaceC49095a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440300a;

    @Inject
    public C49096b(@k InterfaceC28373a interfaceC28373a) {
        this.f440300a = interfaceC28373a;
    }

    public final void a(@l String str) {
        if (str == null) {
            return;
        }
        this.f440300a.c(new e(str));
    }
}
