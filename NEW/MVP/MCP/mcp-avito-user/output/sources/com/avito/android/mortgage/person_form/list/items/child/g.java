package com.avito.android.mortgage.person_form.list.items.child;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.checkbox.CheckboxItem;
import com.avito.android.mortgage.person_form.list.items.child.payloads.a;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChildPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/g;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/child/i;", "Lcom/avito/android/mortgage/person_form/list/items/child/ChildItem;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends C00.b<i, ChildItem, com.avito.android.mortgage.person_form.list.items.child.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200629b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super E00.b, G0> lVar) {
        this.f200629b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        ChildItem childItem = (ChildItem) aVar;
        iVar.setTitle(childItem.f200608d);
        com.avito.android.mortgage.person_form.list.items.input.h hVarAH = iVar.aH();
        hVarAH.f200720g = null;
        InputItem inputItem = childItem.f200609e;
        hVarAH.f200718e = inputItem.f200697k;
        hVarAH.f200719f = inputItem.f200699m;
        hVarAH.setEnabled(inputItem.f200700n);
        hVarAH.Yq(inputItem.f200690d);
        hVarAH.Qi(inputItem.f200696j, inputItem.f200691e);
        hVarAH.y0(inputItem.f200692f);
        hVarAH.cY(inputItem.f200695i);
        String str = childItem.f200606b;
        String str2 = childItem.f200607c;
        hVarAH.f200720g = new d(this, str, str2);
        hVarAH.f200721h = new e(this, str, str2, inputItem);
        com.avito.android.mortgage.person_form.list.items.checkbox.g gVarVh = iVar.Vh();
        CheckboxItem checkboxItem = childItem.f200610f;
        gVarVh.setEnabled(checkboxItem.f200596f);
        gVarVh.setTitle(checkboxItem.f200595e);
        gVarVh.setChecked(checkboxItem.f200594d);
        gVarVh.l0(new f(this, str, str2, checkboxItem));
        iVar.L5(new c(this, childItem));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.child.payloads.a> list) {
        i iVar = (i) cVar;
        for (com.avito.android.mortgage.person_form.list.items.child.payloads.a aVar : list) {
            if (aVar instanceof a.e) {
                iVar.setTitle(((a.e) aVar).f200639a);
            } else if (aVar instanceof a.d) {
                iVar.aH().y0(((a.d) aVar).f200638a);
            } else if (aVar instanceof a.b) {
                iVar.aH().cY(((a.b) aVar).f200636a);
            } else if (aVar instanceof a.c) {
                iVar.aH().f200718e = ((a.c) aVar).f200637a;
            } else if (aVar instanceof a.C5937a) {
                iVar.Vh().setChecked(((a.C5937a) aVar).f200635a);
            }
        }
    }
}
