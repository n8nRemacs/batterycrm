package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgr implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f350154b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350155c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f350156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzgv f350157e;

    public final Iterator a() {
        if (this.f350156d == null) {
            this.f350156d = this.f350157e.f350162d.entrySet().iterator();
        }
        return this.f350156d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f350154b + 1;
        zzgv zzgvVar = this.f350157e;
        if (i12 >= zzgvVar.f350161c.size()) {
            return !zzgvVar.f350162d.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f350155c = true;
        int i12 = this.f350154b + 1;
        this.f350154b = i12;
        zzgv zzgvVar = this.f350157e;
        return i12 < zzgvVar.f350161c.size() ? (Map.Entry) zzgvVar.f350161c.get(this.f350154b) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f350155c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f350155c = false;
        int i12 = zzgv.f350159h;
        zzgv zzgvVar = this.f350157e;
        zzgvVar.d();
        if (this.f350154b >= zzgvVar.f350161c.size()) {
            a().remove();
            return;
        }
        int i13 = this.f350154b;
        this.f350154b = i13 - 1;
        zzgvVar.b(i13);
    }
}
