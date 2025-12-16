package com.avito.android.barcode_scanner_impl.presentation.barcodescanner;

import Y41.l;
import androidx.camera.view.PreviewView;
import bh.InterfaceC25648a;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: BarcodeScannerFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQZ0/a;", "barcode", "Lkotlin/G0;", "invoke", "(LQZ0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<QZ0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BarcodeScannerFragment f98952l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodeScannerFragment barcodeScannerFragment) {
        super(1);
        this.f98952l = barcodeScannerFragment;
    }

    @Override // Y41.l
    public final G0 invoke(QZ0.a aVar) {
        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
        BarcodeScannerFragment barcodeScannerFragment = this.f98952l;
        j jVarQ5 = barcodeScannerFragment.q5();
        String strX = aVar.f13761a.x();
        if (strX == null) {
            strX = "";
        }
        C47313c c47313c = barcodeScannerFragment.f98936y0;
        n<Object> nVar = BarcodeScannerFragment.f98916J0[5];
        jVarQ5.accept(new InterfaceC25648a.b(((PreviewView) c47313c.a()).getBitmap(), strX));
        return G0.f406611a;
    }
}
