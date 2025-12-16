package com.avito.android.hotel_booking.select_radio.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectRadioInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "CloseScreenWithResult", "Content", "Init", "UpdateSelectedItem", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$Content;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$Init;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$UpdateSelectedItem;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SelectRadioInternalAction extends n {

    /* compiled from: SelectRadioInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements SelectRadioInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f164035b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -351781066;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SelectRadioInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithResult implements SelectRadioInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RadioItem f164036b;

        public CloseScreenWithResult(@k RadioItem radioItem) {
            this.f164036b = radioItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreenWithResult) && L.f(this.f164036b, ((CloseScreenWithResult) obj).f164036b);
        }

        public final int hashCode() {
            return this.f164036b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithResult(item=" + this.f164036b + ')';
        }
    }

    /* compiled from: SelectRadioInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$Content;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements SelectRadioInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<RadioItem> f164037b;

        public Content(@l List<RadioItem> list) {
            this.f164037b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f164037b, ((Content) obj).f164037b);
        }

        public final int hashCode() {
            List<RadioItem> list = this.f164037b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(items="), this.f164037b, ')');
        }
    }

    /* compiled from: SelectRadioInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$Init;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SelectRadioInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ParametrizedEvent f164038b;

        public Init(@l ParametrizedEvent parametrizedEvent) {
            this.f164038b = parametrizedEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f164038b, ((Init) obj).f164038b);
        }

        public final int hashCode() {
            ParametrizedEvent parametrizedEvent = this.f164038b;
            if (parametrizedEvent == null) {
                return 0;
            }
            return parametrizedEvent.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("Init(event="), this.f164038b, ')');
        }
    }

    /* compiled from: SelectRadioInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction$UpdateSelectedItem;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedItem implements SelectRadioInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final RadioItem f164039b;

        public UpdateSelectedItem(@l RadioItem radioItem) {
            this.f164039b = radioItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedItem) && L.f(this.f164039b, ((UpdateSelectedItem) obj).f164039b);
        }

        public final int hashCode() {
            RadioItem radioItem = this.f164039b;
            if (radioItem == null) {
                return 0;
            }
            return radioItem.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedItem(item=" + this.f164039b + ')';
        }
    }
}
