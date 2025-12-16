package com.avito.android.mortgage.pre_approval.form.list.items.select;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.mortgage.pre_approval.form.list.items.select.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/e;", "LTV0/f;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/g;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/SelectItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, SelectItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Q00.a, G0> f201836b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super Q00.a, G0> lVar) {
        this.f201836b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SelectItem selectItem = (SelectItem) aVar;
        gVar.Uf(null);
        gVar.D(selectItem.f201821c);
        gVar.c6(selectItem.f201824f);
        SelectItem.Option option = selectItem.f201823e;
        gVar.setText(option != null ? option.f201827c : null);
        gVar.C5(selectItem.f201825g);
        gVar.Uf(new c(this, selectItem));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        SelectItem selectItem = (SelectItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        Iterable<com.avito.android.mortgage.pre_approval.form.list.items.select.payload.a> iterable = (List) obj;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        for (com.avito.android.mortgage.pre_approval.form.list.items.select.payload.a aVar2 : iterable) {
            if (aVar2 instanceof a.b) {
                SelectItem.Option option = ((a.b) aVar2).f201843a;
                gVar.setText(option != null ? option.f201827c : null);
                gVar.Uf(new d(this, selectItem));
            } else if (aVar2 instanceof a.C5987a) {
                gVar.C5(((a.C5987a) aVar2).f201842a);
            }
        }
    }
}
