package com.avito.android.rec;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ScreenSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/rec/ScreenSource;", "Landroid/os/Parcelable;", "ADVERT", "AVL", "BRANDSPACE", "BXCONTENT", "CART_SIMILAR_ITEMS", "a", "EMPTY", "EXTENDED_PROFILE", "FAVORITES", "MAIN", "NEWS_FEED", "SELLER_PROMOTIONS", "SERP", "TRAVEL_SEARCH", "Lcom/avito/android/rec/ScreenSource$ADVERT;", "Lcom/avito/android/rec/ScreenSource$AVL;", "Lcom/avito/android/rec/ScreenSource$BRANDSPACE;", "Lcom/avito/android/rec/ScreenSource$BXCONTENT;", "Lcom/avito/android/rec/ScreenSource$CART_SIMILAR_ITEMS;", "Lcom/avito/android/rec/ScreenSource$EMPTY;", "Lcom/avito/android/rec/ScreenSource$EXTENDED_PROFILE;", "Lcom/avito/android/rec/ScreenSource$FAVORITES;", "Lcom/avito/android/rec/ScreenSource$MAIN;", "Lcom/avito/android/rec/ScreenSource$NEWS_FEED;", "Lcom/avito/android/rec/ScreenSource$SELLER_PROMOTIONS;", "Lcom/avito/android/rec/ScreenSource$SERP;", "Lcom/avito/android/rec/ScreenSource$TRAVEL_SEARCH;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ScreenSource implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f251772c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251773b;

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$ADVERT;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ADVERT extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final ADVERT f251774d = new ADVERT();

        @k
        public static final Parcelable.Creator<ADVERT> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ADVERT> {
            @Override // android.os.Parcelable.Creator
            public final ADVERT createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ADVERT.f251774d;
            }

            @Override // android.os.Parcelable.Creator
            public final ADVERT[] newArray(int i12) {
                return new ADVERT[i12];
            }
        }

        public ADVERT() {
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$AVL;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AVL extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final AVL f251775d = new AVL();

        @k
        public static final Parcelable.Creator<AVL> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AVL> {
            @Override // android.os.Parcelable.Creator
            public final AVL createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AVL.f251775d;
            }

            @Override // android.os.Parcelable.Creator
            public final AVL[] newArray(int i12) {
                return new AVL[i12];
            }
        }

        public AVL() {
            super("video_feed_fullscreen", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$BRANDSPACE;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BRANDSPACE extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final BRANDSPACE f251776d = new BRANDSPACE();

        @k
        public static final Parcelable.Creator<BRANDSPACE> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BRANDSPACE> {
            @Override // android.os.Parcelable.Creator
            public final BRANDSPACE createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BRANDSPACE.f251776d;
            }

            @Override // android.os.Parcelable.Creator
            public final BRANDSPACE[] newArray(int i12) {
                return new BRANDSPACE[i12];
            }
        }

        public BRANDSPACE() {
            super("brandspace", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$BXCONTENT;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BXCONTENT extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final BXCONTENT f251777d = new BXCONTENT();

        @k
        public static final Parcelable.Creator<BXCONTENT> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BXCONTENT> {
            @Override // android.os.Parcelable.Creator
            public final BXCONTENT createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BXCONTENT.f251777d;
            }

            @Override // android.os.Parcelable.Creator
            public final BXCONTENT[] newArray(int i12) {
                return new BXCONTENT[i12];
            }
        }

        public BXCONTENT() {
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$CART_SIMILAR_ITEMS;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CART_SIMILAR_ITEMS extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final CART_SIMILAR_ITEMS f251778d = new CART_SIMILAR_ITEMS();

        @k
        public static final Parcelable.Creator<CART_SIMILAR_ITEMS> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CART_SIMILAR_ITEMS> {
            @Override // android.os.Parcelable.Creator
            public final CART_SIMILAR_ITEMS createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CART_SIMILAR_ITEMS.f251778d;
            }

            @Override // android.os.Parcelable.Creator
            public final CART_SIMILAR_ITEMS[] newArray(int i12) {
                return new CART_SIMILAR_ITEMS[i12];
            }
        }

        public CART_SIMILAR_ITEMS() {
            super("cart_similar", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$EMPTY;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EMPTY extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final EMPTY f251779d = new EMPTY();

        @k
        public static final Parcelable.Creator<EMPTY> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EMPTY> {
            @Override // android.os.Parcelable.Creator
            public final EMPTY createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EMPTY.f251779d;
            }

            @Override // android.os.Parcelable.Creator
            public final EMPTY[] newArray(int i12) {
                return new EMPTY[i12];
            }
        }

        public EMPTY() {
            super("empty", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$EXTENDED_PROFILE;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EXTENDED_PROFILE extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final EXTENDED_PROFILE f251780d = new EXTENDED_PROFILE();

        @k
        public static final Parcelable.Creator<EXTENDED_PROFILE> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EXTENDED_PROFILE> {
            @Override // android.os.Parcelable.Creator
            public final EXTENDED_PROFILE createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EXTENDED_PROFILE.f251780d;
            }

            @Override // android.os.Parcelable.Creator
            public final EXTENDED_PROFILE[] newArray(int i12) {
                return new EXTENDED_PROFILE[i12];
            }
        }

        public EXTENDED_PROFILE() {
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$FAVORITES;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FAVORITES extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final FAVORITES f251781d = new FAVORITES();

        @k
        public static final Parcelable.Creator<FAVORITES> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FAVORITES> {
            @Override // android.os.Parcelable.Creator
            public final FAVORITES createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FAVORITES.f251781d;
            }

            @Override // android.os.Parcelable.Creator
            public final FAVORITES[] newArray(int i12) {
                return new FAVORITES[i12];
            }
        }

        public FAVORITES() {
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

    /* compiled from: ScreenSource.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rec/ScreenSource$MAIN;", "Lcom/avito/android/rec/ScreenSource;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class MAIN extends ScreenSource {

        @k
        public static final Parcelable.Creator<MAIN> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f251782d;

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MAIN> {
            @Override // android.os.Parcelable.Creator
            public final MAIN createFromParcel(Parcel parcel) {
                return new MAIN(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MAIN[] newArray(int i12) {
                return new MAIN[i12];
            }
        }

        public MAIN(@k String str) {
            super(str.length() > 0 ? "main_".concat(str) : "main", null);
            this.f251782d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f251782d);
        }
    }

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$NEWS_FEED;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NEWS_FEED extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final NEWS_FEED f251783d = new NEWS_FEED();

        @k
        public static final Parcelable.Creator<NEWS_FEED> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NEWS_FEED> {
            @Override // android.os.Parcelable.Creator
            public final NEWS_FEED createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NEWS_FEED.f251783d;
            }

            @Override // android.os.Parcelable.Creator
            public final NEWS_FEED[] newArray(int i12) {
                return new NEWS_FEED[i12];
            }
        }

        public NEWS_FEED() {
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$SELLER_PROMOTIONS;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELLER_PROMOTIONS extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final SELLER_PROMOTIONS f251784d = new SELLER_PROMOTIONS();

        @k
        public static final Parcelable.Creator<SELLER_PROMOTIONS> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SELLER_PROMOTIONS> {
            @Override // android.os.Parcelable.Creator
            public final SELLER_PROMOTIONS createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SELLER_PROMOTIONS.f251784d;
            }

            @Override // android.os.Parcelable.Creator
            public final SELLER_PROMOTIONS[] newArray(int i12) {
                return new SELLER_PROMOTIONS[i12];
            }
        }

        public SELLER_PROMOTIONS() {
            super("seller_promotions", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$SERP;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SERP extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final SERP f251785d = new SERP();

        @k
        public static final Parcelable.Creator<SERP> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SERP> {
            @Override // android.os.Parcelable.Creator
            public final SERP createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SERP.f251785d;
            }

            @Override // android.os.Parcelable.Creator
            public final SERP[] newArray(int i12) {
                return new SERP[i12];
            }
        }

        public SERP() {
            super("catalog", null);
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

    /* compiled from: ScreenSource.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$TRAVEL_SEARCH;", "Lcom/avito/android/rec/ScreenSource;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TRAVEL_SEARCH extends ScreenSource {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final TRAVEL_SEARCH f251786d = new TRAVEL_SEARCH();

        @k
        public static final Parcelable.Creator<TRAVEL_SEARCH> CREATOR = new a();

        /* compiled from: ScreenSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TRAVEL_SEARCH> {
            @Override // android.os.Parcelable.Creator
            public final TRAVEL_SEARCH createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TRAVEL_SEARCH.f251786d;
            }

            @Override // android.os.Parcelable.Creator
            public final TRAVEL_SEARCH[] newArray(int i12) {
                return new TRAVEL_SEARCH[i12];
            }
        }

        public TRAVEL_SEARCH() {
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

    /* compiled from: ScreenSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rec/ScreenSource$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ScreenSource a(@l String str) {
            if (str == null) {
                return EMPTY.f251779d;
            }
            if (str.equals("main")) {
                return new MAIN("");
            }
            if (C43066x.h0(str, "main_", false)) {
                return new MAIN(C43066x.a0(str, "main_", "", false));
            }
            SERP serp = SERP.f251785d;
            if (str.equals(serp.f251773b)) {
                return serp;
            }
            ADVERT advert = ADVERT.f251774d;
            if (str.equals(advert.f251773b)) {
                return advert;
            }
            BRANDSPACE brandspace = BRANDSPACE.f251776d;
            if (str.equals(brandspace.f251773b)) {
                return brandspace;
            }
            NEWS_FEED news_feed = NEWS_FEED.f251783d;
            if (str.equals(news_feed.f251773b)) {
                return news_feed;
            }
            EXTENDED_PROFILE extended_profile = EXTENDED_PROFILE.f251780d;
            if (str.equals(extended_profile.f251773b)) {
                return extended_profile;
            }
            FAVORITES favorites = FAVORITES.f251781d;
            if (str.equals(favorites.f251773b)) {
                return favorites;
            }
            BXCONTENT bxcontent = BXCONTENT.f251777d;
            if (str.equals(bxcontent.f251773b)) {
                return bxcontent;
            }
            AVL avl = AVL.f251775d;
            return str.equals(avl.f251773b) ? avl : EMPTY.f251779d;
        }

        public a() {
        }
    }

    public ScreenSource(String str, C42822w c42822w) {
        this.f251773b = str;
    }
}
