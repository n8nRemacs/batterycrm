package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MiniSearchWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/MiniSearchWidgetRecentSearches;", "Landroid/os/Parcelable;", "Analytics", "Item", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MiniSearchWidgetRecentSearches implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MiniSearchWidgetRecentSearches> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f273041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Analytics f273042c;

    /* compiled from: MiniSearchWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/MiniSearchWidgetRecentSearches$Analytics;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Analytics implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ParcelableClickStreamEvent f273043b;

        /* compiled from: MiniSearchWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Analytics> {
            @Override // android.os.Parcelable.Creator
            public final Analytics createFromParcel(Parcel parcel) {
                return new Analytics((ParcelableClickStreamEvent) parcel.readParcelable(Analytics.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@Y61.k ParcelableClickStreamEvent parcelableClickStreamEvent) {
            this.f273043b = parcelableClickStreamEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && L.f(this.f273043b, ((Analytics) obj).f273043b);
        }

        public final int hashCode() {
            return this.f273043b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Analytics(onShowEvent=" + this.f273043b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f273043b, i12);
        }
    }

    /* compiled from: MiniSearchWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/MiniSearchWidgetRecentSearches$Item;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Item implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f273044b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f273045c;

        /* compiled from: MiniSearchWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item(parcel.readString(), (DeepLink) parcel.readParcelable(Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f273044b = str;
            this.f273045c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return L.f(this.f273044b, item.f273044b) && L.f(this.f273045c, item.f273045c);
        }

        public final int hashCode() {
            return this.f273045c.hashCode() + (this.f273044b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(title=");
            sb2.append(this.f273044b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f273045c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f273044b);
            parcel.writeParcelable(this.f273045c, i12);
        }
    }

    /* compiled from: MiniSearchWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MiniSearchWidgetRecentSearches> {
        @Override // android.os.Parcelable.Creator
        public final MiniSearchWidgetRecentSearches createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MiniSearchWidgetRecentSearches(arrayList, parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MiniSearchWidgetRecentSearches[] newArray(int i12) {
            return new MiniSearchWidgetRecentSearches[i12];
        }
    }

    public MiniSearchWidgetRecentSearches(@Y61.k ArrayList arrayList, @Y61.l Analytics analytics) {
        this.f273041b = arrayList;
        this.f273042c = analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniSearchWidgetRecentSearches)) {
            return false;
        }
        MiniSearchWidgetRecentSearches miniSearchWidgetRecentSearches = (MiniSearchWidgetRecentSearches) obj;
        return L.f(this.f273041b, miniSearchWidgetRecentSearches.f273041b) && L.f(this.f273042c, miniSearchWidgetRecentSearches.f273042c);
    }

    public final int hashCode() {
        int iHashCode = this.f273041b.hashCode() * 31;
        Analytics analytics = this.f273042c;
        return iHashCode + (analytics == null ? 0 : analytics.f273043b.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "MiniSearchWidgetRecentSearches(items=" + this.f273041b + ", analytics=" + this.f273042c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        ArrayList arrayList = this.f273041b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Item) it.next()).writeToParcel(parcel, i12);
        }
        Analytics analytics = this.f273042c;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, i12);
        }
    }
}
