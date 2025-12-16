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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/promo/PromoActionStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "ACCENT", "ACCENT_SECONDARY", "OVERLAY", "OVERLAY_SECONDARY", "PAY", "PAY_SECONDARY", "SUCCESS", "DANGER", "INVERSE", "INVERSE_SECONDARY", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoActionStyle implements Parcelable {

    @c("accent")
    public static final PromoActionStyle ACCENT;

    @c("accentSecondary")
    public static final PromoActionStyle ACCENT_SECONDARY;

    @k
    public static final Parcelable.Creator<PromoActionStyle> CREATOR;

    @c("danger")
    public static final PromoActionStyle DANGER;

    @c("inverse")
    public static final PromoActionStyle INVERSE;

    @c("inverseSecondary")
    public static final PromoActionStyle INVERSE_SECONDARY;

    @c("overlay")
    public static final PromoActionStyle OVERLAY;

    @c("overlaySecondary")
    public static final PromoActionStyle OVERLAY_SECONDARY;

    @c("pay")
    public static final PromoActionStyle PAY;

    @c("paySecondary")
    public static final PromoActionStyle PAY_SECONDARY;

    @c("primary")
    public static final PromoActionStyle PRIMARY;

    @c("secondary")
    public static final PromoActionStyle SECONDARY;

    @c("success")
    public static final PromoActionStyle SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PromoActionStyle[] f231607b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231608c;

    static {
        PromoActionStyle promoActionStyle = new PromoActionStyle("PRIMARY", 0);
        PRIMARY = promoActionStyle;
        PromoActionStyle promoActionStyle2 = new PromoActionStyle("SECONDARY", 1);
        SECONDARY = promoActionStyle2;
        PromoActionStyle promoActionStyle3 = new PromoActionStyle("ACCENT", 2);
        ACCENT = promoActionStyle3;
        PromoActionStyle promoActionStyle4 = new PromoActionStyle("ACCENT_SECONDARY", 3);
        ACCENT_SECONDARY = promoActionStyle4;
        PromoActionStyle promoActionStyle5 = new PromoActionStyle("OVERLAY", 4);
        OVERLAY = promoActionStyle5;
        PromoActionStyle promoActionStyle6 = new PromoActionStyle("OVERLAY_SECONDARY", 5);
        OVERLAY_SECONDARY = promoActionStyle6;
        PromoActionStyle promoActionStyle7 = new PromoActionStyle("PAY", 6);
        PAY = promoActionStyle7;
        PromoActionStyle promoActionStyle8 = new PromoActionStyle("PAY_SECONDARY", 7);
        PAY_SECONDARY = promoActionStyle8;
        PromoActionStyle promoActionStyle9 = new PromoActionStyle("SUCCESS", 8);
        SUCCESS = promoActionStyle9;
        PromoActionStyle promoActionStyle10 = new PromoActionStyle("DANGER", 9);
        DANGER = promoActionStyle10;
        PromoActionStyle promoActionStyle11 = new PromoActionStyle("INVERSE", 10);
        INVERSE = promoActionStyle11;
        PromoActionStyle promoActionStyle12 = new PromoActionStyle("INVERSE_SECONDARY", 11);
        INVERSE_SECONDARY = promoActionStyle12;
        PromoActionStyle[] promoActionStyleArr = {promoActionStyle, promoActionStyle2, promoActionStyle3, promoActionStyle4, promoActionStyle5, promoActionStyle6, promoActionStyle7, promoActionStyle8, promoActionStyle9, promoActionStyle10, promoActionStyle11, promoActionStyle12};
        f231607b = promoActionStyleArr;
        f231608c = kotlin.enums.c.a(promoActionStyleArr);
        CREATOR = new Parcelable.Creator<PromoActionStyle>() { // from class: com.avito.android.promo.PromoActionStyle.a
            @Override // android.os.Parcelable.Creator
            public final PromoActionStyle createFromParcel(Parcel parcel) {
                return PromoActionStyle.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromoActionStyle[] newArray(int i12) {
                return new PromoActionStyle[i12];
            }
        };
    }

    private PromoActionStyle(String str, int i12) {
    }

    public static PromoActionStyle valueOf(String str) {
        return (PromoActionStyle) Enum.valueOf(PromoActionStyle.class, str);
    }

    public static PromoActionStyle[] values() {
        return (PromoActionStyle[]) f231607b.clone();
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
