package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.InterfaceC25649b;
import com.avito.android.arch.mvi.t;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BarcodeScannerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lbh/b;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements t<BarcodeScannerInternalAction, InterfaceC25649b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BarcodeScannerParams f99028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.barcode_scanner_impl.domain.a f99029c;

    @Inject
    public p(@Y61.k BarcodeScannerParams barcodeScannerParams, @Y61.k com.avito.android.barcode_scanner_impl.domain.a aVar) {
        this.f99028b = barcodeScannerParams;
        this.f99029c = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25649b b(BarcodeScannerInternalAction barcodeScannerInternalAction) {
        BarcodeScannerInternalAction barcodeScannerInternalAction2 = barcodeScannerInternalAction;
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.BindScannerUI.f98980b)) {
            return new InterfaceC25649b.C2010b(this.f99029c.a(this.f99028b.f99051c));
        }
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.BootstrapRequestCameraPermission.f98983b)) {
            return InterfaceC25649b.a.f57379a;
        }
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.VibrateOneShot.f98990b)) {
            return InterfaceC25649b.f.f57384a;
        }
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.CloseScreen.f98985b)) {
            return InterfaceC25649b.c.f57381a;
        }
        if (barcodeScannerInternalAction2 instanceof BarcodeScannerInternalAction.SubmitResult) {
            return new InterfaceC25649b.d(((BarcodeScannerInternalAction.SubmitResult) barcodeScannerInternalAction2).f98987b);
        }
        if (barcodeScannerInternalAction2.equals(BarcodeScannerInternalAction.UnbindScannerUI.f98989b)) {
            return InterfaceC25649b.e.f57383a;
        }
        return null;
    }
}
