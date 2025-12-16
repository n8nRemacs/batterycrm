package com.avito.android.profile.edit.refactoring.adapter.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvatarItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/item/AvatarItem;", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AvatarItem implements EditProfileItem {

    @k
    public static final Parcelable.Creator<AvatarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f222246b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ProfileAvatar f222247c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f222248d;

    /* compiled from: AvatarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvatarItem> {
        @Override // android.os.Parcelable.Creator
        public final AvatarItem createFromParcel(Parcel parcel) {
            return new AvatarItem(parcel.readLong(), (ProfileAvatar) parcel.readParcelable(AvatarItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarItem[] newArray(int i12) {
            return new AvatarItem[i12];
        }
    }

    public AvatarItem(long j12, @l ProfileAvatar profileAvatar, boolean z12) {
        this.f222246b = j12;
        this.f222247c = profileAvatar;
        this.f222248d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222246b() {
        return this.f222246b;
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean k4() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f222246b);
        parcel.writeParcelable(this.f222247c, i12);
        parcel.writeInt(this.f222248d ? 1 : 0);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.EditProfileItem
    public final boolean z2() {
        return false;
    }

    public /* synthetic */ AvatarItem(long j12, ProfileAvatar profileAvatar, boolean z12, int i12, C42822w c42822w) {
        this(j12, profileAvatar, (i12 & 4) != 0 ? false : z12);
    }
}
