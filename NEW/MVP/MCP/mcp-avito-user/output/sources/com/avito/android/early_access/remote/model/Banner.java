package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access/remote/model/Banner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "icon", "", "text", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "getIcon", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Banner implements Parcelable {

    @k
    public static final Parcelable.Creator<Banner> CREATOR = new a();

    @c("icon")
    @k
    private final Image icon;

    @c("text")
    @k
    private final String text;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Banner> {
        @Override // android.os.Parcelable.Creator
        public final Banner createFromParcel(Parcel parcel) {
            return new Banner((Image) parcel.readParcelable(Banner.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Banner[] newArray(int i12) {
            return new Banner[i12];
        }
    }

    public Banner(@k Image image, @k String str) {
        this.icon = image;
        this.text = str;
    }

    @k
    public final ReEarlyAccessData.BannerData c() {
        return new ReEarlyAccessData.BannerData(this.text, this.icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        return L.f(this.icon, banner.icon) && L.f(this.text, banner.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.icon.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Banner(icon=");
        sb2.append(this.icon);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeString(this.text);
    }
}
