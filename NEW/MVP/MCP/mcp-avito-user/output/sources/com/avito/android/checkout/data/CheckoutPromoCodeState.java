package com.avito.android.checkout.data;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckoutPromoCodeState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/data/CheckoutPromoCodeState;", "", "Landroid/os/Parcelable;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutPromoCodeState implements Parcelable {

    @k
    public static final Parcelable.Creator<CheckoutPromoCodeState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final CheckoutPromoCodeState f118138b;

    /* renamed from: c, reason: collision with root package name */
    public static final CheckoutPromoCodeState f118139c;

    /* renamed from: d, reason: collision with root package name */
    public static final CheckoutPromoCodeState f118140d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CheckoutPromoCodeState[] f118141e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f118142f;

    static {
        CheckoutPromoCodeState checkoutPromoCodeState = new CheckoutPromoCodeState("NORMAL", 0);
        f118138b = checkoutPromoCodeState;
        CheckoutPromoCodeState checkoutPromoCodeState2 = new CheckoutPromoCodeState("APPLIED", 1);
        f118139c = checkoutPromoCodeState2;
        CheckoutPromoCodeState checkoutPromoCodeState3 = new CheckoutPromoCodeState("INVALID", 2);
        f118140d = checkoutPromoCodeState3;
        CheckoutPromoCodeState[] checkoutPromoCodeStateArr = {checkoutPromoCodeState, checkoutPromoCodeState2, checkoutPromoCodeState3};
        f118141e = checkoutPromoCodeStateArr;
        f118142f = kotlin.enums.c.a(checkoutPromoCodeStateArr);
        CREATOR = new Parcelable.Creator<CheckoutPromoCodeState>() { // from class: com.avito.android.checkout.data.CheckoutPromoCodeState.a
            @Override // android.os.Parcelable.Creator
            public final CheckoutPromoCodeState createFromParcel(Parcel parcel) {
                return CheckoutPromoCodeState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CheckoutPromoCodeState[] newArray(int i12) {
                return new CheckoutPromoCodeState[i12];
            }
        };
    }

    public CheckoutPromoCodeState() {
        throw null;
    }

    public static CheckoutPromoCodeState valueOf(String str) {
        return (CheckoutPromoCodeState) Enum.valueOf(CheckoutPromoCodeState.class, str);
    }

    public static CheckoutPromoCodeState[] values() {
        return (CheckoutPromoCodeState[]) f118141e.clone();
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
