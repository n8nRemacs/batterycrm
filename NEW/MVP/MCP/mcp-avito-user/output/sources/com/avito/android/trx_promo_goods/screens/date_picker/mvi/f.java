package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import OF0.a;
import com.avito.android.R;
import com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.entity.TrxPromoGoodsDatePickerInternalAction;
import com.avito.android.util.V2;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: TrxPromoGoodsDatePickerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LOF0/a;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "LOF0/c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<OF0.a, TrxPromoGoodsDatePickerInternalAction, OF0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f303728a;

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f303728a = aVar;
    }

    @Y61.k
    public static InterfaceC43160i c(@Y61.k OF0.a aVar, @Y61.k OF0.c cVar) {
        Object next;
        C43210w c43210w;
        boolean z12 = aVar instanceof a.b;
        com.avito.android.lib.design.picker.k<?> kVar = cVar.f12113f;
        com.avito.android.lib.design.picker.k<?> kVar2 = cVar.f12112e;
        com.avito.android.lib.design.picker.k<?> kVar3 = cVar.f12111d;
        if (z12) {
            com.avito.android.lib.design.picker.k<?> kVar4 = ((a.b) aVar).f12100a;
            return !L.f(kVar4, kVar3) ? new C43210w(new TrxPromoGoodsDatePickerInternalAction.WheelSelectionChange(kVar4, kVar2, kVar)) : C43175k.w();
        }
        if (aVar instanceof a.d) {
            com.avito.android.lib.design.picker.k<?> kVar5 = ((a.d) aVar).f12102a;
            return !L.f(kVar5, kVar2) ? new C43210w(new TrxPromoGoodsDatePickerInternalAction.WheelSelectionChange(kVar3, kVar5, kVar)) : C43175k.w();
        }
        if (aVar instanceof a.e) {
            com.avito.android.lib.design.picker.k<?> kVar6 = ((a.e) aVar).f12103a;
            return !L.f(kVar6, kVar) ? new C43210w(new TrxPromoGoodsDatePickerInternalAction.WheelSelectionChange(kVar3, kVar2, kVar6)) : C43175k.w();
        }
        if (!(aVar instanceof a.C0781a)) {
            if (aVar instanceof a.c) {
                return new C43210w(new TrxPromoGoodsDatePickerInternalAction.HandleDeeplink(((a.c) aVar).f12101a));
            }
            throw new NoWhenBranchMatchedException();
        }
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("date: ");
        LocalDate localDate = cVar.f12117j;
        sb2.append(localDate != null ? localDate.format(DateTimeFormatter.ISO_DATE) : null);
        v22.c("TrxPromoGoodsDatePicker", sb2.toString(), null);
        if (localDate == null) {
            c43210w = new C43210w(new TrxPromoGoodsDatePickerInternalAction.Error(com.avito.android.printable_text.b.c(R.string.trx_promo_goods_invalid_date, new Serializable[0])));
        } else {
            List<TrxPromoGoodsDatePickerValidator> list = cVar.f12114g;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (TrxPromoGoodsDatePickerValidator trxPromoGoodsDatePickerValidator : list) {
                arrayList.add(trxPromoGoodsDatePickerValidator.a(localDate) ? TrxPromoGoodsDatePickerValidator.a.b.f303664a : new TrxPromoGoodsDatePickerValidator.a.C9301a(trxPromoGoodsDatePickerValidator.getF303662c()));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof TrxPromoGoodsDatePickerValidator.a.C9301a) {
                    break;
                }
            }
            Object obj = (TrxPromoGoodsDatePickerValidator.a.C9301a) (next instanceof TrxPromoGoodsDatePickerValidator.a.C9301a ? next : null);
            if (obj == null) {
                obj = TrxPromoGoodsDatePickerValidator.a.b.f303664a;
            }
            if (obj instanceof TrxPromoGoodsDatePickerValidator.a.b) {
                return new C43210w(new TrxPromoGoodsDatePickerInternalAction.HandleDeeplink(((a.C0781a) aVar).f12099a));
            }
            if (!(obj instanceof TrxPromoGoodsDatePickerValidator.a.C9301a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TrxPromoGoodsDatePickerInternalAction.Error(com.avito.android.printable_text.b.f(((TrxPromoGoodsDatePickerValidator.a.C9301a) obj).f303663a)));
        }
        return c43210w;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new b(new c(new a(y.a(this.f303728a.V9())), aVar)), com.avito.android.arch.mvi.utils.h.e(c43197r1, d.f303717l, new e(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TrxPromoGoodsDatePickerInternalAction> b(OF0.a aVar, OF0.c cVar) {
        return c(aVar, cVar);
    }
}
