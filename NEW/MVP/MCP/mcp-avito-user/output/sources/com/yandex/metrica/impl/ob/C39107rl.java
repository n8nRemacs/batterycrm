package com.yandex.metrica.impl.ob;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39107rl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f381777a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f381778b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final b f381779c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381780d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f381781e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final c f381782f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final a f381783g;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    public enum a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");


        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f381794a;

        a(@j.N String str) {
            this.f381794a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$b */
    public enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");


        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f381802a;

        b(@j.N String str) {
            this.f381802a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$c */
    public enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");


        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f381806a;

        c(@j.N String str) {
            this.f381806a = str;
        }
    }

    public C39107rl(@j.N String str, @j.N String str2, @j.P b bVar, int i12, boolean z12, @j.N c cVar, @j.N a aVar) {
        this.f381777a = str;
        this.f381778b = str2;
        this.f381779c = bVar;
        this.f381780d = i12;
        this.f381781e = z12;
        this.f381782f = cVar;
        this.f381783g = aVar;
    }

    @j.P
    public JSONArray a(@j.N C38861hl c38861hl) {
        return null;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.f381777a + "', mId='" + this.f381778b + "', mParseFilterReason=" + this.f381779c + ", mDepth=" + this.f381780d + ", mListItem=" + this.f381781e + ", mViewType=" + this.f381782f + ", mClassType=" + this.f381783g + '}';
    }

    public boolean a() {
        return false;
    }

    @j.P
    public b a(@j.N Ak ak2) {
        return this.f381779c;
    }

    @j.N
    public JSONObject a(@j.N C38861hl c38861hl, @j.P b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f381782f.f381806a);
            if (bVar == null) {
                jSONObject.put("cnt", a(c38861hl));
            }
            if (c38861hl.f380737e) {
                JSONObject jSONObjectPut = new JSONObject().put("ct", this.f381783g.f381794a).put("cn", this.f381777a).put("rid", this.f381778b).put("d", this.f381780d).put("lc", this.f381781e).put("if", bVar != null);
                if (bVar != null) {
                    jSONObjectPut.put("fr", bVar.f381802a);
                }
                jSONObject.put("i", jSONObjectPut);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
