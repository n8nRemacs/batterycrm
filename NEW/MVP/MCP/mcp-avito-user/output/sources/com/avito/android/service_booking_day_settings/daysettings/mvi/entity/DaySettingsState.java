package com.avito.android.service_booking_day_settings.daysettings.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: DaySettingsState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "ActionButtonsContainer", "BreakErrorInfo", "BreaksInfo", "a", "DayInfo", "DayScheduleInfo", "OccupiedInfo", "SaveScheduleInfo", "SaveTooltip", "ShowElements", "TimePeriod", "ToastMessage", "WorkHoursInfo", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DaySettingsState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f276965b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DayScheduleInfo f276966c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f276967d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShowElements f276968e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f276969f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final TimePeriod f276970g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final BreaksInfo f276971h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BookingSettingsStatus f276972i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f276963j = new a(null);

    @k
    public static final Parcelable.Creator<DaySettingsState> CREATOR = new b();

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final DaySettingsState f276964k = new DaySettingsState(true, null, null, new ShowElements(false, false, false, false, false, false, false, 127, null), false, null, null, BookingSettingsStatus.f278279e);

    /* compiled from: DaySettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$ActionButtonsContainer;", "Landroid/os/Parcelable;", "ActionButtonInfo", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ActionButtonsContainer implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionButtonsContainer> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ActionButtonInfo f276973b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ActionButtonInfo f276974c;

        /* compiled from: DaySettingsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$ActionButtonsContainer$ActionButtonInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionButtonInfo implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButtonInfo> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f276975b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f276976c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final DeepLink f276977d;

            /* compiled from: DaySettingsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionButtonInfo> {
                @Override // android.os.Parcelable.Creator
                public final ActionButtonInfo createFromParcel(Parcel parcel) {
                    return new ActionButtonInfo(parcel.readInt(), (DeepLink) parcel.readParcelable(ActionButtonInfo.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButtonInfo[] newArray(int i12) {
                    return new ActionButtonInfo[i12];
                }
            }

            public ActionButtonInfo(@InterfaceC42150f int i12, @k DeepLink deepLink, @k String str) {
                this.f276975b = i12;
                this.f276976c = str;
                this.f276977d = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtonInfo)) {
                    return false;
                }
                ActionButtonInfo actionButtonInfo = (ActionButtonInfo) obj;
                return this.f276975b == actionButtonInfo.f276975b && L.f(this.f276976c, actionButtonInfo.f276976c) && L.f(this.f276977d, actionButtonInfo.f276977d);
            }

            public final int hashCode() {
                return this.f276977d.hashCode() + H.d(Integer.hashCode(this.f276975b) * 31, 31, this.f276976c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ActionButtonInfo(style=");
                sb2.append(this.f276975b);
                sb2.append(", title=");
                sb2.append(this.f276976c);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f276977d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f276975b);
                parcel.writeString(this.f276976c);
                parcel.writeParcelable(this.f276977d, i12);
            }
        }

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActionButtonsContainer> {
            @Override // android.os.Parcelable.Creator
            public final ActionButtonsContainer createFromParcel(Parcel parcel) {
                Parcelable.Creator<ActionButtonInfo> creator = ActionButtonInfo.CREATOR;
                return new ActionButtonsContainer(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ActionButtonsContainer[] newArray(int i12) {
                return new ActionButtonsContainer[i12];
            }
        }

        public ActionButtonsContainer(@k ActionButtonInfo actionButtonInfo, @k ActionButtonInfo actionButtonInfo2) {
            this.f276973b = actionButtonInfo;
            this.f276974c = actionButtonInfo2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButtonsContainer)) {
                return false;
            }
            ActionButtonsContainer actionButtonsContainer = (ActionButtonsContainer) obj;
            return L.f(this.f276973b, actionButtonsContainer.f276973b) && L.f(this.f276974c, actionButtonsContainer.f276974c);
        }

        public final int hashCode() {
            return this.f276974c.hashCode() + (this.f276973b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ActionButtonsContainer(actionOneDay=" + this.f276973b + ", actionRepeat=" + this.f276974c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f276973b.writeToParcel(parcel, i12);
            this.f276974c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$BreakErrorInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BreakErrorInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<BreakErrorInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276978b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f276979c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f276980d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f276981e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f276982f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f276983g;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BreakErrorInfo> {
            @Override // android.os.Parcelable.Creator
            public final BreakErrorInfo createFromParcel(Parcel parcel) {
                return new BreakErrorInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BreakErrorInfo[] newArray(int i12) {
                return new BreakErrorInfo[i12];
            }
        }

        public BreakErrorInfo(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6) {
            this.f276978b = str;
            this.f276979c = str2;
            this.f276980d = str3;
            this.f276981e = str4;
            this.f276982f = str5;
            this.f276983g = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakErrorInfo)) {
                return false;
            }
            BreakErrorInfo breakErrorInfo = (BreakErrorInfo) obj;
            return L.f(this.f276978b, breakErrorInfo.f276978b) && L.f(this.f276979c, breakErrorInfo.f276979c) && L.f(this.f276980d, breakErrorInfo.f276980d) && L.f(this.f276981e, breakErrorInfo.f276981e) && L.f(this.f276982f, breakErrorInfo.f276982f) && L.f(this.f276983g, breakErrorInfo.f276983g);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f276978b.hashCode() * 31, 31, this.f276979c), 31, this.f276980d);
            String str = this.f276981e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f276982f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f276983g;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakErrorInfo(workTimeError=");
            sb2.append(this.f276978b);
            sb2.append(", intersectionError=");
            sb2.append(this.f276979c);
            sb2.append(", incompleteError=");
            sb2.append(this.f276980d);
            sb2.append(", startEndBreakErr=");
            sb2.append(this.f276981e);
            sb2.append(", minBreakErr=");
            sb2.append(this.f276982f);
            sb2.append(", breakEqualWorkErr=");
            return C22026a.c(sb2, this.f276983g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f276978b);
            parcel.writeString(this.f276979c);
            parcel.writeString(this.f276980d);
            parcel.writeString(this.f276981e);
            parcel.writeString(this.f276982f);
            parcel.writeString(this.f276983g);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$DayInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DayInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<DayInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f276994b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f276995c;

        /* renamed from: d, reason: collision with root package name */
        public final long f276996d;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DayInfo> {
            @Override // android.os.Parcelable.Creator
            public final DayInfo createFromParcel(Parcel parcel) {
                return new DayInfo(parcel.readString(), parcel.readInt() != 0, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final DayInfo[] newArray(int i12) {
                return new DayInfo[i12];
            }
        }

        public DayInfo(@k String str, boolean z12, long j12) {
            this.f276994b = z12;
            this.f276995c = str;
            this.f276996d = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DayInfo)) {
                return false;
            }
            DayInfo dayInfo = (DayInfo) obj;
            return this.f276994b == dayInfo.f276994b && L.f(this.f276995c, dayInfo.f276995c) && this.f276996d == dayInfo.f276996d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f276996d) + H.d(Boolean.hashCode(this.f276994b) * 31, 31, this.f276995c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayInfo(active=");
            sb2.append(this.f276994b);
            sb2.append(", title=");
            sb2.append(this.f276995c);
            sb2.append(", timestamp=");
            return r.u(sb2, this.f276996d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f276994b ? 1 : 0);
            parcel.writeString(this.f276995c);
            parcel.writeLong(this.f276996d);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$DayScheduleInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DayScheduleInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<DayScheduleInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276997b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final OccupiedInfo f276998c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DayInfo f276999d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ActionButtonsContainer f277000e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final WorkHoursInfo f277001f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final SaveTooltip f277002g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final AttributedText f277003h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final SaveScheduleInfo f277004i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final PrintableText f277005j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final ToastMessage f277006k;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DayScheduleInfo> {
            @Override // android.os.Parcelable.Creator
            public final DayScheduleInfo createFromParcel(Parcel parcel) {
                return new DayScheduleInfo(parcel.readString(), OccupiedInfo.CREATOR.createFromParcel(parcel), DayInfo.CREATOR.createFromParcel(parcel), ActionButtonsContainer.CREATOR.createFromParcel(parcel), WorkHoursInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SaveTooltip.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(DayScheduleInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : SaveScheduleInfo.CREATOR.createFromParcel(parcel), (PrintableText) parcel.readParcelable(DayScheduleInfo.class.getClassLoader()), parcel.readInt() != 0 ? ToastMessage.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final DayScheduleInfo[] newArray(int i12) {
                return new DayScheduleInfo[i12];
            }
        }

        public DayScheduleInfo(@k String str, @k OccupiedInfo occupiedInfo, @k DayInfo dayInfo, @k ActionButtonsContainer actionButtonsContainer, @k WorkHoursInfo workHoursInfo, @l SaveTooltip saveTooltip, @l AttributedText attributedText, @l SaveScheduleInfo saveScheduleInfo, @l PrintableText printableText, @l ToastMessage toastMessage) {
            this.f276997b = str;
            this.f276998c = occupiedInfo;
            this.f276999d = dayInfo;
            this.f277000e = actionButtonsContainer;
            this.f277001f = workHoursInfo;
            this.f277002g = saveTooltip;
            this.f277003h = attributedText;
            this.f277004i = saveScheduleInfo;
            this.f277005j = printableText;
            this.f277006k = toastMessage;
        }

        public static DayScheduleInfo a(DayScheduleInfo dayScheduleInfo, DayInfo dayInfo, WorkHoursInfo workHoursInfo, PrintableText printableText, ToastMessage toastMessage, int i12) {
            String str = dayScheduleInfo.f276997b;
            OccupiedInfo occupiedInfo = dayScheduleInfo.f276998c;
            DayInfo dayInfo2 = (i12 & 4) != 0 ? dayScheduleInfo.f276999d : dayInfo;
            ActionButtonsContainer actionButtonsContainer = dayScheduleInfo.f277000e;
            WorkHoursInfo workHoursInfo2 = (i12 & 16) != 0 ? dayScheduleInfo.f277001f : workHoursInfo;
            SaveTooltip saveTooltip = dayScheduleInfo.f277002g;
            AttributedText attributedText = (i12 & 64) != 0 ? dayScheduleInfo.f277003h : null;
            SaveScheduleInfo saveScheduleInfo = (i12 & 128) != 0 ? dayScheduleInfo.f277004i : null;
            PrintableText printableText2 = (i12 & 256) != 0 ? dayScheduleInfo.f277005j : printableText;
            ToastMessage toastMessage2 = (i12 & 512) != 0 ? dayScheduleInfo.f277006k : toastMessage;
            dayScheduleInfo.getClass();
            return new DayScheduleInfo(str, occupiedInfo, dayInfo2, actionButtonsContainer, workHoursInfo2, saveTooltip, attributedText, saveScheduleInfo, printableText2, toastMessage2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DayScheduleInfo)) {
                return false;
            }
            DayScheduleInfo dayScheduleInfo = (DayScheduleInfo) obj;
            return L.f(this.f276997b, dayScheduleInfo.f276997b) && L.f(this.f276998c, dayScheduleInfo.f276998c) && L.f(this.f276999d, dayScheduleInfo.f276999d) && L.f(this.f277000e, dayScheduleInfo.f277000e) && L.f(this.f277001f, dayScheduleInfo.f277001f) && L.f(this.f277002g, dayScheduleInfo.f277002g) && L.f(this.f277003h, dayScheduleInfo.f277003h) && L.f(this.f277004i, dayScheduleInfo.f277004i) && L.f(this.f277005j, dayScheduleInfo.f277005j) && L.f(this.f277006k, dayScheduleInfo.f277006k);
        }

        public final int hashCode() {
            int iHashCode = (this.f277001f.hashCode() + ((this.f277000e.hashCode() + ((this.f276999d.hashCode() + ((this.f276998c.hashCode() + (this.f276997b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            SaveTooltip saveTooltip = this.f277002g;
            int iHashCode2 = (iHashCode + (saveTooltip == null ? 0 : saveTooltip.hashCode())) * 31;
            AttributedText attributedText = this.f277003h;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            SaveScheduleInfo saveScheduleInfo = this.f277004i;
            int iHashCode4 = (iHashCode3 + (saveScheduleInfo == null ? 0 : saveScheduleInfo.hashCode())) * 31;
            PrintableText printableText = this.f277005j;
            int iHashCode5 = (iHashCode4 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            ToastMessage toastMessage = this.f277006k;
            return iHashCode5 + (toastMessage != null ? toastMessage.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "DayScheduleInfo(title=" + this.f276997b + ", occupiedDates=" + this.f276998c + ", dayInfo=" + this.f276999d + ", actionButtonsContainer=" + this.f277000e + ", workHoursInfo=" + this.f277001f + ", tooltip=" + this.f277002g + ", agreement=" + this.f277003h + ", saveScheduleInfo=" + this.f277004i + ", overlapWarning=" + this.f277005j + ", toast=" + this.f277006k + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f276997b);
            this.f276998c.writeToParcel(parcel, i12);
            this.f276999d.writeToParcel(parcel, i12);
            this.f277000e.writeToParcel(parcel, i12);
            this.f277001f.writeToParcel(parcel, i12);
            SaveTooltip saveTooltip = this.f277002g;
            if (saveTooltip == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                saveTooltip.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f277003h, i12);
            SaveScheduleInfo saveScheduleInfo = this.f277004i;
            if (saveScheduleInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                saveScheduleInfo.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f277005j, i12);
            ToastMessage toastMessage = this.f277006k;
            if (toastMessage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                toastMessage.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$OccupiedInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OccupiedInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<OccupiedInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ToastMessage f277007b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277008c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f277009d;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OccupiedInfo> {
            @Override // android.os.Parcelable.Creator
            public final OccupiedInfo createFromParcel(Parcel parcel) {
                ToastMessage toastMessageCreateFromParcel = ToastMessage.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(TimePeriod.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new OccupiedInfo(toastMessageCreateFromParcel, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OccupiedInfo[] newArray(int i12) {
                return new OccupiedInfo[i12];
            }
        }

        public OccupiedInfo(@k ToastMessage toastMessage, @k String str, @k ArrayList arrayList) {
            this.f277007b = toastMessage;
            this.f277008c = str;
            this.f277009d = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OccupiedInfo)) {
                return false;
            }
            OccupiedInfo occupiedInfo = (OccupiedInfo) obj;
            return L.f(this.f277007b, occupiedInfo.f277007b) && L.f(this.f277008c, occupiedInfo.f277008c) && this.f277009d.equals(occupiedInfo.f277009d);
        }

        public final int hashCode() {
            return this.f277009d.hashCode() + H.d(this.f277007b.hashCode() * 31, 31, this.f277008c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OccupiedInfo(occupiedToast=");
            sb2.append(this.f277007b);
            sb2.append(", errOccupied=");
            sb2.append(this.f277008c);
            sb2.append(", occupied=");
            return e.p(sb2, this.f277009d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f277007b.writeToParcel(parcel, i12);
            parcel.writeString(this.f277008c);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f277009d, parcel);
            while (itZ.hasNext()) {
                ((TimePeriod) itZ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: DaySettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$SaveScheduleInfo;", "Landroid/os/Parcelable;", "ActionButtonItem", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SaveScheduleInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<SaveScheduleInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277010b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277011c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ActionButtonItem f277012d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ActionButtonItem f277013e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f277014f;

        /* compiled from: DaySettingsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$SaveScheduleInfo$ActionButtonItem;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionButtonItem implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButtonItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277015b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f277016c;

            /* compiled from: DaySettingsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionButtonItem> {
                @Override // android.os.Parcelable.Creator
                public final ActionButtonItem createFromParcel(Parcel parcel) {
                    return new ActionButtonItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButtonItem[] newArray(int i12) {
                    return new ActionButtonItem[i12];
                }
            }

            public ActionButtonItem(@k String str, @InterfaceC42150f @l Integer num) {
                this.f277015b = str;
                this.f277016c = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtonItem)) {
                    return false;
                }
                ActionButtonItem actionButtonItem = (ActionButtonItem) obj;
                return L.f(this.f277015b, actionButtonItem.f277015b) && L.f(this.f277016c, actionButtonItem.f277016c);
            }

            public final int hashCode() {
                int iHashCode = this.f277015b.hashCode() * 31;
                Integer num = this.f277016c;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ActionButtonItem(title=");
                sb2.append(this.f277015b);
                sb2.append(", actionStyleAttr=");
                return s.j(sb2, this.f277016c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f277015b);
                Integer num = this.f277016c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }
        }

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SaveScheduleInfo> {
            @Override // android.os.Parcelable.Creator
            public final SaveScheduleInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<ActionButtonItem> creator = ActionButtonItem.CREATOR;
                return new SaveScheduleInfo(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SaveScheduleInfo[] newArray(int i12) {
                return new SaveScheduleInfo[i12];
            }
        }

        public SaveScheduleInfo(@k String str, @k String str2, @k ActionButtonItem actionButtonItem, @k ActionButtonItem actionButtonItem2, @k String str3) {
            this.f277010b = str;
            this.f277011c = str2;
            this.f277012d = actionButtonItem;
            this.f277013e = actionButtonItem2;
            this.f277014f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveScheduleInfo)) {
                return false;
            }
            SaveScheduleInfo saveScheduleInfo = (SaveScheduleInfo) obj;
            return L.f(this.f277010b, saveScheduleInfo.f277010b) && L.f(this.f277011c, saveScheduleInfo.f277011c) && L.f(this.f277012d, saveScheduleInfo.f277012d) && L.f(this.f277013e, saveScheduleInfo.f277013e) && L.f(this.f277014f, saveScheduleInfo.f277014f);
        }

        public final int hashCode() {
            return this.f277014f.hashCode() + ((this.f277013e.hashCode() + ((this.f277012d.hashCode() + H.d(this.f277010b.hashCode() * 31, 31, this.f277011c)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveScheduleInfo(title=");
            sb2.append(this.f277010b);
            sb2.append(", description=");
            sb2.append(this.f277011c);
            sb2.append(", acceptButton=");
            sb2.append(this.f277012d);
            sb2.append(", cancelButton=");
            sb2.append(this.f277013e);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f277014f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f277010b);
            parcel.writeString(this.f277011c);
            this.f277012d.writeToParcel(parcel, i12);
            this.f277013e.writeToParcel(parcel, i12);
            parcel.writeString(this.f277014f);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$SaveTooltip;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveTooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<SaveTooltip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277017b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277018c;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SaveTooltip> {
            @Override // android.os.Parcelable.Creator
            public final SaveTooltip createFromParcel(Parcel parcel) {
                return new SaveTooltip(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SaveTooltip[] newArray(int i12) {
                return new SaveTooltip[i12];
            }
        }

        public SaveTooltip(@k String str, @k String str2) {
            this.f277017b = str;
            this.f277018c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveTooltip)) {
                return false;
            }
            SaveTooltip saveTooltip = (SaveTooltip) obj;
            return L.f(this.f277017b, saveTooltip.f277017b) && L.f(this.f277018c, saveTooltip.f277018c);
        }

        public final int hashCode() {
            return this.f277018c.hashCode() + (this.f277017b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveTooltip(buttonTitle=");
            sb2.append(this.f277017b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f277018c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f277017b);
            parcel.writeString(this.f277018c);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$ShowElements;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowElements implements Parcelable {

        @k
        public static final Parcelable.Creator<ShowElements> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f277019b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f277020c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f277021d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f277022e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f277023f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f277024g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f277025h;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowElements> {
            @Override // android.os.Parcelable.Creator
            public final ShowElements createFromParcel(Parcel parcel) {
                return new ShowElements(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ShowElements[] newArray(int i12) {
                return new ShowElements[i12];
            }
        }

        public ShowElements() {
            this(false, false, false, false, false, false, false, 127, null);
        }

        public static ShowElements a(ShowElements showElements, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12) {
            boolean z19 = (i12 & 1) != 0 ? showElements.f277019b : z12;
            boolean z22 = (i12 & 2) != 0 ? showElements.f277020c : z13;
            boolean z23 = (i12 & 4) != 0 ? showElements.f277021d : z14;
            boolean z24 = (i12 & 8) != 0 ? showElements.f277022e : z15;
            boolean z25 = (i12 & 16) != 0 ? showElements.f277023f : z16;
            boolean z26 = (i12 & 32) != 0 ? showElements.f277024g : z17;
            boolean z27 = (i12 & 64) != 0 ? showElements.f277025h : z18;
            showElements.getClass();
            return new ShowElements(z19, z22, z23, z24, z25, z26, z27);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowElements)) {
                return false;
            }
            ShowElements showElements = (ShowElements) obj;
            return this.f277019b == showElements.f277019b && this.f277020c == showElements.f277020c && this.f277021d == showElements.f277021d && this.f277022e == showElements.f277022e && this.f277023f == showElements.f277023f && this.f277024g == showElements.f277024g && this.f277025h == showElements.f277025h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f277025h) + r.i(r.i(r.i(r.i(r.i(Boolean.hashCode(this.f277019b) * 31, 31, this.f277020c), 31, this.f277021d), 31, this.f277022e), 31, this.f277023f), 31, this.f277024g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowElements(actionOneDay=");
            sb2.append(this.f277019b);
            sb2.append(", dataChanged=");
            sb2.append(this.f277020c);
            sb2.append(", saveInProgress=");
            sb2.append(this.f277021d);
            sb2.append(", enableInputs=");
            sb2.append(this.f277022e);
            sb2.append(", tooltipDismissed=");
            sb2.append(this.f277023f);
            sb2.append(", saveDialogShow=");
            sb2.append(this.f277024g);
            sb2.append(", enableAddBreaks=");
            return r.x(sb2, this.f277025h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f277019b ? 1 : 0);
            parcel.writeInt(this.f277020c ? 1 : 0);
            parcel.writeInt(this.f277021d ? 1 : 0);
            parcel.writeInt(this.f277022e ? 1 : 0);
            parcel.writeInt(this.f277023f ? 1 : 0);
            parcel.writeInt(this.f277024g ? 1 : 0);
            parcel.writeInt(this.f277025h ? 1 : 0);
        }

        public ShowElements(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            this.f277019b = z12;
            this.f277020c = z13;
            this.f277021d = z14;
            this.f277022e = z15;
            this.f277023f = z16;
            this.f277024g = z17;
            this.f277025h = z18;
        }

        public /* synthetic */ ShowElements(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? false : z16, (i12 & 32) != 0 ? false : z17, (i12 & 64) != 0 ? false : z18);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$TimePeriod;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimePeriod implements Parcelable {

        @k
        public static final Parcelable.Creator<TimePeriod> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f277026b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final g f277027c;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimePeriod> {
            @Override // android.os.Parcelable.Creator
            public final TimePeriod createFromParcel(Parcel parcel) {
                return new TimePeriod((g) parcel.readSerializable(), (g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final TimePeriod[] newArray(int i12) {
                return new TimePeriod[i12];
            }
        }

        public TimePeriod(@k g gVar, @k g gVar2) {
            this.f277026b = gVar;
            this.f277027c = gVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimePeriod)) {
                return false;
            }
            TimePeriod timePeriod = (TimePeriod) obj;
            return L.f(this.f277026b, timePeriod.f277026b) && L.f(this.f277027c, timePeriod.f277027c);
        }

        public final int hashCode() {
            return this.f277027c.hashCode() + (this.f277026b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TimePeriod(from=");
            sb2.append(this.f277026b);
            sb2.append(", to=");
            return h.f(sb2, this.f277027c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f277026b);
            parcel.writeSerializable(this.f277027c);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$ToastMessage;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastMessage implements Parcelable {

        @k
        public static final Parcelable.Creator<ToastMessage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f277028b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f277029c;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ToastMessage> {
            @Override // android.os.Parcelable.Creator
            public final ToastMessage createFromParcel(Parcel parcel) {
                return new ToastMessage((PrintableText) parcel.readParcelable(ToastMessage.class.getClassLoader()), (PrintableText) parcel.readParcelable(ToastMessage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ToastMessage[] newArray(int i12) {
                return new ToastMessage[i12];
            }
        }

        public ToastMessage(@k PrintableText printableText, @k PrintableText printableText2) {
            this.f277028b = printableText;
            this.f277029c = printableText2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToastMessage)) {
                return false;
            }
            ToastMessage toastMessage = (ToastMessage) obj;
            return L.f(this.f277028b, toastMessage.f277028b) && L.f(this.f277029c, toastMessage.f277029c);
        }

        public final int hashCode() {
            return this.f277029c.hashCode() + (this.f277028b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToastMessage(button=");
            sb2.append(this.f277028b);
            sb2.append(", text=");
            return c.m(sb2, this.f277029c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f277028b, i12);
            parcel.writeParcelable(this.f277029c, i12);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$WorkHoursInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WorkHoursInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<WorkHoursInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277030b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TimePeriod f277031c;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WorkHoursInfo> {
            @Override // android.os.Parcelable.Creator
            public final WorkHoursInfo createFromParcel(Parcel parcel) {
                return new WorkHoursInfo(parcel.readString(), TimePeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final WorkHoursInfo[] newArray(int i12) {
                return new WorkHoursInfo[i12];
            }
        }

        public WorkHoursInfo(@k String str, @k TimePeriod timePeriod) {
            this.f277030b = str;
            this.f277031c = timePeriod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkHoursInfo)) {
                return false;
            }
            WorkHoursInfo workHoursInfo = (WorkHoursInfo) obj;
            return L.f(this.f277030b, workHoursInfo.f277030b) && L.f(this.f277031c, workHoursInfo.f277031c);
        }

        public final int hashCode() {
            return this.f277031c.hashCode() + (this.f277030b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "WorkHoursInfo(title=" + this.f277030b + ", time=" + this.f277031c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f277030b);
            this.f277031c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: DaySettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$a;", "", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DaySettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DaySettingsState> {
        @Override // android.os.Parcelable.Creator
        public final DaySettingsState createFromParcel(Parcel parcel) {
            return new DaySettingsState(parcel.readInt() != 0, parcel.readInt() == 0 ? null : DayScheduleInfo.CREATOR.createFromParcel(parcel), parcel.readString(), ShowElements.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TimePeriod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BreaksInfo.CREATOR.createFromParcel(parcel) : null, BookingSettingsStatus.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final DaySettingsState[] newArray(int i12) {
            return new DaySettingsState[i12];
        }
    }

    public DaySettingsState(boolean z12, @l DayScheduleInfo dayScheduleInfo, @l String str, @k ShowElements showElements, boolean z13, @l TimePeriod timePeriod, @l BreaksInfo breaksInfo, @k BookingSettingsStatus bookingSettingsStatus) {
        this.f276965b = z12;
        this.f276966c = dayScheduleInfo;
        this.f276967d = str;
        this.f276968e = showElements;
        this.f276969f = z13;
        this.f276970g = timePeriod;
        this.f276971h = breaksInfo;
        this.f276972i = bookingSettingsStatus;
    }

    public static DaySettingsState a(DaySettingsState daySettingsState, DayScheduleInfo dayScheduleInfo, String str, ShowElements showElements, TimePeriod timePeriod, BreaksInfo breaksInfo, BookingSettingsStatus bookingSettingsStatus, int i12) {
        boolean z12 = (i12 & 1) != 0 ? daySettingsState.f276965b : false;
        DayScheduleInfo dayScheduleInfo2 = (i12 & 2) != 0 ? daySettingsState.f276966c : dayScheduleInfo;
        String str2 = (i12 & 4) != 0 ? daySettingsState.f276967d : str;
        ShowElements showElements2 = (i12 & 8) != 0 ? daySettingsState.f276968e : showElements;
        boolean z13 = (i12 & 16) != 0 ? daySettingsState.f276969f : true;
        TimePeriod timePeriod2 = (i12 & 32) != 0 ? daySettingsState.f276970g : timePeriod;
        BreaksInfo breaksInfo2 = (i12 & 64) != 0 ? daySettingsState.f276971h : breaksInfo;
        BookingSettingsStatus bookingSettingsStatus2 = (i12 & 128) != 0 ? daySettingsState.f276972i : bookingSettingsStatus;
        daySettingsState.getClass();
        return new DaySettingsState(z12, dayScheduleInfo2, str2, showElements2, z13, timePeriod2, breaksInfo2, bookingSettingsStatus2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaySettingsState)) {
            return false;
        }
        DaySettingsState daySettingsState = (DaySettingsState) obj;
        return this.f276965b == daySettingsState.f276965b && L.f(this.f276966c, daySettingsState.f276966c) && L.f(this.f276967d, daySettingsState.f276967d) && L.f(this.f276968e, daySettingsState.f276968e) && this.f276969f == daySettingsState.f276969f && L.f(this.f276970g, daySettingsState.f276970g) && L.f(this.f276971h, daySettingsState.f276971h) && this.f276972i == daySettingsState.f276972i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f276965b) * 31;
        DayScheduleInfo dayScheduleInfo = this.f276966c;
        int iHashCode2 = (iHashCode + (dayScheduleInfo == null ? 0 : dayScheduleInfo.hashCode())) * 31;
        String str = this.f276967d;
        int i12 = r.i((this.f276968e.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f276969f);
        TimePeriod timePeriod = this.f276970g;
        int iHashCode3 = (i12 + (timePeriod == null ? 0 : timePeriod.hashCode())) * 31;
        BreaksInfo breaksInfo = this.f276971h;
        return this.f276972i.hashCode() + ((iHashCode3 + (breaksInfo != null ? breaksInfo.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "DaySettingsState(isLoading=" + this.f276965b + ", dayScheduleInfo=" + this.f276966c + ", error=" + this.f276967d + ", elementsShow=" + this.f276968e + ", isSettingsChanged=" + this.f276969f + ", initialPeriod=" + this.f276970g + ", breaksInfo=" + this.f276971h + ", settingsStatus=" + this.f276972i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f276965b ? 1 : 0);
        DayScheduleInfo dayScheduleInfo = this.f276966c;
        if (dayScheduleInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dayScheduleInfo.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f276967d);
        this.f276968e.writeToParcel(parcel, i12);
        parcel.writeInt(this.f276969f ? 1 : 0);
        TimePeriod timePeriod = this.f276970g;
        if (timePeriod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timePeriod.writeToParcel(parcel, i12);
        }
        BreaksInfo breaksInfo = this.f276971h;
        if (breaksInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            breaksInfo.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f276972i.name());
    }

    /* compiled from: DaySettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState$BreaksInfo;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BreaksInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<BreaksInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276984b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f276985c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<SettingsBreakItem> f276986d;

        /* renamed from: e, reason: collision with root package name */
        public final int f276987e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final BreakErrorInfo f276988f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final UniversalColor f276989g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final UniversalColor f276990h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final List<TimePeriod> f276991i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final List<SettingsBreakItem> f276992j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f276993k;

        /* compiled from: DaySettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BreaksInfo> {
            @Override // android.os.Parcelable.Creator
            public final BreaksInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(SettingsBreakItem.CREATOR, parcel, arrayList, iC3, 1);
                }
                int i13 = parcel.readInt();
                BreakErrorInfo breakErrorInfoCreateFromParcel = BreakErrorInfo.CREATOR.createFromParcel(parcel);
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BreaksInfo.class.getClassLoader());
                UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(BreaksInfo.class.getClassLoader());
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = com.avito.android.actions_sheet.a.c(TimePeriod.CREATOR, parcel, arrayList2, iC4, 1);
                }
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                while (iC2 != i15) {
                    iC2 = com.avito.android.actions_sheet.a.c(SettingsBreakItem.CREATOR, parcel, arrayList3, iC2, 1);
                }
                return new BreaksInfo(string, string2, arrayList, i13, breakErrorInfoCreateFromParcel, universalColor, universalColor2, arrayList2, arrayList3, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BreaksInfo[] newArray(int i12) {
                return new BreaksInfo[i12];
            }
        }

        public BreaksInfo(@k String str, @k String str2, @k List<SettingsBreakItem> list, int i12, @k BreakErrorInfo breakErrorInfo, @l UniversalColor universalColor, @l UniversalColor universalColor2, @k List<TimePeriod> list2, @k List<SettingsBreakItem> list3, @l String str3) {
            this.f276984b = str;
            this.f276985c = str2;
            this.f276986d = list;
            this.f276987e = i12;
            this.f276988f = breakErrorInfo;
            this.f276989g = universalColor;
            this.f276990h = universalColor2;
            this.f276991i = list2;
            this.f276992j = list3;
            this.f276993k = str3;
        }

        public static BreaksInfo a(BreaksInfo breaksInfo, List list, List list2, String str, int i12) {
            String str2 = breaksInfo.f276984b;
            String str3 = breaksInfo.f276985c;
            if ((i12 & 4) != 0) {
                list = breaksInfo.f276986d;
            }
            List list3 = list;
            int i13 = breaksInfo.f276987e;
            BreakErrorInfo breakErrorInfo = breaksInfo.f276988f;
            UniversalColor universalColor = breaksInfo.f276989g;
            UniversalColor universalColor2 = breaksInfo.f276990h;
            List<TimePeriod> list4 = breaksInfo.f276991i;
            if ((i12 & 256) != 0) {
                list2 = breaksInfo.f276992j;
            }
            List list5 = list2;
            if ((i12 & 512) != 0) {
                str = breaksInfo.f276993k;
            }
            breaksInfo.getClass();
            return new BreaksInfo(str2, str3, list3, i13, breakErrorInfo, universalColor, universalColor2, list4, list5, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreaksInfo)) {
                return false;
            }
            BreaksInfo breaksInfo = (BreaksInfo) obj;
            return L.f(this.f276984b, breaksInfo.f276984b) && L.f(this.f276985c, breaksInfo.f276985c) && L.f(this.f276986d, breaksInfo.f276986d) && this.f276987e == breaksInfo.f276987e && L.f(this.f276988f, breaksInfo.f276988f) && L.f(this.f276989g, breaksInfo.f276989g) && L.f(this.f276990h, breaksInfo.f276990h) && L.f(this.f276991i, breaksInfo.f276991i) && L.f(this.f276992j, breaksInfo.f276992j) && L.f(this.f276993k, breaksInfo.f276993k);
        }

        public final int hashCode() {
            int iHashCode = (this.f276988f.hashCode() + r.e(this.f276987e, H.e(H.d(this.f276984b.hashCode() * 31, 31, this.f276985c), 31, this.f276986d), 31)) * 31;
            UniversalColor universalColor = this.f276989g;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.f276990h;
            int iE2 = H.e(H.e((iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31, 31, this.f276991i), 31, this.f276992j);
            String str = this.f276993k;
            return iE2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreaksInfo(titleBreak=");
            sb2.append(this.f276984b);
            sb2.append(", addBreak=");
            sb2.append(this.f276985c);
            sb2.append(", breaks=");
            sb2.append(this.f276986d);
            sb2.append(", maxBreaksCount=");
            sb2.append(this.f276987e);
            sb2.append(", errorInfo=");
            sb2.append(this.f276988f);
            sb2.append(", errorColor=");
            sb2.append(this.f276989g);
            sb2.append(", warningColor=");
            sb2.append(this.f276990h);
            sb2.append(", occupiedBreaks=");
            sb2.append(this.f276991i);
            sb2.append(", initialBreaks=");
            sb2.append(this.f276992j);
            sb2.append(", breakSelectedId=");
            return C22026a.c(sb2, this.f276993k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f276984b);
            parcel.writeString(this.f276985c);
            Iterator itJ = C0.j(this.f276986d, parcel);
            while (itJ.hasNext()) {
                ((SettingsBreakItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f276987e);
            this.f276988f.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f276989g, i12);
            parcel.writeParcelable(this.f276990h, i12);
            Iterator itJ2 = C0.j(this.f276991i, parcel);
            while (itJ2.hasNext()) {
                ((TimePeriod) itJ2.next()).writeToParcel(parcel, i12);
            }
            Iterator itJ3 = C0.j(this.f276992j, parcel);
            while (itJ3.hasNext()) {
                ((SettingsBreakItem) itJ3.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f276993k);
        }

        public /* synthetic */ BreaksInfo(String str, String str2, List list, int i12, BreakErrorInfo breakErrorInfo, UniversalColor universalColor, UniversalColor universalColor2, List list2, List list3, String str3, int i13, C42822w c42822w) {
            this(str, str2, list, i12, breakErrorInfo, universalColor, universalColor2, list2, list3, (i13 & 512) != 0 ? null : str3);
        }
    }
}
