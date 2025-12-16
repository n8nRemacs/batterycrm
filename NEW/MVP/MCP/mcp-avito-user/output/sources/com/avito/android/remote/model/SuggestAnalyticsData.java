package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAnalyticsData.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/SuggestAnalyticsData;", "Landroid/os/Parcelable;", "", "cid", "iid", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/SuggestAnalyticsData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCid", "getIid", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuggestAnalyticsData implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestAnalyticsData> CREATOR = new Creator();

    @c("cid")
    @l
    private final String cid;

    @c("iid")
    @l
    private final String iid;

    @c("type")
    @l
    private final String type;

    /* compiled from: SuggestAnalyticsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuggestAnalyticsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestAnalyticsData createFromParcel(@k Parcel parcel) {
            return new SuggestAnalyticsData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestAnalyticsData[] newArray(int i12) {
            return new SuggestAnalyticsData[i12];
        }
    }

    public SuggestAnalyticsData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SuggestAnalyticsData copy$default(SuggestAnalyticsData suggestAnalyticsData, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = suggestAnalyticsData.cid;
        }
        if ((i12 & 2) != 0) {
            str2 = suggestAnalyticsData.iid;
        }
        if ((i12 & 4) != 0) {
            str3 = suggestAnalyticsData.type;
        }
        return suggestAnalyticsData.copy(str, str2, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIid() {
        return this.iid;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    public final SuggestAnalyticsData copy(@l String cid, @l String iid, @l String type) {
        return new SuggestAnalyticsData(cid, iid, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestAnalyticsData)) {
            return false;
        }
        SuggestAnalyticsData suggestAnalyticsData = (SuggestAnalyticsData) other;
        return L.f(this.cid, suggestAnalyticsData.cid) && L.f(this.iid, suggestAnalyticsData.iid) && L.f(this.type, suggestAnalyticsData.type);
    }

    @l
    public final String getCid() {
        return this.cid;
    }

    @l
    public final String getIid() {
        return this.iid;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.cid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAnalyticsData(cid=");
        sb2.append(this.cid);
        sb2.append(", iid=");
        sb2.append(this.iid);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.cid);
        parcel.writeString(this.iid);
        parcel.writeString(this.type);
    }

    public SuggestAnalyticsData(@l String str, @l String str2, @l String str3) {
        this.cid = str;
        this.iid = str2;
        this.type = str3;
    }

    public /* synthetic */ SuggestAnalyticsData(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
