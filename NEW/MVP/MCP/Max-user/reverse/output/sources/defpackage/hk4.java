package defpackage;

import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class hk4 implements ou1, qp5 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public static jje b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1881281404) {
            if (str.equals("REMOVE")) {
                return jje.b;
            }
            return null;
        }
        if (iHashCode == -1785516855) {
            if (str.equals("UPDATE")) {
                return jje.a;
            }
            return null;
        }
        if (iHashCode == -873347853) {
            if (str.equals("ACTIVATE")) {
                return jje.c;
            }
            return null;
        }
        if (iHashCode == -595928767 && str.equals("TIMEOUT")) {
            return jje.d;
        }
        return null;
    }

    public ije a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jje jjeVarB = b(jSONArray.getString(i));
            if (jjeVarB != null) {
                linkedHashSet.add(jjeVarB);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean zOptBoolean = jSONObject.optBoolean("deactivate");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("room");
        return new ije(linkedHashSet, i2, jSONObjectOptJSONObject != null ? h(jSONObjectOptJSONObject) : null, zOptBoolean);
    }

    public jz7 c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jje jjeVarB = b(next);
            if (jjeVarB != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(h(jSONArray.getJSONObject(i)));
                    }
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        i0f i0fVar = (i0f) obj;
                        arrayList.add(new ije(Collections.singleton(jjeVarB), i0fVar.a, i0fVar, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i3)));
                    }
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList3.get(i4);
                        i4++;
                        arrayList.add(new ije(Collections.singleton(jjeVarB), ((Number) obj2).intValue(), null, false));
                    }
                }
            }
        }
        jz7 jz7Var = new jz7();
        jz7Var.a = arrayList;
        return jz7Var;
    }

    public void d(n38 n38Var, chh chhVar, List list, List list2, ggg gggVar) {
        synchronized (this.a) {
            try {
                z5j.b(!list2.isEmpty());
                this.o = gggVar;
                j48 j48VarB = n38Var.b();
                p38 p38VarF = f(j48VarB);
                if (p38VarF == null) {
                    return;
                }
                Set set = (Set) ((HashMap) this.c).get(p38VarF);
                ggg gggVar2 = (ggg) this.o;
                if (gggVar2 == null || gggVar2.b != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        n38 n38Var2 = (n38) ((HashMap) this.b).get((oa0) it.next());
                        n38Var2.getClass();
                        if (!n38Var2.equals(n38Var) && !n38Var2.h().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    n32 n32Var = n38Var.c;
                    synchronized (n32Var.v0) {
                        n32Var.s0 = chhVar;
                    }
                    n32 n32Var2 = n38Var.c;
                    synchronized (n32Var2.v0) {
                        n32Var2.t0 = list;
                    }
                    synchronized (n38Var.a) {
                        n38Var.c.b(list2);
                    }
                    if (j48VarB.p().d.a(l38.d)) {
                        l(j48VarB);
                    }
                } catch (CameraUseCaseAdapter$CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n38 e(j48 j48Var, n32 n32Var) {
        synchronized (this.a) {
            try {
                z5j.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.b).get(new oa0(j48Var, n32Var.o)) == null);
                n38 n38Var = new n38(j48Var, n32Var);
                if (((ArrayList) n32Var.v()).isEmpty()) {
                    n38Var.o();
                }
                if (j48Var.p().d == l38.a) {
                    return n38Var;
                }
                k(n38Var);
                return n38Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public p38 f(j48 j48Var) {
        synchronized (this.a) {
            try {
                for (p38 p38Var : ((HashMap) this.c).keySet()) {
                    if (j48Var.equals(p38Var.b)) {
                        return p38Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g(j48 j48Var) {
        synchronized (this.a) {
            try {
                p38 p38VarF = f(j48Var);
                if (p38VarF == null) {
                    return false;
                }
                Iterator it = ((Set) ((HashMap) this.c).get(p38VarF)).iterator();
                while (it.hasNext()) {
                    n38 n38Var = (n38) ((HashMap) this.b).get((oa0) it.next());
                    n38Var.getClass();
                    if (!n38Var.h().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new fp4((Executor) ((Provider) this.a).get(), (uy9) ((Provider) this.b).get(), (st7) ((u5i) this.c).get(), (ri5) ((Provider) this.d).get(), (wvf) ((Provider) this.o).get());
    }

    public i0f h(JSONObject jSONObject) throws JSONException {
        h0f h0fVar;
        t0f t0fVar;
        t0f t0fVar2;
        h0f h0fVarA;
        mnb mnbVar = (mnb) this.b;
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
        Boolean boolValueOf = jSONObject.has("active") ? Boolean.valueOf(jSONObject.optBoolean("active")) : null;
        if (jSONObject.has("countdownSec")) {
            jSONObject.optInt("countdownSec");
        }
        Long lValueOf = jSONObject.has("timeoutMs") ? Long.valueOf(jSONObject.optLong("timeoutMs")) : null;
        int iOptInt = jSONObject.optInt("participantCount");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participantIds");
        ArrayList arrayListA = jSONArrayOptJSONArray != null ? mnbVar.a(jSONArrayOptJSONArray) : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("addParticipantIds");
        ArrayList arrayListA2 = jSONArrayOptJSONArray2 != null ? mnbVar.a(jSONArrayOptJSONArray2) : null;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("removeParticipantIds");
        ArrayList arrayListA3 = jSONArrayOptJSONArray3 != null ? mnbVar.a(jSONArrayOptJSONArray3) : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recordInfo");
        if (jSONObjectOptJSONObject != null) {
            tt ttVar = (tt) this.d;
            try {
                h0fVarA = tt.a(jSONObjectOptJSONObject);
            } catch (JSONException e) {
                ttVar.a.logException("RecordInfoParser", "Can't parse record info", e);
                h0fVarA = null;
            }
            h0fVar = h0fVarA;
        } else {
            h0fVar = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("asrInfo");
        k21 k21VarB = jSONObjectOptJSONObject2 != null ? tt.b(jSONObjectOptJSONObject2) : null;
        Map mapK = jSONObject.has("muteStates") ? paj.k(jSONObject) : id5.a;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("participants");
        g0f g0fVarI = jSONObjectOptJSONObject3 != null ? ((py0) this.c).I(jSONObjectOptJSONObject3, new eje(i)) : null;
        boolean zIsNull = jSONObject.isNull("pinnedParticipantId");
        String strG = yni.g(jSONObject, "pinnedParticipantId");
        ti1 ti1VarA = (zIsNull || strG == null) ? null : ti1.a(strG);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("urlSharingInfo");
        if (jSONObjectOptJSONObject4 != null) {
            mnb mnbVar2 = (mnb) this.o;
            try {
                t0fVar2 = new t0f(ti1.a(jSONObjectOptJSONObject4.getString("initiatorId")), jSONObjectOptJSONObject4.getString("sharedUrl"));
            } catch (JSONException e2) {
                mnbVar2.a.logException("UrlSharingParser", "Can't parse url sharing", e2);
                t0fVar2 = null;
            }
            t0fVar = t0fVar2;
        } else {
            t0fVar = null;
        }
        return new i0f(i, string, boolValueOf, arrayListA, arrayListA2, arrayListA3, lValueOf, Integer.valueOf(iOptInt), h0fVar, k21VarB, mapK, g0fVarI, ti1VarA, t0fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ou1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(defpackage.mbd r14, defpackage.ood r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk4.i(mbd, ood):void");
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        Iterator it;
        try {
            Pattern pattern = rd.d;
            wqi.g("rd", iOException, "exception while download request: %s", (zmd) this.a);
            dd ddVar = (dd) ((rd) this.o).c.a.getValue();
            if (!ddVar.a().e()) {
                ddVar.f("HTTP_ERROR", iOException.getClass().getSimpleName());
            }
            synchronized (((qd) this.b).a) {
                try {
                    it = ((qd) this.b).a.iterator();
                } catch (Throwable th) {
                    Pattern pattern2 = rd.d;
                    wqi.e("rd", "onFailure: failed to notify listener on exception", th);
                } finally {
                }
                while (it.hasNext()) {
                    ((p97) it.next()).g();
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public void k(n38 n38Var) {
        synchronized (this.a) {
            try {
                j48 j48VarB = n38Var.b();
                n32 n32Var = n38Var.c;
                oa0 oa0Var = new oa0(j48VarB, n32.s(n32Var.B0, n32Var.C0));
                p38 p38VarF = f(j48VarB);
                Set hashSet = p38VarF != null ? (Set) ((HashMap) this.c).get(p38VarF) : new HashSet();
                hashSet.add(oa0Var);
                ((HashMap) this.b).put(oa0Var, n38Var);
                if (p38VarF == null) {
                    p38 p38Var = new p38(j48VarB, this);
                    ((HashMap) this.c).put(p38Var, hashSet);
                    j48VarB.p().a(p38Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(j48 j48Var) {
        synchronized (this.a) {
            try {
                if (g(j48Var)) {
                    if (((ArrayDeque) this.d).isEmpty()) {
                        ((ArrayDeque) this.d).push(j48Var);
                    } else {
                        ggg gggVar = (ggg) this.o;
                        if (gggVar == null || gggVar.b != 2) {
                            j48 j48Var2 = (j48) ((ArrayDeque) this.d).peek();
                            if (!j48Var.equals(j48Var2)) {
                                n(j48Var2);
                                ((ArrayDeque) this.d).remove(j48Var);
                                ((ArrayDeque) this.d).push(j48Var);
                            }
                        }
                    }
                    q(j48Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(j48 j48Var) {
        synchronized (this.a) {
            try {
                ((ArrayDeque) this.d).remove(j48Var);
                n(j48Var);
                if (!((ArrayDeque) this.d).isEmpty()) {
                    q((j48) ((ArrayDeque) this.d).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(j48 j48Var) {
        synchronized (this.a) {
            try {
                p38 p38VarF = f(j48Var);
                if (p38VarF == null) {
                    return;
                }
                Iterator it = ((Set) ((HashMap) this.c).get(p38VarF)).iterator();
                while (it.hasNext()) {
                    n38 n38Var = (n38) ((HashMap) this.b).get((oa0) it.next());
                    n38Var.getClass();
                    n38Var.o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(List list) {
        synchronized (this.a) {
            Iterator it = ((HashMap) this.b).keySet().iterator();
            while (it.hasNext()) {
                n38 n38Var = (n38) ((HashMap) this.b).get((oa0) it.next());
                boolean zIsEmpty = n38Var.h().isEmpty();
                synchronized (n38Var.a) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.retainAll(n38Var.c.v());
                    n38Var.c.y(arrayList);
                }
                if (!zIsEmpty && n38Var.h().isEmpty()) {
                    m(n38Var.b());
                }
            }
        }
    }

    public void p() {
        synchronized (this.a) {
            Iterator it = ((HashMap) this.b).keySet().iterator();
            while (it.hasNext()) {
                n38 n38Var = (n38) ((HashMap) this.b).get((oa0) it.next());
                synchronized (n38Var.a) {
                    n32 n32Var = n38Var.c;
                    n32Var.y((ArrayList) n32Var.v());
                }
                m(n38Var.b());
            }
        }
    }

    public void q(j48 j48Var) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) ((HashMap) this.c).get(f(j48Var))).iterator();
                while (it.hasNext()) {
                    n38 n38Var = (n38) ((HashMap) this.b).get((oa0) it.next());
                    n38Var.getClass();
                    if (!n38Var.h().isEmpty()) {
                        n38Var.p();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
