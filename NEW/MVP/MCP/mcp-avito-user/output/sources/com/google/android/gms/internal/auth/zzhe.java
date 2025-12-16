package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@Deprecated
/* loaded from: classes6.dex */
public final class zzhe extends AbstractList implements RandomAccess, zzff {

    /* renamed from: b, reason: collision with root package name */
    public final zzff f350173b;

    public zzhe(zzff zzffVar) {
        this.f350173b = zzffVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        return ((zzfe) this.f350173b).get(i12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i12) {
        return new zzhc(this, i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350173b.size();
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return this.f350173b.zzg();
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return this;
    }
}
