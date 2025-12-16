package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public abstract class zzcf extends zzbx implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzcc f351817c;

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

    public zzcc g() {
        Object[] array = toArray();
        zzdb zzdbVar = zzcc.f351813c;
        int length = array.length;
        return length == 0 ? zzcr.f351823f : new zzcr(array, length);
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzda iterator();

    public final zzcc zzf() {
        zzcc zzccVar = this.f351817c;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVarG = g();
        this.f351817c = zzccVarG;
        return zzccVarG;
    }
}
