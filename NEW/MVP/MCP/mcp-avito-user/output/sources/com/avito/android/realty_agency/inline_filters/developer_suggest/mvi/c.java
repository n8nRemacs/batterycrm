package com.avito.android.realty_agency.inline_filters.developer_suggest.mvi;

import com.avito.android.arch.mvi.a;
import gi0.C40689d;
import gi0.InterfaceC40686a;
import gi0.InterfaceC40687b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ni0.InterfaceC44430a;

/* compiled from: DeveloperSuggestFilterActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/developer_suggest/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lgi0/a;", "Lgi0/b;", "Lgi0/d;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC40686a, InterfaceC40687b, C40689d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44430a f251546a;

    @Inject
    public c(@Y61.k InterfaceC44430a interfaceC44430a) {
        this.f251546a = interfaceC44430a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC40687b> b(InterfaceC40686a interfaceC40686a, C40689d c40689d) {
        InterfaceC40686a interfaceC40686a2 = interfaceC40686a;
        C40689d c40689d2 = c40689d;
        if (interfaceC40686a2 instanceof InterfaceC40686a.C11224a) {
            return C43175k.G(new a(this, c40689d2, interfaceC40686a2, null));
        }
        if (interfaceC40686a2 instanceof InterfaceC40686a.b) {
            return C43175k.G(new b(c40689d2, interfaceC40686a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
