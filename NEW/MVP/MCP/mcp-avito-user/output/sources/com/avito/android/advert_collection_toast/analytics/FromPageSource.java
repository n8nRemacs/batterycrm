package com.avito.android.advert_collection_toast.analytics;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FromPageSource.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0013\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "Landroid/os/Parcelable;", "Advert", "AdvertCollection", "AdvertCollectionList", "AppLink", "BXContent", "a", "ExtendedProfile", "FavoriteSellers", "Favorites", "GroupingAdverts", "JobMyApplies", "Main", "NewsFeed", "NotificationCenterLanding", "PhotoGallery", "Serp", "SimilarAdverts", "SoccomGroup", "TravelSearch", "Vertical", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Advert;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AdvertCollection;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AdvertCollectionList;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AppLink;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$BXContent;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$ExtendedProfile;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$FavoriteSellers;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Favorites;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$GroupingAdverts;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$JobMyApplies;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Main;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$NewsFeed;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$NotificationCenterLanding;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$PhotoGallery;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Serp;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$SimilarAdverts;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$SoccomGroup;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$TravelSearch;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Vertical;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class FromPageSource implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82321b;

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Advert;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Advert extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Advert f82322c = new Advert();

        @k
        public static final Parcelable.Creator<Advert> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advert> {
            @Override // android.os.Parcelable.Creator
            public final Advert createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Advert.f82322c;
            }

            @Override // android.os.Parcelable.Creator
            public final Advert[] newArray(int i12) {
                return new Advert[i12];
            }
        }

        public Advert() {
            super("advert", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AdvertCollection;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertCollection extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final AdvertCollection f82323c = new AdvertCollection();

        @k
        public static final Parcelable.Creator<AdvertCollection> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertCollection> {
            @Override // android.os.Parcelable.Creator
            public final AdvertCollection createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AdvertCollection.f82323c;
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertCollection[] newArray(int i12) {
                return new AdvertCollection[i12];
            }
        }

        public AdvertCollection() {
            super("favorite-collection", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AdvertCollectionList;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertCollectionList extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final AdvertCollectionList f82324c = new AdvertCollectionList();

        @k
        public static final Parcelable.Creator<AdvertCollectionList> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertCollectionList> {
            @Override // android.os.Parcelable.Creator
            public final AdvertCollectionList createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AdvertCollectionList.f82324c;
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertCollectionList[] newArray(int i12) {
                return new AdvertCollectionList[i12];
            }
        }

        public AdvertCollectionList() {
            super("favorite-collections", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$AppLink;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppLink extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final AppLink f82325c = new AppLink();

        @k
        public static final Parcelable.Creator<AppLink> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AppLink> {
            @Override // android.os.Parcelable.Creator
            public final AppLink createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AppLink.f82325c;
            }

            @Override // android.os.Parcelable.Creator
            public final AppLink[] newArray(int i12) {
                return new AppLink[i12];
            }
        }

        public AppLink() {
            super("link", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$BXContent;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BXContent extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final BXContent f82326c = new BXContent();

        @k
        public static final Parcelable.Creator<BXContent> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BXContent> {
            @Override // android.os.Parcelable.Creator
            public final BXContent createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BXContent.f82326c;
            }

            @Override // android.os.Parcelable.Creator
            public final BXContent[] newArray(int i12) {
                return new BXContent[i12];
            }
        }

        public BXContent() {
            super("bxcontent", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$ExtendedProfile;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExtendedProfile extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final ExtendedProfile f82327c = new ExtendedProfile();

        @k
        public static final Parcelable.Creator<ExtendedProfile> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExtendedProfile> {
            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ExtendedProfile.f82327c;
            }

            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile[] newArray(int i12) {
                return new ExtendedProfile[i12];
            }
        }

        public ExtendedProfile() {
            super("extended_profile", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$FavoriteSellers;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FavoriteSellers extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final FavoriteSellers f82328c = new FavoriteSellers();

        @k
        public static final Parcelable.Creator<FavoriteSellers> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FavoriteSellers> {
            @Override // android.os.Parcelable.Creator
            public final FavoriteSellers createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FavoriteSellers.f82328c;
            }

            @Override // android.os.Parcelable.Creator
            public final FavoriteSellers[] newArray(int i12) {
                return new FavoriteSellers[i12];
            }
        }

        public FavoriteSellers() {
            super("favorite_sellers", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Favorites;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Favorites extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Favorites f82329c = new Favorites();

        @k
        public static final Parcelable.Creator<Favorites> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Favorites> {
            @Override // android.os.Parcelable.Creator
            public final Favorites createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Favorites.f82329c;
            }

            @Override // android.os.Parcelable.Creator
            public final Favorites[] newArray(int i12) {
                return new Favorites[i12];
            }
        }

        public Favorites() {
            super("favorites", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$GroupingAdverts;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GroupingAdverts extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final GroupingAdverts f82330c = new GroupingAdverts();

        @k
        public static final Parcelable.Creator<GroupingAdverts> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GroupingAdverts> {
            @Override // android.os.Parcelable.Creator
            public final GroupingAdverts createFromParcel(Parcel parcel) {
                parcel.readInt();
                return GroupingAdverts.f82330c;
            }

            @Override // android.os.Parcelable.Creator
            public final GroupingAdverts[] newArray(int i12) {
                return new GroupingAdverts[i12];
            }
        }

        public GroupingAdverts() {
            super("grouping_adverts", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$JobMyApplies;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JobMyApplies extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final JobMyApplies f82331c = new JobMyApplies();

        @k
        public static final Parcelable.Creator<JobMyApplies> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<JobMyApplies> {
            @Override // android.os.Parcelable.Creator
            public final JobMyApplies createFromParcel(Parcel parcel) {
                parcel.readInt();
                return JobMyApplies.f82331c;
            }

            @Override // android.os.Parcelable.Creator
            public final JobMyApplies[] newArray(int i12) {
                return new JobMyApplies[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JobMyApplies() {
            super("job_my_applies", null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Main;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Main extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Main f82332c = new Main();

        @k
        public static final Parcelable.Creator<Main> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Main> {
            @Override // android.os.Parcelable.Creator
            public final Main createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Main.f82332c;
            }

            @Override // android.os.Parcelable.Creator
            public final Main[] newArray(int i12) {
                return new Main[i12];
            }
        }

        public Main() {
            super("main", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$NewsFeed;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NewsFeed extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final NewsFeed f82333c = new NewsFeed();

        @k
        public static final Parcelable.Creator<NewsFeed> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NewsFeed> {
            @Override // android.os.Parcelable.Creator
            public final NewsFeed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewsFeed.f82333c;
            }

            @Override // android.os.Parcelable.Creator
            public final NewsFeed[] newArray(int i12) {
                return new NewsFeed[i12];
            }
        }

        public NewsFeed() {
            super("news_feed", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$NotificationCenterLanding;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationCenterLanding extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final NotificationCenterLanding f82334c = new NotificationCenterLanding();

        @k
        public static final Parcelable.Creator<NotificationCenterLanding> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotificationCenterLanding> {
            @Override // android.os.Parcelable.Creator
            public final NotificationCenterLanding createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NotificationCenterLanding.f82334c;
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationCenterLanding[] newArray(int i12) {
                return new NotificationCenterLanding[i12];
            }
        }

        public NotificationCenterLanding() {
            super("notification_center_landing", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$PhotoGallery;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhotoGallery extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final PhotoGallery f82335c = new PhotoGallery();

        @k
        public static final Parcelable.Creator<PhotoGallery> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhotoGallery> {
            @Override // android.os.Parcelable.Creator
            public final PhotoGallery createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PhotoGallery.f82335c;
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoGallery[] newArray(int i12) {
                return new PhotoGallery[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoGallery() {
            super("item_gallery", null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PhotoGallery);
        }

        public final int hashCode() {
            return 250170058;
        }

        @k
        public final String toString() {
            return "PhotoGallery";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Serp;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Serp extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Serp f82336c = new Serp();

        @k
        public static final Parcelable.Creator<Serp> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Serp> {
            @Override // android.os.Parcelable.Creator
            public final Serp createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Serp.f82336c;
            }

            @Override // android.os.Parcelable.Creator
            public final Serp[] newArray(int i12) {
                return new Serp[i12];
            }
        }

        public Serp() {
            super("serp", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$SimilarAdverts;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SimilarAdverts extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final SimilarAdverts f82337c = new SimilarAdverts();

        @k
        public static final Parcelable.Creator<SimilarAdverts> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SimilarAdverts> {
            @Override // android.os.Parcelable.Creator
            public final SimilarAdverts createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SimilarAdverts.f82337c;
            }

            @Override // android.os.Parcelable.Creator
            public final SimilarAdverts[] newArray(int i12) {
                return new SimilarAdverts[i12];
            }
        }

        public SimilarAdverts() {
            super("similar_adverts", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$SoccomGroup;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SoccomGroup extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final SoccomGroup f82338c = new SoccomGroup();

        @k
        public static final Parcelable.Creator<SoccomGroup> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SoccomGroup> {
            @Override // android.os.Parcelable.Creator
            public final SoccomGroup createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SoccomGroup.f82338c;
            }

            @Override // android.os.Parcelable.Creator
            public final SoccomGroup[] newArray(int i12) {
                return new SoccomGroup[i12];
            }
        }

        public SoccomGroup() {
            super("soccom_group", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$TravelSearch;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TravelSearch extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final TravelSearch f82339c = new TravelSearch();

        @k
        public static final Parcelable.Creator<TravelSearch> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TravelSearch> {
            @Override // android.os.Parcelable.Creator
            public final TravelSearch createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TravelSearch.f82339c;
            }

            @Override // android.os.Parcelable.Creator
            public final TravelSearch[] newArray(int i12) {
                return new TravelSearch[i12];
            }
        }

        public TravelSearch() {
            super("travel_search", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$Vertical;", "Lcom/avito/android/advert_collection_toast/analytics/FromPageSource;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Vertical extends FromPageSource {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Vertical f82340c = new Vertical();

        @k
        public static final Parcelable.Creator<Vertical> CREATOR = new a();

        /* compiled from: FromPageSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Vertical> {
            @Override // android.os.Parcelable.Creator
            public final Vertical createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Vertical.f82340c;
            }

            @Override // android.os.Parcelable.Creator
            public final Vertical[] newArray(int i12) {
                return new Vertical[i12];
            }
        }

        public Vertical() {
            super("vertical", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FromPageSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_collection_toast/analytics/FromPageSource$a;", "", "<init>", "()V", "", "FROM_PAGE", "Ljava/lang/String;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public FromPageSource(String str, C42822w c42822w) {
        this.f82321b = str;
    }
}
