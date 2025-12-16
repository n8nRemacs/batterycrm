package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchPositionSortDeepLink.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortBody;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortBody$SortBodyItem;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "SortBodyItem", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionSortBody implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchPositionSortBody> CREATOR = new a();

    @com.google.gson.annotations.c("items")
    @k
    private final List<SortBodyItem> items;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* compiled from: SearchPositionSortDeepLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortBody$SortBodyItem;", "Landroid/os/Parcelable;", "", "slug", "controlTitle", "listTitle", "listDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "c", "e", "d", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class SortBodyItem implements Parcelable {

        @k
        public static final Parcelable.Creator<SortBodyItem> CREATOR = new a();

        @com.google.gson.annotations.c("controlTitle")
        @k
        private final String controlTitle;

        @com.google.gson.annotations.c("listDescription")
        @l
        private final String listDescription;

        @com.google.gson.annotations.c("listTitle")
        @k
        private final String listTitle;

        @com.google.gson.annotations.c("slug")
        @k
        private final String slug;

        /* compiled from: SearchPositionSortDeepLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SortBodyItem> {
            @Override // android.os.Parcelable.Creator
            public final SortBodyItem createFromParcel(Parcel parcel) {
                return new SortBodyItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SortBodyItem[] newArray(int i12) {
                return new SortBodyItem[i12];
            }
        }

        public SortBodyItem(@k String str, @k String str2, @k String str3, @l String str4) {
            this.slug = str;
            this.controlTitle = str2;
            this.listTitle = str3;
            this.listDescription = str4;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getControlTitle() {
            return this.controlTitle;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getListDescription() {
            return this.listDescription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getListTitle() {
            return this.listTitle;
        }

        @k
        public final String getSlug() {
            return this.slug;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeString(this.controlTitle);
            parcel.writeString(this.listTitle);
            parcel.writeString(this.listDescription);
        }
    }

    /* compiled from: SearchPositionSortDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchPositionSortBody> {
        @Override // android.os.Parcelable.Creator
        public final SearchPositionSortBody createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SortBodyItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SearchPositionSortBody(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPositionSortBody[] newArray(int i12) {
            return new SearchPositionSortBody[i12];
        }
    }

    public SearchPositionSortBody(@k String str, @k List<SortBodyItem> list) {
        this.title = str;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<SortBodyItem> getItems() {
        return this.items;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((SortBodyItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
