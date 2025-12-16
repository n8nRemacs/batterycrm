package defpackage;

import android.media.metrics.LogSessionId;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.ok.tamtam.shared.BinderNotFoundValueException;

/* loaded from: classes2.dex */
public final class jkc implements le5, cd3, dbd, cf5, CapturerObserver, gsf, pm, yci {
    public static final odi d = new odi(3);
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ jkc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object objInvoke = ((bp5) this.a).invoke();
            this.b = objInvoke;
            ((dp5) this.c).b.add(new cp5(objInvoke, new e44(12, this)));
            return objInvoke;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException("could not extract value for name ".concat(yy7Var.getName()), th);
        }
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        if (obj2 == null) {
            this.b = null;
        }
    }

    @Override // defpackage.cd3
    public sk4 a(hf6 hf6Var, LogSessionId logSessionId) {
        sk4 sk4VarA = ((cd3) this.a).a(hf6Var, logSessionId);
        this.b = sk4VarA.c();
        return sk4VarA;
    }

    @Override // defpackage.le5
    public /* bridge */ /* synthetic */ le5 b(Class cls, pqa pqaVar) {
        ((HashMap) this.a).put(cls, pqaVar);
        ((HashMap) this.b).remove(cls);
        return this;
    }

    @Override // defpackage.pm
    public tl c(tl tlVar) {
        vk vkVar = (vk) ((kob) ((sl) this.b)).a(new tbg((String) this.c, (Provider) this.a), tlVar);
        return tlVar.b(vkVar.a, vkVar.b);
    }

    @Override // defpackage.yci
    public Object d() {
        Object objD = ((yci) this.a).d();
        return new qni((p6j) objD, ((qc4) ((hfd) this.c).b).a);
    }

    @Override // defpackage.cd3
    public boolean e() {
        return ((cd3) this.a).e();
    }

    @Override // defpackage.gsf
    public void f(msf msfVar) {
        ((Executor) this.b).execute(new aee(this, 19, msfVar));
    }

    @Override // defpackage.cd3
    public boolean g() {
        return ((cd3) this.a).g();
    }

    @Override // defpackage.gsf
    public ha8 h(int i, int i2) {
        return new ag7(1, new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // defpackage.cf5
    public boolean i(int i) {
        return ((cf5) this.a).i(i) && p(i) != null;
    }

    @Override // defpackage.gsf
    public void j(fsf fsfVar) {
        ((Executor) this.b).execute(new aee(this, 20, fsfVar));
    }

    @Override // defpackage.cd3
    public sk4 k(hf6 hf6Var, LogSessionId logSessionId) {
        sk4 sk4VarK = ((cd3) this.a).k(hf6Var, logSessionId);
        this.c = sk4VarK.c();
        return sk4VarK;
    }

    public boolean l(String str) {
        ht3 ht3Var;
        boolean z;
        synchronized (this.c) {
            try {
                ht3[] ht3VarArr = (ht3[]) this.b;
                int length = ht3VarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        ht3Var = ht3VarArr[i];
                        Object obj = ht3Var.d;
                        if (obj != null && ht3Var.b(obj) && ht3Var.c.contains(str)) {
                            break;
                        }
                        i++;
                    } else {
                        ht3Var = null;
                        break;
                    }
                }
                if (ht3Var != null) {
                    cei.g().c(o4i.a, "Work " + str + " constrained by " + ht3Var.getClass().getSimpleName());
                }
                z = ht3Var == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public String m(int i, long j, long j2, String str) {
        ArrayList arrayList = (ArrayList) this.a;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.b;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            sb.append((String) arrayList.get(i2));
            if (((Integer) arrayList3.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList3.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList3.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList3.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append((String) arrayList.get(arrayList3.size()));
        return sb.toString();
    }

    @Override // defpackage.cf5
    public df5 n(int i) {
        return p(i);
    }

    public ByteBuffer o() {
        AtomicLong atomicLong = (AtomicLong) this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < byteBuffer.capacity()) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet(-byteBuffer.remaining());
        }
        return byteBuffer;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        if (z) {
            ((k01) ((awd) this.b).b).P.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        ((awd) this.b).a(true);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((btd) this.a).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.c;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.df5 p(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.a
            cf5 r2 = (defpackage.cf5) r2
            java.lang.Object r3 = r0.c
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r3.containsKey(r4)
            if (r4 == 0) goto L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            df5 r1 = (defpackage.df5) r1
            return r1
        L21:
            boolean r4 = r2.i(r1)
            if (r4 == 0) goto Ld2
            df5 r2 = r2.n(r1)
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r4 = r0.b
            i17 r4 = (defpackage.i17) r4
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r4 = r4.f(r6)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r4.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r6 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r6
            if (r6 == 0) goto L3c
            r4 = 4
            if (r1 == r4) goto L69
            r4 = 5
            if (r1 == r4) goto L5f
            r4 = 6
            if (r1 == r4) goto L55
        L53:
            r4 = 0
            goto L72
        L55:
            android.util.Size r4 = new android.util.Size
            r6 = 1440(0x5a0, float:2.018E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r4.<init>(r6, r7)
            goto L72
        L5f:
            android.util.Size r4 = new android.util.Size
            r6 = 960(0x3c0, float:1.345E-42)
            r7 = 720(0x2d0, float:1.009E-42)
            r4.<init>(r6, r7)
            goto L72
        L69:
            android.util.Size r4 = new android.util.Size
            r6 = 640(0x280, float:8.97E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r4.<init>(r6, r7)
        L72:
            if (r4 != 0) goto L76
            r5 = r2
            goto Ld3
        L76:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r2.d()
            java.util.Iterator r7 = r7.iterator()
        L83:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lba
            java.lang.Object r8 = r7.next()
            z90 r8 = (defpackage.z90) r8
            int r10 = r8.a
            java.lang.String r11 = r8.b
            int r12 = r8.c
            int r13 = r8.d
            int r14 = r4.getWidth()
            int r15 = r4.getHeight()
            int r9 = r8.g
            int r5 = r8.h
            int r0 = r8.i
            int r8 = r8.j
            r16 = r9
            z90 r9 = new z90
            r18 = r0
            r17 = r5
            r19 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.add(r9)
            r0 = r20
            goto L83
        Lba:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lc1
            goto Ld2
        Lc1:
            int r0 = r2.a()
            int r4 = r2.b()
            java.util.List r2 = r2.c()
            y90 r5 = defpackage.y90.e(r0, r4, r2, r6)
            goto Ld3
        Ld2:
            r5 = 0
        Ld3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkc.p(int):df5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0374 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0483 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkc.q():boolean");
    }

    public boolean r() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.a).readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    @Override // defpackage.gsf
    public void release() {
    }

    public boolean s() {
        return ((ByteBuffer) this.b).hasRemaining() || ((AtomicLong) this.c).get() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(defpackage.q44 r11) {
        /*
            r10 = this;
            qqg r0 = defpackage.qqg.a
            lg8 r1 = defpackage.lg8.d
            boolean r2 = r11 instanceof defpackage.ikc
            if (r2 == 0) goto L17
            r2 = r11
            ikc r2 = (defpackage.ikc) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            ikc r2 = new ikc
            r2.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r2.o
            g84 r3 = defpackage.g84.a
            int r4 = r2.Y
            r5 = 0
            r6 = 26
            r7 = 1
            if (r4 == 0) goto L39
            if (r4 != r7) goto L31
            jkc r1 = r2.d
            defpackage.g8j.b(r11)
            goto Lac
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.a
            k18 r11 = (defpackage.k18) r11
            java.lang.Object r11 = r11.getValue()
            pb3 r11 = (defpackage.pb3) r11
            pe8 r11 = (defpackage.pe8) r11
            fde r4 = r11.M0
            yy7[] r8 = defpackage.pe8.U0
            r8 = r8[r6]
            java.lang.Object r11 = r4.D(r11, r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.Class<jkc> r4 = defpackage.jkc.class
            if (r11 == 0) goto L72
            java.lang.String r11 = r4.getName()
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L66
            goto Ldc
        L66:
            boolean r3 = r2.b(r1)
            if (r3 == 0) goto Ldc
            java.lang.String r3 = "profile migration already complete"
            r2.c(r1, r11, r3, r5)
            return r0
        L72:
            java.lang.String r11 = r4.getName()
            l6b r4 = defpackage.wqi.a
            if (r4 != 0) goto L7b
            goto L86
        L7b:
            boolean r8 = r4.b(r1)
            if (r8 == 0) goto L86
            java.lang.String r8 = "start profile migration"
            r4.c(r1, r11, r8, r5)
        L86:
            java.lang.Object r11 = r10.b
            k18 r11 = (defpackage.k18) r11
            java.lang.Object r11 = r11.getValue()
            l24 r11 = (defpackage.l24) r11
            java.lang.Object r1 = r10.a
            k18 r1 = (defpackage.k18) r1
            java.lang.Object r1 = r1.getValue()
            pb3 r1 = (defpackage.pb3) r1
            w4e r1 = (defpackage.w4e) r1
            long r8 = r1.s()
            r2.d = r10
            r2.Y = r7
            java.lang.Comparable r11 = r11.b(r8, r2)
            if (r11 != r3) goto Lab
            return r3
        Lab:
            r1 = r10
        Lac:
            ku3 r11 = (defpackage.ku3) r11
            if (r11 == 0) goto Ldc
            java.lang.Object r2 = r1.c
            k18 r2 = (defpackage.k18) r2
            java.lang.Object r2 = r2.getValue()
            klc r2 = (defpackage.klc) r2
            kotlinx.coroutines.internal.ContextScope r3 = r2.c
            jlc r4 = new jlc
            r4.<init>(r11, r2, r5)
            r11 = 3
            defpackage.svi.e(r3, r5, r5, r4, r11)
            java.lang.Object r11 = r1.a
            k18 r11 = (defpackage.k18) r11
            java.lang.Object r11 = r11.getValue()
            pb3 r11 = (defpackage.pb3) r11
            pe8 r11 = (defpackage.pe8) r11
            fde r1 = r11.M0
            yy7[] r2 = defpackage.pe8.U0
            r2 = r2[r6]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.O(r11, r2, r3)
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkc.t(q44):java.lang.Object");
    }

    public String u() {
        if (!r()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public void v(JSONObject jSONObject) {
        dj1 dj1Var = (dj1) this.a;
        lt2 lt2Var = (lt2) this.b;
        enb enbVar = null;
        try {
            o81 o81VarH = jSONObject.has("decorativeExternalParticipantId") ? paj.h(jSONObject) : null;
            ti1 ti1VarA = ti1.a(jSONObject.getString("participantId"));
            String strG = yni.g(jSONObject, "decorativeParticipantId");
            if (strG != null) {
                ti1.a(strG);
            }
            enbVar = new enb(ti1VarA, 7, o81VarH);
        } catch (JSONException e) {
            lt2Var.a.logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
        }
        if (enbVar == null) {
            return;
        }
        o81 o81Var = (o81) enbVar.c;
        ti1 ti1Var = (ti1) enbVar.b;
        if (o81Var == null || dj1Var.j(ti1Var) == null) {
            return;
        }
        qf1 qf1Var = dj1Var.b;
        if (dj1Var.j(ti1Var) != null) {
            fje fjeVarC = dj1Var.c(ti1Var);
            int i = 26;
            List listSingletonList = Collections.singletonList((yi1) dj1Var.a(new bnb(ti1Var, new uha(i), new uha(i), new uha(i), new uha(i), new k5(o81Var), new uha(i), new uha(i), new uha(i)), fjeVarC).c);
            if (fni.a(fjeVarC, dj1Var.k)) {
                qf1Var.a.onActiveParticipantsDeAnonimized(new r01(listSingletonList, dj1Var.d(dj1Var.k).values()));
            }
            qf1Var.c.onCallParticipantsDeAnonimized(new gj1(listSingletonList));
        }
        ((j51) this.c).onDecorativeParticipantIdChanged(new h51(ti1Var));
    }

    public void w(Collection collection) {
        synchronized (this.c) {
            try {
                for (ht3 ht3Var : (ht3[]) this.b) {
                    if (ht3Var.e != null) {
                        ht3Var.e = null;
                        ht3Var.d(null, ht3Var.d);
                    }
                }
                for (ht3 ht3Var2 : (ht3[]) this.b) {
                    ht3Var2.c(collection);
                }
                for (ht3 ht3Var3 : (ht3[]) this.b) {
                    if (ht3Var3.e != this) {
                        ht3Var3.e = this;
                        ht3Var3.d(this, ht3Var3.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.c) {
            for (ht3 ht3Var : (ht3[]) this.b) {
                ArrayList arrayList = ht3Var.b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    ht3Var.a.n(ht3Var);
                }
            }
        }
    }

    public jkc(int i) {
        switch (i) {
            case 13:
                boolean z = false;
                this.a = new py0(20, z);
                this.b = new s6b(8);
                this.c = new py0(20, z);
                break;
            default:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = d;
                break;
        }
    }

    public jkc(y6d y6dVar, b7d b7dVar) {
        this.a = y6dVar;
        this.b = b7dVar;
        this.c = new zl3();
    }

    public jkc(i50 i50Var) {
        this.a = i50Var;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i50Var.d * 1024).order(ByteOrder.nativeOrder());
        this.b = byteBufferOrder;
        byteBufferOrder.flip();
        this.c = new AtomicLong();
    }

    public jkc(j5h j5hVar) {
        a8h a8hVar = j5hVar.e;
        Objects.requireNonNull(a8hVar);
        this.a = a8hVar;
        this.b = j5hVar.d;
        this.c = j5hVar.f;
    }

    public jkc(ywf ywfVar, n4i n4iVar) {
        im0 im0Var = new im0((jm0) ywfVar.a, 0);
        im0 im0Var2 = new im0((jm0) ywfVar.b, 1);
        im0 im0Var3 = new im0((jm0) ywfVar.d, 4);
        hea heaVar = (hea) ywfVar.c;
        ht3[] ht3VarArr = {im0Var, im0Var2, im0Var3, new im0(heaVar, 2), new im0(heaVar, 3), new fea(heaVar), new eea(heaVar)};
        this.a = n4iVar;
        this.b = ht3VarArr;
        this.c = new Object();
    }

    public jkc(jo0 jo0Var) {
        this.c = jo0Var;
    }

    public jkc(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
