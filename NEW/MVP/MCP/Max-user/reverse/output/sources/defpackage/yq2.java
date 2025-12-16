package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class yq2 extends xfh implements r19 {
    public static final /* synthetic */ yy7[] u1 = {new z8a(yq2.class, "mediaStateHidingJob", "getMediaStateHidingJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, yq2.class, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "changeOrientationJob", "getChangeOrientationJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;"), new z8a(yq2.class, "requestTotalCountJob", "getRequestTotalCountJob()Lkotlinx/coroutines/Job;")};
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final k18 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final k18 L0;
    public final k18 M0;
    public xw N0;
    public final Set O0;
    public final AtomicReference P0;
    public final AtomicReference Q0;
    public final AtomicReference R0;
    public final AtomicReference S0;
    public final AtomicLong T0;
    public final ci5 U0;
    public final ci5 V0;
    public cm6 W0;
    public final boolean X;
    public final tcf X0;
    public final kj1 Y;
    public final hbd Y0;
    public final Context Z;
    public final tcf Z0;
    public final hbd a1;
    public final long b;
    public final tcf b1;
    public final String c;
    public final hbd c1;
    public final long d;
    public final tcf d1;
    public final hbd e1;
    public final tcf f1;
    public final hbd g1;
    public final tcf h1;
    public final hbd i1;
    public final t9f j1;
    public final jve k1;
    public final gbd l1;
    public final t9f m1;
    public final t9f n1;
    public final boolean o;
    public final t9f o1;
    public final t9f p1;
    public final t9f q1;
    public final t9f r1;
    public final gx9 s0;
    public final t9f s1;
    public final lzf t0;
    public final t9f t1;
    public final hwa u0;
    public final sq9 v0;
    public final String w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public yq2(long j, String str, long j2, boolean z, boolean z2, kj1 kj1Var) {
        ak2 ak2Var = ak2.a;
        Context context = (Context) ak2Var.getAccessor().c(12);
        bwf bwfVarD = ak2Var.getAccessor().d(109);
        bwf bwfVarD2 = ak2Var.getAccessor().d(536);
        bwf bwfVarD3 = ak2Var.getAccessor().d(521);
        bwf bwfVarD4 = ak2Var.getAccessor().d(123);
        bwf bwfVarD5 = ak2Var.getAccessor().d(HttpStatus.SC_GONE);
        bwf bwfVarD6 = ak2Var.getAccessor().d(125);
        bwf bwfVarD7 = ak2Var.getAccessor().d(133);
        bwf bwfVarD8 = ak2Var.getAccessor().d(557);
        gx9 gx9Var = (gx9) ak2Var.getAccessor().c(138);
        lzf lzfVar = (lzf) ak2Var.getAccessor().c(8);
        hwa hwaVar = (hwa) ak2Var.getAccessor().c(79);
        sq9 sq9VarA = mwi.a(j, (tw0) ak2Var.getAccessor().c(49), (lzf) ak2Var.getAccessor().c(8));
        bwf bwfVarD9 = ak2Var.getAccessor().d(245);
        bwf bwfVarD10 = ak2Var.getAccessor().d(269);
        bwf bwfVarD11 = ak2Var.getAccessor().d(137);
        bwf bwfVarD12 = ak2Var.getAccessor().d(140);
        bwf bwfVarD13 = ak2Var.getAccessor().d(142);
        bwf bwfVarD14 = ak2Var.getAccessor().d(148);
        bwf bwfVarD15 = ak2Var.getAccessor().d(46);
        bwf bwfVarD16 = ak2Var.getAccessor().d(48);
        bwf bwfVarD17 = ak2Var.getAccessor().d(526);
        this.b = j;
        this.c = str;
        this.d = j2;
        this.o = z;
        this.X = z2;
        this.Y = kj1Var;
        this.Z = context;
        this.s0 = gx9Var;
        this.t0 = lzfVar;
        this.u0 = hwaVar;
        this.v0 = sq9VarA;
        this.w0 = yq2.class.getName();
        this.x0 = bwfVarD;
        this.y0 = bwfVarD3;
        this.z0 = bwfVarD4;
        this.A0 = bwfVarD5;
        this.B0 = bwfVarD6;
        this.C0 = bwfVarD7;
        this.D0 = bwfVarD8;
        this.E0 = bwfVarD9;
        this.F0 = bwfVarD10;
        this.G0 = bwfVarD11;
        this.H0 = bwfVarD12;
        this.I0 = bwfVarD13;
        this.J0 = bwfVarD14;
        this.K0 = bwfVarD15;
        this.L0 = bwfVarD16;
        this.M0 = bwfVarD17;
        this.O0 = gke.h(s00.PHOTO, s00.VIDEO);
        this.P0 = new AtomicReference(null);
        this.Q0 = new AtomicReference(new hp2(false, false));
        this.R0 = new AtomicReference(null);
        this.S0 = new AtomicReference(null);
        this.T0 = new AtomicLong();
        this.U0 = new ci5(0);
        this.V0 = new ci5(0);
        tcf tcfVarA = ucf.a(ip2.c);
        this.X0 = tcfVarA;
        this.Y0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(new gp2(null, null, 31));
        this.Z0 = tcfVarA2;
        this.a1 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(new kp2(null, false));
        this.b1 = tcfVarA3;
        this.c1 = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(new lp2((h09) null, 3));
        this.d1 = tcfVarA4;
        this.e1 = new hbd(tcfVarA4);
        tcf tcfVarA5 = ucf.a(jp2.c);
        this.f1 = tcfVarA5;
        this.g1 = new hbd(tcfVarA5);
        tcf tcfVarA6 = ucf.a(w54.c);
        this.h1 = tcfVarA6;
        this.i1 = new hbd(tcfVarA6);
        this.j1 = c7j.c();
        jve jveVarA = kve.a(1, 0, 2);
        this.k1 = jveVarA;
        this.l1 = new gbd(jveVarA);
        this.m1 = c7j.c();
        this.n1 = c7j.c();
        this.o1 = c7j.c();
        this.p1 = c7j.c();
        this.q1 = c7j.c();
        this.r1 = c7j.c();
        this.s1 = c7j.c();
        this.t1 = c7j.c();
        q2b q2bVar = (q2b) lzfVar;
        xfh.o(this, q2bVar.a(), new ep2(this, bwfVarD2, null), 2);
        gw0.w(gw0.u(new g56((x26) sq9VarA.f.getValue(), new rw(2, this, yq2.class, "handleMessageEvent", "handleMessageEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), 1), q2bVar.a()), this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x014b, code lost:
    
        if (r11.z(r0) == r8) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.yq2 r11, defpackage.oj9 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.t(yq2, oj9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.yq2 r12, int r13, java.util.List r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.u(yq2, int, java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r11.M(r10, r0) != r7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.yq2 r10, defpackage.si9 r11, defpackage.q44 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.iq2
            if (r0 == 0) goto L13
            r0 = r12
            iq2 r0 = (defpackage.iq2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            iq2 r0 = new iq2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.X
            int r1 = r0.Z
            r2 = 3
            r3 = 1
            r4 = 4
            r5 = 2
            r6 = 0
            g84 r7 = defpackage.g84.a
            if (r1 == 0) goto L57
            if (r1 == r3) goto L4c
            if (r1 == r5) goto L45
            if (r1 == r2) goto L3a
            if (r1 != r4) goto L32
            defpackage.g8j.b(r12)
            goto Lc1
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.o
            j09 r10 = (defpackage.j09) r10
            yq2 r11 = r0.d
            defpackage.g8j.b(r12)
            goto Lb4
        L45:
            yq2 r10 = r0.d
            defpackage.g8j.b(r12)
        L4a:
            r11 = r10
            goto L84
        L4c:
            java.lang.Object r10 = r0.o
            r11 = r10
            si9 r11 = (defpackage.si9) r11
            yq2 r10 = r0.d
            defpackage.g8j.b(r12)
            goto L6d
        L57:
            defpackage.g8j.b(r12)
            w63 r12 = r10.D()
            long r8 = r10.b
            r0.d = r10
            r0.o = r11
            r0.Z = r3
            java.lang.Object r12 = r12.r(r8, r0)
            if (r12 != r7) goto L6d
            goto Lc0
        L6d:
            pb2 r12 = (defpackage.pb2) r12
            k18 r1 = r10.y0
            java.lang.Object r1 = r1.getValue()
            o2b r1 = (defpackage.o2b) r1
            r0.d = r10
            r0.o = r6
            r0.Z = r5
            java.lang.Object r12 = r1.j(r12, r0, r11)
            if (r12 != r7) goto L4a
            goto Lc0
        L84:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            java.util.List r10 = defpackage.jsi.b(r12)
            java.lang.String r12 = r11.w0
            java.lang.String r1 = "prepareSingleMode"
            defpackage.wqi.d(r12, r1)
            tcf r12 = r11.X0
            ip2 r1 = new ip2
            r3 = 0
            r1.<init>(r10, r5, r3)
            r12.m(r6, r1)
            java.lang.Object r12 = defpackage.ue3.G(r10)
            j09 r12 = (defpackage.j09) r12
            int r10 = r10.size()
            r0.d = r11
            r0.o = r12
            r0.Z = r2
            java.lang.Object r10 = r11.N(r3, r12, r10, r0)
            if (r10 != r7) goto Lb3
            goto Lc0
        Lb3:
            r10 = r12
        Lb4:
            r0.d = r6
            r0.o = r6
            r0.Z = r4
            java.lang.Object r10 = r11.M(r10, r0)
            if (r10 != r7) goto Lc1
        Lc0:
            return r7
        Lc1:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.v(yq2, si9, q44):java.lang.Object");
    }

    public static final boolean w(yq2 yq2Var, q19 q19Var) {
        if (q19Var == null) {
            return false;
        }
        Set set = q19Var.c;
        return q19Var.d == yq2Var.b && set.contains(s00.VIDEO) && set.contains(s00.PHOTO);
    }

    public static boolean y() {
        Object ipdVar;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            ipdVar = Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = -1L;
        }
        return ((Number) ipdVar).longValue() > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void A(dv5 dv5Var, j09 j09Var, long j, long j2) {
        int i;
        ArrayList arrayList = ((ae3) j09Var.v()).b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            jd3 jd3Var = (jd3) it.next();
            if (jd3Var instanceof od7) {
                i3++;
            } else {
                if (!(jd3Var instanceof s0h)) {
                    throw new NoWhenBranchMatchedException();
                }
                i4++;
            }
        }
        if (i3 == arrayList.size()) {
            i2 = 1;
        } else if (i4 == arrayList.size()) {
            i2 = 2;
        }
        boolean zY = y();
        ci5 ci5Var = this.U0;
        if (!zY) {
            xfh.r(ci5Var, new vh5(new n5g(i2 != 1 ? i2 != 2 ? e3d.oneme_chatmedia_viewer_media_download_error : e3d.oneme_chatmedia_viewer_video_download_error : e3d.oneme_chatmedia_viewer_photo_download_error), Integer.valueOf(ivd.l), 4));
            return;
        }
        iz5 iz5Var = (iz5) ((qx5) this.G0.getValue());
        if (Build.VERSION.SDK_INT >= 29) {
            iz5Var.getClass();
        } else if (z7.b(iz5Var.c, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.W0 = new bp2(this, dv5Var, j09Var, j, j2, 1);
            xfh.r(ci5Var, sh5.a);
            return;
        }
        int i5 = ivd.p;
        if (i2 != 1) {
            i = i2 != 2 ? e3d.oneme_chatmedia_viewer_start_downloading_many_medias : e3d.oneme_chatmedia_viewer_start_downloading_many_video;
        } else {
            i5 = ivd.o;
            i = e3d.oneme_chatmedia_viewer_all_photo_download_complete;
        }
        xfh.r(ci5Var, new vh5(new p5g(i, ys.D(Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1))), Integer.valueOf(i5), 4));
        gw0.w(gw0.u(gw0.d(new g56(new m36(new bc2(new d53(l9j.b((g5i) dv5Var.a.getValue(), j, j2, null), 12), 1), new op2(3, null, 0)), new pp2(i2, this, size, null), 1)), ((q2b) this.t0).a()), this.a);
    }

    public final void B(dv5 dv5Var, j09 j09Var, long j, long j2) {
        n5g n5gVar;
        boolean zY = y();
        s5g n5gVar2 = s5g.b;
        ci5 ci5Var = this.U0;
        if (!zY) {
            if (j09Var instanceof b09) {
                n5gVar2 = new n5g(e3d.oneme_chatmedia_viewer_photo_download_error);
            } else if (j09Var instanceof h09) {
                n5gVar2 = new n5g(e3d.oneme_chatmedia_viewer_video_download_error);
            } else if (!(j09Var instanceof tz8)) {
                throw new NoWhenBranchMatchedException();
            }
            xfh.r(ci5Var, new vh5(n5gVar2, Integer.valueOf(ivd.l), 4));
            return;
        }
        iz5 iz5Var = (iz5) ((qx5) this.G0.getValue());
        if (Build.VERSION.SDK_INT >= 29) {
            iz5Var.getClass();
        } else if (z7.b(iz5Var.c, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.W0 = new bp2(this, dv5Var, j09Var, j, j2, 0);
            xfh.r(ci5Var, sh5.a);
            return;
        }
        int i = ivd.p;
        if (j09Var instanceof b09) {
            i = ivd.o;
            n5gVar = new n5g(e3d.oneme_chatmedia_viewer_photo_download_complete);
        } else {
            if (!(j09Var instanceof h09)) {
                if (!(j09Var instanceof tz8)) {
                    throw new NoWhenBranchMatchedException();
                }
                xfh.r(ci5Var, new vh5(n5gVar2, Integer.valueOf(i), 4));
                gw0.w(gw0.u(gw0.d(new g56(new m36(new bc2(new d53(l9j.b((g5i) dv5Var.a.getValue(), j, j2, j09Var.w()), 12), 2), new op2(3, null, 1)), new rp2(j09Var, this, null), 1)), ((q2b) this.t0).a()), this.a);
            }
            n5gVar = new n5g(e3d.oneme_chatmedia_viewer_start_downloading_single_video);
        }
        n5gVar2 = n5gVar;
        xfh.r(ci5Var, new vh5(n5gVar2, Integer.valueOf(i), 4));
        gw0.w(gw0.u(gw0.d(new g56(new m36(new bc2(new d53(l9j.b((g5i) dv5Var.a.getValue(), j, j2, j09Var.w()), 12), 2), new op2(3, null, 1)), new rp2(j09Var, this, null), 1)), ((q2b) this.t0).a()), this.a);
    }

    public final void C(long j, String str) {
        String str2 = this.w0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, a9h.e("Media viewer. Call fetch video msg:", j, ", attach:", str), null);
            }
        }
        this.m1.O(this, u1[1], svi.d(this.a, ((q2b) this.t0).b(), i84.b, new sp2(this, j, str, null)));
    }

    public final w63 D() {
        return (w63) this.x0.getValue();
    }

    public final j09 E() {
        Object next;
        String str = (String) this.R0.get();
        Iterator it = ((ip2) this.X0.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((j09) next).w(), str)) {
                break;
            }
        }
        return (j09) next;
    }

    public final j09 F(long j, String str) {
        Object next;
        Iterator it = ((ip2) this.Y0.a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            j09 j09Var = (j09) next;
            if (j09Var.j() == j && str.equals(j09Var.w())) {
                break;
            }
        }
        return (j09) next;
    }

    public final void G(String str) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.t0).b(), i84.b, new wp2(this, str, null));
        this.r1.O(this, u1[6], x9fVarD);
    }

    public final void H(String str, i88 i88Var) {
        int iOrdinal = i88Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 4) {
                String strA = ((j98) this.I0.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                G(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        G(str);
    }

    public final void I() {
        x9f x9fVarE = svi.e(this.a, null, i84.b, new bq2(this, null), 1);
        this.j1.O(this, u1[0], x9fVarE);
    }

    public final void J(long j, String str) {
        j09 j09VarE = E();
        if (j09VarE != null && j09VarE.j() == j && fni.a(j09VarE.w(), str)) {
            xfh.r(this.U0, new nh5(5, false));
        }
    }

    public final void K(long j, String str) {
        j09 j09VarE = E();
        if (j09VarE != null && j09VarE.j() == j && fni.a(j09VarE.w(), str)) {
            xfh.r(this.U0, new nh5(4, false));
        }
    }

    public final void L(long j, String str) {
        j09 j09VarE = E();
        if (j09VarE != null && j09VarE.j() == j && fni.a(j09VarE.w(), str)) {
            xfh.r(this.U0, new nh5(1, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[PHI: r2
  0x0123: PHI (r2v5 java.lang.String) = (r2v11 java.lang.String), (r2v12 java.lang.String) binds: [B:53:0x014b, B:49:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.j09 r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.M(j09, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(int r17, defpackage.j09 r18, int r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.N(int, j09, int, q44):java.lang.Object");
    }

    public final void O(int i, Bundle bundle) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.t0).a(), i84.b, new kq2(this, i, bundle, null));
        this.o1.O(this, u1[3], x9fVarD);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.si9 r8, defpackage.q44 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lq2
            if (r0 == 0) goto L13
            r0 = r9
            lq2 r0 = (defpackage.lq2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            lq2 r0 = new lq2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            si9 r8 = r0.o
            yq2 r0 = r0.d
            defpackage.g8j.b(r9)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.g8j.b(r9)
            w63 r9 = r7.D()
            r0.d = r7
            r0.o = r8
            r0.Z = r2
            long r1 = r7.b
            java.lang.Object r9 = r9.r(r1, r0)
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L49
            return r0
        L49:
            r0 = r7
        L4a:
            pb2 r9 = (defpackage.pb2) r9
            long r1 = r8.b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            qqg r2 = defpackage.qqg.a
            if (r1 == 0) goto L87
            rf2 r1 = r9.b
            long r5 = r1.a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L5f
            goto L87
        L5f:
            java.lang.String r1 = r0.w0
            java.lang.String r3 = "Media viewer. Start request media total count."
            defpackage.wqi.d(r1, r3)
            lzf r1 = r0.t0
            q2b r1 = (defpackage.q2b) r1
            z74 r1 = r1.a()
            nq2 r3 = new nq2
            r4 = 0
            r3.<init>(r9, r8, r0, r4)
            kotlinx.coroutines.internal.ContextScope r8 = r0.a
            i84 r9 = defpackage.i84.b
            x9f r8 = defpackage.svi.d(r8, r1, r9, r3)
            t9f r9 = r0.t1
            yy7[] r1 = defpackage.yq2.u1
            r3 = 8
            r1 = r1[r3]
            r9.O(r0, r1, r8)
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.P(si9, q44):java.lang.Object");
    }

    public final void Q(x9f x9fVar) {
        this.n1.O(this, u1[2], x9fVar);
    }

    @Override // defpackage.r19
    public final q19 h() {
        q19 q19Var = (q19) this.P0.get();
        return q19Var == null ? new q19(0L, 0L, this.O0, this.b) : q19Var;
    }

    @Override // defpackage.xfh
    public final void s() {
        xw xwVar = this.N0;
        if (xwVar != null) {
            xwVar.e();
        }
        x();
        sq9 sq9Var = this.v0;
        sq9Var.a.f(sq9Var);
    }

    public final void x() {
        yy7[] yy7VarArr = u1;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.j1;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.q44 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.mp2
            if (r0 == 0) goto L13
            r0 = r10
            mp2 r0 = (defpackage.mp2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mp2 r0 = new mp2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            qqg r4 = defpackage.qqg.a
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.g8j.b(r10)
            return r4
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            yq2 r1 = r0.d
            defpackage.g8j.b(r10)
            goto L71
        L3b:
            defpackage.g8j.b(r10)
            tcf r10 = r9.X0
            java.lang.Object r10 = r10.getValue()
            ip2 r10 = (defpackage.ip2) r10
            java.util.List r10 = r10.a
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L8b
            java.lang.String r1 = r9.w0
            java.lang.String r7 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.wqi.d(r1, r7)
            java.lang.Object r10 = defpackage.ue3.I(r10)
            j09 r10 = (defpackage.j09) r10
            if (r10 == 0) goto L74
            long r7 = r10.j()
            r0.d = r9
            r0.Y = r3
            gx9 r10 = r9.s0
            bsd r10 = r10.a
            java.lang.Object r10 = r10.j(r7, r0)
            if (r10 != r6) goto L70
            goto L8a
        L70:
            r1 = r9
        L71:
            si9 r10 = (defpackage.si9) r10
            goto L76
        L74:
            r1 = r9
            r10 = r5
        L76:
            if (r10 != 0) goto L80
            java.lang.String r10 = r1.w0
            java.lang.String r0 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.wqi.r(r10, r0)
            return r4
        L80:
            r0.d = r5
            r0.Y = r2
            java.lang.Object r10 = r1.P(r10, r0)
            if (r10 != r6) goto L8b
        L8a:
            return r6
        L8b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.z(q44):java.lang.Object");
    }
}
