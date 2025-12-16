package ZH;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.gsm_realty_trx_flow.impl_module.splitter.ab.GsmRealtyTrxFlowTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import u3.f;

/* compiled from: GsmRealtyTrxFlowAbTests.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZH/b;", "LZH/a;", "_avito_gsm-realty-trx-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a f20066a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f20067b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f20068c;

    @Inject
    public b(@k com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a aVar, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f20066a = aVar;
        this.f20067b = c0Var;
        this.f20068c = interfaceC27642e;
    }

    @Override // ZH.a
    @k
    public final f<GsmRealtyTrxFlowTestGroup> a() {
        return new f<>(this.f20068c.c(new e(this.f20066a)), this.f20067b);
    }
}
