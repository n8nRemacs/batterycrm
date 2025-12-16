package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FmpProducts.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/fmp/EnumPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ABOVE_DESCRIPTION", "BELOW_DESCRIPTION", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EnumPosition implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumPosition[] $VALUES;

    @c("aboveDescription")
    public static final EnumPosition ABOVE_DESCRIPTION = new EnumPosition("ABOVE_DESCRIPTION", 0);

    @c("belowDescription")
    public static final EnumPosition BELOW_DESCRIPTION = new EnumPosition("BELOW_DESCRIPTION", 1);

    @k
    public static final Parcelable.Creator<EnumPosition> CREATOR;

    private static final /* synthetic */ EnumPosition[] $values() {
        return new EnumPosition[]{ABOVE_DESCRIPTION, BELOW_DESCRIPTION};
    }

    static {
        EnumPosition[] enumPositionArr$values = $values();
        $VALUES = enumPositionArr$values;
        $ENTRIES = kotlin.enums.c.a(enumPositionArr$values);
        CREATOR = new Parcelable.Creator<EnumPosition>() { // from class: com.avito.android.remote.model.fmp.EnumPosition.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EnumPosition createFromParcel(@k Parcel parcel) {
                return EnumPosition.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EnumPosition[] newArray(int i12) {
                return new EnumPosition[i12];
            }
        };
    }

    private EnumPosition(String str, int i12) {
    }

    @k
    public static a<EnumPosition> getEntries() {
        return $ENTRIES;
    }

    public static EnumPosition valueOf(String str) {
        return (EnumPosition) Enum.valueOf(EnumPosition.class, str);
    }

    public static EnumPosition[] values() {
        return (EnumPosition[]) $VALUES.clone();
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
