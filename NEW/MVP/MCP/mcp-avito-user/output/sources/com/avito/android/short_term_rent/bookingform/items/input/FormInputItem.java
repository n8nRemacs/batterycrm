package com.avito.android.short_term_rent.bookingform.items.input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormInputItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/input/FormInputItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormInputItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<FormInputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f281540c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f281541d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f281542e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FormatterType f281543f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f281544g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f281545h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f281546i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final FormInputState f281547j;

    /* compiled from: FormInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormInputItem> {
        @Override // android.os.Parcelable.Creator
        public final FormInputItem createFromParcel(Parcel parcel) {
            return new FormInputItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (FormatterType) parcel.readParcelable(FormInputItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (FormInputState) parcel.readParcelable(FormInputItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FormInputItem[] newArray(int i12) {
            return new FormInputItem[i12];
        }
    }

    public FormInputItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k FormatterType formatterType, @Y61.l Integer num, @Y61.l Integer num2, boolean z12, @Y61.k FormInputState formInputState) {
        this.f281539b = str;
        this.f281540c = str2;
        this.f281541d = str3;
        this.f281542e = str4;
        this.f281543f = formatterType;
        this.f281544g = num;
        this.f281545h = num2;
        this.f281546i = z12;
        this.f281547j = formInputState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormInputItem)) {
            return false;
        }
        FormInputItem formInputItem = (FormInputItem) obj;
        return L.f(this.f281539b, formInputItem.f281539b) && L.f(this.f281540c, formInputItem.f281540c) && L.f(this.f281541d, formInputItem.f281541d) && L.f(this.f281542e, formInputItem.f281542e) && L.f(this.f281543f, formInputItem.f281543f) && L.f(this.f281544g, formInputItem.f281544g) && L.f(this.f281545h, formInputItem.f281545h) && this.f281546i == formInputItem.f281546i && L.f(this.f281547j, formInputItem.f281547j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF189214d() {
        return this.f281539b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f281539b.hashCode() * 31, 31, this.f281540c);
        String str = this.f281541d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f281542e;
        int iHashCode2 = (this.f281543f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.f281544g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f281545h;
        return this.f281547j.hashCode() + r.i((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f281546i);
    }

    @Y61.k
    public final String toString() {
        return "FormInputItem(stringId=" + this.f281539b + ", parameterId=" + this.f281540c + ", value=" + this.f281541d + ", hint=" + this.f281542e + ", formatterType=" + this.f281543f + ", maxLines=" + this.f281544g + ", minLines=" + this.f281545h + ", isEnabled=" + this.f281546i + ", state=" + this.f281547j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281539b);
        parcel.writeString(this.f281540c);
        parcel.writeString(this.f281541d);
        parcel.writeString(this.f281542e);
        parcel.writeParcelable(this.f281543f, i12);
        Integer num = this.f281544g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f281545h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeInt(this.f281546i ? 1 : 0);
        parcel.writeParcelable(this.f281547j, i12);
    }
}
