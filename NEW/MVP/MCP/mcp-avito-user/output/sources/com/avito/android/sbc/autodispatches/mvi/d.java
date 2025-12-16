package com.avito.android.sbc.autodispatches.mvi;

import Po0.InterfaceC14817a;
import Po0.InterfaceC14819c;
import Po0.InterfaceC14820d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SbcAutoDispatchesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/autodispatches/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LPo0/a;", "LPo0/c;", "LPo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14817a, InterfaceC14819c, InterfaceC14820d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.autodispatches.m f258933a;

    @Inject
    public d(@Y61.k com.avito.android.sbc.autodispatches.m mVar) {
        this.f258933a = mVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14819c> b(InterfaceC14817a interfaceC14817a, InterfaceC14820d interfaceC14820d) {
        InterfaceC14817a interfaceC14817a2 = interfaceC14817a;
        InterfaceC14820d interfaceC14820d2 = interfaceC14820d;
        boolean z12 = interfaceC14817a2 instanceof InterfaceC14817a.C0864a;
        com.avito.android.sbc.autodispatches.m mVar = this.f258933a;
        if (z12) {
            if (interfaceC14820d2 instanceof InterfaceC14820d.b) {
                return mVar.a(false);
            }
            return interfaceC14820d2 instanceof InterfaceC14820d.c ? true : interfaceC14820d2 instanceof InterfaceC14820d.a ? new C43210w(new InterfaceC14819c.f(new UserAdvertsLink("active", null, 2, null))) : C43175k.w();
        }
        if (interfaceC14817a2 instanceof InterfaceC14817a.c) {
            return mVar.c();
        }
        if (interfaceC14817a2 instanceof InterfaceC14817a.b) {
            return new C43137a0(new c(interfaceC14817a2, null), mVar.a(((InterfaceC14817a.b) interfaceC14817a2).f13282a == SbcDispatchEditResult.f258841d));
        }
        throw new NoWhenBranchMatchedException();
    }
}
