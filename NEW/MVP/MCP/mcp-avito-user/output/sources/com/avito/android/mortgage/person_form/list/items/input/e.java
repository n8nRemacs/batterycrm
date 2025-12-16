package com.avito.android.mortgage.person_form.list.items.input;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.input.payloads.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/e;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/input/g;", "Lcom/avito/android/mortgage/person_form/list/items/input/InputItem;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends C00.b<g, InputItem, com.avito.android.mortgage.person_form.list.items.input.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200713b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super E00.b, G0> lVar) {
        this.f200713b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        InputItem inputItem = (InputItem) aVar;
        gVar.u0(null);
        gVar.RQ(inputItem.f200697k);
        gVar.zk(inputItem.f200699m);
        gVar.setEnabled(inputItem.f200700n);
        gVar.Yq(inputItem.f200690d);
        gVar.Yg(inputItem.f200694h, inputItem.f200693g);
        gVar.Qi(inputItem.f200696j, inputItem.f200691e);
        gVar.y0(inputItem.f200692f);
        gVar.cY(inputItem.f200695i);
        gVar.u0(new c(this, inputItem));
        gVar.NH(new d(this, inputItem));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.input.payloads.a> list) {
        g gVar = (g) cVar;
        for (com.avito.android.mortgage.person_form.list.items.input.payloads.a aVar : list) {
            if (aVar instanceof a.c) {
                gVar.y0(((a.c) aVar).f200726a);
            } else if (aVar instanceof a.C5943a) {
                gVar.cY(((a.C5943a) aVar).f200724a);
            } else if (aVar instanceof a.b) {
                gVar.RQ(((a.b) aVar).f200725a);
            }
        }
    }
}
