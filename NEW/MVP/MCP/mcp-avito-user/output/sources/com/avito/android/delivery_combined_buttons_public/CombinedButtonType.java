package com.avito.android.delivery_combined_buttons_public;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CombinedButtonType.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/CombinedButtonType;", "", "Landroid/os/Parcelable;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CombinedButtonType implements Parcelable {

    @k
    public static final Parcelable.Creator<CombinedButtonType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final CombinedButtonType f134950b;

    /* renamed from: c, reason: collision with root package name */
    public static final CombinedButtonType f134951c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CombinedButtonType[] f134952d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f134953e;

    static {
        CombinedButtonType combinedButtonType = new CombinedButtonType("BUY_BUTTON", 0);
        f134950b = combinedButtonType;
        CombinedButtonType combinedButtonType2 = new CombinedButtonType("ADD_TO_CART_BUTTON", 1);
        CombinedButtonType combinedButtonType3 = new CombinedButtonType("GO_TO_CART_BUTTON", 2);
        f134951c = combinedButtonType3;
        CombinedButtonType[] combinedButtonTypeArr = {combinedButtonType, combinedButtonType2, combinedButtonType3};
        f134952d = combinedButtonTypeArr;
        f134953e = c.a(combinedButtonTypeArr);
        CREATOR = new Parcelable.Creator<CombinedButtonType>() { // from class: com.avito.android.delivery_combined_buttons_public.CombinedButtonType.a
            @Override // android.os.Parcelable.Creator
            public final CombinedButtonType createFromParcel(Parcel parcel) {
                return CombinedButtonType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CombinedButtonType[] newArray(int i12) {
                return new CombinedButtonType[i12];
            }
        };
    }

    public CombinedButtonType() {
        throw null;
    }

    public static CombinedButtonType valueOf(String str) {
        return (CombinedButtonType) Enum.valueOf(CombinedButtonType.class, str);
    }

    public static CombinedButtonType[] values() {
        return (CombinedButtonType[]) f134952d.clone();
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
