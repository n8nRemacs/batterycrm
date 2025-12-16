package com.avito.android.barcode_scanner_impl.presentation;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BarcodeScannerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/BarcodeScannerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/barcode_scanner_impl/presentation/a;", "<init>", "()V", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeScannerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, com.avito.android.barcode_scanner_impl.presentation.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f98912m = new a(null);

    /* compiled from: BarcodeScannerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/BarcodeScannerActivity$a;", "", "<init>", "()V", "", "SCANNER_PARAMS_KEY", "Ljava/lang/String;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.barcode_scanner_impl.presentation.a
    public final void g0(@k String str) {
        setResult(-1, new Intent().putExtra("BARCODE_VALUE_RESULT_KEY", str));
        finish();
    }

    @Override // com.avito.android.barcode_scanner_impl.presentation.a
    public final void h0() {
        setResult(0);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Intent intent = getIntent();
            BarcodeScannerParams barcodeScannerParams = (BarcodeScannerParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("BARCODE_SCANNER_PARAMS_KEY", BarcodeScannerParams.class) : intent.getParcelableExtra("BARCODE_SCANNER_PARAMS_KEY"));
            if (barcodeScannerParams == null) {
                BarcodeScannerParams.f99049e.getClass();
                barcodeScannerParams = new BarcodeScannerParams(com.avito.android.printable_text.a.a(R.string.scanner_description_default), BarcodeScannerType.f99054c, false);
            }
            H hE2 = getSupportFragmentManager().e();
            BarcodeScannerFragment.f98915I0.getClass();
            hE2.j(R.id.fragment_container, BarcodeScannerFragment.a.a(barcodeScannerParams), null, 1);
            hE2.e();
        }
    }
}
