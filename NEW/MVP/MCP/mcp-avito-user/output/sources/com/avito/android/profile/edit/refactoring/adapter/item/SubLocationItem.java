package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.remote.model.NameIdEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p90.InterfaceC46923a;

/* compiled from: SubLocationItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/SubLocationItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lp90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SubLocationItem implements EditProfileItem, InterfaceC46923a {

    @k
    public static final Parcelable.Creator<SubLocationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f222263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222264d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final NameIdEntity f222265e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f222266f;

    /* compiled from: SubLocationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubLocationItem> {
        @Override // android.os.Parcelable.Creator
        public final SubLocationItem createFromParcel(Parcel parcel) {
            return new SubLocationItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (NameIdEntity) parcel.readParcelable(SubLocationItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SubLocationItem[] newArray(int i12) {
            return new SubLocationItem[i12];
        }
    }

    public SubLocationItem(long j12, @k String str, int i12, @l NameIdEntity nameIdEntity, boolean z12) {
        this.f222262b = j12;
        this.f222263c = str;
        this.f222264d = i12;
        this.f222265e = nameIdEntity;
        this.f222266f = z12;
    }

    @Override // p90.InterfaceC46923a
    @k
    public final EditProfileItem a(boolean z12) {
        return new SubLocationItem(this.f222262b, this.f222263c, this.f222264d, this.f222265e, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p90.InterfaceC46923a
    /* renamed from: getHasError, reason: from getter */
    public final boolean getF222266f() {
        return this.f222266f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222255b() {
        return this.f222262b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222262b);
        parcel.writeString(this.f222263c);
        parcel.writeInt(this.f222264d);
        parcel.writeParcelable(this.f222265e, i12);
        parcel.writeInt(this.f222266f ? 1 : 0);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return true;
    }

    public /* synthetic */ SubLocationItem(long j12, String str, int i12, NameIdEntity nameIdEntity, boolean z12, int i13, C42822w c42822w) {
        this(j12, str, i12, nameIdEntity, (i13 & 16) != 0 ? false : z12);
    }
}
