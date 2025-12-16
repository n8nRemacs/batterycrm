package KM;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.B;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesAnalyticsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKM/b;", "LKM/a;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f9421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JM.a f9422b;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k JM.a aVar) {
        this.f9421a = interfaceC28373a;
        this.f9422b = aVar;
    }

    @Override // KM.a
    public final void a(@k String str, @k String str2) {
        JM.a aVar = this.f9422b;
        this.f9421a.c(new Lr0.b(null, aVar.f8923a, null, str, null, aVar.f8924b, str2, aVar.f8925c));
    }

    @Override // KM.a
    public final void b(@k String str, @k String str2) {
        this.f9421a.c(new PM.e(str, str2));
    }

    @Override // KM.a
    public final void c() {
        this.f9421a.c(new e(this.f9422b.f8925c));
    }
}
