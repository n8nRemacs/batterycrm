package defpackage;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i3e implements mcf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i3e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void l(i3e i3eVar, long j, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        ((tcf) i3eVar.b).m(null, new f3e(j, true, true, z, false, -1, -1L));
    }

    @Override // defpackage.fve
    public final List b() {
        switch (this.a) {
            case 0:
                return ((tcf) this.b).b();
            case 1:
                return Collections.singletonList(k());
            default:
                return hd5.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (defpackage.s8j.c(ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.UPLOAD_NEXT_INTERVAL, r0) != r4) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:15:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto Lba;
                case 1: goto L6e;
                default: goto L5;
            }
        L5:
            boolean r0 = r9 instanceof defpackage.w7g
            if (r0 == 0) goto L18
            r0 = r9
            w7g r0 = (defpackage.w7g) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.Z = r1
            goto L1d
        L18:
            w7g r0 = new w7g
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            z26 r8 = r0.o
            i3e r1 = r0.d
            defpackage.g8j.b(r9)
        L32:
            r9 = r1
            goto L48
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            z26 r8 = r0.o
            i3e r1 = r0.d
            defpackage.g8j.b(r9)
            goto L5f
        L44:
            defpackage.g8j.b(r9)
            r9 = r7
        L48:
            x74 r1 = r0.b
            defpackage.eoi.d(r1)
            java.util.List r1 = r9.j()
            r0.d = r9
            r0.o = r8
            r0.Z = r3
            java.lang.Object r1 = r8.a(r1, r0)
            if (r1 != r4) goto L5e
            goto L6d
        L5e:
            r1 = r9
        L5f:
            r0.d = r1
            r0.o = r8
            r0.Z = r2
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = defpackage.s8j.c(r5, r0)
            if (r9 != r4) goto L32
        L6d:
            return r4
        L6e:
            boolean r0 = r9 instanceof defpackage.i5e
            if (r0 == 0) goto L81
            r0 = r9
            i5e r0 = (defpackage.i5e) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L81
            int r1 = r1 - r2
            r0.o = r1
            goto L86
        L81:
            i5e r0 = new i5e
            r0.<init>(r7, r9)
        L86:
            java.lang.Object r9 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto La2
            if (r1 == r2) goto L97
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L97:
            defpackage.g8j.b(r9)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StateFlow collection never ends"
            r8.<init>(r9)
            throw r8
        La2:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r7.b
            l5c r9 = (defpackage.l5c) r9
            jve r9 = r9.e
            r0.o = r2
            hv7 r1 = new hv7
            r2 = 17
            r1.<init>(r8, r7, r2)
            r9.d(r1, r0)
            g84 r8 = defpackage.g84.a
            return r8
        Lba:
            java.lang.Object r0 = r7.b
            tcf r0 = (defpackage.tcf) r0
            r0.d(r8, r9)
            g84 r8 = defpackage.g84.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3e.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public f3e f() {
        return (f3e) ((tcf) this.b).getValue();
    }

    @Override // defpackage.mcf
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return f();
            case 1:
                return k();
            default:
                return j();
        }
    }

    public List j() {
        int iIntValue;
        y7g y7gVar = (y7g) this.b;
        ArrayList arrayListK = ve3.k(new yg4(y7gVar.a, new n5g(j3d.oneme_settings_dump_threads), yud.s, null, vg4.a, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapA = gei.a(allStackTraces);
        Iterator it = v7g.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            iIntValue = 0;
            if (!f2Var.hasNext()) {
                break;
            }
            Thread.State state = (Thread.State) f2Var.next();
            long j = ((pu4) y7gVar.e.computeIfAbsent(state, new bvh(1, new u7g(0)))).a;
            int i = j3d.oneme_settings_thread_state_count;
            String strName = state.name();
            Integer num = (Integer) ((LinkedHashMap) mapA).get(state);
            if (num != null) {
                iIntValue = num.intValue();
            }
            arrayListK.add(new yg4(j, new p5g(i, ys.D(new Object[]{strName, Integer.valueOf(iIntValue)})), yud.W0, null, null, 24));
        }
        long j2 = y7gVar.b;
        int i2 = j3d.oneme_settings_thread_state_count;
        Iterator it2 = ((LinkedHashMap) mapA).values().iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += ((Number) it2.next()).intValue();
        }
        arrayListK.add(new yg4(j2, new p5g(i2, ys.D(new Object[]{"Total", Integer.valueOf(iIntValue2)})), yud.W0, null, null, 24));
        if (!allStackTraces.isEmpty()) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = allStackTraces.entrySet().iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                if (dnf.r(it3.next().getKey().getName(), "tracer-", false)) {
                    i3++;
                }
            }
            iIntValue = i3;
        }
        arrayListK.add(new yg4(y7gVar.c, new p5g(j3d.oneme_settings_thread_tracer, ys.D(new Object[]{Integer.valueOf(iIntValue)})), yud.P0, null, null, 24));
        arrayListK.add(new yg4(y7gVar.d, new p5g(j3d.oneme_settings_thread_viewer_state, ys.D(new Object[]{Integer.valueOf(iIntValue)})), yud.P1, null, null, 24));
        return arrayListK;
    }

    public Object k() {
        return kaj.b(((l5c) this.b).g, "push-delivery", Boolean.FALSE, vid.a(Boolean.class));
    }

    public i3e() {
        this.a = 0;
        this.b = ucf.a(null);
    }
}
