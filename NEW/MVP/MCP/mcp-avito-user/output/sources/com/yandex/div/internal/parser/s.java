package com.yandex.div.internal.parser;

import H21.a;
import androidx.camera.camera2.internal.G;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import j.N;
import j.P;
import java.util.List;
import kotlin.X;
import org.json.JSONObject;

/* compiled from: JsonTemplateParser.java */
/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C38106b f370145a = new C38106b(4);

    @N
    public static H21.a a(@N JSONObject jSONObject, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N x xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar, @N E.b bVar) {
        C38106b c38106b = C38107c.f370139a;
        com.yandex.div.json.expressions.d dVarE = C38107c.e(jSONObject, "colors", lVar, xVar, iVar, eVar, bVar, C38107c.a.f370144q2);
        if (dVarE != null) {
            return new a.e(dVarE, z12);
        }
        String strL = l(jSONObject, "colors", iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @N
    public static H21.a b(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar) {
        H21.a aVarN;
        try {
            return new a.e(C38107c.a(jSONObject, str, lVar, f12), z12);
        } catch (ParsingException e12) {
            if (e12.f370541b != ParsingExceptionReason.f370545c || (aVarN = n(z12, l(jSONObject, str, iVar), aVar)) == null) {
                throw e12;
            }
            return aVarN;
        }
    }

    @N
    public static <T> H21.a<T> c(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a<T> aVar, @N Y41.p<com.yandex.div.json.e, JSONObject, T> pVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        H21.a<T> aVarN;
        try {
            return new a.e(C38107c.b(jSONObject, str, pVar, eVar), z12);
        } catch (ParsingException e12) {
            if (e12.f370541b != ParsingExceptionReason.f370545c || (aVarN = n(z12, l(jSONObject, str, iVar), aVar)) == null) {
                throw e12;
            }
            return aVarN;
        }
    }

    @N
    public static H21.a d(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar, @N D d12) {
        H21.a aVarN;
        try {
            return new a.e(C38107c.c(jSONObject, str, lVar, f12, iVar, d12), z12);
        } catch (ParsingException e12) {
            if (e12.f370541b != ParsingExceptionReason.f370545c || (aVarN = n(z12, l(jSONObject, str, iVar), aVar)) == null) {
                throw e12;
            }
            return aVarN;
        }
    }

    @N
    public static <T> H21.a<List<T>> e(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a<List<T>> aVar, @N Y41.p<com.yandex.div.json.e, JSONObject, T> pVar, @N x<T> xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        H21.a<List<T>> aVarN;
        try {
            return new a.e(C38107c.f(jSONObject, str, pVar, xVar, iVar, eVar), z12);
        } catch (ParsingException e12) {
            if (e12.f370541b != ParsingExceptionReason.f370545c || (aVarN = n(z12, l(jSONObject, str, iVar), aVar)) == null) {
                throw e12;
            }
            return aVarN;
        }
    }

    @N
    public static H21.a f(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar) {
        Object objH = C38107c.h(jSONObject, str, lVar, f12, iVar);
        if (objH != null) {
            return new a.e(objH, z12);
        }
        String strL = l(jSONObject, str, iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @N
    public static <T> H21.a<T> g(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a<T> aVar, @N Y41.p<com.yandex.div.json.e, JSONObject, T> pVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        C38106b c38106b = C38107c.f370139a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        T t12 = null;
        if (jSONObjectOptJSONObject != null) {
            try {
                T tInvoke = pVar.invoke(eVar, jSONObjectOptJSONObject);
                if (tInvoke == null) {
                    iVar.a(com.yandex.div.json.j.e(jSONObject, str, jSONObjectOptJSONObject));
                } else {
                    t12 = tInvoke;
                }
            } catch (ClassCastException unused) {
                iVar.a(com.yandex.div.json.j.m(jSONObject, str, jSONObjectOptJSONObject));
            } catch (Exception e12) {
                iVar.a(com.yandex.div.json.j.f(jSONObject, str, jSONObjectOptJSONObject, e12));
            }
        }
        if (t12 != null) {
            return new a.e(t12, z12);
        }
        String strL = l(jSONObject, str, iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @N
    public static H21.a h(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a aVar, @N com.yandex.div.json.i iVar) {
        return f(jSONObject, str, z12, aVar, C38107c.f370141c, C38107c.f370139a, iVar);
    }

    @N
    public static H21.a i(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N F f12, @N com.yandex.div.json.i iVar, @N D d12) {
        com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, str, lVar, f12, iVar, null, d12);
        if (bVarI != null) {
            return new a.e(bVarI, z12);
        }
        String strL = l(jSONObject, str, iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @N
    public static <R, T> H21.a<List<T>> j(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a<List<T>> aVar, @N Y41.p<com.yandex.div.json.e, R, T> pVar, @N x<T> xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        List listK = C38107c.k(jSONObject, str, pVar, xVar, iVar, eVar);
        if (listK != null) {
            return new a.e(listK, z12);
        }
        String strL = l(jSONObject, str, iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @N
    public static H21.a k(@N JSONObject jSONObject, boolean z12, @P H21.a aVar, @N Y41.l lVar, @N x xVar, @N com.yandex.div.json.i iVar) {
        List listJ = C38107c.j(jSONObject, "transition_triggers", lVar, xVar, iVar);
        if (listJ != null) {
            return new a.e(listJ, z12);
        }
        String strL = l(jSONObject, "transition_triggers", iVar);
        if (strL != null) {
            return new a.d(z12, strL);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }

    @X
    @P
    public static String l(@N JSONObject jSONObject, @N String str, @N com.yandex.div.json.i iVar) {
        return (String) C38107c.h(jSONObject, G.f("$", str), C38107c.f370141c, f370145a, iVar);
    }

    @N
    public static <T> H21.a<List<T>> m(@N JSONObject jSONObject, @N String str, boolean z12, @P H21.a<List<T>> aVar, @N Y41.p<com.yandex.div.json.e, JSONObject, T> pVar, @N x<T> xVar, @N com.yandex.div.json.i iVar, @N com.yandex.div.json.e eVar) {
        H21.a<List<T>> aVarN;
        try {
            return new a.e(C38107c.l(jSONObject, str, pVar, xVar, iVar, eVar), z12);
        } catch (ParsingException e12) {
            if (e12.f370541b != ParsingExceptionReason.f370545c || (aVarN = n(z12, l(jSONObject, str, iVar), aVar)) == null) {
                throw e12;
            }
            return aVarN;
        }
    }

    @X
    @P
    public static <T> H21.a<T> n(boolean z12, @P String str, @P H21.a<T> aVar) {
        if (str != null) {
            return new a.d(z12, str);
        }
        if (aVar != null) {
            return H21.b.a(aVar, z12);
        }
        if (!z12) {
            return null;
        }
        H21.a.f6925b.getClass();
        return a.C0393a.a(z12);
    }
}
