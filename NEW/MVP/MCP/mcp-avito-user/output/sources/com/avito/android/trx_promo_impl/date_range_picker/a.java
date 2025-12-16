package com.avito.android.trx_promo_impl.date_range_picker;

import SF0.a;
import Y41.p;
import com.avito.android.lib.design.chips.h;
import com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoDateRangePickerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "item", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements p<h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TrxPromoDateRangePickerFragment f303986l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment) {
        super(2);
        this.f303986l = trxPromoDateRangePickerFragment;
    }

    @Override // Y41.p
    public final G0 invoke(h hVar, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TrxPromoDateRangePickerFragment.a aVar = TrxPromoDateRangePickerFragment.f303953r0;
        this.f303986l.f5().accept(new a.d(hVar, zBooleanValue));
        return G0.f406611a;
    }
}
