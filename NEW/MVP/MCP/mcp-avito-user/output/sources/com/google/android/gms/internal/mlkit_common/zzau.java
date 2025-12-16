package com.google.android.gms.internal.mlkit_common;

import I41.a;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public abstract class zzau extends zzam implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzaq f351197c;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@a Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public zzaq g() {
        Object[] array = toArray();
        zzbe zzbeVar = zzaq.f351187c;
        int length = array.length;
        return length == 0 ? zzaw.f351198f : new zzaw(array, length);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbd iterator();

    public final zzaq zzf() {
        zzaq zzaqVar = this.f351197c;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarG = g();
        this.f351197c = zzaqVarG;
        return zzaqVarG;
    }
}
