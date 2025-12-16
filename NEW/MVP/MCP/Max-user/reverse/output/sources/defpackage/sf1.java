package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sf1 {
    public final dj1 a;
    public final y6d b;
    public sm6 c;
    public final cm6 d;
    public final wd8 e;
    public final si1 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public p8a i = new p8a();

    public sf1(dj1 dj1Var, y6d y6dVar, sm6 sm6Var, kk4 kk4Var, cm6 cm6Var, wd8 wd8Var, si1 si1Var) {
        this.a = dj1Var;
        this.b = y6dVar;
        this.c = sm6Var;
        this.d = cm6Var;
        this.e = wd8Var;
        this.f = si1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r6 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h29 a(defpackage.g29 r2, defpackage.h29 r3, java.util.List r4, java.util.ArrayList r5, boolean r6) {
        /*
            if (r3 != 0) goto L3
            goto L14
        L3:
            int[] r0 = defpackage.rf1.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L12
            goto L31
        L12:
            if (r6 == 0) goto L31
        L14:
            h29 r2 = defpackage.h29.a
            return r2
        L17:
            wi1 r6 = defpackage.wi1.a
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L32
            wi1 r6 = defpackage.wi1.b
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L28
            goto L32
        L28:
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L31
            h29 r2 = defpackage.h29.d
            return r2
        L31:
            return r3
        L32:
            h29 r2 = defpackage.h29.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf1.a(g29, h29, java.util.List, java.util.ArrayList, boolean):h29");
    }

    public static boolean d(y8a y8aVar) {
        Object obj = y8aVar.get();
        h29 h29Var = h29.c;
        if (obj == h29Var) {
            return false;
        }
        if (y8aVar.get() == h29.b) {
            y8aVar.set(h29.a);
        }
        if (y8aVar.get() != h29.d) {
            return true;
        }
        y8aVar.set(h29Var);
        return true;
    }

    public static void e(y8a y8aVar) {
        h29 h29Var = (h29) y8aVar.get();
        if (h29Var == h29.c) {
            y8aVar.set(h29.b);
        } else if (h29Var == h29.d) {
            y8aVar.set(h29.a);
        }
    }

    public final void b(JSONObject jSONObject) throws JSONException {
        ti1 ti1VarA;
        ti1 ti1VarA2;
        ti1 ti1Var;
        fje fjeVarY = kk4.y(jSONObject);
        dj1 dj1Var = this.a;
        ti1 ti1Var2 = dj1Var.a.a;
        String strG = yni.g(jSONObject, "adminId");
        if (strG != null) {
            try {
                ti1VarA = ti1.a(strG);
            } catch (Exception unused) {
            }
        } else {
            ti1VarA = null;
        }
        String strG2 = yni.g(jSONObject, "participantId");
        if (strG2 != null) {
            try {
                ti1VarA2 = ti1.a(strG2);
            } catch (Exception unused2) {
                ti1VarA2 = null;
            }
            ti1Var = ti1VarA2;
        } else {
            ti1Var = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("muteAll", false);
        Map mapK = id5.a;
        if (ti1Var != null && !ti1Var.equals(ti1Var2)) {
            if (jSONObject.has("muteStates")) {
                mapK = paj.k(jSONObject);
            }
            int i = 26;
            dj1Var.f(new bnb(ti1Var, new uha(i), new k5(f(jSONObject, ti1Var, "handleMuteParticipant", mapK, false)), new uha(i), new uha(i), new uha(i), new uha(i), new uha(26), new uha(26)), null);
            return;
        }
        if (ti1VarA != null && ti1VarA.equals(ti1Var2)) {
            n(jSONObject, "handleMuteParticipant", 3, fjeVarY, false);
            ArrayList arrayList = new ArrayList(dj1Var.q());
            for (ti1 ti1Var3 : dj1Var.d(fjeVarY).keySet()) {
                int i2 = 26;
                arrayList.add(new bnb(ti1Var3, new uha(i2), new k5(f(jSONObject, ti1Var3, "handleMuteParticipant", mapK, false)), new uha(i2), new uha(26), new uha(26), new uha(26), new uha(26), new uha(26)));
            }
            dj1Var.g(fjeVarY, arrayList);
            return;
        }
        if (!zOptBoolean) {
            c(jSONObject, fjeVarY, false);
            return;
        }
        c(jSONObject, fjeVarY, true);
        n(jSONObject, "handleMuteParticipant", 3, fjeVarY, false);
        ArrayList arrayList2 = new ArrayList(dj1Var.q());
        for (ti1 ti1Var4 : dj1Var.d(fjeVarY).keySet()) {
            Map map = mapK;
            int i3 = 26;
            arrayList2.add(new bnb(ti1Var4, new uha(i3), new k5(f(jSONObject, ti1Var4, "handleMuteParticipant", map, false)), new uha(i3), new uha(26), new uha(26), new uha(26), new uha(26), new uha(26)));
            mapK = map;
        }
        dj1Var.g(fjeVarY, arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(25:5|148|6|(1:8)(4:9|(5:12|(1:14)(3:15|16|34)|(2:41|172)(1:173)|42|10)|171|43)|46|(19:48|(1:50)(4:52|(4:55|(2:57|169)(1:170)|58|53)|168|59)|51|60|(1:68)|70|149|71|(5:74|(1:76)(3:77|78|96)|(2:103|152)(1:153)|104|72)|151|106|(4:109|(2:161|(3:160|112|(3:159|114|(1:166)(3:155|117|167))(3:154|118|165))(3:158|119|164))(3:157|120|163)|162|107)|156|121|(1:125)|(1:129)|(1:133)|(1:137)|(2:142|(2:146|147)(1:174))(1:176))(1:69)|67|70|149|71|(1:72)|151|106|(1:107)|156|121|(2:123|125)|(2:127|129)|(2:131|133)|(2:135|137)|(1:139)|142|(1:144)|146|147) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017a, code lost:
    
        r6 = java.util.Collections.EMPTY_SET;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e A[Catch: JSONException -> 0x017a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x017a, blocks: (B:71:0x011b, B:72:0x0128, B:74:0x012e, B:103:0x0174), top: B:149:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.json.JSONObject r24, defpackage.fje r25, boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf1.c(org.json.JSONObject, fje, boolean):void");
    }

    public final p8a f(JSONObject jSONObject, ti1 ti1Var, String str, Map map, boolean z) {
        HashMap linkedHashMap;
        int i;
        List list;
        dj1 dj1Var = this.a;
        yi1 yi1VarJ = ti1Var != null ? dj1Var.j(ti1Var) : null;
        boolean zIsEmpty = map.isEmpty();
        y6d y6dVar = this.b;
        g29 g29Var = g29.d;
        g29 g29Var2 = g29.c;
        g29 g29Var3 = g29.b;
        g29 g29Var4 = g29.a;
        if (!zIsEmpty) {
            linkedHashMap = new HashMap(g29.values().length);
            h29 h29Var = this.i.a;
            h29 h29Var2 = (h29) map.get(g29Var4);
            if (h29Var2 != null) {
                h29Var = h29Var2;
            }
            linkedHashMap.put(g29Var4, h29Var);
            h29 h29Var3 = this.i.b;
            h29 h29Var4 = (h29) map.get(g29Var3);
            if (h29Var4 != null) {
                h29Var3 = h29Var4;
            }
            linkedHashMap.put(g29Var3, h29Var3);
            h29 h29Var5 = this.i.c;
            h29 h29Var6 = (h29) map.get(g29Var2);
            if (h29Var6 != null) {
                h29Var5 = h29Var6;
            }
            linkedHashMap.put(g29Var2, h29Var5);
            h29 h29Var7 = this.i.d;
            h29 h29Var8 = (h29) map.get(g29Var);
            if (h29Var8 != null) {
                h29Var7 = h29Var8;
            }
            linkedHashMap.put(g29Var, h29Var7);
        } else if (fni.a(ti1Var, dj1Var.a.a)) {
            linkedHashMap = new HashMap(g29.values().length);
            linkedHashMap.put(g29Var4, this.i.a);
            linkedHashMap.put(g29Var3, this.i.b);
            linkedHashMap.put(g29Var2, this.i.c);
            linkedHashMap.put(g29Var, this.i.d);
        } else if ((yi1VarJ != null ? yi1VarJ.b : null) != null) {
            linkedHashMap = new HashMap(g29.values().length);
            p8a p8aVar = yi1VarJ.b;
            linkedHashMap.put(g29Var4, p8aVar.a);
            linkedHashMap.put(g29Var3, p8aVar.b);
            linkedHashMap.put(g29Var2, p8aVar.c);
            linkedHashMap.put(g29Var, p8aVar.d);
        } else {
            linkedHashMap = new LinkedHashMap();
            y6dVar.log("CallMediaOptionsDelegate", "createParticipantMediaOptions null participant or null media options");
        }
        HashMap map2 = linkedHashMap;
        if (z) {
            for (Map.Entry entry : paj.k(jSONObject).entrySet()) {
                g29 g29Var5 = (g29) entry.getKey();
                h29 h29Var9 = (h29) entry.getValue();
                if (h29Var9 != null) {
                    map2.put(g29Var5, h29Var9);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unmuteOptions");
        if (jSONArrayOptJSONArray != null) {
            try {
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    try {
                        arrayList.add(g29.valueOf((String) jSONArrayOptJSONArray.get(i2)));
                        i = length;
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder();
                        i = length;
                        sb.append("invalid MediaOption in ");
                        sb.append(str);
                        y6dVar.logException("CallMediaOptionsDelegate", sb.toString(), e);
                    }
                    i2++;
                    length = i;
                }
            } catch (JSONException e2) {
                y6dVar.logException("CallMediaOptionsDelegate", str, e2);
            }
        }
        boolean zOptBoolean = jSONObject.optBoolean("unmute", false);
        boolean zHas = jSONObject.has("roles");
        List listU = hd5.a;
        if (zHas) {
            try {
                listU = paj.u(jSONObject);
            } catch (Exception unused) {
                list = yi1VarJ != null ? yi1VarJ.e : null;
                if (list != null) {
                }
            }
        } else {
            list = yi1VarJ != null ? yi1VarJ.e : null;
            if (list != null) {
                listU = list;
            }
        }
        p8a p8aVar2 = new p8a();
        p8aVar2.a = a(g29Var4, (h29) map2.get(g29Var4), listU, arrayList, zOptBoolean);
        p8aVar2.b = a(g29Var3, (h29) map2.get(g29Var3), listU, arrayList, zOptBoolean);
        p8aVar2.c = a(g29Var2, (h29) map2.get(g29Var2), listU, arrayList, zOptBoolean);
        p8aVar2.d = a(g29Var, (h29) map2.get(g29Var), listU, arrayList, zOptBoolean);
        return p8aVar2;
    }

    public final Map g(fje fjeVar, int i) {
        Map map;
        int i2 = rf1.$EnumSwitchMapping$1[az1.v(i)];
        return i2 != 1 ? (i2 == 2 && (map = (Map) this.g.get(fjeVar)) != null) ? map : id5.a : h(fjeVar).a();
    }

    public final p8a h(fje fjeVar) {
        LinkedHashMap linkedHashMap = this.h;
        Object p8aVar = linkedHashMap.get(fjeVar);
        if (p8aVar == null) {
            p8aVar = new p8a();
            linkedHashMap.put(fjeVar, p8aVar);
        }
        return (p8a) p8aVar;
    }

    public final void i(JSONObject jSONObject) {
        try {
            b(jSONObject);
        } catch (JSONException e) {
            this.b.logException("CallMediaOptionsDelegate", "can't handle mute participant", e);
        }
    }

    public final void j(ti1 ti1Var, boolean z) {
        if (z || !fni.a(this.a.a.a, ti1Var)) {
            return;
        }
        tv tvVar = new tv(0, 14, p8a.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        Object obj = tvVar.get();
        h29 h29Var = h29.d;
        h29 h29Var2 = h29.c;
        if (obj == h29Var2) {
            tvVar.set(h29Var);
        }
        tv tvVar2 = new tv(0, 15, p8a.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (tvVar2.get() == h29Var2) {
            tvVar2.set(h29Var);
        }
        tv tvVar3 = new tv(0, 16, p8a.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (tvVar3.get() == h29Var2) {
            tvVar3.set(h29Var);
        }
        tv tvVar4 = new tv(0, 17, p8a.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (tvVar4.get() == h29Var2) {
            tvVar4.set(h29Var);
        }
    }

    public final void k(ArrayList arrayList, ti1 ti1Var) {
        yi1 yi1Var = this.a.a;
        if (ti1Var.equals(yi1Var.a)) {
            ArrayList arrayList2 = yi1Var.d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (arrayList.contains(wi1.b)) {
                e(new tv(0, 18, p8a.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new tv(0, 19, p8a.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new tv(0, 20, p8a.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new tv(0, 21, p8a.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
            }
        }
    }

    public final void l(boolean z) {
        EnumMap enumMapA = this.i.a();
        this.c.invoke(x71.P0, new i9a(new h9a(enumMapA, rd5.a), z && this.f.z.n));
    }

    public final void m(Map map, JSONObject jSONObject, String str, int i, fje fjeVar, boolean z) {
        p8a p8aVar = new p8a();
        g29 g29Var = g29.a;
        h29 h29Var = (h29) map.get(g29Var);
        if (h29Var != null) {
            p8aVar.a = h29Var;
        }
        g29 g29Var2 = g29.b;
        h29 h29Var2 = (h29) map.get(g29Var2);
        if (h29Var2 != null) {
            p8aVar.b = h29Var2;
        }
        g29 g29Var3 = g29.c;
        h29 h29Var3 = (h29) map.get(g29Var3);
        if (h29Var3 != null) {
            p8aVar.c = h29Var3;
        }
        g29 g29Var4 = g29.d;
        h29 h29Var4 = (h29) map.get(g29Var4);
        if (h29Var4 != null) {
            p8aVar.d = h29Var4;
        }
        p8a p8aVarH = h(fjeVar);
        EnumMap enumMap = new EnumMap(g29.class);
        h29 h29Var5 = p8aVar.a;
        if (h29Var5 != p8aVarH.a) {
            enumMap.put((EnumMap) g29Var, (g29) h29Var5);
        }
        h29 h29Var6 = p8aVar.b;
        if (h29Var6 != p8aVarH.b) {
            enumMap.put((EnumMap) g29Var2, (g29) h29Var6);
        }
        h29 h29Var7 = p8aVar.c;
        if (h29Var7 != p8aVarH.c) {
            enumMap.put((EnumMap) g29Var3, (g29) h29Var7);
        }
        h29 h29Var8 = p8aVar.d;
        if (h29Var8 != p8aVarH.d) {
            enumMap.put((EnumMap) g29Var4, (g29) h29Var8);
        }
        if (enumMap.isEmpty()) {
            return;
        }
        this.g.put(fjeVar, enumMap);
        this.h.put(fjeVar, p8aVar);
        if (z) {
            o(jSONObject, str, g(fjeVar, i), false, true, fjeVar, null);
        }
    }

    public final void n(JSONObject jSONObject, String str, int i, fje fjeVar, boolean z) {
        Map mapK;
        if (jSONObject.has("muteStates")) {
            mapK = paj.k(jSONObject);
        } else if (jSONObject.has("requestedMedia")) {
            return;
        } else {
            mapK = id5.a;
        }
        m(mapK, jSONObject, str, i, fjeVar, z);
    }

    public final void o(JSONObject jSONObject, String str, Map map, boolean z, boolean z2, fje fjeVar, fje fjeVar2) {
        JSONArray jSONArrayOptJSONArray;
        if (fjeVar2 == null) {
            fjeVar2 = (fje) this.d.invoke();
        }
        if (fjeVar.equals(fjeVar2)) {
            p8a p8aVarF = f(jSONObject, this.a.a.a, str, map, z);
            if (!p8aVarF.equals(this.i)) {
                this.i = p8aVarF;
                if (!this.f.z.n) {
                    l(false);
                } else if (!z2) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("muteStates");
                    if (((jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) && ((jSONArrayOptJSONArray = jSONObject.optJSONArray("unmuteOptions")) == null || jSONArrayOptJSONArray.length() <= 0)) ? jSONObject.has("unmute") : true) {
                        l(false);
                    }
                }
            }
            this.g.put(fjeVar, id5.a);
        }
    }
}
