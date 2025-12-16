package com.avito.android.hotel_booking.select_single_value.mvi;

import VI.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.hotel_booking.Value;
import com.avito.android.hotel_booking.select_single_value.mvi.entity.SelectSingleValueInternalAction;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectSingleValueActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LVI/a;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "LVI/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<VI.a, SelectSingleValueInternalAction, VI.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UI.a f164098a;

    @Inject
    public b(@Y61.k UI.a aVar) {
        this.f164098a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectSingleValueInternalAction> b(VI.a aVar, VI.c cVar) {
        C43210w c43210w;
        Object next;
        VI.a aVar2 = aVar;
        VI.c cVar2 = cVar;
        Value value = null;
        if (aVar2 instanceof a.C1170a) {
            return C43175k.G(new a(cVar2, null));
        }
        if ((aVar2 instanceof a.b) || (aVar2 instanceof a.c)) {
            c43210w = new C43210w(SelectSingleValueInternalAction.CloseScreen.f164107b);
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Value> list = cVar2.f17056b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((Value) next).getId(), ((a.d) aVar2).f17051a)) {
                        break;
                    }
                }
                Value value2 = (Value) next;
                if (value2 != null && L.f(value2.getIsChecked(), Boolean.FALSE)) {
                    value = value2;
                }
            }
            ParametrizedEvent parametrizedEvent = cVar2.f17057c;
            if (parametrizedEvent != null) {
                this.f164098a.a(parametrizedEvent, value);
            }
            c43210w = new C43210w(new SelectSingleValueInternalAction.UpdateSelectedValue(value));
        }
        return c43210w;
    }
}
