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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/promo/Placement;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "CENTER_LEFT", "BOTTOM_LEFT", "TOP_RIGHT", "CENTER_RIGHT", "BOTTOM_RIGHT", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Placement implements Parcelable {

    @c("bottom-left")
    public static final Placement BOTTOM_LEFT;

    @c("bottom-right")
    public static final Placement BOTTOM_RIGHT;

    @c("center-left")
    public static final Placement CENTER_LEFT;

    @c("center-right")
    public static final Placement CENTER_RIGHT;

    @k
    public static final Parcelable.Creator<Placement> CREATOR;

    @c("top-left")
    public static final Placement TOP_LEFT;

    @c("top-right")
    public static final Placement TOP_RIGHT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Placement[] f231605b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231606c;

    static {
        Placement placement = new Placement("TOP_LEFT", 0);
        TOP_LEFT = placement;
        Placement placement2 = new Placement("CENTER_LEFT", 1);
        CENTER_LEFT = placement2;
        Placement placement3 = new Placement("BOTTOM_LEFT", 2);
        BOTTOM_LEFT = placement3;
        Placement placement4 = new Placement("TOP_RIGHT", 3);
        TOP_RIGHT = placement4;
        Placement placement5 = new Placement("CENTER_RIGHT", 4);
        CENTER_RIGHT = placement5;
        Placement placement6 = new Placement("BOTTOM_RIGHT", 5);
        BOTTOM_RIGHT = placement6;
        Placement[] placementArr = {placement, placement2, placement3, placement4, placement5, placement6};
        f231605b = placementArr;
        f231606c = kotlin.enums.c.a(placementArr);
        CREATOR = new Parcelable.Creator<Placement>() { // from class: com.avito.android.promo.Placement.a
            @Override // android.os.Parcelable.Creator
            public final Placement createFromParcel(Parcel parcel) {
                return Placement.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Placement[] newArray(int i12) {
                return new Placement[i12];
            }
        };
    }

    private Placement(String str, int i12) {
    }

    public static Placement valueOf(String str) {
        return (Placement) Enum.valueOf(Placement.class, str);
    }

    public static Placement[] values() {
        return (Placement[]) f231605b.clone();
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
