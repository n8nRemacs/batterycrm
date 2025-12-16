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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/PromoActionStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "PRIMARY", "SECONDARY", "ACCENT", "ACCENT_SECONDARY", "OVERLAY", "OVERLAY_SECONDARY", "PAY", "PAY_SECONDARY", "SUCCESS", "DANGER", "INVERSE", "INVERSE_SECONDARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoActionStyle implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromoActionStyle[] $VALUES;

    @k
    public static final Parcelable.Creator<PromoActionStyle> CREATOR;

    @c("primary")
    public static final PromoActionStyle PRIMARY = new PromoActionStyle("PRIMARY", 0);

    @c("secondary")
    public static final PromoActionStyle SECONDARY = new PromoActionStyle("SECONDARY", 1);

    @c("accent")
    public static final PromoActionStyle ACCENT = new PromoActionStyle("ACCENT", 2);

    @c("accentSecondary")
    public static final PromoActionStyle ACCENT_SECONDARY = new PromoActionStyle("ACCENT_SECONDARY", 3);

    @c("overlay")
    public static final PromoActionStyle OVERLAY = new PromoActionStyle("OVERLAY", 4);

    @c("overlaySecondary")
    public static final PromoActionStyle OVERLAY_SECONDARY = new PromoActionStyle("OVERLAY_SECONDARY", 5);

    @c("pay")
    public static final PromoActionStyle PAY = new PromoActionStyle("PAY", 6);

    @c("paySecondary")
    public static final PromoActionStyle PAY_SECONDARY = new PromoActionStyle("PAY_SECONDARY", 7);

    @c("success")
    public static final PromoActionStyle SUCCESS = new PromoActionStyle("SUCCESS", 8);

    @c("danger")
    public static final PromoActionStyle DANGER = new PromoActionStyle("DANGER", 9);

    @c("inverse")
    public static final PromoActionStyle INVERSE = new PromoActionStyle("INVERSE", 10);

    @c("inverseSecondary")
    public static final PromoActionStyle INVERSE_SECONDARY = new PromoActionStyle("INVERSE_SECONDARY", 11);

    private static final /* synthetic */ PromoActionStyle[] $values() {
        return new PromoActionStyle[]{PRIMARY, SECONDARY, ACCENT, ACCENT_SECONDARY, OVERLAY, OVERLAY_SECONDARY, PAY, PAY_SECONDARY, SUCCESS, DANGER, INVERSE, INVERSE_SECONDARY};
    }

    static {
        PromoActionStyle[] promoActionStyleArr$values = $values();
        $VALUES = promoActionStyleArr$values;
        $ENTRIES = kotlin.enums.c.a(promoActionStyleArr$values);
        CREATOR = new Parcelable.Creator<PromoActionStyle>() { // from class: com.avito.android.remote.model.vertical_main.PromoActionStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoActionStyle createFromParcel(@k Parcel parcel) {
                return PromoActionStyle.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoActionStyle[] newArray(int i12) {
                return new PromoActionStyle[i12];
            }
        };
    }

    private PromoActionStyle(String str, int i12) {
    }

    @k
    public static a<PromoActionStyle> getEntries() {
        return $ENTRIES;
    }

    public static PromoActionStyle valueOf(String str) {
        return (PromoActionStyle) Enum.valueOf(PromoActionStyle.class, str);
    }

    public static PromoActionStyle[] values() {
        return (PromoActionStyle[]) $VALUES.clone();
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
