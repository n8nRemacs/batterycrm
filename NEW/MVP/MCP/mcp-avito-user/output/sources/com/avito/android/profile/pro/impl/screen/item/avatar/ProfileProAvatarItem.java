package com.avito.android.profile.pro.impl.screen.item.avatar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProAvatarItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avatar/ProfileProAvatarItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Type", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProAvatarItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProAvatarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f222981b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f222982c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f222983d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Type f222984e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProAvatarItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avatar/ProfileProAvatarItem$Type;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f222985b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f222986c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f222987d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222988e;

        static {
            Type type = new Type("DEFAULT", 0);
            f222985b = type;
            Type type2 = new Type("EMPLOYEE", 1);
            f222986c = type2;
            Type[] typeArr = {type, type2};
            f222987d = typeArr;
            f222988e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f222987d.clone();
        }
    }

    /* compiled from: ProfileProAvatarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProAvatarItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProAvatarItem createFromParcel(Parcel parcel) {
            return new ProfileProAvatarItem(parcel.readString(), (Image) parcel.readParcelable(ProfileProAvatarItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ProfileProAvatarItem.class.getClassLoader()), Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProAvatarItem[] newArray(int i12) {
            return new ProfileProAvatarItem[i12];
        }
    }

    public ProfileProAvatarItem(@k String str, @k Image image, @l DeepLink deepLink, @k Type type) {
        this.f222981b = str;
        this.f222982c = image;
        this.f222983d = deepLink;
        this.f222984e = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProAvatarItem)) {
            return false;
        }
        ProfileProAvatarItem profileProAvatarItem = (ProfileProAvatarItem) obj;
        return L.f(this.f222981b, profileProAvatarItem.f222981b) && L.f(this.f222982c, profileProAvatarItem.f222982c) && L.f(this.f222983d, profileProAvatarItem.f222983d) && this.f222984e == profileProAvatarItem.f222984e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217979b() {
        return this.f222981b;
    }

    public final int hashCode() {
        int iG2 = com.avito.android.actions_sheet.a.g(this.f222982c, this.f222981b.hashCode() * 31, 31);
        DeepLink deepLink = this.f222983d;
        return this.f222984e.hashCode() + ((iG2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "ProfileProAvatarItem(stringId=" + this.f222981b + ", image=" + this.f222982c + ", uri=" + this.f222983d + ", type=" + this.f222984e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f222981b);
        parcel.writeParcelable(this.f222982c, i12);
        parcel.writeParcelable(this.f222983d, i12);
        parcel.writeString(this.f222984e.name());
    }

    public /* synthetic */ ProfileProAvatarItem(String str, Image image, DeepLink deepLink, Type type, int i12, C42822w c42822w) {
        this(str, image, deepLink, (i12 & 8) != 0 ? Type.f222985b : type);
    }
}
