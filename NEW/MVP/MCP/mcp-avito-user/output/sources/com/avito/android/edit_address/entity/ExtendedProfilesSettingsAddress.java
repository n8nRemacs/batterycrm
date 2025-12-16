package com.avito.android.edit_address.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfilesSettingsAddress.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/entity/ExtendedProfilesSettingsAddress;", "Landroid/os/Parcelable;", "StatusField", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfilesSettingsAddress implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfilesSettingsAddress> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CommonValueId f145900b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f145901c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f145902d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f145903e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AddressCoordinates f145904f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<AddressWorkSchedule> f145905g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final StatusField f145906h;

    /* compiled from: ExtendedProfilesSettingsAddress.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/entity/ExtendedProfilesSettingsAddress$StatusField;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class StatusField implements Parcelable {

        @k
        public static final Parcelable.Creator<StatusField> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145907b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ModerationStatus f145908c;

        /* compiled from: ExtendedProfilesSettingsAddress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StatusField> {
            @Override // android.os.Parcelable.Creator
            public final StatusField createFromParcel(Parcel parcel) {
                return new StatusField(parcel.readString(), (ModerationStatus) parcel.readParcelable(StatusField.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final StatusField[] newArray(int i12) {
                return new StatusField[i12];
            }
        }

        public StatusField(@k String str, @l ModerationStatus moderationStatus) {
            this.f145907b = str;
            this.f145908c = moderationStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusField)) {
                return false;
            }
            StatusField statusField = (StatusField) obj;
            return L.f(this.f145907b, statusField.f145907b) && L.f(this.f145908c, statusField.f145908c);
        }

        public final int hashCode() {
            int iHashCode = this.f145907b.hashCode() * 31;
            ModerationStatus moderationStatus = this.f145908c;
            return iHashCode + (moderationStatus == null ? 0 : moderationStatus.hashCode());
        }

        @k
        public final String toString() {
            return "StatusField(value=" + this.f145907b + ", status=" + this.f145908c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145907b);
            parcel.writeParcelable(this.f145908c, i12);
        }
    }

    /* compiled from: ExtendedProfilesSettingsAddress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfilesSettingsAddress> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfilesSettingsAddress createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            CommonValueId commonValueIdCreateFromParcel = CommonValueId.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AddressCoordinates addressCoordinatesCreateFromParcel = parcel.readInt() == 0 ? null : AddressCoordinates.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressWorkSchedule.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ExtendedProfilesSettingsAddress(commonValueIdCreateFromParcel, string, string2, string3, addressCoordinatesCreateFromParcel, arrayList, parcel.readInt() != 0 ? StatusField.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfilesSettingsAddress[] newArray(int i12) {
            return new ExtendedProfilesSettingsAddress[i12];
        }
    }

    public ExtendedProfilesSettingsAddress(@k CommonValueId commonValueId, @l String str, @l String str2, @l String str3, @l AddressCoordinates addressCoordinates, @l List<AddressWorkSchedule> list, @l StatusField statusField) {
        this.f145900b = commonValueId;
        this.f145901c = str;
        this.f145902d = str2;
        this.f145903e = str3;
        this.f145904f = addressCoordinates;
        this.f145905g = list;
        this.f145906h = statusField;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfilesSettingsAddress)) {
            return false;
        }
        ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = (ExtendedProfilesSettingsAddress) obj;
        return L.f(this.f145900b, extendedProfilesSettingsAddress.f145900b) && L.f(this.f145901c, extendedProfilesSettingsAddress.f145901c) && L.f(this.f145902d, extendedProfilesSettingsAddress.f145902d) && L.f(this.f145903e, extendedProfilesSettingsAddress.f145903e) && L.f(this.f145904f, extendedProfilesSettingsAddress.f145904f) && L.f(this.f145905g, extendedProfilesSettingsAddress.f145905g) && L.f(this.f145906h, extendedProfilesSettingsAddress.f145906h);
    }

    public final int hashCode() {
        int iHashCode = this.f145900b.hashCode() * 31;
        String str = this.f145901c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145902d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145903e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AddressCoordinates addressCoordinates = this.f145904f;
        int iHashCode5 = (iHashCode4 + (addressCoordinates == null ? 0 : addressCoordinates.hashCode())) * 31;
        List<AddressWorkSchedule> list = this.f145905g;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        StatusField statusField = this.f145906h;
        return iHashCode6 + (statusField != null ? statusField.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ExtendedProfilesSettingsAddress(id=" + this.f145900b + ", formattedAddress=" + this.f145901c + ", rawAddress=" + this.f145902d + ", entrance=" + this.f145903e + ", coordinates=" + this.f145904f + ", schedule=" + this.f145905g + ", comment=" + this.f145906h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f145900b.writeToParcel(parcel, i12);
        parcel.writeString(this.f145901c);
        parcel.writeString(this.f145902d);
        parcel.writeString(this.f145903e);
        AddressCoordinates addressCoordinates = this.f145904f;
        if (addressCoordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCoordinates.writeToParcel(parcel, i12);
        }
        List<AddressWorkSchedule> list = this.f145905g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressWorkSchedule) itA.next()).writeToParcel(parcel, i12);
            }
        }
        StatusField statusField = this.f145906h;
        if (statusField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusField.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ ExtendedProfilesSettingsAddress(CommonValueId commonValueId, String str, String str2, String str3, AddressCoordinates addressCoordinates, List list, StatusField statusField, int i12, C42822w c42822w) {
        this(commonValueId, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : addressCoordinates, (i12 & 32) != 0 ? null : list, (i12 & 64) == 0 ? statusField : null);
    }
}
