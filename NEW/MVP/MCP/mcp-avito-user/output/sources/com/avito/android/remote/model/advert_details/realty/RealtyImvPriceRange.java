package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyImvPriceRange.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/RealtyImvPriceRange;", "Landroid/os/Parcelable;", "", "leftBorder", "rightBorder", "", "pointPosition", "Lcom/avito/android/remote/model/UniversalColor;", "trackColor", "borderColor", "pointColor", "pointHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLeftBorder", "()Ljava/lang/String;", "getRightBorder", "F", "getPointPosition", "()F", "Lcom/avito/android/remote/model/UniversalColor;", "getTrackColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBorderColor", "getPointColor", "getPointHint", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyImvPriceRange implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyImvPriceRange> CREATOR = new Creator();

    @c("borderColor")
    @k
    private final UniversalColor borderColor;

    @c("leftBorder")
    @k
    private final String leftBorder;

    @c("pointColor")
    @k
    private final UniversalColor pointColor;

    @c("pointHint")
    @k
    private final String pointHint;

    @c("pointPosition")
    private final float pointPosition;

    @c("rightBorder")
    @k
    private final String rightBorder;

    @c("trackColor")
    @k
    private final UniversalColor trackColor;

    /* compiled from: RealtyImvPriceRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyImvPriceRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvPriceRange createFromParcel(@k Parcel parcel) {
            return new RealtyImvPriceRange(parcel.readString(), parcel.readString(), parcel.readFloat(), (UniversalColor) parcel.readParcelable(RealtyImvPriceRange.class.getClassLoader()), (UniversalColor) parcel.readParcelable(RealtyImvPriceRange.class.getClassLoader()), (UniversalColor) parcel.readParcelable(RealtyImvPriceRange.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvPriceRange[] newArray(int i12) {
            return new RealtyImvPriceRange[i12];
        }
    }

    public RealtyImvPriceRange(@k String str, @k String str2, float f12, @k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3, @k String str3) {
        this.leftBorder = str;
        this.rightBorder = str2;
        this.pointPosition = f12;
        this.trackColor = universalColor;
        this.borderColor = universalColor2;
        this.pointColor = universalColor3;
        this.pointHint = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final UniversalColor getBorderColor() {
        return this.borderColor;
    }

    @k
    public final String getLeftBorder() {
        return this.leftBorder;
    }

    @k
    public final UniversalColor getPointColor() {
        return this.pointColor;
    }

    @k
    public final String getPointHint() {
        return this.pointHint;
    }

    public final float getPointPosition() {
        return this.pointPosition;
    }

    @k
    public final String getRightBorder() {
        return this.rightBorder;
    }

    @k
    public final UniversalColor getTrackColor() {
        return this.trackColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.leftBorder);
        parcel.writeString(this.rightBorder);
        parcel.writeFloat(this.pointPosition);
        parcel.writeParcelable(this.trackColor, flags);
        parcel.writeParcelable(this.borderColor, flags);
        parcel.writeParcelable(this.pointColor, flags);
        parcel.writeString(this.pointHint);
    }
}
