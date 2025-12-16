package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/ScaleType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "FIT_XY", "FIT_START", "FIT_CENTER", "FIT_END", "CENTER", "CENTER_INSIDE", "CENTER_CROP", "FOCUS_CROP", "FIT_BOTTOM_START", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ScaleType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ScaleType[] $VALUES;

    @k
    public static final Parcelable.Creator<ScaleType> CREATOR;

    @c("fitXY")
    public static final ScaleType FIT_XY = new ScaleType("FIT_XY", 0);

    @c("fitStart")
    public static final ScaleType FIT_START = new ScaleType("FIT_START", 1);

    @c("fitCenter")
    public static final ScaleType FIT_CENTER = new ScaleType("FIT_CENTER", 2);

    @c("fitEnd")
    public static final ScaleType FIT_END = new ScaleType("FIT_END", 3);

    @c("center")
    public static final ScaleType CENTER = new ScaleType("CENTER", 4);

    @c("centerInside")
    public static final ScaleType CENTER_INSIDE = new ScaleType("CENTER_INSIDE", 5);

    @c("centerCrop")
    public static final ScaleType CENTER_CROP = new ScaleType("CENTER_CROP", 6);

    @c("focusCrop")
    public static final ScaleType FOCUS_CROP = new ScaleType("FOCUS_CROP", 7);

    @c("fitBottomStart")
    public static final ScaleType FIT_BOTTOM_START = new ScaleType("FIT_BOTTOM_START", 8);

    private static final /* synthetic */ ScaleType[] $values() {
        return new ScaleType[]{FIT_XY, FIT_START, FIT_CENTER, FIT_END, CENTER, CENTER_INSIDE, CENTER_CROP, FOCUS_CROP, FIT_BOTTOM_START};
    }

    static {
        ScaleType[] scaleTypeArr$values = $values();
        $VALUES = scaleTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(scaleTypeArr$values);
        CREATOR = new Parcelable.Creator<ScaleType>() { // from class: com.avito.android.remote.model.vertical_main.ScaleType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ScaleType createFromParcel(@k Parcel parcel) {
                return ScaleType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ScaleType[] newArray(int i12) {
                return new ScaleType[i12];
            }
        };
    }

    private ScaleType(String str, int i12) {
    }

    @k
    public static a<ScaleType> getEntries() {
        return $ENTRIES;
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(name());
    }
}
