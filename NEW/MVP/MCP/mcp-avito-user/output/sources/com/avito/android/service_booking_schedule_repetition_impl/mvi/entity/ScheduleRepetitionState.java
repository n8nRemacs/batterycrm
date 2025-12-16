package com.avito.android.service_booking_schedule_repetition_impl.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleRepetitionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "Content", "ShowElements", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScheduleRepetitionState extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f277707g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final ScheduleRepetitionState f277708h;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f277709b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f277710c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Content f277711d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShowElements f277712e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BookingSettingsStatus f277713f;

    /* compiled from: ScheduleRepetitionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState$Content;", "", "SaveScheduleInfo", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.service_booking_calendar.a> f277714a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277715b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277716c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SaveScheduleInfo f277717d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Object f277718e;

        /* compiled from: ScheduleRepetitionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState$Content$SaveScheduleInfo;", "Landroid/os/Parcelable;", "ActionButtonItem", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SaveScheduleInfo implements Parcelable {

            @k
            public static final Parcelable.Creator<SaveScheduleInfo> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277719b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f277720c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ActionButtonItem f277721d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final ActionButtonItem f277722e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f277723f;

            /* compiled from: ScheduleRepetitionState.kt */
            @d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState$Content$SaveScheduleInfo$ActionButtonItem;", "Landroid/os/Parcelable;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ActionButtonItem implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionButtonItem> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f277724b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final Integer f277725c;

                /* compiled from: ScheduleRepetitionState.kt */
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
                    this.f277724b = str;
                    this.f277725c = num;
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
                    return L.f(this.f277724b, actionButtonItem.f277724b) && L.f(this.f277725c, actionButtonItem.f277725c);
                }

                public final int hashCode() {
                    int iHashCode = this.f277724b.hashCode() * 31;
                    Integer num = this.f277725c;
                    return iHashCode + (num == null ? 0 : num.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ActionButtonItem(title=");
                    sb2.append(this.f277724b);
                    sb2.append(", actionStyleAttr=");
                    return s.j(sb2, this.f277725c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f277724b);
                    Integer num = this.f277725c;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                }
            }

            /* compiled from: ScheduleRepetitionState.kt */
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
                this.f277719b = str;
                this.f277720c = str2;
                this.f277721d = actionButtonItem;
                this.f277722e = actionButtonItem2;
                this.f277723f = str3;
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
                return L.f(this.f277719b, saveScheduleInfo.f277719b) && L.f(this.f277720c, saveScheduleInfo.f277720c) && L.f(this.f277721d, saveScheduleInfo.f277721d) && L.f(this.f277722e, saveScheduleInfo.f277722e) && L.f(this.f277723f, saveScheduleInfo.f277723f);
            }

            public final int hashCode() {
                return this.f277723f.hashCode() + ((this.f277722e.hashCode() + ((this.f277721d.hashCode() + H.d(this.f277719b.hashCode() * 31, 31, this.f277720c)) * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SaveScheduleInfo(title=");
                sb2.append(this.f277719b);
                sb2.append(", description=");
                sb2.append(this.f277720c);
                sb2.append(", acceptButton=");
                sb2.append(this.f277721d);
                sb2.append(", cancelButton=");
                sb2.append(this.f277722e);
                sb2.append(", fromPage=");
                return C22026a.c(sb2, this.f277723f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f277719b);
                parcel.writeString(this.f277720c);
                this.f277721d.writeToParcel(parcel, i12);
                this.f277722e.writeToParcel(parcel, i12);
                parcel.writeString(this.f277723f);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@k List<? extends com.avito.android.service_booking_calendar.a> list, @k String str, @k String str2, @l SaveScheduleInfo saveScheduleInfo, @k Set<Integer> set) {
            this.f277714a = list;
            this.f277715b = str;
            this.f277716c = str2;
            this.f277717d = saveScheduleInfo;
            this.f277718e = set;
        }

        public static Content a(Content content, ArrayList arrayList, LinkedHashSet linkedHashSet) {
            String str = content.f277715b;
            String str2 = content.f277716c;
            SaveScheduleInfo saveScheduleInfo = content.f277717d;
            content.getClass();
            return new Content(arrayList, str, str2, saveScheduleInfo, linkedHashSet);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f277714a, content.f277714a) && L.f(this.f277715b, content.f277715b) && L.f(this.f277716c, content.f277716c) && L.f(this.f277717d, content.f277717d) && L.f(this.f277718e, content.f277718e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f277714a.hashCode() * 31, 31, this.f277715b), 31, this.f277716c);
            SaveScheduleInfo saveScheduleInfo = this.f277717d;
            return this.f277718e.hashCode() + ((iD2 + (saveScheduleInfo == null ? 0 : saveScheduleInfo.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(calendarItems=");
            sb2.append(this.f277714a);
            sb2.append(", title=");
            sb2.append(this.f277715b);
            sb2.append(", actionTitle=");
            sb2.append(this.f277716c);
            sb2.append(", saveScheduleInfo=");
            sb2.append(this.f277717d);
            sb2.append(", changedDaysIndexes=");
            return H.n(sb2, this.f277718e, ')');
        }
    }

    /* compiled from: ScheduleRepetitionState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState$ShowElements;", "Landroid/os/Parcelable;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowElements implements Parcelable {

        @k
        public static final Parcelable.Creator<ShowElements> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f277726b;

        /* compiled from: ScheduleRepetitionState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowElements> {
            @Override // android.os.Parcelable.Creator
            public final ShowElements createFromParcel(Parcel parcel) {
                return new ShowElements(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ShowElements[] newArray(int i12) {
                return new ShowElements[i12];
            }
        }

        public ShowElements() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowElements) && this.f277726b == ((ShowElements) obj).f277726b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f277726b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowElements(saveDialogShow="), this.f277726b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f277726b ? 1 : 0);
        }

        public ShowElements(boolean z12) {
            this.f277726b = z12;
        }

        public /* synthetic */ ShowElements(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: ScheduleRepetitionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState$a;", "", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42822w c42822w = null;
        f277707g = new a(c42822w);
        f277708h = new ScheduleRepetitionState(false, null, null, new ShowElements(false, 1, c42822w), BookingSettingsStatus.f278279e);
    }

    public ScheduleRepetitionState(boolean z12, @l PrintableText printableText, @l Content content, @k ShowElements showElements, @k BookingSettingsStatus bookingSettingsStatus) {
        this.f277709b = z12;
        this.f277710c = printableText;
        this.f277711d = content;
        this.f277712e = showElements;
        this.f277713f = bookingSettingsStatus;
    }

    public static ScheduleRepetitionState a(ScheduleRepetitionState scheduleRepetitionState, boolean z12, PrintableText printableText, Content content, ShowElements showElements, BookingSettingsStatus bookingSettingsStatus, int i12) {
        if ((i12 & 1) != 0) {
            z12 = scheduleRepetitionState.f277709b;
        }
        boolean z13 = z12;
        if ((i12 & 2) != 0) {
            printableText = scheduleRepetitionState.f277710c;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 4) != 0) {
            content = scheduleRepetitionState.f277711d;
        }
        Content content2 = content;
        if ((i12 & 8) != 0) {
            showElements = scheduleRepetitionState.f277712e;
        }
        ShowElements showElements2 = showElements;
        if ((i12 & 16) != 0) {
            bookingSettingsStatus = scheduleRepetitionState.f277713f;
        }
        scheduleRepetitionState.getClass();
        return new ScheduleRepetitionState(z13, printableText2, content2, showElements2, bookingSettingsStatus);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleRepetitionState)) {
            return false;
        }
        ScheduleRepetitionState scheduleRepetitionState = (ScheduleRepetitionState) obj;
        return this.f277709b == scheduleRepetitionState.f277709b && L.f(this.f277710c, scheduleRepetitionState.f277710c) && L.f(this.f277711d, scheduleRepetitionState.f277711d) && L.f(this.f277712e, scheduleRepetitionState.f277712e) && this.f277713f == scheduleRepetitionState.f277713f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f277709b) * 31;
        PrintableText printableText = this.f277710c;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Content content = this.f277711d;
        return this.f277713f.hashCode() + r.i((iHashCode2 + (content != null ? content.hashCode() : 0)) * 31, 31, this.f277712e.f277726b);
    }

    @k
    public final String toString() {
        return "ScheduleRepetitionState(isLoading=" + this.f277709b + ", error=" + this.f277710c + ", content=" + this.f277711d + ", showElements=" + this.f277712e + ", settingsStatus=" + this.f277713f + ')';
    }
}
