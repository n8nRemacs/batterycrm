package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxo implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f354125b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f354126c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f354127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzxs f354128e;

    public final Iterator a() {
        if (this.f354127d == null) {
            this.f354127d = this.f354128e.f354133d.entrySet().iterator();
        }
        return this.f354127d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f354125b + 1;
        zzxs zzxsVar = this.f354128e;
        if (i12 >= zzxsVar.f354132c.size()) {
            return !zzxsVar.f354133d.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f354126c = true;
        int i12 = this.f354125b + 1;
        this.f354125b = i12;
        zzxs zzxsVar = this.f354128e;
        return i12 < zzxsVar.f354132c.size() ? (Map.Entry) zzxsVar.f354132c.get(this.f354125b) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f354126c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f354126c = false;
        int i12 = zzxs.f354130h;
        zzxs zzxsVar = this.f354128e;
        zzxsVar.d();
        if (this.f354125b >= zzxsVar.f354132c.size()) {
            a().remove();
            return;
        }
        int i13 = this.f354125b;
        this.f354125b = i13 - 1;
        zzxsVar.b(i13);
    }
}
