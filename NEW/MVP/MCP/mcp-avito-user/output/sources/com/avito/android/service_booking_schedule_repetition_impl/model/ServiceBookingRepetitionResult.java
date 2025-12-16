package com.avito.android.service_booking_schedule_repetition_impl.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.service_booking_calendar.data.model.Day;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingRepetitionResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult;", "", "", "title", "", "Lcom/avito/android/service_booking_calendar/data/model/Day;", "days", "actionTitle", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo;", "saveScheduleInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo;", "c", "()Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo;", "ServiceBookingSaveScheduleInfo", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingRepetitionResult {

    @c("actionTitle")
    @k
    private final String actionTitle;

    @c("days")
    @k
    private final List<Day> days;

    @c("saveScheduleInfo")
    @l
    private final ServiceBookingSaveScheduleInfo saveScheduleInfo;

    @c("title")
    @k
    private final String title;

    /* compiled from: ServiceBookingRepetitionResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo;", "", "", "title", "description", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;", "acceptButton", "cancelButton", "fromPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;", "a", "()Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;", "b", "d", "ActionButton", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingSaveScheduleInfo {

        @c("acceptButton")
        @k
        private final ActionButton acceptButton;

        @c("cancelButton")
        @k
        private final ActionButton cancelButton;

        @c("description")
        @k
        private final String description;

        @c("fromPage")
        @k
        private final String fromPage;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingRepetitionResult.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton;", "", "", "title", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "a", "()Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "ButtonStyle", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionButton {

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @k
            private final ButtonStyle style;

            @c("title")
            @k
            private final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ServiceBookingRepetitionResult.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ButtonStyle {

                @c("primary")
                public static final ButtonStyle PRIMARY;

                @c("secondary")
                public static final ButtonStyle SECONDARY;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ButtonStyle[] f277616b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ a f277617c;

                static {
                    ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
                    PRIMARY = buttonStyle;
                    ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
                    SECONDARY = buttonStyle2;
                    ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
                    f277616b = buttonStyleArr;
                    f277617c = kotlin.enums.c.a(buttonStyleArr);
                }

                private ButtonStyle(String str, int i12) {
                }

                public static ButtonStyle valueOf(String str) {
                    return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
                }

                public static ButtonStyle[] values() {
                    return (ButtonStyle[]) f277616b.clone();
                }
            }

            public ActionButton(@k String str, @k ButtonStyle buttonStyle) {
                this.title = str;
                this.style = buttonStyle;
            }

            @k
            /* renamed from: a, reason: from getter */
            public final ButtonStyle getStyle() {
                return this.style;
            }

            @k
            /* renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return L.f(this.title, actionButton.title) && this.style == actionButton.style;
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "ActionButton(title=" + this.title + ", style=" + this.style + ')';
            }
        }

        public ServiceBookingSaveScheduleInfo(@k String str, @k String str2, @k ActionButton actionButton, @k ActionButton actionButton2, @k String str3) {
            this.title = str;
            this.description = str2;
            this.acceptButton = actionButton;
            this.cancelButton = actionButton2;
            this.fromPage = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final ActionButton getAcceptButton() {
            return this.acceptButton;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final ActionButton getCancelButton() {
            return this.cancelButton;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingSaveScheduleInfo)) {
                return false;
            }
            ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = (ServiceBookingSaveScheduleInfo) obj;
            return L.f(this.title, serviceBookingSaveScheduleInfo.title) && L.f(this.description, serviceBookingSaveScheduleInfo.description) && L.f(this.acceptButton, serviceBookingSaveScheduleInfo.acceptButton) && L.f(this.cancelButton, serviceBookingSaveScheduleInfo.cancelButton) && L.f(this.fromPage, serviceBookingSaveScheduleInfo.fromPage);
        }

        public final int hashCode() {
            return this.fromPage.hashCode() + ((this.cancelButton.hashCode() + ((this.acceptButton.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingSaveScheduleInfo(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", acceptButton=");
            sb2.append(this.acceptButton);
            sb2.append(", cancelButton=");
            sb2.append(this.cancelButton);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.fromPage, ')');
        }
    }

    public ServiceBookingRepetitionResult(@k String str, @k List<Day> list, @k String str2, @l ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo) {
        this.title = str;
        this.days = list;
        this.actionTitle = str2;
        this.saveScheduleInfo = serviceBookingSaveScheduleInfo;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @k
    public final List<Day> b() {
        return this.days;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ServiceBookingSaveScheduleInfo getSaveScheduleInfo() {
        return this.saveScheduleInfo;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingRepetitionResult)) {
            return false;
        }
        ServiceBookingRepetitionResult serviceBookingRepetitionResult = (ServiceBookingRepetitionResult) obj;
        return L.f(this.title, serviceBookingRepetitionResult.title) && L.f(this.days, serviceBookingRepetitionResult.days) && L.f(this.actionTitle, serviceBookingRepetitionResult.actionTitle) && L.f(this.saveScheduleInfo, serviceBookingRepetitionResult.saveScheduleInfo);
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(this.title.hashCode() * 31, 31, this.days), 31, this.actionTitle);
        ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = this.saveScheduleInfo;
        return iD2 + (serviceBookingSaveScheduleInfo == null ? 0 : serviceBookingSaveScheduleInfo.hashCode());
    }

    @k
    public final String toString() {
        return "ServiceBookingRepetitionResult(title=" + this.title + ", days=" + this.days + ", actionTitle=" + this.actionTitle + ", saveScheduleInfo=" + this.saveScheduleInfo + ')';
    }
}
