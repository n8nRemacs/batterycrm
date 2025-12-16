package com.avito.android.mortgage.person_form.list.items.select;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.mortgage.person_form.list.items.select.payloads.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/f;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/select/h;", "Lcom/avito/android/mortgage/person_form/list/items/select/SelectItem;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends C00.b<h, SelectItem, com.avito.android.mortgage.person_form.list.items.select.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200770b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super E00.b, G0> lVar) {
        this.f200770b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SelectItem selectItem = (SelectItem) aVar;
        hVar.We(null);
        hVar.setEnabled(selectItem.f200753l);
        hVar.Qh(selectItem.f200744c);
        hVar.v10(selectItem.f200746e, selectItem.f200745d);
        hVar.ML(selectItem.f200747f);
        SelectItem.Option option = selectItem.f200750i;
        hVar.Yp(option != null ? option.f200755c : null);
        hVar.ar(selectItem.f200748g);
        hVar.We(new c(this, selectItem));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.select.payloads.a> list) {
        h hVar = (h) cVar;
        for (com.avito.android.mortgage.person_form.list.items.select.payloads.a aVar : list) {
            if (aVar instanceof a.C5947a) {
                hVar.ar(((a.C5947a) aVar).f200776a);
            } else if (aVar instanceof a.c) {
                SelectItem.Option option = ((a.c) aVar).f200778a.f200750i;
                hVar.Yp(option != null ? option.f200755c : null);
                hVar.We(new d(this, (a.c) aVar));
            } else if (aVar instanceof a.b) {
                hVar.We(new e(this, (a.b) aVar));
            }
        }
    }
}
