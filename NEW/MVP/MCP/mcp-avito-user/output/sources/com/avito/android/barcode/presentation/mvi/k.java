package com.avito.android.barcode.presentation.mvi;

import Og.InterfaceC14685b;
import com.avito.android.arch.mvi.u;
import com.avito.android.barcode.presentation.mvi.entity.BarcodeState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BarcodeReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LOg/b;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "<init>", "()V", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<InterfaceC14685b, BarcodeState> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final BarcodeState a(InterfaceC14685b interfaceC14685b, BarcodeState barcodeState) {
        InterfaceC14685b interfaceC14685b2 = interfaceC14685b;
        BarcodeState barcodeState2 = barcodeState;
        if (interfaceC14685b2 instanceof InterfaceC14685b.a) {
            return barcodeState2;
        }
        if (interfaceC14685b2 instanceof InterfaceC14685b.c) {
            return new BarcodeState.ShowContent(((InterfaceC14685b.c) interfaceC14685b2).f12485a);
        }
        if (!(interfaceC14685b2 instanceof InterfaceC14685b.C0802b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14685b.C0802b c0802b = (InterfaceC14685b.C0802b) interfaceC14685b2;
        return new BarcodeState.Error(c0802b.f12481a, c0802b.f12482b, c0802b.f12484d, c0802b.f12483c);
    }
}
