package com.avito.android.realty_agency.inline_filters.district.mvi;

import com.avito.android.arch.mvi.a;
import ii0.C41413d;
import ii0.InterfaceC41410a;
import ii0.InterfaceC41411b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DistrictActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/district/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lii0/a;", "Lii0/b;", "Lii0/d;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC41410a, InterfaceC41411b, C41413d> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC41411b> b(InterfaceC41410a interfaceC41410a, C41413d c41413d) {
        C43210w c43210w;
        InterfaceC41410a interfaceC41410a2 = interfaceC41410a;
        C41413d c41413d2 = c41413d;
        if (interfaceC41410a2 instanceof InterfaceC41410a.C11387a) {
            return C43175k.G(new a(c41413d2, null));
        }
        if (interfaceC41410a2 instanceof InterfaceC41410a.d) {
            c43210w = new C43210w(InterfaceC41411b.a.f398692a);
        } else {
            if (interfaceC41410a2 instanceof InterfaceC41410a.c) {
                return new C43210w(new InterfaceC41411b.e(((InterfaceC41410a.c) interfaceC41410a2).f398690a));
            }
            if (!(interfaceC41410a2 instanceof InterfaceC41410a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC41411b.d.f398695a);
        }
        return c43210w;
    }
}
