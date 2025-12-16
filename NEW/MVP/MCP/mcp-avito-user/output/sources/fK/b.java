package FK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.iac_dialer.impl_module.splitter.ab.configs.CoreTelecomIncomingCallsTestGroup;
import com.avito.android.iac_dialer.impl_module.splitter.ab.configs.CoreTelecomOutgoingCallsTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import u3.l;

/* compiled from: IacDialerAbTests.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFK/b;", "LFK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.splitter.features.a f4673a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f4674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f4675c;

    @Inject
    public b(@k com.avito.android.iac_dialer.impl_module.splitter.features.a aVar, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f4673a = aVar;
        this.f4674b = c0Var;
        this.f4675c = interfaceC27642e;
    }

    @Override // FK.a
    @k
    public final l<CoreTelecomIncomingCallsTestGroup> a() {
        return new l<>(this.f4675c.c(new GK.a(this.f4673a)), this.f4674b);
    }

    @Override // FK.a
    @k
    public final l<CoreTelecomOutgoingCallsTestGroup> b() {
        return new l<>(this.f4675c.c(new GK.b(this.f4673a)), this.f4674b);
    }
}
