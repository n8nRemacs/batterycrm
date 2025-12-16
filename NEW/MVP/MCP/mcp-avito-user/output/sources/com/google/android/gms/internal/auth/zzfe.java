package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzfe extends zzdr implements RandomAccess, zzff {

    @Deprecated
    public static final zzff zza = new zzfe((Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final List f350108c;

    public zzfe() {
        this(10);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, Object obj) {
        b();
        this.f350108c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection collection) {
        b();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean zAddAll = this.f350108c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f350108c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f350108c.remove(i12);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof zzef ? ((zzef) objRemove).zzl(zzfa.f350106a) : zzfa.zzd((byte[]) objRemove);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f350108c.set(i12, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzef ? ((zzef) obj2).zzl(zzfa.f350106a) : zzfa.zzd((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350108c.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i12);
        arrayList.addAll(this.f350108c);
        return new zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return zzc() ? new zzhe(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i12) {
        List list = this.f350108c;
        Object obj = list.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzefVar = (zzef) obj;
            String strZzl = zzefVar.zzl(zzfa.f350106a);
            if (zzefVar.zzh()) {
                list.set(i12, strZzl);
            }
            return strZzl;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzfa.zzd(bArr);
        if (zzhn.f350181a.a(0, bArr.length, bArr) == 0) {
            list.set(i12, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.f350108c);
    }

    public zzfe(int i12) {
        ArrayList arrayList = new ArrayList(i12);
        super(true);
        this.f350108c = arrayList;
    }

    public zzfe(ArrayList arrayList) {
        super(true);
        this.f350108c = arrayList;
    }

    public zzfe(Object obj) {
        super(false);
        this.f350108c = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
