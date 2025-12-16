package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ActivationEstimateResponseV2.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/cpt/remote/model/ItemData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "title", "", "pricePenny", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;J)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "J", "c", "()J", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemData implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemData> CREATOR = new a();

    @c("image")
    @k
    private final Image image;

    @c("pricePenny")
    private final long pricePenny;

    @c("title")
    @l
    private final String title;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemData> {
        @Override // android.os.Parcelable.Creator
        public final ItemData createFromParcel(Parcel parcel) {
            return new ItemData((Image) parcel.readParcelable(ItemData.class.getClassLoader()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemData[] newArray(int i12) {
            return new ItemData[i12];
        }
    }

    public ItemData(@k Image image, @l String str, long j12) {
        this.image = image;
        this.title = str;
        this.pricePenny = j12;
    }

    /* renamed from: c, reason: from getter */
    public final long getPricePenny() {
        return this.pricePenny;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.title);
        parcel.writeLong(this.pricePenny);
    }
}
