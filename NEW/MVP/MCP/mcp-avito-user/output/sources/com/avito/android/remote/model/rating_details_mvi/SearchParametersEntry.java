package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\n¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock;", "blocks", "", "requiredFilters", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBlocks", "getRequiredFilters", "SearchParametersBlock", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SearchParametersEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<SearchParametersEntry> CREATOR = new Creator();

    @c("blocks")
    @k
    private final List<SearchParametersBlock> blocks;

    @c("requiredFilters")
    @l
    private final List<String> requiredFilters;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchParametersEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParametersEntry createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(SearchParametersEntry.class, parcel, arrayList, iL2, 1);
            }
            return new SearchParametersEntry(arrayList, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParametersEntry[] newArray(int i12) {
            return new SearchParametersEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock;", "Landroid/os/Parcelable;", "InlineBoolFilter", "Sort", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$InlineBoolFilter;", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SearchParametersBlock extends Parcelable {

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$InlineBoolFilter;", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock;", "", "label", "paramName", "", "selected", "analyticsParamName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$InlineBoolFilter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getParamName", "Ljava/lang/Boolean;", "getSelected", "getAnalyticsParamName", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InlineBoolFilter implements SearchParametersBlock {

            @k
            public static final Parcelable.Creator<InlineBoolFilter> CREATOR = new Creator();

            @c("analyticsParamName")
            @l
            private final String analyticsParamName;

            @c("label")
            @k
            private final String label;

            @c("paramName")
            @k
            private final String paramName;

            @c("selected")
            @l
            private final Boolean selected;

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InlineBoolFilter> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final InlineBoolFilter createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new InlineBoolFilter(string, string2, boolValueOf, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final InlineBoolFilter[] newArray(int i12) {
                    return new InlineBoolFilter[i12];
                }
            }

            public InlineBoolFilter(@k String str, @k String str2, @l Boolean bool, @l String str3) {
                this.label = str;
                this.paramName = str2;
                this.selected = bool;
                this.analyticsParamName = str3;
            }

            public static /* synthetic */ InlineBoolFilter copy$default(InlineBoolFilter inlineBoolFilter, String str, String str2, Boolean bool, String str3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = inlineBoolFilter.label;
                }
                if ((i12 & 2) != 0) {
                    str2 = inlineBoolFilter.paramName;
                }
                if ((i12 & 4) != 0) {
                    bool = inlineBoolFilter.selected;
                }
                if ((i12 & 8) != 0) {
                    str3 = inlineBoolFilter.analyticsParamName;
                }
                return inlineBoolFilter.copy(str, str2, bool, str3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getParamName() {
                return this.paramName;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Boolean getSelected() {
                return this.selected;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getAnalyticsParamName() {
                return this.analyticsParamName;
            }

            @k
            public final InlineBoolFilter copy(@k String label, @k String paramName, @l Boolean selected, @l String analyticsParamName) {
                return new InlineBoolFilter(label, paramName, selected, analyticsParamName);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InlineBoolFilter)) {
                    return false;
                }
                InlineBoolFilter inlineBoolFilter = (InlineBoolFilter) other;
                return L.f(this.label, inlineBoolFilter.label) && L.f(this.paramName, inlineBoolFilter.paramName) && L.f(this.selected, inlineBoolFilter.selected) && L.f(this.analyticsParamName, inlineBoolFilter.analyticsParamName);
            }

            @l
            public final String getAnalyticsParamName() {
                return this.analyticsParamName;
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @k
            public final String getParamName() {
                return this.paramName;
            }

            @l
            public final Boolean getSelected() {
                return this.selected;
            }

            public int hashCode() {
                int iD2 = H.d(this.label.hashCode() * 31, 31, this.paramName);
                Boolean bool = this.selected;
                int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.analyticsParamName;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("InlineBoolFilter(label=");
                sb2.append(this.label);
                sb2.append(", paramName=");
                sb2.append(this.paramName);
                sb2.append(", selected=");
                sb2.append(this.selected);
                sb2.append(", analyticsParamName=");
                return C22026a.c(sb2, this.analyticsParamName, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.label);
                parcel.writeString(this.paramName);
                Boolean bool = this.selected;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeString(this.analyticsParamName);
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b,\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort;", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock;", "", "paramName", "selectedOption", "", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$SortOption;", "options", "analyticsParamName", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getParamName", "getSelectedOption", "Ljava/util/List;", "getOptions", "getAnalyticsParamName", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;", "getTooltip", "SortOption", "Tooltip", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Sort implements SearchParametersBlock {

            @k
            public static final Parcelable.Creator<Sort> CREATOR = new Creator();

            @c("analyticsParamName")
            @l
            private final String analyticsParamName;

            @c("options")
            @k
            private final List<SortOption> options;

            @c("paramName")
            @k
            private final String paramName;

            @c("selectedOption")
            @l
            private final String selectedOption;

            @c(TooltipAttribute.ATTRIBUTE_TYPE)
            @l
            private final Tooltip tooltip;

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Sort> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Sort createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(SortOption.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Sort(string, string2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Tooltip.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Sort[] newArray(int i12) {
                    return new Sort[i12];
                }
            }

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$SortOption;", "Landroid/os/Parcelable;", "", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$SortOption;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getValue", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SortOption implements Parcelable {

                @k
                public static final Parcelable.Creator<SortOption> CREATOR = new Creator();

                @c("label")
                @k
                private final String label;

                @c("value")
                @k
                private final String value;

                /* compiled from: RatingDetailsEntry.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SortOption> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final SortOption createFromParcel(@k Parcel parcel) {
                        return new SortOption(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final SortOption[] newArray(int i12) {
                        return new SortOption[i12];
                    }
                }

                public SortOption(@k String str, @k String str2) {
                    this.label = str;
                    this.value = str2;
                }

                public static /* synthetic */ SortOption copy$default(SortOption sortOption, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = sortOption.label;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = sortOption.value;
                    }
                    return sortOption.copy(str, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @k
                public final SortOption copy(@k String label, @k String value) {
                    return new SortOption(label, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SortOption)) {
                        return false;
                    }
                    SortOption sortOption = (SortOption) other;
                    return L.f(this.label, sortOption.label) && L.f(this.value, sortOption.value);
                }

                @k
                public final String getLabel() {
                    return this.label;
                }

                @k
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode() + (this.label.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("SortOption(label=");
                    sb2.append(this.label);
                    sb2.append(", value=");
                    return C22026a.c(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.label);
                    parcel.writeString(this.value);
                }
            }

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip$Action;", "actions", "storageKey", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getActions", "getStorageKey", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAnalyticsAction", "Action", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Tooltip implements Parcelable {

                @k
                public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();

                @c("actions")
                @l
                private final List<Action> actions;

                @c("analyticsAction")
                @l
                private final DeepLink analyticsAction;

                @c("storageKey")
                @k
                private final String storageKey;

                @c("text")
                @k
                private final String text;

                /* compiled from: RatingDetailsEntry.kt */
                @d
                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip$Action;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock$Sort$Tooltip$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Action implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Action> CREATOR = new Creator();

                    @c("text")
                    @k
                    private final String text;

                    /* compiled from: RatingDetailsEntry.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Action> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Action createFromParcel(@k Parcel parcel) {
                            return new Action(parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Action[] newArray(int i12) {
                            return new Action[i12];
                        }
                    }

                    public Action(@k String str) {
                        this.text = str;
                    }

                    public static /* synthetic */ Action copy$default(Action action, String str, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = action.text;
                        }
                        return action.copy(str);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    @k
                    public final Action copy(@k String text) {
                        return new Action(text);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Action) && L.f(this.text, ((Action) other).text);
                    }

                    @k
                    public final String getText() {
                        return this.text;
                    }

                    public int hashCode() {
                        return this.text.hashCode();
                    }

                    @k
                    public String toString() {
                        return C22026a.c(new StringBuilder("Action(text="), this.text, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.text);
                    }
                }

                /* compiled from: RatingDetailsEntry.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Tooltip> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Tooltip createFromParcel(@k Parcel parcel) {
                        ArrayList arrayList;
                        String string = parcel.readString();
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
                        return new Tooltip(string, arrayList, parcel.readString(), (DeepLink) parcel.readParcelable(Tooltip.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Tooltip[] newArray(int i12) {
                        return new Tooltip[i12];
                    }
                }

                public Tooltip(@k String str, @l List<Action> list, @k String str2, @l DeepLink deepLink) {
                    this.text = str;
                    this.actions = list;
                    this.storageKey = str2;
                    this.analyticsAction = deepLink;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, String str, List list, String str2, DeepLink deepLink, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = tooltip.text;
                    }
                    if ((i12 & 2) != 0) {
                        list = tooltip.actions;
                    }
                    if ((i12 & 4) != 0) {
                        str2 = tooltip.storageKey;
                    }
                    if ((i12 & 8) != 0) {
                        deepLink = tooltip.analyticsAction;
                    }
                    return tooltip.copy(str, list, str2, deepLink);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @l
                public final List<Action> component2() {
                    return this.actions;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final String getStorageKey() {
                    return this.storageKey;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final DeepLink getAnalyticsAction() {
                    return this.analyticsAction;
                }

                @k
                public final Tooltip copy(@k String text, @l List<Action> actions, @k String storageKey, @l DeepLink analyticsAction) {
                    return new Tooltip(text, actions, storageKey, analyticsAction);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Tooltip)) {
                        return false;
                    }
                    Tooltip tooltip = (Tooltip) other;
                    return L.f(this.text, tooltip.text) && L.f(this.actions, tooltip.actions) && L.f(this.storageKey, tooltip.storageKey) && L.f(this.analyticsAction, tooltip.analyticsAction);
                }

                @l
                public final List<Action> getActions() {
                    return this.actions;
                }

                @l
                public final DeepLink getAnalyticsAction() {
                    return this.analyticsAction;
                }

                @k
                public final String getStorageKey() {
                    return this.storageKey;
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    int iHashCode = this.text.hashCode() * 31;
                    List<Action> list = this.actions;
                    int iD2 = H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.storageKey);
                    DeepLink deepLink = this.analyticsAction;
                    return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Tooltip(text=");
                    sb2.append(this.text);
                    sb2.append(", actions=");
                    sb2.append(this.actions);
                    sb2.append(", storageKey=");
                    sb2.append(this.storageKey);
                    sb2.append(", analyticsAction=");
                    return a.v(sb2, this.analyticsAction, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.text);
                    List<Action> list = this.actions;
                    if (list == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA = a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            ((Action) itA.next()).writeToParcel(parcel, flags);
                        }
                    }
                    parcel.writeString(this.storageKey);
                    parcel.writeParcelable(this.analyticsAction, flags);
                }
            }

            public Sort(@k String str, @l String str2, @k List<SortOption> list, @l String str3, @l Tooltip tooltip) {
                this.paramName = str;
                this.selectedOption = str2;
                this.options = list;
                this.analyticsParamName = str3;
                this.tooltip = tooltip;
            }

            public static /* synthetic */ Sort copy$default(Sort sort, String str, String str2, List list, String str3, Tooltip tooltip, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = sort.paramName;
                }
                if ((i12 & 2) != 0) {
                    str2 = sort.selectedOption;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    list = sort.options;
                }
                List list2 = list;
                if ((i12 & 8) != 0) {
                    str3 = sort.analyticsParamName;
                }
                String str5 = str3;
                if ((i12 & 16) != 0) {
                    tooltip = sort.tooltip;
                }
                return sort.copy(str, str4, list2, str5, tooltip);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getParamName() {
                return this.paramName;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getSelectedOption() {
                return this.selectedOption;
            }

            @k
            public final List<SortOption> component3() {
                return this.options;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getAnalyticsParamName() {
                return this.analyticsParamName;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final Tooltip getTooltip() {
                return this.tooltip;
            }

            @k
            public final Sort copy(@k String paramName, @l String selectedOption, @k List<SortOption> options, @l String analyticsParamName, @l Tooltip tooltip) {
                return new Sort(paramName, selectedOption, options, analyticsParamName, tooltip);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Sort)) {
                    return false;
                }
                Sort sort = (Sort) other;
                return L.f(this.paramName, sort.paramName) && L.f(this.selectedOption, sort.selectedOption) && L.f(this.options, sort.options) && L.f(this.analyticsParamName, sort.analyticsParamName) && L.f(this.tooltip, sort.tooltip);
            }

            @l
            public final String getAnalyticsParamName() {
                return this.analyticsParamName;
            }

            @k
            public final List<SortOption> getOptions() {
                return this.options;
            }

            @k
            public final String getParamName() {
                return this.paramName;
            }

            @l
            public final String getSelectedOption() {
                return this.selectedOption;
            }

            @l
            public final Tooltip getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int iHashCode = this.paramName.hashCode() * 31;
                String str = this.selectedOption;
                int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
                String str2 = this.analyticsParamName;
                int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Tooltip tooltip = this.tooltip;
                return iHashCode2 + (tooltip != null ? tooltip.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Sort(paramName=" + this.paramName + ", selectedOption=" + this.selectedOption + ", options=" + this.options + ", analyticsParamName=" + this.analyticsParamName + ", tooltip=" + this.tooltip + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.paramName);
                parcel.writeString(this.selectedOption);
                Iterator itJ = C0.j(this.options, parcel);
                while (itJ.hasNext()) {
                    ((SortOption) itJ.next()).writeToParcel(parcel, flags);
                }
                parcel.writeString(this.analyticsParamName);
                Tooltip tooltip = this.tooltip;
                if (tooltip == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    tooltip.writeToParcel(parcel, flags);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchParametersEntry(@k List<? extends SearchParametersBlock> list, @l List<String> list2) {
        this.blocks = list;
        this.requiredFilters = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchParametersEntry copy$default(SearchParametersEntry searchParametersEntry, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = searchParametersEntry.blocks;
        }
        if ((i12 & 2) != 0) {
            list2 = searchParametersEntry.requiredFilters;
        }
        return searchParametersEntry.copy(list, list2);
    }

    @k
    public final List<SearchParametersBlock> component1() {
        return this.blocks;
    }

    @l
    public final List<String> component2() {
        return this.requiredFilters;
    }

    @k
    public final SearchParametersEntry copy(@k List<? extends SearchParametersBlock> blocks, @l List<String> requiredFilters) {
        return new SearchParametersEntry(blocks, requiredFilters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchParametersEntry)) {
            return false;
        }
        SearchParametersEntry searchParametersEntry = (SearchParametersEntry) other;
        return L.f(this.blocks, searchParametersEntry.blocks) && L.f(this.requiredFilters, searchParametersEntry.requiredFilters);
    }

    @k
    public final List<SearchParametersBlock> getBlocks() {
        return this.blocks;
    }

    @l
    public final List<String> getRequiredFilters() {
        return this.requiredFilters;
    }

    public int hashCode() {
        int iHashCode = this.blocks.hashCode() * 31;
        List<String> list = this.requiredFilters;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchParametersEntry(blocks=");
        sb2.append(this.blocks);
        sb2.append(", requiredFilters=");
        return H.p(sb2, this.requiredFilters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeStringList(this.requiredFilters);
    }
}
