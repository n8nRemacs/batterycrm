package defpackage;

import android.app.PendingIntent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class w30 {
    public boolean a;
    public boolean b;
    public int c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public w30(u1j u1jVar, zjd zjdVar) {
        this.d = new ArrayList();
        u1jVar.getClass();
        this.e = new pj4();
        this.g = i50.e;
        this.h = l50.a;
        this.f = new g50(zjdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(android.hardware.camera2.TotalCaptureResult r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.g(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    public static boolean h(int i, TotalCaptureResult totalCaptureResult) {
        gri.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            gri.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((k02) it.next());
        }
    }

    public void b(k02 k02Var) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.contains(k02Var)) {
            return;
        }
        arrayList.add(k02Var);
    }

    public void c(ao3 ao3Var) {
        for (s90 s90Var : ao3Var.e()) {
            x8a x8aVar = (x8a) this.f;
            x8aVar.getClass();
            try {
                x8aVar.f(s90Var);
            } catch (IllegalArgumentException unused) {
            }
            ((x8a) this.f).m(s90Var, ao3Var.j(s90Var), ao3Var.f(s90Var));
        }
    }

    public h52 d() {
        ArrayList arrayList = new ArrayList((HashSet) this.e);
        fjb fjbVarA = fjb.a((x8a) this.f);
        int i = this.c;
        boolean z = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        boolean z2 = this.b;
        g9a g9aVar = (g9a) this.g;
        ryf ryfVar = ryf.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : g9aVar.a.keySet()) {
            arrayMap.put(str, g9aVar.a.get(str));
        }
        return new h52(arrayList, fjbVarA, i, z, arrayList2, z2, new ryf(arrayMap), (r02) this.h);
    }

    public zka e() {
        CharSequence[] charSequenceArr;
        Set set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.d;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                pkd pkdVar = (pkd) it.next();
                if (pkdVar.d || (!((charSequenceArr = pkdVar.c) == null || charSequenceArr.length == 0) || (set = pkdVar.g) == null || set.isEmpty())) {
                    arrayList2.add(pkdVar);
                } else {
                    arrayList.add(pkdVar);
                }
            }
        }
        return new zka((IconCompat) this.e, (CharSequence) this.f, (PendingIntent) this.g, (Bundle) this.h, arrayList2.isEmpty() ? null : (pkd[]) arrayList2.toArray(new pkd[arrayList2.size()]), arrayList.isEmpty() ? null : (pkd[]) arrayList.toArray(new pkd[arrayList.size()]), this.a, this.c, this.b, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sz1 f(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            r2 = r0
            ry1 r2 = (defpackage.ry1) r2
            cs0 r7 = new cs0
            java.lang.Object r0 = r10.f
            i17 r0 = (defpackage.i17) r0
            r1 = 3
            r7.<init>(r0, r1)
            sz1 r1 = new sz1
            r5 = r2
            int r2 = r10.c
            java.lang.Object r3 = r10.g
            qee r3 = (defpackage.qee) r3
            java.lang.Object r4 = r10.h
            a07 r4 = (defpackage.a07) r4
            boolean r6 = r10.b
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = r1
            java.util.ArrayList r9 = r8.h
            if (r11 != 0) goto L2e
            nz1 r1 = new nz1
            r1.<init>(r5)
            r9.add(r1)
        L2e:
            r1 = 3
            if (r12 != r1) goto L52
            yz1 r1 = new yz1
            java.lang.Object r2 = r10.g
            qee r2 = (defpackage.qee) r2
            java.lang.Object r3 = r10.h
            a07 r3 = (defpackage.a07) r3
            w7c r4 = new w7c
            r4.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            cuc r0 = r0.e(r6)
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            r4.a = r0
            r1.<init>(r5, r2, r3, r4)
            r9.add(r1)
        L50:
            r3 = r12
            goto La9
        L52:
            boolean r0 = r10.a
            if (r0 == 0) goto L50
            java.lang.Object r0 = r10.e
            xn3 r0 = (defpackage.xn3) r0
            boolean r0 = r0.b
            r2 = 1
            if (r0 != 0) goto L6f
            int r3 = r10.c
            if (r3 == r1) goto L6f
            if (r13 != r2) goto L66
            goto L6f
        L66:
            mz1 r0 = new mz1
            r0.<init>(r5, r12, r7)
            r9.add(r0)
            goto L50
        L6f:
            if (r0 != 0) goto L93
            wib r0 = r5.o
            java.lang.Object r0 = r0.c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "isInVideoUsage: mVideoUsageControl value = "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Camera2CameraControlImp"
            defpackage.gri.a(r3, r1)
            if (r0 <= 0) goto L91
            goto L93
        L91:
            r6 = r2
            goto L95
        L93:
            r2 = 0
            goto L91
        L95:
            a02 r1 = new a02
            java.lang.Object r0 = r10.g
            r4 = r0
            qee r4 = (defpackage.qee) r4
            java.lang.Object r0 = r10.h
            a07 r0 = (defpackage.a07) r0
            r3 = r12
            r2 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r9.add(r1)
        La9:
            java.lang.String r12 = ", flashMode = "
            java.lang.String r0 = ", flashType = "
            java.lang.String r1 = "createPipeline: captureMode = "
            java.lang.StringBuilder r11 = defpackage.wy1.k(r1, r11, r12, r3, r0)
            r11.append(r13)
            java.lang.String r12 = ", pipeline tasks = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Camera2CapturePipeline"
            defpackage.gri.a(r12, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.f(int, int, int):sz1");
    }

    public boolean i() {
        return !((ByteBuffer) this.h).hasRemaining() && this.c >= ((ArrayList) this.d).size() && ((pj4) this.e).e();
    }

    public y30 j(g95 g95Var, hf6 hf6Var) throws ExportException {
        hsi.b(hf6Var.H != -1);
        try {
            y30 y30Var = new y30((i50) this.g, g95Var, hf6Var);
            if (Objects.equals((i50) this.g, i50.e)) {
                i50 i50Var = y30Var.a;
                this.g = i50Var;
                ((g50) this.f).a(i50Var);
                ((g50) this.f).b();
            }
            ((ArrayList) this.d).add(new v30(y30Var));
            LinkedHashMap linkedHashMap = ah4.a;
            synchronized (ah4.class) {
            }
            return y30Var;
        } catch (AudioProcessor$UnhandledAudioFormatException e) {
            throw ExportException.b(e, "Error while registering input " + ((ArrayList) this.d).size());
        }
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.d;
        for (int i = 0; i < arrayList.size(); i++) {
            ((v30) arrayList.get(i)).a.h.j();
        }
        arrayList.clear();
        pj4 pj4Var = (pj4) this.e;
        pj4Var.a.clear();
        pj4Var.b = 0;
        i50 i50Var = i50.e;
        pj4Var.c = i50Var;
        pj4Var.d = -1;
        pj4Var.e = new bz1[0];
        pj4Var.f = -9223372036854775807L;
        pj4Var.g = -1L;
        pj4Var.h = 0L;
        pj4Var.i = BuildConfig.MAX_TIME_TO_UPLOAD;
        pj4Var.j = 0L;
        ((g50) this.f).j();
        this.c = 0;
        this.h = l50.a;
        this.g = i50Var;
    }

    public w30(ry1 ry1Var, i12 i12Var, i17 i17Var, qee qeeVar, a07 a07Var) {
        this.c = 1;
        this.d = ry1Var;
        Integer num = (Integer) i12Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.b = num != null && num.intValue() == 2;
        this.g = qeeVar;
        this.h = a07Var;
        this.f = i17Var;
        this.e = new xn3(i17Var, 9);
        this.a = if0.c(new xtd(22, i12Var));
    }

    public w30() {
        this.e = new HashSet();
        this.f = x8a.b();
        this.c = -1;
        this.a = false;
        this.d = new ArrayList();
        this.b = false;
        this.g = g9a.a();
    }

    public w30(h52 h52Var) {
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = x8a.b();
        this.c = -1;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = false;
        this.g = g9a.a();
        hashSet.addAll(h52Var.a);
        this.f = x8a.k(h52Var.b);
        this.c = h52Var.c;
        arrayList.addAll(h52Var.e);
        this.b = h52Var.f;
        ryf ryfVar = h52Var.g;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : ryfVar.a.keySet()) {
            arrayMap.put(str, ryfVar.a.get(str));
        }
        this.g = new g9a(arrayMap);
        this.a = h52Var.d;
    }

    public w30(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d(null, "", i) : null, str, pendingIntent, new Bundle());
    }

    public w30(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.b = true;
        this.e = iconCompat;
        this.f = nla.c(charSequence);
        this.g = pendingIntent;
        this.h = bundle;
        this.d = null;
        this.a = true;
        this.c = 0;
        this.b = true;
    }
}
