package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzaz implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f352970b;

    /* renamed from: c, reason: collision with root package name */
    public int f352971c;

    /* renamed from: d, reason: collision with root package name */
    public int f352972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbd f352973e;

    public zzaz(zzbd zzbdVar, zzav zzavVar) {
        this.f352973e = zzbdVar;
        this.f352970b = zzbdVar.f352984f;
        this.f352971c = zzbdVar.isEmpty() ? -1 : 0;
        this.f352972d = -1;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352971c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzbd zzbdVar = this.f352973e;
        if (zzbdVar.f352984f != this.f352970b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f352971c;
        this.f352972d = i12;
        Object objA = a(i12);
        int i13 = this.f352971c + 1;
        if (i13 >= zzbdVar.f352985g) {
            i13 = -1;
        }
        this.f352971c = i13;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbd zzbdVar = this.f352973e;
        if (zzbdVar.f352984f != this.f352970b) {
            throw new ConcurrentModificationException();
        }
        zzab.zzd(this.f352972d >= 0, "no calls to next() since the last call to remove()");
        this.f352970b += 32;
        int i12 = this.f352972d;
        Object[] objArr = zzbdVar.f352982d;
        objArr.getClass();
        zzbdVar.remove(objArr[i12]);
        this.f352971c--;
        this.f352972d = -1;
    }
}
