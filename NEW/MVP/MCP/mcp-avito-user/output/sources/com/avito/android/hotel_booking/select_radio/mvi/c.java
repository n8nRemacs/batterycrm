package com.avito.android.hotel_booking.select_radio.mvi;

import TI.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectRadioActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LTI/a;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "LTI/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<TI.a, SelectRadioInternalAction, TI.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SI.a f164027a;

    @Inject
    public c(@Y61.k SI.a aVar) {
        this.f164027a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectRadioInternalAction> b(TI.a aVar, TI.c cVar) {
        TI.a aVar2 = aVar;
        TI.c cVar2 = cVar;
        if (aVar2 instanceof a.C1055a) {
            return C43175k.G(new a(cVar2, null));
        }
        if ((aVar2 instanceof a.b) || (aVar2 instanceof a.d)) {
            C43210w c43210w = new C43210w(SelectRadioInternalAction.CloseScreen.f164035b);
            return c43210w;
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(cVar2, (a.c) aVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
