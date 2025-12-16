package ru.cyberity.cbr.core.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Bitap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/common/b;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "key", "a", "(C)Ljava/lang/Integer;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ru.cyberity.cbr.core.common.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47846b extends HashMap<Character, Integer> {
    public /* bridge */ boolean a(Character ch2) {
        return super.containsKey(ch2);
    }

    public /* bridge */ Set<Character> b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Character) {
            return a((Character) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Integer) {
            return a((Integer) obj);
        }
        return false;
    }

    public /* bridge */ Collection<Integer> d() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Character, Integer>> entrySet() {
        return a();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof Character) {
            return a(((Character) obj).charValue());
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Character) ? obj2 : a((Character) obj, (Integer) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Character> keySet() {
        return b();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof Character) {
            return b((Character) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Integer> values() {
        return d();
    }

    public /* bridge */ boolean a(Integer num) {
        return super.containsValue(num);
    }

    public /* bridge */ Integer b(Character ch2) {
        return (Integer) super.remove(ch2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof Character) && (obj2 instanceof Integer)) {
            return b((Character) obj, (Integer) obj2);
        }
        return false;
    }

    public /* bridge */ Set<Map.Entry<Character, Integer>> a() {
        return super.entrySet();
    }

    public /* bridge */ boolean b(Character ch2, Integer num) {
        return super.remove(ch2, num);
    }

    public /* bridge */ Integer a(Character ch2, Integer num) {
        return (Integer) super.getOrDefault(ch2, num);
    }

    @Y61.k
    public Integer a(char key) {
        Integer num = (Integer) super.get(Character.valueOf(key));
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }
}
