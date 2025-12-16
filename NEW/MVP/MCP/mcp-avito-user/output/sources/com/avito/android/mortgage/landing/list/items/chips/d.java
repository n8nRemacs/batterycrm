package com.avito.android.mortgage.landing.list.items.chips;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import com.avito.android.mortgage.landing.list.items.chips.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import w00.InterfaceC49409a;

/* compiled from: ChipsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/d;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/chips/f;", "Lcom/avito/android/mortgage/landing/list/items/chips/ChipsItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, ChipsItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC49409a, G0> f199681b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC49409a, G0> lVar) {
        this.f199681b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ChipsItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        ChipsItem chipsItem = (ChipsItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.chips.payload.a> list2 = (List) obj;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(fVar, chipsItem);
            return;
        }
        for (com.avito.android.mortgage.landing.list.items.chips.payload.a aVar2 : list2) {
            if (aVar2 instanceof a.C5898a) {
                a.C5898a c5898a = (a.C5898a) aVar2;
                int size = c5898a.f199687a.size();
                ChipsItem.Chip chip = c5898a.f199688b;
                List<ChipsItem.Chip> list3 = c5898a.f199687a;
                if (size > 1) {
                    fVar.C1(list3);
                    fVar.db(chip != null ? Integer.valueOf(list3.indexOf(chip)) : null);
                } else {
                    if (chip == null) {
                        chip = (ChipsItem.Chip) C42745f0.G(list3);
                    }
                    if (chip != null) {
                        fVar.ag(chip);
                    }
                }
            } else if (aVar2 instanceof a.c) {
                a.c cVar = (a.c) aVar2;
                ChipsItem.Chip chip2 = cVar.f199691b;
                fVar.db(chip2 != null ? Integer.valueOf(cVar.f199690a.indexOf(chip2)) : null);
            } else if (aVar2 instanceof a.b) {
                fVar.I(((a.b) aVar2).f199689a);
            }
        }
    }

    public final void k(@k f fVar, @k ChipsItem chipsItem) {
        fVar.setTitle(chipsItem.f199669c);
        fVar.I(chipsItem.f199672f);
        List<ChipsItem.Chip> list = chipsItem.f199670d;
        int size = list.size();
        ChipsItem.Chip chip = chipsItem.f199671e;
        if (size > 1) {
            fVar.C1(list);
            fVar.db(chip != null ? Integer.valueOf(list.indexOf(chip)) : null);
        } else {
            if (chip == null) {
                chip = (ChipsItem.Chip) C42745f0.G(list);
            }
            if (chip != null) {
                fVar.ag(chip);
            }
        }
        fVar.E1(new c(this, chipsItem));
    }
}
