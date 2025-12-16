package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import com.avito.android.deep_linking.links.WebViewLink;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EndDealActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LHp/a;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "LHp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC14016a, EndDealInternalAction, Hp.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.end_deal.interactor.d f122308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.end_deal.interactor.a f122309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N0 f122310c;

    @Inject
    public e(@Y61.k com.avito.android.comfortable_deal.end_deal.interactor.d dVar, @Y61.k com.avito.android.comfortable_deal.end_deal.interactor.a aVar) {
        this.f122308a = dVar;
        this.f122309b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Bundle, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EndDealInternalAction> b(InterfaceC14016a interfaceC14016a, Hp.c cVar) {
        C43210w c43210w;
        Object updateDataValue;
        List<EndDealField.ChipDateInput.Chip> list;
        Object next;
        InterfaceC14016a interfaceC14016a2 = interfaceC14016a;
        Hp.c cVar2 = cVar;
        if (interfaceC14016a2 instanceof InterfaceC14016a.C0440a) {
            return new C43210w(new EndDealInternalAction.Close(new EndDealResult((cVar2.f7740j || cVar2.f7732b) ? StagesTransitionResultStrategy.f122961d : StagesTransitionResultStrategy.f122960c, new EndDealSavedState(cVar2.f7735e, cVar2.f7736f, cVar2.f7737g, cVar2.f7738h, cVar2.f7739i))));
        }
        boolean zEquals = interfaceC14016a2.equals(InterfaceC14016a.d.f7713a);
        com.avito.android.comfortable_deal.end_deal.interactor.d dVar = this.f122308a;
        com.avito.android.comfortable_deal.end_deal.interactor.a aVar = this.f122309b;
        if (zEquals) {
            aVar.e();
            return dVar.c(false);
        }
        boolean zEquals2 = interfaceC14016a2.equals(InterfaceC14016a.f.f7715a);
        Map<String, EndDealField> mapC = cVar2.f7737g;
        if (zEquals2) {
            if (mapC == null) {
                mapC = P0.c();
            }
            return dVar.b(mapC, cVar2.f7735e, cVar2.f7733c);
        }
        LocalDate localDate = 0;
        localDate = 0;
        localDate = 0;
        if (interfaceC14016a2 instanceof InterfaceC14016a.g) {
            return C43175k.G(new a(cVar2, interfaceC14016a2, null));
        }
        if (interfaceC14016a2 instanceof InterfaceC14016a.h) {
            InterfaceC14016a.h hVar = (InterfaceC14016a.h) interfaceC14016a2;
            c43210w = new C43210w(new EndDealInternalAction.UpdateCommentValue(hVar.f7718a, hVar.f7719b));
        } else {
            if (interfaceC14016a2 instanceof InterfaceC14016a.i) {
                InterfaceC14016a.i iVar = (InterfaceC14016a.i) interfaceC14016a2;
                String str = iVar.f7721b;
                boolean zF2 = L.f(str, "calendar_chip");
                String str2 = iVar.f7720a;
                if (zF2) {
                    EndDealField endDealField = mapC != null ? mapC.get(str2) : null;
                    EndDealField.ChipDateInput chipDateInput = endDealField instanceof EndDealField.ChipDateInput ? (EndDealField.ChipDateInput) endDealField : null;
                    if (chipDateInput != null && (list = chipDateInput.f122251d) != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((EndDealField.ChipDateInput.Chip) next).f122254b, "calendar_chip")) {
                                break;
                            }
                        }
                        EndDealField.ChipDateInput.Chip chip = (EndDealField.ChipDateInput.Chip) next;
                        if (chip != null) {
                            localDate = chip.f122255c;
                        }
                    }
                    updateDataValue = new EndDealInternalAction.OpenCalendarClicked(localDate);
                } else {
                    updateDataValue = new EndDealInternalAction.UpdateDataValue(str2, str);
                }
                return new C43210w(updateDataValue);
            }
            if (interfaceC14016a2 instanceof InterfaceC14016a.j) {
                return C43175k.h(new b(interfaceC14016a2, this, null));
            }
            if (interfaceC14016a2 instanceof InterfaceC14016a.b) {
                return C43175k.G(new c(interfaceC14016a2, cVar2, this, null));
            }
            if (interfaceC14016a2 instanceof InterfaceC14016a.e) {
                return C43175k.G(new d(interfaceC14016a2, null));
            }
            if (!(interfaceC14016a2 instanceof InterfaceC14016a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.b();
            c43210w = new C43210w(new EndDealInternalAction.OpenDeeplink(new WebViewLink.OnlyAvitoDomain(Uri.parse(((InterfaceC14016a.c) interfaceC14016a2).f7712a), null, null, 6, null), localDate, 2, localDate));
        }
        return c43210w;
    }
}
