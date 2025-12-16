package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/early_access/remote/model/FakedoorInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FakedoorInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<FakedoorInfo> CREATOR = new a();

    @c("fakedoorDescription")
    @k
    private final String description;

    @c("fakedoorImage")
    @k
    private final UniversalImage image;

    @c("fakedoorTitle")
    @k
    private final String title;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FakedoorInfo> {
        @Override // android.os.Parcelable.Creator
        public final FakedoorInfo createFromParcel(Parcel parcel) {
            return new FakedoorInfo(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(FakedoorInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FakedoorInfo[] newArray(int i12) {
            return new FakedoorInfo[i12];
        }
    }

    public FakedoorInfo(@k String str, @k String str2, @k UniversalImage universalImage) {
        this.title = str;
        this.description = str2;
        this.image = universalImage;
    }

    @k
    public final ReEarlyAccessData.FakedoorInfo c() {
        return new ReEarlyAccessData.FakedoorInfo(this.title, this.description, this.image);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakedoorInfo)) {
            return false;
        }
        FakedoorInfo fakedoorInfo = (FakedoorInfo) obj;
        return L.f(this.title, fakedoorInfo.title) && L.f(this.description, fakedoorInfo.description) && L.f(this.image, fakedoorInfo.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FakedoorInfo(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, i12);
    }
}
