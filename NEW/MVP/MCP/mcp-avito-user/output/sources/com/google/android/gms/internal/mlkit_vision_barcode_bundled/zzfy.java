package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfy {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f352502a = new ArrayDeque();

    public zzfy() {
    }

    public final void a(zzdb zzdbVar) {
        if (!zzdbVar.g()) {
            if (!(zzdbVar instanceof zzga)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdbVar.getClass())));
            }
            zzga zzgaVar = (zzga) zzdbVar;
            a(zzgaVar.f352508d);
            a(zzgaVar.f352509e);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(zzga.f352506h, zzdbVar.zzd());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iV2 = zzga.v(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.f352502a;
        if (arrayDeque.isEmpty() || ((zzdb) arrayDeque.peek()).zzd() >= iV2) {
            arrayDeque.push(zzdbVar);
            return;
        }
        int iV3 = zzga.v(iBinarySearch);
        zzdb zzgaVar2 = (zzdb) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zzdb) arrayDeque.peek()).zzd() < iV3) {
            zzgaVar2 = new zzga((zzdb) arrayDeque.pop(), zzgaVar2, null);
        }
        zzga zzgaVar3 = new zzga(zzgaVar2, zzdbVar, null);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(zzga.f352506h, zzgaVar3.zzd());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((zzdb) arrayDeque.peek()).zzd() >= zzga.v(iBinarySearch2 + 1)) {
                break;
            } else {
                zzgaVar3 = new zzga((zzdb) arrayDeque.pop(), zzgaVar3, null);
            }
        }
        arrayDeque.push(zzgaVar3);
    }

    public /* synthetic */ zzfy(zzfx zzfxVar) {
    }
}
