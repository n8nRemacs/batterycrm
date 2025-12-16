package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@RX0.a
@DynamiteApi
/* loaded from: classes6.dex */
public class ThickBarcodeScannerCreator extends zzbn {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbo
    public zzbl newBarcodeScanner(d dVar, zzbc zzbcVar) {
        return new a((Context) f.g4(dVar), zzbcVar);
    }
}
