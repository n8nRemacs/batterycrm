package k31;

import java.util.LinkedHashMap;

/* compiled from: MixedArray.java */
/* renamed from: k31.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42493b extends LinkedHashMap<Object, Object> {
    private static final long serialVersionUID = -194078593900457504L;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj instanceof C42492a ? super.containsKey(obj) : super.containsKey(new C42492a(obj));
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return obj instanceof C42492a ? super.containsValue(obj) : super.containsValue(new C42492a(obj));
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return obj instanceof C42492a ? super.get(obj) : super.get(new C42492a(obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return super.put(!(obj instanceof C42492a) ? new C42492a(obj) : (C42492a) obj, !(obj2 instanceof C42492a) ? new C42492a(obj2) : (C42492a) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        return obj instanceof C42492a ? super.remove(obj) : super.remove(new C42492a(obj));
    }
}
