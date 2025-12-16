package com.avito.android.publish.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.ScannerImeiScreen;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScannerParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/scanner/ScannerParams;", "", "Lcom/avito/android/util/OpenParams;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScannerParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ScannerParams> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final ScannerParams f239140d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ScannerParams[] f239141e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f239142f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageConvertOptions f239143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScannerImeiScreen f239144c;

    static {
        ScannerParams scannerParams = new ScannerParams(new ImageConvertOptions(1920, 1920, 95, 4194304), ScannerImeiScreen.f90469d);
        f239140d = scannerParams;
        ScannerParams[] scannerParamsArr = {scannerParams};
        f239141e = scannerParamsArr;
        f239142f = kotlin.enums.c.a(scannerParamsArr);
        CREATOR = new Parcelable.Creator<ScannerParams>() { // from class: com.avito.android.publish.scanner.ScannerParams.a
            @Override // android.os.Parcelable.Creator
            public final ScannerParams createFromParcel(Parcel parcel) {
                return ScannerParams.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ScannerParams[] newArray(int i12) {
                return new ScannerParams[i12];
            }
        };
    }

    public ScannerParams(ImageConvertOptions imageConvertOptions, ScannerImeiScreen scannerImeiScreen) {
        this.f239143b = imageConvertOptions;
        this.f239144c = scannerImeiScreen;
    }

    public static ScannerParams valueOf(String str) {
        return (ScannerParams) Enum.valueOf(ScannerParams.class, str);
    }

    public static ScannerParams[] values() {
        return (ScannerParams[]) f239141e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
