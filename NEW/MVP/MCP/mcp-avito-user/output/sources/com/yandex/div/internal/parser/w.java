package com.yandex.div.internal.parser;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonTopologicalSorting.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/parser/w;", "", "<init>", "()V", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f370146a = new w();

    public static void a(String str, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap2) throws CyclicDependencyException {
        List list;
        if (linkedHashSet.contains(str)) {
            List listM0 = C42745f0.M0(linkedHashSet);
            StringBuilder sb2 = new StringBuilder();
            int size = listM0.size();
            for (int iIndexOf = listM0.indexOf(str); iIndexOf < size; iIndexOf++) {
                sb2.append((String) listM0.get(iIndexOf));
                sb2.append(" -> ");
            }
            sb2.append(str);
            throw new CyclicDependencyException(sb2.toString());
        }
        if (linkedHashSet2.contains(str)) {
            return;
        }
        List list2 = (List) linkedHashMap.get(str);
        if (list2 == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (linkedHashMap.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (list != null && !list.isEmpty()) {
            linkedHashSet.add(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
            }
            linkedHashSet.remove(str);
        }
        linkedHashSet2.add(str);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        linkedHashMap2.put(str, C42745f0.P0(list));
    }

    public static void b(JSONObject jSONObject, boolean z12, ArrayList arrayList, B b12) throws JSONException {
        String str;
        w wVar;
        if (z12) {
            Object objOpt = jSONObject.opt("type");
            obj = L.f(objOpt, JSONObject.NULL) ? null : objOpt;
            if (obj == null) {
                throw com.yandex.div.json.j.g("type", jSONObject);
            }
            str = (String) obj;
            if (str.length() <= 0) {
                throw com.yandex.div.json.j.e(jSONObject, "type", obj);
            }
        } else {
            Object objOpt2 = jSONObject.opt("type");
            if (L.f(objOpt2, JSONObject.NULL)) {
                objOpt2 = null;
            }
            if (objOpt2 != null) {
                if (((String) objOpt2).length() > 0) {
                    obj = objOpt2;
                } else {
                    b12.a(com.yandex.div.json.j.e(jSONObject, "type", objOpt2));
                }
            }
            str = (String) obj;
        }
        if (str != null) {
            arrayList.add(str);
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            wVar = f370146a;
            if (!zHasNext) {
                break;
            }
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONObject) {
                wVar.getClass();
                b((JSONObject) obj, false, arrayList, b12);
            }
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            Object obj2 = jSONObject.get(itKeys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12 + 1;
                    Object obj3 = jSONArray.get(i12);
                    if (obj3 instanceof JSONObject) {
                        wVar.getClass();
                        b((JSONObject) obj3, false, arrayList, b12);
                    }
                    i12 = i13;
                }
            }
        }
    }

    @Y61.k
    @SuppressLint({"NewApi"})
    public static LinkedHashMap c(@Y61.k JSONObject jSONObject, @Y61.k com.yandex.div.json.i iVar, @Y61.k com.yandex.div.json.l lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                ArrayList arrayList = new ArrayList();
                B b12 = new B(iVar, next);
                f370146a.getClass();
                b((JSONObject) obj, true, arrayList, b12);
                linkedHashMap.put(next, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }
}
