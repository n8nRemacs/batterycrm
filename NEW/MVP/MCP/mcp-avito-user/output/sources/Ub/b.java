package ub;

import Y61.k;
import com.avito.android.C30828i;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.reflect.n;
import vb.C49292a;

/* compiled from: BrandspaceEntryPointAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub/b;", "Lub/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC49012a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440104a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30828i f440105b;

    public b(@k InterfaceC28373a interfaceC28373a, @k C30828i c30828i) {
        this.f440104a = interfaceC28373a;
        this.f440105b = c30828i;
    }

    @Override // ub.InterfaceC49012a
    public final void a(@k String str, @k String str2) {
        C30828i c30828i = this.f440105b;
        c30828i.getClass();
        n<Object> nVar = C30828i.f164256k[7];
        if (ThreadLocalRandom.current().nextInt(100) <= (((Boolean) c30828i.f164264i.a().invoke()).booleanValue() ? 49 : 0)) {
            this.f440104a.c(new C49292a(str, str2));
        }
    }
}
