package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SplitSearchParam.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/SplitSearchParam;", "Lcom/avito/android/remote/model/SearchParam;", "Lcom/avito/android/remote/model/SplitSearchParam$Split;", "value", "<init>", "(Lcom/avito/android/remote/model/SplitSearchParam$Split;)V", "component1", "()Lcom/avito/android/remote/model/SplitSearchParam$Split;", "copy", "(Lcom/avito/android/remote/model/SplitSearchParam$Split;)Lcom/avito/android/remote/model/SplitSearchParam;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SplitSearchParam$Split;", "getValue", "Split", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SplitSearchParam extends SearchParam<Split> {

    @k
    public static final Parcelable.Creator<SplitSearchParam> CREATOR = new Creator();

    @k
    private final Split value;

    /* compiled from: SplitSearchParam.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitSearchParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SplitSearchParam createFromParcel(@k Parcel parcel) {
            return new SplitSearchParam(Split.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SplitSearchParam[] newArray(int i12) {
            return new SplitSearchParam[i12];
        }
    }

    /* compiled from: SplitSearchParam.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/SplitSearchParam$Split;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/SplitSearchParam$Split;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFrom", "getTo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Split implements Parcelable {

        @k
        public static final Parcelable.Creator<Split> CREATOR = new Creator();

        @l
        private final String from;

        @l
        private final String to;

        /* compiled from: SplitSearchParam.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Split> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Split createFromParcel(@k Parcel parcel) {
                return new Split(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Split[] newArray(int i12) {
                return new Split[i12];
            }
        }

        public Split(@l String str, @l String str2) {
            this.from = str;
            this.to = str2;
        }

        public static /* synthetic */ Split copy$default(Split split, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = split.from;
            }
            if ((i12 & 2) != 0) {
                str2 = split.to;
            }
            return split.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @k
        public final Split copy(@l String from, @l String to2) {
            return new Split(from, to2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Split)) {
                return false;
            }
            Split split = (Split) other;
            return L.f(this.from, split.from) && L.f(this.to, split.to);
        }

        @l
        public final String getFrom() {
            return this.from;
        }

        @l
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            String str = this.from;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.to;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Split(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return C22026a.c(sb2, this.to, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.from);
            parcel.writeString(this.to);
        }
    }

    public SplitSearchParam(@k Split split) {
        this.value = split;
    }

    public static /* synthetic */ SplitSearchParam copy$default(SplitSearchParam splitSearchParam, Split split, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            split = splitSearchParam.value;
        }
        return splitSearchParam.copy(split);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Split getValue() {
        return this.value;
    }

    @k
    public final SplitSearchParam copy(@k Split value) {
        return new SplitSearchParam(value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SplitSearchParam) && L.f(this.value, ((SplitSearchParam) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @k
    public String toString() {
        return "SplitSearchParam(value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.value.writeToParcel(parcel, flags);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.SearchParam
    @k
    public Split getValue() {
        return this.value;
    }
}
