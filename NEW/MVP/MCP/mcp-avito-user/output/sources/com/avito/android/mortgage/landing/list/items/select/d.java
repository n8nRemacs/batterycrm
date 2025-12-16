package com.avito.android.mortgage.landing.list.items.select;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import com.avito.android.mortgage.landing.list.items.select.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import w00.InterfaceC49409a;

/* compiled from: SelectPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/d;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/select/f;", "Lcom/avito/android/mortgage/landing/list/items/select/SelectItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, SelectItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC49409a, G0> f199966b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC49409a, G0> lVar) {
        this.f199966b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (SelectItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
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
        List<com.avito.android.mortgage.landing.list.items.select.payload.a> list2 = (List) obj;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(fVar, selectItem);
            return;
        }
        for (com.avito.android.mortgage.landing.list.items.select.payload.a aVar2 : list2) {
            if (aVar2 instanceof a.C5913a) {
                SelectItem.Option option = ((a.C5913a) aVar2).f199971a;
                fVar.m(option != null ? option.f199959c : null);
            }
        }
    }

    public final void k(@k f fVar, @k SelectItem selectItem) {
        fVar.setTitle(selectItem.f199953c);
        fVar.pJ(selectItem.f199954d);
        SelectItem.Option option = selectItem.f199956f;
        fVar.m(option != null ? option.f199959c : null);
        fVar.wl(new c(this, selectItem));
    }
}
