package com.avito.android.str_calendar.seller.reject.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarRejectInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "OpenDeeplink", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction$OpenDeeplink;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrCalendarRejectInternalAction extends n {

    /* compiled from: StrCalendarRejectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements StrCalendarRejectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f288056b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: StrCalendarRejectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction$OpenDeeplink;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrCalendarRejectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f288057b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f288057b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f288057b, ((OpenDeeplink) obj).f288057b);
        }

        public final int hashCode() {
            return this.f288057b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f288057b, ')');
        }
    }
}
