package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class dq4 implements tq4, uu1, lva, oa8, i8b, zua, rl3, w2f, jy8, pa8, uy8, y79, fu3, y89, gu3, y8d, dcb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dq4(i65 i65Var, u75 u75Var) {
        this.a = 2;
        Map map = Collections.EMPTY_MAP;
        this.b = i65Var;
        this.c = u75Var;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        return (g4i) ((js0) this.b).invoke(view, g4iVar, (Rect) this.c);
    }

    @Override // defpackage.i8b
    public String a(String str, String str2) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj2;
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                return b5j.c((aub) inputPhoneScreen.w0.getValue(), ((j8b) obj).getCode(), str2, str, ((a94) inputPhoneScreen.D0().D0.a.getValue()).b);
            default:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj2;
                yy7[] yy7VarArr2 = InviteByPhoneScreen.z0;
                return b5j.c((aub) inviteByPhoneScreen.w0.getValue(), ((j8b) obj).getCode(), str2, str, ((a94) inviteByPhoneScreen.B0().D0.a.getValue()).b);
        }
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 20:
                z89 z89Var = (z89) this.b;
                egg eggVarB = (egg) this.c;
                a5c a5cVar = (a5c) obj;
                ah7 ah7Var = eggVarB.D;
                if (!ah7Var.isEmpty()) {
                    cgg cggVarC = eggVarB.a().c();
                    rrg it = ah7Var.values().iterator();
                    while (it.hasNext()) {
                        xfg xfgVar = (xfg) it.next();
                        lfg lfgVar = (lfg) z89Var.f.Z.get(xfgVar.a.b);
                        if (lfgVar == null || xfgVar.a.a != lfgVar.a) {
                            cggVarC.a(xfgVar);
                        } else {
                            cggVarC.a(new xfg(lfgVar, xfgVar.b));
                        }
                    }
                    eggVarB = cggVarC.b();
                }
                a5cVar.m0();
                em5 em5Var = a5cVar.a;
                em5Var.A1();
                oo8 oo8Var = em5Var.t0;
                oo8Var.getClass();
                egg eggVarA1 = em5Var.a1();
                if (!eggVarB.equals(((ar4) oo8Var).e())) {
                    oo8Var.b(eggVarB);
                }
                if (!eggVarA1.equals(eggVarB)) {
                    em5Var.x0.f(19, new wo4(13, eggVarB));
                    break;
                }
                break;
            case 21:
                z89 z89Var2 = (z89) this.b;
                u69 u69Var = (u69) this.c;
                o79 o79Var = (o79) z89Var2.c.get();
                if (o79Var != null && !o79Var.j()) {
                    o79Var.g(u69Var, false);
                    break;
                }
                break;
            case 22:
            case 23:
            default:
                to8.t((x10) obj, (String) this.b, new bx9((em6) this.c));
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                lk6 lk6Var = (lk6) this.b;
                ((n99) obj).C(lk6Var.b, (d99) lk6Var.c, (g19) this.c);
                break;
            case 25:
                to8.t((x10) obj, (String) this.b, (gu3) this.c);
                break;
            case 26:
                x00 x00Var = (x00) obj;
                to8.u(x00Var, (p10) this.c, ((qi9) this.b).c.a.j());
                break;
        }
    }

    @Override // defpackage.y79
    public void b(u69 u69Var) {
        switch (this.a) {
            case 18:
                z79 z79Var = (z79) this.b;
                Bundle bundle = (Bundle) this.c;
                o79 o79Var = z79Var.g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                o79Var.n(u69Var);
                break;
            default:
                z79 z79Var2 = (z79) this.b;
                wy8 wy8Var = (wy8) this.c;
                z79Var2.getClass();
                String str = wy8Var.a;
                if (TextUtils.isEmpty(str)) {
                    a8i.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    a5c a5cVar = z79Var2.g.t;
                    if (a5cVar.S(17)) {
                        s9g s9gVarV = a5cVar.v();
                        q9g q9gVar = new q9g();
                        for (int i = 0; i < s9gVarV.o(); i++) {
                            if (TextUtils.equals(s9gVarV.m(i, q9gVar, 0L).c.a, str)) {
                                a5cVar.U(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        a8i.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 16:
                ly8Var.V((q4c) this.b, (o4c) this.c);
                break;
            default:
                bie bieVar = (bie) this.b;
                o3c o3cVar = (o3c) this.c;
                px8 px8Var = ly8Var.a;
                if (ly8Var.isConnected()) {
                    boolean zEquals = Objects.equals(ly8Var.v, o3cVar);
                    boolean zEquals2 = Objects.equals(ly8Var.u, bieVar);
                    if (!zEquals || !zEquals2) {
                        ly8Var.u = bieVar;
                        if (zEquals) {
                            z = false;
                        } else {
                            ly8Var.v = o3cVar;
                            o3c o3cVar2 = ly8Var.x;
                            o3c o3cVarM = ly8.m(o3cVar, ly8Var.w);
                            ly8Var.x = o3cVarM;
                            z = !o3cVarM.equals(o3cVar2);
                        }
                        if (!zEquals2 || z) {
                            zjd zjdVar = ly8Var.s;
                            zjd zjdVar2 = ly8Var.t;
                            zjd zjdVarX = ly8.X(ly8Var.r, ly8Var.q, bieVar, ly8Var.x, ly8Var.D);
                            ly8Var.s = zjdVarX;
                            ly8Var.t = ly8.W(zjdVarX, ly8Var.q, ly8Var.D, bieVar, ly8Var.x);
                            z2 = !ly8Var.s.equals(zjdVar);
                            z3 = !ly8Var.t.equals(zjdVar2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            ly8Var.h.f(13, new zx8(ly8Var, 3));
                        }
                        if (!zEquals2) {
                            px8Var.getClass();
                            hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                            px8Var.d.v();
                        }
                        if (z3) {
                            px8Var.getClass();
                            hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                            px8Var.d.getClass();
                        }
                        if (z2) {
                            px8Var.getClass();
                            hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                            px8Var.d.z();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ly8 ly8Var = (ly8) this.b;
                aie aieVar = (aie) this.c;
                eb7Var.O(ly8Var.c, i, aieVar.b(), Bundle.EMPTY);
                break;
            default:
                ly8 ly8Var2 = (ly8) this.b;
                List list = (List) this.c;
                vy8 vy8Var = ly8Var2.c;
                tg7 tg7VarI = wg7.i();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    tg7VarI.a(((k09) list.get(i2)).d(true));
                }
                eb7Var.x(vy8Var, i, new iw0(tg7VarI.i()), true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // defpackage.tq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.zjd e(int r17, defpackage.kfg r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq4.e(int, kfg, int[]):zjd");
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        Context context = (Context) this.b;
        do8 do8Var = (do8) this.c;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("This thread is main!");
        }
        c0g c0gVar = do8Var.a;
        c0gVar.getClass();
        Context context2 = c0gVar.a;
        int i = ivd.Z;
        v1a v1aVar = a93.s0;
        Bitmap bitmapO = tfi.o(i, ctd.f(v1aVar, context2).k, context);
        Bitmap bitmapN = tfi.n((int) (bitmapO.getWidth() * 1.5d), (int) (bitmapO.getHeight() * 1.5d), bitmapO);
        ConcurrentHashMap concurrentHashMap = do8Var.f;
        concurrentHashMap.put(co8.a, t49.b(bitmapO));
        bitmapO.recycle();
        concurrentHashMap.put(co8.b, t49.b(bitmapN));
        bitmapN.recycle();
        Bitmap bitmapO2 = tfi.o(ivd.a0, ctd.f(v1aVar, context2).k, context);
        Bitmap bitmapN2 = tfi.n((int) (bitmapO2.getWidth() * 1.5d), (int) (bitmapO2.getHeight() * 1.5d), bitmapO2);
        concurrentHashMap.put(co8.c, t49.b(bitmapO2));
        bitmapO2.recycle();
        concurrentHashMap.put(co8.d, t49.b(bitmapN2));
        bitmapN2.recycle();
        i2fVar.a(concurrentHashMap);
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                z2c z2cVar = (z2c) this.b;
                ((q3c) obj).F(z2cVar.h, (vfg) this.c);
                break;
            case 13:
                ((r3c) obj).G0((k09) this.b, ((Integer) this.c).intValue());
                break;
            default:
                ((r3c) obj).G0(((q4c) ((goh) this.b).b).n(), ((Integer) this.c).intValue());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // defpackage.rl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.v6d r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.c
            os5 r1 = (defpackage.os5) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r4 = r4.a(r2)
            android.content.Context r4 = (android.content.Context) r4
            int r1 = r1.a
            switch(r1) {
                case 4: goto L74;
                case 5: goto L67;
                case 6: goto L2b;
                default: goto L15;
            }
        L15:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = r1.getInstallerPackageName(r4)
            if (r4 == 0) goto L28
            java.lang.String r4 = com.google.firebase.FirebaseCommonRegistrar.a(r4)
            goto L80
        L28:
            java.lang.String r4 = ""
            goto L80
        L2b:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.television"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L3a
            java.lang.String r4 = "tv"
            goto L80
        L3a:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L49
            java.lang.String r4 = "watch"
            goto L80
        L49:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.automotive"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L58
            java.lang.String r4 = "auto"
            goto L80
        L58:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r4 = r4.hasSystemFeature(r1)
            if (r4 == 0) goto L28
            java.lang.String r4 = "embedded"
            goto L80
        L67:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L28
            int r4 = r4.minSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L80
        L74:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L28
            int r4 = r4.targetSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L80:
            na0 r1 = new na0
            r1.<init>(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq4.j(v6d):java.lang.Object");
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        wye wyeVar = (wye) this.c;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        if (ecbVar == ecb.o) {
            vu9 vu9VarK0 = messagesListWidget.K0();
            long j = wyeVar.a;
            vu9VarK0.getClass();
            xfh.o(vu9VarK0, null, new fu9(vu9VarK0, j, false, false, null), 3);
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 2:
                i65 i65Var = (i65) this.b;
                u75 u75Var = (u75) this.c;
                Map map = Collections.EMPTY_MAP;
                i65Var.b(new cj(i65Var, u75Var, tu1Var), new mc(6));
                return "Init GlRenderer";
            default:
                c86 c86Var = (c86) this.b;
                c86Var.b.execute(new se5(c86Var, tu1Var, (z95) this.c, 9));
                return "startFocusAndMetering";
        }
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
            case 22:
                return o79Var.j() ? a6a.c(new yie(-100)) : zxg.l0((ha8) ((y89) this.b).n(o79Var, u69Var, i), new nl(o79Var, u69Var, (p89) this.c, 12));
            default:
                return o79Var.j() ? a6a.c(new yie(-100)) : zxg.l0((ha8) ((y89) this.b).n(o79Var, u69Var, i), new nl(o79Var, u69Var, (x89) this.c, 13));
        }
    }

    @Override // defpackage.lva
    public void p(Task task) {
        ((gg5) this.b).a((Intent) this.c);
    }

    public /* synthetic */ dq4(ly8 ly8Var, aie aieVar) {
        this.a = 12;
        Bundle bundle = Bundle.EMPTY;
        this.b = ly8Var;
        this.c = aieVar;
    }

    public /* synthetic */ dq4(z79 z79Var, aie aieVar, Bundle bundle) {
        this.a = 18;
        this.b = z79Var;
        this.c = bundle;
    }

    public /* synthetic */ dq4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
