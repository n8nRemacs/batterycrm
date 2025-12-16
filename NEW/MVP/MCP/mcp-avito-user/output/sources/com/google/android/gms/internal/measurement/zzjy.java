package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzjy extends zzho<String> implements zzjx, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final List<Object> f350907c;

    static {
        new zzjy((Object) null);
    }

    public zzjy() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        b();
        this.f350907c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f350907c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        List<Object> list = this.f350907c;
        Object obj = list.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            String strZzc = zzhuVar.zzc();
            if (zzhuVar.zzd()) {
                list.set(i12, strZzc);
            }
            return strZzc;
        }
        byte[] bArr = (byte[]) obj;
        String strZzb = zzjh.zzb(bArr);
        if (zzjh.zzc(bArr)) {
            list.set(i12, strZzb);
        }
        return strZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final zzjx h_() {
        return zzc() ? new zzmj(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f350907c.remove(i12);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof zzhu ? ((zzhu) objRemove).zzc() : zzjh.zzb((byte[]) objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f350907c.set(i12, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzhu ? ((zzhu) obj2).zzc() : zzjh.zzb((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350907c.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final /* synthetic */ zzjn zza(int i12) {
        if (i12 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i12);
        arrayList.addAll(this.f350907c);
        return new zzjy((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzb(int i12) {
        return this.f350907c.get(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, com.google.android.gms.internal.measurement.zzjn
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    public zzjy(int i12) {
        this((ArrayList<Object>) new ArrayList(i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection<? extends String> collection) {
        b();
        if (collection instanceof zzjx) {
            collection = ((zzjx) collection).zzb();
        }
        boolean zAddAll = this.f350907c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final List<?> zzb() {
        return Collections.unmodifiableList(this.f350907c);
    }

    public zzjy(ArrayList<Object> arrayList) {
        this.f350907c = arrayList;
    }

    public zzjy(Object obj) {
        super(false);
        this.f350907c = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final void zza(zzhu zzhuVar) {
        b();
        this.f350907c.add(zzhuVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }
}
