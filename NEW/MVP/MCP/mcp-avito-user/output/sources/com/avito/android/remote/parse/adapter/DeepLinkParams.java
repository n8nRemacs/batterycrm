package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBrokerV2.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DeepLinkParams;", "Landroid/os/Parcelable;", "", "pagePath", "screenName", "heightMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getScreenName", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeepLinkParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DeepLinkParams> CREATOR = new a();

    @com.google.gson.annotations.c("heightMode")
    @Y61.l
    private final String heightMode;

    @com.google.gson.annotations.c("pagePath")
    @Y61.k
    private final String pagePath;

    @com.google.gson.annotations.c("screenName")
    @Y61.l
    private final String screenName;

    /* compiled from: AdvertCreditCompositeBrokerV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeepLinkParams> {
        @Override // android.os.Parcelable.Creator
        public final DeepLinkParams createFromParcel(Parcel parcel) {
            return new DeepLinkParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeepLinkParams[] newArray(int i12) {
            return new DeepLinkParams[i12];
        }
    }

    public DeepLinkParams(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.pagePath = str;
        this.screenName = str2;
        this.heightMode = str3;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getHeightMode() {
        return this.heightMode;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPagePath() {
        return this.pagePath;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkParams)) {
            return false;
        }
        DeepLinkParams deepLinkParams = (DeepLinkParams) obj;
        return kotlin.jvm.internal.L.f(this.pagePath, deepLinkParams.pagePath) && kotlin.jvm.internal.L.f(this.screenName, deepLinkParams.screenName) && kotlin.jvm.internal.L.f(this.heightMode, deepLinkParams.heightMode);
    }

    @Y61.l
    public final String getScreenName() {
        return this.screenName;
    }

    public final int hashCode() {
        int iHashCode = this.pagePath.hashCode() * 31;
        String str = this.screenName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.heightMode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeepLinkParams(pagePath=");
        sb2.append(this.pagePath);
        sb2.append(", screenName=");
        sb2.append(this.screenName);
        sb2.append(", heightMode=");
        return C22026a.c(sb2, this.heightMode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.pagePath);
        parcel.writeString(this.screenName);
        parcel.writeString(this.heightMode);
    }
}
