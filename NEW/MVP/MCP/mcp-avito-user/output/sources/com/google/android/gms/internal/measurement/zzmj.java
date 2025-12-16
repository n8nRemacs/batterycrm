package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
@Deprecated
/* loaded from: classes6.dex */
public final class zzmj extends AbstractList<String> implements zzjx, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final zzjx f350993b;

    public zzmj(zzjx zzjxVar) {
        this.f350993b = zzjxVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        return (String) this.f350993b.get(i12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        zzml zzmlVar = new zzml();
        zzmlVar.f350994b = this.f350993b.iterator();
        return zzmlVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i12) {
        zzmm zzmmVar = new zzmm();
        zzmmVar.f350995b = this.f350993b.listIterator(i12);
        return zzmmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350993b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final void zza(zzhu zzhuVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzb(int i12) {
        return this.f350993b.zzb(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final List<?> zzb() {
        return this.f350993b.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final zzjx h_() {
        return this;
    }
}
