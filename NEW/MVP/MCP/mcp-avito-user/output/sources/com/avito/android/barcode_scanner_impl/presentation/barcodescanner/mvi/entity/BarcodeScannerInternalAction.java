package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeScannerInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BarcodeDetected", "BindScannerUI", "BindScannerUISuccess", "BootstrapRequestCameraPermission", "CameraPermissionDenied", "CloseScreen", "ScannerInternalFailure", "SubmitResult", "ToggleFlashlight", "UnbindScannerUI", "VibrateOneShot", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BarcodeDetected;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BindScannerUI;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BindScannerUISuccess;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BootstrapRequestCameraPermission;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$CameraPermissionDenied;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$CloseScreen;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$ScannerInternalFailure;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$SubmitResult;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$ToggleFlashlight;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$UnbindScannerUI;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$VibrateOneShot;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeScannerInternalAction extends n {

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BarcodeDetected;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BarcodeDetected implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f98978b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bitmap f98979c;

        public BarcodeDetected(@l Bitmap bitmap, @k String str) {
            this.f98978b = str;
            this.f98979c = bitmap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeDetected)) {
                return false;
            }
            BarcodeDetected barcodeDetected = (BarcodeDetected) obj;
            return L.f(this.f98978b, barcodeDetected.f98978b) && L.f(this.f98979c, barcodeDetected.f98979c);
        }

        public final int hashCode() {
            int iHashCode = this.f98978b.hashCode() * 31;
            Bitmap bitmap = this.f98979c;
            return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        @k
        public final String toString() {
            return "BarcodeDetected(value=" + this.f98978b + ", bitmap=" + this.f98979c + ')';
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BindScannerUI;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BindScannerUI implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BindScannerUI f98980b = new BindScannerUI();

        private BindScannerUI() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BindScannerUISuccess;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BindScannerUISuccess implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98981b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f98982c;

        public BindScannerUISuccess(@k PrintableText printableText, boolean z12) {
            this.f98981b = z12;
            this.f98982c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BindScannerUISuccess)) {
                return false;
            }
            BindScannerUISuccess bindScannerUISuccess = (BindScannerUISuccess) obj;
            return this.f98981b == bindScannerUISuccess.f98981b && L.f(this.f98982c, bindScannerUISuccess.f98982c);
        }

        public final int hashCode() {
            return this.f98982c.hashCode() + (Boolean.hashCode(this.f98981b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BindScannerUISuccess(isFlashlightAvailable=");
            sb2.append(this.f98981b);
            sb2.append(", scannerDescription=");
            return c.m(sb2, this.f98982c, ')');
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$BootstrapRequestCameraPermission;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BootstrapRequestCameraPermission implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BootstrapRequestCameraPermission f98983b = new BootstrapRequestCameraPermission();

        private BootstrapRequestCameraPermission() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$CameraPermissionDenied;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CameraPermissionDenied implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PermissionDenialType f98984b;

        public CameraPermissionDenied(@k PermissionDenialType permissionDenialType) {
            this.f98984b = permissionDenialType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraPermissionDenied) && this.f98984b == ((CameraPermissionDenied) obj).f98984b;
        }

        public final int hashCode() {
            return this.f98984b.hashCode();
        }

        @k
        public final String toString() {
            return "CameraPermissionDenied(denialType=" + this.f98984b + ')';
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$CloseScreen;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f98985b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$ScannerInternalFailure;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScannerInternalFailure implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScannerInternalFailure f98986b = new ScannerInternalFailure();

        private ScannerInternalFailure() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$SubmitResult;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitResult implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f98987b;

        public SubmitResult(@k String str) {
            this.f98987b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitResult) && L.f(this.f98987b, ((SubmitResult) obj).f98987b);
        }

        public final int hashCode() {
            return this.f98987b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubmitResult(value="), this.f98987b, ')');
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$ToggleFlashlight;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToggleFlashlight implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ToggleFlashlight f98988b = new ToggleFlashlight();

        private ToggleFlashlight() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$UnbindScannerUI;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnbindScannerUI implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnbindScannerUI f98989b = new UnbindScannerUI();

        private UnbindScannerUI() {
        }
    }

    /* compiled from: BarcodeScannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction$VibrateOneShot;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VibrateOneShot implements BarcodeScannerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final VibrateOneShot f98990b = new VibrateOneShot();

        private VibrateOneShot() {
        }
    }
}
