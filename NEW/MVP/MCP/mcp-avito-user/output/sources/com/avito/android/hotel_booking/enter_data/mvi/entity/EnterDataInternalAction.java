package com.avito.android.hotel_booking.enter_data.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.hotel_booking.Group;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "CloseScreenWithResult", "Content", "Init", "UpdateGroups", "UpdateKeyboardVisibility", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$Content;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$Init;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$UpdateGroups;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$UpdateKeyboardVisibility;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EnterDataInternalAction extends n {

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements EnterDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f163570b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -135919200;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$CloseScreenWithResult;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithResult implements EnterDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Group> f163571b;

        public CloseScreenWithResult(@k List<Group> list) {
            this.f163571b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreenWithResult) && L.f(this.f163571b, ((CloseScreenWithResult) obj).f163571b);
        }

        public final int hashCode() {
            return this.f163571b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("CloseScreenWithResult(groups="), this.f163571b, ')');
        }
    }

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$Content;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements EnterDataInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<Group> f163572b;

        public Content(@l List<Group> list) {
            this.f163572b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Content) && L.f(this.f163572b, ((Content) obj).f163572b);
        }

        public final int hashCode() {
            List<Group> list = this.f163572b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(groups="), this.f163572b, ')');
        }
    }

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$Init;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements EnterDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ParametrizedEvent f163573b;

        public Init(@l ParametrizedEvent parametrizedEvent) {
            this.f163573b = parametrizedEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f163573b, ((Init) obj).f163573b);
        }

        public final int hashCode() {
            ParametrizedEvent parametrizedEvent = this.f163573b;
            if (parametrizedEvent == null) {
                return 0;
            }
            return parametrizedEvent.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("Init(onTextChangeEvent="), this.f163573b, ')');
        }
    }

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$UpdateGroups;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGroups implements EnterDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<Group> f163574b;

        public UpdateGroups(@l List<Group> list) {
            this.f163574b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGroups) && L.f(this.f163574b, ((UpdateGroups) obj).f163574b);
        }

        public final int hashCode() {
            List<Group> list = this.f163574b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateGroups(newGroups="), this.f163574b, ')');
        }
    }

    /* compiled from: EnterDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction$UpdateKeyboardVisibility;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateKeyboardVisibility implements EnterDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163575b;

        public UpdateKeyboardVisibility(boolean z12) {
            this.f163575b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateKeyboardVisibility) && this.f163575b == ((UpdateKeyboardVisibility) obj).f163575b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f163575b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateKeyboardVisibility(isVisible="), this.f163575b, ')');
        }
    }
}
