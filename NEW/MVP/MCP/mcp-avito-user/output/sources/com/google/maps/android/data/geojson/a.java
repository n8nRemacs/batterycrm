package com.google.maps.android.data.geojson;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BiMultiMap.java */
/* loaded from: classes6.dex */
public class a<K> extends HashMap<K, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f362258b = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        super.clear();
        this.f362258b.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public final Object clone() {
        a aVar = new a();
        aVar.putAll((Map) super.clone());
        return aVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(K k12, Object obj) {
        this.f362258b.put(obj, k12);
        return super.put(k12, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        boolean z12 = objRemove instanceof Collection;
        HashMap map = this.f362258b;
        if (z12) {
            Iterator it = ((Collection) objRemove).iterator();
            while (it.hasNext()) {
                map.remove(it.next());
            }
        } else {
            map.remove(objRemove);
        }
        return objRemove;
    }
}
