package com.my.target;

import android.content.Context;
import com.my.target.f1;
import com.my.target.p1;
import com.my.tracker.ads.AdFormat;
import e11.AbstractC39858c1;
import e11.C39848C;
import e11.C39859d;
import e11.C39882k1;
import e11.C39884l0;
import e11.C39901r0;
import e11.C39913v0;
import e11.Q1;
import e11.X1;
import e11.e2;
import e11.n2;
import e11.p2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37785f0 extends AbstractC37789h0<e11.W0> implements f1.a {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public String f364832a;

    @Override // com.my.target.f1.a
    @j.P
    public final AbstractC39858c1 a(@j.N JSONObject jSONObject, @j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        p2 p2VarA = new C39859d(c39882k1, c39901r0, context).a(this.f364832a, jSONObject);
        if (p2VarA == null) {
            return null;
        }
        e11.W0 w02 = new e11.W0();
        w02.f394498b = p2VarA;
        return w02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [e11.P, e11.p] */
    /* JADX WARN: Type inference failed for: r9v11, types: [e11.p2] */
    /* JADX WARN: Type inference failed for: r9v12, types: [e11.C, e11.p] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.my.target.AbstractC37789h0
    @j.P
    public final AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        e11.X0 x0B;
        ?? p12;
        e11.W0 w02 = (e11.W0) abstractC39858c1;
        if (AbstractC37789h0.d(str)) {
            e11.L l12 = new e11.L(c39901r0, c39882k1);
            l12.f(str);
            ArrayList arrayList2 = l12.f394394g;
            if (!arrayList2.isEmpty()) {
                if (w02 == null) {
                    w02 = new e11.W0();
                }
                C39913v0<com.my.target.common.models.e> c39913v0 = (C39913v0) arrayList2.get(0);
                C39884l0 c39884l0 = new C39884l0();
                c39884l0.f394705d = c39913v0.a();
                c39884l0.f394673N = c39913v0;
                c39884l0.f394679T = 1;
                c39884l0.f394697C = c39913v0.f394697C;
                c39884l0.f394698D = c39882k1.f394642K;
                Boolean bool = c39882k1.f394666x;
                if (bool != null) {
                    c39913v0.f394867U = bool.booleanValue();
                }
                Boolean bool2 = c39882k1.f394667y;
                if (bool2 != null) {
                    c39913v0.f394871Y = bool2.booleanValue();
                }
                Boolean bool3 = c39882k1.f394636E;
                if (bool3 != null) {
                    c39913v0.f394865S = bool3.booleanValue();
                }
                Boolean bool4 = c39882k1.f394634C;
                if (bool4 != null) {
                    c39884l0.f394720s = bool4.booleanValue();
                }
                Boolean bool5 = c39882k1.f394635D;
                if (bool5 != null) {
                    c39884l0.f394719r = bool5.booleanValue();
                }
                float f12 = c39882k1.f394665w;
                if (f12 >= 0.0f) {
                    c39913v0.f394872Z = f12;
                }
                Iterator<X1> it = c39913v0.f394702a.e("click").iterator();
                while (it.hasNext()) {
                    c39884l0.f394702a.b(it.next());
                }
                w02.f394498b = c39884l0;
                if (c39884l0.f394699E == null) {
                    c39884l0.f394699E = c39913v0.f394699E;
                }
                Iterator it2 = new ArrayList(c39913v0.f394854H).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    n2 n2Var = (n2) it2.next();
                    String str2 = n2Var.f394690I;
                    e2 e2Var = n2Var.f394702a;
                    if (str2 != null) {
                        p12 = new C39848C();
                        p12.f394726y = n2Var.f394726y;
                        p12.f394290L = n2Var.f394690I;
                        p12.f394702a.c(e2Var, 0.0f);
                        p12.f394697C = n2Var.f394697C;
                    } else if (n2Var.f394689H != null) {
                        p12 = new e11.P();
                        p12.f394726y = n2Var.f394726y;
                        String str3 = n2Var.f394689H;
                        if (str3 != null) {
                            int i12 = n2Var.f394722u;
                            int i13 = n2Var.f394723v;
                            com.my.target.common.models.b bVar = new com.my.target.common.models.b(str3);
                            bVar.f394305b = i12;
                            bVar.f394306c = i13;
                            p12.f394453L.add(bVar);
                            p12.f394702a.c(e2Var, 0.0f);
                            p12.f394697C = n2Var.f394697C;
                        }
                    } else {
                        p12 = 0;
                    }
                    if (p12 != 0) {
                        c39884l0.f394674O = p12;
                        break;
                    }
                }
            }
        } else {
            JSONObject jSONObjectC = AbstractC37789h0.c(str, aVar, p1Var, arrayList);
            if (jSONObjectC != null) {
                if (w02 == null) {
                    w02 = new e11.W0();
                }
                this.f364832a = jSONObjectC.optString("mraid.js");
                String str4 = c39901r0.f394773j;
                if ("fullscreen".equals(str4) || AdFormat.REWARDED.equals(str4)) {
                    jSONObjectOptJSONObject = jSONObjectC.optJSONObject("fullscreen");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = jSONObjectC.optJSONObject(AdFormat.REWARDED);
                    }
                } else {
                    jSONObjectOptJSONObject = jSONObjectC.optJSONObject(str4);
                }
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                        if ("additionalData".equals(jSONObjectOptJSONObject2.optString("type", ""))) {
                            C39882k1 c39882k1A = new Q1(c39882k1, c39901r0, context).a(jSONObjectOptJSONObject2);
                            if (c39882k1A != null) {
                                c39882k1.f394645c.add(c39882k1A);
                            }
                        } else {
                            p2 p2VarA = new C39859d(c39882k1, c39901r0, context).a(this.f364832a, jSONObjectOptJSONObject2);
                            if (p2VarA != null) {
                                w02.f394498b = p2VarA;
                            }
                        }
                    }
                } else if (c39901r0.f394767d && (jSONObjectOptJSONObject3 = jSONObjectC.optJSONObject("mediation")) != null && (x0B = new f1(this, c39882k1, c39901r0, context).b(jSONObjectOptJSONObject3)) != null) {
                    w02.f394557a = x0B;
                }
            }
        }
        return w02;
    }
}
