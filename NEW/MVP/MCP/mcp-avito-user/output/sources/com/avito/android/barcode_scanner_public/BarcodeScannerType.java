package com.avito.android.barcode_scanner_public;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarcodeScannerParams.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_public/BarcodeScannerType;", "", "Landroid/os/Parcelable;", "_avito_barcode-scanner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeScannerType implements Parcelable {

    @k
    public static final Parcelable.Creator<BarcodeScannerType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final BarcodeScannerType f99053b;

    /* renamed from: c, reason: collision with root package name */
    public static final BarcodeScannerType f99054c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BarcodeScannerType[] f99055d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f99056e;

    static {
        BarcodeScannerType barcodeScannerType = new BarcodeScannerType("CHESTNIY_ZNAK", 0);
        f99053b = barcodeScannerType;
        BarcodeScannerType barcodeScannerType2 = new BarcodeScannerType("DEFAULT", 1);
        f99054c = barcodeScannerType2;
        BarcodeScannerType[] barcodeScannerTypeArr = {barcodeScannerType, barcodeScannerType2};
        f99055d = barcodeScannerTypeArr;
        f99056e = c.a(barcodeScannerTypeArr);
        CREATOR = new Parcelable.Creator<BarcodeScannerType>() { // from class: com.avito.android.barcode_scanner_public.BarcodeScannerType.a
            @Override // android.os.Parcelable.Creator
            public final BarcodeScannerType createFromParcel(Parcel parcel) {
                return BarcodeScannerType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BarcodeScannerType[] newArray(int i12) {
                return new BarcodeScannerType[i12];
            }
        };
    }

    public BarcodeScannerType() {
        throw null;
    }

    public static BarcodeScannerType valueOf(String str) {
        return (BarcodeScannerType) Enum.valueOf(BarcodeScannerType.class, str);
    }

    public static BarcodeScannerType[] values() {
        return (BarcodeScannerType[]) f99055d.clone();
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
