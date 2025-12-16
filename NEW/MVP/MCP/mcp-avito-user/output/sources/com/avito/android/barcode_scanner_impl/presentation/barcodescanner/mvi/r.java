package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.AbstractC25650c;
import com.avito.android.arch.mvi.u;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.CameraFlashState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BarcodeScannerReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lbh/c;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements u<BarcodeScannerInternalAction, AbstractC25650c> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC25650c a(BarcodeScannerInternalAction barcodeScannerInternalAction, AbstractC25650c abstractC25650c) {
        BarcodeScannerInternalAction barcodeScannerInternalAction2 = barcodeScannerInternalAction;
        AbstractC25650c abstractC25650c2 = abstractC25650c;
        if (barcodeScannerInternalAction2 instanceof BarcodeScannerInternalAction.CameraPermissionDenied) {
            return new AbstractC25650c.C2011c(((BarcodeScannerInternalAction.CameraPermissionDenied) barcodeScannerInternalAction2).f98984b);
        }
        if (barcodeScannerInternalAction2 instanceof BarcodeScannerInternalAction.BarcodeDetected) {
            BarcodeScannerInternalAction.BarcodeDetected barcodeDetected = (BarcodeScannerInternalAction.BarcodeDetected) barcodeScannerInternalAction2;
            return new AbstractC25650c.a(barcodeDetected.f98979c, barcodeDetected.f98978b);
        }
        if (barcodeScannerInternalAction2 instanceof BarcodeScannerInternalAction.BindScannerUISuccess) {
            if (!(abstractC25650c2 instanceof AbstractC25650c.e)) {
                abstractC25650c2 = null;
            }
            AbstractC25650c.e eVar = (AbstractC25650c.e) abstractC25650c2;
            if (eVar != null) {
                return AbstractC25650c.e.a(eVar, null, true, 3);
            }
            BarcodeScannerInternalAction.BindScannerUISuccess bindScannerUISuccess = (BarcodeScannerInternalAction.BindScannerUISuccess) barcodeScannerInternalAction2;
            return new AbstractC25650c.e(bindScannerUISuccess.f98982c, bindScannerUISuccess.f98981b ? CameraFlashState.f98991c : CameraFlashState.f98993e, true);
        }
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.UnbindScannerUI.f98989b)) {
            AbstractC25650c.e eVar2 = (AbstractC25650c.e) (!(abstractC25650c2 instanceof AbstractC25650c.e) ? null : abstractC25650c2);
            return eVar2 != null ? AbstractC25650c.e.a(eVar2, null, false, 3) : abstractC25650c2;
        }
        if (!barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.ToggleFlashlight.f98988b)) {
            return barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.ScannerInternalFailure.f98986b) ? AbstractC25650c.d.f57390d : abstractC25650c2;
        }
        AbstractC25650c.e eVar3 = (AbstractC25650c.e) (abstractC25650c2 instanceof AbstractC25650c.e ? abstractC25650c2 : null);
        if (eVar3 == null) {
            return abstractC25650c2;
        }
        CameraFlashState cameraFlashState = eVar3.f57392e;
        int iOrdinal = cameraFlashState.ordinal();
        if (iOrdinal == 0) {
            cameraFlashState = CameraFlashState.f98992d;
        } else if (iOrdinal == 1) {
            cameraFlashState = CameraFlashState.f98991c;
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC25650c.e.a(eVar3, cameraFlashState, false, 5);
    }
}
