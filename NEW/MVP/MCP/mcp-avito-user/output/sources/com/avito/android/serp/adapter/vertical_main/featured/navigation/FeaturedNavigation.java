package com.avito.android.serp.adapter.vertical_main.featured.navigation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeaturedTabsItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation;", "Landroid/os/Parcelable;", "Analytics", "Chips", "Tab", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation$Chips;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation$Tab;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeaturedNavigation extends Parcelable {

    /* compiled from: FeaturedTabsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation$Analytics;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Analytics implements Parcelable {

        @k
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f272873b;

        /* compiled from: FeaturedTabsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Analytics> {
            @Override // android.os.Parcelable.Creator
            public final Analytics createFromParcel(Parcel parcel) {
                return new Analytics(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@k String str) {
            this.f272873b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && L.f(this.f272873b, ((Analytics) obj).f272873b);
        }

        public final int hashCode() {
            return this.f272873b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Analytics(fromPage="), this.f272873b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f272873b);
        }
    }

    /* compiled from: FeaturedTabsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation$Chips;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Chips implements FeaturedNavigation {

        @k
        public static final Parcelable.Creator<Chips> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f272874b;

        /* renamed from: c, reason: collision with root package name */
        public final int f272875c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Analytics f272876d;

        /* compiled from: FeaturedTabsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Chips> {
            @Override // android.os.Parcelable.Creator
            public final Chips createFromParcel(Parcel parcel) {
                return new Chips(parcel.readString(), parcel.readInt(), Analytics.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Chips[] newArray(int i12) {
                return new Chips[i12];
            }
        }

        public Chips(@k String str, int i12, @k Analytics analytics) {
            this.f272874b = str;
            this.f272875c = i12;
            this.f272876d = analytics;
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        /* renamed from: P, reason: from getter */
        public final int getF272878c() {
            return this.f272875c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chips)) {
                return false;
            }
            Chips chips = (Chips) obj;
            return L.f(this.f272874b, chips.f272874b) && this.f272875c == chips.f272875c && L.f(this.f272876d, chips.f272876d);
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        @k
        /* renamed from: getAnalytics, reason: from getter */
        public final Analytics getF272879d() {
            return this.f272876d;
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF272877b() {
            return this.f272874b;
        }

        public final int hashCode() {
            return this.f272876d.f272873b.hashCode() + r.e(this.f272875c, this.f272874b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "Chips(title=" + this.f272874b + ", itemCount=" + this.f272875c + ", analytics=" + this.f272876d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f272874b);
            parcel.writeInt(this.f272875c);
            this.f272876d.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: FeaturedTabsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation$Tab;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Tab implements FeaturedNavigation, Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f272877b;

        /* renamed from: c, reason: collision with root package name */
        public final int f272878c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Analytics f272879d;

        /* compiled from: FeaturedTabsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Tab> {
            @Override // android.os.Parcelable.Creator
            public final Tab createFromParcel(Parcel parcel) {
                return new Tab(parcel.readString(), parcel.readInt(), Analytics.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, int i12, @k Analytics analytics) {
            this.f272877b = str;
            this.f272878c = i12;
            this.f272879d = analytics;
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        /* renamed from: P, reason: from getter */
        public final int getF272878c() {
            return this.f272878c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return L.f(this.f272877b, tab.f272877b) && this.f272878c == tab.f272878c && L.f(this.f272879d, tab.f272879d);
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        @k
        /* renamed from: getAnalytics, reason: from getter */
        public final Analytics getF272879d() {
            return this.f272879d;
        }

        @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF272877b() {
            return this.f272877b;
        }

        public final int hashCode() {
            return this.f272879d.f272873b.hashCode() + r.e(this.f272878c, this.f272877b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "Tab(title=" + this.f272877b + ", itemCount=" + this.f272878c + ", analytics=" + this.f272879d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f272877b);
            parcel.writeInt(this.f272878c);
            this.f272879d.writeToParcel(parcel, i12);
        }
    }

    /* renamed from: P */
    int getF272878c();

    @k
    /* renamed from: getAnalytics */
    Analytics getF272879d();

    @k
    /* renamed from: getTitle */
    String getF272877b();
}
