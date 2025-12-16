package com.avito.android.promo;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/promo/ScaleType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "FIT_XY", "FIT_START", "FIT_CENTER", "FIT_END", "CENTER", "CENTER_INSIDE", "CENTER_CROP", "FOCUS_CROP", "FIT_BOTTOM_START", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScaleType implements Parcelable {

    @c("center")
    public static final ScaleType CENTER;

    @c("centerCrop")
    public static final ScaleType CENTER_CROP;

    @c("centerInside")
    public static final ScaleType CENTER_INSIDE;

    @k
    public static final Parcelable.Creator<ScaleType> CREATOR;

    @c("fitBottomStart")
    public static final ScaleType FIT_BOTTOM_START;

    @c("fitCenter")
    public static final ScaleType FIT_CENTER;

    @c("fitEnd")
    public static final ScaleType FIT_END;

    @c("fitStart")
    public static final ScaleType FIT_START;

    @c("fitXY")
    public static final ScaleType FIT_XY;

    @c("focusCrop")
    public static final ScaleType FOCUS_CROP;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ScaleType[] f231638b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231639c;

    static {
        ScaleType scaleType = new ScaleType("FIT_XY", 0);
        FIT_XY = scaleType;
        ScaleType scaleType2 = new ScaleType("FIT_START", 1);
        FIT_START = scaleType2;
        ScaleType scaleType3 = new ScaleType("FIT_CENTER", 2);
        FIT_CENTER = scaleType3;
        ScaleType scaleType4 = new ScaleType("FIT_END", 3);
        FIT_END = scaleType4;
        ScaleType scaleType5 = new ScaleType("CENTER", 4);
        CENTER = scaleType5;
        ScaleType scaleType6 = new ScaleType("CENTER_INSIDE", 5);
        CENTER_INSIDE = scaleType6;
        ScaleType scaleType7 = new ScaleType("CENTER_CROP", 6);
        CENTER_CROP = scaleType7;
        ScaleType scaleType8 = new ScaleType("FOCUS_CROP", 7);
        FOCUS_CROP = scaleType8;
        ScaleType scaleType9 = new ScaleType("FIT_BOTTOM_START", 8);
        FIT_BOTTOM_START = scaleType9;
        ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4, scaleType5, scaleType6, scaleType7, scaleType8, scaleType9};
        f231638b = scaleTypeArr;
        f231639c = kotlin.enums.c.a(scaleTypeArr);
        CREATOR = new Parcelable.Creator<ScaleType>() { // from class: com.avito.android.promo.ScaleType.a
            @Override // android.os.Parcelable.Creator
            public final ScaleType createFromParcel(Parcel parcel) {
                return ScaleType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ScaleType[] newArray(int i12) {
                return new ScaleType[i12];
            }
        };
    }

    private ScaleType(String str, int i12) {
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) f231638b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
