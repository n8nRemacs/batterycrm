package Yg;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.barcode_scanner_impl.presentation.BarcodeScannerActivity;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.squareup.anvil.annotations.ContributesBinding;
import dh.InterfaceC39726b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BarcodeScannerIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYg/a;", "Ldh/b;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18263a implements InterfaceC39726b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f19607a;

    @Inject
    public C18263a(@k Context context) {
        this.f19607a = context;
    }

    @Override // dh.InterfaceC39726b
    @k
    public final Intent a(@k BarcodeScannerParams barcodeScannerParams) {
        BarcodeScannerActivity.f98912m.getClass();
        Intent intent = new Intent(this.f19607a, (Class<?>) BarcodeScannerActivity.class);
        intent.putExtra("BARCODE_SCANNER_PARAMS_KEY", barcodeScannerParams);
        return intent;
    }
}
