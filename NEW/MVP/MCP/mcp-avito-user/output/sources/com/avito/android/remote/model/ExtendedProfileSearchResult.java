package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchResult.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0003QRSB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b+\u0010,J¦\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010!J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b6\u0010!J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010\u001dR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bK\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bL\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bM\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bN\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bP\u0010,¨\u0006T"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;", "categoryTree", "category", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;", "location", "", "Lcom/avito/android/remote/model/SerpElement;", "elements", "", "totalCount", "foundCount", "", ContextActionHandler.Link.URL, "", "lastStamp", "searchHint", "xHash", "emptySearchText", "nextPageId", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;", "correction", "<init>", "(Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;Ljava/util/List;IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;)V", "component1", "()Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;", "component2", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;", "component4", "()Ljava/util/List;", "component5", "()I", "component6", "component7", "()Ljava/lang/String;", "component8", "()J", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;", "copy", "(Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;Ljava/util/List;IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;)Lcom/avito/android/remote/model/ExtendedProfileSearchResult;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;", "getCategoryTree", "getCategory", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;", "getLocation", "Ljava/util/List;", "getElements", "I", "getTotalCount", "getFoundCount", "Ljava/lang/String;", "getUrl", "J", "getLastStamp", "getSearchHint", "getXHash", "getEmptySearchText", "getNextPageId", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;", "getCorrection", "Location", "SearchCategory", "SearchCorrection", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSearchResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileSearchResult> CREATOR = new Creator();

    @c("category")
    @k
    private final SearchCategory category;

    @c("categoryTree")
    @k
    private final SearchCategory categoryTree;

    @c("correction")
    @l
    private final SearchCorrection correction;

    @c("items")
    @k
    private final List<SerpElement> elements;

    @c("emptySearch")
    @l
    private final String emptySearchText;

    @c("foundCount")
    private final int foundCount;

    @c("lastStamp")
    private final long lastStamp;

    @c("location")
    @l
    private final Location location;

    @c("nextPageId")
    @l
    private final String nextPageId;

    @c("searchHint")
    @l
    private final String searchHint;

    @c("totalCount")
    private final int totalCount;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: ExtendedProfileSearchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileSearchResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchResult createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<SearchCategory> creator = SearchCategory.CREATOR;
            SearchCategory searchCategoryCreateFromParcel = creator.createFromParcel(parcel);
            SearchCategory searchCategoryCreateFromParcel2 = creator.createFromParcel(parcel);
            Location locationCreateFromParcel = parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(ExtendedProfileSearchResult.class, parcel, arrayList, iL2, 1);
            }
            return new ExtendedProfileSearchResult(searchCategoryCreateFromParcel, searchCategoryCreateFromParcel2, locationCreateFromParcel, arrayList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SearchCorrection.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchResult[] newArray(int i12) {
            return new ExtendedProfileSearchResult[i12];
        }
    }

    /* compiled from: ExtendedProfileSearchResult.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;", "Landroid/os/Parcelable;", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileSearchResult$Location;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getName", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Location implements Parcelable {

        @k
        public static final Parcelable.Creator<Location> CREATOR = new Creator();

        @c("id")
        private final int id;

        @c("name")
        @k
        private final String name;

        /* compiled from: ExtendedProfileSearchResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Location> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location createFromParcel(@k Parcel parcel) {
                return new Location(parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location[] newArray(int i12) {
                return new Location[i12];
            }
        }

        public Location(int i12, @k String str) {
            this.id = i12;
            this.name = str;
        }

        public static /* synthetic */ Location copy$default(Location location, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = location.id;
            }
            if ((i13 & 2) != 0) {
                str = location.name;
            }
            return location.copy(i12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final Location copy(int id2, @k String name) {
            return new Location(id2, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return this.id == location.id && L.f(this.name, location.name);
        }

        public final int getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Location(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: ExtendedProfileSearchResult.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;", "Landroid/os/Parcelable;", "", "id", "", "count", "", "name", "", "subCategories", "<init>", "(ILjava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(ILjava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCategory;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/Long;", "getCount", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getSubCategories", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchCategory implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchCategory> CREATOR = new Creator();

        @c("count")
        @l
        private final Long count;

        @c("id")
        private final int id;

        @c("name")
        @k
        private final String name;

        @c("subs")
        @l
        private final List<SearchCategory> subCategories;

        /* compiled from: ExtendedProfileSearchResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchCategory createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = a.c(SearchCategory.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SearchCategory(i12, lValueOf, string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchCategory[] newArray(int i12) {
                return new SearchCategory[i12];
            }
        }

        public SearchCategory(int i12, @l Long l12, @k String str, @l List<SearchCategory> list) {
            this.id = i12;
            this.count = l12;
            this.name = str;
            this.subCategories = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchCategory copy$default(SearchCategory searchCategory, int i12, Long l12, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = searchCategory.id;
            }
            if ((i13 & 2) != 0) {
                l12 = searchCategory.count;
            }
            if ((i13 & 4) != 0) {
                str = searchCategory.name;
            }
            if ((i13 & 8) != 0) {
                list = searchCategory.subCategories;
            }
            return searchCategory.copy(i12, l12, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getCount() {
            return this.count;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final List<SearchCategory> component4() {
            return this.subCategories;
        }

        @k
        public final SearchCategory copy(int id2, @l Long count, @k String name, @l List<SearchCategory> subCategories) {
            return new SearchCategory(id2, count, name, subCategories);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchCategory)) {
                return false;
            }
            SearchCategory searchCategory = (SearchCategory) other;
            return this.id == searchCategory.id && L.f(this.count, searchCategory.count) && L.f(this.name, searchCategory.name) && L.f(this.subCategories, searchCategory.subCategories);
        }

        @l
        public final Long getCount() {
            return this.count;
        }

        public final int getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final List<SearchCategory> getSubCategories() {
            return this.subCategories;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            Long l12 = this.count;
            int iD2 = H.d((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.name);
            List<SearchCategory> list = this.subCategories;
            return iD2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SearchCategory(id=");
            sb2.append(this.id);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", subCategories=");
            return H.p(sb2, this.subCategories, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            Long l12 = this.count;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.name);
            List<SearchCategory> list = this.subCategories;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SearchCategory) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ExtendedProfileSearchResult.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "actualDeepLink", "", "Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection$Action;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getActualDeepLink", "Ljava/util/List;", "getActions", "Action", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SearchCorrection implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchCorrection> CREATOR = new Creator();

        @c("action")
        @l
        private final List<Action> actions;

        @c("actualUrl")
        @l
        private final DeepLink actualDeepLink;

        @c("title")
        @k
        private final String title;

        /* compiled from: ExtendedProfileSearchResult.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ExtendedProfileSearchResult$SearchCorrection$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @k
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @c(ContextActionHandler.Link.URL)
            @l
            private final DeepLink deepLink;

            @c("title")
            @l
            private final String title;

            /* compiled from: ExtendedProfileSearchResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action createFromParcel(@k Parcel parcel) {
                    return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public Action(@l String str, @l DeepLink deepLink) {
                this.title = str;
                this.deepLink = deepLink;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = action.title;
                }
                if ((i12 & 2) != 0) {
                    deepLink = action.deepLink;
                }
                return action.copy(str, deepLink);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final Action copy(@l String title, @l DeepLink deepLink) {
                return new Action(title, deepLink);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return L.f(this.title, action.title) && L.f(this.deepLink, action.deepLink);
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                DeepLink deepLink = this.deepLink;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Action(title=");
                sb2.append(this.title);
                sb2.append(", deepLink=");
                return a.v(sb2, this.deepLink, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.deepLink, flags);
            }
        }

        /* compiled from: ExtendedProfileSearchResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchCorrection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchCorrection createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SearchCorrection.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Action.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SearchCorrection(string, deepLink, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchCorrection[] newArray(int i12) {
                return new SearchCorrection[i12];
            }
        }

        public SearchCorrection(@k String str, @l DeepLink deepLink, @l List<Action> list) {
            this.title = str;
            this.actualDeepLink = deepLink;
            this.actions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchCorrection copy$default(SearchCorrection searchCorrection, String str, DeepLink deepLink, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = searchCorrection.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = searchCorrection.actualDeepLink;
            }
            if ((i12 & 4) != 0) {
                list = searchCorrection.actions;
            }
            return searchCorrection.copy(str, deepLink, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getActualDeepLink() {
            return this.actualDeepLink;
        }

        @l
        public final List<Action> component3() {
            return this.actions;
        }

        @k
        public final SearchCorrection copy(@k String title, @l DeepLink actualDeepLink, @l List<Action> actions) {
            return new SearchCorrection(title, actualDeepLink, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchCorrection)) {
                return false;
            }
            SearchCorrection searchCorrection = (SearchCorrection) other;
            return L.f(this.title, searchCorrection.title) && L.f(this.actualDeepLink, searchCorrection.actualDeepLink) && L.f(this.actions, searchCorrection.actions);
        }

        @l
        public final List<Action> getActions() {
            return this.actions;
        }

        @l
        public final DeepLink getActualDeepLink() {
            return this.actualDeepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.actualDeepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            List<Action> list = this.actions;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SearchCorrection(title=");
            sb2.append(this.title);
            sb2.append(", actualDeepLink=");
            sb2.append(this.actualDeepLink);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.actualDeepLink, flags);
            List<Action> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Action) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileSearchResult(@k SearchCategory searchCategory, @k SearchCategory searchCategory2, @l Location location, @k List<? extends SerpElement> list, int i12, int i13, @l String str, long j12, @l String str2, @l String str3, @l String str4, @l String str5, @l SearchCorrection searchCorrection) {
        this.categoryTree = searchCategory;
        this.category = searchCategory2;
        this.location = location;
        this.elements = list;
        this.totalCount = i12;
        this.foundCount = i13;
        this.url = str;
        this.lastStamp = j12;
        this.searchHint = str2;
        this.xHash = str3;
        this.emptySearchText = str4;
        this.nextPageId = str5;
        this.correction = searchCorrection;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final SearchCategory getCategoryTree() {
        return this.categoryTree;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getEmptySearchText() {
        return this.emptySearchText;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final SearchCorrection getCorrection() {
        return this.correction;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final SearchCategory getCategory() {
        return this.category;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @k
    public final List<SerpElement> component4() {
        return this.elements;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFoundCount() {
        return this.foundCount;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component8, reason: from getter */
    public final long getLastStamp() {
        return this.lastStamp;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    @k
    public final ExtendedProfileSearchResult copy(@k SearchCategory categoryTree, @k SearchCategory category, @l Location location, @k List<? extends SerpElement> elements, int totalCount, int foundCount, @l String url, long lastStamp, @l String searchHint, @l String xHash, @l String emptySearchText, @l String nextPageId, @l SearchCorrection correction) {
        return new ExtendedProfileSearchResult(categoryTree, category, location, elements, totalCount, foundCount, url, lastStamp, searchHint, xHash, emptySearchText, nextPageId, correction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileSearchResult)) {
            return false;
        }
        ExtendedProfileSearchResult extendedProfileSearchResult = (ExtendedProfileSearchResult) other;
        return L.f(this.categoryTree, extendedProfileSearchResult.categoryTree) && L.f(this.category, extendedProfileSearchResult.category) && L.f(this.location, extendedProfileSearchResult.location) && L.f(this.elements, extendedProfileSearchResult.elements) && this.totalCount == extendedProfileSearchResult.totalCount && this.foundCount == extendedProfileSearchResult.foundCount && L.f(this.url, extendedProfileSearchResult.url) && this.lastStamp == extendedProfileSearchResult.lastStamp && L.f(this.searchHint, extendedProfileSearchResult.searchHint) && L.f(this.xHash, extendedProfileSearchResult.xHash) && L.f(this.emptySearchText, extendedProfileSearchResult.emptySearchText) && L.f(this.nextPageId, extendedProfileSearchResult.nextPageId) && L.f(this.correction, extendedProfileSearchResult.correction);
    }

    @k
    public final SearchCategory getCategory() {
        return this.category;
    }

    @k
    public final SearchCategory getCategoryTree() {
        return this.categoryTree;
    }

    @l
    public final SearchCorrection getCorrection() {
        return this.correction;
    }

    @k
    public final List<SerpElement> getElements() {
        return this.elements;
    }

    @l
    public final String getEmptySearchText() {
        return this.emptySearchText;
    }

    public final int getFoundCount() {
        return this.foundCount;
    }

    public final long getLastStamp() {
        return this.lastStamp;
    }

    @l
    public final Location getLocation() {
        return this.location;
    }

    @l
    public final String getNextPageId() {
        return this.nextPageId;
    }

    @l
    public final String getSearchHint() {
        return this.searchHint;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iHashCode = (this.category.hashCode() + (this.categoryTree.hashCode() * 31)) * 31;
        Location location = this.location;
        int iE2 = r.e(this.foundCount, r.e(this.totalCount, H.e((iHashCode + (location == null ? 0 : location.hashCode())) * 31, 31, this.elements), 31), 31);
        String str = this.url;
        int iG2 = r.g((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.lastStamp);
        String str2 = this.searchHint;
        int iHashCode2 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xHash;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emptySearchText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nextPageId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SearchCorrection searchCorrection = this.correction;
        return iHashCode5 + (searchCorrection != null ? searchCorrection.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfileSearchResult(categoryTree=" + this.categoryTree + ", category=" + this.category + ", location=" + this.location + ", elements=" + this.elements + ", totalCount=" + this.totalCount + ", foundCount=" + this.foundCount + ", url=" + this.url + ", lastStamp=" + this.lastStamp + ", searchHint=" + this.searchHint + ", xHash=" + this.xHash + ", emptySearchText=" + this.emptySearchText + ", nextPageId=" + this.nextPageId + ", correction=" + this.correction + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.categoryTree.writeToParcel(parcel, flags);
        this.category.writeToParcel(parcel, flags);
        Location location = this.location;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.elements, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.foundCount);
        parcel.writeString(this.url);
        parcel.writeLong(this.lastStamp);
        parcel.writeString(this.searchHint);
        parcel.writeString(this.xHash);
        parcel.writeString(this.emptySearchText);
        parcel.writeString(this.nextPageId);
        SearchCorrection searchCorrection = this.correction;
        if (searchCorrection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchCorrection.writeToParcel(parcel, flags);
        }
    }
}
