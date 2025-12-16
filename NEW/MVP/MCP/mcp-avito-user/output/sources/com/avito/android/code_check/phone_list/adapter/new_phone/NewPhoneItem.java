package com.avito.android.code_check.phone_list.adapter.new_phone;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NewPhoneItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/new_phone/NewPhoneItem;", "Lcom/avito/android/code_check/phone_list/adapter/PhoneListItem;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NewPhoneItem implements PhoneListItem {

    @k
    public static final Parcelable.Creator<NewPhoneItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f118931b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PhoneList.ItemIcon f118932c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f118933d;

    /* compiled from: NewPhoneItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NewPhoneItem> {
        @Override // android.os.Parcelable.Creator
        public final NewPhoneItem createFromParcel(Parcel parcel) {
            return new NewPhoneItem((PrintableText) parcel.readParcelable(NewPhoneItem.class.getClassLoader()), parcel.readInt() == 0 ? null : PhoneList.ItemIcon.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewPhoneItem[] newArray(int i12) {
            return new NewPhoneItem[i12];
        }
    }

    public NewPhoneItem(@k PrintableText printableText, @l PhoneList.ItemIcon itemIcon) {
        this.f118931b = printableText;
        this.f118932c = itemIcon;
        this.f118933d = "com.avito.android.code_check.phone_list.adapter.new_phone.NewPhoneItem";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPhoneItem)) {
            return false;
        }
        NewPhoneItem newPhoneItem = (NewPhoneItem) obj;
        return L.f(this.f118931b, newPhoneItem.f118931b) && this.f118932c == newPhoneItem.f118932c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296143b() {
        return this.f118933d;
    }

    public final int hashCode() {
        int iHashCode = this.f118931b.hashCode() * 31;
        PhoneList.ItemIcon itemIcon = this.f118932c;
        return iHashCode + (itemIcon == null ? 0 : itemIcon.hashCode());
    }

    @k
    public final String toString() {
        return "NewPhoneItem(text=" + this.f118931b + ", icon=" + this.f118932c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f118931b, i12);
        PhoneList.ItemIcon itemIcon = this.f118932c;
        if (itemIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(itemIcon.name());
        }
    }

    public /* synthetic */ NewPhoneItem(PrintableText printableText, PhoneList.ItemIcon itemIcon, int i12, C42822w c42822w) {
        this(printableText, (i12 & 2) != 0 ? null : itemIcon);
    }
}
