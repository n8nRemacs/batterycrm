package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzlq implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f350971b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f350972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzlo f350973d;

    public zzlq(zzlo zzloVar, zzlp zzlpVar) {
        this.f350973d = zzloVar;
        this.f350971b = zzloVar.f350965c.size();
    }

    public final Iterator a() {
        if (this.f350972c == null) {
            this.f350972c = this.f350973d.f350969g.entrySet().iterator();
        }
        return this.f350972c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f350971b;
        return (i12 > 0 && i12 <= this.f350973d.f350965c.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List<zzlv> list = this.f350973d.f350965c;
        int i12 = this.f350971b - 1;
        this.f350971b = i12;
        return list.get(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
