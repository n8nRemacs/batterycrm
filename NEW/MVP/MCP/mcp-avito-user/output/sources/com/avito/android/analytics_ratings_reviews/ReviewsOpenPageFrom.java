package com.avito.android.analytics_ratings_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReviewsOpenPageFrom.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "Landroid/os/Parcelable;", "a", "Item", "ItemAllReviews", "ItemRating", "ItemScroll", "PublicProfile", "PublicProfileTabs", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$Item;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemAllReviews;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemRating;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemScroll;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$PublicProfile;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$PublicProfileTabs;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewsOpenPageFrom implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f91254c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f91255b;

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$Item;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Item extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final Item f91256d = new Item();

        @k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Item.f91256d;
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item() {
            super("item", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemAllReviews;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemAllReviews extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final ItemAllReviews f91257d = new ItemAllReviews();

        @k
        public static final Parcelable.Creator<ItemAllReviews> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemAllReviews> {
            @Override // android.os.Parcelable.Creator
            public final ItemAllReviews createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ItemAllReviews.f91257d;
            }

            @Override // android.os.Parcelable.Creator
            public final ItemAllReviews[] newArray(int i12) {
                return new ItemAllReviews[i12];
            }
        }

        public ItemAllReviews() {
            super("item_all_reviews", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemRating;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemRating extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final ItemRating f91258d = new ItemRating();

        @k
        public static final Parcelable.Creator<ItemRating> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemRating> {
            @Override // android.os.Parcelable.Creator
            public final ItemRating createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ItemRating.f91258d;
            }

            @Override // android.os.Parcelable.Creator
            public final ItemRating[] newArray(int i12) {
                return new ItemRating[i12];
            }
        }

        public ItemRating() {
            super("item_rating", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$ItemScroll;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemScroll extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final ItemScroll f91259d = new ItemScroll();

        @k
        public static final Parcelable.Creator<ItemScroll> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemScroll> {
            @Override // android.os.Parcelable.Creator
            public final ItemScroll createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ItemScroll.f91259d;
            }

            @Override // android.os.Parcelable.Creator
            public final ItemScroll[] newArray(int i12) {
                return new ItemScroll[i12];
            }
        }

        public ItemScroll() {
            super("item_scroll", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$PublicProfile;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PublicProfile extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final PublicProfile f91260d = new PublicProfile();

        @k
        public static final Parcelable.Creator<PublicProfile> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PublicProfile> {
            @Override // android.os.Parcelable.Creator
            public final PublicProfile createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PublicProfile.f91260d;
            }

            @Override // android.os.Parcelable.Creator
            public final PublicProfile[] newArray(int i12) {
                return new PublicProfile[i12];
            }
        }

        public PublicProfile() {
            super("public_profile", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$PublicProfileTabs;", "Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PublicProfileTabs extends ReviewsOpenPageFrom {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final PublicProfileTabs f91261d = new PublicProfileTabs();

        @k
        public static final Parcelable.Creator<PublicProfileTabs> CREATOR = new a();

        /* compiled from: ReviewsOpenPageFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PublicProfileTabs> {
            @Override // android.os.Parcelable.Creator
            public final PublicProfileTabs createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PublicProfileTabs.f91261d;
            }

            @Override // android.os.Parcelable.Creator
            public final PublicProfileTabs[] newArray(int i12) {
                return new PublicProfileTabs[i12];
            }
        }

        public PublicProfileTabs() {
            super("tab_bar", null);
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

    /* compiled from: ReviewsOpenPageFrom.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics_ratings_reviews/ReviewsOpenPageFrom$a;", "", "<init>", "()V", "", "PAGE_FROM", "Ljava/lang/String;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @l
        public static ReviewsOpenPageFrom a(@l Bundle bundle) {
            if (bundle != null) {
                return (ReviewsOpenPageFrom) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("page_from", ReviewsOpenPageFrom.class) : bundle.getParcelable("page_from"));
            }
            return null;
        }

        @k
        public static Bundle b(@k ReviewsOpenPageFrom reviewsOpenPageFrom) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("page_from", reviewsOpenPageFrom);
            return bundle;
        }

        public a() {
        }
    }

    public ReviewsOpenPageFrom(String str, C42822w c42822w) {
        this.f91255b = str;
    }
}
