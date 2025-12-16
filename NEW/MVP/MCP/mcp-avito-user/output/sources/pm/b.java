package PM;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.B;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionAnalyticsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPM/b;", "LPM/a;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f13051a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f13051a = interfaceC28373a;
    }

    @Override // PM.a
    public final void a(@k String str) {
        this.f13051a.c(new e(str, "mark"));
    }

    @Override // PM.a
    public final void b(@k String str, @k String str2, @k String str3) {
        this.f13051a.c(new f(str, str2, str3));
    }
}
