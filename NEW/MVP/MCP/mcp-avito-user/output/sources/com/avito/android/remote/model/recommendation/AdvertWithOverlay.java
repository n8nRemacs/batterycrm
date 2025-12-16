package com.avito.android.remote.model.recommendation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.AdvertImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertWithOverlay.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay$Overlay;", "overlay", "Lcom/avito/android/remote/model/AdvertImage;", "image", "<init>", "(Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay$Overlay;Lcom/avito/android/remote/model/AdvertImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay$Overlay;", "getOverlay", "()Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay$Overlay;", "Lcom/avito/android/remote/model/AdvertImage;", "getImage", "()Lcom/avito/android/remote/model/AdvertImage;", "Overlay", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertWithOverlay implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertWithOverlay> CREATOR = new Creator();

    @c("images")
    @l
    private final AdvertImage image;

    @c("overlay")
    @l
    private final Overlay overlay;

    /* compiled from: AdvertWithOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertWithOverlay> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertWithOverlay createFromParcel(@k Parcel parcel) {
            return new AdvertWithOverlay(parcel.readInt() == 0 ? null : Overlay.CREATOR.createFromParcel(parcel), (AdvertImage) parcel.readParcelable(AdvertWithOverlay.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertWithOverlay[] newArray(int i12) {
            return new AdvertWithOverlay[i12];
        }
    }

    /* compiled from: AdvertWithOverlay.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/recommendation/AdvertWithOverlay$Overlay;", "Landroid/os/Parcelable;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Overlay implements Parcelable {

        @k
        public static final Parcelable.Creator<Overlay> CREATOR = new Creator();

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertWithOverlay.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Overlay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Overlay createFromParcel(@k Parcel parcel) {
                return new Overlay(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Overlay[] newArray(int i12) {
                return new Overlay[i12];
            }
        }

        public Overlay(@l String str, @l String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    public AdvertWithOverlay(@l Overlay overlay, @l AdvertImage advertImage) {
        this.overlay = overlay;
        this.image = advertImage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AdvertImage getImage() {
        return this.image;
    }

    @l
    public final Overlay getOverlay() {
        return this.overlay;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Overlay overlay = this.overlay;
        if (overlay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlay.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
    }
}
