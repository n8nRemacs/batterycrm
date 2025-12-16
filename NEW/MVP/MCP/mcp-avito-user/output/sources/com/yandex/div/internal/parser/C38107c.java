package com.yandex.div.internal.parser;

import com.yandex.div.internal.parser.E;
import com.yandex.div.internal.parser.y;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.b;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonParser.java */
/* renamed from: com.yandex.div.internal.parser.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38107c {

    /* renamed from: a, reason: collision with root package name */
    @N
    public static final C38106b f370139a = new C38106b(2);

    /* renamed from: b, reason: collision with root package name */
    @N
    public static final C38106b f370140b = new C38106b(3);

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final C38105a f370141c = new C38105a();

    /* renamed from: d, reason: collision with root package name */
    public static final com.yandex.div.json.expressions.a f370142d = new com.yandex.div.json.expressions.a(Collections.emptyList());

    /* compiled from: JsonParser.java */
    /* renamed from: com.yandex.div.internal.parser.c$a */
    public interface a {

        /* renamed from: p2, reason: collision with root package name */
        public static final C38106b f370143p2 = new C38106b(0);

        /* renamed from: q2, reason: collision with root package name */
        public static final C38106b f370144q2 = new C38106b(1);

        void a(ParsingException parsingException);
    }

    @N
    public static Object a(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N F f12) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt == null) {
            throw com.yandex.div.json.j.g(str, jSONObject);
        }
        try {
            Object objInvoke = lVar.invoke(objOpt);
            if (objInvoke == null) {
                throw com.yandex.div.json.j.e(jSONObject, str, objOpt);
            }
            try {
                if (f12.g(objInvoke)) {
                    return objInvoke;
                }
                throw com.yandex.div.json.j.e(jSONObject, str, objInvoke);
            } catch (ClassCastException unused) {
                throw com.yandex.div.json.j.m(jSONObject, str, objInvoke);
            }
        } catch (ClassCastException unused2) {
            throw com.yandex.div.json.j.m(jSONObject, str, objOpt);
        } catch (Exception e12) {
            throw com.yandex.div.json.j.f(jSONObject, str, objOpt, e12);
        }
    }

    @N
    public static Object b(@N JSONObject jSONObject, @N String str, @N Y41.p pVar, @N com.yandex.div.json.e eVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            throw com.yandex.div.json.j.g(str, jSONObject);
        }
        try {
            Object objInvoke = pVar.invoke(eVar, jSONObjectOptJSONObject);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw com.yandex.div.json.j.e(jSONObject, str, null);
        } catch (ParsingException e12) {
            throw com.yandex.div.json.j.a(jSONObject, str, e12);
        }
    }

    @N
    public static com.yandex.div.json.expressions.b c(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar, @N D d12) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt == null) {
            throw com.yandex.div.json.j.g(str, jSONObject);
        }
        if (com.yandex.div.json.expressions.b.c(objOpt)) {
            return new b.c(str, objOpt.toString(), lVar, f12, iVar, d12, null);
        }
        try {
            Object objInvoke = lVar.invoke(objOpt);
            if (objInvoke == null) {
                throw com.yandex.div.json.j.e(jSONObject, str, objOpt);
            }
            try {
                if (!f12.g(objInvoke)) {
                    throw com.yandex.div.json.j.e(jSONObject, str, objOpt);
                }
                com.yandex.div.json.expressions.b.f370552a.getClass();
                return b.a.a(objInvoke);
            } catch (ClassCastException unused) {
                throw com.yandex.div.json.j.m(jSONObject, str, objOpt);
            }
        } catch (ClassCastException unused2) {
            throw com.yandex.div.json.j.m(jSONObject, str, objOpt);
        } catch (Exception e12) {
            throw com.yandex.div.json.j.f(jSONObject, str, objOpt, e12);
        }
    }

    @N
    public static com.yandex.div.json.expressions.d d(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N x xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar, @N E.b bVar) {
        com.yandex.div.json.expressions.d dVarE = e(jSONObject, str, lVar, xVar, iVar, eVar, bVar, a.f370143p2);
        if (dVarE != null) {
            return dVarE;
        }
        throw com.yandex.div.json.j.b(jSONObject, str);
    }

    @P
    public static com.yandex.div.json.expressions.d e(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N x xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar, @N E.b bVar, @N a aVar) {
        int i12;
        int i13;
        C38106b c38106b;
        ArrayList arrayList;
        int i14;
        C38106b c38106b2 = f370139a;
        com.yandex.div.json.expressions.a aVar2 = f370142d;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            aVar.a(com.yandex.div.json.j.g(str, jSONObject));
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List listEmptyList = Collections.emptyList();
            try {
                if (!xVar.isValid(listEmptyList)) {
                    iVar.a(com.yandex.div.json.j.e(jSONObject, str, listEmptyList));
                }
                return aVar2;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, listEmptyList));
                return aVar2;
            }
        }
        ArrayList arrayList2 = new ArrayList(length);
        boolean z12 = false;
        int i15 = 0;
        while (i15 < length) {
            Object objOpt = jSONArrayOptJSONArray.opt(i15);
            Object obj = (objOpt == null || objOpt == JSONObject.NULL) ? null : objOpt;
            if (obj == null) {
                i14 = i15;
                i13 = length;
                c38106b = c38106b2;
                arrayList = arrayList2;
            } else {
                if (com.yandex.div.json.expressions.b.c(obj)) {
                    C38106b c38106b3 = c38106b2;
                    i12 = i15;
                    c38106b = c38106b2;
                    arrayList = arrayList2;
                    i13 = length;
                    arrayList.add(new b.c(str + "[" + i15 + "]", obj.toString(), lVar, c38106b3, iVar, bVar, null));
                    z12 = true;
                } else {
                    i12 = i15;
                    i13 = length;
                    c38106b = c38106b2;
                    arrayList = arrayList2;
                    try {
                        Object objInvoke = ((y.e) lVar).invoke(obj);
                        if (objInvoke != null) {
                            arrayList.add(objInvoke);
                        }
                    } catch (ClassCastException unused2) {
                        i14 = i12;
                        iVar.a(com.yandex.div.json.j.l(jSONArrayOptJSONArray, str, i14, obj));
                    } catch (Exception e12) {
                        i14 = i12;
                        iVar.a(com.yandex.div.json.j.d(jSONArrayOptJSONArray, str, i14, obj, e12));
                    }
                }
                i14 = i12;
            }
            i15 = i14 + 1;
            arrayList2 = arrayList;
            c38106b2 = c38106b;
            length = i13;
        }
        ArrayList arrayList3 = arrayList2;
        if (!z12) {
            try {
                if (xVar.isValid(arrayList3)) {
                    return new com.yandex.div.json.expressions.a(arrayList3);
                }
                aVar.a(com.yandex.div.json.j.e(jSONObject, str, arrayList3));
                return null;
            } catch (ClassCastException unused3) {
                aVar.a(com.yandex.div.json.j.m(jSONObject, str, arrayList3));
                return null;
            }
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            Object obj2 = arrayList3.get(i16);
            if (!(obj2 instanceof com.yandex.div.json.expressions.b)) {
                com.yandex.div.json.expressions.b.f370552a.getClass();
                arrayList3.set(i16, b.a.a(obj2));
            }
        }
        return new com.yandex.div.json.expressions.f(str, arrayList3, xVar, eVar.getF370579a());
    }

    @N
    public static List f(@N JSONObject jSONObject, @N String str, @N Y41.p pVar, @N x xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw com.yandex.div.json.j.g(str, jSONObject);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List listEmptyList = Collections.emptyList();
            try {
                if (!xVar.isValid(listEmptyList)) {
                    iVar.a(com.yandex.div.json.j.e(jSONObject, str, listEmptyList));
                }
                return listEmptyList;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, listEmptyList));
                return listEmptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                try {
                    Object objInvoke = pVar.invoke(eVar, jSONObjectOptJSONObject);
                    if (objInvoke != null) {
                        arrayList.add(objInvoke);
                    }
                } catch (ClassCastException unused2) {
                    iVar.a(com.yandex.div.json.j.l(jSONArrayOptJSONArray, str, i12, jSONObjectOptJSONObject));
                } catch (Exception e12) {
                    iVar.a(com.yandex.div.json.j.d(jSONArrayOptJSONArray, str, i12, jSONObjectOptJSONObject, e12));
                }
            }
        }
        try {
            if (xVar.isValid(arrayList)) {
                return arrayList;
            }
            throw com.yandex.div.json.j.e(jSONObject, str, arrayList);
        } catch (ClassCastException unused3) {
            throw com.yandex.div.json.j.m(jSONObject, str, arrayList);
        }
    }

    @P
    public static <T extends com.yandex.div.json.b> T g(@N JSONObject jSONObject, @N String str, @N Y41.p<com.yandex.div.json.e, JSONObject, T> pVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return pVar.invoke(eVar, jSONObjectOptJSONObject);
        } catch (ParsingException e12) {
            iVar.a(e12);
            return null;
        }
    }

    @P
    public static Object h(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt == null) {
            return null;
        }
        try {
            Object objInvoke = lVar.invoke(objOpt);
            if (objInvoke == null) {
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, objOpt));
                return null;
            }
            try {
                if (f12.g(objInvoke)) {
                    return objInvoke;
                }
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, objOpt));
                return null;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, objOpt));
                return null;
            }
        } catch (ClassCastException unused2) {
            iVar.a(com.yandex.div.json.j.m(jSONObject, str, objOpt));
            return null;
        } catch (Exception e12) {
            iVar.a(com.yandex.div.json.j.f(jSONObject, str, objOpt, e12));
            return null;
        }
    }

    @P
    public static com.yandex.div.json.expressions.b i(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar, @P com.yandex.div.json.expressions.b bVar, @N D d12) {
        Object objOpt = jSONObject.opt(str);
        Object obj = (objOpt == null || objOpt == JSONObject.NULL) ? null : objOpt;
        if (obj == null) {
            return null;
        }
        if (com.yandex.div.json.expressions.b.c(obj)) {
            return new b.c(str, obj.toString(), lVar, f12, iVar, d12, bVar);
        }
        try {
            Object objInvoke = lVar.invoke(obj);
            if (objInvoke == null) {
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, obj));
                return null;
            }
            try {
                if (f12.g(objInvoke)) {
                    com.yandex.div.json.expressions.b.f370552a.getClass();
                    return b.a.a(objInvoke);
                }
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, obj));
                return null;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, obj));
                return null;
            }
        } catch (ClassCastException unused2) {
            iVar.a(com.yandex.div.json.j.m(jSONObject, str, obj));
            return null;
        } catch (Exception e12) {
            iVar.a(com.yandex.div.json.j.f(jSONObject, str, obj, e12));
            return null;
        }
    }

    @P
    public static List j(@N JSONObject jSONObject, @N String str, @N Y41.l lVar, @N x xVar, @N com.yandex.div.json.i iVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List listEmptyList = Collections.emptyList();
            try {
                if (xVar.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, listEmptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            Object objOpt = jSONArrayOptJSONArray.opt(i12);
            if (L.f(objOpt, JSONObject.NULL)) {
                objOpt = null;
            }
            if (objOpt != null) {
                try {
                    Object objInvoke = lVar.invoke(objOpt);
                    if (objInvoke != null) {
                        arrayList.add(objInvoke);
                    }
                } catch (ClassCastException unused2) {
                    iVar.a(com.yandex.div.json.j.l(jSONArrayOptJSONArray, str, i12, objOpt));
                } catch (Exception e12) {
                    iVar.a(com.yandex.div.json.j.d(jSONArrayOptJSONArray, str, i12, objOpt, e12));
                }
            }
        }
        try {
            if (xVar.isValid(arrayList)) {
                return arrayList;
            }
            iVar.a(com.yandex.div.json.j.e(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused3) {
            iVar.a(com.yandex.div.json.j.m(jSONObject, str, arrayList));
            return null;
        }
    }

    @P
    public static <R, T> List<T> k(@N JSONObject jSONObject, @N String str, @N Y41.p<com.yandex.div.json.e, R, T> pVar, @N x<T> xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        T tInvoke;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> listEmptyList = Collections.emptyList();
            try {
                if (xVar.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                iVar.a(com.yandex.div.json.j.e(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, listEmptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null && (tInvoke = pVar.invoke(eVar, jSONObjectOptJSONObject)) != null) {
                arrayList.add(tInvoke);
            }
        }
        try {
            if (xVar.isValid(arrayList)) {
                return arrayList;
            }
            iVar.a(com.yandex.div.json.j.e(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            iVar.a(com.yandex.div.json.j.m(jSONObject, str, arrayList));
            return null;
        }
    }

    @N
    public static List l(@N JSONObject jSONObject, @N String str, @N Y41.p pVar, @N x xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw com.yandex.div.json.j.g(str, jSONObject);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List listEmptyList = Collections.emptyList();
            try {
                if (!xVar.isValid(listEmptyList)) {
                    iVar.a(com.yandex.div.json.j.e(jSONObject, str, listEmptyList));
                }
                return listEmptyList;
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, listEmptyList));
                return listEmptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject == null) {
                throw com.yandex.div.json.j.h(jSONArrayOptJSONArray, str, i12);
            }
            try {
                Object objInvoke = pVar.invoke(eVar, jSONObjectOptJSONObject);
                if (objInvoke == null) {
                    throw com.yandex.div.json.j.c(jSONArrayOptJSONArray, str, i12, jSONObjectOptJSONObject);
                }
                arrayList.add(objInvoke);
            } catch (ClassCastException unused2) {
                throw com.yandex.div.json.j.l(jSONArrayOptJSONArray, str, i12, jSONObjectOptJSONObject);
            } catch (Exception e12) {
                throw com.yandex.div.json.j.d(jSONArrayOptJSONArray, str, i12, jSONObjectOptJSONObject, e12);
            }
        }
        try {
            if (xVar.isValid(arrayList)) {
                return arrayList;
            }
            throw com.yandex.div.json.j.e(jSONObject, str, arrayList);
        } catch (ClassCastException unused3) {
            throw com.yandex.div.json.j.m(jSONObject, str, arrayList);
        }
    }
}
