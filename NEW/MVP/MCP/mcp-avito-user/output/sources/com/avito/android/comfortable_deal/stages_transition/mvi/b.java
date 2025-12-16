package com.avito.android.comfortable_deal.stages_transition.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import fq.InterfaceC40463a;
import fq.InterfaceC40464b;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StagesTransitionActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lfq/a;", "Lfq/b;", "Lfq/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40463a, InterfaceC40464b, fq.d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f122968a;

    @Inject
    public b(@k com.avito.android.comfortable_deal.repository.a aVar) {
        this.f122968a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC40464b> b(InterfaceC40463a interfaceC40463a, fq.d dVar) {
        C43210w c43210w;
        InterfaceC40463a interfaceC40463a2 = interfaceC40463a;
        fq.d dVar2 = dVar;
        Object obj = null;
        if (interfaceC40463a2 instanceof InterfaceC40463a.g) {
            return C43175k.G(new a(dVar2, this, null));
        }
        if (interfaceC40463a2 instanceof InterfaceC40463a.e) {
            Map<String, StageTransitionField> map = dVar2.f396156e;
            Iterator<T> it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((StageTransitionField) next).X()) {
                    obj = next;
                    break;
                }
            }
            c43210w = new C43210w(new InterfaceC40464b.a(new StagesTransitionResult(obj != null ? StagesTransitionResultStrategy.f122960c : StagesTransitionResultStrategy.f122961d, dVar2.f396154c, map)));
        } else {
            if (interfaceC40463a2 instanceof InterfaceC40463a.b) {
                InterfaceC40463a.b bVar = (InterfaceC40463a.b) interfaceC40463a2;
                bVar.getClass();
                return new C43210w(new InterfaceC40464b.i(bVar.f396130a));
            }
            if (interfaceC40463a2 instanceof InterfaceC40463a.C11176a) {
                return new C43210w(new InterfaceC40464b.g(((InterfaceC40463a.C11176a) interfaceC40463a2).f396129a));
            }
            if (interfaceC40463a2 instanceof InterfaceC40463a.f) {
                return new C43210w(new InterfaceC40464b.j(((InterfaceC40463a.f) interfaceC40463a2).f396134a));
            }
            if (interfaceC40463a2 instanceof InterfaceC40463a.c) {
                StageTransitionField stageTransitionField = dVar2.f396156e.get("contactTime");
                StageTransitionField.DateTimeInputs dateTimeInputs = stageTransitionField instanceof StageTransitionField.DateTimeInputs ? (StageTransitionField.DateTimeInputs) stageTransitionField : null;
                c43210w = new C43210w(new InterfaceC40464b.C11177b(dateTimeInputs != null ? dateTimeInputs.f122948b : null));
            } else {
                if (!(interfaceC40463a2 instanceof InterfaceC40463a.h)) {
                    if (interfaceC40463a2 instanceof InterfaceC40463a.d) {
                        return new C43210w(new InterfaceC40464b.h(((InterfaceC40463a.d) interfaceC40463a2).f396132a));
                    }
                    if (interfaceC40463a2 instanceof InterfaceC40463a.i) {
                        return new C43210w(new InterfaceC40464b.k(((InterfaceC40463a.i) interfaceC40463a2).f396137a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StageTransitionField stageTransitionField2 = dVar2.f396156e.get("contactTime");
                StageTransitionField.DateTimeInputs dateTimeInputs2 = stageTransitionField2 instanceof StageTransitionField.DateTimeInputs ? (StageTransitionField.DateTimeInputs) stageTransitionField2 : null;
                c43210w = new C43210w(new InterfaceC40464b.c(dateTimeInputs2 != null ? dateTimeInputs2.f122949c : null));
            }
        }
        return c43210w;
    }
}
