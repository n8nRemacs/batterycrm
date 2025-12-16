package bG0;

import android.os.Bundle;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoDiffUtilCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LbG0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25509a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF117182c() == aVar2.getF117182c();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        Bundle bundle = new Bundle();
        if ((aVar3 instanceof com.avito.android.trx_promo_impl.item.commission.c) && (aVar4 instanceof com.avito.android.trx_promo_impl.item.commission.c)) {
            bundle.putBoolean("trx_promo_payload_commission_value_change", ((com.avito.android.trx_promo_impl.item.commission.c) aVar3).f304227c != ((com.avito.android.trx_promo_impl.item.commission.c) aVar4).f304227c);
        } else if ((aVar3 instanceof com.avito.android.trx_promo_impl.item.discount_v2.c) && (aVar4 instanceof com.avito.android.trx_promo_impl.item.discount_v2.c)) {
            com.avito.android.trx_promo_impl.item.discount_v2.c cVar = (com.avito.android.trx_promo_impl.item.discount_v2.c) aVar3;
            com.avito.android.trx_promo_impl.item.discount_v2.c cVar2 = (com.avito.android.trx_promo_impl.item.discount_v2.c) aVar4;
            bundle.putBoolean("trx_promo_payload_discount_texts_change", (L.f(cVar.f304274c, cVar2.f304274c) && L.f(cVar.f304275d, cVar2.f304275d)) ? false : true);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
