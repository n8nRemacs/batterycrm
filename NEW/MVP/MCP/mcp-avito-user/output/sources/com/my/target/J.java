package com.my.target;

import android.content.Context;
import com.my.target.p1;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import e11.AbstractC39858c1;
import e11.C39881k0;
import e11.C39882k1;
import e11.C39901r0;
import e11.C39910u0;
import e11.C39913v0;
import e11.Q1;
import e11.g2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class J extends AbstractC37789h0<C39881k0> {
    public static void e(@j.N JSONObject jSONObject, @j.N Q1 q12, @j.N e11.J0<com.my.target.common.models.e> j02, @j.N g2 g2Var, @j.N C39882k1 c39882k1) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(j02.f394372c);
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int i12 = c39882k1.f394656n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
            if (jSONObjectOptJSONObject != null) {
                boolean zEquals = "additionalData".equals(jSONObjectOptJSONObject.optString("type"));
                ArrayList<C39913v0<T>> arrayList3 = j02.f394373d;
                if (zEquals) {
                    C39882k1 c39882k1A = q12.a(jSONObjectOptJSONObject);
                    if (c39882k1A != null) {
                        c39882k1A.f394651i = j02.f394372c;
                        c39882k1A.f394642K = c39882k1.f394642K;
                        if (c39882k1A.f394657o != -1) {
                            arrayList.add(c39882k1A);
                        } else {
                            arrayList2.add(c39882k1A);
                            if (!c39882k1A.f394664v && !c39882k1A.f394663u) {
                                c39882k1.f394645c.add(c39882k1A);
                                int size = c39882k1.f394656n;
                                if (size < 0) {
                                    size = arrayList3.size();
                                }
                                c39882k1A.b(size);
                            }
                            j02.c(c39882k1A);
                        }
                    }
                } else {
                    C39913v0<com.my.target.common.models.e> c39913v0 = new C39913v0<>();
                    if (g2Var.e(jSONObjectOptJSONObject, c39913v0)) {
                        if (i12 >= 0) {
                            j02.b(c39913v0, i12);
                            i12++;
                        } else {
                            c39913v0.f394873a0 = j02.f394371b;
                            arrayList3.add(c39913v0);
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C39882k1 c39882k12 = (C39882k1) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C39882k1 c39882k13 = (C39882k1) it2.next();
                    if (c39882k12.f394657o == c39882k13.f394655m) {
                        c39882k13.f394650h = c39882k12;
                        c39882k12.b(c39882k13.f394656n);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.my.target.AbstractC37789h0
    @j.P
    public final AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context) {
        JSONObject jSONObjectOptJSONObject;
        C39881k0 c39881k0 = (C39881k0) abstractC39858c1;
        if (AbstractC37789h0.d(str)) {
            e11.L l12 = new e11.L(c39901r0, c39882k1);
            l12.f(str);
            String str2 = c39882k1.f394651i;
            if (str2 == null) {
                str2 = InstreamAdBreakType.PREROLL;
            }
            if (c39881k0 == null) {
                c39881k0 = new C39881k0();
            }
            e11.J0<com.my.target.common.models.e> j02 = c39881k0.f394631b.get(str2);
            if (j02 != null) {
                ArrayList<C39913v0<T>> arrayList2 = l12.f394394g;
                if (arrayList2.isEmpty()) {
                    C39882k1 c39882k12 = l12.f394397j;
                    if (c39882k12 != null) {
                        c39882k12.f394651i = j02.f394372c;
                        int size = c39882k1.f394656n;
                        if (size < 0) {
                            size = j02.f394373d.size();
                        }
                        c39882k12.b(size);
                        j02.c(c39882k12);
                    }
                } else {
                    int i12 = c39882k1.f394656n;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C39913v0<T> c39913v0 = (C39913v0) it.next();
                        Boolean bool = c39882k1.f394666x;
                        if (bool != null) {
                            c39913v0.f394867U = bool.booleanValue();
                        }
                        Boolean bool2 = c39882k1.f394667y;
                        if (bool2 != null) {
                            c39913v0.f394871Y = bool2.booleanValue();
                        }
                        Boolean bool3 = c39882k1.f394634C;
                        if (bool3 != null) {
                            c39913v0.f394720s = bool3.booleanValue();
                        }
                        Boolean bool4 = c39882k1.f394635D;
                        if (bool4 != null) {
                            c39913v0.f394719r = bool4.booleanValue();
                        }
                        Boolean bool5 = c39882k1.f394636E;
                        if (bool5 != null) {
                            c39913v0.f394865S = bool5.booleanValue();
                        }
                        float f12 = c39882k1.f394665w;
                        if (f12 >= 0.0f) {
                            c39913v0.f394872Z = f12;
                        }
                        c39913v0.f394859M = "Close";
                        if (i12 >= 0) {
                            j02.b(c39913v0, i12);
                            i12++;
                        } else {
                            c39913v0.f394873a0 = j02.f394371b;
                            j02.f394373d.add(c39913v0);
                        }
                    }
                }
            }
        } else {
            JSONObject jSONObjectC = AbstractC37789h0.c(str, aVar, p1Var, arrayList);
            if (jSONObjectC != null && (jSONObjectOptJSONObject = jSONObjectC.optJSONObject(c39901r0.f394773j)) != null) {
                if (c39881k0 == null) {
                    c39881k0 = new C39881k0();
                }
                new C39910u0();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("settings");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator it2 = new ArrayList(c39881k0.f394631b.values()).iterator();
                    while (it2.hasNext()) {
                        e11.J0 j03 = (e11.J0) it2.next();
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(j03.f394372c);
                        if (jSONObjectOptJSONObject3 != null) {
                            j03.f394377h = jSONObjectOptJSONObject3.optInt("connectionTimeout", j03.f394377h);
                            int iOptInt = jSONObjectOptJSONObject3.optInt("maxBannersShow", j03.f394378i);
                            if (iOptInt == 0) {
                                iOptInt = -1;
                            }
                            j03.f394378i = iOptInt;
                        }
                    }
                }
                Q1 q12 = new Q1(c39882k1, c39901r0, context);
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("sections");
                if (jSONObjectOptJSONObject4 != null) {
                    String str3 = c39882k1.f394651i;
                    if (str3 != null) {
                        e11.J0<com.my.target.common.models.e> j04 = c39881k0.f394631b.get(str3);
                        if (j04 != null) {
                            e(jSONObjectOptJSONObject4, q12, j04, new g2(c39882k1, c39901r0, context), c39882k1);
                        }
                    } else {
                        Iterator it3 = new ArrayList(c39881k0.f394631b.values()).iterator();
                        while (it3.hasNext()) {
                            e(jSONObjectOptJSONObject4, q12, (e11.J0) it3.next(), new g2(c39882k1, c39901r0, context), c39882k1);
                        }
                    }
                }
            }
        }
        return c39881k0;
    }
}
