package com.avito.android.inline_filters.dialog.calendar;

import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LTV0/a;", "newItems", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171314b;

    public s(p pVar) {
        this.f171314b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List list = (List) obj;
        p pVar = this.f171314b;
        com.avito.konveyor.adapter.a aVar = pVar.f9434P;
        if (aVar != null) {
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
        }
        pVar.f9430L.setValue(G0.f406611a);
        C23038g0<C23424o.e> c23038g0 = pVar.f9428J;
        int i12 = p.f171281s0;
        c23038g0.setValue(C23424o.a(new LN.a(pVar.f9435Q, list), true));
        pVar.f9435Q = C42745f0.M0(list);
    }
}
