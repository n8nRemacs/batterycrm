package com.avito.android.hotel_booking.select_single_value.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.hotel_booking.Value;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSingleValueInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "CloseScreenWithResult", "Content", "Init", "UpdateSelectedValue", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$Content;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$Init;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$UpdateSelectedValue;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SelectSingleValueInternalAction extends n {

    /* compiled from: SelectSingleValueInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements SelectSingleValueInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f164107b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1540941515;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SelectSingleValueInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithResult implements SelectSingleValueInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Value f164108b;

        public CloseScreenWithResult(@k Value value) {
            this.f164108b = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreenWithResult) && L.f(this.f164108b, ((CloseScreenWithResult) obj).f164108b);
        }

        public final int hashCode() {
            return this.f164108b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithResult(value=" + this.f164108b + ')';
        }
    }

    /* compiled from: SelectSingleValueInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$Content;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements SelectSingleValueInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<Value> f164109b;

        public Content(@l List<Value> list) {
            this.f164109b = list;
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
            return (obj instanceof Content) && L.f(this.f164109b, ((Content) obj).f164109b);
        }

        public final int hashCode() {
            List<Value> list = this.f164109b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(values="), this.f164109b, ')');
        }
    }

    /* compiled from: SelectSingleValueInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$Init;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SelectSingleValueInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ParametrizedEvent f164110b;

        public Init(@l ParametrizedEvent parametrizedEvent) {
            this.f164110b = parametrizedEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f164110b, ((Init) obj).f164110b);
        }

        public final int hashCode() {
            ParametrizedEvent parametrizedEvent = this.f164110b;
            if (parametrizedEvent == null) {
                return 0;
            }
            return parametrizedEvent.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("Init(onClickEvent="), this.f164110b, ')');
        }
    }

    /* compiled from: SelectSingleValueInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction$UpdateSelectedValue;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedValue implements SelectSingleValueInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Value f164111b;

        public UpdateSelectedValue(@l Value value) {
            this.f164111b = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedValue) && L.f(this.f164111b, ((UpdateSelectedValue) obj).f164111b);
        }

        public final int hashCode() {
            Value value = this.f164111b;
            if (value == null) {
                return 0;
            }
            return value.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedValue(value=" + this.f164111b + ')';
        }
    }
}
