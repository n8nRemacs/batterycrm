package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class enb implements pn0, v2f, rn6, li, nhh, gu3, yci {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ enb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static u5i g(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        String strSubstring;
        String str;
        yy7[] yy7VarArr = c7d.a;
        RTCStats rTCStats2 = rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get("codecId"));
        String str2 = "";
        if (rTCStats2 != null && (strSubstring = (String) c7d.b.D(rTCStats2, c7d.a[0])) != null) {
            int iY = vmf.y(strSubstring);
            while (true) {
                if (-1 < iY) {
                    if (strSubstring.charAt(iY) == '/') {
                        strSubstring = strSubstring.substring(iY + 1);
                        break;
                    }
                    iY--;
                } else {
                    break;
                }
            }
        } else {
            strSubstring = "";
        }
        zi4 zi4Var = c7d.d;
        yy7[] yy7VarArr2 = c7d.a;
        String str3 = (String) zi4Var.D(rTCStats, yy7VarArr2[2]);
        if (str3 == null && (str3 = (String) c7d.c.D(rTCStats, yy7VarArr2[1])) == null) {
            str3 = "";
        }
        if (rTCStats2 != null && (str = (String) c7d.e.D(rTCStats2, yy7VarArr2[3])) != null) {
            str2 = str;
        }
        if (rTCStats2 != null) {
        }
        return new u5i(strSubstring, str3, str2);
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 8:
                ((v2f) this.b).a(obj);
                break;
            case 9:
                ((v2f) this.b).a(obj);
                break;
            default:
                z5j.f(null, ((tu1) this.b).b(null));
                break;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        ((uid) this.b).a = Long.valueOf(((y8g) this.c).getMsSinceBoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // defpackage.pn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.nn0 b(defpackage.ip5 r17, long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enb.b(ip5, long):nn0");
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        switch (this.a) {
            case 8:
                ((v2f) this.b).c(py4Var);
                break;
            default:
                ((v2f) this.b).c(py4Var);
                break;
        }
    }

    @Override // defpackage.yci
    public Object d() {
        return new p6j(((qc4) ((hfd) this.b).b).a, (x8j) ((yci) this.c).d());
    }

    @Override // defpackage.nhh
    public void dispose() {
        vgd vgdVar = (vgd) this.c;
        lda ldaVar = (lda) this.b;
        SparseArray sparseArray = (SparseArray) vgdVar.b;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove(ldaVar) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.pn0
    public void e() {
        umb umbVar = (umb) this.c;
        byte[] bArr = zxg.b;
        umbVar.getClass();
        umbVar.H(bArr.length, bArr);
    }

    @Override // defpackage.li
    public String f() {
        return kca.TENSORFLOW.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable h(defpackage.q44 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lxg
            if (r0 == 0) goto L13
            r0 = r6
            lxg r0 = (defpackage.lxg) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            lxg r0 = new lxg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            goto L55
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2d:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.c
            k18 r6 = (defpackage.k18) r6
            java.lang.Object r6 = r6.getValue()
            klc r6 = (defpackage.klc) r6
            java.lang.Object r1 = r5.b
            k18 r1 = (defpackage.k18) r1
            java.lang.Object r1 = r1.getValue()
            pb3 r1 = (defpackage.pb3) r1
            w4e r1 = (defpackage.w4e) r1
            long r3 = r1.s()
            r0.X = r2
            java.lang.Object r6 = r6.a(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L55
            return r0
        L55:
            xac r6 = (defpackage.xac) r6
            ku3 r6 = r6.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enb.h(q44):java.lang.Comparable");
    }

    @Override // defpackage.nhh
    public int i(int i) {
        return i;
    }

    @Override // defpackage.li
    public void j(cm6 cm6Var) {
        if (((Boolean) ((bwf) this.c).getValue()).booleanValue()) {
            cm6Var.invoke();
        }
    }

    @Override // defpackage.nhh
    public int k(int i) {
        lda ldaVar = (lda) this.b;
        vgd vgdVar = (vgd) this.c;
        List arrayList = (List) ((SparseArray) vgdVar.b).get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((SparseArray) vgdVar.b).put(i, arrayList);
        }
        if (!arrayList.contains(ldaVar)) {
            arrayList.add(ldaVar);
        }
        return i;
    }

    public File l() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        h06 h06Var = (h06) this.c;
                        h06Var.a();
                        this.b = new File(h06Var.a.getFilesDir(), "PersistedInstallation." + ((h06) this.c).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public void m(List list) {
        tgf tgfVar = (tgf) ((bwf) this.c).getValue();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jef jefVar = (jef) it.next();
            arrayList.add(new aff(0L, jefVar.a, jefVar.b, jefVar.c, jefVar.d, jefVar.o, jefVar.X, jefVar.Y, jefVar.Z, jefVar.s0, jefVar.t0, jefVar.u0, jefVar.v0, jefVar.w0, jefVar.x0, jefVar.y0));
        }
        lrd lrdVar = tgfVar.a;
        lrdVar.b();
        lrdVar.c();
        try {
            tgfVar.b.A(arrayList);
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public void n(ab0 ab0Var) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ab0Var.a);
            jSONObject.put("Status", az1.v(ab0Var.b));
            jSONObject.put("AuthToken", ab0Var.c);
            jSONObject.put("RefreshToken", ab0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ab0Var.f);
            jSONObject.put("ExpiresInSecs", ab0Var.e);
            jSONObject.put("FisError", ab0Var.g);
            h06 h06Var = (h06) this.c;
            h06Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", h06Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(l())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public ab0 o() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = az1.y(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new ab0(i2, jOptLong2, jOptLong, strOptString, strOptString2, strOptString3, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        switch (this.a) {
            case 8:
                try {
                    ((k2f) this.c).c.accept(th);
                } catch (Throwable th2) {
                    raj.c(th2);
                    th = new CompositeException(th, th2);
                }
                ((v2f) this.b).onError(th);
                break;
            default:
                v2f v2fVar = (v2f) this.b;
                try {
                    Object objApply = ((m2f) this.c).c.apply(th);
                    if (objApply != null) {
                        v2fVar.a(objApply);
                        break;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                        nullPointerException.initCause(th);
                        v2fVar.onError(nullPointerException);
                        break;
                    }
                } catch (Throwable th3) {
                    raj.c(th3);
                    v2fVar.onError(new CompositeException(th, th3));
                }
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        if (th instanceof ksf) {
            z5j.f(null, ((wu1) this.c).cancel(false));
        } else {
            z5j.f(null, ((tu1) this.b).b(null));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public defpackage.a7d p(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r66v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return String.format("%s|%s", (zzg) this.b, (List) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ enb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public enb(sri sriVar) {
        this.a = 20;
        this.c = new Handler(Looper.getMainLooper());
        this.b = sriVar;
    }

    public enb(y6d y6dVar, int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = y6dVar;
                break;
            default:
                this.b = y6dVar;
                this.c = new bwf(new kvf(4, this));
                break;
        }
    }

    public enb(q9b q9bVar) {
        this.a = 5;
        this.b = q9bVar;
        this.c = new bwf(new prd(3, this));
    }

    public enb(int i) {
        this.a = i;
        switch (i) {
            case 10:
                break;
            case 13:
                this.b = new ConcurrentHashMap();
                this.c = new ReferenceQueue();
                break;
            default:
                this.b = new b44(evd.g, new n5g(fvd.p), Integer.valueOf(yud.C0), (Integer) null, 20);
                this.c = new b44(evd.b, new n5g(fvd.l), Integer.valueOf(ivd.O), (Integer) null, 20);
                break;
        }
    }

    public enb(z9g z9gVar) {
        this.a = 3;
        this.b = z9gVar;
        this.c = new umb();
    }

    public enb(h06 h06Var) {
        this.a = 1;
        this.c = h06Var;
    }
}
