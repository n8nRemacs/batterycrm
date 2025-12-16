package com.avito.android.profile.pro.impl.screen.item.reputation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProReputationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/reputation/ProfileProReputationItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "a", "ProfileProReputationItemColor", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProReputationItem implements ParcelableItem {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223441b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f223442c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f223443d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f223444e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ProfileProReputationItemColor f223445f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f223446g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f223447h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Float f223448i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final DeepLink f223449j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f223440k = new a(null);

    @k
    public static final Parcelable.Creator<ProfileProReputationItem> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProReputationItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/reputation/ProfileProReputationItem$ProfileProReputationItemColor;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileProReputationItemColor {

        /* renamed from: b, reason: collision with root package name */
        public static final ProfileProReputationItemColor f223450b;

        /* renamed from: c, reason: collision with root package name */
        public static final ProfileProReputationItemColor f223451c;

        /* renamed from: d, reason: collision with root package name */
        public static final ProfileProReputationItemColor f223452d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ProfileProReputationItemColor[] f223453e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f223454f;

        static {
            ProfileProReputationItemColor profileProReputationItemColor = new ProfileProReputationItemColor("RED", 0);
            f223450b = profileProReputationItemColor;
            ProfileProReputationItemColor profileProReputationItemColor2 = new ProfileProReputationItemColor("YELLOW", 1);
            f223451c = profileProReputationItemColor2;
            ProfileProReputationItemColor profileProReputationItemColor3 = new ProfileProReputationItemColor("GREEN", 2);
            f223452d = profileProReputationItemColor3;
            ProfileProReputationItemColor[] profileProReputationItemColorArr = {profileProReputationItemColor, profileProReputationItemColor2, profileProReputationItemColor3};
            f223453e = profileProReputationItemColorArr;
            f223454f = kotlin.enums.c.a(profileProReputationItemColorArr);
        }

        public ProfileProReputationItemColor() {
            throw null;
        }

        public static ProfileProReputationItemColor valueOf(String str) {
            return (ProfileProReputationItemColor) Enum.valueOf(ProfileProReputationItemColor.class, str);
        }

        public static ProfileProReputationItemColor[] values() {
            return (ProfileProReputationItemColor[]) f223453e.clone();
        }
    }

    /* compiled from: ProfileProReputationItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/reputation/ProfileProReputationItem$a;", "", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProfileProReputationItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.pro.impl.screen.item.reputation.ProfileProReputationItem$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6765a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f223455a;

            static {
                int[] iArr = new int[ProfileTabWidget.ReputationAndRating.RepColor.values().length];
                try {
                    ProfileTabWidget.ReputationAndRating.RepColor repColor = ProfileTabWidget.ReputationAndRating.RepColor.f222760b;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ProfileTabWidget.ReputationAndRating.RepColor repColor2 = ProfileTabWidget.ReputationAndRating.RepColor.f222760b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f223455a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProReputationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileProReputationItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProReputationItem createFromParcel(Parcel parcel) {
            return new ProfileProReputationItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ProfileProReputationItemColor.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(ProfileProReputationItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (DeepLink) parcel.readParcelable(ProfileProReputationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProReputationItem[] newArray(int i12) {
            return new ProfileProReputationItem[i12];
        }
    }

    public ProfileProReputationItem(@k String str, @k String str2, boolean z12, @l Integer num, @l ProfileProReputationItemColor profileProReputationItemColor, @k DeepLink deepLink, @k String str3, @l Float f12, @k DeepLink deepLink2) {
        this.f223441b = str;
        this.f223442c = str2;
        this.f223443d = z12;
        this.f223444e = num;
        this.f223445f = profileProReputationItemColor;
        this.f223446g = deepLink;
        this.f223447h = str3;
        this.f223448i = f12;
        this.f223449j = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProReputationItem)) {
            return false;
        }
        ProfileProReputationItem profileProReputationItem = (ProfileProReputationItem) obj;
        return L.f(this.f223441b, profileProReputationItem.f223441b) && L.f(this.f223442c, profileProReputationItem.f223442c) && this.f223443d == profileProReputationItem.f223443d && L.f(this.f223444e, profileProReputationItem.f223444e) && this.f223445f == profileProReputationItem.f223445f && L.f(this.f223446g, profileProReputationItem.f223446g) && L.f(this.f223447h, profileProReputationItem.f223447h) && L.f(this.f223448i, profileProReputationItem.f223448i) && L.f(this.f223449j, profileProReputationItem.f223449j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75423l() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75424m() {
        return this.f223441b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f223441b.hashCode() * 31, 31, this.f223442c), 31, this.f223443d);
        Integer num = this.f223444e;
        int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        ProfileProReputationItemColor profileProReputationItemColor = this.f223445f;
        int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.f223446g, (iHashCode + (profileProReputationItemColor == null ? 0 : profileProReputationItemColor.hashCode())) * 31, 31), 31, this.f223447h);
        Float f12 = this.f223448i;
        return this.f223449j.hashCode() + ((iD2 + (f12 != null ? f12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProReputationItem(stringId=");
        sb2.append(this.f223441b);
        sb2.append(", reputationWidgetText=");
        sb2.append(this.f223442c);
        sb2.append(", showReputationBadge=");
        sb2.append(this.f223443d);
        sb2.append(", reputationScore=");
        sb2.append(this.f223444e);
        sb2.append(", reputationColor=");
        sb2.append(this.f223445f);
        sb2.append(", reputationUri=");
        sb2.append(this.f223446g);
        sb2.append(", ratingWidgetText=");
        sb2.append(this.f223447h);
        sb2.append(", ratingScore=");
        sb2.append(this.f223448i);
        sb2.append(", ratingUri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f223449j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223441b);
        parcel.writeString(this.f223442c);
        parcel.writeInt(this.f223443d ? 1 : 0);
        Integer num = this.f223444e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ProfileProReputationItemColor profileProReputationItemColor = this.f223445f;
        if (profileProReputationItemColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(profileProReputationItemColor.name());
        }
        parcel.writeParcelable(this.f223446g, i12);
        parcel.writeString(this.f223447h);
        Float f12 = this.f223448i;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.f223449j, i12);
    }
}
