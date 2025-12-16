package com.avito.android.items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckBoxItemWithText.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/CheckBoxItemWithText;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CheckBoxItemWithText implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CheckBoxItemWithText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f173887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f173888d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173889e;

    /* compiled from: CheckBoxItemWithText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckBoxItemWithText> {
        @Override // android.os.Parcelable.Creator
        public final CheckBoxItemWithText createFromParcel(Parcel parcel) {
            return new CheckBoxItemWithText(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckBoxItemWithText[] newArray(int i12) {
            return new CheckBoxItemWithText[i12];
        }
    }

    public CheckBoxItemWithText(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f173886b = str;
        this.f173887c = str2;
        this.f173888d = str3;
        this.f173889e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBoxItemWithText)) {
            return false;
        }
        CheckBoxItemWithText checkBoxItemWithText = (CheckBoxItemWithText) obj;
        return L.f(this.f173886b, checkBoxItemWithText.f173886b) && L.f(this.f173887c, checkBoxItemWithText.f173887c) && L.f(this.f173888d, checkBoxItemWithText.f173888d) && this.f173889e == checkBoxItemWithText.f173889e;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF95199b() {
        return this.f173886b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173889e) + H.d(H.d(this.f173886b.hashCode() * 31, 31, this.f173887c), 31, this.f173888d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckBoxItemWithText(stringId=");
        sb2.append(this.f173886b);
        sb2.append(", title=");
        sb2.append(this.f173887c);
        sb2.append(", subtitle=");
        sb2.append(this.f173888d);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f173889e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173886b);
        parcel.writeString(this.f173887c);
        parcel.writeString(this.f173888d);
        parcel.writeInt(this.f173889e ? 1 : 0);
    }
}
