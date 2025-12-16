package PJ;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.iac_avcalls_network_test.impl_module.splitter.ab.configs.NetworkTestOnForegroundTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import u3.f;

/* compiled from: AvCallsNetworkTestAbTests.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPJ/b;", "LPJ/a;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f12958a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f12959b;

    @Inject
    public b(@k RJ.a aVar, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f12958a = c0Var;
        this.f12959b = interfaceC27642e;
    }

    @Override // PJ.a
    @k
    public final f<NetworkTestOnForegroundTestGroup> a() {
        return new f<>(this.f12959b.c(new QJ.a()), this.f12958a);
    }
}
