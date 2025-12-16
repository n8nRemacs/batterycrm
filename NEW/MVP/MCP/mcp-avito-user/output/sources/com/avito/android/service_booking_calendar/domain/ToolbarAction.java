package com.avito.android.service_booking_calendar.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToolbarAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction;", "Lcom/avito/conveyor_item/ParcelableItem;", "ToolbarActionIcon", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToolbarAction implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ToolbarAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f275532b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ToolbarActionIcon f275533c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f275534d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f275535e;

    /* compiled from: ToolbarAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon;", "Landroid/os/Parcelable;", "AddBooking", "AdditionalSettings", "a", "DesignSystemIcon", "WorkHours", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$AddBooking;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$AdditionalSettings;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$DesignSystemIcon;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$WorkHours;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class ToolbarActionIcon implements Parcelable {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f275536c = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final int f275537b;

        /* compiled from: ToolbarAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$AddBooking;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddBooking extends ToolbarActionIcon {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final AddBooking f275538d = new AddBooking();

            @k
            public static final Parcelable.Creator<AddBooking> CREATOR = new a();

            /* compiled from: ToolbarAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AddBooking> {
                @Override // android.os.Parcelable.Creator
                public final AddBooking createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AddBooking.f275538d;
                }

                @Override // android.os.Parcelable.Creator
                public final AddBooking[] newArray(int i12) {
                    return new AddBooking[i12];
                }
            }

            public AddBooking() {
                super(R.attr.ic_plus24, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof AddBooking);
            }

            public final int hashCode() {
                return -1797554770;
            }

            @k
            public final String toString() {
                return "AddBooking";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ToolbarAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$AdditionalSettings;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdditionalSettings extends ToolbarActionIcon {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final AdditionalSettings f275539d = new AdditionalSettings();

            @k
            public static final Parcelable.Creator<AdditionalSettings> CREATOR = new a();

            /* compiled from: ToolbarAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AdditionalSettings> {
                @Override // android.os.Parcelable.Creator
                public final AdditionalSettings createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AdditionalSettings.f275539d;
                }

                @Override // android.os.Parcelable.Creator
                public final AdditionalSettings[] newArray(int i12) {
                    return new AdditionalSettings[i12];
                }
            }

            public AdditionalSettings() {
                super(R.attr.ic_settings24, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof AdditionalSettings);
            }

            public final int hashCode() {
                return 460884128;
            }

            @k
            public final String toString() {
                return "AdditionalSettings";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ToolbarAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$DesignSystemIcon;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DesignSystemIcon extends ToolbarActionIcon {

            @k
            public static final Parcelable.Creator<DesignSystemIcon> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            public final int f275540d;

            /* compiled from: ToolbarAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DesignSystemIcon> {
                @Override // android.os.Parcelable.Creator
                public final DesignSystemIcon createFromParcel(Parcel parcel) {
                    return new DesignSystemIcon(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final DesignSystemIcon[] newArray(int i12) {
                    return new DesignSystemIcon[i12];
                }
            }

            public DesignSystemIcon(@InterfaceC42150f int i12) {
                super(i12, null);
                this.f275540d = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DesignSystemIcon) && this.f275540d == ((DesignSystemIcon) obj).f275540d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f275540d);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("DesignSystemIcon(icon="), this.f275540d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f275540d);
            }
        }

        /* compiled from: ToolbarAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$WorkHours;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WorkHours extends ToolbarActionIcon {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final WorkHours f275541d = new WorkHours();

            @k
            public static final Parcelable.Creator<WorkHours> CREATOR = new a();

            /* compiled from: ToolbarAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<WorkHours> {
                @Override // android.os.Parcelable.Creator
                public final WorkHours createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return WorkHours.f275541d;
                }

                @Override // android.os.Parcelable.Creator
                public final WorkHours[] newArray(int i12) {
                    return new WorkHours[i12];
                }
            }

            public WorkHours() {
                super(R.attr.ic_timeOutline24, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof WorkHours);
            }

            public final int hashCode() {
                return -576506232;
            }

            @k
            public final String toString() {
                return "WorkHours";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ToolbarAction.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction$ToolbarActionIcon$a;", "", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public ToolbarActionIcon(int i12, C42822w c42822w) {
            this.f275537b = i12;
        }
    }

    /* compiled from: ToolbarAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToolbarAction> {
        @Override // android.os.Parcelable.Creator
        public final ToolbarAction createFromParcel(Parcel parcel) {
            return new ToolbarAction(parcel.readString(), (ToolbarActionIcon) parcel.readParcelable(ToolbarAction.class.getClassLoader()), (DeepLink) parcel.readParcelable(ToolbarAction.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ToolbarAction[] newArray(int i12) {
            return new ToolbarAction[i12];
        }
    }

    public ToolbarAction(@k String str, @k ToolbarActionIcon toolbarActionIcon, @k DeepLink deepLink, @k String str2) {
        this.f275532b = str;
        this.f275533c = toolbarActionIcon;
        this.f275534d = deepLink;
        this.f275535e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarAction)) {
            return false;
        }
        ToolbarAction toolbarAction = (ToolbarAction) obj;
        return L.f(this.f275532b, toolbarAction.f275532b) && L.f(this.f275533c, toolbarAction.f275533c) && L.f(this.f275534d, toolbarAction.f275534d) && L.f(this.f275535e, toolbarAction.f275535e);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273465b() {
        return this.f275532b;
    }

    public final int hashCode() {
        return this.f275535e.hashCode() + com.avito.android.actions_sheet.a.e(this.f275534d, (this.f275533c.hashCode() + (this.f275532b.hashCode() * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToolbarAction(stringId=");
        sb2.append(this.f275532b);
        sb2.append(", icon=");
        sb2.append(this.f275533c);
        sb2.append(", deeplink=");
        sb2.append(this.f275534d);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f275535e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f275532b);
        parcel.writeParcelable(this.f275533c, i12);
        parcel.writeParcelable(this.f275534d, i12);
        parcel.writeString(this.f275535e);
    }
}
