package com.avito.android.remote.model.inset;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsCarouselWidget.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsRequestParams;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;", "paramRecs", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;)Lcom/avito/android/remote/model/inset/ItemsRequestParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;", "getParamRecs", "ParamRecs", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemsRequestParams implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemsRequestParams> CREATOR = new Creator();

    @c("paramsRecs")
    @l
    private final ParamRecs paramRecs;

    @c(SearchParamsConverterKt.SOURCE)
    @k
    private final String source;

    /* compiled from: ItemsCarouselWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemsRequestParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsRequestParams createFromParcel(@k Parcel parcel) {
            return new ItemsRequestParams(parcel.readString(), parcel.readInt() == 0 ? null : ParamRecs.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsRequestParams[] newArray(int i12) {
            return new ItemsRequestParams[i12];
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;", "Landroid/os/Parcelable;", "", "limit", "minItems", "", "itemsType", "displayType", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(IILjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/inset/ItemsRequestParams$ParamRecs;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getLimit", "getMinItems", "Ljava/lang/String;", "getItemsType", "getDisplayType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamRecs implements Parcelable {

        @k
        public static final Parcelable.Creator<ParamRecs> CREATOR = new Creator();

        @c("displayType")
        @k
        private final String displayType;

        @c("itemsType")
        @k
        private final String itemsType;

        @c("limit")
        private final int limit;

        @c("minItems")
        private final int minItems;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParamRecs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParamRecs createFromParcel(@k Parcel parcel) {
                return new ParamRecs(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParamRecs[] newArray(int i12) {
                return new ParamRecs[i12];
            }
        }

        public ParamRecs(int i12, int i13, @k String str, @k String str2) {
            this.limit = i12;
            this.minItems = i13;
            this.itemsType = str;
            this.displayType = str2;
        }

        public static /* synthetic */ ParamRecs copy$default(ParamRecs paramRecs, int i12, int i13, String str, String str2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = paramRecs.limit;
            }
            if ((i14 & 2) != 0) {
                i13 = paramRecs.minItems;
            }
            if ((i14 & 4) != 0) {
                str = paramRecs.itemsType;
            }
            if ((i14 & 8) != 0) {
                str2 = paramRecs.displayType;
            }
            return paramRecs.copy(i12, i13, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinItems() {
            return this.minItems;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getItemsType() {
            return this.itemsType;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDisplayType() {
            return this.displayType;
        }

        @k
        public final ParamRecs copy(int limit, int minItems, @k String itemsType, @k String displayType) {
            return new ParamRecs(limit, minItems, itemsType, displayType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParamRecs)) {
                return false;
            }
            ParamRecs paramRecs = (ParamRecs) other;
            return this.limit == paramRecs.limit && this.minItems == paramRecs.minItems && L.f(this.itemsType, paramRecs.itemsType) && L.f(this.displayType, paramRecs.displayType);
        }

        @k
        public final String getDisplayType() {
            return this.displayType;
        }

        @k
        public final String getItemsType() {
            return this.itemsType;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final int getMinItems() {
            return this.minItems;
        }

        public int hashCode() {
            return this.displayType.hashCode() + H.d(r.e(this.minItems, Integer.hashCode(this.limit) * 31, 31), 31, this.itemsType);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ParamRecs(limit=");
            sb2.append(this.limit);
            sb2.append(", minItems=");
            sb2.append(this.minItems);
            sb2.append(", itemsType=");
            sb2.append(this.itemsType);
            sb2.append(", displayType=");
            return C22026a.c(sb2, this.displayType, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.limit);
            parcel.writeInt(this.minItems);
            parcel.writeString(this.itemsType);
            parcel.writeString(this.displayType);
        }
    }

    public ItemsRequestParams(@k String str, @l ParamRecs paramRecs) {
        this.source = str;
        this.paramRecs = paramRecs;
    }

    public static /* synthetic */ ItemsRequestParams copy$default(ItemsRequestParams itemsRequestParams, String str, ParamRecs paramRecs, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = itemsRequestParams.source;
        }
        if ((i12 & 2) != 0) {
            paramRecs = itemsRequestParams.paramRecs;
        }
        return itemsRequestParams.copy(str, paramRecs);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ParamRecs getParamRecs() {
        return this.paramRecs;
    }

    @k
    public final ItemsRequestParams copy(@k String source, @l ParamRecs paramRecs) {
        return new ItemsRequestParams(source, paramRecs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsRequestParams)) {
            return false;
        }
        ItemsRequestParams itemsRequestParams = (ItemsRequestParams) other;
        return L.f(this.source, itemsRequestParams.source) && L.f(this.paramRecs, itemsRequestParams.paramRecs);
    }

    @l
    public final ParamRecs getParamRecs() {
        return this.paramRecs;
    }

    @k
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        ParamRecs paramRecs = this.paramRecs;
        return iHashCode + (paramRecs == null ? 0 : paramRecs.hashCode());
    }

    @k
    public String toString() {
        return "ItemsRequestParams(source=" + this.source + ", paramRecs=" + this.paramRecs + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.source);
        ParamRecs paramRecs = this.paramRecs;
        if (paramRecs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramRecs.writeToParcel(parcel, flags);
        }
    }
}
