package com.avito.android.mortgage.person_form.list.items.chips;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.chips.ChipsItem;
import com.avito.android.mortgage.person_form.list.items.chips.payload.a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/e;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/chips/g;", "Lcom/avito/android/mortgage/person_form/list/items/chips/ChipsItem;", "Lcom/avito/android/mortgage/person_form/list/items/chips/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends C00.b<g, ChipsItem, com.avito.android.mortgage.person_form.list.items.chips.payload.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200674b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super E00.b, G0> lVar) {
        this.f200674b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ChipsItem chipsItem = (ChipsItem) aVar;
        gVar.fy(null, null);
        gVar.GL(chipsItem.f200662j);
        gVar.setEnabled(chipsItem.f200663k);
        gVar.setTitle(chipsItem.f200655c);
        gVar.Lu(chipsItem.f200657e, chipsItem.f200656d);
        List<ChipsItem.Chip> list = chipsItem.f200658f;
        gVar.C1(list);
        gVar.Uo(chipsItem.f200661i);
        Iterator<ChipsItem.Chip> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (L.f(it.next().f200664b, chipsItem.f200659g)) {
                break;
            } else {
                i13++;
            }
        }
        gVar.gh(i13);
        gVar.C5(chipsItem.f200660h);
        gVar.fy(new d(this, chipsItem), new c(this, chipsItem));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.chips.payload.a> list) {
        g gVar = (g) cVar;
        for (com.avito.android.mortgage.person_form.list.items.chips.payload.a aVar : list) {
            if (aVar instanceof a.C5940a) {
                gVar.C1(((a.C5940a) aVar).f200682a);
            } else if (aVar instanceof a.c) {
                a.c cVar2 = (a.c) aVar;
                gVar.gh(cVar2.f200684a.indexOf(cVar2.f200685b));
            } else if (aVar instanceof a.d) {
                gVar.gh(-1);
            } else if (aVar instanceof a.b) {
                gVar.C5(((a.b) aVar).f200683a);
            }
        }
    }
}
