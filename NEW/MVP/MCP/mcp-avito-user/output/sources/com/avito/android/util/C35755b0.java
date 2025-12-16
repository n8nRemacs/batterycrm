package com.avito.android.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: Collections.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35755b0 {
    @Y61.l
    public static final <T> ArrayList<T> a(@Y61.l Collection<? extends T> collection) {
        if (collection == null) {
            return null;
        }
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }

    @Y61.k
    public static final LinkedHashMap b(@Y61.k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    @Y61.k
    public static final LinkedHashMap c(@Y61.k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    @Y61.k
    public static final LinkedHashMap d(@Y61.k ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll((Map) it.next());
        }
        return linkedHashMap;
    }

    @Y61.l
    public static final <T> T e(@Y61.k Collection<? extends T> collection, T t12, boolean z12) {
        Collection<? extends T> collection2;
        int iL2;
        if (collection.isEmpty() || (iL2 = C42745f0.L((collection2 = collection), t12)) < 0) {
            return null;
        }
        int i12 = iL2 + 1;
        if (i12 < collection.size()) {
            return (T) C42745f0.y(i12, collection2);
        }
        if (z12) {
            return (T) C42745f0.D(collection2);
        }
        return null;
    }

    @Y61.l
    public static final Object f(Object obj, @Y61.k Collection collection) {
        Collection collection2;
        int iL2;
        int i12;
        if (!collection.isEmpty() && (iL2 = C42745f0.L((collection2 = collection), obj)) >= 0 && iL2 - 1 >= 0) {
            return C42745f0.y(i12, collection2);
        }
        return null;
    }

    @Y61.k
    public static final List g(@Y61.k Iterable iterable, int i12, @Y61.k Y41.l lVar, @Y61.k String str) {
        if (!iterable.iterator().hasNext()) {
            return C42784z0.f406748b;
        }
        int length = (i12 - 2) - str.length();
        if (length <= 0) {
            throw new IllegalArgumentException("Illegal arguments: single chunk length is less than 0. chunkLength=" + i12 + ", prefix={, postfix=}, truncated=" + ((Object) str));
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("{");
        Iterator it = iterable.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) lVar.invoke(it.next());
            boolean z12 = length < charSequence.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(0, Math.min(length, charSequence.length()));
            if (sb2.length() + charSequenceSubSequence.length() + i13 + 1 > i12) {
                sb2.append("}");
                arrayList.add(sb2.toString());
                sb2.setLength(0);
                sb2.append("{");
                i13 = 0;
            }
            if (i13 != 0) {
                sb2.append(",");
            }
            sb2.append(charSequenceSubSequence);
            if (z12) {
                sb2.append((CharSequence) str);
            }
            i13 = 1;
        }
        if (arrayList.isEmpty() || i13 != 0) {
            sb2.append("}");
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }
}
