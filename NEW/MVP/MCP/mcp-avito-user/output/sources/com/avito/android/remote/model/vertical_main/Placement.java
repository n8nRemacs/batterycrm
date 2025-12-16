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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/Placement;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "TOP_LEFT", "CENTER_LEFT", "BOTTOM_LEFT", "TOP_RIGHT", "CENTER_RIGHT", "BOTTOM_RIGHT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Placement implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Placement[] $VALUES;

    @k
    public static final Parcelable.Creator<Placement> CREATOR;

    @c("top-left")
    public static final Placement TOP_LEFT = new Placement("TOP_LEFT", 0);

    @c("center-left")
    public static final Placement CENTER_LEFT = new Placement("CENTER_LEFT", 1);

    @c("bottom-left")
    public static final Placement BOTTOM_LEFT = new Placement("BOTTOM_LEFT", 2);

    @c("top-right")
    public static final Placement TOP_RIGHT = new Placement("TOP_RIGHT", 3);

    @c("center-right")
    public static final Placement CENTER_RIGHT = new Placement("CENTER_RIGHT", 4);

    @c("bottom-right")
    public static final Placement BOTTOM_RIGHT = new Placement("BOTTOM_RIGHT", 5);

    private static final /* synthetic */ Placement[] $values() {
        return new Placement[]{TOP_LEFT, CENTER_LEFT, BOTTOM_LEFT, TOP_RIGHT, CENTER_RIGHT, BOTTOM_RIGHT};
    }

    static {
        Placement[] placementArr$values = $values();
        $VALUES = placementArr$values;
        $ENTRIES = kotlin.enums.c.a(placementArr$values);
        CREATOR = new Parcelable.Creator<Placement>() { // from class: com.avito.android.remote.model.vertical_main.Placement.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Placement createFromParcel(@k Parcel parcel) {
                return Placement.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Placement[] newArray(int i12) {
                return new Placement[i12];
            }
        };
    }

    private Placement(String str, int i12) {
    }

    @k
    public static a<Placement> getEntries() {
        return $ENTRIES;
    }

    public static Placement valueOf(String str) {
        return (Placement) Enum.valueOf(Placement.class, str);
    }

    public static Placement[] values() {
        return (Placement[]) $VALUES.clone();
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
