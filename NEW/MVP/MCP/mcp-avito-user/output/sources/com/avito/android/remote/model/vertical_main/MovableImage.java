package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MovableImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/vertical_main/ScaleType;", "scaleType", "Lcom/avito/android/remote/model/vertical_main/Position;", "position", "Lcom/avito/android/remote/model/vertical_main/PromoWidgetConfig;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/ScaleType;Lcom/avito/android/remote/model/vertical_main/Position;Lcom/avito/android/remote/model/vertical_main/PromoWidgetConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/vertical_main/ScaleType;", "getScaleType", "()Lcom/avito/android/remote/model/vertical_main/ScaleType;", "Lcom/avito/android/remote/model/vertical_main/Position;", "getPosition", "()Lcom/avito/android/remote/model/vertical_main/Position;", "Lcom/avito/android/remote/model/vertical_main/PromoWidgetConfig;", "getConfig", "()Lcom/avito/android/remote/model/vertical_main/PromoWidgetConfig;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MovableImage implements Parcelable {

    @k
    public static final Parcelable.Creator<MovableImage> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @l
    private final PromoWidgetConfig config;

    @c("image")
    @k
    private final UniversalImage image;

    @c("position")
    @l
    private final Position position;

    @c("scaleType")
    @l
    private final ScaleType scaleType;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MovableImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MovableImage createFromParcel(@k Parcel parcel) {
            return new MovableImage((UniversalImage) parcel.readParcelable(MovableImage.class.getClassLoader()), parcel.readInt() == 0 ? null : ScaleType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PromoWidgetConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MovableImage[] newArray(int i12) {
            return new MovableImage[i12];
        }
    }

    public MovableImage(@k UniversalImage universalImage, @l ScaleType scaleType, @l Position position, @l PromoWidgetConfig promoWidgetConfig) {
        this.image = universalImage;
        this.scaleType = scaleType;
        this.position = position;
        this.config = promoWidgetConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final PromoWidgetConfig getConfig() {
        return this.config;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final Position getPosition() {
        return this.position;
    }

    @l
    public final ScaleType getScaleType() {
        return this.scaleType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        ScaleType scaleType = this.scaleType;
        if (scaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scaleType.writeToParcel(parcel, flags);
        }
        Position position = this.position;
        if (position == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            position.writeToParcel(parcel, flags);
        }
        PromoWidgetConfig promoWidgetConfig = this.config;
        if (promoWidgetConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoWidgetConfig.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ MovableImage(UniversalImage universalImage, ScaleType scaleType, Position position, PromoWidgetConfig promoWidgetConfig, int i12, C42822w c42822w) {
        this(universalImage, (i12 & 2) != 0 ? null : scaleType, (i12 & 4) != 0 ? null : position, (i12 & 8) != 0 ? null : promoWidgetConfig);
    }
}
