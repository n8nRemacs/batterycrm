package com.avito.android.service_booking_calendar.data.model;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.service_booking_calendar.data.model.TimeSlot;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceBookingFlexibleScheduleResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0004\u0015\u0017\u0010\u000eB5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult;", "", "", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot;", "params", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$a;", "inactiveTime", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$b;", "schedule", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$a;", "action", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$b;Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$a;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$b;", "d", "()Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$b;", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$a;", "a", "()Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$a;", "ButtonStyle", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingFlexibleScheduleResult {

    @com.google.gson.annotations.c("changeButton")
    @l
    private final a action;

    @com.google.gson.annotations.c("inactiveTime")
    @k
    private final List<TimeSlot.a> inactiveTime;

    @com.google.gson.annotations.c("params")
    @k
    private final List<TimeSlot.ActiveTimeSlot> params;

    @com.google.gson.annotations.c("schedule")
    @k
    private final b schedule;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingFlexibleScheduleResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$ButtonStyle;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonStyle {

        @com.google.gson.annotations.c("primary")
        public static final ButtonStyle PRIMARY;

        @com.google.gson.annotations.c("secondary")
        public static final ButtonStyle SECONDARY;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ButtonStyle[] f275251b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275252c;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
            PRIMARY = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
            SECONDARY = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            f275251b = buttonStyleArr;
            f275252c = kotlin.enums.c.a(buttonStyleArr);
        }

        private ButtonStyle(String str, int i12) {
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) f275251b.clone();
        }
    }

    /* compiled from: ServiceBookingFlexibleScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$a;", "", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$ButtonStyle;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$ButtonStyle;", "a", "()Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$ButtonStyle;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final ButtonStyle style;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public a(@k String str, @k DeepLink deepLink, @k ButtonStyle buttonStyle) {
            this.title = str;
            this.uri = deepLink;
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

        @k
        /* renamed from: c, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: ServiceBookingFlexibleScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$b;", "", "", "title", "subtitle", "breakTime", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$c;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$c;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$c;", "d", "()Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("breakTime")
        @l
        private final String breakTime;

        @com.google.gson.annotations.c("subtitle")
        @k
        private final String subtitle;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
        @l
        private final c tooltip;

        public b(@l String str, @k String str2, @l String str3, @l c cVar) {
            this.title = str;
            this.subtitle = str2;
            this.breakTime = str3;
            this.tooltip = cVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getBreakTime() {
            return this.breakTime;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final c getTooltip() {
            return this.tooltip;
        }
    }

    /* compiled from: ServiceBookingFlexibleScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult$c;", "", "", "title", "text", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        @com.google.gson.annotations.c("buttonTitle")
        @l
        private final String buttonTitle;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public c(@k String str, @k String str2, @l String str3) {
            this.title = str;
            this.text = str2;
            this.buttonTitle = str3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public ServiceBookingFlexibleScheduleResult(@k List<TimeSlot.ActiveTimeSlot> list, @k List<TimeSlot.a> list2, @k b bVar, @l a aVar) {
        this.params = list;
        this.inactiveTime = list2;
        this.schedule = bVar;
        this.action = aVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    @k
    public final List<TimeSlot.a> b() {
        return this.inactiveTime;
    }

    @k
    public final List<TimeSlot.ActiveTimeSlot> c() {
        return this.params;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final b getSchedule() {
        return this.schedule;
    }
}
