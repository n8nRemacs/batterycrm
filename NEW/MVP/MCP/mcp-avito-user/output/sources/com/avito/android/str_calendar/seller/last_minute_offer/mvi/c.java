package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import Ky0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LastMinuteOfferActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LKy0/b;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<Ky0.b, LastMinuteOfferInternalAction, LastMinuteOfferState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.last_minute_offer.b f287919a;

    @Inject
    public c(@Y61.k com.avito.android.str_calendar.seller.last_minute_offer.b bVar) {
        this.f287919a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LastMinuteOfferInternalAction> b(Ky0.b bVar, LastMinuteOfferState lastMinuteOfferState) {
        C43210w c43210w;
        Ky0.b bVar2 = bVar;
        LastMinuteOfferState lastMinuteOfferState2 = lastMinuteOfferState;
        if (bVar2 instanceof b.c) {
            return new C43210w(new LastMinuteOfferInternalAction.CloseScreen(false, null));
        }
        if (bVar2 instanceof b.e) {
            return this.f287919a.b();
        }
        if (bVar2 instanceof b.g) {
            c43210w = new C43210w(new LastMinuteOfferInternalAction.CheckSwitchToggle(((b.g) bVar2).f9735a));
        } else if (bVar2 instanceof b.d) {
            c43210w = new C43210w(new LastMinuteOfferInternalAction.ChangeSelectedOption(((b.d) bVar2).f9731a));
        } else {
            if (bVar2 instanceof b.f) {
                return C43175k.G(new a(lastMinuteOfferState2, (b.f) bVar2, this, null));
            }
            if (!(bVar2 instanceof b.C0600b)) {
                if (bVar2 instanceof b.a) {
                    return C43175k.G(new b(bVar2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new LastMinuteOfferInternalAction.OpenKeyboard(((b.C0600b) bVar2).f9729a));
        }
        return c43210w;
    }
}
