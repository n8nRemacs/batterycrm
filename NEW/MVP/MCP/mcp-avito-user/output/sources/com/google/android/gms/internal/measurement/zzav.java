package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzav implements Iterator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public int f350572b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzas f350573c;

    public zzav(zzas zzasVar) {
        this.f350573c = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350572b < this.f350573c.f350567b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.f350572b >= this.f350573c.f350567b.length()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350572b;
        this.f350572b = i12 + 1;
        return new zzas(String.valueOf(i12));
    }
}
