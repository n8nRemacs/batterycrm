package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class b43 extends xfh implements rm8 {
    public static final /* synthetic */ yy7[] W0 = {new z8a(b43.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, b43.class, "keyboardWaitingJob", "getKeyboardWaitingJob()Lkotlinx/coroutines/Job;")};
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final k18 G0;
    public final tcf H0;
    public final hbd I0;
    public final tcf J0;
    public final tcf K0;
    public final ci5 L0;
    public final ci5 M0;
    public final AtomicReference N0;
    public final String O0;
    public final z74 P0;
    public final x74 Q0;
    public x9f R0;
    public x9f S0;
    public x9f T0;
    public final t9f U0;
    public final t9f V0;
    public final x6e X;
    public final lzf Y;
    public final k18 Z;
    public final vcd b;
    public final w14 c;
    public final zm8 d;
    public final x63 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public b43() {
        x26 x26Var;
        y4e y4eVar = y4e.a;
        vcd vcdVar = (vcd) y4eVar.getAccessor().c(362);
        w14 w14Var = (w14) y4eVar.getAccessor().c(366);
        zm8 zm8Var = (zm8) y4eVar.getAccessor().c(352);
        e03 e03Var = e03.a;
        x63 x63Var = (x63) e03Var.getAccessor().c(563);
        x6e x6eVar = (x6e) e03Var.getAccessor().c(562);
        lzf lzfVarJ = y4eVar.j();
        a84 a84Var = (a84) y4eVar.getAccessor().c(84);
        k18 k18Var = x4e.p;
        k18 k18Var2 = x4e.u;
        k18 k18Var3 = x4e.b;
        k18 k18Var4 = x4e.d;
        k18 k18Var5 = x4e.c;
        bwf bwfVarD = y4eVar.getAccessor().d(46);
        bwf bwfVarD2 = y4eVar.getAccessor().d(47);
        k18 k18Var6 = x4e.t;
        bwf bwfVarD3 = e03Var.getAccessor().d(329);
        bwf bwfVarD4 = e03Var.getAccessor().d(385);
        bwf bwfVarD5 = e03Var.getAccessor().d(386);
        bwf bwfVarD6 = e03Var.getAccessor().d(83);
        bwf bwfVarD7 = e03Var.getAccessor().d(389);
        bwf bwfVarD8 = e03Var.getAccessor().d(186);
        bwf bwfVarD9 = e03Var.getAccessor().d(48);
        bwf bwfVarD10 = e03Var.getAccessor().d(93);
        bwf bwfVarD11 = e03Var.getAccessor().d(95);
        bwf bwfVarD12 = e03Var.getAccessor().d(94);
        bwf bwfVarD13 = e03Var.getAccessor().d(96);
        this.b = vcdVar;
        this.c = w14Var;
        this.d = zm8Var;
        this.o = x63Var;
        this.X = x6eVar;
        this.Y = lzfVarJ;
        this.Z = k18Var2;
        this.s0 = bwfVarD;
        this.t0 = bwfVarD9;
        this.u0 = bwfVarD2;
        this.v0 = k18Var3;
        this.w0 = k18Var4;
        this.x0 = k18Var5;
        this.y0 = k18Var;
        this.z0 = k18Var6;
        this.A0 = bwfVarD3;
        this.B0 = bwfVarD4;
        this.C0 = bwfVarD5;
        this.D0 = bwfVarD6;
        this.E0 = bwfVarD7;
        this.F0 = bwfVarD8;
        this.G0 = bwfVarD13;
        tcf tcfVarA = ucf.a(y23.g);
        this.H0 = tcfVarA;
        this.I0 = new hbd(tcfVarA);
        b66 b66Var = null;
        tcf tcfVarA2 = ucf.a(null);
        this.J0 = tcfVarA2;
        tcf tcfVarA3 = ucf.a(null);
        this.K0 = tcfVarA3;
        this.L0 = new ci5(0);
        this.M0 = new ci5(0);
        this.N0 = new AtomicReference(null);
        this.O0 = b43.class.getName();
        q2b q2bVar = (q2b) lzfVarJ;
        this.P0 = q2bVar.b().limitedParallelism(1, "ChatsListSearchViewModelDispatcher");
        this.Q0 = a84Var.plus(new c84("Search chats/messages context"));
        this.U0 = c7j.c();
        this.V0 = c7j.c();
        x26 x26VarK = gw0.k(new d53(tcfVarA2, 8), 300L);
        gu5 gu5Var = (gu5) w();
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f132searchloaderv2enabled, false)) {
            x26Var = x26VarK;
            gw0.w(new g56(gw0.u(gw0.j(x26Var, new m36(new u33(2, null), gw0.E(new mwd(new n6e((p5e) bwfVarD10.getValue(), x26VarK, new m11(13, b66Var), 0, null)), new wy6((ej0) bwfVarD4.getValue(), v(), (Continuation) null))), new m36(new v33(2, null), new mwd(new n6e((s6e) bwfVarD11.getValue(), x26VarK, new m11(13, b66Var), 5, null))), new m36(new w33(2, null), new mwd(new n6e((h6e) bwfVarD12.getValue(), x26Var, tcfVarA3, 50, null))), new x33(this, b66Var, 0)), q2bVar.b()), new y33(this, null), 1), this.a);
        } else {
            x26Var = x26VarK;
            zm8Var.i = this;
        }
        y();
        gw0.w(new g56(x26Var, new zr0(2, this, b43.class, "loadByQuery", "loadByQuery(Ljava/lang/String;)V", 4, 13), 1), this.a);
    }

    public static final void t(b43 b43Var, long j, long j2) {
        w63 w63VarV = b43Var.v();
        long jG = s65.g(j2) + ((w4e) ((pb3) b43Var.s0.getValue())).j();
        ve2 ve2VarI = w63VarV.i();
        pb2 pb2VarM = ve2VarI.M(j);
        if (pb2VarM != null) {
            ve2VarI.v(pb2VarM, jG);
            ((hwa) ve2VarI.q.get()).m(pb2VarM.a);
        }
    }

    public static final List u(b43 b43Var) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        l5c l5cVar = (l5c) ((age) b43Var.u0.getValue());
        l5cVar.getClass();
        JSONObject jSONObjectD = l5cVar.d(PmsKey.f133searchwebappsshowcase);
        if (jSONObjectD == null || (jSONArrayOptJSONArray = jSONObjectD.optJSONArray(CallAnalyticsApiRequest.KEY_ITEMS)) == null) {
            return hd5.a;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            long j = jSONObject.getLong("id");
            String strOptString = jSONObject.optString("icon");
            String string = jSONObject.getString("title");
            arrayList.add(new icd(j, string, strOptString, vmf.Z(2, string), false, false, 176));
        }
        return arrayList;
    }

    public final void A(long j) {
        pb2 pb2Var = (pb2) v().j(j).a.getValue();
        xfh.r(this.M0, new ixe(new n5g((pb2Var == null || !pb2Var.c0(w())) ? mvd.z : mvd.y), new z23(this, j, 0)));
    }

    public final void B(long j) {
        pb2 pb2Var = (pb2) v().j(j).a.getValue();
        xfh.r(this.M0, new ixe(new n5g((pb2Var == null || !pb2Var.c0(w())) ? mvd.a2 : mvd.Z1), new z23(this, j, 1)));
    }

    @Override // defpackage.rm8
    public final void f(String str, List list, boolean z) {
        if (((y23) this.H0.getValue()).b.equals(str)) {
            this.U0.O(this, W0[0], svi.d(this.a, ((q2b) this.Y).a().plus(this.Q0), i84.b, new n33(this, str, list, z, null)));
            return;
        }
        String str2 = this.O0;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.o;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, "[search] chats search: query changed, skip content", null);
        }
    }

    @Override // defpackage.xfh
    public final void s() {
        x9f x9fVar = this.R0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        zm8 zm8Var = this.d;
        zm8Var.c();
        x9f x9fVar2 = this.S0;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        zm8Var.i = null;
    }

    public final w63 v() {
        return (w63) this.v0.getValue();
    }

    public final rt5 w() {
        return (rt5) this.t0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() {
        /*
            r4 = this;
            rt5 r0 = r4.w()
            gu5 r0 = (defpackage.gu5) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f132searchloaderv2enabled
            r2 = 0
            boolean r0 = r0.j(r1, r2)
            r1 = 1
            if (r0 == 0) goto L2b
            java.util.concurrent.atomic.AtomicReference r0 = r4.N0
            java.lang.Object r0 = r0.get()
            dmb r0 = (defpackage.dmb) r0
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r0.d
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L3b
            boolean r0 = defpackage.vmf.F(r0)
            r0 = r0 ^ r1
            if (r0 != r1) goto L3b
            goto L3a
        L2b:
            zm8 r0 = r4.d
            qu1 r3 = r0.l
            boolean r3 = defpackage.bwd.c(r3)
            if (r3 != 0) goto L36
            goto L3a
        L36:
            java.lang.String r0 = r0.s
            if (r0 == 0) goto L3b
        L3a:
            return r1
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b43.x():boolean");
    }

    public final void y() {
        x9f x9fVar = this.R0;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.d.c();
            this.J0.setValue(null);
            this.K0.setValue(null);
            x9f x9fVar2 = this.S0;
            if (x9fVar2 != null) {
                x9fVar2.cancel((CancellationException) null);
            }
            qt7 qt7Var = (qt7) this.U0.D(this, W0[0]);
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            this.R0 = svi.e(this.a, this.P0.plus(this.Q0), null, new c33(this, null), 2);
        }
    }

    public final void z(long j) {
        ei4 ei4Var;
        pb2 pb2VarN = v().n(j);
        if (pb2VarN != null) {
            ei4Var = a63.M0(a63.c, pb2VarN.a);
        } else {
            a63.c.getClass();
            ei4Var = new ei4(":profile?id=" + j + "&type=contact");
        }
        xfh.r(this.L0, ei4Var);
    }
}
