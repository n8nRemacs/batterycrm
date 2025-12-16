package com.avito.android.publish.scanner_v2.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.publish.di.W;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment;
import com.avito.android.remote.model.category_parameters.VinScanner;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: VinScannerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/scanner_v2/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: VinScannerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k F70.a aVar, @k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k VinScannerFragment vinScannerFragment, @h31.b @k VinScannerFragment vinScannerFragment2, @h31.b @k VinScanner vinScanner, @W @h31.b int i12, @h31.b @k ScannerOpenParams scannerOpenParams, @h31.b @k C28478k c28478k);
    }

    void a(@k VinScannerFragment vinScannerFragment);
}
