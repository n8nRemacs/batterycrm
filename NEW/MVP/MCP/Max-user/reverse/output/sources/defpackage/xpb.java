package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;

/* loaded from: classes2.dex */
public final class xpb implements tc4, yt, p0f, v2f, gof, rn6, lva {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ xpb(int i, boolean z) {
        this.a = i;
    }

    public void A(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.b)) {
            map = new HashMap((Map) this.b);
        }
        synchronized (((Map) this.c)) {
            map2 = new HashMap((Map) this.c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((n2g) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 8:
                ((v2f) this.c).a(obj);
                break;
            default:
                z5j.f("Unexpected result from SurfaceRequest. Surface was provided twice.", ((ub0) obj).a != 3);
                gri.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.b).release();
                r6g r6gVar = ((q6g) this.c).a;
                if (r6gVar.j != null) {
                    r6gVar.j = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ty4.d((qu1) this.b, py4Var);
    }

    @Override // defpackage.gof
    public int e(long j) {
        long[] jArr = (long[]) this.c;
        int iB = xxg.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.gof
    public long g(int i) {
        long[] jArr = (long[]) this.c;
        fsi.b(i >= 0);
        fsi.b(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.yt
    public au h(g95 g95Var, Looper looper, zt ztVar, ym3 ym3Var) {
        return g95.c(g95Var.a) ? new cee((eee) this.c, g95Var.d) : ((yt) this.b).h(g95Var, looper, ztVar, ym3Var);
    }

    @Override // defpackage.tc4
    public uc4 i(jc8 jc8Var, ad4 ad4Var, k5i k5iVar, int i, int[] iArr, bn5 bn5Var, int i2, long j, boolean z, ArrayList arrayList, i4c i4cVar, wgg wggVar, n4c n4cVar) {
        se4 se4VarA = ((ub4) this.b).a();
        if (wggVar != null) {
            ((vb4) se4VarA).I(wggVar);
        }
        return new smd(jc8Var, ad4Var, k5iVar, i, iArr, bn5Var, i2, se4VarA, j, (qha) this.c, z, arrayList, i4cVar, n4cVar);
    }

    public void j(RtpSender rtpSender, String str) {
        Double d;
        Integer num;
        Integer num2;
        ni1 ni1Var = (ni1) this.b;
        int iC = (ni1Var == null || (num2 = ni1Var.d) == null) ? 6000 : n7j.c(num2.intValue(), 6000, 64000);
        int iC2 = (ni1Var == null || (num = ni1Var.e) == null) ? 48000 : n7j.c(num.intValue(), 6000, 64000);
        double dDoubleValue = (ni1Var == null || (d = ni1Var.f) == null) ? 1.0d : d.doubleValue();
        y6d y6dVar = (y6d) this.c;
        StringBuilder sbK = wy1.k("set audio bitrate range to ", iC, "-", iC2, ", priority=");
        sbK.append(dDoubleValue);
        y6dVar.log("RtpSenderHelper", sbK.toString());
        l(rtpSender, str, iC, iC2, Double.valueOf(dDoubleValue), true);
    }

    public void l(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            n(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            ((y6d) this.c).reportException("RtpSenderHelper", "Failed to set bitrate of ".concat(str), th);
        }
    }

    @Override // defpackage.gof
    public List m(long j) {
        gb4 gb4Var;
        int iE = xxg.e((long[]) this.c, j, false);
        return (iE == -1 || (gb4Var = ((gb4[]) this.b)[iE]) == gb4.B0) ? Collections.EMPTY_LIST : Collections.singletonList(gb4Var);
    }

    public void n(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        y6d y6dVar = (y6d) this.c;
        if (rtpSender == null) {
            y6dVar.log("RtpSenderHelper", str.concat(": no sender"));
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            y6dVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        boolean z2 = false;
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            Integer num = encoding.maxBitrateBps;
            if (num == null || num.intValue() != i2) {
                encoding.maxBitrateBps = Integer.valueOf(i2);
                z2 = true;
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 == null || num2.intValue() != i) {
                encoding.minBitrateBps = Integer.valueOf(i);
                z2 = true;
            }
            if (d != null && encoding.bitratePriority != d.doubleValue()) {
                encoding.bitratePriority = d.doubleValue();
                z2 = true;
            }
            if (encoding.adaptiveAudioPacketTime != z) {
                encoding.adaptiveAudioPacketTime = z;
                z2 = true;
            }
        }
        if (!z2) {
            y6dVar.log("RtpSenderHelper", str + " encodings update not needed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            y6dVar.log("RtpSenderHelper", str + " encodings update done. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        y6dVar.log("RtpSenderHelper", str + " encodings update failed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
    }

    public void o(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        y6d y6dVar = (y6d) this.c;
        if (rtpSender == null) {
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            y6dVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            if (!fni.a(encoding.maxBitrateBps, num)) {
                encoding.maxBitrateBps = num;
                z = true;
            }
            if (!fni.a(encoding.numTemporalLayers, num2)) {
                encoding.numTemporalLayers = num2;
                z = true;
            }
            if (!fni.a(encoding.maxFramerate, num3)) {
                encoding.maxFramerate = num3;
                z = true;
            }
        }
        if (parameters.degradationPreference != degradationPreference) {
            parameters.degradationPreference = degradationPreference;
            z = true;
        }
        if (!z) {
            y6dVar.log("RtpSenderHelper", "No " + str + " change detected. Ignore update");
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            y6dVar.log("RtpSenderHelper", "Sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            return;
        }
        y6dVar.log("RtpSenderHelper", "Failed to set sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        ((v2f) this.c).onError(th);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    @Override // defpackage.lva
    public void p(Task task) {
        jcj jcjVar = (jcj) this.b;
        n2g n2gVar = (n2g) this.c;
        synchronized (jcjVar.f) {
            jcjVar.e.remove(n2gVar);
        }
    }

    public void q() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public void r(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // defpackage.gof
    public int s() {
        return ((long[]) this.c).length;
    }

    public View t(int i, int i2, int i3, int i4) {
        ye yeVar = (ye) this.c;
        oeh oehVar = (oeh) this.b;
        int i5 = oehVar.i();
        int iN = oehVar.n();
        int i6 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewP = oehVar.p(i);
            int iC = oehVar.c(viewP);
            int iQ = oehVar.q(viewP);
            yeVar.b = i5;
            yeVar.c = iN;
            yeVar.d = iC;
            yeVar.e = iQ;
            if (i3 != 0) {
                yeVar.a = i3;
                if (yeVar.a()) {
                    return viewP;
                }
            }
            if (i4 != 0) {
                yeVar.a = i4;
                if (yeVar.a()) {
                    view = viewP;
                }
            }
            i += i6;
        }
        return view;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String string = "[ ";
                if (((m6f) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM = az1.m(string);
                        sbM.append(((m6f) this.b).Z[i]);
                        sbM.append(" ");
                        string = sbM.toString();
                    }
                }
                StringBuilder sbO = ho7.o(string, "] ");
                sbO.append((m6f) this.b);
                return sbO.toString();
            default:
                return super.toString();
        }
    }

    public int u(RtpSender rtpSender) {
        List<RtpParameters.Encoding> list;
        RtpParameters.Encoding encoding;
        if (rtpSender == null) {
            return 0;
        }
        try {
            RtpParameters parameters = rtpSender.getParameters();
            Integer num = (parameters == null || (list = parameters.encodings) == null || (encoding = (RtpParameters.Encoding) ue3.I(list)) == null) ? null : encoding.maxBitrateBps;
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (Throwable th) {
            ((y6d) this.c).reportException("RtpSenderHelper", "Unable to get sender max bitrate", th);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(defpackage.q44 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof defpackage.f2i
            if (r2 == 0) goto L17
            r2 = r1
            f2i r2 = (defpackage.f2i) r2
            int r3 = r2.X
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.X = r3
            goto L1c
        L17:
            f2i r2 = new f2i
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.d
            int r3 = r2.X
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2a
            defpackage.g8j.b(r1)
            goto L90
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            defpackage.g8j.b(r1)
            java.lang.Object r1 = r0.c
            k18 r1 = (defpackage.k18) r1
            java.lang.Object r1 = r1.getValue()
            age r1 = (defpackage.age) r1
            l5c r1 = (defpackage.l5c) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f160welcomestickerids
            java.lang.String r3 = r3.name()
            java.util.List r1 = r1.e(r3, r5)
            r3 = 0
            if (r1 == 0) goto L5b
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r6)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L5d
        L5b:
            java.lang.String[] r1 = new java.lang.String[r3]
        L5d:
            int r3 = r1.length
            if (r3 != 0) goto L61
            goto Lb5
        L61:
            j7d r3 = defpackage.k7d.a
            int r3 = r1.length
            if (r3 == 0) goto Lb6
            int r3 = r1.length
            t3 r6 = defpackage.k7d.b
            int r3 = r6.c(r3)
            r1 = r1[r3]
            if (r1 == 0) goto Lb5
            java.lang.Long r1 = defpackage.cnf.i(r1)
            if (r1 == 0) goto Lb5
            long r6 = r1.longValue()
            java.lang.Object r1 = r0.b
            k18 r1 = (defpackage.k18) r1
            java.lang.Object r1 = r1.getValue()
            ehf r1 = (defpackage.ehf) r1
            r2.X = r4
            java.io.Serializable r1 = r1.a(r6, r2)
            g84 r2 = defpackage.g84.a
            if (r1 != r2) goto L90
            return r2
        L90:
            jef r1 = (defpackage.jef) r1
            if (r1 == 0) goto Lb5
            fff r6 = new fff
            long r7 = r1.a
            long r9 = r1.u0
            java.lang.String r13 = r1.Z
            java.lang.String r14 = r1.v0
            java.lang.String r15 = r1.y0
            int r2 = r1.b
            int r1 = r1.c
            r20 = 0
            r22 = 7744(0x1e40, float:1.0852E-41)
            r18 = 0
            r19 = 0
            r11 = r9
            r17 = r1
            r16 = r2
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            return r6
        Lb5:
            return r5
        Lb6:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Array is empty."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpb.v(q44):java.lang.Object");
    }

    public boolean w(View view) {
        ye yeVar = (ye) this.c;
        oeh oehVar = (oeh) this.b;
        int i = oehVar.i();
        int iN = oehVar.n();
        int iC = oehVar.c(view);
        int iQ = oehVar.q(view);
        yeVar.b = i;
        yeVar.c = iN;
        yeVar.d = iC;
        yeVar.e = iQ;
        yeVar.a = 24579;
        return yeVar.a();
    }

    public void x(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q9f q9fVar = (q9f) ((ArrayList) this.c).get(size);
            int i4 = q9fVar.a;
            if (i4 >= i) {
                q9fVar.a = i4 + i2;
            }
        }
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q9f q9fVar = (q9f) ((ArrayList) this.c).get(size);
            int i4 = q9fVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    q9fVar.a = i4 - i2;
                }
            }
        }
    }

    public void z(JSONObject jSONObject) {
        esd esdVar;
        mnb mnbVar = (mnb) this.c;
        try {
            esdVar = new esd(ti1.a(jSONObject.getString("initiatorId")), yni.g(jSONObject, "sharedUrl"), kk4.y(jSONObject));
        } catch (JSONException e) {
            mnbVar.a.logException("UrlSharingParser", "Can't parse url sharing", e);
            esdVar = null;
        }
        if (esdVar == null) {
            return;
        }
        rwg rwgVar = (rwg) this.b;
        fje fjeVar = esdVar.c;
        String str = esdVar.b;
        rwgVar.onUrlSharingInfoUpdated(new es1(fjeVar, str != null ? new t0f(esdVar.a, str) : null));
    }

    public /* synthetic */ xpb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xpb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public xpb(y6d y6dVar, v1a v1aVar, mnb mnbVar) {
        this.a = 17;
        this.c = y6dVar;
        this.b = mnbVar;
    }

    public xpb(Context context) {
        kf3 kf3Var;
        this.a = 11;
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 16) {
            kf3Var = i != 32 ? kf3.c : kf3.b;
        } else {
            kf3Var = kf3.a;
        }
        tcf tcfVarA = ucf.a(kf3Var);
        this.b = tcfVarA;
        this.c = new hbd(tcfVarA);
        context.registerComponentCallbacks(new cj2(2, this));
    }

    public xpb(n9c n9cVar) {
        this.a = 1;
        this.c = n9cVar;
    }

    public xpb(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.b = new b44(evd.e, new n5g(fvd.r), Integer.valueOf(yud.e0), (Integer) null, 20);
                this.c = new b44(evd.a, new n5g(fvd.n), Integer.valueOf(ivd.O), (Integer) null, 20);
                break;
        }
    }

    public xpb(oeg oegVar) {
        this.a = 13;
        this.b = oegVar.a;
        this.c = oegVar.b;
    }

    public xpb(oeh oehVar) {
        this.a = 16;
        this.b = oehVar;
        ye yeVar = new ye();
        yeVar.a = 0;
        this.c = yeVar;
    }
}
