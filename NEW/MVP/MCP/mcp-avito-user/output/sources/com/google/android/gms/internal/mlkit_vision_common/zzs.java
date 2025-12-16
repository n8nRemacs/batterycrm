package com.google.android.gms.internal.mlkit_vision_common;

import I41.a;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public abstract class zzs extends zzl implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzp f352921c;

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

    public zzp g() {
        Object[] array = toArray();
        zzac zzacVar = zzp.f352917c;
        int length = array.length;
        return length == 0 ? zzu.f352922f : new zzu(array, length);
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzab iterator();

    public final zzp zzf() {
        zzp zzpVar = this.f352921c;
        if (zzpVar != null) {
            return zzpVar;
        }
        zzp zzpVarG = g();
        this.f352921c = zzpVarG;
        return zzpVarG;
    }
}
