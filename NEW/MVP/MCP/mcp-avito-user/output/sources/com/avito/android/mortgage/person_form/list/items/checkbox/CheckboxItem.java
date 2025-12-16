package com.avito.android.mortgage.person_form.list.items.checkbox;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/checkbox/CheckboxItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CheckboxItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<CheckboxItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200592b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200593c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200594d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f200595e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f200596f;

    /* compiled from: CheckboxItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckboxItem> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxItem createFromParcel(Parcel parcel) {
            return new CheckboxItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxItem[] newArray(int i12) {
            return new CheckboxItem[i12];
        }
    }

    public CheckboxItem(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
        this.f200592b = str;
        this.f200593c = str2;
        this.f200594d = z12;
        this.f200595e = str3;
        this.f200596f = z13;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new CheckboxItem(this.f200592b, this.f200593c, this.f200594d, this.f200595e, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckboxItem)) {
            return false;
        }
        CheckboxItem checkboxItem = (CheckboxItem) obj;
        return L.f(this.f200592b, checkboxItem.f200592b) && L.f(this.f200593c, checkboxItem.f200593c) && this.f200594d == checkboxItem.f200594d && L.f(this.f200595e, checkboxItem.f200595e) && this.f200596f == checkboxItem.f200596f;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200731e() {
        return this.f200596f;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162964b() {
        return this.f200592b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200596f) + H.d(r.i(H.d(this.f200592b.hashCode() * 31, 31, this.f200593c), 31, this.f200594d), 31, this.f200595e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxItem(stringId=");
        sb2.append(this.f200592b);
        sb2.append(", name=");
        sb2.append(this.f200593c);
        sb2.append(", checked=");
        sb2.append(this.f200594d);
        sb2.append(", title=");
        sb2.append(this.f200595e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200596f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200592b);
        parcel.writeString(this.f200593c);
        parcel.writeInt(this.f200594d ? 1 : 0);
        parcel.writeString(this.f200595e);
        parcel.writeInt(this.f200596f ? 1 : 0);
    }

    public /* synthetic */ CheckboxItem(String str, String str2, boolean z12, String str3, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, (i12 & 16) != 0 ? true : z13);
    }
}
