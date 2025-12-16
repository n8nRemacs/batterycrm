package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzeu extends zzcm implements RandomAccess, zzev {
    public static final zzev zza;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f352457c;

    static {
        zzeu zzeuVar = new zzeu(10);
        zzeuVar.zzb();
        zza = zzeuVar;
    }

    public zzeu() {
        this(10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, Object obj) {
        b();
        this.f352457c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection collection) {
        b();
        if (collection instanceof zzev) {
            collection = ((zzev) collection).zzh();
        }
        boolean zAddAll = this.f352457c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f352457c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f352457c.remove(i12);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof zzdb ? ((zzdb) objRemove).zzu(zzel.f352447a) : zzel.zzh((byte[]) objRemove);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f352457c.set(i12, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzdb ? ((zzdb) obj2).zzu(zzel.f352447a) : zzel.zzh((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352457c.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i12);
        arrayList.addAll(this.f352457c);
        return new zzeu(arrayList);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final zzev zze() {
        return zzc() ? new zzgu(this) : this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final Object zzf(int i12) {
        return this.f352457c.get(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i12) {
        ArrayList arrayList = this.f352457c;
        Object obj = arrayList.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj;
            String strZzu = zzdbVar.zzu(zzel.f352447a);
            if (zzdbVar.zzn()) {
                arrayList.set(i12, strZzu);
            }
            return strZzu;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzel.zzh(bArr);
        if (zzel.zzj(bArr)) {
            arrayList.set(i12, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final List zzh() {
        return Collections.unmodifiableList(this.f352457c);
    }

    public zzeu(int i12) {
        this.f352457c = new ArrayList(i12);
    }

    public zzeu(ArrayList arrayList) {
        this.f352457c = arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
