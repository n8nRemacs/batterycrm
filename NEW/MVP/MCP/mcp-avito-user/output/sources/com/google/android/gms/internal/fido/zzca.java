package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzca extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzcc f350280d;

    public zzca(zzcc zzccVar) {
        this.f350280d = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f350280d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzcc zzccVar = this.f350280d;
        zzbm.zza(i12, zzccVar.size(), "index");
        return zzccVar.get((zzccVar.size() - 1) - i12);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(@a Object obj) {
        int iLastIndexOf = this.f350280d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(@a Object obj) {
        int iIndexOf = this.f350280d.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350280d.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.f350280d;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg */
    public final zzcc subList(int i12, int i13) {
        zzcc zzccVar = this.f350280d;
        zzbm.zze(i12, i13, zzccVar.size());
        return zzccVar.subList(zzccVar.size() - i13, zzccVar.size() - i12).zzf();
    }
}
