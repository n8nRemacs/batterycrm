package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfe implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f350359b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzff f350360c;

    public zzfe(zzff zzffVar) {
        this.f350360c = zzffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f350359b;
        zzff zzffVar = this.f350360c;
        return i12 < zzffVar.f350362c.f350365c[zzffVar.f350361b + 1] - zzffVar.b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i12 = this.f350359b;
        zzff zzffVar = this.f350360c;
        zzfg zzfgVar = zzffVar.f350362c;
        if (i12 >= zzfgVar.f350365c[zzffVar.f350361b + 1] - zzffVar.b()) {
            throw new NoSuchElementException();
        }
        Object obj = zzfgVar.f350364b[zzffVar.b() + i12];
        this.f350359b = i12 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
