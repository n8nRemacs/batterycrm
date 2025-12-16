package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzam implements Iterator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f350562b;

    public zzam(Iterator it) {
        this.f350562b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350562b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        return new zzas((String) this.f350562b.next());
    }
}
