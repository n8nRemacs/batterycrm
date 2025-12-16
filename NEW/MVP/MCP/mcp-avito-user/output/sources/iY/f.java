package iY;

import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewedPinsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiY/f;", "LiY/e;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f398550a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<String> f398551b;

    @Inject
    public f(@k SharedPreferences sharedPreferences) {
        this.f398550a = sharedPreferences;
        Set<String> setNewSetFromMap = Collections.newSetFromMap(new a());
        this.f398551b = setNewSetFromMap;
        Set<String> stringSet = sharedPreferences.getStringSet("viewed_pins_storage", setNewSetFromMap);
        if (stringSet != null) {
            setNewSetFromMap.addAll(stringSet);
        }
    }

    @Override // iY.e
    public final void a(@k List<String> list) {
        Set<String> set = this.f398551b;
        if (set.containsAll(list)) {
            return;
        }
        for (String str : list) {
            if (set.contains(str)) {
                set.remove(str);
            }
            set.add(str);
        }
        this.f398550a.edit().putStringSet("viewed_pins_storage", set).apply();
    }

    @Override // iY.e
    public final boolean b(@k List<String> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.f398551b.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: ViewedPinsStorage.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\u0005"}, d2 = {"iY/f$a", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends LinkedHashMap<String, Boolean> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return super.containsValue((Boolean) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return (Boolean) super.get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (Boolean) super.getOrDefault((String) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return (Boolean) super.remove((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(@l Map.Entry<String, Boolean> entry) {
            return super.size() > 1000;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof Boolean)) {
                return super.remove((String) obj, (Boolean) obj2);
            }
            return false;
        }
    }
}
