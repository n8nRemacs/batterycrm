package com.avito.android.service_booking_day_settings.daysettings.data.remote.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DayScheduleResult.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001:\t(*G,PVH/2BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u00105R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b9\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\bF\u00103R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\bG\u00103R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\bH\u00108R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010L\u001a\u0004\bR\u0010NR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult;", "", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;", "actionOneDay", "actionRepeat", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$c;", SelectionType.TYPE_DAY, "", "errOccupied", "", "isUnsettled", "", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$e;", "occupied", "title", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$f;", "toast", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$g;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$h;", "workHours", "showBreaks", "titleBreak", "addBreak", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$a;", "breaks", "", "maxBreaksCount", "Lcom/avito/android/remote/model/UniversalColor;", "warningColor", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$b;", "breakErrorTexts", "errorColor", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo;", "saveScheduleInfo", "<init>", "(Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$c;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$f;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$g;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$h;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$b;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo;)V", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;", "a", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;", "b", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$c;", "g", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$c;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Z", "()Z", "Ljava/util/List;", "k", "()Ljava/util/List;", "n", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$f;", "p", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$f;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$g;", "q", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$g;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$h;", "s", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$h;", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "o", "c", "f", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalColor;", "r", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$b;", "e", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$b;", "i", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo;", "l", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo;", "ServiceBookingSaveScheduleInfo", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayScheduleResult {

    @com.google.gson.annotations.c("actionOneDay")
    @k
    private final d actionOneDay;

    @com.google.gson.annotations.c("actionRepeat")
    @k
    private final d actionRepeat;

    @com.google.gson.annotations.c("addBreak")
    @l
    private final String addBreak;

    @com.google.gson.annotations.c("agreement")
    @k
    private final AttributedText agreement;

    @com.google.gson.annotations.c("errors")
    @l
    private final b breakErrorTexts;

    @com.google.gson.annotations.c("breaks")
    @l
    private final List<a> breaks;

    @com.google.gson.annotations.c(SelectionType.TYPE_DAY)
    @k
    private final c day;

    @com.google.gson.annotations.c("errOccupied")
    @k
    private final String errOccupied;

    @com.google.gson.annotations.c("errorColor")
    @l
    private final UniversalColor errorColor;

    @com.google.gson.annotations.c("isUnsettled")
    private final boolean isUnsettled;

    @com.google.gson.annotations.c("maxBreaksCount")
    @l
    private final Integer maxBreaksCount;

    @com.google.gson.annotations.c("occupied")
    @k
    private final List<e> occupied;

    @com.google.gson.annotations.c("saveScheduleInfo")
    @l
    private final ServiceBookingSaveScheduleInfo saveScheduleInfo;

    @com.google.gson.annotations.c("showBreaks")
    @l
    private final Boolean showBreaks;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("titleBreak")
    @l
    private final String titleBreak;

    @com.google.gson.annotations.c("toast")
    @l
    private final f toast;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @k
    private final g tooltip;

    @com.google.gson.annotations.c("warningColor")
    @l
    private final UniversalColor warningColor;

    @com.google.gson.annotations.c("workHours")
    @k
    private final h workHours;

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;", "acceptButton", "cancelButton", "fromPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;", "c", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;", "d", "e", "ActionButton", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ServiceBookingSaveScheduleInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingSaveScheduleInfo> CREATOR = new a();

        @com.google.gson.annotations.c("acceptButton")
        @k
        private final ActionButton acceptButton;

        @com.google.gson.annotations.c("cancelButton")
        @k
        private final ActionButton cancelButton;

        @com.google.gson.annotations.c("description")
        @k
        private final String description;

        @com.google.gson.annotations.c("fromPage")
        @k
        private final String fromPage;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        /* compiled from: DayScheduleResult.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "c", "()Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "ButtonStyle", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ActionButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButton> CREATOR = new a();

            @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @k
            private final ButtonStyle style;

            @com.google.gson.annotations.c("title")
            @k
            private final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DayScheduleResult.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class ButtonStyle implements Parcelable {

                @k
                public static final Parcelable.Creator<ButtonStyle> CREATOR;

                @com.google.gson.annotations.c("primary")
                public static final ButtonStyle PRIMARY;

                @com.google.gson.annotations.c("secondary")
                public static final ButtonStyle SECONDARY;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ButtonStyle[] f276756b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f276757c;

                /* compiled from: DayScheduleResult.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ButtonStyle> {
                    @Override // android.os.Parcelable.Creator
                    public final ButtonStyle createFromParcel(Parcel parcel) {
                        return ButtonStyle.valueOf(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ButtonStyle[] newArray(int i12) {
                        return new ButtonStyle[i12];
                    }
                }

                static {
                    ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
                    PRIMARY = buttonStyle;
                    ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
                    SECONDARY = buttonStyle2;
                    ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
                    f276756b = buttonStyleArr;
                    f276757c = kotlin.enums.c.a(buttonStyleArr);
                    CREATOR = new a();
                }

                private ButtonStyle(String str, int i12) {
                }

                public static ButtonStyle valueOf(String str) {
                    return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
                }

                public static ButtonStyle[] values() {
                    return (ButtonStyle[]) f276756b.clone();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(name());
                }
            }

            /* compiled from: DayScheduleResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionButton> {
                @Override // android.os.Parcelable.Creator
                public final ActionButton createFromParcel(Parcel parcel) {
                    return new ActionButton(parcel.readString(), ButtonStyle.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButton[] newArray(int i12) {
                    return new ActionButton[i12];
                }
            }

            public ActionButton(@k String str, @k ButtonStyle buttonStyle) {
                this.title = str;
                this.style = buttonStyle;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final ButtonStyle getStyle() {
                return this.style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
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

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "ActionButton(title=" + this.title + ", style=" + this.style + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                this.style.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: DayScheduleResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingSaveScheduleInfo> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSaveScheduleInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<ActionButton> creator = ActionButton.CREATOR;
                return new ServiceBookingSaveScheduleInfo(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSaveScheduleInfo[] newArray(int i12) {
                return new ServiceBookingSaveScheduleInfo[i12];
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
        /* renamed from: c, reason: from getter */
        public final ActionButton getAcceptButton() {
            return this.acceptButton;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final ActionButton getCancelButton() {
            return this.cancelButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
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

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            this.acceptButton.writeToParcel(parcel, i12);
            this.cancelButton.writeToParcel(parcel, i12);
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$a;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(II)V", "I", "a", "()I", "b", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final int from;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final int to;

        public a(int i12, int i13) {
            this.from = i12;
            this.to = i13;
        }

        /* renamed from: a, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        /* renamed from: b, reason: from getter */
        public final int getTo() {
            return this.to;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.from == aVar.from && this.to == aVar.to;
        }

        public final int hashCode() {
            return Integer.hashCode(this.to) + (Integer.hashCode(this.from) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Break(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return r.t(sb2, this.to, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$b;", "", "", "workTimeError", "intersectionError", "incompleteError", "minBreakErr", "startEndBreakErr", "breakEqualWorkErr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", "b", "d", "e", "a", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @com.google.gson.annotations.c("breakEqualWorkErr")
        @l
        private final String breakEqualWorkErr;

        @com.google.gson.annotations.c("incompleteErr")
        @k
        private final String incompleteError;

        @com.google.gson.annotations.c("intersectionErr")
        @k
        private final String intersectionError;

        @com.google.gson.annotations.c("minBreakErr")
        @l
        private final String minBreakErr;

        @com.google.gson.annotations.c("startEndBreakErr")
        @l
        private final String startEndBreakErr;

        @com.google.gson.annotations.c("workTimeErr")
        @k
        private final String workTimeError;

        public b(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6) {
            this.workTimeError = str;
            this.intersectionError = str2;
            this.incompleteError = str3;
            this.minBreakErr = str4;
            this.startEndBreakErr = str5;
            this.breakEqualWorkErr = str6;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getBreakEqualWorkErr() {
            return this.breakEqualWorkErr;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getIncompleteError() {
            return this.incompleteError;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getIntersectionError() {
            return this.intersectionError;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getMinBreakErr() {
            return this.minBreakErr;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getStartEndBreakErr() {
            return this.startEndBreakErr;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.workTimeError, bVar.workTimeError) && L.f(this.intersectionError, bVar.intersectionError) && L.f(this.incompleteError, bVar.incompleteError) && L.f(this.minBreakErr, bVar.minBreakErr) && L.f(this.startEndBreakErr, bVar.startEndBreakErr) && L.f(this.breakEqualWorkErr, bVar.breakEqualWorkErr);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getWorkTimeError() {
            return this.workTimeError;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.workTimeError.hashCode() * 31, 31, this.intersectionError), 31, this.incompleteError);
            String str = this.minBreakErr;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.startEndBreakErr;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.breakEqualWorkErr;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakErrorTexts(workTimeError=");
            sb2.append(this.workTimeError);
            sb2.append(", intersectionError=");
            sb2.append(this.intersectionError);
            sb2.append(", incompleteError=");
            sb2.append(this.incompleteError);
            sb2.append(", minBreakErr=");
            sb2.append(this.minBreakErr);
            sb2.append(", startEndBreakErr=");
            sb2.append(this.startEndBreakErr);
            sb2.append(", breakEqualWorkErr=");
            return C22026a.c(sb2, this.breakEqualWorkErr, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$c;", "", "", "active", "", "timestamp", "", "title", "<init>", "(ZJLjava/lang/String;)V", "Z", "a", "()Z", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        @com.google.gson.annotations.c("active")
        private final boolean active;

        @com.google.gson.annotations.c("timestamp")
        private final long timestamp;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public c(boolean z12, long j12, @k String str) {
            this.active = z12;
            this.timestamp = j12;
            this.title = str;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getActive() {
            return this.active;
        }

        /* renamed from: b, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.active == cVar.active && this.timestamp == cVar.timestamp && L.f(this.title, cVar.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + r.g(Boolean.hashCode(this.active) * 31, 31, this.timestamp);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Day(active=");
            sb2.append(this.active);
            sb2.append(", timestamp=");
            sb2.append(this.timestamp);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$d;", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "title", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public d(@k String str, @k DeepLink deepLink, @k String str2) {
            this.style = str;
            this.uri = deepLink;
            this.title = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getStyle() {
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.style, dVar.style) && L.f(this.uri, dVar.uri) && L.f(this.title, dVar.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + com.avito.android.actions_sheet.a.e(this.uri, this.style.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayScheduleActionButton(style=");
            sb2.append(this.style);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$e;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(II)V", "I", "a", "()I", "b", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final int from;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final int to;

        public e(int i12, int i13) {
            this.from = i12;
            this.to = i13;
        }

        /* renamed from: a, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        /* renamed from: b, reason: from getter */
        public final int getTo() {
            return this.to;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.from == eVar.from && this.to == eVar.to;
        }

        public final int hashCode() {
            return Integer.hashCode(this.to) + (Integer.hashCode(this.from) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayScheduleOccupied(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return r.t(sb2, this.to, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$f;", "", "", "button", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        @com.google.gson.annotations.c("button")
        @k
        private final String button;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        public f(@k String str, @k String str2) {
            this.button = str;
            this.text = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getButton() {
            return this.button;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.button, fVar.button) && L.f(this.text, fVar.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.button.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toast(button=");
            sb2.append(this.button);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$g;", "", "", "buttonTitle", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        @com.google.gson.annotations.c("buttonTitle")
        @k
        private final String buttonTitle;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        public g(@k String str, @k String str2) {
            this.buttonTitle = str;
            this.text = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.buttonTitle, gVar.buttonTitle) && L.f(this.text, gVar.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.buttonTitle.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TooltipResult(buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }
    }

    /* compiled from: DayScheduleResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult$h;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "title", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(ILjava/lang/String;I)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final int from;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final int to;

        public h(int i12, @k String str, int i13) {
            this.from = i12;
            this.title = str;
            this.to = i13;
        }

        /* renamed from: a, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: c, reason: from getter */
        public final int getTo() {
            return this.to;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.from == hVar.from && L.f(this.title, hVar.title) && this.to == hVar.to;
        }

        public final int hashCode() {
            return Integer.hashCode(this.to) + H.d(Integer.hashCode(this.from) * 31, 31, this.title);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkHours(from=");
            sb2.append(this.from);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", to=");
            return r.t(sb2, this.to, ')');
        }
    }

    public DayScheduleResult(@k d dVar, @k d dVar2, @k AttributedText attributedText, @k c cVar, @k String str, boolean z12, @k List<e> list, @k String str2, @l f fVar, @k g gVar, @k h hVar, @l Boolean bool, @l String str3, @l String str4, @l List<a> list2, @l Integer num, @l UniversalColor universalColor, @l b bVar, @l UniversalColor universalColor2, @l ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo) {
        this.actionOneDay = dVar;
        this.actionRepeat = dVar2;
        this.agreement = attributedText;
        this.day = cVar;
        this.errOccupied = str;
        this.isUnsettled = z12;
        this.occupied = list;
        this.title = str2;
        this.toast = fVar;
        this.tooltip = gVar;
        this.workHours = hVar;
        this.showBreaks = bool;
        this.titleBreak = str3;
        this.addBreak = str4;
        this.breaks = list2;
        this.maxBreaksCount = num;
        this.warningColor = universalColor;
        this.breakErrorTexts = bVar;
        this.errorColor = universalColor2;
        this.saveScheduleInfo = serviceBookingSaveScheduleInfo;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final d getActionOneDay() {
        return this.actionOneDay;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final d getActionRepeat() {
        return this.actionRepeat;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAddBreak() {
        return this.addBreak;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final b getBreakErrorTexts() {
        return this.breakErrorTexts;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayScheduleResult)) {
            return false;
        }
        DayScheduleResult dayScheduleResult = (DayScheduleResult) obj;
        return L.f(this.actionOneDay, dayScheduleResult.actionOneDay) && L.f(this.actionRepeat, dayScheduleResult.actionRepeat) && L.f(this.agreement, dayScheduleResult.agreement) && L.f(this.day, dayScheduleResult.day) && L.f(this.errOccupied, dayScheduleResult.errOccupied) && this.isUnsettled == dayScheduleResult.isUnsettled && L.f(this.occupied, dayScheduleResult.occupied) && L.f(this.title, dayScheduleResult.title) && L.f(this.toast, dayScheduleResult.toast) && L.f(this.tooltip, dayScheduleResult.tooltip) && L.f(this.workHours, dayScheduleResult.workHours) && L.f(this.showBreaks, dayScheduleResult.showBreaks) && L.f(this.titleBreak, dayScheduleResult.titleBreak) && L.f(this.addBreak, dayScheduleResult.addBreak) && L.f(this.breaks, dayScheduleResult.breaks) && L.f(this.maxBreaksCount, dayScheduleResult.maxBreaksCount) && L.f(this.warningColor, dayScheduleResult.warningColor) && L.f(this.breakErrorTexts, dayScheduleResult.breakErrorTexts) && L.f(this.errorColor, dayScheduleResult.errorColor) && L.f(this.saveScheduleInfo, dayScheduleResult.saveScheduleInfo);
    }

    @l
    public final List<a> f() {
        return this.breaks;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final c getDay() {
        return this.day;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getErrOccupied() {
        return this.errOccupied;
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(r.i(H.d((this.day.hashCode() + com.avito.android.actions_sheet.a.b((this.actionRepeat.hashCode() + (this.actionOneDay.hashCode() * 31)) * 31, 31, this.agreement)) * 31, 31, this.errOccupied), 31, this.isUnsettled), 31, this.occupied), 31, this.title);
        f fVar = this.toast;
        int iHashCode = (this.workHours.hashCode() + ((this.tooltip.hashCode() + ((iD2 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31;
        Boolean bool = this.showBreaks;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.titleBreak;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addBreak;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<a> list = this.breaks;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.maxBreaksCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        UniversalColor universalColor = this.warningColor;
        int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        b bVar = this.breakErrorTexts;
        int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        UniversalColor universalColor2 = this.errorColor;
        int iHashCode9 = (iHashCode8 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = this.saveScheduleInfo;
        return iHashCode9 + (serviceBookingSaveScheduleInfo != null ? serviceBookingSaveScheduleInfo.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final UniversalColor getErrorColor() {
        return this.errorColor;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Integer getMaxBreaksCount() {
        return this.maxBreaksCount;
    }

    @k
    public final List<e> k() {
        return this.occupied;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final ServiceBookingSaveScheduleInfo getSaveScheduleInfo() {
        return this.saveScheduleInfo;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final Boolean getShowBreaks() {
        return this.showBreaks;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: o, reason: from getter */
    public final String getTitleBreak() {
        return this.titleBreak;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final f getToast() {
        return this.toast;
    }

    @k
    /* renamed from: q, reason: from getter */
    public final g getTooltip() {
        return this.tooltip;
    }

    @l
    /* renamed from: r, reason: from getter */
    public final UniversalColor getWarningColor() {
        return this.warningColor;
    }

    @k
    /* renamed from: s, reason: from getter */
    public final h getWorkHours() {
        return this.workHours;
    }

    @k
    public final String toString() {
        return "DayScheduleResult(actionOneDay=" + this.actionOneDay + ", actionRepeat=" + this.actionRepeat + ", agreement=" + this.agreement + ", day=" + this.day + ", errOccupied=" + this.errOccupied + ", isUnsettled=" + this.isUnsettled + ", occupied=" + this.occupied + ", title=" + this.title + ", toast=" + this.toast + ", tooltip=" + this.tooltip + ", workHours=" + this.workHours + ", showBreaks=" + this.showBreaks + ", titleBreak=" + this.titleBreak + ", addBreak=" + this.addBreak + ", breaks=" + this.breaks + ", maxBreaksCount=" + this.maxBreaksCount + ", warningColor=" + this.warningColor + ", breakErrorTexts=" + this.breakErrorTexts + ", errorColor=" + this.errorColor + ", saveScheduleInfo=" + this.saveScheduleInfo + ')';
    }

    public /* synthetic */ DayScheduleResult(d dVar, d dVar2, AttributedText attributedText, c cVar, String str, boolean z12, List list, String str2, f fVar, g gVar, h hVar, Boolean bool, String str3, String str4, List list2, Integer num, UniversalColor universalColor, b bVar, UniversalColor universalColor2, ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo, int i12, C42822w c42822w) {
        this(dVar, dVar2, attributedText, cVar, str, z12, list, str2, (i12 & 256) != 0 ? null : fVar, gVar, hVar, bool, str3, str4, list2, num, universalColor, bVar, universalColor2, serviceBookingSaveScheduleInfo);
    }
}
