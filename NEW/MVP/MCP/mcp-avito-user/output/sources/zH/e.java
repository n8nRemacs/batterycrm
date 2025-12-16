package ZH;

import Y61.k;
import com.avito.android.gsm_realty_trx_flow.impl_module.splitter.ab.GsmRealtyTrxFlowTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: GsmRealtyTrxFlowAbTests.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LZH/e;", "Lu3/d;", "Lcom/avito/android/gsm_realty_trx_flow/impl_module/splitter/ab/GsmRealtyTrxFlowTestGroup;", "_avito_gsm-realty-trx-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends AbstractC48780d<GsmRealtyTrxFlowTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a f20072a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f20073b = "roomberry_address_book";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20074c;

    public e(@k com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a aVar) {
        this.f20072a = aVar;
        Owners owners = Owners.f210476d;
        this.f20074c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF442140c() {
        return this.f20074c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF442139b() {
        return this.f20073b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return GsmRealtyTrxFlowTestGroup.f161271c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (GsmRealtyTrxFlowTestGroup[]) ((AbstractC42734a) GsmRealtyTrxFlowTestGroup.f161274f).toArray(new GsmRealtyTrxFlowTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return GsmRealtyTrxFlowTestGroup.f161271c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a aVar = this.f20072a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a.f161276c[0];
        return ((Boolean) aVar.f161277b.a().invoke()).booleanValue();
    }
}
