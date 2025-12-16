package UZ;

import VZ.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageConsultationAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUZ/b;", "LUZ/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f16445a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f16445a = interfaceC28373a;
    }

    @Override // UZ.a
    public final void a(int i12, @l String str, @l String str2, @k String str3) {
        this.f16445a.c(new VZ.b(str, i12, str2, str3));
    }

    @Override // UZ.a
    public final void b(@l String str, int i12, @l String str2, @k String str3, @k String str4) {
        this.f16445a.c(new VZ.a(str, i12, str2, str3, str4));
    }

    @Override // UZ.a
    public final void c(@l String str, @l String str2) {
        this.f16445a.c(new VZ.c(str, str2));
    }

    @Override // UZ.a
    public final void d(int i12, @l String str, @l String str2, @k String str3) {
        this.f16445a.c(new d(str, i12, str2, str3));
    }
}
