package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileLoadTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/s;", "LPd0/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f13172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC28489k f13173b;

    @Inject
    public s(@Y61.k com.avito.android.analytics.screens.o oVar) {
        this.f13172a = oVar;
    }

    @Override // Pd0.r
    public final void a(@Y61.k Throwable th2) {
        J.a aVar = new J.a(th2);
        InterfaceC28489k interfaceC28489k = this.f13173b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, aVar, 0L, 4);
        }
        this.f13173b = null;
    }

    @Override // Pd0.r
    public final void b() {
        J.b bVar = J.b.f90385a;
        InterfaceC28489k interfaceC28489k = this.f13173b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, bVar, 0L, 4);
        }
        this.f13173b = null;
    }

    @Override // Pd0.r
    public final void c() {
        com.avito.android.analytics.screens.tracker.P pE2 = this.f13172a.e("profile");
        pE2.start();
        this.f13173b = pE2;
    }
}
