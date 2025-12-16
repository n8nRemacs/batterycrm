package com.avito.android.str_calendar.seller.calendar.mvi;

import Jy0.InterfaceC14263c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerCalendarOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "LJy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<StrSellerCalendarInternalAction, InterfaceC14263c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14263c b(StrSellerCalendarInternalAction strSellerCalendarInternalAction) {
        DeepLink deepLink;
        InterfaceC14263c bVar;
        StrSellerCalendarInternalAction strSellerCalendarInternalAction2 = strSellerCalendarInternalAction;
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.CloseScreen) {
            return InterfaceC14263c.a.f9195a;
        }
        if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ShowCalendarParameters) {
            StrSellerCalendarInternalAction.ShowCalendarParameters showCalendarParameters = (StrSellerCalendarInternalAction.ShowCalendarParameters) strSellerCalendarInternalAction2;
            bVar = new InterfaceC14263c.d(showCalendarParameters.f287709b, showCalendarParameters.f287710c, showCalendarParameters.f287711d, showCalendarParameters.f287712e);
        } else if (strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ScrollToPosition) {
            bVar = new InterfaceC14263c.C0548c(((StrSellerCalendarInternalAction.ScrollToPosition) strSellerCalendarInternalAction2).f287708b);
        } else {
            if (!(strSellerCalendarInternalAction2 instanceof StrSellerCalendarInternalAction.ContentLoaded) || (deepLink = ((StrSellerCalendarInternalAction.ContentLoaded) strSellerCalendarInternalAction2).f287703b.f8660g) == null) {
                return null;
            }
            bVar = new InterfaceC14263c.b(deepLink);
        }
        return bVar;
    }
}
