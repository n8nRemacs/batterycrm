package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbc extends zzba implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbd f351774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbd zzbdVar) {
        super(zzbdVar);
        this.f351774e = zzbdVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzbd zzbdVar = this.f351774e;
        boolean zIsEmpty = zzbdVar.isEmpty();
        a();
        ((ListIterator) this.f351766b).add(obj);
        zzbdVar.f351775g.f351777e++;
        if (zIsEmpty) {
            zzbdVar.b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f351766b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f351766b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f351766b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f351766b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f351766b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbd zzbdVar, int i12) {
        super(zzbdVar, ((List) zzbdVar.f351770c).listIterator(i12));
        this.f351774e = zzbdVar;
    }
}
