package com.avito.android.barcode_scanner_impl.domain;

import QZ0.a;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BarcodeFormatMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/domain/b;", "Lcom/avito/android/barcode_scanner_impl/domain/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.barcode_scanner_impl.domain.a {

    /* compiled from: BarcodeFormatMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BarcodeScannerType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<BarcodeScannerType> creator = BarcodeScannerType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.barcode_scanner_impl.domain.a
    @a.b
    public final int a(@k BarcodeScannerType barcodeScannerType) {
        int iOrdinal = barcodeScannerType.ordinal();
        if (iOrdinal == 0) {
            return 16;
        }
        if (iOrdinal == 1) {
            return 256;
        }
        throw new NoWhenBranchMatchedException();
    }
}
