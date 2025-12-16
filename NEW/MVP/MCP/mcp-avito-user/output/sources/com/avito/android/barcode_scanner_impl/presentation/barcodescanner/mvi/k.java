package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import ah.C19887a;
import ah.C19888b;
import ah.C19889c;
import bh.InterfaceC25648a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BarcodeScannerClickStreamTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/k;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/j;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f99014a;

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f99014a = interfaceC28373a;
    }

    @Override // com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.j
    public final void a(@Y61.k InterfaceC25648a interfaceC25648a) {
        InterfaceC28464o c19887a = interfaceC25648a instanceof InterfaceC25648a.b ? new C19887a() : interfaceC25648a.equals(InterfaceC25648a.i.f57376a) ? new C19889c() : interfaceC25648a.equals(InterfaceC25648a.f.f57373a) ? new C19888b() : null;
        if (c19887a != null) {
            this.f99014a.c(c19887a);
        }
    }

    @Override // com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.j
    public final void b() {
        this.f99014a.c(new ah.e());
    }
}
