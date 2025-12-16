package com.avito.android.profile.pro.impl.screen.item.employee.mode;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProEmployeeModeButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/mode/ProfileProEmployeeModeButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProEmployeeModeButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProEmployeeModeButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f223241c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f223242d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f223243e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f223244f;

    /* compiled from: ProfileProEmployeeModeButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProEmployeeModeButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeModeButtonItem createFromParcel(Parcel parcel) {
            return new ProfileProEmployeeModeButtonItem((AttributedText) parcel.readParcelable(ProfileProEmployeeModeButtonItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeModeButtonItem[] newArray(int i12) {
            return new ProfileProEmployeeModeButtonItem[i12];
        }
    }

    public ProfileProEmployeeModeButtonItem(@k AttributedText attributedText, @k String str, @k String str2, @k String str3, boolean z12) {
        this.f223240b = str;
        this.f223241c = z12;
        this.f223242d = str2;
        this.f223243e = str3;
        this.f223244f = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProEmployeeModeButtonItem)) {
            return false;
        }
        ProfileProEmployeeModeButtonItem profileProEmployeeModeButtonItem = (ProfileProEmployeeModeButtonItem) obj;
        return L.f(this.f223240b, profileProEmployeeModeButtonItem.f223240b) && this.f223241c == profileProEmployeeModeButtonItem.f223241c && L.f(this.f223242d, profileProEmployeeModeButtonItem.f223242d) && L.f(this.f223243e, profileProEmployeeModeButtonItem.f223243e) && L.f(this.f223244f, profileProEmployeeModeButtonItem.f223244f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213498b() {
        return this.f223240b;
    }

    public final int hashCode() {
        return this.f223244f.hashCode() + H.d(H.d(r.i(this.f223240b.hashCode() * 31, 31, this.f223241c), 31, this.f223242d), 31, this.f223243e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProEmployeeModeButtonItem(stringId=");
        sb2.append(this.f223240b);
        sb2.append(", isOnEmployeeMode=");
        sb2.append(this.f223241c);
        sb2.append(", title=");
        sb2.append(this.f223242d);
        sb2.append(", subtitle=");
        sb2.append(this.f223243e);
        sb2.append(", icon=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f223244f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223240b);
        parcel.writeInt(this.f223241c ? 1 : 0);
        parcel.writeString(this.f223242d);
        parcel.writeString(this.f223243e);
        parcel.writeParcelable(this.f223244f, i12);
    }
}
