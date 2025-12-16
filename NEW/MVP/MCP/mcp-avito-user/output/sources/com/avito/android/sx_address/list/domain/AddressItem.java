package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "AddressListItemBottomSheet", "AddressListItemBottomSheetButtonsItem", "LocalizedStatus", "Status", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddressItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293121b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AddressListItemBottomSheet f293122c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f293123d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f293124e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f293125f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LocalizedStatus f293126g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f293127h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f293128i;

    /* compiled from: AddressItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem$AddressListItemBottomSheet;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class AddressListItemBottomSheet implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressListItemBottomSheet> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f293129b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f293130c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f293131d;

        /* compiled from: AddressItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressListItemBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final AddressListItemBottomSheet createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressListItemBottomSheetButtonsItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new AddressListItemBottomSheet((AttributedText) parcel.readParcelable(AddressListItemBottomSheet.class.getClassLoader()), parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AddressListItemBottomSheet[] newArray(int i12) {
                return new AddressListItemBottomSheet[i12];
            }
        }

        public AddressListItemBottomSheet(@k AttributedText attributedText, @k String str, @k ArrayList arrayList) {
            this.f293129b = arrayList;
            this.f293130c = attributedText;
            this.f293131d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f293129b, parcel);
            while (itZ.hasNext()) {
                ((AddressListItemBottomSheetButtonsItem) itZ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f293130c, i12);
            parcel.writeString(this.f293131d);
        }
    }

    /* compiled from: AddressItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem$AddressListItemBottomSheetButtonsItem;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class AddressListItemBottomSheetButtonsItem implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressListItemBottomSheetButtonsItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f293132b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f293133c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f293134d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Boolean f293135e;

        /* compiled from: AddressItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressListItemBottomSheetButtonsItem> {
            @Override // android.os.Parcelable.Creator
            public final AddressListItemBottomSheetButtonsItem createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(AddressListItemBottomSheetButtonsItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AddressListItemBottomSheetButtonsItem(string, string2, deepLink, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final AddressListItemBottomSheetButtonsItem[] newArray(int i12) {
                return new AddressListItemBottomSheetButtonsItem[i12];
            }
        }

        public AddressListItemBottomSheetButtonsItem(@l String str, @l String str2, @l DeepLink deepLink, @l Boolean bool) {
            this.f293132b = str;
            this.f293133c = str2;
            this.f293134d = deepLink;
            this.f293135e = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f293132b);
            parcel.writeString(this.f293133c);
            parcel.writeParcelable(this.f293134d, i12);
            Boolean bool = this.f293135e;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: AddressItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem$LocalizedStatus;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class LocalizedStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<LocalizedStatus> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Status f293136b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f293137c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f293138d;

        /* compiled from: AddressItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LocalizedStatus> {
            @Override // android.os.Parcelable.Creator
            public final LocalizedStatus createFromParcel(Parcel parcel) {
                return new LocalizedStatus(Status.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LocalizedStatus[] newArray(int i12) {
                return new LocalizedStatus[i12];
            }
        }

        public LocalizedStatus(@k Status status, @l String str, @l String str2) {
            this.f293136b = status;
            this.f293137c = str;
            this.f293138d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedStatus)) {
                return false;
            }
            LocalizedStatus localizedStatus = (LocalizedStatus) obj;
            return this.f293136b == localizedStatus.f293136b && L.f(this.f293137c, localizedStatus.f293137c) && L.f(this.f293138d, localizedStatus.f293138d);
        }

        public final int hashCode() {
            int iHashCode = this.f293136b.hashCode() * 31;
            String str = this.f293137c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f293138d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocalizedStatus(status=");
            sb2.append(this.f293136b);
            sb2.append(", text=");
            sb2.append(this.f293137c);
            sb2.append(", action=");
            return C22026a.c(sb2, this.f293138d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f293136b.name());
            parcel.writeString(this.f293137c);
            parcel.writeString(this.f293138d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem$Status;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f293139b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f293140c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f293141d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f293142e;

        /* renamed from: f, reason: collision with root package name */
        public static final Status f293143f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Status[] f293144g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f293145h;

        static {
            Status status = new Status("BASE", 0);
            f293139b = status;
            Status status2 = new Status("COMPLETED", 1);
            f293140c = status2;
            Status status3 = new Status("INPROGRESS", 2);
            f293141d = status3;
            Status status4 = new Status("REJECTED", 3);
            f293142e = status4;
            Status status5 = new Status("VALIDATED", 4);
            f293143f = status5;
            Status[] statusArr = {status, status2, status3, status4, status5};
            f293144g = statusArr;
            f293145h = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f293144g.clone();
        }
    }

    /* compiled from: AddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressItem> {
        @Override // android.os.Parcelable.Creator
        public final AddressItem createFromParcel(Parcel parcel) {
            return new AddressItem(parcel.readString(), AddressListItemBottomSheet.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, LocalizedStatus.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressItem[] newArray(int i12) {
            return new AddressItem[i12];
        }
    }

    public AddressItem(@k String str, @k AddressListItemBottomSheet addressListItemBottomSheet, @k String str2, boolean z12, boolean z13, @k LocalizedStatus localizedStatus, @l String str3, @k String str4) {
        this.f293121b = str;
        this.f293122c = addressListItemBottomSheet;
        this.f293123d = str2;
        this.f293124e = z12;
        this.f293125f = z13;
        this.f293126g = localizedStatus;
        this.f293127h = str3;
        this.f293128i = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return L.f(this.f293121b, addressItem.f293121b) && L.f(this.f293122c, addressItem.f293122c) && L.f(this.f293123d, addressItem.f293123d) && this.f293124e == addressItem.f293124e && this.f293125f == addressItem.f293125f && L.f(this.f293126g, addressItem.f293126g) && L.f(this.f293127h, addressItem.f293127h) && L.f(this.f293128i, addressItem.f293128i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275042h() {
        return this.f293121b;
    }

    public final int hashCode() {
        int iHashCode = (this.f293126g.hashCode() + r.i(r.i(H.d((this.f293122c.hashCode() + (this.f293121b.hashCode() * 31)) * 31, 31, this.f293123d), 31, this.f293124e), 31, this.f293125f)) * 31;
        String str = this.f293127h;
        return this.f293128i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressItem(stringId=");
        sb2.append(this.f293121b);
        sb2.append(", bottomSheet=");
        sb2.append(this.f293122c);
        sb2.append(", description=");
        sb2.append(this.f293123d);
        sb2.append(", isDisabled=");
        sb2.append(this.f293124e);
        sb2.append(", isRevalidateAvailable=");
        sb2.append(this.f293125f);
        sb2.append(", status=");
        sb2.append(this.f293126g);
        sb2.append(", subtitle=");
        sb2.append(this.f293127h);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f293128i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f293121b);
        this.f293122c.writeToParcel(parcel, i12);
        parcel.writeString(this.f293123d);
        parcel.writeInt(this.f293124e ? 1 : 0);
        parcel.writeInt(this.f293125f ? 1 : 0);
        this.f293126g.writeToParcel(parcel, i12);
        parcel.writeString(this.f293127h);
        parcel.writeString(this.f293128i);
    }
}
