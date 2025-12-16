package com.avito.android.profile_settings_extended.adapter.phones;

import Rb0.InterfaceC15025a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsPhonesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/ExtendedSettingsPhonesItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "EmptyState", "Phone", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsPhonesItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<ExtendedSettingsPhonesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f229676d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f229677e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f229678f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f229679g;

    /* renamed from: h, reason: collision with root package name */
    public final int f229680h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final EmptyState f229681i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final List<PhoneValue> f229682j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f229683k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229684l;

    /* compiled from: ExtendedSettingsPhonesItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/ExtendedSettingsPhonesItem$EmptyState;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class EmptyState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<EmptyState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f229685b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f229686c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f229687d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f229688e;

        /* compiled from: ExtendedSettingsPhonesItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyState> {
            @Override // android.os.Parcelable.Creator
            public final EmptyState createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                return new EmptyState((DeepLink) parcel.readParcelable(EmptyState.class.getClassLoader()), (AttributedText) parcel.readParcelable(EmptyState.class.getClassLoader()), string, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyState[] newArray(int i12) {
                return new EmptyState[i12];
            }
        }

        public EmptyState(@Y61.l DeepLink deepLink, @Y61.l AttributedText attributedText, @Y61.k String str, @Y61.l String str2) {
            this.f229685b = str;
            this.f229686c = attributedText;
            this.f229687d = str2;
            this.f229688e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyState)) {
                return false;
            }
            EmptyState emptyState = (EmptyState) obj;
            return L.f(this.f229685b, emptyState.f229685b) && L.f(this.f229686c, emptyState.f229686c) && L.f(this.f229687d, emptyState.f229687d) && L.f(this.f229688e, emptyState.f229688e);
        }

        public final int hashCode() {
            int iHashCode = this.f229685b.hashCode() * 31;
            AttributedText attributedText = this.f229686c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str = this.f229687d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f229688e;
            return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmptyState(title=");
            sb2.append(this.f229685b);
            sb2.append(", subtitle=");
            sb2.append(this.f229686c);
            sb2.append(", addPhoneButtonTitle=");
            sb2.append(this.f229687d);
            sb2.append(", addPhoneButtonDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f229688e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f229685b);
            parcel.writeParcelable(this.f229686c, i12);
            parcel.writeString(this.f229687d);
            parcel.writeParcelable(this.f229688e, i12);
        }
    }

    /* compiled from: ExtendedSettingsPhonesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsPhonesItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsPhonesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ExtendedSettingsPhonesItem.class.getClassLoader());
            String string4 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ExtendedSettingsPhonesItem.class.getClassLoader());
            int i12 = parcel.readInt();
            EmptyState emptyStateCreateFromParcel = EmptyState.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(PhoneValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ExtendedSettingsPhonesItem(string, string2, string3, attributedText, string4, deepLink, i12, emptyStateCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsPhonesItem[] newArray(int i12) {
            return new ExtendedSettingsPhonesItem[i12];
        }
    }

    public ExtendedSettingsPhonesItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.l String str4, @Y61.l DeepLink deepLink, int i12, @Y61.k EmptyState emptyState, @Y61.k List<PhoneValue> list, boolean z12) {
        this.f229674b = str;
        this.f229675c = str2;
        this.f229676d = str3;
        this.f229677e = attributedText;
        this.f229678f = str4;
        this.f229679g = deepLink;
        this.f229680h = i12;
        this.f229681i = emptyState;
        this.f229682j = list;
        this.f229683k = z12;
        this.f229684l = GridElementType.FullWidth.f161209b;
    }

    public static ExtendedSettingsPhonesItem a(ExtendedSettingsPhonesItem extendedSettingsPhonesItem, ArrayList arrayList) {
        return new ExtendedSettingsPhonesItem(extendedSettingsPhonesItem.f229674b, extendedSettingsPhonesItem.f229675c, extendedSettingsPhonesItem.f229676d, extendedSettingsPhonesItem.f229677e, extendedSettingsPhonesItem.f229678f, extendedSettingsPhonesItem.f229679g, extendedSettingsPhonesItem.f229680h, extendedSettingsPhonesItem.f229681i, arrayList, extendedSettingsPhonesItem.f229683k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsPhonesItem)) {
            return false;
        }
        ExtendedSettingsPhonesItem extendedSettingsPhonesItem = (ExtendedSettingsPhonesItem) obj;
        return L.f(this.f229674b, extendedSettingsPhonesItem.f229674b) && L.f(this.f229675c, extendedSettingsPhonesItem.f229675c) && L.f(this.f229676d, extendedSettingsPhonesItem.f229676d) && L.f(this.f229677e, extendedSettingsPhonesItem.f229677e) && L.f(this.f229678f, extendedSettingsPhonesItem.f229678f) && L.f(this.f229679g, extendedSettingsPhonesItem.f229679g) && this.f229680h == extendedSettingsPhonesItem.f229680h && L.f(this.f229681i, extendedSettingsPhonesItem.f229681i) && L.f(this.f229682j, extendedSettingsPhonesItem.f229682j) && this.f229683k == extendedSettingsPhonesItem.f229683k;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229684l;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229153b() {
        return this.f229674b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f229674b.hashCode() * 31, 31, this.f229675c), 31, this.f229676d);
        AttributedText attributedText = this.f229677e;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f229678f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f229679g;
        return Boolean.hashCode(this.f229683k) + H.e((this.f229681i.hashCode() + r.e(this.f229680h, (iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31)) * 31, 31, this.f229682j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsPhonesItem(stringId=");
        sb2.append(this.f229674b);
        sb2.append(", fieldName=");
        sb2.append(this.f229675c);
        sb2.append(", title=");
        sb2.append(this.f229676d);
        sb2.append(", subtitle=");
        sb2.append(this.f229677e);
        sb2.append(", addPhoneButtonTitle=");
        sb2.append(this.f229678f);
        sb2.append(", addPhoneButtonDeepLink=");
        sb2.append(this.f229679g);
        sb2.append(", maxCount=");
        sb2.append(this.f229680h);
        sb2.append(", emptyState=");
        sb2.append(this.f229681i);
        sb2.append(", phones=");
        sb2.append(this.f229682j);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229683k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229674b);
        parcel.writeString(this.f229675c);
        parcel.writeString(this.f229676d);
        parcel.writeParcelable(this.f229677e, i12);
        parcel.writeString(this.f229678f);
        parcel.writeParcelable(this.f229679g, i12);
        parcel.writeInt(this.f229680h);
        this.f229681i.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f229682j, parcel);
        while (itJ.hasNext()) {
            ((PhoneValue) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f229683k ? 1 : 0);
    }

    /* compiled from: ExtendedSettingsPhonesItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/ExtendedSettingsPhonesItem$Phone;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Phone implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CommonValueId f229689b;

        /* renamed from: c, reason: collision with root package name */
        public final int f229690c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f229691d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final PhoneVerificationStatus f229692e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f229693f;

        /* compiled from: ExtendedSettingsPhonesItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Phone> {
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                return new Phone(CommonValueId.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), (PhoneVerificationStatus) parcel.readParcelable(Phone.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public Phone(@Y61.k CommonValueId commonValueId, int i12, @Y61.k String str, @Y61.k PhoneVerificationStatus phoneVerificationStatus, boolean z12) {
            this.f229689b = commonValueId;
            this.f229690c = i12;
            this.f229691d = str;
            this.f229692e = phoneVerificationStatus;
            this.f229693f = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            return L.f(this.f229689b, phone.f229689b) && this.f229690c == phone.f229690c && L.f(this.f229691d, phone.f229691d) && L.f(this.f229692e, phone.f229692e) && this.f229693f == phone.f229693f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f229693f) + ((this.f229692e.hashCode() + H.d(r.e(this.f229690c, this.f229689b.hashCode() * 31, 31), 31, this.f229691d)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Phone(commonValueId=");
            sb2.append(this.f229689b);
            sb2.append(", id=");
            sb2.append(this.f229690c);
            sb2.append(", formattedPhone=");
            sb2.append(this.f229691d);
            sb2.append(", status=");
            sb2.append(this.f229692e);
            sb2.append(", isInDeletionProcess=");
            return r.x(sb2, this.f229693f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f229689b.writeToParcel(parcel, i12);
            parcel.writeInt(this.f229690c);
            parcel.writeString(this.f229691d);
            parcel.writeParcelable(this.f229692e, i12);
            parcel.writeInt(this.f229693f ? 1 : 0);
        }

        public /* synthetic */ Phone(CommonValueId commonValueId, int i12, String str, PhoneVerificationStatus phoneVerificationStatus, boolean z12, int i13, C42822w c42822w) {
            this(commonValueId, i12, str, phoneVerificationStatus, (i13 & 16) != 0 ? false : z12);
        }
    }

    public /* synthetic */ ExtendedSettingsPhonesItem(String str, String str2, String str3, AttributedText attributedText, String str4, DeepLink deepLink, int i12, EmptyState emptyState, List list, boolean z12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "extended_settings_phones" : str, str2, str3, attributedText, str4, deepLink, i12, emptyState, list, z12);
    }
}
