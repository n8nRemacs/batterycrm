package com.avito.android.promo;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/promo/MovableImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/promo/ScaleType;", "scaleType", "Lcom/avito/android/promo/Position;", "position", "Lcom/avito/android/promo/PromoWidgetConfig;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/promo/ScaleType;Lcom/avito/android/promo/Position;Lcom/avito/android/promo/PromoWidgetConfig;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/promo/ScaleType;", "e", "()Lcom/avito/android/promo/ScaleType;", "Lcom/avito/android/promo/Position;", "d", "()Lcom/avito/android/promo/Position;", "Lcom/avito/android/promo/PromoWidgetConfig;", "c", "()Lcom/avito/android/promo/PromoWidgetConfig;", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MovableImage implements Parcelable {

    @k
    public static final Parcelable.Creator<MovableImage> CREATOR = new a();

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
    public static final class a implements Parcelable.Creator<MovableImage> {
        @Override // android.os.Parcelable.Creator
        public final MovableImage createFromParcel(Parcel parcel) {
            return new MovableImage((UniversalImage) parcel.readParcelable(MovableImage.class.getClassLoader()), parcel.readInt() == 0 ? null : ScaleType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PromoWidgetConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
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

    @l
    /* renamed from: c, reason: from getter */
    public final PromoWidgetConfig getConfig() {
        return this.config;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ScaleType getScaleType() {
        return this.scaleType;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        ScaleType scaleType = this.scaleType;
        if (scaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scaleType.writeToParcel(parcel, i12);
        }
        Position position = this.position;
        if (position == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            position.writeToParcel(parcel, i12);
        }
        PromoWidgetConfig promoWidgetConfig = this.config;
        if (promoWidgetConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoWidgetConfig.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ MovableImage(UniversalImage universalImage, ScaleType scaleType, Position position, PromoWidgetConfig promoWidgetConfig, int i12, C42822w c42822w) {
        this(universalImage, (i12 & 2) != 0 ? null : scaleType, (i12 & 4) != 0 ? null : position, (i12 & 8) != 0 ? null : promoWidgetConfig);
    }
}
