package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzau extends zzck {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaw f351756b;

    public zzau(zzaw zzawVar) {
        this.f351756b = zzawVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck
    public final Map b() {
        return this.f351756b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        Set setEntrySet = this.f351756b.f351760e.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzav(this.f351756b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzbe zzbeVar = this.f351756b.f351761f;
        Object key = entry.getKey();
        Map map = zzbeVar.f351776d;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        zzbeVar.f351777e -= size;
        return true;
    }
}
