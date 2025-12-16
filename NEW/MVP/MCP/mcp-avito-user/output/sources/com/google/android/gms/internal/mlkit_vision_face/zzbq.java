package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbq extends zzbi implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzbn f353003c;

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

    public zzbn g() {
        Object[] array = toArray();
        zzcm zzcmVar = zzbn.f352999c;
        int length = array.length;
        return length == 0 ? zzcc.f353009f : new zzcc(array, length);
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzcl iterator();

    public final zzbn zzf() {
        zzbn zzbnVar = this.f353003c;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzbn zzbnVarG = g();
        this.f353003c = zzbnVarG;
        return zzbnVarG;
    }
}
