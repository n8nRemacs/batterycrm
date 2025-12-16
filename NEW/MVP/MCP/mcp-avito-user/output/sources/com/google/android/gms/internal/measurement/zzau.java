package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzau implements Iterator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public int f350570b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzas f350571c;

    public zzau(zzas zzasVar) {
        this.f350571c = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350570b < this.f350571c.f350567b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        int i12 = this.f350570b;
        zzas zzasVar = this.f350571c;
        if (i12 >= zzasVar.f350567b.length()) {
            throw new NoSuchElementException();
        }
        String str = zzasVar.f350567b;
        int i13 = this.f350570b;
        this.f350570b = i13 + 1;
        return new zzas(String.valueOf(str.charAt(i13)));
    }
}
