package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzvz extends zztw implements RandomAccess, zzwa {

    @Deprecated
    public static final zzwa zza = new zzvz((Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final List f354075c;

    public zzvz() {
        this(10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, Object obj) {
        b();
        this.f354075c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection collection) {
        b();
        if (collection instanceof zzwa) {
            collection = ((zzwa) collection).zzh();
        }
        boolean zAddAll = this.f354075c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f354075c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f354075c.remove(i12);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof zzul ? ((zzul) objRemove).zzm(zzvt.f354067a) : zzvt.zzd((byte[]) objRemove);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f354075c.set(i12, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzul ? ((zzul) obj2).zzm(zzvt.f354067a) : zzvt.zzd((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354075c.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i12);
        arrayList.addAll(this.f354075c);
        return new zzvz(arrayList);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final zzwa zze() {
        return zzc() ? new zzyb(this) : this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final Object zzf(int i12) {
        return this.f354075c.get(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i12) {
        List list = this.f354075c;
        Object obj = list.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzul) {
            zzul zzulVar = (zzul) obj;
            String strZzm = zzulVar.zzm(zzvt.f354067a);
            if (zzulVar.zzi()) {
                list.set(i12, strZzm);
            }
            return strZzm;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzvt.zzd(bArr);
        if (zzyl.f354154a.a(0, bArr.length, bArr) == 0) {
            list.set(i12, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final List zzh() {
        return Collections.unmodifiableList(this.f354075c);
    }

    public zzvz(int i12) {
        ArrayList arrayList = new ArrayList(i12);
        super(true);
        this.f354075c = arrayList;
    }

    public zzvz(ArrayList arrayList) {
        super(true);
        this.f354075c = arrayList;
    }

    public zzvz(Object obj) {
        super(false);
        this.f354075c = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
