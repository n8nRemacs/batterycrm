package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.a;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zzbm extends zzbf implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzbj f353503c;

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

    public zzbj g() {
        Object[] array = toArray();
        zzbv zzbvVar = zzbj.f353499c;
        int length = array.length;
        return length == 0 ? zzbn.f353504f : new zzbn(array, length);
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

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbu iterator();

    public final zzbj zzf() {
        zzbj zzbjVar = this.f353503c;
        if (zzbjVar != null) {
            return zzbjVar;
        }
        zzbj zzbjVarG = g();
        this.f353503c = zzbjVarG;
        return zzbjVarG;
    }
}
