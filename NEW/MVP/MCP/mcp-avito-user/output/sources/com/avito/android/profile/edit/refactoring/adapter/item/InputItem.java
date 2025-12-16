package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p90.InterfaceC46923a;

/* compiled from: InputItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/InputItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lp90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InputItem implements EditProfileItem, InterfaceC46923a {

    @k
    public static final Parcelable.Creator<InputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222251b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f222252c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f222253d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222254e;

    /* compiled from: InputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputItem> {
        @Override // android.os.Parcelable.Creator
        public final InputItem createFromParcel(Parcel parcel) {
            return new InputItem(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InputItem[] newArray(int i12) {
            return new InputItem[i12];
        }
    }

    public InputItem(long j12, boolean z12, @k String str, @k String str2) {
        this.f222251b = j12;
        this.f222252c = str;
        this.f222253d = str2;
        this.f222254e = z12;
    }

    @Override // p90.InterfaceC46923a
    @k
    public final EditProfileItem a(boolean z12) {
        return new InputItem(this.f222251b, z12, this.f222252c, this.f222253d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p90.InterfaceC46923a
    /* renamed from: getHasError, reason: from getter */
    public final boolean getF222254e() {
        return this.f222254e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222251b() {
        return this.f222251b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222251b);
        parcel.writeString(this.f222252c);
        parcel.writeString(this.f222253d);
        parcel.writeInt(this.f222254e ? 1 : 0);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return true;
    }

    public /* synthetic */ InputItem(long j12, String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(j12, (i12 & 8) != 0 ? false : z12, str, str2);
    }
}
