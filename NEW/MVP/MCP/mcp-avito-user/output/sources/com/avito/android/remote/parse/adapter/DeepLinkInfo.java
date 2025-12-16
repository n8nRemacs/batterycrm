package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBrokerV2.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DeepLinkInfo;", "Landroid/os/Parcelable;", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/parse/adapter/DeepLinkParams;", "params", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/parse/adapter/DeepLinkParams;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/parse/adapter/DeepLinkParams;", "c", "()Lcom/avito/android/remote/parse/adapter/DeepLinkParams;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeepLinkInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DeepLinkInfo> CREATOR = new a();

    @com.google.gson.annotations.c("params")
    @Y61.k
    private final DeepLinkParams params;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final String url;

    /* compiled from: AdvertCreditCompositeBrokerV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeepLinkInfo> {
        @Override // android.os.Parcelable.Creator
        public final DeepLinkInfo createFromParcel(Parcel parcel) {
            return new DeepLinkInfo(parcel.readString(), DeepLinkParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DeepLinkInfo[] newArray(int i12) {
            return new DeepLinkInfo[i12];
        }
    }

    public DeepLinkInfo(@Y61.k String str, @Y61.k DeepLinkParams deepLinkParams) {
        this.url = str;
        this.params = deepLinkParams;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DeepLinkParams getParams() {
        return this.params;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkInfo)) {
            return false;
        }
        DeepLinkInfo deepLinkInfo = (DeepLinkInfo) obj;
        return kotlin.jvm.internal.L.f(this.url, deepLinkInfo.url) && kotlin.jvm.internal.L.f(this.params, deepLinkInfo.params);
    }

    public final int hashCode() {
        return this.params.hashCode() + (this.url.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "DeepLinkInfo(url=" + this.url + ", params=" + this.params + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.url);
        this.params.writeToParcel(parcel, i12);
    }
}
