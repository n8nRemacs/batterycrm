package com.avito.android.barcode_scanner_impl.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.di.B;
import h31.d;
import kotlin.Metadata;

/* compiled from: BarcodeScannerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/di/b;", "", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BarcodeScannerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/di/b$a;", "", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k BarcodeScannerParams barcodeScannerParams, @h31.b @k C28478k c28478k, @k c cVar);
    }

    void a(@k BarcodeScannerFragment barcodeScannerFragment);
}
