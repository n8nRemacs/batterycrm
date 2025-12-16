package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTargetingRawResponse.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJP\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;", "Landroid/os/Parcelable;", "", "", "loadUrls", "impressionUrls", "clickUrls", "avitoImpressionUrls", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getLoadUrls", "getImpressionUrls", "getClickUrls", "getAvitoImpressionUrls", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoTargetingRawEventUrls implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoTargetingRawEventUrls> CREATOR = new Creator();

    @c("avito_impression")
    @k
    private final List<String> avitoImpressionUrls;

    @c("click")
    @k
    private final List<String> clickUrls;

    @c("impression")
    @k
    private final List<String> impressionUrls;

    @c("load")
    @k
    private final List<String> loadUrls;

    /* compiled from: AvitoTargetingRawResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoTargetingRawEventUrls> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawEventUrls createFromParcel(@k Parcel parcel) {
            return new AvitoTargetingRawEventUrls(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawEventUrls[] newArray(int i12) {
            return new AvitoTargetingRawEventUrls[i12];
        }
    }

    public AvitoTargetingRawEventUrls() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvitoTargetingRawEventUrls copy$default(AvitoTargetingRawEventUrls avitoTargetingRawEventUrls, List list, List list2, List list3, List list4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = avitoTargetingRawEventUrls.loadUrls;
        }
        if ((i12 & 2) != 0) {
            list2 = avitoTargetingRawEventUrls.impressionUrls;
        }
        if ((i12 & 4) != 0) {
            list3 = avitoTargetingRawEventUrls.clickUrls;
        }
        if ((i12 & 8) != 0) {
            list4 = avitoTargetingRawEventUrls.avitoImpressionUrls;
        }
        return avitoTargetingRawEventUrls.copy(list, list2, list3, list4);
    }

    @k
    public final List<String> component1() {
        return this.loadUrls;
    }

    @k
    public final List<String> component2() {
        return this.impressionUrls;
    }

    @k
    public final List<String> component3() {
        return this.clickUrls;
    }

    @k
    public final List<String> component4() {
        return this.avitoImpressionUrls;
    }

    @k
    public final AvitoTargetingRawEventUrls copy(@k List<String> loadUrls, @k List<String> impressionUrls, @k List<String> clickUrls, @k List<String> avitoImpressionUrls) {
        return new AvitoTargetingRawEventUrls(loadUrls, impressionUrls, clickUrls, avitoImpressionUrls);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoTargetingRawEventUrls)) {
            return false;
        }
        AvitoTargetingRawEventUrls avitoTargetingRawEventUrls = (AvitoTargetingRawEventUrls) other;
        return L.f(this.loadUrls, avitoTargetingRawEventUrls.loadUrls) && L.f(this.impressionUrls, avitoTargetingRawEventUrls.impressionUrls) && L.f(this.clickUrls, avitoTargetingRawEventUrls.clickUrls) && L.f(this.avitoImpressionUrls, avitoTargetingRawEventUrls.avitoImpressionUrls);
    }

    @k
    public final List<String> getAvitoImpressionUrls() {
        return this.avitoImpressionUrls;
    }

    @k
    public final List<String> getClickUrls() {
        return this.clickUrls;
    }

    @k
    public final List<String> getImpressionUrls() {
        return this.impressionUrls;
    }

    @k
    public final List<String> getLoadUrls() {
        return this.loadUrls;
    }

    public int hashCode() {
        return this.avitoImpressionUrls.hashCode() + H.e(H.e(this.loadUrls.hashCode() * 31, 31, this.impressionUrls), 31, this.clickUrls);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTargetingRawEventUrls(loadUrls=");
        sb2.append(this.loadUrls);
        sb2.append(", impressionUrls=");
        sb2.append(this.impressionUrls);
        sb2.append(", clickUrls=");
        sb2.append(this.clickUrls);
        sb2.append(", avitoImpressionUrls=");
        return H.p(sb2, this.avitoImpressionUrls, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.loadUrls);
        parcel.writeStringList(this.impressionUrls);
        parcel.writeStringList(this.clickUrls);
        parcel.writeStringList(this.avitoImpressionUrls);
    }

    public AvitoTargetingRawEventUrls(@k List<String> list, @k List<String> list2, @k List<String> list3, @k List<String> list4) {
        this.loadUrls = list;
        this.impressionUrls = list2;
        this.clickUrls = list3;
        this.avitoImpressionUrls = list4;
    }

    public AvitoTargetingRawEventUrls(List list, List list2, List list3, List list4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? C42784z0.f406748b : list3, (i12 & 8) != 0 ? C42784z0.f406748b : list4);
    }
}
