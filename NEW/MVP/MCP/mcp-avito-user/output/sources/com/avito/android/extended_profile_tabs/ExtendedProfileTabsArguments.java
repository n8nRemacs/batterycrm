package com.avito.android.extended_profile_tabs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments;", "Landroid/os/Parcelable;", "ExtendedProfileTab", "_avito_extended-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileTabsArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileTabsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileTab f153126b;

    /* compiled from: ExtendedProfileTabsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileTabsArguments> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileTabsArguments createFromParcel(Parcel parcel) {
            return new ExtendedProfileTabsArguments((ExtendedProfileTab) parcel.readParcelable(ExtendedProfileTabsArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileTabsArguments[] newArray(int i12) {
            return new ExtendedProfileTabsArguments[i12];
        }
    }

    public ExtendedProfileTabsArguments(@Y61.k ExtendedProfileTab extendedProfileTab) {
        this.f153126b = extendedProfileTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtendedProfileTabsArguments) && L.f(this.f153126b, ((ExtendedProfileTabsArguments) obj).f153126b);
    }

    public final int hashCode() {
        return this.f153126b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileTabsArguments(tab=" + this.f153126b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f153126b, i12);
    }

    /* compiled from: ExtendedProfileTabsArguments.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab;", "Landroid/os/Parcelable;", "Profile", "Rating", "Search", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Profile;", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Rating;", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Search;", "_avito_extended-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ExtendedProfileTab extends Parcelable {

        /* compiled from: ExtendedProfileTabsArguments.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Rating;", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab;", "_avito_extended-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Rating implements ExtendedProfileTab {

            @Y61.k
            public static final Parcelable.Creator<Rating> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f153131b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f153132c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f153133d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final Long f153134e;

            /* compiled from: ExtendedProfileTabsArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Rating> {
                @Override // android.os.Parcelable.Creator
                public final Rating createFromParcel(Parcel parcel) {
                    return new Rating(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                @Override // android.os.Parcelable.Creator
                public final Rating[] newArray(int i12) {
                    return new Rating[i12];
                }
            }

            public Rating(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12) {
                this.f153131b = str;
                this.f153132c = str2;
                this.f153133d = str3;
                this.f153134e = l12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Rating)) {
                    return false;
                }
                Rating rating = (Rating) obj;
                return L.f(this.f153131b, rating.f153131b) && L.f(this.f153132c, rating.f153132c) && L.f(this.f153133d, rating.f153133d) && L.f(this.f153134e, rating.f153134e);
            }

            public final int hashCode() {
                int iHashCode = this.f153131b.hashCode() * 31;
                String str = this.f153132c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f153133d;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l12 = this.f153134e;
                return iHashCode3 + (l12 != null ? l12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Rating(userKey=");
                sb2.append(this.f153131b);
                sb2.append(", contextId=");
                sb2.append(this.f153132c);
                sb2.append(", srcRole=");
                sb2.append(this.f153133d);
                sb2.append(", fromItem=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f153134e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f153131b);
                parcel.writeString(this.f153132c);
                parcel.writeString(this.f153133d);
                Long l12 = this.f153134e;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
            }
        }

        /* compiled from: ExtendedProfileTabsArguments.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Search;", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab;", "_avito_extended-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Search implements ExtendedProfileTab {

            @Y61.k
            public static final Parcelable.Creator<Search> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f153135b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f153136c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final SearchParams f153137d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f153138e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f153139f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final ExtendedProfileSerpStartMode f153140g;

            /* compiled from: ExtendedProfileTabsArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Search> {
                @Override // android.os.Parcelable.Creator
                public final Search createFromParcel(Parcel parcel) {
                    return new Search(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(Search.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, ExtendedProfileSerpStartMode.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Search[] newArray(int i12) {
                    return new Search[i12];
                }
            }

            public Search(@Y61.k String str, @Y61.l String str2, @Y61.k SearchParams searchParams, @Y61.l String str3, boolean z12, @Y61.k ExtendedProfileSerpStartMode extendedProfileSerpStartMode) {
                this.f153135b = str;
                this.f153136c = str2;
                this.f153137d = searchParams;
                this.f153138e = str3;
                this.f153139f = z12;
                this.f153140g = extendedProfileSerpStartMode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Search)) {
                    return false;
                }
                Search search = (Search) obj;
                return L.f(this.f153135b, search.f153135b) && L.f(this.f153136c, search.f153136c) && L.f(this.f153137d, search.f153137d) && L.f(this.f153138e, search.f153138e) && this.f153139f == search.f153139f && this.f153140g == search.f153140g;
            }

            public final int hashCode() {
                int iHashCode = this.f153135b.hashCode() * 31;
                String str = this.f153136c;
                int iHashCode2 = (this.f153137d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.f153138e;
                return this.f153140g.hashCode() + r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f153139f);
            }

            @Y61.k
            public final String toString() {
                return "Search(userKey=" + this.f153135b + ", context=" + this.f153136c + ", searchParams=" + this.f153137d + ", source=" + this.f153138e + ", skipBackToProfile=" + this.f153139f + ", startMode=" + this.f153140g + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f153135b);
                parcel.writeString(this.f153136c);
                parcel.writeParcelable(this.f153137d, i12);
                parcel.writeString(this.f153138e);
                parcel.writeInt(this.f153139f ? 1 : 0);
                parcel.writeString(this.f153140g.name());
            }
        }

        /* compiled from: ExtendedProfileTabsArguments.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab$Profile;", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments$ExtendedProfileTab;", "_avito_extended-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Profile implements ExtendedProfileTab {

            @Y61.k
            public static final Parcelable.Creator<Profile> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f153127b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f153128c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final SearchParams f153129d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final FloatingBuyBlock f153130e;

            /* compiled from: ExtendedProfileTabsArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Profile> {
                @Override // android.os.Parcelable.Creator
                public final Profile createFromParcel(Parcel parcel) {
                    return new Profile(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(Profile.class.getClassLoader()), (FloatingBuyBlock) parcel.readParcelable(Profile.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Profile[] newArray(int i12) {
                    return new Profile[i12];
                }
            }

            public Profile(@Y61.k String str, @Y61.l String str2, @Y61.l SearchParams searchParams, @Y61.l FloatingBuyBlock floatingBuyBlock) {
                this.f153127b = str;
                this.f153128c = str2;
                this.f153129d = searchParams;
                this.f153130e = floatingBuyBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Profile)) {
                    return false;
                }
                Profile profile = (Profile) obj;
                return L.f(this.f153127b, profile.f153127b) && L.f(this.f153128c, profile.f153128c) && L.f(this.f153129d, profile.f153129d) && L.f(this.f153130e, profile.f153130e);
            }

            public final int hashCode() {
                int iHashCode = this.f153127b.hashCode() * 31;
                String str = this.f153128c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                SearchParams searchParams = this.f153129d;
                int iHashCode3 = (iHashCode2 + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
                FloatingBuyBlock floatingBuyBlock = this.f153130e;
                return iHashCode3 + (floatingBuyBlock != null ? floatingBuyBlock.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "Profile(userKey=" + this.f153127b + ", contextId=" + this.f153128c + ", searchParams=" + this.f153129d + ", floatingBuyBlock=" + this.f153130e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f153127b);
                parcel.writeString(this.f153128c);
                parcel.writeParcelable(this.f153129d, i12);
                parcel.writeParcelable(this.f153130e, i12);
            }

            public /* synthetic */ Profile(String str, String str2, SearchParams searchParams, FloatingBuyBlock floatingBuyBlock, int i12, C42822w c42822w) {
                this(str, str2, searchParams, (i12 & 8) != 0 ? null : floatingBuyBlock);
            }
        }
    }
}
