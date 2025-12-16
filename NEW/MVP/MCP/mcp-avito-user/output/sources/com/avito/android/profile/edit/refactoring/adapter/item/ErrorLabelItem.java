package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import kotlin.Metadata;

/* compiled from: ErrorLabelItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/ErrorLabelItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ErrorLabelItem implements EditProfileItem {

    @k
    public static final Parcelable.Creator<ErrorLabelItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222249b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f222250c;

    /* compiled from: ErrorLabelItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ErrorLabelItem> {
        @Override // android.os.Parcelable.Creator
        public final ErrorLabelItem createFromParcel(Parcel parcel) {
            return new ErrorLabelItem(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorLabelItem[] newArray(int i12) {
            return new ErrorLabelItem[i12];
        }
    }

    public ErrorLabelItem(long j12, @k String str) {
        this.f222249b = j12;
        this.f222250c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222267b() {
        return this.f222249b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222249b);
        parcel.writeString(this.f222250c);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return false;
    }
}
