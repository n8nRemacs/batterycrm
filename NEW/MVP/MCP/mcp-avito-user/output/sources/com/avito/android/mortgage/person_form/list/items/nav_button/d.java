package com.avito.android.mortgage.person_form.list.items.nav_button;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NavButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/nav_button/d;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/nav_button/f;", "Lcom/avito/android/mortgage/person_form/list/items/nav_button/NavButtonItem;", "Lcom/avito/android/mortgage/person_form/list/items/nav_button/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends C00.b<f, NavButtonItem, com.avito.android.mortgage.person_form.list.items.nav_button.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200737b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super E00.b, G0> lVar) {
        this.f200737b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        NavButtonItem navButtonItem = (NavButtonItem) aVar;
        fVar.setEnabled(navButtonItem.f200731e);
        fVar.Zl(navButtonItem.f200729c);
        fVar.setLoading(navButtonItem.f200730d);
        fVar.a(new c(this));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.nav_button.payloads.a> list) {
        f fVar = (f) cVar;
        com.avito.android.mortgage.person_form.list.items.nav_button.payloads.a aVar = (com.avito.android.mortgage.person_form.list.items.nav_button.payloads.a) C42745f0.G(list);
        if (aVar != null) {
            fVar.setLoading(aVar.f200741a);
        }
    }
}
