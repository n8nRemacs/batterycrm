package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgj implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f352521b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352522c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f352523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzgl f352524e;

    public final Iterator a() {
        if (this.f352523d == null) {
            this.f352523d = this.f352524e.f352529d.entrySet().iterator();
        }
        return this.f352523d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f352521b + 1;
        zzgl zzglVar = this.f352524e;
        if (i12 >= zzglVar.f352528c.size()) {
            return !zzglVar.f352529d.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f352522c = true;
        int i12 = this.f352521b + 1;
        this.f352521b = i12;
        zzgl zzglVar = this.f352524e;
        return i12 < zzglVar.f352528c.size() ? (Map.Entry) zzglVar.f352528c.get(this.f352521b) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f352522c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f352522c = false;
        int i12 = zzgl.f352526h;
        zzgl zzglVar = this.f352524e;
        zzglVar.d();
        if (this.f352521b >= zzglVar.f352528c.size()) {
            a().remove();
            return;
        }
        int i13 = this.f352521b;
        this.f352521b = i13 - 1;
        zzglVar.b(i13);
    }
}
