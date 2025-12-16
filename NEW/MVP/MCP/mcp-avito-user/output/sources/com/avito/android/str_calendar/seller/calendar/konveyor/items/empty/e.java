package com.avito.android.str_calendar.seller.calendar.konveyor.items.empty;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.Position;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarEmptyItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/e;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/g;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.f<g, a> {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ((a) aVar).getClass();
        gVar.Os(Position.f286642f);
        gVar.QM();
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            aVar2.getClass();
            gVar.Os(Position.f286642f);
            gVar.QM();
            return;
        }
        Position position = dVar.f287655a;
        if (position != null) {
            gVar.Os(position);
        }
        if (dVar.f287656b) {
            aVar2.getClass();
            gVar.QM();
        }
    }
}
