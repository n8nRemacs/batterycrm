package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p90.InterfaceC46923a;

/* compiled from: PhoneInputItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/PhoneInputItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lp90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneInputItem implements EditProfileItem, InterfaceC46923a {

    @k
    public static final Parcelable.Creator<PhoneInputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222258b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f222259c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f222260d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222261e;

    /* compiled from: PhoneInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneInputItem> {
        @Override // android.os.Parcelable.Creator
        public final PhoneInputItem createFromParcel(Parcel parcel) {
            return new PhoneInputItem(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneInputItem[] newArray(int i12) {
            return new PhoneInputItem[i12];
        }
    }

    public PhoneInputItem(long j12, boolean z12, @k String str, @k String str2) {
        this.f222258b = j12;
        this.f222259c = str;
        this.f222260d = str2;
        this.f222261e = z12;
    }

    @Override // p90.InterfaceC46923a
    @k
    public final EditProfileItem a(boolean z12) {
        return new PhoneInputItem(this.f222258b, z12, this.f222259c, this.f222260d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p90.InterfaceC46923a
    /* renamed from: getHasError, reason: from getter */
    public final boolean getF222261e() {
        return this.f222261e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222258b() {
        return this.f222258b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222258b);
        parcel.writeString(this.f222259c);
        parcel.writeString(this.f222260d);
        parcel.writeInt(this.f222261e ? 1 : 0);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return true;
    }

    public /* synthetic */ PhoneInputItem(long j12, String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(j12, (i12 & 8) != 0 ? false : z12, str, str2);
    }
}
