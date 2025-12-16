package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzhd implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f350172b;

    public zzhd(zzhe zzheVar) {
        this.f350172b = zzheVar.f350173b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350172b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f350172b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
