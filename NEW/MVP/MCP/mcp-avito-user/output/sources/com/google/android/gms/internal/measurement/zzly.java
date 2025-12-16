package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzly implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f350980b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350981c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f350982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzlo f350983e;

    public zzly(zzlo zzloVar, zzlx zzlxVar) {
        this.f350983e = zzloVar;
    }

    public final Iterator a() {
        if (this.f350982d == null) {
            this.f350982d = this.f350983e.f350966d.entrySet().iterator();
        }
        return this.f350982d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f350980b + 1;
        zzlo zzloVar = this.f350983e;
        return i12 < zzloVar.f350965c.size() || (!zzloVar.f350966d.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f350981c = true;
        int i12 = this.f350980b + 1;
        this.f350980b = i12;
        zzlo zzloVar = this.f350983e;
        return i12 < zzloVar.f350965c.size() ? zzloVar.f350965c.get(this.f350980b) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f350981c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f350981c = false;
        int i12 = zzlo.f350963i;
        zzlo zzloVar = this.f350983e;
        zzloVar.d();
        if (this.f350980b >= zzloVar.f350965c.size()) {
            a().remove();
            return;
        }
        int i13 = this.f350980b;
        this.f350980b = i13 - 1;
        zzloVar.b(i13);
    }
}
