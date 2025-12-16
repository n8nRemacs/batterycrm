package com.avito.android.remote.model.price_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceListDisplayingOptions.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001a¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;", "Landroid/os/Parcelable;", "", "valuesProviderParamId", "selfServiceParamId", "searchBarPlaceholder", "selfServicesHeaderTitle", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "summary", "", "Lcom/avito/android/remote/model/price_list/PriceListGroup;", "groups", "", "skipEmptyPreview", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValuesProviderParamId", "getSelfServiceParamId", "getSearchBarPlaceholder", "getSelfServicesHeaderTitle", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "getSummary", "Ljava/util/List;", "getGroups", "Ljava/lang/Boolean;", "getSkipEmptyPreview", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceListDisplayingOptions implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceListDisplayingOptions> CREATOR = new Creator();

    @c("groups")
    @l
    private final List<PriceListGroup> groups;

    @c("searchBarPlaceholder")
    @l
    private final String searchBarPlaceholder;

    @c("selfServiceParamId")
    @l
    private final String selfServiceParamId;

    @c("selfServicesHeaderTitle")
    @l
    private final String selfServicesHeaderTitle;

    @c("skipEmptyPreview")
    @l
    private final Boolean skipEmptyPreview;

    @c("summary")
    @l
    private final ObjectsParameter.Summary summary;

    @c("valuesProviderParamId")
    @l
    private final String valuesProviderParamId;

    /* compiled from: PriceListDisplayingOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceListDisplayingOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceListDisplayingOptions createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ObjectsParameter.Summary summaryCreateFromParcel = parcel.readInt() == 0 ? null : ObjectsParameter.Summary.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(PriceListGroup.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PriceListDisplayingOptions(string, string2, string3, string4, summaryCreateFromParcel, arrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceListDisplayingOptions[] newArray(int i12) {
            return new PriceListDisplayingOptions[i12];
        }
    }

    public PriceListDisplayingOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ PriceListDisplayingOptions copy$default(PriceListDisplayingOptions priceListDisplayingOptions, String str, String str2, String str3, String str4, ObjectsParameter.Summary summary, List list, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = priceListDisplayingOptions.valuesProviderParamId;
        }
        if ((i12 & 2) != 0) {
            str2 = priceListDisplayingOptions.selfServiceParamId;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = priceListDisplayingOptions.searchBarPlaceholder;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = priceListDisplayingOptions.selfServicesHeaderTitle;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            summary = priceListDisplayingOptions.summary;
        }
        ObjectsParameter.Summary summary2 = summary;
        if ((i12 & 32) != 0) {
            list = priceListDisplayingOptions.groups;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            bool = priceListDisplayingOptions.skipEmptyPreview;
        }
        return priceListDisplayingOptions.copy(str, str5, str6, str7, summary2, list2, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getValuesProviderParamId() {
        return this.valuesProviderParamId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSelfServiceParamId() {
        return this.selfServiceParamId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSearchBarPlaceholder() {
        return this.searchBarPlaceholder;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSelfServicesHeaderTitle() {
        return this.selfServicesHeaderTitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ObjectsParameter.Summary getSummary() {
        return this.summary;
    }

    @l
    public final List<PriceListGroup> component6() {
        return this.groups;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getSkipEmptyPreview() {
        return this.skipEmptyPreview;
    }

    @k
    public final PriceListDisplayingOptions copy(@l String valuesProviderParamId, @l String selfServiceParamId, @l String searchBarPlaceholder, @l String selfServicesHeaderTitle, @l ObjectsParameter.Summary summary, @l List<PriceListGroup> groups, @l Boolean skipEmptyPreview) {
        return new PriceListDisplayingOptions(valuesProviderParamId, selfServiceParamId, searchBarPlaceholder, selfServicesHeaderTitle, summary, groups, skipEmptyPreview);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceListDisplayingOptions)) {
            return false;
        }
        PriceListDisplayingOptions priceListDisplayingOptions = (PriceListDisplayingOptions) other;
        return L.f(this.valuesProviderParamId, priceListDisplayingOptions.valuesProviderParamId) && L.f(this.selfServiceParamId, priceListDisplayingOptions.selfServiceParamId) && L.f(this.searchBarPlaceholder, priceListDisplayingOptions.searchBarPlaceholder) && L.f(this.selfServicesHeaderTitle, priceListDisplayingOptions.selfServicesHeaderTitle) && L.f(this.summary, priceListDisplayingOptions.summary) && L.f(this.groups, priceListDisplayingOptions.groups) && L.f(this.skipEmptyPreview, priceListDisplayingOptions.skipEmptyPreview);
    }

    @l
    public final List<PriceListGroup> getGroups() {
        return this.groups;
    }

    @l
    public final String getSearchBarPlaceholder() {
        return this.searchBarPlaceholder;
    }

    @l
    public final String getSelfServiceParamId() {
        return this.selfServiceParamId;
    }

    @l
    public final String getSelfServicesHeaderTitle() {
        return this.selfServicesHeaderTitle;
    }

    @l
    public final Boolean getSkipEmptyPreview() {
        return this.skipEmptyPreview;
    }

    @l
    public final ObjectsParameter.Summary getSummary() {
        return this.summary;
    }

    @l
    public final String getValuesProviderParamId() {
        return this.valuesProviderParamId;
    }

    public int hashCode() {
        String str = this.valuesProviderParamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selfServiceParamId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchBarPlaceholder;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selfServicesHeaderTitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ObjectsParameter.Summary summary = this.summary;
        int iHashCode5 = (iHashCode4 + (summary == null ? 0 : summary.hashCode())) * 31;
        List<PriceListGroup> list = this.groups;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.skipEmptyPreview;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceListDisplayingOptions(valuesProviderParamId=");
        sb2.append(this.valuesProviderParamId);
        sb2.append(", selfServiceParamId=");
        sb2.append(this.selfServiceParamId);
        sb2.append(", searchBarPlaceholder=");
        sb2.append(this.searchBarPlaceholder);
        sb2.append(", selfServicesHeaderTitle=");
        sb2.append(this.selfServicesHeaderTitle);
        sb2.append(", summary=");
        sb2.append(this.summary);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", skipEmptyPreview=");
        return C0.g(sb2, this.skipEmptyPreview, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.valuesProviderParamId);
        parcel.writeString(this.selfServiceParamId);
        parcel.writeString(this.searchBarPlaceholder);
        parcel.writeString(this.selfServicesHeaderTitle);
        ObjectsParameter.Summary summary = this.summary;
        if (summary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            summary.writeToParcel(parcel, flags);
        }
        List<PriceListGroup> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PriceListGroup) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.skipEmptyPreview;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public PriceListDisplayingOptions(@l String str, @l String str2, @l String str3, @l String str4, @l ObjectsParameter.Summary summary, @l List<PriceListGroup> list, @l Boolean bool) {
        this.valuesProviderParamId = str;
        this.selfServiceParamId = str2;
        this.searchBarPlaceholder = str3;
        this.selfServicesHeaderTitle = str4;
        this.summary = summary;
        this.groups = list;
        this.skipEmptyPreview = bool;
    }

    public /* synthetic */ PriceListDisplayingOptions(String str, String str2, String str3, String str4, ObjectsParameter.Summary summary, List list, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : summary, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : bool);
    }
}
