package com.avito.android.profile.user_profile.cards.passport;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.user_profile.ReputationAndRating;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReputationAndRatingCard.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/ReputationAndRatingCard;", "Landroid/os/Parcelable;", "a", "ProfileProReputationItemColor", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReputationAndRatingCard implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f225119b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f225120c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f225121d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ProfileProReputationItemColor f225122e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f225123f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f225124g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Float f225125h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f225126i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f225118j = new a(null);

    @k
    public static final Parcelable.Creator<ReputationAndRatingCard> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReputationAndRatingCard.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/ReputationAndRatingCard$ProfileProReputationItemColor;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileProReputationItemColor {

        /* renamed from: b, reason: collision with root package name */
        public static final ProfileProReputationItemColor f225127b;

        /* renamed from: c, reason: collision with root package name */
        public static final ProfileProReputationItemColor f225128c;

        /* renamed from: d, reason: collision with root package name */
        public static final ProfileProReputationItemColor f225129d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ProfileProReputationItemColor[] f225130e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f225131f;

        static {
            ProfileProReputationItemColor profileProReputationItemColor = new ProfileProReputationItemColor("RED", 0);
            f225127b = profileProReputationItemColor;
            ProfileProReputationItemColor profileProReputationItemColor2 = new ProfileProReputationItemColor("YELLOW", 1);
            f225128c = profileProReputationItemColor2;
            ProfileProReputationItemColor profileProReputationItemColor3 = new ProfileProReputationItemColor("GREEN", 2);
            f225129d = profileProReputationItemColor3;
            ProfileProReputationItemColor[] profileProReputationItemColorArr = {profileProReputationItemColor, profileProReputationItemColor2, profileProReputationItemColor3};
            f225130e = profileProReputationItemColorArr;
            f225131f = kotlin.enums.c.a(profileProReputationItemColorArr);
        }

        public ProfileProReputationItemColor() {
            throw null;
        }

        public static ProfileProReputationItemColor valueOf(String str) {
            return (ProfileProReputationItemColor) Enum.valueOf(ProfileProReputationItemColor.class, str);
        }

        public static ProfileProReputationItemColor[] values() {
            return (ProfileProReputationItemColor[]) f225130e.clone();
        }
    }

    /* compiled from: ReputationAndRatingCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/ReputationAndRatingCard$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReputationAndRatingCard.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.user_profile.cards.passport.ReputationAndRatingCard$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6823a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f225132a;

            static {
                int[] iArr = new int[ReputationAndRating.ReputationColor.values().length];
                try {
                    iArr[ReputationAndRating.ReputationColor.GREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReputationAndRating.ReputationColor.YELLOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f225132a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReputationAndRatingCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ReputationAndRatingCard> {
        @Override // android.os.Parcelable.Creator
        public final ReputationAndRatingCard createFromParcel(Parcel parcel) {
            return new ReputationAndRatingCard(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ProfileProReputationItemColor.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(ReputationAndRatingCard.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (DeepLink) parcel.readParcelable(ReputationAndRatingCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReputationAndRatingCard[] newArray(int i12) {
            return new ReputationAndRatingCard[i12];
        }
    }

    public ReputationAndRatingCard(@k String str, boolean z12, @l Integer num, @l ProfileProReputationItemColor profileProReputationItemColor, @k DeepLink deepLink, @k String str2, @l Float f12, @k DeepLink deepLink2) {
        this.f225119b = str;
        this.f225120c = z12;
        this.f225121d = num;
        this.f225122e = profileProReputationItemColor;
        this.f225123f = deepLink;
        this.f225124g = str2;
        this.f225125h = f12;
        this.f225126i = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReputationAndRatingCard)) {
            return false;
        }
        ReputationAndRatingCard reputationAndRatingCard = (ReputationAndRatingCard) obj;
        return L.f(this.f225119b, reputationAndRatingCard.f225119b) && this.f225120c == reputationAndRatingCard.f225120c && L.f(this.f225121d, reputationAndRatingCard.f225121d) && this.f225122e == reputationAndRatingCard.f225122e && L.f(this.f225123f, reputationAndRatingCard.f225123f) && L.f(this.f225124g, reputationAndRatingCard.f225124g) && L.f(this.f225125h, reputationAndRatingCard.f225125h) && L.f(this.f225126i, reputationAndRatingCard.f225126i);
    }

    public final int hashCode() {
        int i12 = r.i(this.f225119b.hashCode() * 31, 31, this.f225120c);
        Integer num = this.f225121d;
        int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        ProfileProReputationItemColor profileProReputationItemColor = this.f225122e;
        int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.f225123f, (iHashCode + (profileProReputationItemColor == null ? 0 : profileProReputationItemColor.hashCode())) * 31, 31), 31, this.f225124g);
        Float f12 = this.f225125h;
        return this.f225126i.hashCode() + ((iD2 + (f12 != null ? f12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReputationAndRatingCard(reputationWidgetText=");
        sb2.append(this.f225119b);
        sb2.append(", showReputationBadge=");
        sb2.append(this.f225120c);
        sb2.append(", reputationScore=");
        sb2.append(this.f225121d);
        sb2.append(", reputationColor=");
        sb2.append(this.f225122e);
        sb2.append(", reputationUri=");
        sb2.append(this.f225123f);
        sb2.append(", ratingWidgetText=");
        sb2.append(this.f225124g);
        sb2.append(", ratingScore=");
        sb2.append(this.f225125h);
        sb2.append(", ratingUri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f225126i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f225119b);
        parcel.writeInt(this.f225120c ? 1 : 0);
        Integer num = this.f225121d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ProfileProReputationItemColor profileProReputationItemColor = this.f225122e;
        if (profileProReputationItemColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(profileProReputationItemColor.name());
        }
        parcel.writeParcelable(this.f225123f, i12);
        parcel.writeString(this.f225124g);
        Float f12 = this.f225125h;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.f225126i, i12);
    }
}
