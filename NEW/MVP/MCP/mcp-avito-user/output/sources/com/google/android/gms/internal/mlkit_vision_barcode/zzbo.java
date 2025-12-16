package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzbo implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f351784b;

    /* renamed from: c, reason: collision with root package name */
    public int f351785c;

    /* renamed from: d, reason: collision with root package name */
    public int f351786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbs f351787e;

    public zzbo(zzbs zzbsVar, zzbk zzbkVar) {
        this.f351787e = zzbsVar;
        this.f351784b = zzbsVar.f351798f;
        this.f351785c = zzbsVar.isEmpty() ? -1 : 0;
        this.f351786d = -1;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f351785c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzbs zzbsVar = this.f351787e;
        if (zzbsVar.f351798f != this.f351784b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f351785c;
        this.f351786d = i12;
        Object objA = a(i12);
        int i13 = this.f351785c + 1;
        if (i13 >= zzbsVar.f351799g) {
            i13 = -1;
        }
        this.f351785c = i13;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbs zzbsVar = this.f351787e;
        if (zzbsVar.f351798f != this.f351784b) {
            throw new ConcurrentModificationException();
        }
        zzaq.zzd(this.f351786d >= 0, "no calls to next() since the last call to remove()");
        this.f351784b += 32;
        int i12 = this.f351786d;
        Object[] objArr = zzbsVar.f351796d;
        objArr.getClass();
        zzbsVar.remove(objArr[i12]);
        this.f351785c--;
        this.f351786d = -1;
    }
}
