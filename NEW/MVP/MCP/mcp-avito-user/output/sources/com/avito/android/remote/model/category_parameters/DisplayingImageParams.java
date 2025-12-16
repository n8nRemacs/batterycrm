package com.avito.android.remote.model.category_parameters;

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
import kotlin.jvm.internal.L;

/* compiled from: DisplayingImageParams.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "Landroid/os/Parcelable;", "", "baseUrl", "", "sizeVariants", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBaseUrl", "Ljava/util/List;", "getSizeVariants", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DisplayingImageParams implements Parcelable {

    @k
    public static final Parcelable.Creator<DisplayingImageParams> CREATOR = new Creator();

    @c("baseUrl")
    @k
    private final String baseUrl;

    @c("sizeVariants")
    @l
    private final List<String> sizeVariants;

    /* compiled from: DisplayingImageParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayingImageParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DisplayingImageParams createFromParcel(@k Parcel parcel) {
            return new DisplayingImageParams(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DisplayingImageParams[] newArray(int i12) {
            return new DisplayingImageParams[i12];
        }
    }

    public DisplayingImageParams(@k String str, @l List<String> list) {
        this.baseUrl = str;
        this.sizeVariants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayingImageParams copy$default(DisplayingImageParams displayingImageParams, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = displayingImageParams.baseUrl;
        }
        if ((i12 & 2) != 0) {
            list = displayingImageParams.sizeVariants;
        }
        return displayingImageParams.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @l
    public final List<String> component2() {
        return this.sizeVariants;
    }

    @k
    public final DisplayingImageParams copy(@k String baseUrl, @l List<String> sizeVariants) {
        return new DisplayingImageParams(baseUrl, sizeVariants);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayingImageParams)) {
            return false;
        }
        DisplayingImageParams displayingImageParams = (DisplayingImageParams) other;
        return L.f(this.baseUrl, displayingImageParams.baseUrl) && L.f(this.sizeVariants, displayingImageParams.sizeVariants);
    }

    @k
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @l
    public final List<String> getSizeVariants() {
        return this.sizeVariants;
    }

    public int hashCode() {
        int iHashCode = this.baseUrl.hashCode() * 31;
        List<String> list = this.sizeVariants;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayingImageParams(baseUrl=");
        sb2.append(this.baseUrl);
        sb2.append(", sizeVariants=");
        return H.p(sb2, this.sizeVariants, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.baseUrl);
        parcel.writeStringList(this.sizeVariants);
    }
}
