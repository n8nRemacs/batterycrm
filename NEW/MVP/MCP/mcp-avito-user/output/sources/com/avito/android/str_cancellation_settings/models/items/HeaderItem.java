package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/HeaderItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeaderItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288417b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288418c;

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            return new HeaderItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i12) {
            return new HeaderItem[i12];
        }
    }

    public HeaderItem(@k String str, @k String str2) {
        this.f288417b = str;
        this.f288418c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) obj;
        return L.f(this.f288417b, headerItem.f288417b) && L.f(this.f288418c, headerItem.f288418c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF288417b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288417b() {
        return this.f288417b;
    }

    public final int hashCode() {
        return this.f288418c.hashCode() + (this.f288417b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f288417b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f288418c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288417b);
        parcel.writeString(this.f288418c);
    }
}
