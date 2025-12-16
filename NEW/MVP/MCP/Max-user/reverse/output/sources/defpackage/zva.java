package defpackage;

import android.R;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.util.SparseBooleanArray;
import androidx.viewpager2.widget.ViewPager2;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zva implements m99, e55, bk5, ibe, sa5 {
    public static final lmb X = new lmb();
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object o;

    public zva() {
        this.a = 8;
        this.b = new bwf(l8.w0);
        this.c = new bwf(l8.v0);
        this.d = new bwf(l8.X);
        this.o = new bwf(l8.Y);
    }

    public static void j(ti1 ti1Var, yi1 yi1Var, HashMap map) {
        map.put("participant_id", ti1Var.b());
        if (yi1Var != null) {
            r8a r8aVar = yi1Var.c;
            p8a p8aVar = yi1Var.b;
            if (yi1Var.c()) {
                imb imbVar = yi1Var.k;
                map.put("participant_accept_peer_id", imbVar.a);
                map.put("participant_accept_peer_type", imbVar.b);
            }
            map.put("participant_connected", Boolean.toString(yi1Var.h));
            int iOrdinal = p8aVar.a.ordinal();
            if (iOrdinal == 0) {
                map.put("participant_audio_option_state", "UNMUTE");
            } else if (iOrdinal == 1) {
                map.put("participant_audio_option_state", "MUTE");
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                map.put("participant_audio_option_state", "MUTE_PERMANENT");
            }
            int iOrdinal2 = p8aVar.b.ordinal();
            if (iOrdinal2 == 0) {
                map.put("participant_video_option_state", "UNMUTE");
            } else if (iOrdinal2 == 1) {
                map.put("participant_video_option_state", "MUTE");
            } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                map.put("participant_video_option_state", "MUTE_PERMANENT");
            }
            int iOrdinal3 = p8aVar.c.ordinal();
            if (iOrdinal3 == 0) {
                map.put("participant_screenshare_option_state", "UNMUTE");
            } else if (iOrdinal3 == 1) {
                map.put("participant_screenshare_option_state", "MUTE");
            } else if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                map.put("participant_screenshare_option_state", "MUTE_PERMANENT");
            }
            map.put("participant_audio_enabled", String.valueOf(r8aVar.e));
            map.put("participant_video_enabled", String.valueOf(r8aVar.f));
            map.put("participant_screen_cast_enabled", String.valueOf(r8aVar.b));
        }
    }

    @Override // defpackage.m99
    public void B(int i, c99 c99Var, g19 g19Var) {
        if (l(i, c99Var)) {
            ((qr4) this.c).c(m(g19Var));
        }
    }

    @Override // defpackage.m99
    public void C(int i, c99 c99Var, g19 g19Var) {
        if (l(i, c99Var)) {
            ((qr4) this.c).m(m(g19Var));
        }
    }

    @Override // defpackage.m99
    public void H(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (l(i, c99Var)) {
            ((qr4) this.c).g(tb8Var, m(g19Var));
        }
    }

    @Override // defpackage.m99
    public void I(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (l(i, c99Var)) {
            ((qr4) this.c).l(tb8Var, m(g19Var));
        }
    }

    @Override // defpackage.bk5
    public ExecutorService a() {
        return (ExecutorService) ((bwf) this.d).getValue();
    }

    @Override // defpackage.sa5
    public void b(eaj eajVar) {
        k18 k18Var = (k18) this.c;
        if (!bwd.c((v08) this.o)) {
            wqi.c("de6", "Font already loading", new Object[0]);
            return;
        }
        isa isaVar = new isa(new tv0(12, this));
        m0g m0gVar = (m0g) k18Var.getValue();
        m0gVar.getClass();
        ssa ssaVarL = isaVar.p(((n0g) m0gVar).a()).l(((n0g) ((m0g) k18Var.getValue())).b());
        v08 v08Var = new v08(new u4e(this, 25, eajVar), new z9a(this, 28, eajVar), pdf.d);
        ssaVarL.a(v08Var);
        this.o = v08Var;
    }

    @Override // defpackage.m99
    public void c(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        if (l(i, c99Var)) {
            ((qr4) this.c).e(tb8Var, m(g19Var));
        }
    }

    @Override // defpackage.bk5
    public ExecutorService d() {
        return ((g4b) ((k18) this.b).getValue()).d();
    }

    @Override // defpackage.bk5
    public ExecutorService e() {
        return (ExecutorService) ((bwf) this.o).getValue();
    }

    @Override // defpackage.bk5
    public ExecutorService f() {
        return (ExecutorService) ((bwf) this.c).getValue();
    }

    @Override // defpackage.m99
    public void g(int i, c99 c99Var, tb8 tb8Var, g19 g19Var, IOException iOException, boolean z) {
        if (l(i, c99Var)) {
            ((qr4) this.c).j(tb8Var, m(g19Var), iOException, z);
        }
    }

    @Override // defpackage.bk5
    public ExecutorService h() {
        return (ExecutorService) ((bwf) this.c).getValue();
    }

    @Override // defpackage.bk5
    public ExecutorService i() {
        return (ExecutorService) ((bwf) this.c).getValue();
    }

    public boolean k(String str) {
        String str2 = (String) this.o;
        if (str2 == null) {
            this.o = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.c;
        if (str3 == null) {
            this.c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.d) == null) {
            HashSet hashSet = new HashSet(16);
            this.d = hashSet;
            hashSet.add((String) this.o);
            ((HashSet) this.d).add((String) this.c);
        }
        return !((HashSet) this.d).add(str);
    }

    public boolean l(int i, c99 c99Var) {
        c99 c99VarP;
        int i2;
        hm3 hm3Var = (hm3) this.o;
        if (c99Var != null) {
            c99VarP = hm3Var.p(this.b, c99Var);
            if (c99VarP == null) {
                return false;
            }
        } else {
            c99VarP = null;
        }
        c99 c99Var2 = c99VarP;
        qr4 qr4Var = (qr4) this.c;
        if (qr4Var.a == i && xxg.a((c99) qr4Var.c, c99Var2)) {
            i2 = i;
        } else {
            i2 = i;
            this.c = new qr4((CopyOnWriteArrayList) hm3Var.c.d, i2, c99Var2, 0L);
        }
        lk6 lk6Var = (lk6) this.d;
        if (lk6Var.b == i2 && xxg.a((c99) lk6Var.c, c99Var2)) {
            return true;
        }
        this.d = new lk6((CopyOnWriteArrayList) hm3Var.d.d, i2, c99Var2, 10);
        return true;
    }

    public g19 m(g19 g19Var) {
        long j = g19Var.e;
        long j2 = g19Var.f;
        return (j == j && j2 == j2) ? g19Var : new g19(g19Var.a, g19Var.b, (gf6) g19Var.g, g19Var.c, g19Var.d, j, j2);
    }

    public void n() {
        int iJ;
        ulc ulcVar = (ulc) this.c;
        hfd hfdVar = (hfd) this.b;
        ViewPager2 viewPager2 = (ViewPager2) this.o;
        int i = R.id.accessibilityActionPageLeft;
        hfh.k(viewPager2, R.id.accessibilityActionPageLeft);
        hfh.h(viewPager2, 0);
        hfh.k(viewPager2, R.id.accessibilityActionPageRight);
        hfh.h(viewPager2, 0);
        hfh.k(viewPager2, R.id.accessibilityActionPageUp);
        hfh.h(viewPager2, 0);
        hfh.k(viewPager2, R.id.accessibilityActionPageDown);
        hfh.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iJ = viewPager2.getAdapter().j()) == 0 || !viewPager2.E0) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.d < iJ - 1) {
                hfh.l(viewPager2, new g5(R.id.accessibilityActionPageDown), hfdVar);
            }
            if (viewPager2.d > 0) {
                hfh.l(viewPager2, new g5(R.id.accessibilityActionPageUp), ulcVar);
                return;
            }
            return;
        }
        boolean z = viewPager2.t0.I() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.d < iJ - 1) {
            hfh.l(viewPager2, new g5(i2), hfdVar);
        }
        if (viewPager2.d > 0) {
            hfh.l(viewPager2, new g5(i), ulcVar);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                String str = (String) this.o;
                String str2 = (String) this.b;
                String strF = l8g.f((String) this.c);
                u70 u70Var = (u70) this.d;
                StringBuilder sbL = wy1.l("PasswordChallenge(trackId='", str, "',hint='", str2, "',email='");
                sbL.append(strF);
                sbL.append("',config='");
                sbL.append(u70Var);
                sbL.append("')");
                return sbL.toString();
            default:
                return super.toString();
        }
    }

    public zva(i21 i21Var, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        this.a = 3;
        this.b = i21Var;
        this.c = connectivityManager;
        this.d = telephonyManager;
        this.o = new kme(5);
    }

    public zva(String str, String str2, String str3, u70 u70Var) {
        this.a = 2;
        this.o = str;
        this.b = str2;
        this.c = str3;
        this.d = u70Var;
    }

    public zva(k18 k18Var) {
        this.a = 6;
        this.b = k18Var;
        final int i = 0;
        this.c = new bwf(new cm6(this) { // from class: cl6
            public final /* synthetic */ zva b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                zva zvaVar = this.b;
                switch (i2) {
                    case 0:
                        return ((g4b) ((k18) zvaVar.b).getValue()).c();
                    case 1:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    case 2:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        g4b g4bVar = (g4b) ((k18) zvaVar.b).getValue();
                        yy7[] yy7VarArr = g4b.q;
                        return g4bVar.h(g4bVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5, false), "frsc-sch");
                }
            }
        });
        final int i2 = 1;
        this.d = new bwf(new cm6(this) { // from class: cl6
            public final /* synthetic */ zva b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                zva zvaVar = this.b;
                switch (i22) {
                    case 0:
                        return ((g4b) ((k18) zvaVar.b).getValue()).c();
                    case 1:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    case 2:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        g4b g4bVar = (g4b) ((k18) zvaVar.b).getValue();
                        yy7[] yy7VarArr = g4b.q;
                        return g4bVar.h(g4bVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5, false), "frsc-sch");
                }
            }
        });
        final int i3 = 2;
        this.o = new bwf(new cm6(this) { // from class: cl6
            public final /* synthetic */ zva b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                zva zvaVar = this.b;
                switch (i22) {
                    case 0:
                        return ((g4b) ((k18) zvaVar.b).getValue()).c();
                    case 1:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    case 2:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        g4b g4bVar = (g4b) ((k18) zvaVar.b).getValue();
                        yy7[] yy7VarArr = g4b.q;
                        return g4bVar.h(g4bVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5, false), "frsc-sch");
                }
            }
        });
        final int i4 = 3;
        new bwf(new cm6(this) { // from class: cl6
            public final /* synthetic */ zva b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                zva zvaVar = this.b;
                switch (i22) {
                    case 0:
                        return ((g4b) ((k18) zvaVar.b).getValue()).c();
                    case 1:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    case 2:
                        return ((g4b) ((k18) zvaVar.b).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        g4b g4bVar = (g4b) ((k18) zvaVar.b).getValue();
                        yy7[] yy7VarArr = g4b.q;
                        return g4bVar.h(g4bVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5, false), "frsc-sch");
                }
            }
        });
    }

    public zva(lv4 lv4Var, ExecutorService executorService, pe8 pe8Var, z74 z74Var, zch zchVar) {
        this.a = 0;
        this.b = pe8Var;
        this.c = z74Var;
        this.d = zchVar;
        this.o = zva.class.getName();
        vl3 vl3Var = new vl3();
        a3b a3bVar = new a3b(this);
        if (((kob) vl3Var.o) == null) {
            vl3Var.c = a3bVar;
            xu9 xu9Var = new xu9(7, this);
            if (((pm) vl3Var.X) == null) {
                vl3Var.Y = xu9Var;
                vl3Var.a = lv4Var.a();
                String string = lv4Var.j().toString();
                kob kobVar = (kob) vl3Var.d;
                if (kobVar == null && ((kob) vl3Var.o) != null) {
                    throw new IllegalStateException("Cannot change user agent of unknown ApiClientEngine");
                }
                if (kobVar == null && ((kob) vl3Var.o) != null) {
                    throw new IllegalStateException("Cannot make changes on unknown ApiClientEngine");
                }
                vl3Var.i();
                ((kob) vl3Var.d).c = string;
                rl rlVar = new rl(0, vl3Var);
                synchronized (dwa.class) {
                    dwa.d(rlVar);
                }
                cwa.b = "one.me";
                cwa.c = executorService;
                return;
            }
            throw new IllegalStateException("Overriding session provider previously set via setApiSessionProvider");
        }
        throw new IllegalStateException("API client engine is already set");
    }

    public zva(Closeable closeable) {
        this.a = 5;
        this.b = closeable;
    }

    public zva(File file, k18 k18Var, k18 k18Var2) {
        this.a = 10;
        this.b = file;
        this.c = k18Var;
        this.d = k18Var2;
    }

    public zva(ArrayList arrayList, List list) {
        this.a = 1;
        this.b = list;
        this.d = new SparseBooleanArray();
        this.c = new us(0);
        int size = list.size();
        int i = Integer.MIN_VALUE;
        mmb mmbVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            mmb mmbVar2 = (mmb) list.get(i2);
            int i3 = mmbVar2.e;
            if (i3 > i) {
                mmbVar = mmbVar2;
                i = i3;
            }
        }
        this.o = mmbVar;
    }

    public zva(Object obj, um6 um6Var, um6 um6Var2, jv0 jv0Var) {
        this.a = 9;
        this.b = obj;
        this.c = um6Var;
        this.d = um6Var2;
        this.o = jv0Var;
    }

    public zva(hm3 hm3Var, Object obj) {
        this.a = 4;
        this.o = hm3Var;
        this.c = new qr4((CopyOnWriteArrayList) hm3Var.c.d, 0, (c99) null, 0L);
        this.d = new lk6((CopyOnWriteArrayList) hm3Var.d.d, 0, (Object) null, 10);
        this.b = obj;
    }

    public zva(zjd zjdVar, py0 py0Var, h79 h79Var, s7c s7cVar) {
        Object objJ;
        this.a = 7;
        if (zjdVar != null) {
            objJ = wg7.j(zjdVar);
        } else {
            t76 t76Var = wg7.b;
            objJ = zjd.o;
        }
        this.b = objJ;
        this.c = py0Var;
        this.d = h79Var;
        this.o = s7cVar;
    }

    public zva(ViewPager2 viewPager2) {
        this.a = 11;
        this.o = viewPager2;
        int i = 12;
        this.b = new hfd(i, this);
        this.c = new ulc(i, this);
    }
}
