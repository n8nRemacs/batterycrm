package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.my.target.p1;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import e11.A1;
import e11.AbstractC39858c1;
import e11.C39853b;
import e11.C39882k1;
import e11.C39901r0;
import e11.C39905s1;
import e11.C39913v0;
import e11.Q1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.t0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37812t0 extends AbstractC37789h0<C39905s1> {
    public static void e(@j.N JSONObject jSONObject, @j.N Q1 q12, @j.N e11.J0<com.my.target.common.models.a> j02, @j.N C39853b c39853b, @j.N C39882k1 c39882k1) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C39882k1 c39882k12 = c39882k1;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(j02.f394372c);
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int i12 = c39882k12.f394656n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        while (i13 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
            if (jSONObjectOptJSONObject != null) {
                boolean zEquals = "additionalData".equals(jSONObjectOptJSONObject.optString("type"));
                ArrayList<C39913v0<T>> arrayList3 = j02.f394373d;
                if (zEquals) {
                    C39882k1 c39882k1A = q12.a(jSONObjectOptJSONObject);
                    if (c39882k1A != null) {
                        c39882k1A.f394651i = j02.f394372c;
                        if (c39882k1A.f394657o != -1) {
                            arrayList.add(c39882k1A);
                        } else {
                            arrayList2.add(c39882k1A);
                            if (!c39882k1A.f394664v && !c39882k1A.f394663u) {
                                c39882k12.f394645c.add(c39882k1A);
                                int i14 = c39882k12.f394656n;
                                if (i14 >= 0) {
                                    c39882k1A.b(i14);
                                } else {
                                    c39882k1A.b(arrayList3.size());
                                }
                            }
                            j02.c(c39882k1A);
                        }
                    }
                } else {
                    C39913v0<T> c39913v0 = new C39913v0<>();
                    c39853b.f394526d.c(jSONObjectOptJSONObject, c39913v0);
                    c39853b.f394527e = c39913v0.f394701G;
                    if ("statistics".equals(c39913v0.f394725x)) {
                        c39853b.c(jSONObjectOptJSONObject, c39913v0);
                        jSONArray = jSONArrayOptJSONArray;
                    } else {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("duration", 0.0d);
                        if (fOptDouble <= 0.0f) {
                            c39853b.a("Required field", androidx.media3.exoplayer.analytics.m.i(fOptDouble, "unable to set duration "), c39913v0.f394726y);
                        } else {
                            c39913v0.f394863Q = jSONObjectOptJSONObject.optBoolean("autoplay", c39913v0.f394863Q);
                            c39913v0.f394864R = jSONObjectOptJSONObject.optBoolean("hasCtaButton", c39913v0.f394864R);
                            c39913v0.f394857K = jSONObjectOptJSONObject.optString("adText", c39913v0.f394857K);
                            c39853b.b(jSONObjectOptJSONObject, c39913v0);
                            C39882k1 c39882k13 = c39853b.f394523a;
                            Boolean bool = c39882k13.f394668z;
                            c39913v0.f394868V = bool != null ? bool.booleanValue() : jSONObjectOptJSONObject.optBoolean("allowSeek", c39913v0.f394868V);
                            Boolean bool2 = c39882k13.f394632A;
                            c39913v0.f394869W = bool2 != null ? bool2.booleanValue() : jSONObjectOptJSONObject.optBoolean("allowSkip", c39913v0.f394869W);
                            Boolean bool3 = c39882k13.f394633B;
                            c39913v0.f394870X = bool3 != null ? bool3.booleanValue() : jSONObjectOptJSONObject.optBoolean("allowTrackChange", c39913v0.f394870X);
                            c39853b.d(jSONObjectOptJSONObject, c39913v0);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("shareButtons");
                            if (jSONArrayOptJSONArray2 != null) {
                                int length = jSONArrayOptJSONArray2.length();
                                int i15 = 0;
                                while (i15 < length) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i15);
                                    if (jSONObjectOptJSONObject2 == null) {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    } else {
                                        com.my.target.common.models.c cVar = new com.my.target.common.models.c();
                                        jSONArray2 = jSONArrayOptJSONArray;
                                        jSONObjectOptJSONObject2.optString("name");
                                        jSONObjectOptJSONObject2.optString(ContextActionHandler.Link.URL);
                                        jSONObjectOptJSONObject2.optString("imageUrl");
                                        c39913v0.f394855I.add(cVar);
                                    }
                                    i15++;
                                    jSONArrayOptJSONArray = jSONArray2;
                                }
                            }
                            jSONArray = jSONArrayOptJSONArray;
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("mediafiles");
                            if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                                for (int i16 = 0; i16 < jSONArrayOptJSONArray3.length(); i16++) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i16);
                                    if (jSONObjectOptJSONObject3 != null) {
                                        String strOptString = jSONObjectOptJSONObject3.optString("src");
                                        if (TextUtils.isEmpty(strOptString)) {
                                            c39853b.a("Bad value", androidx.camera.camera2.internal.G.f("bad mediafile object, src = ", strOptString), c39913v0.f394726y);
                                        } else {
                                            com.my.target.common.models.a aVar = new com.my.target.common.models.a(strOptString);
                                            jSONObjectOptJSONObject3.optInt("bitrate");
                                            c39913v0.f394856J = aVar;
                                        }
                                    }
                                }
                            }
                            i13++;
                            c39882k12 = c39882k1;
                            jSONArrayOptJSONArray = jSONArray;
                        }
                    }
                    if (i12 >= 0) {
                        j02.b(c39913v0, i12);
                        i12++;
                    } else {
                        c39913v0.f394873a0 = j02.f394371b;
                        arrayList3.add(c39913v0);
                    }
                    i13++;
                    c39882k12 = c39882k1;
                    jSONArrayOptJSONArray = jSONArray;
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            i13++;
            c39882k12 = c39882k1;
            jSONArrayOptJSONArray = jSONArray;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C39882k1 c39882k14 = (C39882k1) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C39882k1 c39882k15 = (C39882k1) it2.next();
                    if (c39882k14.f394657o == c39882k15.f394655m) {
                        c39882k15.f394650h = c39882k14;
                        c39882k14.b(c39882k15.f394656n);
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
        C39905s1 c39905s1 = (C39905s1) abstractC39858c1;
        if (AbstractC37789h0.d(str)) {
            e11.L l12 = new e11.L(c39901r0, c39882k1);
            l12.f(str);
            String str2 = c39882k1.f394651i;
            if (str2 == null) {
                str2 = InstreamAdBreakType.PREROLL;
            }
            if (c39905s1 == null) {
                c39905s1 = new C39905s1();
            }
            e11.J0<com.my.target.common.models.a> j02 = c39905s1.f394792b.get(str2);
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
                        float f12 = c39882k1.f394665w;
                        if (f12 >= 0.0f) {
                            c39913v0.f394872Z = f12;
                        }
                        C37788h c37788h = c39882k1.f394642K;
                        if (c37788h != null) {
                            c39913v0.f394698D = c37788h;
                        }
                        String str3 = c39882k1.f394653k;
                        if (str3 != null) {
                            c39913v0.f394715n = str3;
                        }
                        Boolean bool = c39882k1.f394666x;
                        if (bool != null) {
                            c39913v0.f394867U = bool.booleanValue();
                        }
                        Boolean bool2 = c39882k1.f394667y;
                        if (bool2 != null) {
                            c39913v0.f394871Y = bool2.booleanValue();
                        }
                        Boolean bool3 = c39882k1.f394668z;
                        if (bool3 != null) {
                            c39913v0.f394868V = bool3.booleanValue();
                        }
                        Boolean bool4 = c39882k1.f394632A;
                        if (bool4 != null) {
                            c39913v0.f394869W = bool4.booleanValue();
                        }
                        Boolean bool5 = c39882k1.f394633B;
                        if (bool5 != null) {
                            c39913v0.f394870X = bool5.booleanValue();
                        }
                        Boolean bool6 = c39882k1.f394634C;
                        if (bool6 != null) {
                            c39913v0.f394720s = bool6.booleanValue();
                        }
                        Boolean bool7 = c39882k1.f394635D;
                        if (bool7 != null) {
                            c39913v0.f394719r = bool7.booleanValue();
                        }
                        Boolean bool8 = c39882k1.f394636E;
                        if (bool8 != null) {
                            c39913v0.f394865S = bool8.booleanValue();
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
                if (c39905s1 == null) {
                    c39905s1 = new C39905s1();
                }
                new A1();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("settings");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator it2 = new ArrayList(c39905s1.f394792b.values()).iterator();
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
                    String str4 = c39882k1.f394651i;
                    if (str4 != null) {
                        e11.J0<com.my.target.common.models.a> j04 = c39905s1.f394792b.get(str4);
                        if (j04 != null) {
                            e(jSONObjectOptJSONObject4, q12, j04, new C39853b(c39882k1, c39901r0, context), c39882k1);
                        }
                    } else {
                        Iterator it3 = new ArrayList(c39905s1.f394792b.values()).iterator();
                        while (it3.hasNext()) {
                            e(jSONObjectOptJSONObject4, q12, (e11.J0) it3.next(), new C39853b(c39882k1, c39901r0, context), c39882k1);
                        }
                    }
                }
            }
        }
        return c39905s1;
    }
}
