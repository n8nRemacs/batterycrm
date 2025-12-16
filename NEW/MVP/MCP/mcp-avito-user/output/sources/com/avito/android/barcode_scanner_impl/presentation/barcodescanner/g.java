package com.avito.android.barcode_scanner_impl.presentation.barcodescanner;

import android.content.DialogInterface;
import bh.InterfaceC25648a;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.PermissionDenialType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BarcodeScannerFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BarcodeScannerFragment f98956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f98957m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BarcodeScannerFragment barcodeScannerFragment, DialogInterface dialogInterface) {
        super(0);
        this.f98956l = barcodeScannerFragment;
        this.f98957m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
        this.f98956l.q5().accept(new InterfaceC25648a.c(PermissionDenialType.f98997b));
        this.f98957m.dismiss();
        return G0.f406611a;
    }
}
