package com.avito.android.remote.model.toolbar_download;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDownloadFileInfoResponse.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadFileInfoResult;", "Landroid/os/Parcelable;", "", ContextActionHandler.Link.URL, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadFileInfoResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsDownloadFileInfoResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsDownloadFileInfoResult> CREATOR = new Creator();

    @c("name")
    @k
    private final String name;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* compiled from: AdvertDetailsDownloadFileInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsDownloadFileInfoResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsDownloadFileInfoResult createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsDownloadFileInfoResult(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsDownloadFileInfoResult[] newArray(int i12) {
            return new AdvertDetailsDownloadFileInfoResult[i12];
        }
    }

    public AdvertDetailsDownloadFileInfoResult(@k String str, @k String str2) {
        this.url = str;
        this.name = str2;
    }

    public static /* synthetic */ AdvertDetailsDownloadFileInfoResult copy$default(AdvertDetailsDownloadFileInfoResult advertDetailsDownloadFileInfoResult, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertDetailsDownloadFileInfoResult.url;
        }
        if ((i12 & 2) != 0) {
            str2 = advertDetailsDownloadFileInfoResult.name;
        }
        return advertDetailsDownloadFileInfoResult.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final AdvertDetailsDownloadFileInfoResult copy(@k String url, @k String name) {
        return new AdvertDetailsDownloadFileInfoResult(url, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsDownloadFileInfoResult)) {
            return false;
        }
        AdvertDetailsDownloadFileInfoResult advertDetailsDownloadFileInfoResult = (AdvertDetailsDownloadFileInfoResult) other;
        return L.f(this.url, advertDetailsDownloadFileInfoResult.url) && L.f(this.name, advertDetailsDownloadFileInfoResult.name);
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.url.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDownloadFileInfoResult(url=");
        sb2.append(this.url);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
    }
}
