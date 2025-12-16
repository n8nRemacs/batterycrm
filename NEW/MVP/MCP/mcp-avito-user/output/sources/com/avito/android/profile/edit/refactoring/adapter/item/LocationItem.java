package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p90.InterfaceC46923a;

/* compiled from: LocationItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/LocationItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lp90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LocationItem implements EditProfileItem, InterfaceC46923a {

    @k
    public static final Parcelable.Creator<LocationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222255b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Location f222256c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f222257d;

    /* compiled from: LocationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationItem> {
        @Override // android.os.Parcelable.Creator
        public final LocationItem createFromParcel(Parcel parcel) {
            return new LocationItem(parcel.readLong(), (Location) parcel.readParcelable(LocationItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationItem[] newArray(int i12) {
            return new LocationItem[i12];
        }
    }

    public LocationItem(long j12, @l Location location, boolean z12) {
        this.f222255b = j12;
        this.f222256c = location;
        this.f222257d = z12;
    }

    @Override // p90.InterfaceC46923a
    @k
    public final EditProfileItem a(boolean z12) {
        return new LocationItem(this.f222255b, this.f222256c, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p90.InterfaceC46923a
    /* renamed from: getHasError, reason: from getter */
    public final boolean getF222266f() {
        return this.f222257d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222262b() {
        return this.f222255b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222255b);
        parcel.writeParcelable(this.f222256c, i12);
        parcel.writeInt(this.f222257d ? 1 : 0);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return true;
    }

    public /* synthetic */ LocationItem(long j12, Location location, boolean z12, int i12, C42822w c42822w) {
        this(j12, location, (i12 & 4) != 0 ? false : z12);
    }
}
