package com.avito.android.code_check.phone_list.adapter.phone;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneItem.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/phone/PhoneItem;", "Lcom/avito/android/code_check/phone_list/adapter/PhoneListItem;", "", "formattedPhone", "Lcom/avito/android/code_check_public/model/Phone;", "phone", "", "highlightStart", "highlightEnd", "Lcom/avito/android/code_check_public/screen/PhoneList$ItemIcon;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILcom/avito/android/code_check_public/screen/PhoneList$ItemIcon;Lkotlin/jvm/internal/w;)V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PhoneItem implements PhoneListItem {

    @k
    public static final Parcelable.Creator<PhoneItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118942b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f118943c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118945e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PhoneList.ItemIcon f118946f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f118947g;

    /* compiled from: PhoneItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneItem> {
        @Override // android.os.Parcelable.Creator
        public final PhoneItem createFromParcel(Parcel parcel) {
            return new PhoneItem(parcel.readString(), ((Phone) parcel.readParcelable(PhoneItem.class.getClassLoader())).f119296b, parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : PhoneList.ItemIcon.valueOf(parcel.readString()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneItem[] newArray(int i12) {
            return new PhoneItem[i12];
        }
    }

    public PhoneItem(String str, String str2, int i12, int i13, PhoneList.ItemIcon itemIcon, C42822w c42822w) {
        this.f118942b = str;
        this.f118943c = str2;
        this.f118944d = i12;
        this.f118945e = i13;
        this.f118946f = itemIcon;
        this.f118947g = "com.avito.android.code_check.phone_list.adapter.phone.PhoneItem";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneItem)) {
            return false;
        }
        PhoneItem phoneItem = (PhoneItem) obj;
        if (!L.f(this.f118942b, phoneItem.f118942b)) {
            return false;
        }
        Parcelable.Creator<Phone> creator = Phone.CREATOR;
        return L.f(this.f118943c, phoneItem.f118943c) && this.f118944d == phoneItem.f118944d && this.f118945e == phoneItem.f118945e && this.f118946f == phoneItem.f118946f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF87008c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF114598b() {
        return this.f118947g;
    }

    public final int hashCode() {
        int iHashCode = this.f118942b.hashCode() * 31;
        Parcelable.Creator<Phone> creator = Phone.CREATOR;
        int iE2 = r.e(this.f118945e, r.e(this.f118944d, H.d(iHashCode, 31, this.f118943c), 31), 31);
        PhoneList.ItemIcon itemIcon = this.f118946f;
        return iE2 + (itemIcon == null ? 0 : itemIcon.hashCode());
    }

    @k
    public final String toString() {
        return "PhoneItem(formattedPhone=" + this.f118942b + ", phone=" + ((Object) Phone.c(this.f118943c)) + ", highlightStart=" + this.f118944d + ", highlightEnd=" + this.f118945e + ", icon=" + this.f118946f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118942b);
        parcel.writeParcelable(Phone.a(this.f118943c), i12);
        parcel.writeInt(this.f118944d);
        parcel.writeInt(this.f118945e);
        PhoneList.ItemIcon itemIcon = this.f118946f;
        if (itemIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(itemIcon.name());
        }
    }

    public /* synthetic */ PhoneItem(String str, String str2, int i12, int i13, PhoneList.ItemIcon itemIcon, int i14, C42822w c42822w) {
        this(str, str2, (i14 & 4) != 0 ? -1 : i12, (i14 & 8) != 0 ? -1 : i13, (i14 & 16) != 0 ? null : itemIcon, null);
    }
}
