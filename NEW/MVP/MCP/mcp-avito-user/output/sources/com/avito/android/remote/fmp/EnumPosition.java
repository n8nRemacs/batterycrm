package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FmpProductsUtil.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/fmp/EnumPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "ABOVE_DESCRIPTION", "BELOW_DESCRIPTION", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EnumPosition implements Parcelable {

    @c("aboveDescription")
    public static final EnumPosition ABOVE_DESCRIPTION;

    @c("belowDescription")
    public static final EnumPosition BELOW_DESCRIPTION;

    @k
    public static final Parcelable.Creator<EnumPosition> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumPosition[] f253455b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253456c;

    static {
        EnumPosition enumPosition = new EnumPosition("ABOVE_DESCRIPTION", 0);
        ABOVE_DESCRIPTION = enumPosition;
        EnumPosition enumPosition2 = new EnumPosition("BELOW_DESCRIPTION", 1);
        BELOW_DESCRIPTION = enumPosition2;
        EnumPosition[] enumPositionArr = {enumPosition, enumPosition2};
        f253455b = enumPositionArr;
        f253456c = kotlin.enums.c.a(enumPositionArr);
        CREATOR = new Parcelable.Creator<EnumPosition>() { // from class: com.avito.android.remote.fmp.EnumPosition.a
            @Override // android.os.Parcelable.Creator
            public final EnumPosition createFromParcel(Parcel parcel) {
                return EnumPosition.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumPosition[] newArray(int i12) {
                return new EnumPosition[i12];
            }
        };
    }

    private EnumPosition(String str, int i12) {
    }

    public static EnumPosition valueOf(String str) {
        return (EnumPosition) Enum.valueOf(EnumPosition.class, str);
    }

    public static EnumPosition[] values() {
        return (EnumPosition[]) f253455b.clone();
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
