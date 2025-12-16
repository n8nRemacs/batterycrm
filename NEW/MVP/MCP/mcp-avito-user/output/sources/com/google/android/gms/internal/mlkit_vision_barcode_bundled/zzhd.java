package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzhd extends IllegalArgumentException {
    public zzhd(int i12, int i13) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i12);
        sb2.append(" of ");
        sb2.append(i13);
        super(sb2.toString());
    }
}
