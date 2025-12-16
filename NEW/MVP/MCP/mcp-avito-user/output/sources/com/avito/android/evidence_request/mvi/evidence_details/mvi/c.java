package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.C17068c;
import Xz.InterfaceC17066a;
import com.avito.android.arch.mvi.a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EvidenceDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LXz/a;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "LXz/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC17066a, EvidenceDetailsInternalAction, C17068c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30384d f149016a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30381a f149017b;

    @Inject
    public c(@Y61.k InterfaceC30384d interfaceC30384d, @Y61.k InterfaceC30381a interfaceC30381a) {
        this.f149016a = interfaceC30384d;
        this.f149017b = interfaceC30381a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EvidenceDetailsInternalAction> b(InterfaceC17066a interfaceC17066a, C17068c c17068c) {
        C43210w c43210w;
        InterfaceC17066a interfaceC17066a2 = interfaceC17066a;
        C17068c c17068c2 = c17068c;
        if (interfaceC17066a2.equals(InterfaceC17066a.b.f19181a)) {
            return new C43210w(EvidenceDetailsInternalAction.Back.f149028b);
        }
        if (interfaceC17066a2.equals(InterfaceC17066a.C1359a.f19180a)) {
            return new C43210w(EvidenceDetailsInternalAction.Finish.f149032b);
        }
        if (interfaceC17066a2.equals(InterfaceC17066a.g.f19186a)) {
            return C43175k.G(new a(this, c17068c2, null));
        }
        boolean zEquals = interfaceC17066a2.equals(InterfaceC17066a.c.f19182a);
        InterfaceC30384d interfaceC30384d = this.f149016a;
        if (zEquals) {
            return new C43152f0(interfaceC30384d.c(c17068c2.f19203c, c17068c2.f19204d), new b(3, null));
        }
        if (interfaceC17066a2 instanceof InterfaceC17066a.h) {
            c43210w = new C43210w(new EvidenceDetailsInternalAction.RemoveFile(((InterfaceC17066a.h) interfaceC17066a2).f19187a));
        } else {
            if (!(interfaceC17066a2 instanceof InterfaceC17066a.d)) {
                if (interfaceC17066a2 instanceof InterfaceC17066a.f) {
                    interfaceC30384d.e(((InterfaceC17066a.f) interfaceC17066a2).f19185a);
                    return C43175k.w();
                }
                if (!(interfaceC17066a2 instanceof InterfaceC17066a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC30384d.e(Collections.singletonList(((InterfaceC17066a.e) interfaceC17066a2).f19184a));
                return C43175k.w();
            }
            c43210w = new C43210w(new EvidenceDetailsInternalAction.OpenScreen(((InterfaceC17066a.d) interfaceC17066a2).f19183a));
        }
        return c43210w;
    }
}
