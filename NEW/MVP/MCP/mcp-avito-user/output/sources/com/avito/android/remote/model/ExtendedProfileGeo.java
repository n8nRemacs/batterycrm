package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileGeo.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001f !B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "title", "Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "center", "", "Lcom/avito/android/remote/model/ExtendedProfileGeo$Address;", "addresses", "widgetName", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "getCenter", "()Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "getWidgetName", "Address", "Coordinates", "WorkSchedule", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileGeo implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileGeo> CREATOR = new Creator();

    @c("list")
    @l
    private final List<Address> addresses;

    @c("center")
    @l
    private final Coordinates center;

    @c("title")
    @k
    private final String title;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileGeo.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b$\u0010 R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo$Address;", "Landroid/os/Parcelable;", "", "formattedAddress", "", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule;", "workSchedule", "", "showPhoneButton", "Lcom/avito/android/remote/model/DeeplinkAction;", "phoneButtonAction", "comment", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;Ljava/util/List;ZLcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormattedAddress", "()Ljava/lang/String;", "Ljava/util/List;", "getGeoReferences", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "getWorkSchedule", "Z", "getShowPhoneButton", "()Z", "setShowPhoneButton", "(Z)V", "Lcom/avito/android/remote/model/DeeplinkAction;", "getPhoneButtonAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "setPhoneButtonAction", "(Lcom/avito/android/remote/model/DeeplinkAction;)V", "getComment", "setComment", "(Ljava/lang/String;)V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Address implements Parcelable {

        @k
        public static final Parcelable.Creator<Address> CREATOR = new Creator();

        @c("comment")
        @l
        private String comment;

        @c(ServiceTransportationWidget.LocationField.COORDINATES)
        @k
        private final Coordinates coordinates;

        @c("formattedAddress")
        @k
        private final String formattedAddress;

        @c("geoReferences")
        @k
        private final List<GeoReference> geoReferences;

        @c("phoneActionButton")
        @k
        private DeeplinkAction phoneButtonAction;

        @c("showPhoneButton")
        private boolean showPhoneButton;

        @c("workSchedule")
        @l
        private final List<WorkSchedule> workSchedule;

        /* compiled from: ExtendedProfileGeo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Address createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(Address.class, parcel, arrayList2, iL2, 1);
                }
                Coordinates coordinatesCreateFromParcel = Coordinates.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = a.c(WorkSchedule.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new Address(string, arrayList2, coordinatesCreateFromParcel, arrayList, parcel.readInt() != 0, (DeeplinkAction) parcel.readParcelable(Address.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        public Address(@k String str, @k List<GeoReference> list, @k Coordinates coordinates, @l List<WorkSchedule> list2, boolean z12, @k DeeplinkAction deeplinkAction, @l String str2) {
            this.formattedAddress = str;
            this.geoReferences = list;
            this.coordinates = coordinates;
            this.workSchedule = list2;
            this.showPhoneButton = z12;
            this.phoneButtonAction = deeplinkAction;
            this.comment = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getComment() {
            return this.comment;
        }

        @k
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @k
        public final String getFormattedAddress() {
            return this.formattedAddress;
        }

        @k
        public final List<GeoReference> getGeoReferences() {
            return this.geoReferences;
        }

        @k
        public final DeeplinkAction getPhoneButtonAction() {
            return this.phoneButtonAction;
        }

        public final boolean getShowPhoneButton() {
            return this.showPhoneButton;
        }

        @l
        public final List<WorkSchedule> getWorkSchedule() {
            return this.workSchedule;
        }

        public final void setComment(@l String str) {
            this.comment = str;
        }

        public final void setPhoneButtonAction(@k DeeplinkAction deeplinkAction) {
            this.phoneButtonAction = deeplinkAction;
        }

        public final void setShowPhoneButton(boolean z12) {
            this.showPhoneButton = z12;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.formattedAddress);
            Iterator itJ = C0.j(this.geoReferences, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            this.coordinates.writeToParcel(parcel, flags);
            List<WorkSchedule> list = this.workSchedule;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((WorkSchedule) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeInt(this.showPhoneButton ? 1 : 0);
            parcel.writeParcelable(this.phoneButtonAction, flags);
            parcel.writeString(this.comment);
        }
    }

    /* compiled from: ExtendedProfileGeo.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo$Coordinates;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(DD)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "()D", "getLongitude", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Coordinates implements Parcelable {

        @k
        public static final Parcelable.Creator<Coordinates> CREATOR = new Creator();

        @c("latitude")
        private final double latitude;

        @c("longitude")
        private final double longitude;

        /* compiled from: ExtendedProfileGeo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Coordinates> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Coordinates createFromParcel(@k Parcel parcel) {
                return new Coordinates(parcel.readDouble(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Coordinates[] newArray(int i12) {
                return new Coordinates[i12];
            }
        }

        public Coordinates(double d12, double d13) {
            this.latitude = d12;
            this.longitude = d13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
        }
    }

    /* compiled from: ExtendedProfileGeo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileGeo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileGeo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            Coordinates coordinatesCreateFromParcel = parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Address.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ExtendedProfileGeo(string, coordinatesCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileGeo[] newArray(int i12) {
            return new ExtendedProfileGeo[i12];
        }
    }

    /* compiled from: ExtendedProfileGeo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$Days;", "days", "Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;", "workHours", "breakHours", "<init>", "(Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$Days;Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$Days;", "getDays", "()Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$Days;", "Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;", "getWorkHours", "()Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;", "getBreakHours", "Days", "TimeRange", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class WorkSchedule implements Parcelable {

        @k
        public static final Parcelable.Creator<WorkSchedule> CREATOR = new Creator();

        @c("breakHours")
        @l
        private final TimeRange breakHours;

        @c("days")
        @k
        private final Days days;

        @c("workHours")
        @l
        private final TimeRange workHours;

        /* compiled from: ExtendedProfileGeo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WorkSchedule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WorkSchedule createFromParcel(@k Parcel parcel) {
                return new WorkSchedule(Days.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TimeRange.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TimeRange.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WorkSchedule[] newArray(int i12) {
                return new WorkSchedule[i12];
            }
        }

        /* compiled from: ExtendedProfileGeo.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$Days;", "Landroid/os/Parcelable;", "", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getMonday", "()Ljava/lang/Boolean;", "getTuesday", "getWednesday", "getThursday", "getFriday", "getSaturday", "getSunday", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Days implements Parcelable {

            @k
            public static final Parcelable.Creator<Days> CREATOR = new Creator();

            @c("friday")
            @l
            private final Boolean friday;

            @c("monday")
            @l
            private final Boolean monday;

            @c("saturday")
            @l
            private final Boolean saturday;

            @c("sunday")
            @l
            private final Boolean sunday;

            @c("thursday")
            @l
            private final Boolean thursday;

            @c("tuesday")
            @l
            private final Boolean tuesday;

            @c("wednesday")
            @l
            private final Boolean wednesday;

            /* compiled from: ExtendedProfileGeo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Days> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Days createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    Boolean boolValueOf4;
                    Boolean boolValueOf5;
                    Boolean boolValueOf6;
                    Boolean boolValueOf7;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf4 = null;
                    } else {
                        boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf5 = null;
                    } else {
                        boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf6 = null;
                    } else {
                        boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf7 = null;
                    } else {
                        boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Days(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Days[] newArray(int i12) {
                    return new Days[i12];
                }
            }

            public Days(@l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l Boolean bool6, @l Boolean bool7) {
                this.monday = bool;
                this.tuesday = bool2;
                this.wednesday = bool3;
                this.thursday = bool4;
                this.friday = bool5;
                this.saturday = bool6;
                this.sunday = bool7;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Boolean getFriday() {
                return this.friday;
            }

            @l
            public final Boolean getMonday() {
                return this.monday;
            }

            @l
            public final Boolean getSaturday() {
                return this.saturday;
            }

            @l
            public final Boolean getSunday() {
                return this.sunday;
            }

            @l
            public final Boolean getThursday() {
                return this.thursday;
            }

            @l
            public final Boolean getTuesday() {
                return this.tuesday;
            }

            @l
            public final Boolean getWednesday() {
                return this.wednesday;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Boolean bool = this.monday;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Boolean bool2 = this.tuesday;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                Boolean bool3 = this.wednesday;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool3);
                }
                Boolean bool4 = this.thursday;
                if (bool4 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool4);
                }
                Boolean bool5 = this.friday;
                if (bool5 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool5);
                }
                Boolean bool6 = this.saturday;
                if (bool6 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool6);
                }
                Boolean bool7 = this.sunday;
                if (bool7 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool7);
                }
            }
        }

        /* compiled from: ExtendedProfileGeo.kt */
        @d
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileGeo$WorkSchedule$TimeRange;", "Landroid/os/Parcelable;", "", "", "minutes", "", "allDay", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getMinutes", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getAllDay", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TimeRange implements Parcelable {

            @k
            public static final Parcelable.Creator<TimeRange> CREATOR = new Creator();

            @c("allDay")
            @l
            private final Boolean allDay;

            @c("minutes")
            @l
            private final List<Integer> minutes;

            /* compiled from: ExtendedProfileGeo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TimeRange> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final TimeRange createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    Boolean boolValueOf = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iD2 = 0;
                        while (iD2 != i12) {
                            iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new TimeRange(arrayList, boolValueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final TimeRange[] newArray(int i12) {
                    return new TimeRange[i12];
                }
            }

            public TimeRange(@l List<Integer> list, @l Boolean bool) {
                this.minutes = list;
                this.allDay = bool;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Boolean getAllDay() {
                return this.allDay;
            }

            @l
            public final List<Integer> getMinutes() {
                return this.minutes;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                List<Integer> list = this.minutes;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeInt(((Number) itA.next()).intValue());
                    }
                }
                Boolean bool = this.allDay;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }
        }

        public WorkSchedule(@k Days days, @l TimeRange timeRange, @l TimeRange timeRange2) {
            this.days = days;
            this.workHours = timeRange;
            this.breakHours = timeRange2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final TimeRange getBreakHours() {
            return this.breakHours;
        }

        @k
        public final Days getDays() {
            return this.days;
        }

        @l
        public final TimeRange getWorkHours() {
            return this.workHours;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.days.writeToParcel(parcel, flags);
            TimeRange timeRange = this.workHours;
            if (timeRange == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                timeRange.writeToParcel(parcel, flags);
            }
            TimeRange timeRange2 = this.breakHours;
            if (timeRange2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                timeRange2.writeToParcel(parcel, flags);
            }
        }
    }

    public ExtendedProfileGeo(@k String str, @l Coordinates coordinates, @l List<Address> list, @l String str2) {
        this.title = str;
        this.center = coordinates;
        this.addresses = list;
        this.widgetName = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<Address> getAddresses() {
        return this.addresses;
    }

    @l
    public final Coordinates getCenter() {
        return this.center;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Coordinates coordinates = this.center;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, flags);
        }
        List<Address> list = this.addresses;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Address) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.widgetName);
    }
}
