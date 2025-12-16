package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import SF0.a;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import com.avito.android.util.V2;
import fv.C40482a;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoDateRangePickerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LSF0/a;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "LSF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.arch.mvi.a<SF0.a, TrxPromoDateRangePickerInternalAction, SF0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f304034a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a f304035b;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a aVar2) {
        this.f304034a = aVar;
        this.f304035b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new b(new a(C40482a.b(this.f304034a)), aVar), com.avito.android.arch.mvi.utils.h.e(c43197r1, c.f304031l, new d(this, aVar), 300L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TrxPromoDateRangePickerInternalAction> b(@Y61.k SF0.a aVar, @Y61.k SF0.c cVar) {
        DeepLink deepLink;
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            if (dVar.f14856b) {
                com.avito.android.lib.design.chips.h hVar = dVar.f14855a;
                if (hVar instanceof ItemChipable) {
                    return new C43210w(new TrxPromoDateRangePickerInternalAction.ChangeTab(((ItemChipable) hVar).f178762b));
                }
            }
            return C43175k.w();
        }
        boolean z12 = aVar instanceof a.b;
        com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a aVar2 = this.f304035b;
        if (z12) {
            a.b bVar = (a.b) aVar;
            LocalDate localDateA = aVar2.a(bVar.f14849a, bVar.f14850b, bVar.f14851c);
            if (localDateA == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateA = com.avito.android.trx_promo_impl.b.f303906b;
            }
            return new C43210w(new TrxPromoDateRangePickerInternalAction.SetSelectedDateFrom(localDateA));
        }
        if (aVar instanceof a.c) {
            a.c cVar2 = (a.c) aVar;
            LocalDate localDateA2 = aVar2.a(cVar2.f14852a, cVar2.f14853b, cVar2.f14854c);
            if (localDateA2 == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateA2 = com.avito.android.trx_promo_impl.b.f303906b;
            }
            return new C43210w(new TrxPromoDateRangePickerInternalAction.SetSelectedDateTo(localDateA2));
        }
        if (!(aVar instanceof a.C1003a)) {
            throw new NoWhenBranchMatchedException();
        }
        V2 v22 = V2.f318762a;
        Locale locale = cG0.d.f57802a;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        LocalDate localDate = cVar.f14864c;
        v22.c("TrxPromoDateRangePicker", "dateFrom: ".concat(localDate.format(dateTimeFormatter)), null);
        LocalDate localDate2 = cVar.f14865d;
        v22.c("TrxPromoDateRangePicker", "dateTo: ".concat(localDate2.format(dateTimeFormatter)), null);
        TrxPromoDateValidator.a aVarA = com.avito.android.trx_promo_impl.data.local.a.a(cVar.f14866e, localDate);
        TrxPromoDateValidator.a aVarA2 = com.avito.android.trx_promo_impl.data.local.a.a(cVar.f14867f, localDate2);
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        LocalDate localDate3 = com.avito.android.trx_promo_impl.b.f303906b;
        if (localDate.equals(localDate3)) {
            return new C43207v(new TrxPromoDateRangePickerInternalAction[]{new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.c(R.string.trx_promo_invalid_date, new Serializable[0])), new TrxPromoDateRangePickerInternalAction.ChangeTab(1)});
        }
        if (localDate2.equals(localDate3)) {
            return new C43207v(new TrxPromoDateRangePickerInternalAction[]{new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.c(R.string.trx_promo_invalid_date, new Serializable[0])), new TrxPromoDateRangePickerInternalAction.ChangeTab(2)});
        }
        if (localDate.compareTo((ChronoLocalDate) localDate2) > 0) {
            return new C43210w(new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.f(cVar.f14874m)));
        }
        boolean z13 = aVarA instanceof TrxPromoDateValidator.a.b;
        if (z13 && (aVarA2 instanceof TrxPromoDateValidator.a.b)) {
            RF0.h hVar2 = cVar.f14863b.f14884h;
            return (hVar2 == null || (deepLink = hVar2.f14240b) == null) ? C43175k.w() : new C43210w(new TrxPromoDateRangePickerInternalAction.HandleDeeplink(deepLink));
        }
        boolean z14 = aVarA instanceof TrxPromoDateValidator.a.C9317a;
        return (z14 && (aVarA2 instanceof TrxPromoDateValidator.a.b)) ? new C43207v(new TrxPromoDateRangePickerInternalAction[]{new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.f(((TrxPromoDateValidator.a.C9317a) aVarA).f303939a)), new TrxPromoDateRangePickerInternalAction.ChangeTab(1)}) : (z13 && (aVarA2 instanceof TrxPromoDateValidator.a.C9317a)) ? new C43207v(new TrxPromoDateRangePickerInternalAction[]{new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.f(((TrxPromoDateValidator.a.C9317a) aVarA2).f303939a)), new TrxPromoDateRangePickerInternalAction.ChangeTab(2)}) : (z14 && (aVarA2 instanceof TrxPromoDateValidator.a.C9317a)) ? new C43207v(new TrxPromoDateRangePickerInternalAction[]{new TrxPromoDateRangePickerInternalAction.Error(com.avito.android.printable_text.b.f(((TrxPromoDateValidator.a.C9317a) aVarA2).f303939a)), new TrxPromoDateRangePickerInternalAction.ChangeTab(2)}) : C43175k.w();
    }
}
