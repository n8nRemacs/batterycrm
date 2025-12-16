package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzae implements Iterator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f350550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f350551c;

    public zzae(Iterator it, Iterator it2) {
        this.f350550b = it;
        this.f350551c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f350550b.hasNext()) {
            return true;
        }
        return this.f350551c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        Iterator it = this.f350550b;
        if (it.hasNext()) {
            return new zzas(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f350551c;
        if (it2.hasNext()) {
            return new zzas((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
