package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.AbstractC25650c;
import bh.InterfaceC25648a;
import ch.InterfaceC27193a;
import com.avito.android.arch.mvi.a;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BarcodeScannerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lbh/a;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lbh/c;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC25648a, BarcodeScannerInternalAction, AbstractC25650c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BarcodeScannerParams f99001a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27193a f99002b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f99003c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.barcode_scanner_impl.domain.d f99004d;

    @Inject
    public f(@Y61.k BarcodeScannerParams barcodeScannerParams, @Y61.k InterfaceC27193a interfaceC27193a, @Y61.k com.avito.android.barcode_scanner_impl.domain.e eVar, @Y61.k j jVar) {
        this.f99001a = barcodeScannerParams;
        this.f99002b = interfaceC27193a;
        this.f99003c = jVar;
        this.f99004d = eVar.a(barcodeScannerParams.f99051c);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BarcodeScannerInternalAction> b(InterfaceC25648a interfaceC25648a, AbstractC25650c abstractC25650c) {
        C43210w c43210w;
        InterfaceC25648a interfaceC25648a2 = interfaceC25648a;
        AbstractC25650c abstractC25650c2 = abstractC25650c;
        this.f99003c.a(interfaceC25648a2);
        if (interfaceC25648a2 instanceof InterfaceC25648a.c) {
            return new C43210w(new BarcodeScannerInternalAction.CameraPermissionDenied(((InterfaceC25648a.c) interfaceC25648a2).f57370a));
        }
        if (interfaceC25648a2.equals(InterfaceC25648a.d.f57371a)) {
            c43210w = new C43210w(BarcodeScannerInternalAction.BindScannerUI.f98980b);
        } else {
            if (interfaceC25648a2.equals(InterfaceC25648a.f.f57373a)) {
                AbstractC25650c.a aVar = abstractC25650c2 instanceof AbstractC25650c.a ? (AbstractC25650c.a) abstractC25650c2 : null;
                String str = aVar != null ? aVar.f57387d : null;
                if (str == null) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new BarcodeScannerInternalAction.SubmitResult(str));
            } else if (interfaceC25648a2.equals(InterfaceC25648a.e.f57372a)) {
                c43210w = new C43210w(BarcodeScannerInternalAction.CloseScreen.f98985b);
            } else {
                if (!interfaceC25648a2.equals(InterfaceC25648a.g.f57374a)) {
                    if (interfaceC25648a2.equals(InterfaceC25648a.i.f57376a)) {
                        return C43175k.G(new a(this, null));
                    }
                    if (interfaceC25648a2 instanceof InterfaceC25648a.b) {
                        return C43175k.G(new b(this, interfaceC25648a2, null));
                    }
                    if (interfaceC25648a2 instanceof InterfaceC25648a.j) {
                        return new C43210w(new BarcodeScannerInternalAction.BindScannerUISuccess(this.f99001a.f99050b, ((InterfaceC25648a.j) interfaceC25648a2).f57377a));
                    }
                    if (interfaceC25648a2 instanceof InterfaceC25648a.k) {
                        return C43175k.G(new c(interfaceC25648a2, null));
                    }
                    if (interfaceC25648a2.equals(InterfaceC25648a.C2009a.f57367a)) {
                        return C43175k.G(new d(abstractC25650c2, null));
                    }
                    if (interfaceC25648a2.equals(InterfaceC25648a.h.f57375a)) {
                        return C43175k.G(new e(this, abstractC25650c2, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(BarcodeScannerInternalAction.ToggleFlashlight.f98988b);
            }
        }
        return c43210w;
    }
}
