package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemReviewsMain.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "entries", "Lcom/avito/android/deep_linking/links/DeepLink;", "onFirstReviewShownAction", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;", "analyticsParams", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;", "copy", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;)Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getEntries", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnFirstReviewShownAction", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;", "getAnalyticsParams", "AnalyticsParams", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemReviewsMain implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemReviewsMain> CREATOR = new Creator();

    @c("analyticsParams")
    @l
    private final AnalyticsParams analyticsParams;

    @c("entries")
    @k
    private final List<ItemReviewsEntry> entries;

    @c("onFirstReviewShownAction")
    @l
    private final DeepLink onFirstReviewShownAction;

    /* compiled from: ItemReviewsMain.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;", "Landroid/os/Parcelable;", "", "aggregationType", "firstReviewRelevanceBy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain$AnalyticsParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAggregationType", "getFirstReviewRelevanceBy", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticsParams> CREATOR = new Creator();

        @c("aggregationType")
        @l
        private final String aggregationType;

        @c("firstReviewRelevanceBy")
        @l
        private final String firstReviewRelevanceBy;

        /* compiled from: ItemReviewsMain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticsParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsParams createFromParcel(@k Parcel parcel) {
                return new AnalyticsParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsParams[] newArray(int i12) {
                return new AnalyticsParams[i12];
            }
        }

        public AnalyticsParams(@l String str, @l String str2) {
            this.aggregationType = str;
            this.firstReviewRelevanceBy = str2;
        }

        public static /* synthetic */ AnalyticsParams copy$default(AnalyticsParams analyticsParams, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = analyticsParams.aggregationType;
            }
            if ((i12 & 2) != 0) {
                str2 = analyticsParams.firstReviewRelevanceBy;
            }
            return analyticsParams.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getAggregationType() {
            return this.aggregationType;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getFirstReviewRelevanceBy() {
            return this.firstReviewRelevanceBy;
        }

        @k
        public final AnalyticsParams copy(@l String aggregationType, @l String firstReviewRelevanceBy) {
            return new AnalyticsParams(aggregationType, firstReviewRelevanceBy);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsParams)) {
                return false;
            }
            AnalyticsParams analyticsParams = (AnalyticsParams) other;
            return L.f(this.aggregationType, analyticsParams.aggregationType) && L.f(this.firstReviewRelevanceBy, analyticsParams.firstReviewRelevanceBy);
        }

        @l
        public final String getAggregationType() {
            return this.aggregationType;
        }

        @l
        public final String getFirstReviewRelevanceBy() {
            return this.firstReviewRelevanceBy;
        }

        public int hashCode() {
            String str = this.aggregationType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.firstReviewRelevanceBy;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticsParams(aggregationType=");
            sb2.append(this.aggregationType);
            sb2.append(", firstReviewRelevanceBy=");
            return C22026a.c(sb2, this.firstReviewRelevanceBy, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.aggregationType);
            parcel.writeString(this.firstReviewRelevanceBy);
        }
    }

    /* compiled from: ItemReviewsMain.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemReviewsMain> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviewsMain createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(ItemReviewsMain.class, parcel, arrayList, iL2, 1);
            }
            return new ItemReviewsMain(arrayList, (DeepLink) parcel.readParcelable(ItemReviewsMain.class.getClassLoader()), parcel.readInt() == 0 ? null : AnalyticsParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviewsMain[] newArray(int i12) {
            return new ItemReviewsMain[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemReviewsMain(@k List<? extends ItemReviewsEntry> list, @l DeepLink deepLink, @l AnalyticsParams analyticsParams) {
        this.entries = list;
        this.onFirstReviewShownAction = deepLink;
        this.analyticsParams = analyticsParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemReviewsMain copy$default(ItemReviewsMain itemReviewsMain, List list, DeepLink deepLink, AnalyticsParams analyticsParams, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = itemReviewsMain.entries;
        }
        if ((i12 & 2) != 0) {
            deepLink = itemReviewsMain.onFirstReviewShownAction;
        }
        if ((i12 & 4) != 0) {
            analyticsParams = itemReviewsMain.analyticsParams;
        }
        return itemReviewsMain.copy(list, deepLink, analyticsParams);
    }

    @k
    public final List<ItemReviewsEntry> component1() {
        return this.entries;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getOnFirstReviewShownAction() {
        return this.onFirstReviewShownAction;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    @k
    public final ItemReviewsMain copy(@k List<? extends ItemReviewsEntry> entries, @l DeepLink onFirstReviewShownAction, @l AnalyticsParams analyticsParams) {
        return new ItemReviewsMain(entries, onFirstReviewShownAction, analyticsParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemReviewsMain)) {
            return false;
        }
        ItemReviewsMain itemReviewsMain = (ItemReviewsMain) other;
        return L.f(this.entries, itemReviewsMain.entries) && L.f(this.onFirstReviewShownAction, itemReviewsMain.onFirstReviewShownAction) && L.f(this.analyticsParams, itemReviewsMain.analyticsParams);
    }

    @l
    public final AnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    @k
    public final List<ItemReviewsEntry> getEntries() {
        return this.entries;
    }

    @l
    public final DeepLink getOnFirstReviewShownAction() {
        return this.onFirstReviewShownAction;
    }

    public int hashCode() {
        int iHashCode = this.entries.hashCode() * 31;
        DeepLink deepLink = this.onFirstReviewShownAction;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AnalyticsParams analyticsParams = this.analyticsParams;
        return iHashCode2 + (analyticsParams != null ? analyticsParams.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ItemReviewsMain(entries=" + this.entries + ", onFirstReviewShownAction=" + this.onFirstReviewShownAction + ", analyticsParams=" + this.analyticsParams + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.entries, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.onFirstReviewShownAction, flags);
        AnalyticsParams analyticsParams = this.analyticsParams;
        if (analyticsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsParams.writeToParcel(parcel, flags);
        }
    }
}
